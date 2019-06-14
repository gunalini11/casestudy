
Feature: Title of your feature
  I want to use this template for my feature file


  @tag2
  Scenario Outline: Title of your scenario outline
    Given I want to enter the username "<u_name>" 
    When I want to enter the password "<password>" 
    Then I verify the login

    Examples: 
      | u_name  | password | 
      | name1   |     5    | 
      | name2   |     7    | 
