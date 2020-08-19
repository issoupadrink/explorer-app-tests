package com.explorer.tests;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import tests.BaseTest;

public class FooterLinksTest extends BaseTest {

    @Test
    @Parameters("expectedCardanoFoundationTitle")
    public void cardanoFoundationLinkTest(String expectedCardanoFoundationTitle) {
        homePage.goTo();
        footerPage.goToCardanoFoundationSite();
        Assert.assertEquals(driver.getTitle(), expectedCardanoFoundationTitle);
    }

    @Test
    @Parameters("expectedDocumentationText")
    public void documentationLinkTest(String expectedDocumentationText) {
        homePage.goTo();
        footerPage.goToDocumentationSite();
        Assert.assertTrue(driver.getPageSource().contains(expectedDocumentationText));
    }

    @Test
    @Parameters("expectedCardanoSourceCodeTitle")
    public void cardanoSourceCodeLinkTest(String expectedCardanoSourceCodeTitle) {
        homePage.goTo();
        footerPage.goToCardanoSourceSite();
        Assert.assertEquals(driver.getTitle(), expectedCardanoSourceCodeTitle);
    }

    @Test
    @Parameters("expectedWhyCardanoTitle")
    public void whyCardanoLinkTest(String expectedWhyCardanoTitle) {
        homePage.goTo();
        footerPage.goToWhyCardanoSite();
        Assert.assertEquals(driver.getTitle(), expectedWhyCardanoTitle);
    }

    @Test
    @Parameters("expectedOuroborosAlgorithmTitle")
    public void ouroborosAlgorithmLinkTest(String expectedOuroborosAlgorithmTitle) {
        homePage.goTo();
        footerPage.goToOuroborosAlgorithmSite();
        Assert.assertEquals(driver.getTitle(), expectedOuroborosAlgorithmTitle);
    }

    @Test
    @Parameters("expectedCardanoCommunityTitle")
    public void cardanoCommunityLinkTest(String expectedCardanoCommunityTitle) {
        homePage.goTo();
        footerPage.goToCardanoCommunitySite();
        Assert.assertEquals(driver.getTitle(), expectedCardanoCommunityTitle);
    }

    @Test
    @Parameters("expectedCardanoChatTitle")
    public void cardanoChatLinkTest(String expectedCardanoChatTitle) {
        homePage.goTo();
        footerPage.goToCardanoChatSite();
        Assert.assertEquals(driver.getTitle(), expectedCardanoChatTitle);
    }

    @Test
    @Parameters("expectedCardanoForumTitle")
    public void cardanoForumLinkTest(String expectedCardanoForumTitle) {
        homePage.goTo();
        footerPage.goToCardanoForumSite();
        Assert.assertEquals(driver.getTitle(), expectedCardanoForumTitle);
    }

    @Test
    @Parameters("expectedRedditTitle")
    public void cardanoRedditLinkTest(String expectedRedditTitle) {
        homePage.goTo();
        footerPage.goToCardanoRedditSite();
        Assert.assertEquals(driver.getTitle(), expectedRedditTitle);
    }

    @Test
    @Parameters("expectedCardanoFoundationYoutubeTitle")
    public void cardanoFoundationYoutubeLinkTest(String expectedCardanoFoundationYoutubeTitle) {
        homePage.goTo();
        footerPage.goToCardanoFoundationYoutubeSite();
        Assert.assertEquals(driver.getTitle(), expectedCardanoFoundationYoutubeTitle);
    }

    @Test
    @Parameters("expectedCardanoFoundationTwitterText")
    public void cardanoFoundationTwitterLinkTest(String expectedCardanoFoundationTwitterText) {
        homePage.goTo();
        footerPage.goToCardanoFoundationTwitterSite();
        Assert.assertTrue(driver.getPageSource().contains(expectedCardanoFoundationTwitterText));
    }

    @Test
    @Parameters("expectedOpenSourceTitle")
    public void openSourceLinkTest(String expectedOpenSourceTitle) {
        homePage.goTo();
        footerPage.goToOpenSourceSite();
        Assert.assertEquals(driver.getTitle(), expectedOpenSourceTitle);
    }

    @Test
    @Parameters("expectedCardanoAppGithubTitle")
    public void cardanoExplorerAppGithubLinkTest(String expectedCardanoAppGithubTitle) {
        homePage.goTo();
        footerPage.goToCardanoExplorerAppGithubSite();
        Assert.assertEquals(driver.getTitle(), expectedCardanoAppGithubTitle);
    }

    @Test
    @Parameters("expectedIohkTwitterUrl")
    public void iohkTwitterIconLinkTest(String expectedIohkTwitterUrl) {
        homePage.goTo();
        footerPage.goToIohkTwitterSite();
        Assert.assertEquals(driver.getCurrentUrl(),expectedIohkTwitterUrl);
    }

    @Test
    @Parameters("expectedIohkFacebookText")
    public void iohkFacebookIconLinkTest(String expectedIohkFacebookText) {
        homePage.goTo();
        footerPage.goToIohkFacebookSite();
        Assert.assertTrue(driver.getPageSource().contains(expectedIohkFacebookText));
    }

    @Test
    @Parameters("expectedIohkYoutubeText")
    public void iohkYoutubeIconLinkTest(String expectedIohkYoutubeText) {
        homePage.goTo();
        footerPage.goToIohkYoutubeSite();
        Assert.assertTrue(driver.getPageSource().contains(expectedIohkYoutubeText));
    }

    @Test
    @Parameters("expectedNewsLetterText")
    public void newsLetterIconLinkTest(String expectedNewsLetterText) {
        homePage.goTo();
        footerPage.goToNewsLetterSite();
        Assert.assertTrue(driver.getPageSource().contains(expectedNewsLetterText));
    }
}
