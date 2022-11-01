Feature: Login

Scenario: Successful Login With Valid Credentials
Given user Launch chrome browser
When user opens URL "http://automationpractice.com/index.php"
And  user enters Email as "devendra.vds2211@gmail.com" and Password as  "devendra11"
And Click on Login 
Then page Title should be ""
When user click on Log Out 
Then page Title should be ""
And close browser