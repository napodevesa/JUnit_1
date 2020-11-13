package com.platzi.javatests.discounts;

import org.junit.Test;
import static org.hamcrest.CoreMatchers.*;

import static org.junit.Assert.*;

public class PriceCalculatorShould {

    @Test
    public void total_zero_when_there_are_prices (){
        PriceCalculator calculator = new PriceCalculator();
        assertThat(calculator.getTotal(), is( 0.0));

    }
    @Test
    public void total_is_sum_of_prices (){
        PriceCalculator calculator = new PriceCalculator();
        calculator.addPrices (10.2);
        calculator.addPrices (33.2);

        assertThat(calculator.getTotal(), is( 43.400000000000006));

    }

    @Test
    public void apply_discount_to_prices() {
        PriceCalculator calculator = new PriceCalculator();
        calculator.addPrices (100);
        calculator.addPrices (100);

        calculator.serDiscount(25);

        assertThat(calculator.getTotal(), is( 150));

    }

}