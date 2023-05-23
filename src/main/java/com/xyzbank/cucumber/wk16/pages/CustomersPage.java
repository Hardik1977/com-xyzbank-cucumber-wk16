package com.xyzbank.cucumber.wk16.pages;

import com.xyzbank.cucumber.wk16.utiltiy.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class CustomersPage extends Utility {

    private static final Logger log = LogManager.getLogger(CustomersPage.class.getName());

    public CustomersPage() {
        PageFactory.initElements(driver, this);
    }


    @CacheLookup
    @FindBy(id = "userSelect")
    WebElement nameDropDown;

    @CacheLookup
    @FindBy(xpath = "//select[@name='userSelect']/child::*")
    List<WebElement> nameOfAllList;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Login']")
    WebElement loginButton;


    public void selectName(String option){
        clickOnElement(nameDropDown);
        log.info("Clicking on name dropdown field : " + nameDropDown.toString());
        getOptions(nameOfAllList,option);
        log.info("Selecting name : " + nameOfAllList.toString());
    }

    public void clickOnLoginButton(){
        clickOnElement(loginButton);
        log.info("Clicking on login button : " + loginButton.toString());

    }


}
