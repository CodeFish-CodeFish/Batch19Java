import java.util.Scanner;

public class IfElsePractice {
    public static void main(String[] args) {

        /*
                Syntax:

                    if(condition) {
                        // code that should be executed if condition is TRUE
                    }

                    condition - statement or expression that returns a boolean (true or false)
         */

        //Example 1

        boolean isThirsty = false;

        if (isThirsty) {
            System.out.println("Drinking some water...");
        }


        // Example 2

        int temp = 36;

        if (temp > 50) {
            System.out.println("Wear a lightweight jacket!");
        }

        if (temp < 50) {
            System.out.println("Wear a warm jacket!");
        }


        // Example 3

        // AND (&)

        boolean isSunny = true;
        boolean isRaining = true;

        if (isSunny & isRaining) {
            System.out.println("It is sunny and raining");
        }


        // Determining user input is a positive or negative number

        /*
                1. Ask user to input some number
                2. Storing that number as an int
                3. Determine whether the user input is greater than 0 ---> positive
                4. Determine whether the user input is less than 0 ---> negative
                5. Determine whether the user input is 0 ---> 0
         */
/*
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number (positive or negative): ");

        int number = scanner.nextInt(); // 3

        if (number > 0) {
            System.out.println(number + " is positive number.");
        }

        if (number < 0) {
            System.out.println(number + " is negative number.");
        }

        if (number == 0) {
            System.out.println(number + " is zero.");
        }

        /*
                TASK:
                    1. Voting: if you are a citizen of the USA and you are old enough (18 or older)
                        - Please input your age
                        - Are you US citizen?
                    2. Print out "You are eligible for voting!" if they are eligible for voting

                    3. No need to print out if they are not eligible.
         */


        /*
                1. Ask the age and citizenship
                2. Storing the user inputs onto int and boolean
                3. if (isOldEnough && isCitizenOfUSA) { sout(You are eligible for voting!) };
         */

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Please enter your age: ");
        int age = scanner1.nextInt();
        System.out.println("Are you a citizen of the US ? [please type true or false]");
        boolean isCitizen = scanner1.nextBoolean();

        if (age >= 18 && isCitizen) {
            System.out.println("You are eligible for voting!");
        }


        /*
                    HOMEWORK:

                    1. Ask user to inout the grade (0-100)
                    2. Print out A if (90-100)
                    3. Print out B if (80-90)
                    4. C if 70-80
                    5. F if (<70)

                    "You grade is A/B/C/F"
         */
    }
}
