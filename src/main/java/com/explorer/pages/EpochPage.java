package com.explorer.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class EpochPage {

    private final WebDriver driver;
    private final WebDriverWait wait;

    @FindBy(className = "Header_logoContainer__FtqFv")
    public WebElement headerLogo;

    @FindBy(className = "SimpleInput_input__1OLje")
    public WebElement searchTextBox;

    @FindBy(className = "Search_searchButtonIcon__lLLWk")
    public WebElement searchButton;

    @FindBy(className = "EpochSummary_progressTextValue__cRgOX")
    public WebElement epochProgressValue;

    @FindBy(className = "Pagination_leftArrow__2-0A- SimpleButton_root__1EyJs")
    public WebElement paginationLeft;

    @FindBy(className = "Pagination_leftArrow__2-0A- Pagination_firstLeftArrow__hpCGl SimpleButton_root__1EyJs")
    public WebElement paginationFirstPage;

    @FindBy(className = "Pagination_rightArrow__2MqZV SimpleButton_root__1EyJs")
    public WebElement paginationRight;

    @FindBy(className = "Pagination_rightArrow__2MqZV Pagination_secondRightArrow__1pQX- SimpleButton_root__1EyJs")
    public WebElement paginationLastPage;

    public EpochPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 30);
        PageFactory.initElements(driver, this);
    }

    public void goTo(int epochNumber) {
        this.driver.get("https://explorer.cardano-testnet.iohkdev.io/en/epoch?number=" + epochNumber);
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
        this.wait.until(ExpectedConditions.titleContains("Block"));
    }
}
