Feature:Users should be able to
  @wip
  Scenario: Login as authorized
    Given the user is on home page
    When the user logs in with valid credentials
    Then Hectorware - QA page should be	Account "Files - Hectorware - QA" as title

#  Scenario: Try to Login as unauthorized
#    Given the user is on home page
#    When the user should not be able to login with invalid credentials
#    And the user should not be able to login with blank username and password
#    Then error message should be displayed