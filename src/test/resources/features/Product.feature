Feature: Buy Product
  i need buy a product

  Scenario: Eliminate product to cart successfully
    Given he user enter the website
    When the user select a product for delete
      | user          | password     |
      | standard_user | secret_sauce |
    Then the user will see that his product not is in the cart

  Scenario: Add product to cart successfully
    Given he user enter the website
    When the user select a product
      | user          | password     |
      | standard_user | secret_sauce |
    Then the user see his product in the cart

