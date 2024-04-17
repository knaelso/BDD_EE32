Feature: Basic Checkout

  Scenario: Add an item with positive price
    # Establish the price of a single item as 50 dollars
    Given the price of an item is 50 dollars
    # Add item to the checkout
    When I add the item to the checkout
    # Check that the total price at checkout is 50 dollars
    Then the total price should be 50 dollars

  Scenario: Add two items for checkout
    # Set the price of the first item to 30 dollars
  Given the price of an item is 30 dollars
    # Set the price of the second item to 20 dollars
  And the price of another item is 20 dollars
    # Add both items to the checkout
  When I add both items to the checkout
    # Ensure the total price at checkout equals the sum of bot items
  Then the total price should be 50 dollars







