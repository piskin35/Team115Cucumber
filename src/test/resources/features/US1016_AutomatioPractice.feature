Feature: US1016 Automation Practice Test
  @wip
  Scenario: TC21 Register new user in automation Practice page



    Given user goes to "automationUrl" homepage
    And clicks the user sign in link
    And user enters email address and a name
    And clicks the SignUp button
    And user enters personal and contact information
    And the user clicks the Create Account button
    Then verify account creation

  #HW: Complete  step definitions and other parts of the automation


#  Let's go to http://automationpractice.com/index.php
#  Let's do the following test with Cucumber
#    Given  User goes the website
#    And clicks the user sign in link
#    And user enters email address in Create and account section
#    And clicks the Create an Account button
#    And user enters personal and contact information
#    And the user clicks the Register button
#    Then verify account creation