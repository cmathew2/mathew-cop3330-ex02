package Base;
/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Chris Mathew
 */
import java.util.Scanner;

public class App
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //input
        System.out.print("What is the input string? ");
        String input = in.nextLine();

        // output with built-in function + original string
        System.out.print(input + " has " + input.length() + " characters.");
    }
}
