
Feature: login
  
  Scenario: login page
    Given user enter the username
    And user enter the password
    When user click on submit button
    Then directs the use to the homepage

 Scenario: add products
    Given user click on the product
    And user select the product
    And user click on add to cart
    When user clicks the product is added to cart
    Then click on cart to proceed for payment
 
  Scenario: payment
    Given user click on checkout
    Then click on payment
  
  

 