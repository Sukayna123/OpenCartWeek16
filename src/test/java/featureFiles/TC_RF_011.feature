Feature: Register Functionality
  Scenario: Validate Registering an Account by providing an invalid phone number
    Given I am on the homepage
    When I click on My Account drop menu
    And  I click on Register option
    And I enter new Account Details into all the Fields
    And I enter invalid phone number into the Telephone Field as abcde
    And I click on Continue button
    Then I should see an error message for the invalid phone number
