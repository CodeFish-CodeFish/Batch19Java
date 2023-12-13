import java.util.Scanner;

public class SwitchStatementPractice {
    public static void main(String[] args) {

        /*
                switch (variable) {
                    case value1:
                        // code
                        break;
                    case value2:
                        // code
                        break;

                        ...

                    default:
                        // code
                        break;
                }
         */


        int a = 2;

        switch (a) {
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            default:
                System.out.println("Not 1, 2 or 3");
                break;
        }

        // "FALL-THROUGH"

        /*
            String in switch statement
         */

        String name = "Harry Potter";
        String movieHero = "Darth Vader";

        switch (movieHero) {
            case "Darth Vader":
                System.out.println("Star Wars");
                break;
            case "Harry Potter":
                System.out.println("Harry Potter");
                System.out.println("Hermione Grainger");
                System.out.println("Professor Dumbledoore");
                int b = 1;
                b++;
                System.out.println(b);
                break;
            default:
                System.out.println("Unknown movie character. Please try again!");
                break;
        }

        System.out.println("ABC");


        /*
                - input the month (jan, feb, aug, dec...)
                - decide the season of the year based on the month
         */

        /*
        String season = "";

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the month abbreviated (for ex. jan, feb, etc...)");
        String month = scanner.next();

        switch (month) {
            case "jan":
            case "feb":
            case "dec":
                season = "winter";
                break;
            case "jun":
            case "jul":
            case "aug":
                season = "summer";
                break;


        }

        System.out.println("Season is " + season);

        /*
                Nested switch statement
         */

        /*
         For example:

         if user inputs multiple variables that we need to check in out switch statement

         String makeOfCar -- Toyota, Honda, BMW, Tesla, etc.
         String modelOfCar -- Camry, Prius, Venta, Civic, Accord, 545, x6, Model X, Model y, CyberTruck etc.
         */

        String makeOfCar = "Tesla";
        String modelOfCar = "CyberTruck";

        switch (makeOfCar) {
            case "Honda":
                switch (modelOfCar) {
                    case "Accord":
                        System.out.println("Honda Accord");
                        break;
                    case "Civic":
                        System.out.println("Honda Civic");
                        break;
                }
                break;
            case "Tesla":
                switch (modelOfCar) {
                    case "Model Y":
                        System.out.println("Tesla Model Y");
                        break;
                    case "Model X":
                        System.out.println("Tesla Model X");
                        break;
                    case "CyberTruck":
                        System.out.println("Tesla CyberTruck");
                        break;
                }
                break;
            default:
                System.out.println("Not implemented, please try again!");
                break;
        }

        // prune to errors

        /*
                TASK:
                    - Get user input and for a day of the week (MON, TUE or Monday, Tuesday)
                    - Use switch statement to define whether it's a weekday or weekend.
                    - Print out "weekday" or "weekend"
         */

        Scanner scanner = new Scanner(System.in);
        String day = scanner.next(); // tuesday

        /*
                monday --->
                        1. m -> M
                        2. extract "onday" from "monday" [substring(1)]
                        3. "M" + "onday"
                        4. Monday

                 tuesday ---->
                        1. t -> T
                        2. extract "uesday" form "tuesday" [substring(1)]
                        3. "T" + "uesday"
                        5. Tuesday
         */


        String firstLetterOfDay = day.charAt(0) + ""; // t
        String updatedDay = firstLetterOfDay.toUpperCase() + day.substring(1); // T + uesday

        // edge case - in IT is rare case or some extreme case

        switch (updatedDay) {
            case "Tuesday":
                System.out.println("It's a work day!");
                break;
            case "Sunday":
            case "Saturday":
                System.out.println("It's a weekend!");
                break;
        }


        /*
                TASK 3:

                CALCULATOR
                    - Ask user to input 2 numbers [int]
                    - Ask user to input one of these operators: +, -, *, or / [scanner.next()]

                    NOTE: Print out "You are not allowed to divide by zero!" if they try to divide by zero.

                    - Using switch statement, perform the operation and print out the result

string operator =

switch(operator)
    case "-":
            num1 - num2;
            break;

                    For ex:

                    1
                    2
                    +

                    "Your result of 1 + 2 is 3"

                    case "/":
                        if(num2 == 0){
                        sout("you're not allowed...");
                        }else{
                            num1/num2
                        }
         */

        // 1/0

        Scanner scanner1 = new Scanner(System.in);

        System.out.println("Please enter 1st number");
        int first = scanner1.nextInt();

        System.out.println("Please enter the 2nd number");
        int second = scanner1.nextInt();

        System.out.println("Please enter the operator ( +, -, *, or / )");
        String operator = scanner1.next(); // to read the operator

        switch (operator) {
            case "+":
                System.out.println("Your operator is: " + operator + ". The result: " + first + operator + second + " is " + (first + second));
                break;
            case "-":
                System.out.println("Your operator is: " + operator + ". The result: " + first + operator + second + " is " + (first - second));
                break;
            case "*":
                System.out.println("Your operator is: " + operator + ". The result: " + first + operator + second + " is " + (first * second));
                break;
            case "/":
                if (second == 0) {
                    System.out.println("You are not allowed to divide by zero!");
                } else {
                    System.out.println("Your operator is: " + operator + ". The result: " + first + operator + second + " is " + (first / second));
                }
                break;
            default:
                System.out.println("Please try again!");
                break;
        }


    }
}
