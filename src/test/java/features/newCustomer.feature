@newcustomers
Feature: Create new Customer account and check created successfully
  I want to use this template for my feature file
Background:
 Given Get login page Url
    When Open to Register Page
   	When Input to Username
   	And Click to Submit button on page
   	Then Get username and password
   	When Back to Login page
   	And Submit valid info to form login
    Then Home page is displayed

  @create_check
  Scenario Outline: Create new Customer
    Given Open "New Customer" page
    When Input to "Customer Name" textbox with value "<CustomerName>"
    And Click to "m" radio button
    And Input to "Date of Birth" textbox with value "<InputDob>"
    And Input to "Address" textarea with value "<Address>"
    And Input to "City" textbox with value "<City>"
    And Input to "State" textbox with value "<State>"
    And Input to "PIN" textbox with value "<Pin>"
    And Input to "Mobile Number" textbox with value "<Phone>"
    And Input to "E-mail" textbox with value "<Email>"
    And Input to "Password" textbox with value "<Password>"
    And Click to "Submit" button
    Then Success message displayed with "Customer Registered Successfully!!!"
    And The valid value displayed at "Customer Name" with "<CustomerName>"
    And The valid value displayed at "Gender" with "<Gender>"
    And The valid value displayed at "Birthdate" with "<OutputDob>"
    And The valid value displayed at "Address" with "<Address>"
    And The valid value displayed at "City" with "<City>"
    And The valid value displayed at "State" with "<State>"
    And The valid value displayed at "Mobile No." with "<Phone>"
    And The valid value displayed at "Email" with "<Email>"

    Examples: 
      | CustomerName | Gender | InputDob   | OutputDob  | Address | City        | State   | Pin    | Phone      | Email          | Password |
      | Dinh Tam     | male   | 09/13/1990 | 1990-09-13 | Le Lai  | Ho Chi Minh | Thu Duc | 650000 | 0987215678 | Auto@gmail.com |   123456 |
