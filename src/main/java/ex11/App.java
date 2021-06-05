/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Evan Raiford
 */
package ex11;
import java.util.Scanner;

public class App {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.print("How many euros are you exchanging? ");
        int euros = in.nextInt();
        System.out.print("What is the exchange rate? ");
        double rate = in.nextDouble();
        double inDollars = euros * rate;
        inDollars = Math.ceil(inDollars * 100)/100;

        System.out.println(euros + " euros at an exchange rate of " + rate + " is\n" + inDollars + " U.S. dollars.");
    }
}
