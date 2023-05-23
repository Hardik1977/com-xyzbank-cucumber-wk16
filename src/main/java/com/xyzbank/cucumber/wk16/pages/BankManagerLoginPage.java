package com.xyzbank.cucumber.wk16.pages;

import com.xyzbank.cucumber.wk16.utiltiy.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BankManagerLoginPage extends Utility {

    private static final Logger log = LogManager.getLogger(BankManagerLoginPage.class.getName());

    public BankManagerLoginPage() {
        PageFactory.initElements(driver, this);
    }


    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Add Customer']")
    WebElement addCustomerTab;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Open Account']")
    WebElement openAccountButton;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Customers']")
    WebElement customersButton;



    public void clickOnAddCustomerTab(){
        clickOnElement(addCustomerTab);
        log.info("Clicking on add customer tab : " + addCustomerTab.toString());

    }

    public void clickOnOpenAccountTab(){
        clickOnElement(openAccountButton);
        log.info("Clicking on open account tab : " + openAccountButton.toString());
    }

    public void clickOnCustomersTab(){
        clickOnElement(customersButton);
        log.info("Clicking on customer tab : " + customersButton.toString());

    }

}
