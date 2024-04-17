package org.example;

public class Checkout {
    private int total = 0;

    public void addItem(int price) {
        if (price > 0) {
            total += price;
        }
    }

    public int getTotal() {
        return total;
    }
}