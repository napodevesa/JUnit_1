package com.platzi.javatests.FizzBuzz;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import com.platzi.javatests.discounts.PriceCalculator;
import org.junit.Test;

public class FizzBuzzShould {

    @Test
    public void number_div_by_3_then (){

        assertEquals("Fizz", FizzBuzz.fizzBuzz(9));
        assertEquals("Fizz", FizzBuzz.fizzBuzz(33));
        assertEquals("Fizz", FizzBuzz.fizzBuzz(66));
    }

    @Test
    public void number_div_by_5_then (){

        assertEquals("Buzz", FizzBuzz.fizzBuzz(10));
        assertEquals("Buzz", FizzBuzz.fizzBuzz(30));
        assertEquals("Buzz", FizzBuzz.fizzBuzz(300));
    }

    @Test
    public void number_div_by_3_and_5_then (){

        assertEquals("FizzBuzz", FizzBuzz.fizzBuzz(15));
        assertEquals("FizzBuzz", FizzBuzz.fizzBuzz(150));
        assertEquals("FizzBuzz", FizzBuzz.fizzBuzz(1500));
    }

    @Test
    public void not_fizz_and_buzz (){

        assertEquals("4", FizzBuzz.fizzBuzz(4));
        assertEquals("1", FizzBuzz.fizzBuzz(1));
        assertEquals("7", FizzBuzz.fizzBuzz(7));
    }



}