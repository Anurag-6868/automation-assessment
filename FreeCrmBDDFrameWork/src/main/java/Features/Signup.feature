Feature: Sign up

Scenario Outline: User creates a new account


  Given the user is on the sign-up page
  When title of sign-up page is Create New Customer Account
  Then user enters the details "<firstName>" and "<lastName>" and "<email>" and "<password>" and "<confirmPassword>"
  Then user is on myaccount page

  
  Examples:
  
       | firstName | lastName | email | password | confirmPassword |
       | Anurag | Sharma | jocktmp+mf8vy@gmail.com | Welcome123! | Welcome123! |
       | Abhishek | Sharma |  c.amu.spa.m.m@gmail.com | Noida@123 | Noida@123 |
       