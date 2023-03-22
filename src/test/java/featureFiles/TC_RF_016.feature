Feature: Register Functionality

  Scenario: Validate whether the Mandatory fields in the Register Account page are accepting only spaces
    Given Navigate to opencart
    When Click on My Account
    And  Click on register option
    And  Enter space into mandatory fields
    Then click on Continue button
    Then User should see warning message for these mandatory fields


