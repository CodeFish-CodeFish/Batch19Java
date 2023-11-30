import java.util.Scanner;

public class HomeworkScannerAndString {
    public static void main(String[] args) {

        /*
                1. User's first and last name
                 - scanner ---> next() --> reads the user input until the very first space (i.e a single word)
                 - nextLine() ---> reads the entire line (up until the user presses enter)

                2. 2 variables
                    - String firstName ---> sores user's first name input
                    - String lastName ---> store user's last name input

                3. sout(firstName + lastName); or String fullName = firstName + lastName; sout(fullName);
         */

        // instantiate --- create an instance or object of any class.
        // we will be instantiating the object of Scanner class

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your first name: ");
        String firstName = scanner.next();

        System.out.println("Please enter your last name: ");
        String lastName = scanner.next();

        System.out.println("User's full name: " + firstName + " " + lastName);

        /*
                1. sout("Please enter your age: ");
                 - scanner.nextLine();
                2. byte age ---> store the user's age
                3. sout("User's age is: " + age);
         */

        System.out.println("Please enter your age: ");
        byte age = scanner.nextByte();
        System.out.println("User's age is: " + age);

        /*
                1. sout("Please enter your home country: ");
                 - scanner.nextLine(); \n
                2. String homeCountry = scanner.nextLine();
                3. sout("User's home country is: " + homeCountry);
         */

        System.out.println("Please enter your home country: ");
        scanner.nextLine(); // consume the new line \n
        String homeCountry = scanner.nextLine();
        System.out.println("User's home country is: " + homeCountry);

        /*
                1. sout("Enter the author's name: ");
                 - scanner.nextLine(); <--- as a rule when you have a message before scanner.nextLine()
                2. String author = scanner.nextLine();
                3. sout("Enter the phrase: ");
                 - scanner.nextLine();
                4. String phrase = scanner.nextLine();
                5. sout(phrase + ", " + author);
         */

        // "java" + numerical ----> \n

        System.out.println("Enter the author's name: ");

        String author = scanner.nextLine();
        System.out.println("Enter the phrase: ");

        String phrase = scanner.nextLine();
        System.out.println(phrase + ", " + author);
    }
}
