import java.util.Scanner;

public class StringBuilderPractice {
    public static void main(String[] args) {

        /*
                append()
         */

        // Declare and initialize an empty SB

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("abc");
        System.out.println(stringBuilder); // abc

        stringBuilder.append("-defg");
        System.out.println(stringBuilder); // abc-defg

        stringBuilder.append(5);
        System.out.println(stringBuilder); //

        stringBuilder.append(2.5);
        System.out.println(stringBuilder); //

        stringBuilder.append(true);
        System.out.println(stringBuilder); //


        // TASK

        /*
                1. Create a StringBuilder object with certain value
                2. Append any string
         */

        StringBuilder stringBuilder1 = new StringBuilder("Number: ");
        stringBuilder1.append("10");
        System.out.println(stringBuilder1);

        /*
                insert()
         */

        StringBuilder strb = new StringBuilder("I Java");
        strb.insert(2, "love ");
        System.out.println(strb);

        StringBuilder strb1 = new StringBuilder("I Java");
        strb1.insert(strb1.indexOf("J"), "love ");
        System.out.println(strb1);

        StringBuilder stringBuilder2 = new StringBuilder("3129995454"); //312-999-5454
        stringBuilder2.insert(3, "-"); //312-9995454
        stringBuilder2.insert(7, "-"); //312-999-5454
        System.out.println(stringBuilder2);

        /*
                Task:
                    1. We have a string: "GoodafternoonUnitedStates"
                    2. We need to convert this string to "Good afternoon, United States!"

                    ! Use StringBuilder and insert() method to convert.
         */

        StringBuilder stringBuilder3 = new StringBuilder("GoodafternoonUnitedStates");
        stringBuilder3
                .insert(stringBuilder3.indexOf("a"), " ")
                .insert(stringBuilder3.indexOf("U"), ", ")
                .insert(stringBuilder3.indexOf("S"), " ")
                .insert(stringBuilder3.length(), "!");

        System.out.println(stringBuilder3);

        /*
                delete()
         */

        StringBuilder stringBuilder4 = new StringBuilder("Hello World");
        stringBuilder4.delete(stringBuilder4.indexOf(" "), stringBuilder4.length());
        System.out.println(stringBuilder4); // Hello

        /*
                Task:
                StringBuilder stb1 = new StringBuilder("123456789");
                stb1.delete(3, 6);
                sout(stb1); // 12389, 1236789, 123789
         */

        StringBuilder stb1 = new StringBuilder("123456789");
        stb1.delete(3, 6);
        System.out.println(stb1);

        /*
                deleteCharAt(int index)
         */

        StringBuilder stringBuilder5 = new StringBuilder("ABCDE");
        stringBuilder5.deleteCharAt(2);
        System.out.println(stringBuilder5);

        StringBuilder stringBuilder6 = new StringBuilder("0123456");
        stringBuilder6.deleteCharAt(0).deleteCharAt(0).deleteCharAt(1);
        System.out.println(stringBuilder6); // 2456

        /*
                1. 123456.deleteCharAt(0)
                2. 23456.deleteCharAt(1)
                3. 2456
         */

        /*
                reverse()
         */

        StringBuilder stringBuilder7 = new StringBuilder("ABCDE");
        stringBuilder7.reverse();
        System.out.println(stringBuilder7);


        /*

                HOMEWORK:

                1. Ask a user to enter a sentence or word
                2. Store the value in StringBuilder
                3. Delete first half of the word or sentence
                4. Print out

                1. Ask a user to enter a sentence or word
                2. Delete the second half of the sentence or word
                3. Print out

                1. Ask a user to enter a sentence or word
                2. Print out the reversed version of it

                DO NOT SEND IT TO CLASS CHAT, SEND IT TO ME DIRECTLY!
         */

        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a word or sentence:");
        String str = scanner.nextLine();
        StringBuilder strb2 = new StringBuilder(str);
        strb2.delete(0, str.length() / 2);
        System.out.println(strb2);

        // "java" ----> find the length ----> length/2
        // "I love Java" ------> delete(0 , 10/2)

        System.out.println("Please enter a word or sentence:");
        StringBuilder strb3 = new StringBuilder();
        strb3.append(scanner.nextLine());

        // "java" ----> delete(int beginIndex, int endIndex) ---> beginIndex is inclusive and endIndex is exclusive
        // delete(length / 2, length - 1)

        // "java" ---> delete(4/2, 4) ---> delete(2, 4)

        strb3.delete(strb3.length() / 2, strb3.length());
        System.out.println(strb3);

        System.out.println("Please enter a word or sentence:");
        StringBuilder strb4 = new StringBuilder();
        String str4 = scanner.nextLine();
        strb4.append(str4);
        strb4.reverse();
        System.out.println(strb4);

        /*
                toString()
         */

        StringBuilder stringBuilder8 = new StringBuilder("Good evening!");
        String str3 = stringBuilder8.toString();
        System.out.println(str3);

        /*
                replace()
         */

        StringBuilder stringBuilder9 = new StringBuilder("JAVA"); //JGA
        stringBuilder9.replace(stringBuilder9.indexOf("A"), stringBuilder9.indexOf("V") + 1, "G");
        System.out.println(stringBuilder9);

        /*
                TASK:

                        1. "Encyclopedia"
                        2. Use replace() to convert it to "Wikipedia"
                        3. Print out the result
         */

        StringBuilder stringBuilder10 = new StringBuilder("Encyclopedia");
        stringBuilder10.replace(0, stringBuilder10.indexOf("p"), "Wiki");
        System.out.println(stringBuilder10);

        /*
                length()
         */

        StringBuilder stringBuilder11 = new StringBuilder("Chicago");
        System.out.println(stringBuilder11.length());

        StringBuilder stringBuilder12 = new StringBuilder("");
        System.out.println(stringBuilder12.length()); // 0

        /*
                capacity()
                * the default is 16
         */

        StringBuilder stringBuilder13 = new StringBuilder("JAVA");
        System.out.println(stringBuilder13.capacity());

        /*
                charAt(int index)
         */

        StringBuilder stringBuilder14 = new StringBuilder("Chicago");
        char letter = stringBuilder14.charAt(2);
        System.out.println(letter); // i


        /*
                substring(int beginIndex)
                substring(int beginIndex, int endIndex)
         */

        StringBuilder stringBuilder15 = new StringBuilder("chicago");
        String sub = stringBuilder15.substring(0, stringBuilder15.indexOf("c", 1));
        System.out.println(sub); // chi

        String sub1 = stringBuilder15.substring(stringBuilder15.indexOf("a")); // ago
        System.out.println(sub1);


        /*
                String - is immutable
                StringBuilder - is mutable, more efficient
                StringBuffer is slower in execution because it's synchronized
         */
    }
}
