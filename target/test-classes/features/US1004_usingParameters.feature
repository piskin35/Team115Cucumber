Feature: US 1004 Using parameters on test steps

#    If we want to create a dynamic method we can enter parameters when we create the method
#    we should enter parameter between double quats
#    After preparing the methods names we need to create them in a stepDefinition class
#    To create them there are a few ways
#    1) we can hover over it and create the method from popup message
#    2) we can run the test and system will print missing methods on console so we can get the methods from the console
#    This will create a parameter gate which can receive value from method text
#    so we can change the parameter and use the method

  Scenario: TC04 we will create new methods where we can use parameters

    Given user goes to amazon homepage
    Then user searches for "Nutella" in search box
    And tests that result text contains "Nutella" word
    Then closes the page

  Scenario: TC05 we will create new methods where we can use parameters

    Given user goes to amazon homepage
    Then user searches for "Apple" in search box
    And tests that result text contains "Apple" word
    Then closes the page

  Scenario: TC05 we will create new methods where we can use parameters

    Given user goes to amazon homepage
    Then user searches for "TeaPot" in search box
    And tests that result text contains "Teapot" word
    Then closes the page

  Scenario: TC05 we will create new methods where we can use parameters

    Given user goes to amazon homepage
    Then user searches for "flower" in search box
    And tests that result text contains "flower" word
    Then closes the page