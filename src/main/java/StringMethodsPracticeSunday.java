import java.util.Arrays;

public class StringMethodsPracticeSunday {
    public static void main(String[] args) {
        /*
                String methods covered in previous classes:

                1. toLowerCase() -- converts the string to lowercase
                2. toUpperCase() -- converts the string to uppercase
                3. startsWith() -- checks if the string starts with specified prefix (beginning)
                4. endsWith() -- checks if the string ends with specified suffix (ending)
                5. equals() -- compares two strings
                6. equalsIgnoreCase() -- compares two string ignoring the case ( upper or lower )
                7. trim() -- cuts or drops or truncates the trailing and leading whitespaces
                8. replace() -- it works on all occurrences of the specified char or string
                9. replaceFirst() -- it replaces only the first occurrence
                10. split() -- splits the string based on specified delimiter/regex [returns array of strings]
                11. isEmpty() -- checks only "" (empty string)
                12. isBlank() -- checks if string is empty or whitespace ( "" or " " )

         */

        String word = "united states of america";

        String[] words = word.split(" "); // 4 strings, "united", "states", "of", "america"
        String[] words1 = word.split("i"); // 3 strings, "un", "ted states of amer", "ca"

        System.out.println(Arrays.toString(words));
        System.out.println(Arrays.toString(words1));


        /*
                toCharArray();
         */

        char[] letters = "java".toCharArray();
        System.out.println(Arrays.toString(letters));

        // Task:

        /*
                1. Declare and initialize any string (country name)
                2. Use toCharArray() and get all the letters of the string
                3. Print it out
         */

        String country = "Kyrgyzstan";
        char[] lettersOfCountry = country.toCharArray();
        System.out.println(Arrays.toString(lettersOfCountry));

        /*
                compareTo()
         */

        String fruit1 = "Banana";
        String fruit2 = "Apple";
        int result = fruit1.compareTo(fruit2);
        System.out.println(result);

        String berry1 = "Strawberry";
        String berry2 = "Blackberry";
        System.out.println(berry1.compareTo(berry2));

        String state1 = "Illinois";
        String state2 = "Illinois";
        System.out.println(state1.compareTo(state2));

        String country1 = "Algeria";
        String country2 = "Chili";
        System.out.println(country1.compareTo(country2));

        /*
                TASK:
                    1. Declare and initialize two strings (two random cities)
                    2. Get characters for both of the cities (use toCharArray())
                    3. Print out the characters for both of the cities
                    4. Compare 1st city with the 2nd city (compare cities as a string)
                    5. Print out compareTo() result
         */

        String city1 = "Vienna";
        String city2 = "London";

        // char[] arr = city1.toCharArray();
        // sout(Arrays.toString(arr));
        System.out.println(Arrays.toString(city1.toCharArray()));
        System.out.println(Arrays.toString(city2.toCharArray()));

        System.out.println(city1.compareTo(city2)); // positive number


        /*
                compareToIgnoreCase()
         */

        String word1 = "America";
        String word2 = "barcelona";

        int result1 = word1.compareToIgnoreCase(word2); // -1
        System.out.println(result1);

        int result2 = word1.compareTo(word2); // -33
        System.out.println(result2);

        String continent1 = "Europe";
        String continent2 = "africa";
        System.out.println(continent1.compareToIgnoreCase(continent2)); // 4


        String success = "hustling";
        System.out.println(success.indexOf("u")); // 1
        System.out.println(success.indexOf("in")); // 5
        System.out.println(success.indexOf("t", 3)); // 3
        System.out.println(success.indexOf("u", 4));

        System.out.println("-------------------");
        String success1 = "doingwhateverittakes";
        success1 = success1.toUpperCase();
        System.out.println(success1);

        System.out.println("--------------------");

        String word3 = "JAVA";
        word3 = word3.toLowerCase(); // "java"
        System.out.println(word3);

        String newWord = word3; // I have assigned the value of word3 to newWord
        newWord = "abc"; // I have assigned a new value to newWord
        newWord = newWord.toUpperCase(); // ABC, I have re-assigned an upper-cased value to newWord
        System.out.println(newWord); // ABC

        System.out.println(word3);

        /*
                Remove whitespaces in-between - "united      states"

                1. We can use split()
                2. Combine split strings resulted after the split() method

                1. We can use substring()
                2. Combine two substrings

         */

        // 1st way of solving this problem
        String word4 = "united      states"; // 6 spaces in-between
        String[] words2 = word4.split("      "); // "united", "states"
        System.out.println(words2[0] + " " + words2[1]);

        // 2nd way of solving this problem
        String substring1 = word4.substring(0, 6); // "united"
        String substring2 = word4.substring(word4.indexOf('s')); // "states"
        System.out.println(substring1 + " " + substring2);
    }
}
