Feature: Search for employee

	Background: user is logged in
		Given user is on register page
		When user enters username and password
        And user clicks on login
#        Then user is navigated to the home page

  Scenario: Search for employee
    When user submits "Alice" and "0221"
    When user submitsEtS "Full Time Contract" and "Kevin Mathews"
    When user submitsJTU "Account Assistance" and "Sales"
    When user clicks on Submit link
#    Then logout link is displayed

