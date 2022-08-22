Feature: feature to test adding employee functionality

  Background: user is logged in
    Given user is on register page
    When user enters username and password
    And user clicks on login
#        Then user is navigated to the home page

  Scenario: adding new employee
    Given user is on add Employee page page
    When user submits first name "Tim"
    When user submits middle name "Tom"
    When user submits last name "Butcher"


    When user clicks on Save link
#    Then logout link is displayed
