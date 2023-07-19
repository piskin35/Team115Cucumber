Feature: US 1003 Flower Search

  Scenario: TC02 User will search tea pot in Amazon

    Given user goes to amazon homepage
    Then user searches for flower in search box
    And tests that result text contains Flower word
    Then closes the page