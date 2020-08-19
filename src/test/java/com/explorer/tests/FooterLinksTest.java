package com.explorer.tests;

import com.explorer.pages.FooterPage;
import com.explorer.pages.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class FooterLinksTest {

    private WebDriver driver;

    private HomePage homePage;
    private FooterPage footerPage;

    private String expectedCardanoFoundationTitle;
    private String expectedCardanoSourceCodeTitle;
    private String expectedWhyCardanoTitle;
    private String expectedOuroborosAlgorithmTitle;
    private String expectedCardanoCommunityTitle;
    private String expectedCardanoChatTitle;
    private String expectedCardanoForumTitle;
    private String expectedRedditTitle;
    private String expectedCardanoFoundationYoutubeTitle;
    private String expectedOpenSourceTitle;
    private String expectedCardanoAppGithubTitle;

    private String expectedDocumentationText;
    private String expectedCardanoFoundationTwitterText;
    private String expectedIohkFacebookText;
    private String expectedIohkYoutubeText;
    private String expectedNewsLetterText;

    private String expectedIohkTwitterUrl;

    @BeforeTest
    public void setupDriver() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\hey\\Downloads\\chromedriver\\chromedriver.exe");
        this.driver = new ChromeDriver();
        this.homePage = new HomePage(driver);
        this.footerPage = new FooterPage(driver);
    }

    @Test
    @Parameters("expectedCardanoFoundationTitle")
    public void cardanoFoundationLinkTest(String expectedCardanoFoundationTitle) {
        this.expectedCardanoFoundationTitle = expectedCardanoFoundationTitle;
        homePage.goTo();
        footerPage.goToCardanoFoundationSite();
        // Assert.assertEquals(driver.getTitle(), "Cardano Foundation | Home");
        Assert.assertEquals(driver.getTitle(), expectedCardanoFoundationTitle);
    }

    @Test
    @Parameters("expectedDocumentationText")
    public void documentationLinkTest(String expectedDocumentationText) {
        this.expectedDocumentationText = expectedDocumentationText;
        homePage.goTo();
        footerPage.goToDocumentationSite();
        // Assert.assertTrue(driver.getPageSource().contains("Cardano Documentation"));
        Assert.assertTrue(driver.getPageSource().contains(expectedDocumentationText));
    }

    @Test
    @Parameters("expectedCardanoSourceCodeTitle")
    public void cardanoSourceCodeLinkTest(String expectedCardanoSourceCodeTitle) {
        this.expectedCardanoSourceCodeTitle = expectedCardanoSourceCodeTitle;
        homePage.goTo();
        footerPage.goToCardanoSourceSite();
        // Assert.assertEquals(driver.getTitle(), "Input Output · GitHub");
        Assert.assertEquals(driver.getTitle(), expectedCardanoSourceCodeTitle);
    }

    @Test
    @Parameters("expectedWhyCardanoTitle")
    public void whyCardanoLinkTest(String expectedWhyCardanoTitle) {
        this.expectedWhyCardanoTitle = expectedWhyCardanoTitle;
        homePage.goTo();
        footerPage.goToWhyCardanoSite();
        // Assert.assertEquals(driver.getTitle(), "Why we are building Cardano - Introduction");
        Assert.assertEquals(driver.getTitle(), expectedWhyCardanoTitle);
    }

    @Test
    @Parameters("expectedOuroborosAlgorithmTitle")
    public void ouroborosAlgorithmLinkTest(String expectedOuroborosAlgorithmTitle) {
        this.expectedOuroborosAlgorithmTitle = expectedOuroborosAlgorithmTitle;
        homePage.goTo();
        footerPage.goToOuroborosAlgorithmSite();
        // Assert.assertEquals(driver.getTitle(), "Cardano | Ouroboros");
        Assert.assertEquals(driver.getTitle(), expectedOuroborosAlgorithmTitle);
    }

    @Test
    @Parameters("expectedCardanoCommunityTitle")
    public void cardanoCommunityLinkTest(String expectedCardanoCommunityTitle) {
        this.expectedCardanoCommunityTitle = expectedCardanoCommunityTitle;
        homePage.goTo();
        footerPage.goToCardanoCommunitySite();
        // Assert.assertEquals(driver.getTitle(), "Cardano | Home");
        Assert.assertEquals(driver.getTitle(), expectedCardanoCommunityTitle);
    }

    @Test
    @Parameters("expectedCardanoChatTitle")
    public void cardanoChatLinkTest(String expectedCardanoChatTitle) {
        this.expectedCardanoChatTitle = expectedCardanoChatTitle;
        homePage.goTo();
        footerPage.goToCardanoChatSite();
        // Assert.assertEquals(driver.getTitle(), "Telegram: Contact @CardanoAnnouncements");
        Assert.assertEquals(driver.getTitle(), expectedCardanoChatTitle);
    }

    @Test
    @Parameters("expectedCardanoForumTitle")
    public void cardanoForumLinkTest(String expectedCardanoForumTitle) {
        this.expectedCardanoForumTitle = expectedCardanoForumTitle;
        homePage.goTo();
        footerPage.goToCardanoForumSite();
        // Assert.assertEquals(driver.getTitle(), "Cardano Forum");
        Assert.assertEquals(driver.getTitle(), expectedCardanoForumTitle);
    }

    @Test
    @Parameters("expectedRedditTitle")
    public void cardanoRedditLinkTest(String expectedRedditTitle) {
        this.expectedRedditTitle = expectedRedditTitle;
        homePage.goTo();
        footerPage.goToCardanoRedditSite();
        // Assert.assertEquals(driver.getTitle(), "The home of Cardano");
        Assert.assertEquals(driver.getTitle(), expectedRedditTitle);
    }

    @Test
    @Parameters("expectedCardanoFoundationYoutubeTitle")
    public void cardanoFoundationYoutubeLinkTest(String expectedCardanoFoundationYoutubeTitle) {
        this.expectedCardanoFoundationYoutubeTitle = expectedCardanoFoundationYoutubeTitle;
        homePage.goTo();
        footerPage.goToCardanoFoundationYoutubeSite();
        // Assert.assertEquals(driver.getTitle(), "Cardano Foundation - YouTube");
        Assert.assertEquals(driver.getTitle(), expectedCardanoFoundationYoutubeTitle);
    }

    @Test
    @Parameters("expectedCardanoFoundationTwitterText")
    public void cardanoFoundationTwitterLinkTest(String expectedCardanoFoundationTwitterText) {
        this.expectedCardanoFoundationTwitterText = expectedCardanoFoundationTwitterText;
        homePage.goTo();
        footerPage.goToCardanoFoundationTwitterSite();
        // Assert.assertTrue(driver.getPageSource().contains("Cardano Foundation"));
        Assert.assertTrue(driver.getPageSource().contains(expectedCardanoFoundationTwitterText));
    }

    @Test
    @Parameters("expectedOpenSourceTitle")
    public void openSourceLinkTest(String expectedOpenSourceTitle) {
        this.expectedOpenSourceTitle = expectedOpenSourceTitle;
        homePage.goTo();
        footerPage.goToOpenSourceSite();
        // Assert.assertEquals(driver.getTitle(), "Input Output · GitHub");
        Assert.assertEquals(driver.getTitle(), expectedOpenSourceTitle);
    }

    @Test
    @Parameters("expectedCardanoAppGithubTitle")
    public void cardanoExplorerAppGithubLinkTest(String expectedCardanoAppGithubTitle) {
        this.expectedCardanoAppGithubTitle = expectedCardanoAppGithubTitle;
        homePage.goTo();
        footerPage.goToCardanoExplorerAppGithubSite();
        // Assert.assertEquals(driver.getTitle(), "GitHub - input-output-hk/cardano-explorer-app: Cardano Explorer App");
        Assert.assertEquals(driver.getTitle(), expectedCardanoAppGithubTitle);
    }

    @Test
    @Parameters("expectedIohkTwitterUrl")
    public void iohkTwitterIconLinkTest(String expectedIohkTwitterUrl) {
        this.expectedIohkTwitterUrl = expectedIohkTwitterUrl;
        homePage.goTo();
        footerPage.goToIohkTwitterSite();
        // Assert.assertEquals(driver.getCurrentUrl(),"https://twitter.com/inputoutputHK");
        Assert.assertEquals(driver.getCurrentUrl(),expectedIohkTwitterUrl);
    }

    @Test
    @Parameters("expectedIohkFacebookText")
    public void iohkFacebookIconLinkTest(String expectedIohkFacebookText) {
        this.expectedIohkFacebookText = expectedIohkFacebookText;
        homePage.goTo();
        footerPage.goToIohkFacebookSite();
        // Assert.assertTrue(driver.getPageSource().contains("Input Output"));
        Assert.assertTrue(driver.getPageSource().contains(expectedIohkFacebookText));
    }

    @Test
    @Parameters("expectedIohkYoutubeText")
    public void iohkYoutubeIconLinkTest(String expectedIohkYoutubeText) {
        this.expectedIohkYoutubeText = expectedIohkYoutubeText;
        homePage.goTo();
        footerPage.goToIohkYoutubeSite();
        // Assert.assertTrue(driver.getPageSource().contains("IOHK"));
        Assert.assertTrue(driver.getPageSource().contains(expectedIohkYoutubeText));
    }

    @Test
    @Parameters("expectedNewsLetterText")
    public void newsLetterIconLinkTest(String expectedNewsLetterText) {
        this.expectedNewsLetterText = expectedNewsLetterText;
        homePage.goTo();
        footerPage.goToNewsLetterSite();
        // Assert.assertTrue(driver.getPageSource().contains("Search blog"));
        Assert.assertTrue(driver.getPageSource().contains(expectedNewsLetterText));
    }

    @AfterTest
    public void closeDriver() {
        this.driver.quit();
    }
}
