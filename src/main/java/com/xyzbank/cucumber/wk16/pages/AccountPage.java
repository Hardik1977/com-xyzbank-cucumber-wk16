package com.xyzbank.cucumber.wk16.pages;

import com.xyzbank.cucumber.wk16.utiltiy.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountPage extends Utility {

    private static final Logger log = LogManager.getLogger(AccountPage.class.getName());

    public AccountPage() {
        PageFactory.initElements(driver, this);
    }


    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Transactions')]")
    WebElement  transactionsTab;

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Deposit')]")
    WebElement  depositTab;

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Withdrawl')]")
    WebElement  withdrawalTab;

    @CacheLookup
    @FindBy(xpath = "//input[@type='number']")
    WebElement  amtDepositedField;

    @CacheLookup
    @FindBy(xpath = "//button[@type='submit']")
    WebElement  depositButton;

    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Deposit Successful')]")
    WebElement  depositText;

    @CacheLookup
    @FindBy(xpath = "//input[@type='number']")
    WebElement  amountToBeWithdrawnField;

    @CacheLookup
    @FindBy(xpath = "//button[@type='submit']")
    WebElement  withdrawButton;

    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Transaction successful')]")
    WebElement  withdrawSuccessfulMessage;


    public void clickOnTransactionTab(){
        clickOnElement(transactionsTab);
        log.info("Clicking on transaction tab : " + transactionsTab.toString());

    }

    public void clickOnDepositTab(){
        clickOnElement(depositTab);
        log.info("Clicking on deposit tab : " + depositTab.toString());

    }

    public void clickOnWithdrawalTab(){
        clickOnElement(withdrawalTab);
        log.info("Clicking on withdrawal tab : " + withdrawalTab.toString());

    }

    public void enterDepositAmount(String amount){
        sendTextToElement(amtDepositedField, amount);
        log.info("Entering deposit amount : " + amtDepositedField.toString());
    }

    public void clickOnDepositButton(){
        clickOnElement(depositButton);
        log.info("Clicking on deposit button : " + depositButton.toString());
    }

    public String verifyDepositMessage(){
        log.info("Getting deposited message : " + depositText.toString());
        return getTextFromElement(depositText);
    }

    public void enterAmountToWithdraw(String amount){
        sendTextToElement(amountToBeWithdrawnField,amount);
        log.info("Entering amount to withdraw : " + amountToBeWithdrawnField.toString());
    }

    public void clickOnWithdrawButton(){
        clickOnElement(withdrawButton);
        log.info("Clicking withdraw button : " + withdrawButton.toString());
    }

    public String verifyTransactionSuccessfulMessage(){
        log.info("Getting transaction success message  : " + withdrawSuccessfulMessage.toString());
        return getTextFromElement(withdrawSuccessfulMessage) ;
    }
}
