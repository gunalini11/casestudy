
Feature: add product

  @tag2
  Scenario Outline: data tables
  Given logins as admin and add product
  And give product details
    Given enter the product name <product>
      | product   | 
      | baskeball |     
      | volleyball|     
