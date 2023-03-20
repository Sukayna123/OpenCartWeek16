Feature: Registration Functionality
  Background:
    When Navigate to OpenCart
    Then Click on My Account Drop menu
    Then Click on Register option


  Scenario: Validate Registering an Account by entering different passwords into 'Password' and 'Password Confirm' fields TC 8
    Then Enter new Account Details into the all Fields without password
    And Enter not matching password and confirm password
    And Click on Continue button
    Then User should see Password confirmation does not match password! message under Password Confirm field

  Scenario Outline: Validate Registering an Account by providing an invalid email address into the E-Mail field TC 10
    Then Enter new Account Details into the all Fields without mail
    And Enter email as "<Email>"
    Examples:
      | Email             |
      | pavanol           |
      | pavanol@          |
      | pavanol@gmail     |
      | pavanol@gmail.c   |

