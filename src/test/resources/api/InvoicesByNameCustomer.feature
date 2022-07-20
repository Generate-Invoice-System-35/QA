Feature: search invoices by name customer

  Scenario: As user I want to input invalid search invoices by name customer without barer token
    Given user sent POST api search invoices by name customer endpoints
    When user send POST name customer HTTP request
    Then user receive invalid search invoices by name custome HTTP response code 401
    And user receive invalid data for search invoices by name customer
