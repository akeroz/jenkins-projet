Feature: Is the price of shopping cart equals to 15.20 ?
  People want to know it their shopping cart is equals to 15.20€

  Scenario Outline: The shopping cart value is or is not equals to 15.20 ?
    Given the shopping cart contains 2 differents books
    When I ask what the price is
    Then I should be told that the price is 15.20 euros