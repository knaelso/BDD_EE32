Feature: Bank Account Operations

  Scenario: Deposit money into the account
    # Initialize the account with a zero balance
    Given the account balance is 0
    # Deposit an amount of 100 dollars into the account
    When I deposit 85
    # Verify the account balance is 100 dollars after deposit
    Then the account balance should be 85

  Scenario: Withdraw money from the account
    # Initialize the account with a balance of 200 dollars
    Given the account balance is 200
    # Withdraw an amount of 150 dollars from the account
    When I withdraw 150 dollars from the account
    # Verify the account balance is 50 dollars after withdrawal
    Then the account balance after withdrawal should be 50
