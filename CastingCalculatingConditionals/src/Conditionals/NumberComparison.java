package Conditionals;

import java.util.Scanner;

public class NumberComparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int firstValue = scanner.nextInt();

        System.out.println("Enter second number: ");
        int secondValue = scanner.nextInt();

        if (firstValue == secondValue) {
            System.out.println("The numbers are the same");
        }
        else if (firstValue < secondValue) {
            System.out.println("The first number is less than the second number");
        }
        else {
            System.out.println("The first number is greater than the second number");
        }
    }
}
