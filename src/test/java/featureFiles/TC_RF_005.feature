
Feature: Register Functionality

  Scenario: Validate Registering an Account when 'Yes' option is selected for Newsletter field
    When Navigate to web site
    And  Click on My Account drop menu and click on Register
    And Enter new Account Details into all the Fields First Name Last Name EMail Telephone Password Password Confirm and Privacy Policy Fields
    And Click on Yes radio option for Newsletter
    And Click on Continue button
    And Click on Continue button that is displayed in the Account Success page
    Then Click on Subscribe Unsubscribe to newsletter option
