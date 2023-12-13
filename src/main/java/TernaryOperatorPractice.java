import java.util.Scanner;

public class TernaryOperatorPractice {
    public static void main(String[] args) {

        /*
                Example 1
         */


        int a = 10;
        int b = 5;

        /*

        int biggerNumber;

        if (a > b){
            biggerNumber = a;
        } else{
            biggerNumber = b;
        }
        */

        int biggerNumber = (a > b) ? a : b;
        System.out.println(biggerNumber);


        /*
            Example 2
         */

        double c = 10.0;
        double d = 15.5;

        double e = (c == d) ? d : c;
        System.out.println(e);

        double f = (c > d) ? 2.5 : 3.14;
        System.out.println(f);

        System.out.println((c > d) ? 2.5 : 3.14);


        // char
        int x = 2;
        int y = 3;

        char letter = (x > y) ? 'a' : 'B';

        System.out.println(letter);


        // STRING
        String str = "Hello";
        String str1 = (str.equals("Bye")) ? "abc" : "xyz";
        System.out.println(str1);

        String str2 = (str.isEmpty()) ? "chicago" : "new york";
        System.out.println(str2);

        String str3 = new String("Hello");

        String str4 = (str.equals(str3)) ? "b" : "c";
        String str5 = (str == str3) ? "b" : "c";
        System.out.println(str4);
        System.out.println(str5);


        /*
                RULE: if the boolean condition of ternary operator is true, then the second half will not be executed/evaluated
                      if the boolean condition of ternary operator is false, then the first half will not be executed/evaluated

                      variable = (boolean condition) ? expression1/value1 : expression2/value2
         */

        int num1 = 5;
        int num2 = 3;

        int num3 = (num1 > num2) ? num1++ : num1--;

        System.out.println(num3);
        System.out.println(num1);


        int i = 1;
        int j = 1;

        int k = (i > 10) ? i++ : j++;

        System.out.println("i is: " + i + " j is: " + j);


        /*
                Example 3: Nested ternary operator
         */

        int aa = 10;
        int bb = 20;
        int cc = 5;

        int largest = (aa > bb) ? (aa > c) ? aa : (bb > cc) ? bb : cc : 0;


        // DATA TYPE CONSISTENCY

        int l = (a > b) ? 2 : 1;

        String word = (a < b) ? "Yes" : "n";


        int age = 20;
        boolean isAdult = (age >= 18) ? true : false;
        System.out.println(isAdult);


        /*
            TASK:

                    - Print out "Passed" if score is over 75, otherwise print out "Failed".
                    - Ask the user for their score.

                    ! Use ternary operator.
         */
/*
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the grade:");
        int grade = scanner.nextInt();
        String message = (grade >= 75) ? "Passed" : "Failed";
        System.out.println(message);

        /*
                TASK 2:

                - Input a number and determine if number is "even" or "odd"
                - number % 2 == 0
                - print out "your number is even" if its even, otherwise "your number is odd"
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your number:");
        int num = scanner.nextInt();
        String message = (num % 2 == 0) ? "EVEN" : "ODD";
        System.out.println(message);

        /*
                TASK 3:

                - Ask user to input two numbers
                - Find out the minimum of those two numbers (the smallest between those two numbers)
                - Print out that number
         */

        System.out.println("Please input the first number:");
        int first = scanner.nextInt(); // 3

        System.out.println("Please input the second number:");
        int second = scanner.nextInt(); // 2

        String mes = (first < second) ? "First number is smaller."
                : (first == second) ? "They are equal!"
                : "Second number is smaller.";
        /*
                if (first < second){
                    mes = "First number is smaller.";
                } else if (first == second) {
                    mes = "They are equal!";
                } else {
                    mes = "Second number is smaller.";
                }
         */

        System.out.println(mes);

    }
}
