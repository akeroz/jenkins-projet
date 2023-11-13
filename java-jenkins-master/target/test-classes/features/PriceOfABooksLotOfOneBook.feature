Feature: Is the price of shopping cart equals to 8 ?
  People want to know it their shopping cart is equals to 8€

  Scenario Outline: The shopping cart value is or is not equals to 8 ?
    Given the shopping cart contains 1 differents books
    When I ask what the price is
    Then I should be told that the price is 8 euros


