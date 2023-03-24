Feature:Register Functionality
  Scenario: Validate whether the leading and trailing spaces entered into the Register Account fields are trimmed
    Given Navigate to Open Cart web page
    When I click on My Account Drop menu
    And  Click on Register option
    And  Enter new Account Details into all the Fields by adding leading and trailing spaces to the applicable fields
    Then Clickk on Continue button

