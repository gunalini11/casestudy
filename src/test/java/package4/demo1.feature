
Feature: login
  I want to use this template for my feature file

  @smoke
  Scenario: login
    Given I want to enter the username "anu" 
    And i want to enter the password "123"
    When I click on sumbit button
    Then home page is displayed 
    
    @UAT
  Scenario: change password
    Given I want to enter the username "anu" 
    And i want to enter the old password "123"
    And i want to enter the new password "xyz" 
    And i want to confirm the new password "xyz" 
    When I click on sumbit button
    Then my old password is changed
    
     @UAT
  Scenario: bookproduct
    Given I want to enter the productid "we34" 
    And i want to click on the cart
    And i want to proceed with the payement credentials 
    When i click on payment button
    Then  payment is succesfull
    
    @smoke @UAT
  Scenario: logout
    Given I want to back to home page
    And i wantto click on logout button
    When I click on logout button
    Then my account is successfully logged out

  