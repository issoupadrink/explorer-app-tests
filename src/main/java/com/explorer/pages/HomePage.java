package com.explorer.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {

    private WebDriver driver;
    private WebDriverWait wait;

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

    public HomePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 30);
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
    }

    public void clickSearchButton(String value) {
        this.wait.until(ExpectedConditions.visibilityOf(this.searchButton));
        this.searchButton.click();
    }

    public void goToLatestEpoch() {
        this.wait.until(ExpectedConditions.visibilityOf(this.latestEpochIcon));
        this.latestEpochIcon.click();
        this.wait.until(ExpectedConditions.textToBePresentInElement(
                driver.findElement(By.className("DividerWithTitle_title__3SVyG")),"Epoch Summary"));
    }

    public void showMoreEpochs() {
        this.wait.until(ExpectedConditions.visibilityOf(this.showMoreEpochs));
        this.showMoreEpochs.click();
        this.wait.until(ExpectedConditions.textToBePresentInElement(
                driver.findElement(By.className("DividerWithTitle_title__3SVyG")),"Browse Epochs"));
    }

    public void showMoreBlocks() {
        this.wait.until(ExpectedConditions.visibilityOf(this.showMoreBlocks));
        this.showMoreBlocks.click();
        this.wait.until(ExpectedConditions.textToBePresentInElement(
                driver.findElement(By.className("DividerWithTitle_title__3SVyG")),"Browse Blocks"));
    }
}
