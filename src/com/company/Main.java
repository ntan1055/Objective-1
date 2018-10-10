package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
	// write your code here
        int randomInt = (int)(Math.random()*11);
        System.out.println("Guess the random number: ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        while(number != randomInt)
        {
            System.out.println("Guess again: ");
            number = input.nextInt();
        }
        System.out.println("You got it! The random number is "+number);
    }
}

