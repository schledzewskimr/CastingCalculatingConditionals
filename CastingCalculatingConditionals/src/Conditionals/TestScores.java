package Conditionals;

import java.util.Scanner;

public class TestScores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your score between 0 and 100");
        int score = scanner.nextInt();

        if (score < 60 && score > 0) {
            System.out.println("You 'F'-ail");
        }
        else if (score >= 60 && score < 70) {
            System.out.println("Try har-'D'-er");
        }
        else if (score >= 70 && score < 80) {
            System.out.println("Ac-'C'-eptable");
        }
        else if (score >= 80 && score < 90) {
            System.out.println("'B'-etter than some");
        }
        else if (score >= 90 && score <= 100) {
            System.out.println("Wow! 'A'-mazing!");
        }
        else if (score > 100 || score < 0) {
            System.out.println("Hmmm.. That must be a mistake.");
        }
    }   
}
