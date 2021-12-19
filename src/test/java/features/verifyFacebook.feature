Feature: Facebook Login page
  I want to use this template for my feature file

  @no_param
  Scenario: Scenario have no parameter
    Given Open facebook application
   	When Input to Username textbox
   	And Input to Password textbox
   	And Click to Login button
    And Close application
    
     @param_mark
  Scenario: Scenario have no parameter
    Given Open facebook application
   	When Input to Username textbox with "dttam@gmail.com"
   	And Input to Password textbox	with "123456"
   	And Click to Login button
    And Close application
    
    @datatable_step
  Scenario Outline: Scenario have parameter
    Given Open facebook application
   	When Input to Username and Password
   	|Username |Password|Address|
   	|<Username>|<Password>|<Address>|
   	And Click to Login button
   	Then Verify submitted info displayed
   	|<Username>| <Address>|
    And Close application
    
  Examples:
  	|Username |Password|Address|
   	|dttam@gmail.com |123456|Ha Noi|
