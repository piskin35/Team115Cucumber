@p1
Feature: US1010 Negative Login Test with scenario outline

  Scenario Outline: TC15 Try to log in with a lot of invalid credentials

    Given user goes to "qdUrl" homepage
    Then user click on qdHomePage login button
    And user1 enters "<InvalidEmail>" to emailTextBox
    And user1 enters "<InvalidPassword>" to passwordTextBox
    And user click on loginPage login button
    Then test that user could not be able to login
    And  closes the page

    Examples:
      | InvalidEmail          | InvalidPassword      |
      | asdfasdf@asdf.com     | 654asdfasdEsdf.      |
      | asdsdfasdf@asdf.com   | 654aswerdfasdEsdf.   |
      | asdsdfasdf@asdsdf.com | 654aswerdfawesdEsdf. |
      | 234@asdsdf.com        | 654as234fawesdEsdf.  |
      | 234@as435sdf.com      | 654as234fa24Esdf.    |
      | 234@as432333df.com    | 654as23433Esdf.      |