package com.xyzbank.cucumber.wk16.steps;

import com.xyzbank.cucumber.wk16.pages.*;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class BankTestSteps {
    @When("^I click on 'Bank Manager' login button$")
    public void iClickOnBankManagerLoginButton() {
        new HomePage().clickOnBankManagerLoginButton();
    }

    @And("^I click on 'Add Customer' tab$")
    public void iClickOnAddCustomerTab() {
        new BankManagerLoginPage().clickOnAddCustomerTab();
    }

    @And("^I enter first name \"([^\"]*)\"$")
    public void iEnterFirstName(String firstName)  {
        new AddCustomerPage().enterFirstName(firstName);
    }

    @And("^I enter last name \"([^\"]*)\"$")
    public void iEnterLastName(String lastName)  {
        new AddCustomerPage().enterLastName(lastName);
    }

    @And("^I enter postcode \"([^\"]*)\"$")
    public void iEnterPostcode(String postcode)  {
        new AddCustomerPage().enterPostCode(postcode);
    }

    @And("^I click on 'Add To Customer' button$")
    public void iClickOnAddToCustomerButton() {
        new AddCustomerPage().clickOnAddToCustomerButton();
    }

    @Then("^I verify the message displayed as \"([^\"]*)\"$")
    public void iVerifyTheMessageDisplayedAs(String expected)  {
        Assert.assertEquals(new AddCustomerPage().verifyMessageFromPopUp(), expected);
    }

    @And("^I click on accept$")
    public void iClickOnAccept() {
        new AddCustomerPage().clickOkOnAccept();
    }

    @And("^I click on 'Open Account' tab$")
    public void iClickOnOpenAccountTab() {
        new BankManagerLoginPage().clickOnOpenAccountTab();
    }

    @And("^I select customer that created I created which is \"([^\"]*)\"$")
    public void iSelectCustomerThatCreatedICreatedWhichIs(String option)  {
        new OpenAccountPage().selectCustomerDropDown(option);
    }

    @And("^I select currency dropdown as \"([^\"]*)\"$")
    public void iSelectCurrencyDropdownAs(String option)  {
        new OpenAccountPage().selectCurrencyDropdown(option);
    }

    @And("^I click on 'Process' button$")
    public void iClickOnProcessButton() {
        new OpenAccountPage().clickOnProcessButton();
    }

    @Then("^I verify the message for account creation as \"([^\"]*)\"$")
    public void iVerifyTheMessageForAccountCreationAs(String expectedMessage)  {
        Assert.assertEquals(new OpenAccountPage().verifyMessageFromPopUp(),expectedMessage);
    }

    @When("^I click on 'Customer' login button$")
    public void iClickOnCustomerLoginButton() {
        new HomePage().clickOnCustomerLoginButton();
    }

    @And("^I select name \"([^\"]*)\"$")
    public void iSelectName(String option)  {
        new CustomersPage().selectName(option);
    }

    @And("^I click on 'Login' button$")
    public void iClickOnLoginButton() {
        new CustomersPage().clickOnLoginButton();
    }

    @Then("^I verify \"([^\"]*)\" tab displayed$")
    public void iVerifyTabDisplayed()  {
        new CustomerLoginPage().verifyLogoutText();
    }

    @And("^I click on 'Logout' button$")
    public void iClickOnLogoutButton() {
        new CustomerLoginPage().clickOnLogoutButton();
    }

    @And("^I verify \"([^\"]*)\" text displayed$")
    public void iVerifyTextDisplayed(String expected)  {
        Assert.assertEquals(new CustomerLoginPage().verifyNameText(),expected);
    }

    @And("^I click on 'Deposit' tab$")
    public void iClickOnDepositTab() {
        new AccountPage().clickOnDepositTab();
    }

    @And("^I enter deposit amount of \"([^\"]*)\"$")
    public void iEnterDepositAmountOf(String amount)  {
        new AccountPage().enterDepositAmount(amount);
    }

    @And("^I click on 'Deposit' button$")
    public void iClickOnDepositButton() {
        new AccountPage().clickOnDepositButton();
    }

    @Then("^I verify the message of deposit successful as \"([^\"]*)\"$")
    public void iVerifyTheMessageOfDepositSuccessfulAs(String expected)  {
        Assert.assertEquals(new AccountPage().verifyDepositMessage(),expected);
    }

    @And("^I enter amount to be withdrawn of \"([^\"]*)\"$")
    public void iEnterAmountToBeWithdrawnOf(String amount)  {
        new AccountPage().enterAmountToWithdraw(amount);
    }

    @And("^I click on 'Withdraw' button$")
    public void iClickOnWithdrawButton() {
        new AccountPage().clickOnWithdrawButton();
    }

    @Then("^I verify message \"([^\"]*)\"$")
    public void iVerifyMessage(String expected)  {
        Assert.assertEquals(new AccountPage().verifyTransactionSuccessfulMessage(),expected);
    }

    @And("^I click on 'Withdrawal' tab$")
    public void iClickOnWithdrawalTab() {
        new AccountPage().clickOnWithdrawalTab();
    }
}
