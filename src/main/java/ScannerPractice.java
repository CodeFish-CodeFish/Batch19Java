import java.util.Scanner;

public class ScannerPractice {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); // we've created an object of Scanner class

        // byte - nextByte()
        // short - nextShort()
        // int - nextInt()
        // boolean - nextBoolean()
        // double - nextDouble()
        // float - nextFloat()
        // long - nextLong()
        // String - next() and nextLine()

        // 1) byte - nextByte()
        System.out.println("Please input a byte: ");
        byte myByte = scanner.nextByte();
        System.out.println("My byte is: " + myByte); // this will print out whatever number you have entered as a byte

        // 2) short - nextShort()
        System.out.println("Please input a short: ");
        short myShort = scanner.nextShort();
        System.out.println("My short is: " + myShort);

        // 3) int - nextInt()
        System.out.println("Please input an integer: ");
        int myInt = scanner.nextInt();
        System.out.println("My integer is: " + myInt);

        // 4) boolean - nextBoolean()
        System.out.println("Please input a boolean (true/false): ");
        boolean myBoolean = scanner.nextBoolean();
        System.out.println("My boolean is: " + myBoolean); // prints out the boolean user entered

        // 5) double - nextDouble()
        System.out.println("Please input a double: ");
        double myDouble = scanner.nextDouble();
        System.out.println("My double is: " + myDouble);

        // 6) float - nextFloat()
        System.out.println("Please enter a float: ");
        float myFloat = scanner.nextFloat();
        System.out.println("My float is: " + myFloat); // do not include 'f' at the end

        // 7) long - nextLong()
        System.out.println("Please enter a long: ");
        long myLongNumber = scanner.nextLong();
        System.out.println("My long is: " + myLongNumber); // do not include 'l' at the end of your long

        // 8) String - next()

        // next() - reads until first space
        // INPUT: java is easy! ---> will store only 'java'

        System.out.println("Please enter a string: ");
        String myString = scanner.next();
        System.out.println("My string is: " + myString);

        // nextLine() - reads the entire line
        // INPUT: java is hard! ----> will store the whole line as-is "java is hard!"

        System.out.println("Please input a sentence: ");
        scanner.nextLine(); // this will read/consume the user input
        String myLine = scanner.nextLine();
        System.out.println("My string line is: " + myLine);


        scanner.close(); // this is the method to close the scanner
    }
}
