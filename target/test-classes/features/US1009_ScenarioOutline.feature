

  Feature: US1009 To test more that one data, use scenario outline

    Scenario Outline: TC14 amazon Search Test

      Given user goes to "amazonUrl" homepage
      Then user searches for "<Items>" in search box
      And tests that result text contains "<Items>" word
      Then closes the page

      Examples:
      |Items|
      |Apple|
      |Math|
      |Samsung|
      |TV|
      |Cokokrem|
      |Nutella|