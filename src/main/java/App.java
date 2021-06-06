import java.util.Scanner;

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Nickolas Garcia
 */


public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        String first = in.nextLine();

        System.out.print("Enter the second number: ");
        String sec = in.nextLine();

        System.out.print("Enter the third number: ");
        String third = in.nextLine();

        int a = Integer.parseInt(first);
        int b = Integer.parseInt(sec);
        int c = Integer.parseInt(third);

        int largest = (a > b) ? (a > c ? a : c) : (b > c ? b : c);

        System.out.print("The largest number is " + largest + ".");

    }
}
