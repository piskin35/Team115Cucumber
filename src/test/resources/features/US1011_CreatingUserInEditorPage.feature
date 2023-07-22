

  Feature: US1011 creating user
    Scenario Outline: TC16 Creating a lot of users

      Given user goes to "editorUrl" homepage
      Then user clicks on new button
      Then user enters "<firstname>" to firstname box
      Then user enters "<lastname>" to lastname box
      Then user enters "<position>" to position box
      Then user enters "<office>" to office box
      Then user enters "<extension>" to extensions box
      Then user enters "<startDate>" to start date box
      Then user enters "<salary>" to salary box
      Then user clicks on craete button
      And user sends the "<firstname>" to search box
      Then user tests that user's "<firstname>" is in the list
      Then closes the page

      Examples:
        | firstname | lastname | position  | office | extension | startDate  | salary |
        | Ahmet     | Brown    | QA        | USA    | Canada    | 2023-05-03 | 2500   |
        | Hasan     | Yellow   | Director  | Eu     | Eng       | 2023-05-05 | 3000   |
        | Murat     | Black    | Developer | Eu     | TR        | 2022-05-03 | 3500   |
        | Ali       | Can      | QA        | USA    | Canada    | 2021-05-03 | 2500   |
        | Mike      | Flower   | QA        | USA    | Tex       | 2023-05-03 | 4000   |
        | Elcin     | Brown    | QA        | USA    | Canada    | 2023-05-03 | 2500   |






