package org.example.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.BankAccount;
import org.junit.Assert;

public class BankAccountSteps {

    private BankAccount bankAccount;


    // Initialize the BankAccount with a given balance
    @Given("the account balance is {int}")
    public void methodName1(int balance) {
        bankAccount = new BankAccount(); // Initialize the BankAccount
        bankAccount.deposit(balance); // Set the initial balance
    }

    // Deposit a specified amount into the BankAccount
    @When("I deposit {int}")
    public void methodName2(int amount) {
        bankAccount.deposit(amount); // Deposit the specified amount
    }

    // Withdraw a specified amount from the BankAccount
    @When("I withdraw {int} dollars from the account")
    public void methodName3(int amount) {
        bankAccount.withdraw(amount); // Withdraw the specified amount
    }

    // Assert that the BankAccount balance is as expected
    @Then("the account balance should be {int}")
    @Then("the account balance after withdrawal should be {int}")
    public void methodName4(int expectedBalance) {
        Assert.assertEquals(expectedBalance, bankAccount.getBalance()); // Assert the balance
    }
}