package com.xyzbank.cucumber.wk16.pages;

import com.xyzbank.cucumber.wk16.utiltiy.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddCustomerPage extends Utility {

    private static final Logger log = LogManager.getLogger(AddCustomerPage.class.getName());

    public AddCustomerPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='First Name']")
    WebElement firstNameField;

    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='Last Name']")
    WebElement lastNameField;

    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='Post Code']")
    WebElement postCodeField;

    @CacheLookup
    @FindBy(xpath = "//button[@type='submit']")
    WebElement addCustomerButton;


    public void enterFirstName(String firstname){
        sendTextToElement(firstNameField, firstname);
        log.info("Entering first name : " + firstNameField.toString());

    }

    public void enterLastName(String lastname){
        sendTextToElement(lastNameField,lastname);
        log.info("Entering last name : " + lastNameField.toString());
    }

    public void enterPostCode(String postcode){
        sendTextToElement(postCodeField, postcode);
        log.info("Entering post code : " + postCodeField.toString());
    }

    public void clickOnAddToCustomerButton(){
        clickOnElement(addCustomerButton);
        log.info("Clicking on add to customer button : " + addCustomerButton.toString());
    }

    public String verifyMessageFromPopUp(){
        log.info("Getting message from pop up");
        return getTextFromAlert();
    }

    public void clickOkOnAccept(){
        acceptAlert();
        log.info("Accepting alert ");
    }
}
