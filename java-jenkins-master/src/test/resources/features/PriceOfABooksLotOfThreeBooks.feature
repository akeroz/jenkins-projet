Feature: Is the price of shopping cart equals to 21.60 ?
  People want to know it their shopping cart is equals to 21.60€

  Scenario Outline: The shopping cart value is or is not equals to 21.60 ?
    Given the shopping cart contains 3 differents books
    When I ask what the price is
    Then I should be told that the price is 21.60 euros