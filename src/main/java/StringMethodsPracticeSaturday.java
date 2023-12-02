import java.util.Arrays;
import java.util.Scanner;

public class StringMethodsPracticeSaturday {
    public static void main(String[] args) {

        /*
                1. Take the input from user as a string (any word) ( use next() )
                2. Take the input from user as a character ( use next() )
                3. Check if the word contains the char ( contains() )
                4. Print out the boolean

         */

        // using next()

        /*
        Scanner scanner = new Scanner(System.in); // instantiated an object of Scanner
        System.out.println("Please enter a word: ");
        String word = scanner.next(); // read the word and store in word variable
        System.out.println("Please enter a character: ");
        String character = scanner.next();
        System.out.println("Result: " + word.contains(character)); // printing out the result if the given word contains the entered character
        */

        // using nextInt()

        /*
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a word: ");
        String word = scanner.next(); // read the word and store in word variable
        System.out.println("Please enter the ASCII value of your character: ");
        int asciiValue = scanner.nextInt(); // user would input the ASCII value of the character
        char character = (char) asciiValue; // casting an integer to character based on ASCII table values
        System.out.println("Result is: " + word.contains(character + "")); // prints out the result of whether word contains a given character


         */
        // d is 100 in ascii table ---> result should be true

        // edge case is rare case (in testing terminology)



        /*
                String methods:
                1) length() - return a size of our string
                2) charAt(int index) - return a character at given index
                3) indexOf(char character) - return an index of the character
                4) concat(String str) - return a new concatenated string (2 strings combined)
                5) substring(int beginIndex, int endIndex) - beginIndex is inclusive, endIndex is exclusive - return a part of the string
                6) contains(String str) - return a boolean representation of whether the givens string contains a given char sequence (string param)
         */


        /*
                toLowerCase()
         */

        String str = "ChIcAgO";
        String lowerCasedWord = str.toLowerCase(); // chicago
        System.out.println(lowerCasedWord);

        /*
        String str1 = null; // default value of any string
        System.out.println(str1.toLowerCase()); // NullPointerException
        */


        //Task

        /*
                1. Get the word or sentence from user (upper-cased word/sentence)
                2. Convert it to lower case and print out
         */

        /*
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a word or sentence that contains an upper-cased letter.");
        String str2 = scanner.nextLine();
        System.out.println("Lower-cased word or sentence is: " + str2.toLowerCase()); */


        /*
                toUpperCase();
         */

        String str3 = "hello, world!";
        System.out.println(str3.toUpperCase()); // HELLO, WORLD!


        /*
                startsWith();
         */

        String str4 = "Planet Earth!";
        System.out.println(str4.startsWith("Plan")); // true
        System.out.println(str4.startsWith("Mars")); // false


        // Task

        /*
                1. Ask for user input: any word/sentence
                2. Convert the word/sentence to all caps (upper case)
                3. Ask a user to input any 2 letters (for example: "ab" or "he" or etc.)
                4. Check whether the word/sentence starts with those 2 letters (startsWith())
         */

        /*
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a word or sentence:");
        String str5 = scanner.nextLine();
        System.out.println("Upper-cased word or sentence: " + str5.toUpperCase());
        System.out.println("Please input any 2 letters:");
        String twoLetters = scanner.next();
        System.out.println("Result is: " + str5.startsWith(twoLetters));

*/
        /*
                endsWith();
         */

        String str6 = "Canada";
        boolean ends = str6.endsWith("ada");
        System.out.println("The word " + str6 + " ends with ada: " + ends); // true
        System.out.println("The word " + str6 + " ends with xyz: " + str6.endsWith("xyz")); // false

        // Task:

        /*
                1. Ask user to enter all upper-cased sentence ( for example: HELLO, WORLD! )
                2. Convert the sentence to lower-cased sentence
                3. Ask user for any word (for example: "hello", "abc" or "qwerty", or any other word)
                4. Check whether the sentence ends with that word, and print out the result
         */
    /*
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter all upper-cased sentence:");
        String sentence = scanner.nextLine();
        System.out.println("All lower-cased sentence is: " + sentence.toLowerCase());
        System.out.println("Please enter any word:");
        String word = scanner.next(); // read a single word
        System.out.println("Your sentence ends with the word: " + word + ": " + sentence.endsWith(word));

     */
        /*
                equals();
         */

        String str7 = "America";
        String str8 = "america";

        System.out.println(str7.equals(str8)); // false since first string has 'A', and second - 'a'

        //String str9 = null;
        //System.out.println(str9.equals("abc")); // NULL POINTER EXCEPTION

        boolean result = "a".equals("b");
        System.out.println(result); // false

        /*
                equalsIgnoreCase();
         */

        String word1 = "Elephant";
        String word2 = "ELEPHANT";

        System.out.println("Comparing " + word1 + " with " + word2 + " using equalsIgnoreCase and result is: " + word1.equalsIgnoreCase(word2)); // true

        String word3 = "elEPHaNt";

        System.out.println(word1.equalsIgnoreCase(word3));

        System.out.println("-------------replace()---------------");

        /*
                replace()
         */

        String word4 = "Hello!";
        System.out.println(word4.replace('l', 'p'));

        /*
                TASK:
                1. Ask the user to enter a word or sentence.
                2. Ask a user to enter an old character ( use next() method)
                3. Ask a user to enter a new character ( use next() method)
                4. Print out the new word or sentence by replacing the old char with new char
         */

        /*
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a word or sentence: ");
        String wordOrSentence = scanner.nextLine();
        System.out.println("Please the character that you wish to replace: ");
        String oldChar = scanner.next();
        System.out.println("Please the new character that you wish the old character to replace with: ");
        String newChar = scanner.next();

        // replace(String oldString, String newString);
        System.out.println("Your new word or sentence is: " + wordOrSentence.replace(oldChar, newChar));

*/

        /*
                replacing words using replace(String oldStr, String newStr);
         */

        String sentence1 = "Good morning, world! Welcome to world!";
        System.out.println(sentence1.replace("world", "USA"));


        /*
                replaceFirst(String oldStr, String newStr)
         */

        String word = "Good";
        System.out.println(word.replaceFirst("o", "O")); // GOod

        String sentence = "Good morning, class! Have a good day!";
        System.out.println(sentence.replaceFirst("oo", "OO"));


        /*
                isEmpty()
         */

        String notEmptyString = "abc";
        System.out.println(notEmptyString.isEmpty()); // false

        String emptyStr = "";
        System.out.println(emptyStr.isEmpty()); // true

        String spaceStr = " ";
        System.out.println(spaceStr.isEmpty()); // false, because space " " is not an empty value, it is a character

        /*
                trim()
         */

        String wordWithWhiteSpaces = "  java      ";
        System.out.println(wordWithWhiteSpaces.trim()); //java with no leading and trailing whitespaces

        /*
                isBlank()
         */

        String str1 = "";
        String emptyWhiteSpace = " ";

        System.out.println(str1.isBlank()); // true
        System.out.println(emptyWhiteSpace.isBlank()); // true

        /*
                split()
         */

        String phrase = "Hasta la vista baby";
        String[] words = phrase.split("la");
        System.out.println(Arrays.toString(words));

        String[] letters = phrase.split("");
        System.out.println(Arrays.toString(letters));

        String[] words1 = phrase.split("vista");
        System.out.println(Arrays.toString(words1));








    }
}
