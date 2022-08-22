Feature: feature to test adding employee functionality

  Background: user is logged in
    Given user is on register page
    When user enters username and password
    And user clicks on login
#        Then user is navigated to the home page

  Scenario: adding new employee
    Given user is on reports page
    When user submits report "All Employee Sub Unit Hierarchy Report"

    When user clicks on Search link
#    Then logout link is displayed