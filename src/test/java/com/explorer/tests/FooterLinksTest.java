package com.explorer.tests;

import com.explorer.pages.FooterPage;
import com.explorer.pages.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;

public class FooterLinksTest {

    private WebDriver driver;

    private HomePage homePage;
    private FooterPage footerPage;

    @BeforeMethod
    public void setupDriver() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\hey\\Downloads\\chromedriver\\chromedriver.exe");
        this.driver = new ChromeDriver();
        this.homePage = new HomePage(driver);
        this.footerPage = new FooterPage(driver);
        homePage.goTo();
    }

    @Test
    public void cardanoFoundationLinkTest() {
        footerPage.goToCardanoFoundationSite();
        Assert.assertEquals(footerPage.getPageTitle(), "Cardano Foundation | Home");
    }

    @Test
    public void documentationLinkTest() {
        footerPage.goToDocumentationSite();
        Assert.assertTrue(footerPage.doesPageContainText("Cardano Documentation"));
    }

    @AfterMethod
    public void closeDriver() {
        this.driver.close();
    }
}
