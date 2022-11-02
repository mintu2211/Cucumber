Feature: Login

Scenario: Successful Login With Valid Credentials
Given user Launch chrome browser
When user opens URL "https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F"
And  user enters Email as "admin@yourstore.com" and Password as  "admin"
And Click on Login 
Then page Title should be "Dashboard / nopCommerce administration"
When user click on Log Out link
Then page Title should be "Your store. Login"
And close browser 