Feature: Register functionality

  Scenario: Validate proper notification messages are displayed for the mandatory fields

    Given navigate to opencart
    When Click on My Account
    And click on register option
    And Click on Continue button
    Then User should see warning messages are displayed
