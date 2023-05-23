package com.xyzbank.cucumber.wk16.pages;

import com.xyzbank.cucumber.wk16.utiltiy.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage() {
        PageFactory.initElements(driver, this);
    }


    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Customer Login']")
    WebElement customerLoginButton;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Bank Manager Login']")
    WebElement bankManagerLoginButton;


    public void clickOnCustomerLoginButton(){
        clickOnElement(customerLoginButton);
        log.info("Clicking on customer login button : " + customerLoginButton.toString());

    }

    public void clickOnBankManagerLoginButton(){
        clickOnElement(bankManagerLoginButton);
        log.info("Clicking on bank manager login button : " + bankManagerLoginButton.toString());

    }
}
