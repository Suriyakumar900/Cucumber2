#Author: suriya@your.domain.com

Feature: Validation of loginpage
  @smoke
  Scenario: Add Customer Validation
    
    When user fill up the details
    |Suriyakumar900@gmail.com|Suriyakumar123|
    And user click on submit button
    Then user verifies home page
    
    
