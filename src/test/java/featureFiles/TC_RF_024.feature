Feature: Register Functionality


  Scenario: TC24 Validate Registering an Account, by filling 'Password' field and not filling 'Password Confirm' field
  Given Navigate to opencart
  When Click on My Account
    And click on register option
    When Enter new Account Details into the all Fields without ConfirmPassword
  And Click on Continue button
  Then User should see Password confirmation does not match password! message under Password Confirm field