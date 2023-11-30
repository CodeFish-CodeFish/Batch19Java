public class StringPracticeTuesday {
    public static void main(String[] args) {
        // String is a class
        // Like any other class, String can have multiple methods

        // 1) length()
        String word = "JAVA";
        int length = word.length(); // this method will give us the number of characters in the given string
        System.out.println(length); // 4

        // 2) charAt()

        // LENGTH vs INDEX

        // length is the total number of characters in string
        // index is the position of the character in the string

        // chicago - the length is 7
        // chicago has 7 indexes [ c - 0, h - 1, i - 2, c - 3... o - 6 ]

        // java - length is 4
        // the index of 'j' is 0, a - 1, v - 2, a - 3

        // USA - length is 3
        // index of 'U' is 0, 'S' - 1, 'A' - 2

        // String word = 'java'; // j - 0, a-1
        // char letter = word.charAt(1); // a

        String word1 = "planet";
        char letter = word1.charAt(1);
        System.out.println(letter); // l
        System.out.println(word1.charAt(4));

        // TASK
        /*  "encyclopedia"
                1) 'd' by using charAt();
                2) 'i' using charAt();
        */

        String word3 = "encyclopedia";
        char letterD = word3.charAt(9);
        System.out.println(letterD);
        char letterI = word3.charAt(10);
        System.out.println(letterI);

        /*
                If we pass the range of indexes when using charAt(),
                we will be getting StringIndexOutOfBoundsException
         */

        String word4 = "America";
        int lastIndex = word4.length() - 1; // will give you the last index of the word [6]
        char letterA = word4.charAt(word4.length() - 1);
        System.out.println(letterA);

        // 3) contains("<string>")

        // "java" contains "v" --> true
        // "java" contains "c" ---> false

        String word5 = "europe";
        boolean containsRope = word5.contains("rope");
        System.out.println(containsRope);

        boolean containsSpace = word5.contains("a");
        System.out.println(containsSpace);

        String sentence = "Hello, World!";
        System.out.println(sentence.contains("World! ")); // false as we have appended an empty space

        /*
                HOMEWORK:
                    1) To use Scanner to get user's first and last names
                    2) print out the full name by combining first and last names

                    3) Get user's age as a byte
                    4) Print out as "User's age is: <age>"

                    5) Get user's home country as a string
                    6) print out as "User's home country is: <country>"

                    7) Get a famous person's phrase
                    8) Get a famous person's name
                    9) Print out "phrase and author's name"

               For example:     "Hakuna matata, Pumba from Lion King"

         */


        System.out.println("SECOND DAY OF STRING METHODS.");

        // concat() - is used to concatenate two strings

        String word2 = "Hello";
        String word6 = " World!";

        String concatenatedString = word2.concat(word6);
        System.out.println(concatenatedString);

        String programmingLanguage = "Java";
        String levelOfDifficulty = "Easy";

        // Java is Easy!
        String finalVersion = programmingLanguage.concat(" ").concat("is").concat(" ").concat(levelOfDifficulty).concat("!");
        System.out.println(finalVersion);


        // indexOf()
        System.out.println("Index of practice");
        String myWord = "java";
        int index = myWord.indexOf('j');
        System.out.println("Index of j is: " + index);

        int indexOfv = myWord.indexOf('v'); // 2

        int indexOfA = myWord.indexOf('A'); // index of non-existing char within your string will result in -1
        System.out.println(indexOfA);

        // substring(int beginningIndex, int endingIndex)

        String myWord1 = "America";
        String newString = myWord1.substring(3, 6); // the index of r is 3, and index we pass as a ending index is 6 because it is exclusive
        System.out.println(newString);

        //ica
        String newString1 = myWord1.substring(4);
        System.out.println(newString1);


        // TASK:
        // "encyclopedia" --> using the substring, take the "cyclo" part using the substring() method and print it out

        // 1st way
        String word7 = "encyclopedia";
        String myWord2 = word7.substring(2, 7);
        System.out.println(myWord2); // cyclo

        // 2nd way
        // indexOf(char letter)
        String myWord3 = word7.substring(word7.indexOf('c'), word7.indexOf('p'));
        // 2                    // 7
        //word7.substring(2, 7);
        System.out.println(myWord3);


        // Task:
        // "United States of America"
        // Print out "States" using substring()
        // Print out "America" using substring()

        // 1st solution

        String country = "States of America";
        String states = country.substring(country.indexOf('S'), 14); // indexOf()
        System.out.println(states);
        String america = country.substring(country.indexOf('A'));
        System.out.println(america);


        //2nd solution

        // indexOf() ---> indexOf('')
        // indexOf(char letter, int startingIndex) ---->

        /*String java = "java";
        int index1 = java.indexOf('a'); // 1
        int index2 = java.indexOf('a', 2); // 3

        System.out.println(index1);
        System.out.println(index2);
*/

        String states1 = country.substring(country.indexOf('S'), country.indexOf(' ', 7));

        /*
                1. substring(beginning index, ending index);
                2. beginning index is the result of "country.indexOf('S')" ---> 7
                3. ending index is the result of "country.indexOf(' ', 7)" ----> 14
                4. substring(7, 14) ----> States
         */


        System.out.println("Using index of: " + states1);


        /*
                1. Take the input from user as a string (any word) ( use next() )
                2. Take the inout from user as a character ( use next() )
                3. Check if the word contains the char ( contains() )
                4. Print out the boolean

         */


    }
}
