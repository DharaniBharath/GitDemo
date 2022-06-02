Feature: Application Login

Background:
Given validate the brwoser
When Browser is triggered
Then check if the browser is started


Scenario: HomePage default Login
Given user in landing page
When user login with "jin" and "1234"
Then home page is populated
And cards displayed are "true"



Scenario: HomePage default Login mobile
Given user in landing page
When user login with "john" and "password"
Then home page is populated
And cards displayed are "false"





Scenario: HomePage default Login mobile
Given user in landing page
When user in signup with following details
| bharath | abcd | bharath@gmail.com | India | 9247182266 |
Then home page is populated
And cards displayed are "false"


Scenario Outline: HomePage default Login mobile
Given user in landing page
When user login with the "<username>" and "<password>"
Then home page is populated
And cards displayed are "false"
Examples:
|username|password|
|user1   |password1  |
|user2   |password2  |
|user3   |password3  |
