import java.util.Scanner;

public class Calculations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int firstValue = scanner.nextInt();
        System.out.println("Enter another number:");
        int secondValue = scanner.nextInt();
        
        int additionValue = firstValue + secondValue;
        int subtractionValue = firstValue - secondValue;
        int multiplicationValue = firstValue * secondValue;
        double doubleFirstValue = firstValue;
        double doubleSecondValue = secondValue;
        double divisionValue = doubleFirstValue / doubleSecondValue;
        int moduloValue = firstValue % secondValue;

        System.out.println(firstValue + " + " + secondValue + " = " + additionValue);
        System.out.println(firstValue + " - " + secondValue + " = " + subtractionValue);
        System.out.println(firstValue + " * " + secondValue + " = " + multiplicationValue);
        System.out.println(firstValue + " / " + secondValue + " = " + divisionValue);
        System.out.println(firstValue + " % " + secondValue + " = " + moduloValue);
    }
}
