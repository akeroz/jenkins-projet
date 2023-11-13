Feature: Is the price of shopping cart equals to 25.60 ?
  People want to know it their shopping cart is equals to 25.60€

  Scenario Outline: The shopping cart value is or is not equals to 25.60 ?
    Given the shopping cart contains 4 differents books
    When I ask what the price is
    Then I should be told that the price is 25.60 euros