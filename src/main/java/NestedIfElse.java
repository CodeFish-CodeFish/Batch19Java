import java.util.Scanner;

public class NestedIfElse {
    public static void main(String[] args) {

        /*
                Nested if else
         */

        int number = 14;

        if (number < 10) {
            if (number > 5) {
                System.out.println("Our number is less than 10 and greater than 5.");
            } else {
                System.out.println("Number is less than 5.");
            }
        } else {
            System.out.println("Our number is greater than 10.");
        }

        /*
                TASK:
                    1. Subjects: Science, Maths, Humanities
                    2. Average grade: A, B, C, or D

                    3. If student picks Science, then we should check the average grade: A or B ---> Biology or Chemistry
                    4. Else, we should recommend ---> physics or earth sciences

                    5. If student picks Maths, then we should check the average grade: A or B ---> Calculus or Statistics
                    6. Else, algebra or geometry

                    7. If student picks Humanities, then we should check the average grade: A or B ---> World History or Literature
                    8. Else, writing and reading

                    9. Print out: "Invalid subject area"

         */

        /*
                PSEUDOCODE:

                * INPUT: subject as scanner.next()

                * INPUT: grade as scanner.next()

                * IF subject is Science:
                    IF grade is A or grade is B:
                        Biology or Chemistry
                    ELSE:
                        Physics or Earth Sciences
                 ELSE IF subject is Maths:
                    IF grade is A or grade is B:
                        Calculus or Statistics
                    ELSE:
                        Algebra or Geometry
                 ELSE IF subject is Humanities:
                    IF grade is A or grade is B:
                        World History or Literature
                    ELSE:
                        Writing and Reading
                ELSE:
                    OUTPUT "Invalid subject area"
         */
/*
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please specify the subject you are interested (Science, Maths, or Humanities):");
        String subject = scanner.next();

        System.out.println("Please input your average grade (A, B, C, or D):");
        String grade = scanner.next();

        if (subject.equalsIgnoreCase("science")) {
            if (grade.equalsIgnoreCase("a") || grade.equalsIgnoreCase("b")) {
                System.out.println("Biology or Chemistry is recommended.");
            } else {
                System.out.println("Physics or Earth Sciences is recommended.");
            }
        } else if (subject.equalsIgnoreCase("maths")) {
            if (grade.equalsIgnoreCase("a") || grade.equalsIgnoreCase("b")) {
                System.out.println("Calculus or Statistics is recommended.");
            } else {
                System.out.println("Algebra or Geometry is recommended.");
            }
        } else if (subject.equalsIgnoreCase("humanities")) {
            if (grade.equalsIgnoreCase("a") || grade.equalsIgnoreCase("b")) {
                System.out.println("World History or Literature is recommended.");
            } else {
                System.out.println("Please focus on writing and reading skills!");
            }
        } else {
            System.out.println("Invalid subject area! Please try again.");
        }

        /*
                RULE: keep it simple [KISS rule]
                RULE: do not repeat yourself [DRY rule]
         */


        /*
                TASK:

                    Balance is 100$ [int balance = 100;]

                    1. We will ask the user to select 3 options
                            * check balance
                            * deposit
                            * withdraw (get cash)

                    IF option is "check balance":
                            OUTPUT "current balance" + balance
                    ELSE IF option is "deposit":
                            OUTPUT "how much would you like to deposit?";
                            int depAmount = scanner.nextInt(); read the user input of how much they want to deposit using scanner.nextInt()
                            IF deposit amount > 0:
                                balance = balance + deposit amount;
                                OUTPUT "your new balance is" + balance;
                            ELSE:
                                OUTPUT "invalid deposit amount";

                    ELSE IF option is "withdraw":
                            read the user input of how much they want to withdraw using scanner.nextInt()
                            IF withdraw amount < balance AND withdraw amount > 0:
                                balance = balance - withdraw amount;
                                OUTPUT "withdraw is completed, your new balance is" + balance;
                            ELSE:
                                OUTPUT "invalid withdraw amount";
                    ELSE:
                            OUTPUT "Invalid action selected"

         */


        int number1 = 1236;

        if (number1 == 1234) {
            System.out.println("b");
            System.out.println("a");
            System.out.println("c");
        }

        int capacity = 20;
        int studentNumber = 25;

        if (capacity > studentNumber) {
            System.out.println("There is enough space in the classroom");
        }
        studentNumber++;
        System.out.println(studentNumber);

            /*
                    MONDAY (12.11) is a regular class, WEDNESDAY (12.13) is project

                    HOMEWORK:

INPUT weather ("sunny", "rainy", "cloudy")
INPUT timeOfDay ("morning", "afternoon", "evening")

IF weather is "sunny"
    IF timeOfDay is "morning"
        OUTPUT "Great time for a morning jog."
    ELSE IF timeOfDay is "afternoon"
        OUTPUT "Perfect for a picnic in the park."
    ELSE
        OUTPUT "Enjoy a beautiful sunset."
ELSE IF weather is "rainy"
    IF timeOfDay is "morning"
        OUTPUT "Good time for indoor yoga."
    ELSE IF timeOfDay is "afternoon"
        OUTPUT "How about visiting a museum?"
    ELSE
        OUTPUT "Relax with a book and some tea."
ELSE IF weather is "cloudy"
    IF timeOfDay is "morning"
        OUTPUT "Take a walk and enjoy the cool air."
    ELSE IF timeOfDay is "afternoon"
        OUTPUT "Visit a local café or a library."
    ELSE
        OUTPUT "A good evening for a movie at home."
ELSE
    OUTPUT "Invalid weather input"

             */
    }
}
