
Feature: Facebook Login page
  I want to use this template for my feature file

  @displayed
  Scenario: Verify login page
    Given Open facebook application
    Then Verify username textbox is displayed
    And Verify password textbox is displayed
    And Close application
   
