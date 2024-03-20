Feature: User Login


  Scenario: User is able to login with valid credentials

    Given user enters valid username in he username  field
    And user enters valid password in the password field
    When user clicks on the login button
    Then user is logged in successfully


    Scenario: user not able to login with invalid credentials
      Given user enters invalid username in he username  field
      And user enters invalid password in the password field
      When user clicks on the login button
      Then error message is displayed
