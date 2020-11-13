package com.platzi.javatests.FizzBuzz;

public class FizzBuzz {

    public static String fizzBuzz(int num){

        String numString= num +"";

        if (num % 3 == 0){
            return "Fizz";
        }
        if (num % 5 == 0){
            return "Buzz";
        }
        if (num % 5 == 0 && num % 3 == 0){
            return "FizzBuzz";
        }

        return numString;
    }
}
