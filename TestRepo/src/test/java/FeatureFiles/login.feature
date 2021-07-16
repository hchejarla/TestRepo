Feature: Credit Card Payment

#Background:
#Given user intializing the browser
#When user navigates to URL
#Then Application is launched sucessfully

@RegressionTest
 Scenario: Make Minimum Due payment 
 Given user is on Pay credit card page
 When user fills all details and select Minimum amount option
 And User clicks on Pay button
 Then Credit Card confirmation page is displayed

@smokeTest @RegressionTest
 Scenario: Make Minimum Due payment 
 Given user is on Pay credit card page
 When user fills "hepsi" details and select Minimum amount option and enter amount as "1000"
 And User clicks on Pay button
 Then Credit Card confirmation page is displayed
 
 @smokeTest
 Scenario: Make Minimum Due payment 
 Given user is on Pay credit card page
 When user fills "Megha" details and select Minimum amount option and enter amount as "2000"
 And User clicks on Pay button
 Then Credit Card confirmation page is displayed
 
@RegressionTest
 Scenario: Registering the application
 Given user is on registeration page
 When user enters following details
 |john|1234|1234|john@abcd.com|324567|India|
 And user clicks on register button
 Then Registration sucessful popup is displayed
 
 @RegressionTest
 Scenario Outline: Make Minimum Due payment 
 Given user is on Pay credit card page
 When user fill <name> details and enter amount as <amount>
 And User clicks on Pay button
 Then Credit Card confirmation page is displayed
Examples:
 |name|amount|
 |Hepsi|1000|
 |Megha|2000|
 |yuio|5000|
 |oiuy|8000|
 
 
 