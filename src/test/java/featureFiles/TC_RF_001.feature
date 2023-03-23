Feature: Register Functionality
  Scenario: Validate Registering an Account by providing only the Mandatory fields
    Given I am on the My Account page
    When I click on the My Account page
    And I click Register option
    And I enter new account details into the mandatory fields
    And I click on the Continue button
    And I should see the Account Success page
    Then I click on the Second Continue button