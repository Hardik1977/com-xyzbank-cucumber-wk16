Feature: Bank Test functionality
  As a user I want to check the acceptance criteria of the bank


  Background: I am on homepage

  @sanity @regression
  Scenario: Bank Manager should be able to add Customer successfully
    When    I click on 'Bank Manager' login button
    And     I click on 'Add Customer' tab
    And     I enter first name "Hermoine"
    And     I enter last name "Granger"
    And     I enter postcode "NW7"
    And     I click on 'Add To Customer' button
    Then    I verify the message displayed as "Customer added successfully with customer id :6"
    And     I click on accept

  @smoke @regression
  Scenario: Bank Manager should be able to open account successfully
    When      I click on 'Bank Manager' login button
    And       I click on 'Open Account' tab
    And       I select customer that created I created which is "Hermoine Granger"
    And       I select currency dropdown as "Pound"
    And       I click on 'Process' button
    Then      I verify the message for account creation as "Account created successfully with account Number :1016"
    And       I click on accept

  @regression
  Scenario: Customer should login and logout successfully
    When    I click on 'Customer' login button
    And     I select name "Hermoine Granger"
    And     I click on 'Login' button
    And     I click on 'Logout' button
    And     I verify "Your Name :" text displayed

  @regression
  Scenario: Customer should deposit money successfully
    When    I click on 'Customer' login button
    And     I select name "Hermoine Granger"
    And     I click on 'Login' button
    And     I click on 'Deposit' tab
    And     I enter deposit amount of "100"
    And     I click on 'Deposit' button
    Then    I verify the message of deposit successful as "Deposit Successful"

  @regression
  Scenario: Customer should be able to withdraw money successfully
    When    I click on 'Customer' login button
    And     I select name "Hermoine Granger"
    And     I click on 'Login' button
    And     I click on 'Withdrawal' tab
    And     I enter amount to be withdrawn of "50"
    And     I click on 'Withdraw' button
    Then    I verify message "Transaction successful"

