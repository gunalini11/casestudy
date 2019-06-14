
Feature: Login
  I want to use this template for my feature file
@smoke
  Scenario: Login
    Given i enter the username
    And i enter the password
    When i click on login button
    Then the homepage is displayed
    @UAT
     Scenario: Login
    Given i enter the username
    And i enter the password
    When i click on login button
    Then the homepage is displayed
    
    

 