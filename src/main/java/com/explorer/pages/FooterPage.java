package com.explorer.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class FooterPage {

    private final WebDriver driver;
    private final WebDriverWait wait;

    @FindBy(linkText = "Cardano Foundation")
    private WebElement cardanoFoundationLink;

    @FindBy(linkText = "Documentation")
    private WebElement documentationLink;

    @FindBy(linkText = "Cardano Source")
    private WebElement cardanoSourceLink;

    @FindBy(linkText = "Why Cardano")
    private WebElement whyCardanoLink;

    @FindBy(linkText = "Ouroboros Algorithm")
    private WebElement ouroborosAlgorithmLink;

    @FindBy(linkText = "Cardano Community")
    private WebElement cardanoCommunityLink;

    @FindBy(linkText = "Cardano Chat")
    private WebElement cardanoChatLink;

    @FindBy(linkText = "Cardano Forum")
    private WebElement cardanoForumLink;

    @FindBy(linkText = "Cardano Reddit")
    private WebElement cardanoRedditLink;

    @FindBy(linkText = "Cardano Foundation Youtube")
    private WebElement cardanoFoundationYoutubeLink;

    @FindBy(linkText = "Cardano Foundation Twitter")
    private WebElement cardanoFoundationTwitterLink;

    @FindBy(linkText = "Open Source")
    private WebElement openSourceLink;

    @FindBy(className = "Footer_gitIcon__3B_gW")
    private WebElement githubIconLink;

    @FindBy(className = "Footer_twitterIcon__3JdnM")
    private WebElement twitterIconLink;

    @FindBy(className = "Footer_facebookIcon__J0TOt")
    private WebElement facebookIconLink;

    @FindBy(className = "Footer_youtubeIcon__3mHlQ")
    private WebElement youtubeIconLink;

    @FindBy(className = "Footer_newsletterIcon__3bx9b")
    private WebElement newsletterIconLink;

    public FooterPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 60);
        PageFactory.initElements(driver, this);
    }

    public String getPageTitle() {
        return this.driver.getTitle();
    }

    public boolean doesPageContainText(String value) {
        return this.driver.getPageSource().contains(value);
    }

    public void goToCardanoFoundationSite() {
        this.wait.until(ExpectedConditions.visibilityOf(this.cardanoFoundationLink));
        this.cardanoFoundationLink.click();
    }

    public void goToDocumentationSite() {
        this.wait.until(ExpectedConditions.visibilityOf(this.documentationLink));
        this.documentationLink.click();
    }

    public void goToCardanoSourceSite() {
        this.wait.until(ExpectedConditions.visibilityOf(this.cardanoSourceLink));
        this.cardanoSourceLink.click();
    }

    public void goToWhyCardanoSite() {
        this.wait.until(ExpectedConditions.visibilityOf(this.whyCardanoLink));
        this.whyCardanoLink.click();
    }

    public void goToOuroborosAlgorithmSite() {
        this.wait.until(ExpectedConditions.visibilityOf(this.ouroborosAlgorithmLink));
        this.ouroborosAlgorithmLink.click();
    }

    public void goToCardanoCommunitySite() {
        this.wait.until(ExpectedConditions.visibilityOf(this.cardanoCommunityLink));
        this.cardanoCommunityLink.click();
    }

    public void goToCardanoChatSite() {
        this.wait.until(ExpectedConditions.visibilityOf(this.cardanoChatLink));
        this.cardanoChatLink.click();
    }

    public void goToCardanoForumSite() {
        this.wait.until(ExpectedConditions.visibilityOf(this.cardanoForumLink));
        this.cardanoForumLink.click();
    }

    public void goToCardanoRedditSite() {
        this.wait.until(ExpectedConditions.visibilityOf(this.cardanoRedditLink));
        this.cardanoRedditLink.click();
    }

    public void goToCardanoFoundationYoutubeSite() {
        this.wait.until(ExpectedConditions.visibilityOf(this.cardanoFoundationYoutubeLink));
        this.cardanoFoundationYoutubeLink.click();
    }

    public void goToCardanoFoundationTwitterSite() {
        this.wait.until(ExpectedConditions.visibilityOf(this.cardanoFoundationTwitterLink));
        this.cardanoFoundationTwitterLink.click();
    }

    public void goToOpenSourceSite() {
        this.wait.until(ExpectedConditions.visibilityOf(this.openSourceLink));
        this.openSourceLink.click();
    }

    public void goToCardanoExplorerAppGithubSite() {
        this.wait.until(ExpectedConditions.visibilityOf(this.githubIconLink));
        this.githubIconLink.click();
    }

    public void goToIohkTwitterSite() {
        this.wait.until(ExpectedConditions.visibilityOf(this.twitterIconLink));
        this.twitterIconLink.click();
    }

    public void goToIohkFacebookSite() {
        this.wait.until(ExpectedConditions.visibilityOf(this.facebookIconLink));
        this.facebookIconLink.click();
    }

    public void goToIohkYoutubeSite() {
        this.wait.until(ExpectedConditions.visibilityOf(this.youtubeIconLink));
        this.youtubeIconLink.click();
    }

    public void goToNewsLetterSite() {
        this.wait.until(ExpectedConditions.visibilityOf(this.newsletterIconLink));
        this.newsletterIconLink.click();
    }
}
