Feature: Register and Login to BankGuru
  I want to use this template for my feature file

  @register_login
  Scenario: Register to system and login
    Given Get login page Url
    When Open to Register Page
   	When Input to Username
   	And Click to Submit button on page
   	Then Get username and password
   	When Back to Login page
   	And Submit valid info to form login
    Then Home page is displayed
    

