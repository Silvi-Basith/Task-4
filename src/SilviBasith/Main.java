package SilviBasith;
import java.math.BigInteger;
import java.util.Scanner;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        MyCalculator calculator = new MyCalculator();

        System.out.print("Please Enter the number you want sum of divisor: ");
        int x = input.nextInt();
        System.out.println("Sum of the Divisors = " +calculator.divisorSum(x));

        System.out.print("Please Enter the number you want factorial: ");
        int y = input.nextInt();
        System.out.println("Factorial of the number = " +calculator.findFactorial(y));





    }
}

/*
Name = Silvi Basith
ID = 2012020291
SEC = Regular
EMAIL = cse_2012020291@lus.ac.bd
DATE = 5.01.22
 */
