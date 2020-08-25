package com.explorer.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class MainPage {

    private final WebDriver driver;
    private final WebDriverWait wait;

    @FindBy(className = "SimpleInput_input__1OLje")
    private WebElement searchTextBox;

    @FindBy(className = "Search_searchButtonIcon__lLLWk")
    private WebElement searchButton;

    @FindBy(xpath = "//a[@href='/en/browse-epochs']")
    private WebElement showMoreEpochs;

    @FindBy(xpath = "//a[@href='/en/browse-blocks']")
    private WebElement showMoreBlocks;

    @FindBy(className = "CircularProgress_insideCircle__2bJ_q")
    private WebElement latestEpochIcon;

    public MainPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 60);
        PageFactory.initElements(driver, this);
    }

    public void goTo() {
        this.driver.get("https://explorer.cardano-testnet.iohkdev.io/en");
        this.wait.until(ExpectedConditions.visibilityOf(this.searchButton));
    }

    public void setSearchBoxText(String value) {
        this.wait.until(ExpectedConditions.visibilityOf(this.searchTextBox));
        this.searchTextBox.clear();
        this.searchTextBox.sendKeys(value);
        this.wait.until(ExpectedConditions.visibilityOf(this.searchButton));
    }

    public void clickSearchButton() {
        this.wait.until(ExpectedConditions.visibilityOf(this.searchButton));
        this.searchButton.click();
        this.wait.until(ExpectedConditions.visibilityOf(this.searchButton));
    }
}
