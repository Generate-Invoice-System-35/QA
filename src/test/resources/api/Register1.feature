Feature: Register

  Scenario: POST - As user I want to register valid email
    Given user sent POST api register valid email endpoints
    When user send POST register valid email HTTP request
    Then user receive valid register HTTP response code 201
    And user received a message success
