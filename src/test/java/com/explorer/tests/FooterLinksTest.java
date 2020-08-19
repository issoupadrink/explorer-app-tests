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

    @BeforeTest
    public void setupDriver() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\hey\\Downloads\\chromedriver\\chromedriver.exe");
        this.driver = new ChromeDriver();
        this.homePage = new HomePage(driver);
        this.footerPage = new FooterPage(driver);
    }

    @Test
    public void cardanoFoundationLinkTest() {
        homePage.goTo();
        footerPage.goToCardanoFoundationSite();
        Assert.assertEquals(driver.getTitle(), "Cardano Foundation | Home");
    }

    @Test
    public void documentationLinkTest() {
        homePage.goTo();
        footerPage.goToDocumentationSite();
        Assert.assertTrue(driver.getPageSource().contains("Cardano Documentation"));
    }

    @Test
    public void cardanoSourceCodeLinkTest() {
        homePage.goTo();
        footerPage.goToCardanoSourceSite();
        Assert.assertEquals(driver.getTitle(), "Input Output · GitHub");
    }

    @Test
    public void whyCardanoLinkTest() {
        homePage.goTo();
        footerPage.goToWhyCardanoSite();
        Assert.assertEquals(driver.getTitle(), "Why we are building Cardano - Introduction");
    }

    @Test
    public void ouroborosAlgorithmLinkTest() {
        homePage.goTo();
        footerPage.goToOuroborosAlgorithmSite();
        Assert.assertEquals(driver.getTitle(), "Cardano | Ouroboros");
    }

    @Test
    public void cardanoCommunityLinkTest() {
        homePage.goTo();
        footerPage.goToCardanoCommunitySite();
        Assert.assertEquals(driver.getTitle(), "Cardano | Home");
    }

    @Test
    public void cardanoChatLinkTest() {
        homePage.goTo();
        footerPage.goToCardanoChatSite();
        Assert.assertEquals(driver.getTitle(), "Telegram: Contact @CardanoAnnouncements");
    }

    @Test
    public void cardanoForumLinkTest() {
        homePage.goTo();
        footerPage.goToCardanoForumSite();
        Assert.assertEquals(driver.getTitle(), "Cardano Forum");
    }

    @Test
    public void cardanoRedditLinkTest() {
        homePage.goTo();
        footerPage.goToCardanoRedditSite();
        Assert.assertEquals(driver.getTitle(), "The home of Cardano");
    }

    @Test
    public void cardanoFoundationYoutubeLinkTest() {
        homePage.goTo();
        footerPage.goToCardanoFoundationYoutubeSite();
        Assert.assertEquals(driver.getTitle(), "Cardano Foundation - YouTube");
    }

    @Test
    public void cardanoFoundationTwitterLinkTest() {
        homePage.goTo();
        footerPage.goToCardanoFoundationTwitterSite();
        Assert.assertTrue(driver.getPageSource().contains("Cardano Foundation"));
        Assert.assertTrue(driver.getPageSource().contains("Search Twitter"));
    }

    @Test
    public void openSourceLinkTest() {
        homePage.goTo();
        footerPage.goToOpenSourceSite();
        Assert.assertEquals(driver.getTitle(), "Input Output · GitHub");
        Assert.assertTrue(driver.getPageSource().contains("Pinned repositories"));
    }

    @Test
    public void cardanoExplorerAppGithubLinkTest() {
        homePage.goTo();
        footerPage.goToCardanoExplorerAppGithubSite();
        Assert.assertEquals(driver.getTitle(), "GitHub - input-output-hk/cardano-explorer-app: Cardano Explorer App");
        Assert.assertTrue(driver.getPageSource().contains("Cardano Explorer App"));
    }

    @Test
    public void iohkTwitterIconLinkTest() {
        homePage.goTo();
        footerPage.goToIohkTwitterSite();
        Assert.assertEquals(driver.getCurrentUrl(),"https://twitter.com/inputoutputHK");
    }

    @Test
    public void iohkFacebookIconLinkTest() {
        homePage.goTo();
        footerPage.goToIohkFacebookSite();
        Assert.assertTrue(driver.getPageSource().contains("Input Output"));
    }

    @Test
    public void iohkYoutubeIconLinkTest() {
        homePage.goTo();
        footerPage.goToIohkYoutubeSite();
        Assert.assertTrue(driver.getPageSource().contains("IOHK"));
        Assert.assertTrue(driver.getPageSource().contains("subscribers"));
    }

    @Test
    public void newsLetterIconLinkTest() {
        homePage.goTo();
        footerPage.goToNewsLetterSite();
        Assert.assertTrue(driver.getPageSource().contains("Search blog"));
        Assert.assertTrue(driver.getPageSource().contains("Recent posts"));
    }

    @AfterTest
    public void closeDriver() {
        this.driver.close();
    }
}
