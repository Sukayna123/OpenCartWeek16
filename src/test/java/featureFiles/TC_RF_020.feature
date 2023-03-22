Feature:  Register Functionality

  Scenario: Validate whether the Privacy Policy checkbox option is not selected by default
    Given Navigate opencart
    When Click on my account
    And Click on Register Option
    Then View the Privacy Policy checkbox option
