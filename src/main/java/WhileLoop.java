import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {

        /*
                while

                Loops in Java:
                    1. While is one of the loops in Java.

                    "While" loop in Java is a control flow statement that allows the code to be executed repeatedly based on boolean condition.

                    "While" loop executes the code block repeatedly as long as the boolean condition is TRUE

                    Once the condition is FALSE, the loop stops/breaks.

                    SYNTAX of the while loop:

                        while (boolean expression or condition) {
                            // code to be executed
                            // control/controller that will turn the condition to FALSE
                        }

    * one iteration is one cycle
    * an infinite loop - a loop that runs endlessly (the boolean expression is always true)

         */

        int counter = 1;

        while (counter >= 0) {
            System.out.println(counter); // 1st iteration: 1, 2nd iteration: 0
            counter--; // 1-- ---> 0, 0-- ---> -1
        }

        /*
                TASK:

                1. To print out even numbers that are less than or equal to 10. (2, 4, 6...)
                HINT: use % (remainder/modulus)

                    NOTE: while loop
         */

        int i = 10;

        while (i > 0) {
            if (i % 2 == 0) { //
                System.out.println(i);
            }
            i--; // 10-- ==> 9
        }

        /*
                even - divisible by 2, 1 ( 2 by 2, 1) no remainder when we divide the number by 2 ----> i % 2 == 0
                odd - divisible by itself and 1 ( 7 by 7 and 1)
         */


        /*
                Print out the odd numbers from 1 to 21
                Print out "Odd number is <odd number>"

                Print out in ascending order - from smallest to largest.
                If you're done with ascending order, print out in descending order.

         */

        System.out.println("---------------");

        int n = 1;

        while (n <= 21) {
            if (n % 2 == 1) {
                System.out.println("Odd number is " + n);
            }
            n++;
        }

        /*
                EXAMPLE 1: String
         */

        /*
        String username = "johndoe";
        String password = "Password123!";

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter you username:");
        String enteredUsername = scanner.next();

        System.out.println("Please enter your password:");
        String enteredPassword = scanner.next();

        int counter1 = 2;

        while (!enteredUsername.equals(username) && counter1 > 0 && !enteredPassword.equals(password)) {
            System.out.println("Please try again! Enter username.");
            enteredUsername = scanner.next();
            System.out.println("Please try again! Enter password.");
            enteredPassword = scanner.next();
            counter1--;
        }

        if (counter1 >= 0 && enteredUsername.equals(username) && enteredPassword.equals(password)) {
            System.out.println("You have successfully logged in!");
        } else {
            System.out.println("Your logging in failed. Account is locked!");
        }

        /*
                TASK:

                Reversing the string that user has entered.

                DO NOT USE STRINGBUILDER.REVERSE()

                HINT: use length(), charAt(index), while() loop

                FOR EXAMPLE:

                - abc

                - Print out "Original string is abc"
                - Print out "The reversed string is cba"

                "abc".length() ---> 3

                charAt("abc".length()-1)

         */

        /*
                PSEUDOCODE:

                    1. User input
                    2. Store it as a string
                     * abc -> cba, hello -> olleh

                    3. char letter = string.charAt(string.length()-1) - this will give us the last character of the string

                     StringBuilder reversed = new StringBuilder();
                     reversed.append(letter);

                    4. Printing out the reversed string

         */

        /*
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Please enter the word or sentence!");
        String originalWord = scanner1.nextLine(); // ABC

        StringBuilder reversedWord = new StringBuilder(); // empty stringbuilder
        int index = originalWord.length() - 1; // 2: because the length of the word ABC is 3, -1 will give us 2

        while (index >= 0) {
            char letter = originalWord.charAt(index); // ABC --> ABC.charAt(2) ---> C
                                                        // ABC.charAt(1) ---> B
                                                        // ABC.charAt(0) ---> A
            reversedWord.append(letter); // CBA
            index--;
        }

        System.out.println("Your original string is: " + originalWord);
        System.out.println("Your reversed string is: " + reversedWord);

        /*
                TASK:

                 - Ask user to input some string (Hello, World etc.)
                 - Using while, print out the total number of letter 'l'

                 HINT: word.charAt(index) == 'l'

                 If hello, then it should print out "The letter l appeared: 2 time(s)"
                 "World" ---> The letter l appeared: 1 time(s)
                 "Lollapallooza" ---> The letter l appeared: 5 time(s)

         */


        Scanner scanner = new Scanner(System.in);
        /*
        String word = scanner.nextLine(); // hello world

        int counterOfLetterL = 0;
        int index = 0;

        while (index < word.length()) {
            if (word.charAt(index) == 'l') {
                counterOfLetterL++;
            }
            index++;
        }

        System.out.println("The letter l appeared in your word/sentence " + counterOfLetterL + " time(s).");


        /*
                TASK:

                Print out the word that user has entered "n" times

                1. Ask user for a word
                2. Ask user for an int

                Print out the word that many times

                Hello
                3

                Hello
                Hello
                Hello

                ! Use while loop
         */

        System.out.println("Please enter any word or sentence.");
        String str = scanner.nextLine(); // java

        System.out.println("Please enter any positive number (0 to 10).");
        int j = scanner.nextInt(); // 6

        while (j > 0){

            System.out.println(str); // java, java, java

            j -= 2; // j = j - 2 ==> 4 ==> 2 ==> 0
        }

        /*
                do-while loop
         */

        /*
                HOMEWORK:

                "The sum of all numbers" task

                * Ask user to input any positive number (0 to 100)
                * Calculate the sum of all numbers until "n" [which is entered by user]
                * Print out the result

                3 => 1+2+3 = 6
                4 => 1+2+3+4 = 10


                Use while loop!

         */
    }
}
