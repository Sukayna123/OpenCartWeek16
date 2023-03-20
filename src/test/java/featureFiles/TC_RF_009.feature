Feature: (TS_001) Register Functionality
  Scenario: Validate Registering an Account by providing the existing account details (i.e. existing email address)
    Given navigate to opencart
    When click my account
    And click on register option
    And Enter existing Account Details into all the Fields (First Name,Last Name,etc)
    Then click on continue button again
