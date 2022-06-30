package com.walsh;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner sc= new Scanner(System.in);

        System.out.println("Welcome to the FizzBuzz program.");
        System.out.println("Would you like to play? Y or N: ");
        FizzBuzz.userInput= sc.nextLine();
        FizzBuzz.choice();
        System.out.print("Please enter your value: ");
        int x= sc.nextInt();

        FizzBuzz.calculation(x);
        System.out.println(FizzBuzz.result);
    }
}
