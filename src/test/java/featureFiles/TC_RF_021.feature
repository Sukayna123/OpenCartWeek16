Feature: Register Functionality
  Scenario:Validate Registering the Account without selecting the 'Privacy Policy' checkbox option
    Given Navigate to web site
    When Click on My Account drop menu and click on Register
    And Fill the fields, first name, last name, email, telephone, password, confirm password

      | Techno3            |
      | Study3             |
      | batch073@gmail.com |
      | 1234567893         |
      | batch0723           |
      | batch0723           |

    And Select newsletter subscription default No
    And Click on continue button
    Then Warning messages should be displayed for privacy policy