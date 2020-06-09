Feature: Login into credit card account

Scenario: Landing into the credit_card account
Given the url used to land into the account is given
When the user enters the "nani" and "54321"
Then the user enters into account page
And he can verify the cards using "true"

Scenario: Landing into the credit_card account who`s access is blocked
Given the url used to land into the account is given
When the user enters the "hemanth" and "12345"
Then the user enters into account page
And he can verify the cards using "false"
