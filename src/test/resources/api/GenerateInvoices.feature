Feature: Register

  Scenario: POST - As user I want to input valid ids
    Given user sent POST api generate invoices endpoints
    When user send POST generate invoices HTTP request
    Then user receive valid generate invoices HTTP response code 405
    And user received a message generate invoices success
