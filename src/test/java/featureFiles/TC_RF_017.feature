Feature: Register functionality

  Scenario: Validate password fields in the Register account page are fallowing Password Complexity Standards
    Given Navigate to opencart
    And Click on My Account
    And click on register option
    And Enter new Account Details into all fields
    When Enter simple password as "<naime>"
    And click on continue button
    Then Warning message should displayed for fallowing password Complexity Standards

