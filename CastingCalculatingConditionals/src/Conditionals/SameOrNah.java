package Conditionals;

import java.util.Scanner;

public class SameOrNah {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a word!");
        String wordOne = scanner.nextLine();
        System.out.println("Well done. Now enter another word!");
        String wordTwo = scanner.nextLine();

        if (wordOne.equals(wordTwo)) {
            System.out.println("The words are the same! Unbelievable!");
        }
        else {
            System.out.println("The words are different! Incredible!");
        }
        
    }    
}
