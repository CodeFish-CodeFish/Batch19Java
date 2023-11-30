public class StringPractice {

    public static void main(String[] args) {

        // syntax: String var = "any word";

        // 1st way of creating a string
        String myString1 = "Hello, world!"; // the string is created in string pool

        System.out.println(myString1);

        String myString2 = "c"; // <--- string, string class
        char myChar1 = 'c'; // <--- primitive data type, character

        // 2nd way of creating a string
        String myString3 = new String("John Doe");  // string object in heap memory

        System.out.println(myString3);

        // TASK
        /*
                1. Create a string with your first name using 1st way of creating a string
                2. Create a string with your last name using 2nd way of creating a string
                3. Print them out.
         */

        String myFirstName = "Ulanbek";
        String myLastName = new String("Toktorov");

        System.out.println(myFirstName);
        System.out.println(myLastName);

        // String concatenation
        System.out.println(myFirstName + myLastName);
        System.out.println(myFirstName + " " + myLastName); // adding space in-between
        System.out.println("Ulan" + "Toktorov");
        System.out.println("Ulan " + "Toktorov"); // adding space in-between by having space at the end of the first string

        String longString = "jvdsuigrbuhgusihgushrughsughuhdghsjdgjshgdjhgj"; // super long string
        String emptyString = ""; // empty string
        System.out.println(emptyString);

        String emptySpace = " ";
        System.out.println(emptySpace);

        String word; // default value of variable 'word' is null
        //System.out.println(word);

        //1
        System.out.println(5 + 9); // 14
        System.out.println("5" + "9"); //59
        System.out.println("t" + "r"); // tr
        System.out.println("t" + "r" + 6); // tr6
        System.out.println(1 + 5 + "t" + "c"); // 6tc
        System.out.println("t" + "c" + 1 + 5); // tc15

        System.out.println("a" + 1 + "b" + 5); // a1b5


        // Task 2

        String number = "1";
        number += "2"; // addition assignment ---> number = number + "2" ----> number  = "1" + "2" ---> number = "12";
        number += 2; // number = number + 2; number = "12" + 2; number = 122;

        System.out.println(number);

        /*
                No compilation errors
         */

        String a = "Apple";
        a += "Apple";
        a += "Peach";
        a += 1;
        a += "Orange";

        System.out.println(a); // no spaces in between

        // No limitation in combining strings, meaning any number of strings can be combined.

        /*
                1. Create a class called "StringManipulations"
                2. Create 3 Strings for:
                        * Any random city
                        * Any random country
                        * Any random phone number (as a string)

                3. Find the area code for that city/country (+1 for US, +996 for KGZ, +380 for UK, +976 for Mongolia)

                4. Combine area code with the phone number you got on 2nd step, and print it out.
                5. Combine the city and the country and print it out.
         */
    }

}
