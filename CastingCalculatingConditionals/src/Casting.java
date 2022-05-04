public class Casting {
    public static void main(String[] args) {
        
// part one

        double doubleValue = 112.35;
        int intValueOne = (int) doubleValue;

        System.out.println("Double: " + doubleValue);
        System.out.println("int:" + intValueOne);

// part two
        
        String stringValue = "49";
        int intValueTwo = Integer.parseInt(stringValue);

        System.out.println("string: " + stringValue);
        System.out.println("int:" + intValueTwo);
        
    }
}
