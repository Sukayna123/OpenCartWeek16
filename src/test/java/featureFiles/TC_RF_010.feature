Feature: Register Functionality
  Scenario Outline: Validate Registering an Account by providing an invalid email address into the E-Mail field TC 10
    When Navigate to OpenCart
    Then Click on My Account Drop menu
    Then Click on Register option
    Then Enter new Account Details into the all Fields without mail
    And Enter email as "<Email>"
    Examples:
      | Email             |
      | pavanol           |
      | pavanol@          |
      | pavanol@gmail     |
      | pavanol@gmail.com |