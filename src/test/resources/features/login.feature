Feature:Users should be able to

  Background:
    Given the user is on home page

    @wip
  Scenario: Login as authorized
    When the user logs in with valid credentials
    Then Hectorware - QA page should be	Account "Files - Hectorware - QA" as title

  Scenario: Try to Login as unauthorized
    When the user should not be able to login with invalid credentials
    Then error message should be displayed

  Scenario: Try to Login as unauthorized
    And the user should not be able to login with blank username and password
    Then should not be blanked message should be displayed on username textBox

  Scenario: Try to Login as unauthorized
    And the user should not be able to login with blank username
    Then should not be blanked message should be displayed on username textBox

  Scenario: Try to Login as unauthorized
    And the user should not be able to login with blank password
    Then should not be blanked message should be displayed on password textBox