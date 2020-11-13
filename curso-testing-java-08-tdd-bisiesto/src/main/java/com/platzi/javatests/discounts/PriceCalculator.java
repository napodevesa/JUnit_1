package com.platzi.javatests.discounts;

import java.util.ArrayList;
import java.util.List;

public class PriceCalculator {
    
    private List<Double> prices;

    {
        prices = new ArrayList<>();
    }

    private double discount=0;

    public double getTotal() {
        double result = 0;
        for (Double price : prices) {
            result += price;
        }

        return result * ((100-discount)/100);
    }

    public void addPrices(double price) {
        prices.add(price);
    }

    public void serDiscount(double discount) {

        this.discount = discount;
    }
}
