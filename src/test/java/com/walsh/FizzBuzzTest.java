package com.walsh;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.*;
import org.junit.Assert;

public class FizzBuzzTest {

    //Choice method tests, User says no
    @Test
    @DisplayName("User Input: No")
    public void no(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        fizzBuzz.userInput = "n";
        Assert.assertEquals(false , fizzBuzz.choice());
    }

    //Choice method tests, User inputs incorrect value
    @Test
    @DisplayName("User Input: Invalid")
    public void exceptionTest(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        Assert.assertThrows(IllegalStateException.class, () -> {
            fizzBuzz.userInput = "x";
            fizzBuzz.choice();
        });
    }

    //Choice method tests, User says yes
    @BeforeEach
    public void setUpUserInputYes(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        fizzBuzz.userInput = "y";
    }

    @Test
    @DisplayName("User Input: Yes")
    public void yes(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        Assert.assertEquals(true , fizzBuzz.choice());
    }

    //Calculation method tests

    @BeforeEach
    public void setUpChoice(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        fizzBuzz.choice = true;
    }

    @Test
    @DisplayName("Non Multiples")
    public void nonMultiples(){
        FizzBuzz fizzBuzz = new FizzBuzz();

        Assert.assertEquals("Error: Value not divisible by 3 or 5", fizzBuzz.calculation(7));
    }

    @Test
    @DisplayName("Multiples of 3")
    public void multiplesOfThree(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        Assert.assertEquals("Fizz", fizzBuzz.calculation(3));
    }

    @Test
    @DisplayName("Multiples of 5")
    public void multiplesOfFive(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        Assert.assertEquals("Buzz", fizzBuzz.calculation(5));
    }

    @Test
    @DisplayName("Multiples of Both")
    public void multiplesOfBoth(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        Assert.assertEquals("FizzBuzz!!", fizzBuzz.calculation(15));
    }

    @Test
    @DisplayName("No Choice")
    public void noChoice(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        fizzBuzz.choice = false;
        Assert.assertEquals(null, fizzBuzz.calculation(15));
    }
}
