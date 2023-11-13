Feature: Is the price given is the best I can have ?
  People want to know if the discount given is the best they can have

  Scenario Outline: The price of a shopping cart containing 2 Harry Potter 1,
  2 Harry Potter 2, 2 Harry Potter 3, 1 Harry Potter 4 and 1 Harry Potter 5 is equals to ?
    Given the shopping cart contains 2 Harry Potter 1, 2 Harry Potter 2, 2 Harry Potter 3, 1 Harry Potter 4 and 1 Harry Potter 5
    When I ask what the price is
    Then I should be told that the price is 51.20 euros
