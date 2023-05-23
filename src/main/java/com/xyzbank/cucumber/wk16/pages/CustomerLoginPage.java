package com.xyzbank.cucumber.wk16.pages;

import com.xyzbank.cucumber.wk16.utiltiy.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CustomerLoginPage extends Utility {

    private static final Logger log = LogManager.getLogger(CustomerLoginPage.class.getName());

    public CustomerLoginPage() {
        PageFactory.initElements(driver, this);
    }


    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Logout')]")
    WebElement logoutButton;

    @CacheLookup
    @FindBy(xpath = "//label[text()='Your Name :']")
    WebElement nameText;



    public void clickOnLogoutButton(){
        clickOnElement(logoutButton);
        log.info("Clicking on logout button : " + logoutButton.toString());

    }

    public String verifyNameText(){
        log.info("Getting name text : " + nameText.toString());
        return getTextFromElement(nameText);

    }

    public String verifyLogoutText(){
        log.info("Getting logout text : " + logoutButton.toString());
        return getTextFromElement(logoutButton);

    }
}
