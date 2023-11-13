Feature: Is the price of x same books is equals to x*8 euros ?
  People want to know the price of x same books

  Scenario Outline: The price of x same books is equals to x*8 euros ?
    Given the shopping cart contains <numBooks> same books
    When I ask what the price is
    Then I should be told that the price is <price> euros
    Examples:
      | numBooks | price |
      | 2        | 16    |
      | 3        | 24    |
      | 4        | 32    |
      | 5        | 40    |