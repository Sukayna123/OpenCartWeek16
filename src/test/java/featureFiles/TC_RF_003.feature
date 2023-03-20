Feature: (TS_001) Register Functionality
  Scenario: Validate Registering an Account by providing all the fields
    Given navigate to opencart
    When click my account
    And click on register option
    And enter new account details into all the fields (FirstName,LastName,etc)
    And click on continue button
    Then click continue button that is displayed in the account success page