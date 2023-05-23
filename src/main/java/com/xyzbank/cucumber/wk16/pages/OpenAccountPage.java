package com.xyzbank.cucumber.wk16.pages;

import com.xyzbank.cucumber.wk16.utiltiy.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class OpenAccountPage extends Utility {

    private static final Logger log = LogManager.getLogger(OpenAccountPage.class.getName());

    public OpenAccountPage() {
        PageFactory.initElements(driver, this);
    }


    @CacheLookup
    @FindBy(xpath = "//select[@id='userSelect']")
    WebElement customerDropdown;

    @CacheLookup
    @FindBy(xpath = "//form[@role='form']/child::div[1]/select/child::*")
    List<WebElement> customerAllOptionsDropdown;

    @CacheLookup
    @FindBy(xpath = "//select[@id='currency']")
    WebElement currencyDropdown;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Process']")
    WebElement processButton;


    public void clickOnCustomerName(){
        clickOnElement(customerDropdown);
        log.info("Clicking on customer name: " + customerDropdown.toString());

    }

    public void selectCustomerDropDown(String option){
        getOptions(customerAllOptionsDropdown,option);
        log.info("Selecting customer dropdown : " + customerAllOptionsDropdown.toString());
    }

    public void selectCurrencyDropdown(String option){
        clickOnElement(currencyDropdown);
        selectByValueFromDropDown(currencyDropdown,option);
        log.info("Selecting currency dropdown : " + currencyDropdown.toString());

    }

    public void clickOnProcessButton(){
        clickOnElement(processButton);
        log.info("Clicking on process button: " + processButton.toString());

    }


    public String verifyMessageFromPopUp(){
        log.info("Getting message from pop up ");
        return getTextFromAlert();
    }

    public void clickOkOnAccept(){
        acceptAlert();
        log.info("Accepting alert ");
    }
}
