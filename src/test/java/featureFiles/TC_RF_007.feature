Feature: Register Functionality
  Scenario: Validate different ways of navigating to 'Register Account' page
    Given Navigate to OpenCart
    When  I click on My Account Drop menu
    And   I click on Register option
    And   I click on my account drop menu
    And   Click on Login option
    And   Click  on Continue button inside New Customer box
    And   Repeat Steps three and four
    Then  Click on Register option from the Right Column options