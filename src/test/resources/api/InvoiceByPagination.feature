Feature: Invoice By Pagination

  Scenario: as user i want to input valid get invoices by pagination without barer token
    Given user sent POST api get invoices by pagination endpoints
    When user send POST get invoices by pagination  HTTP request
    Then user receive invalid  get invoices by pagination HTTP response code 401
    And I receive invalid or expired jwt