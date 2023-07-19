Feature: Us1007 Positive Login Test

  Scenario: TC01 Positive test with valid username

    Given user goes to "qdUrl" homepage
    Then user click on qdHomePage login button
    And user enters an email to emailTextBox
    And user enters a password to passwordTextBox
    And user click on loginPage login button
    And test that user is able to log in


