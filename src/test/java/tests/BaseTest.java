package tests;

import com.explorer.pages.EpochPage;
import com.explorer.pages.FooterPage;
import com.explorer.pages.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.net.MalformedURLException;
import java.net.URL;

public class BaseTest {

    protected WebDriver driver;

    protected HomePage homePage;
    protected FooterPage footerPage;
    protected EpochPage epochPage;

    @BeforeTest
    public void setupDriver() throws MalformedURLException {

        String host = "localhost";
        DesiredCapabilities dc = DesiredCapabilities.chrome();

        if (System.getProperty("BROWSER") != null &&
                System.getProperty("BROWSER").equalsIgnoreCase("firefox")){
            dc = DesiredCapabilities.firefox();
        }

        if (System.getProperty("HUB_HOST") != null){
            host = System.getProperty("HUB_HOST");
        }

        String completeUrl = "http://" + host + ":4444/wd/hub";
        this.driver = new RemoteWebDriver(new URL(completeUrl), dc);

        // Create Page Objects
        this.homePage = new HomePage(driver);
        this.footerPage = new FooterPage(driver);
        this.epochPage = new EpochPage(driver);
    }

    @AfterTest
    public void closeDriver() {
        this.driver.quit();
    }
}
