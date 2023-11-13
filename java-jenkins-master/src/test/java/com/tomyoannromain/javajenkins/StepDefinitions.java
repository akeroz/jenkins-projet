package com.tomyoannromain.javajenkins;

import com.tomyoannromain.javajenkins.Checkout;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StepDefinitions {
    private List<Integer> shoppingCart;
    private double actualAnswer;
    private BooksLot booksLot;

    @Given("One book")
    public void oneBook() {
        this.booksLot = new BooksLot(1);

    }

    @Given("the shopping cart contains {int} differents books")
    public void theShoppingCartContainsDifferentsBooks(Integer item) {
        List<Integer> shopping = new ArrayList<>();
        for (int i = 0; i < item; i++) {

            shopping.add(i);
        }
        this.shoppingCart = shopping;
    }

    @Given("the shopping cart contains {int} same books")
    public void theShoppingCartContainsSameBooks(Integer arg0) {
        List<Integer> shopping = new ArrayList<>();
        for (int i = 0; i < arg0; i++) {

            shopping.add(1);
        }
        this.shoppingCart = shopping;
    }

    @Given("the shopping cart contains {int} Harry Potter {int}, {int} Harry Potter {int}, {int} Harry Potter {int}, {int} Harry Potter {int} and {int} Harry Potter {int}")
    public void theShoppingCartContainsHarryPotterHarryPotterHarryPotterHarryPotterAndHarryPotter(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        List<Integer> shopping = new ArrayList<>();
        for (int i = 0; i < arg0; i++) {
            shopping.add(arg1);
        }
        for (int i = 0; i < arg2; i++) {
            shopping.add(arg3);
        }
        for (int i = 0; i < arg4; i++) {
            shopping.add(arg5);
        }
        for (int i = 0; i < arg6; i++) {
            shopping.add(arg7);
        }
        for (int i = 0; i < arg8; i++) {
            shopping.add(arg9);
        }
        this.shoppingCart = shopping;
    }

    @When("I ask what the price is")
    public void iAskWhatThePriceIs() {
        Checkout checkout = new Checkout();
        actualAnswer = checkout.calculateTotalPrice(checkout.getBestBooksLotList(shoppingCart));
    }

    @Then("I should be told that the price is {double} euros")
    public void iShouldBeToldThatThePriceIsEuros(Double expectedAnswer) {
        assertEquals(Double.valueOf(expectedAnswer), actualAnswer);
    }


    @Then("The book price is {int} euros")
    public void theBookPriceIsEuros(int arg0) {
        assertEquals(arg0,booksLot.getPriceOfOneBook());
    }
}
