package org.example.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Checkout;
import org.junit.Assert;


public class CheckoutSteps {

    private Checkout checkout;
    private int total;

    //method below establishes the price of an item by passing the price
    @Given("the price of an item is {int} dollars")
    public void methodName1(int price) {
        checkout = new Checkout(); // Initialize a new Checkout instance
        checkout.addItem(price); // Add an item with the given price
    }

    //method below adds an item for the checkout
    @Given("the price of another item is {int} dollars")
    public void methodName2(int price) {
        // Here we assume the checkout instance is already initialized
        checkout.addItem(price); // Add another item with the given price
    }

    //method below adds the item to the checkout
    @When("I add the item to the checkout")
    public void methodName3() {
        // In this simplified version, items are added in the Given step
        // So, this step could be just a placeholder
    }

    //method below adds two items that we pass
    @When("I add both items to the checkout")
    public void methodName4() {
        // Similarly, items are added in the Given steps
        // This is a placeholder step
    }

    //method below asserts the total price
    @Then("the total price should be {int} dollars")
    public void methodName5(int expectedTotal) {
        total = checkout.getTotal(); // Get the total from the Checkout instance
        Assert.assertEquals(expectedTotal, total); // Assert that the total is as expected
    }
}