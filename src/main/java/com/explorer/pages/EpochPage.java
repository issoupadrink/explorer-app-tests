package com.explorer.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EpochPage {

    private WebDriver driver;
    private WebDriverWait wait;

    @FindBy(className = "SimpleInput_input__1OLje")
    private WebElement searchTextBox;

    @FindBy(className = "Search_searchButtonIcon__lLLWk")
    private WebElement searchButton;

    @FindBy(className = "EpochSummary_progressTextValue__cRgOX")
    private WebElement epochProgressValue;

    @FindBy(className = "Pagination_leftArrow__2-0A- SimpleButton_root__1EyJs")
    private WebElement paginationLeft;

    @FindBy(className = "Pagination_leftArrow__2-0A- Pagination_firstLeftArrow__hpCGl SimpleButton_root__1EyJs")
    private WebElement paginationFirstPage;

    @FindBy(className = "Pagination_rightArrow__2MqZV SimpleButton_root__1EyJs")
    private WebElement paginationRight;

    @FindBy(className = "Pagination_rightArrow__2MqZV Pagination_secondRightArrow__1pQX- SimpleButton_root__1EyJs")
    private WebElement paginationLastPage;

    public EpochPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 30);
        PageFactory.initElements(driver, this);
    }

    public void goTo(int epochNumber) {
        this.driver.get("https://explorer.cardano-testnet.iohkdev.io/en/epoch?number=" + epochNumber);
        this.wait.until(ExpectedConditions.visibilityOf(this.searchButton));
    }

    public void setSearchBoxText(String value) {
        this.searchTextBox.clear();
        this.searchTextBox.sendKeys(value);
    }

    public void clickSearchButton(String value) {
        this.searchButton.click();
    }

    public void clickLeftPagination() {
        this.paginationLeft.click();
    }

    public void clickRightPagination() {
        this.paginationRight.click();
    }

    public void clickFirstPagePagination() {
        this.paginationFirstPage.click();
    }

    public void clickLastPagePagination() {
        this.paginationLastPage.click();
    }
}
