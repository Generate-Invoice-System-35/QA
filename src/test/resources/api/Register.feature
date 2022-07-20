Feature: Register Invalid

  Scenario: POST - As user I want to register invalid email
    Given user sent POST api register invalid email endpoints
    When user send POST register invalid email HTTP request
    Then user receive invalid register HTTP response code 417
    And user received a message username exist
