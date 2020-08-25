package com.explorer.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class BlockPage {

    private final WebDriver driver;
    private final WebDriverWait wait;

    @FindBy(className = "Header_logoContainer__FtqFv")
    private WebElement headerLogo;

    @FindBy(className = "SimpleInput_input__1OLje")
    private WebElement searchTextBox;

    @FindBy(className = "Search_searchButtonIcon__lLLWk")
    private WebElement searchButton;

    public BlockPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 30);
        PageFactory.initElements(driver, this);
    }

    public void goTo(String blockHash) {
        this.driver.get("https://explorer.cardano-testnet.iohkdev.io/en/blocks?id=" + blockHash);
        this.wait.until(ExpectedConditions.visibilityOf(this.searchButton));
    }

    public void goToMainPage() {
        this.headerLogo.click();
        this.wait.until(ExpectedConditions.visibilityOf(this.searchButton));
    }

    public void setSearchBoxText(String value) {
        this.wait.until(ExpectedConditions.visibilityOf(this.searchTextBox));
        this.searchTextBox.clear();
        this.searchTextBox.sendKeys(value);
        this.wait.until(ExpectedConditions.visibilityOf(this.searchButton));
    }

    public void clickSearchButton() {
        this.wait.until(ExpectedConditions.visibilityOf(this.searchTextBox));
        this.searchButton.click();
        this.wait.until(ExpectedConditions.visibilityOf(this.searchButton));
    }
}
