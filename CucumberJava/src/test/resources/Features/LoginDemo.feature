#Feature: Test login functionality
#
#  Scenario Outline: Check login is successful with valid credentials
#    Given browser is open
#    And user is on login page
#    When user enters <username> and <password>
#    And user clicks on login
#    Then user is navigated to the home page
#
#    Examples:
#      | username | password |
#      | Raghav   |    12345 |
#      | Ele      |    12345 |
Feature: Test Account creation functionality

  Scenario Outline: Check Account is created with successful with valid credentials
    Given browser is open
    And user is navigated to register page
    When user enters <username> and <password>
#    when user enters <
    And user clicks on login
#    Then user is navigated to the home page

    Examples:
      | username | password |
      | Admin   |    admin123 |

