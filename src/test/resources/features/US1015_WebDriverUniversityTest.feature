
Feature: US1015 WebDriverUniversityTest
Scenario: TC20

Given user goes to "WebDriverUrl" homepage
And Scroll down to "Login Portal"
And Click "Login Portal"
Then Switch to other window
And Write values in the "username" and "password" boxes
And Press the login button
And Test that the popup text is "validation failed"
* Close the Popup by saying Ok
Then Go back to the first page
Then Test that user is in the first page



  #HW: Complete  step definitions and other parts of the automation






#  1. Go to "http://webdriveruniversity.com/"
#  2. Scroll down to "Login Portal" (***if needed)
#  3. Click "Login Portal"
#  4.Switch to other window  ----------SwitchTo()
#  5. Write values in the "username" and "password" boxes
#  6.Press the "login" button
#  7. Test that the popup text is "validation failed"
#  8. Close the Popup by saying Ok
#  9. Go back to the first page
#  10. Test that the first page is returned