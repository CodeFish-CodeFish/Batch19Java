import java.util.Scanner;

public class IfElsePractice2 {
    public static void main(String[] args) {
        /*
                    HOMEWORK:

                    1. Ask user to input the grade (0-100)
                    2. Print out A if (90-100)
                    3. Print out B if (80-90)
                    4. C if 70-80
                    5. F if (<70)

                    "You grade is A/B/C/F"
         */
/*
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your grade (0-100):");
        int grade = scanner.nextInt(); // this will read and store the grade

        if (grade >= 90 && grade <= 100) {
            System.out.println("You have grade A."); // code block
            System.out.println("Good job!"); // this is also a part of code block
        }

        if (grade >= 80 && grade < 90) {
            System.out.println("You have grade B.");
            System.out.println("Nice try!");
        }

        if (grade >= 70 && grade < 80) {
            System.out.println("You have grade C.");
            System.out.println("Keep up!");
        }

        if (grade >= 0 && grade < 70) {
            System.out.println("You have grade F.");
            System.out.println("Best of luck!");
        }


        int number = 1234;

        if (number == 1234)
            System.out.println("Number is equals to 1234");

        System.out.println("Number is not equals to 1234");



        /*
                else statement
         */

        // Example 1

        int temp = 35;

        if (temp >= 70) { // false
            System.out.println("It's warm outside!");
        } else {
            System.out.println("It's chilly outside!");
        }

        // Example 2

        boolean isRaining = true;

        if (isRaining) {
            System.out.println("Don't forget to take your umbrella!");
        } else {
            System.out.println("It is not raining, no need for an umbrella!");
        }

        /*
                TASK:

                1. ask user to enter a number
                2. you should add 2 if number is greater than 10
                3. else you should subtract 2
                4. print out the number
         */
/*
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if (number > 10) {
            number += 2; // number = number + 2;
        } else {
            number -= 2; // number = number - 2;
        }

        System.out.println(number);

        /*
                TASK:

                    1. Ask user to enter username --- (string) use next() .equals or .compareTo()
                    2. Ask user to enter password --- (string) use next()
                    3. if username is "admin" and password is "password123" - print out "access granted!"
                    4. else print out "access denied!"
         */
/*
        Scanner scanner1 = new Scanner(System.in);

        System.out.println("Please enter the username:");
        String username = scanner1.next();

        System.out.println("Please enter the password:");
        String password = scanner1.next();

        if (username.equals("admin") && password.equals("password123")) {
            System.out.println("Access granted!");
        } else {
            System.out.println("Access denied!");
        }

        /*
                Task:

                    Speed limit

                    1. Ask user the speed limit (use int or double)
                    2. Ask user if it's their first time (nextBoolean())
                    3. if speed limit is greater than 30 and if it's not their first time ----> print out "You got a ticket!"
                    4. else print out "No ticket!"
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your current speed:"); // 35
        int speed = scanner.nextInt();
        System.out.println("Is it your first time?"); // true
        boolean isFirstTime = scanner.nextBoolean();

        if (isFirstTime == false && speed > 30) {  // false && true
            System.out.println("You got a ticket!");
        } else {
            System.out.println("No ticket!");
        }


        // false == false ----> true
        // true == false -----> false

        // "ABC".equals("abc") ---> false
        // "ABC".equals("abc") ---> true

        String str1 = "JaVa";
        String str2 = "jAva";

        System.out.println(str1.equals(str2)); // false
        System.out.println(str1.equalsIgnoreCase(str2)); // true

        /*
                TASK:
                BLACK FRIDAY SALE:

                1. Ask user to input the amount of products in their basket (int amount = ....)
                2. Ask user for their promo code (next())
                    (if promo code is equal to "blackfriday10" and the amount is greater than 5 items)
                3. Print out "you are eligible for Black Friday discount"
                4. Otherwise, print out "you are not eligible for Black Friday discount"
         */

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Please enter the amount of products in your basket:");
        int amount = scanner1.nextInt();
        System.out.println("Please enter the promo code:");
        String promocode = scanner1.next();

        if (amount > 5 && promocode.equals("blackfriday10")) {
            System.out.println("You are eligible for Black Friday discount.");
        } else {
            System.out.println("Sorry. You are not eligible for Black Friday discount!");
        }
    }
}



