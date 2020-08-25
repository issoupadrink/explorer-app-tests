package com.explorer.tests.model;

import com.explorer.models.ExplorerModel;
import com.explorer.pages.BlockPage;
import com.explorer.pages.EpochPage;
import com.explorer.pages.FooterPage;
import com.explorer.pages.MainPage;
import org.graphwalker.core.condition.VertexCoverage;
import org.graphwalker.core.generator.RandomPath;
import org.graphwalker.core.machine.ExecutionContext;
import org.graphwalker.core.machine.Machine;
import org.graphwalker.core.machine.SimpleMachine;
import org.graphwalker.core.model.Model;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;


public class ModelTest extends ExecutionContext {

    protected WebDriver driver;

    protected MainPage homePage;
    protected FooterPage footerPage;
    protected EpochPage epochPage;
    protected BlockPage blockPage;

    public void setupDriver(boolean local) throws MalformedURLException {

        if (local) {
            String host = "localhost";
            DesiredCapabilities dc = DesiredCapabilities.chrome();

            if (System.getProperty("BROWSER") != null &&
                    System.getProperty("BROWSER").equalsIgnoreCase("firefox")) {
                dc = DesiredCapabilities.firefox();
            }

            if (System.getProperty("HUB_HOST") != null) {
                host = System.getProperty("HUB_HOST");
            }

            String completeUrl = "http://" + host + ":4444/wd/hub";
            this.driver = new RemoteWebDriver(new URL(completeUrl), dc);
        } else {
            System.setProperty("webdriver.chrome.driver", "C:/Users/hey/Downloads/chromedriver/chromedriver.exe");

            driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        }

        // Create Page Objects
        this.homePage = new MainPage(driver);
        this.footerPage = new FooterPage(driver);
        this.epochPage = new EpochPage(driver);
    }

    public void closeDriver() {
        this.driver.quit();
    }

    public void v_Start() {

    }

    public void v_MainPage() {

    }

    public void v_Epoch() {

    }

    public void v_Block() {

    }

    public void e_StartBrowser() throws Exception {
        setupDriver(false);
        homePage.goTo();
    }

    public void e_SearchForBlockFromMainPage() {
        homePage.setSearchBoxText("46416e9b55ade1f749c557b70b8fe16c13df18beada00bf7e16a545216dd0586");
        homePage.clickSearchButton();
    }

    public void e_SearchForBlockFromBlocksPage() {
        blockPage.setSearchBoxText("46416e9b55ade1f749c557b70b8fe16c13df18beada00bf7e16a545216dd0586");
        blockPage.clickSearchButton();
    }

    public void e_SearchForBlockFromEpochsPage() {
        epochPage.setSearchBoxText("46416e9b55ade1f749c557b70b8fe16c13df18beada00bf7e16a545216dd0586");
        epochPage.clickSearchButton();
    }

    public void e_GoToMainPageFromBlocksPage() {
        blockPage.goToMainPage();
    }

    public void e_SearchForEpochFromMainPage() {
        homePage.setSearchBoxText("1");
        homePage.clickSearchButton();
    }

    public void e_SearchForEpochFromEpochsPage() {
        epochPage.setSearchBoxText("2");
        epochPage.clickSearchButton();
    }

    public void e_SearchForEpochFromBlocksPage() {
        blockPage.setSearchBoxText("1");
        blockPage.clickSearchButton();
    }

    public void e_GoToMainPageFromEpochsPage() {
        epochPage.goToMainPage();
    }

    @Test
    public void fullCoverageTest() {
        ExplorerModel hnModel = new ExplorerModel();
        Model model = hnModel.generateModel();

        this.setModel(model.build());

        this.setPathGenerator(new RandomPath(new VertexCoverage(100)));

        setNextElement(model.getVertices().get(0));
        Machine machine = new SimpleMachine(this);

        while (machine.hasNextStep()) {
            machine.getNextStep();
        }

        closeDriver();
    }
}
