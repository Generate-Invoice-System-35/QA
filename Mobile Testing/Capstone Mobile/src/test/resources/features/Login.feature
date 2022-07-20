Feature: User want login to GIS apk

  Scenario: Android user want to login GIS apk

    Given android user on home screen
    When  android user click button sign in
    And android user input valid username
    And android user input valid password
    And android user click sign in
    Then android user go to homepage