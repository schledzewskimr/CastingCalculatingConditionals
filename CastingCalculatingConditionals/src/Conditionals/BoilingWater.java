package Conditionals;

import java.util.Scanner;

public class BoilingWater {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number greater than 212:");
        int number = scanner.nextInt();
        if (number > 212) {
            System.out.println("Water is boiling!");
        }
        else if (number == 212) {
            System.out.println("It's starting to boil!");
        }
        else {
            System.out.println("Water is not boiling :(");
        }
    }
}
