$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("banktest.feature");
formatter.feature({
  "line": 1,
  "name": "Bank Test functionality",
  "description": "As a user I want to check the acceptance criteria of the bank",
  "id": "bank-test-functionality",
  "keyword": "Feature"
});
formatter.before({
  "duration": 4659639999,
  "status": "passed"
});
formatter.background({
  "line": 5,
  "name": "I am on homepage",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.scenario({
  "line": 8,
  "name": "Bank Manager should be able to add Customer successfully",
  "description": "",
  "id": "bank-test-functionality;bank-manager-should-be-able-to-add-customer-successfully",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 7,
      "name": "@sanity"
    },
    {
      "line": 7,
      "name": "@regression"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "I click on \u0027Bank Manager\u0027 login button",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "I click on \u0027Add Customer\u0027 tab",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I enter first name \"Hermoine\"",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I enter last name \"Granger\"",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I enter postcode \"NW7\"",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I click on \u0027Add To Customer\u0027 button",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I verify the message displayed as \"Customer added successfully with customer id :6\"",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "I click on accept",
  "keyword": "And "
});
formatter.match({
  "location": "BankTestSteps.iClickOnBankManagerLoginButton()"
});
formatter.result({
  "duration": 736704800,
  "status": "passed"
});
formatter.match({
  "location": "BankTestSteps.iClickOnAddCustomerTab()"
});
formatter.result({
  "duration": 539377000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Hermoine",
      "offset": 20
    }
  ],
  "location": "BankTestSteps.iEnterFirstName(String)"
});
formatter.result({
  "duration": 467574899,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Granger",
      "offset": 19
    }
  ],
  "location": "BankTestSteps.iEnterLastName(String)"
});
formatter.result({
  "duration": 66416500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "NW7",
      "offset": 18
    }
  ],
  "location": "BankTestSteps.iEnterPostcode(String)"
});
formatter.result({
  "duration": 76512200,
  "status": "passed"
});
formatter.match({
  "location": "BankTestSteps.iClickOnAddToCustomerButton()"
});
formatter.result({
  "duration": 84932600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Customer added successfully with customer id :6",
      "offset": 35
    }
  ],
  "location": "BankTestSteps.iVerifyTheMessageDisplayedAs(String)"
});
formatter.result({
  "duration": 13034100,
  "status": "passed"
});
formatter.match({
  "location": "BankTestSteps.iClickOnAccept()"
});
formatter.result({
  "duration": 11864800,
  "status": "passed"
});
formatter.after({
  "duration": 679772700,
  "status": "passed"
});
formatter.before({
  "duration": 2460291100,
  "status": "passed"
});
formatter.background({
  "line": 5,
  "name": "I am on homepage",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.scenario({
  "line": 19,
  "name": "Bank Manager should be able to open account successfully",
  "description": "",
  "id": "bank-test-functionality;bank-manager-should-be-able-to-open-account-successfully",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 18,
      "name": "@smoke"
    },
    {
      "line": 18,
      "name": "@regression"
    }
  ]
});
formatter.step({
  "line": 20,
  "name": "I click on \u0027Bank Manager\u0027 login button",
  "keyword": "When "
});
formatter.step({
  "line": 21,
  "name": "I click on \u0027Open Account\u0027 tab",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "I select customer that created I created which is \"Hermoine Granger\"",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "I select currency dropdown as \"Pound\"",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "I click on \u0027Process\u0027 button",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "I verify the message for account creation as \"Account created successfully with account Number :1016\"",
  "keyword": "Then "
});
formatter.step({
  "line": 26,
  "name": "I click on accept",
  "keyword": "And "
});
formatter.match({
  "location": "BankTestSteps.iClickOnBankManagerLoginButton()"
});
formatter.result({
  "duration": 519609600,
  "status": "passed"
});
formatter.match({
  "location": "BankTestSteps.iClickOnOpenAccountTab()"
});
formatter.result({
  "duration": 302225900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Hermoine Granger",
      "offset": 51
    }
  ],
  "location": "BankTestSteps.iSelectCustomerThatCreatedICreatedWhichIs(String)"
});
formatter.result({
  "duration": 738676900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Pound",
      "offset": 31
    }
  ],
  "location": "BankTestSteps.iSelectCurrencyDropdownAs(String)"
});
formatter.result({
  "duration": 169063299,
  "status": "passed"
});
formatter.match({
  "location": "BankTestSteps.iClickOnProcessButton()"
});
formatter.result({
  "duration": 64333101,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Account created successfully with account Number :1016",
      "offset": 46
    }
  ],
  "location": "BankTestSteps.iVerifyTheMessageForAccountCreationAs(String)"
});
formatter.result({
  "duration": 16383300,
  "status": "passed"
});
formatter.match({
  "location": "BankTestSteps.iClickOnAccept()"
});
formatter.result({
  "duration": 17349300,
  "status": "passed"
});
formatter.after({
  "duration": 655681099,
  "status": "passed"
});
formatter.before({
  "duration": 2453227301,
  "status": "passed"
});
formatter.background({
  "line": 5,
  "name": "I am on homepage",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.scenario({
  "line": 29,
  "name": "Customer should login and logout successfully",
  "description": "",
  "id": "bank-test-functionality;customer-should-login-and-logout-successfully",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 28,
      "name": "@regression"
    }
  ]
});
formatter.step({
  "line": 30,
  "name": "I click on \u0027Customer\u0027 login button",
  "keyword": "When "
});
formatter.step({
  "line": 31,
  "name": "I select name \"Hermoine Granger\"",
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "I click on \u0027Login\u0027 button",
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "I click on \u0027Logout\u0027 button",
  "keyword": "And "
});
formatter.step({
  "line": 34,
  "name": "I verify \"Your Name :\" text displayed",
  "keyword": "And "
});
formatter.match({
  "location": "BankTestSteps.iClickOnCustomerLoginButton()"
});
formatter.result({
  "duration": 877050200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Hermoine Granger",
      "offset": 15
    }
  ],
  "location": "BankTestSteps.iSelectName(String)"
});
formatter.result({
  "duration": 539381100,
  "status": "passed"
});
formatter.match({
  "location": "BankTestSteps.iClickOnLoginButton()"
});
formatter.result({
  "duration": 104642201,
  "status": "passed"
});
formatter.match({
  "location": "BankTestSteps.iClickOnLogoutButton()"
});
formatter.result({
  "duration": 281476300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Your Name :",
      "offset": 10
    }
  ],
  "location": "BankTestSteps.iVerifyTextDisplayed(String)"
});
formatter.result({
  "duration": 37162401,
  "status": "passed"
});
formatter.after({
  "duration": 661713399,
  "status": "passed"
});
formatter.before({
  "duration": 3114665000,
  "status": "passed"
});
formatter.background({
  "line": 5,
  "name": "I am on homepage",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.scenario({
  "line": 37,
  "name": "Customer should deposit money successfully",
  "description": "",
  "id": "bank-test-functionality;customer-should-deposit-money-successfully",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 36,
      "name": "@regression"
    }
  ]
});
formatter.step({
  "line": 38,
  "name": "I click on \u0027Customer\u0027 login button",
  "keyword": "When "
});
formatter.step({
  "line": 39,
  "name": "I select name \"Hermoine Granger\"",
  "keyword": "And "
});
formatter.step({
  "line": 40,
  "name": "I click on \u0027Login\u0027 button",
  "keyword": "And "
});
formatter.step({
  "line": 41,
  "name": "I click on \u0027Deposit\u0027 tab",
  "keyword": "And "
});
formatter.step({
  "line": 42,
  "name": "I enter deposit amount of \"100\"",
  "keyword": "And "
});
formatter.step({
  "line": 43,
  "name": "I click on \u0027Deposit\u0027 button",
  "keyword": "And "
});
formatter.step({
  "line": 44,
  "name": "I verify the message of deposit successful as \"Deposit Successful\"",
  "keyword": "Then "
});
formatter.match({
  "location": "BankTestSteps.iClickOnCustomerLoginButton()"
});
formatter.result({
  "duration": 580606501,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Hermoine Granger",
      "offset": 15
    }
  ],
  "location": "BankTestSteps.iSelectName(String)"
});
formatter.result({
  "duration": 435431800,
  "status": "passed"
});
formatter.match({
  "location": "BankTestSteps.iClickOnLoginButton()"
});
formatter.result({
  "duration": 89314300,
  "status": "passed"
});
formatter.match({
  "location": "BankTestSteps.iClickOnDepositTab()"
});
formatter.result({
  "duration": 315063400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "100",
      "offset": 27
    }
  ],
  "location": "BankTestSteps.iEnterDepositAmountOf(String)"
});
formatter.result({
  "duration": 335635401,
  "status": "passed"
});
formatter.match({
  "location": "BankTestSteps.iClickOnDepositButton()"
});
formatter.result({
  "duration": 57592900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Deposit Successful",
      "offset": 47
    }
  ],
  "location": "BankTestSteps.iVerifyTheMessageOfDepositSuccessfulAs(String)"
});
formatter.result({
  "duration": 36631000,
  "status": "passed"
});
formatter.after({
  "duration": 685944000,
  "status": "passed"
});
formatter.before({
  "duration": 2657402100,
  "status": "passed"
});
formatter.background({
  "line": 5,
  "name": "I am on homepage",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.scenario({
  "line": 47,
  "name": "Customer should be able to withdraw money successfully",
  "description": "",
  "id": "bank-test-functionality;customer-should-be-able-to-withdraw-money-successfully",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 46,
      "name": "@regression"
    }
  ]
});
formatter.step({
  "line": 48,
  "name": "I click on \u0027Customer\u0027 login button",
  "keyword": "When "
});
formatter.step({
  "line": 49,
  "name": "I select name \"Hermoine Granger\"",
  "keyword": "And "
});
formatter.step({
  "line": 50,
  "name": "I click on \u0027Login\u0027 button",
  "keyword": "And "
});
formatter.step({
  "line": 51,
  "name": "I click on \u0027Withdrawal\u0027 tab",
  "keyword": "And "
});
formatter.step({
  "line": 52,
  "name": "I enter amount to be withdrawn of \"50\"",
  "keyword": "And "
});
formatter.step({
  "line": 53,
  "name": "I click on \u0027Withdraw\u0027 button",
  "keyword": "And "
});
formatter.step({
  "line": 54,
  "name": "I verify message \"Transaction successful\"",
  "keyword": "Then "
});
formatter.match({
  "location": "BankTestSteps.iClickOnCustomerLoginButton()"
});
formatter.result({
  "duration": 829719300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Hermoine Granger",
      "offset": 15
    }
  ],
  "location": "BankTestSteps.iSelectName(String)"
});
formatter.result({
  "duration": 528564300,
  "status": "passed"
});
formatter.match({
  "location": "BankTestSteps.iClickOnLoginButton()"
});
formatter.result({
  "duration": 79067700,
  "status": "passed"
});
formatter.match({
  "location": "BankTestSteps.iClickOnWithdrawalTab()"
});
formatter.result({
  "duration": 377642300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "50",
      "offset": 35
    }
  ],
  "location": "BankTestSteps.iEnterAmountToBeWithdrawnOf(String)"
});
formatter.result({
  "duration": 320581400,
  "status": "passed"
});
formatter.match({
  "location": "BankTestSteps.iClickOnWithdrawButton()"
});
formatter.result({
  "duration": 60986700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Transaction successful",
      "offset": 18
    }
  ],
  "location": "BankTestSteps.iVerifyMessage(String)"
});
formatter.result({
  "duration": 33889800,
  "status": "passed"
});
formatter.after({
  "duration": 669514699,
  "status": "passed"
});
});