Feature: US 1002 Tea Pot Search

  Scenario: TC02 User will search tea pot in Amazon

    Given user goes to amazon homepage
    Then user searches for TeaPot in search box
    And tests that result text contains TeaPot word
    Then closes the page