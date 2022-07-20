Feature: Login
  Scenario: POST - As a user I want to login with invalid username and invalid password
    Given user sent POST api login endpoints
    When user send POST login  HTTP request
    Then user receive invalid login HTTP response code 401
    And user receive a message wrong username or password