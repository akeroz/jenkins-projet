Feature: Is the price of shopping cart equals to 30 ?
  People want to know it their shopping cart is equals to 30€

  Scenario Outline: The shopping cart value is or is not equals to 30 ?
    Given the shopping cart contains 5 differents books
    When I ask what the price is
    Then I should be told that the price is 30 euros