Feature: To Test The Adactin Hotal Booking Application

Scenario Outline: Check The Login Functionality
Given  launch The Adactin Hotal Booking Application Url
When user Enter The Username "<user>"In The Username Field
And user Enter The password "<pass>" In The Password Field
Then user Click The Loginbutton and To Check The Search Hotal Page

Examples:
|user|pass|
|Dinesh1993|811BWB|
#|pradeep|3rwr3w|
#|Dinesh1993|811BWB|

Scenario: TO Check The Search Hotal Page
When select The Room Location
And select The Hotel Name
And slect The Room Type
And select Number Of Rooms
And enter The Check In Date
And enter The Check Out Date
And select Adults Per Room
And select Children Per Room
Then user Click The Searchbutton and To Check The Select Hotal Page

Scenario: To Check The Select Hotel Page Functionality

When user Should Click The Hotel Page 
Then user Should Click The  Continue button

Scenario:  To Check The Booking Page

When  user Should Insert The First Name
And  user Should Insert The Last Name
And user Should Insert The Billing Address
And user Should Insert The Credit Card Number
And user Should Select The Credit Card Type
And user Should Select The Expiry Date Month
And user Should Select The Expiry Date Year
And user Should Insert The CVV Number
Then user Should Click The BookNow button 


Scenario: To Check The Logout Page

Then user Should Logout