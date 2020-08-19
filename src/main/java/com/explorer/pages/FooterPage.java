package com.explorer.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FooterPage {

    WebDriver driver;
    WebDriverWait wait;

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
        this.wait = new WebDriverWait(driver, 30);
        PageFactory.initElements(driver, this);
    }

    public String getTitle() {
        return this.driver.getTitle();
    }

    public boolean doesPageContainsText(String value) {
        return this.driver.getPageSource().contains(value);
    }

    public void clickCardanoFoundation() {
        this.cardanoFoundationLink.click();
    }

    public void clickDocumentation() {
        this.documentationLink.click();
    }

    public void clickCardanoSource() {
        this.cardanoSourceLink.click();
    }

    public void clickWhyCardano() {
        this.whyCardanoLink.click();
    }

    public void clickOuroborosAlgorithm() {
        this.ouroborosAlgorithmLink.click();
    }

    public void clickCardanoCommunity() {
        this.cardanoCommunityLink.click();
    }

    public void clickCardanoChat() {
        this.cardanoChatLink.click();
    }

    public void clickCardanoForum() {
        this.cardanoForumLink.click();
    }

    public void clickCardanoReddit() {
        this.cardanoRedditLink.click();
    }

    public void clickCardanoFoundationYoutube() {
        this.cardanoFoundationYoutubeLink.click();
    }

    public void clickCardanoFoundationTwitter() {
        this.cardanoFoundationTwitterLink.click();
    }

    public void clickOpenSource() {
        this.openSourceLink.click();
    }

    public void clickGithubIcon() {
        this.githubIconLink.click();
    }

    public void clickTwitterIcon() {
        this.twitterIconLink.click();
    }

    public void clickFacebookIcon() {
        this.facebookIconLink.click();
    }

    public void clickYoutubeIcon() {
        this.youtubeIconLink.click();
    }

    public void clickNewsLetterIcon() {
        this.newsletterIconLink.click();
    }
}
