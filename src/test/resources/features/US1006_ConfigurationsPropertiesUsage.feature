@p1
Feature: US1006 How to use configuration properties file

#  To reach any value from configuration.properties file we need to use parameters.Scenario:
#  Then in the method we use that parameter to get the value from configuration.properties file

  Scenario: TC07 User goes to Amazon and test that has been reached amazon.com

    Given user goes to "amazonUrl" homepage
    Then tests that url has "amazon" word
    Then closes the page

  Scenario: TC08 User goes to WiseQuarter and test that has been reached amazon.com

    Given user goes to "wqUrl" homepage
    Then tests that url has "wisequarter" word
    Then closes the page

  Scenario: TC09 User goes to Facebook and test that has been reached amazon.com

    Given user goes to "facebookUrl" homepage
    Then tests that url has "facebook" word
    Then closes the page
