Feature: Update Invoice Payment Status By ID

  Scenario: PUT - As user i want to input valid update invoice payment status by id without barer token
    Given user sent PUT update invoice payment status by id endpoints
    When user send PUT update invoice payment status by id HTTP request
    Then user receive invalid update invoice payment status by id HTTP response code 400
    And user received a message invalid or expired jwt on update invoice payment status by id

