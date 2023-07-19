Feature: US 1005 Using parameters on test steps

  # If you are planning to use same steps at the beginning of each scenario
  # you can use background
  # Whatever method is placed under background will be executed first

  Background: Before each Scenario this method will be executed
    Given user goes to amazon homepage

  Scenario: TC04 we will create new methods where we can use parameters

    Then user searches for "Nutella" in search box
    And tests that result text contains "Nutella" word
    Then closes the page

  Scenario: TC05 we will create new methods where we can use parameters

    Then user searches for "Apple" in search box
    And tests that result text contains "Apple" word
    Then closes the page

  Scenario: TC05 we will create new methods where we can use parameters

    Then user searches for "TeaPot" in search box
    And tests that result text contains "Teapot" word
    Then closes the page

  Scenario: TC05 we will create new methods where we can use parameters

    Then user searches for "flower" in search box
    And tests that result text contains "flower" word
    Then closes the page