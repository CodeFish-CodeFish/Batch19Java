import java.util.Scanner;

public class HomeWorkStringBuilder {
    public static void main(String[] args) {

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

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a sentence or word  to delete the 2nd half: ");
        String str = scanner.nextLine();

        StringBuilder strb = new StringBuilder(str);
        strb.delete(str.length() / 2, str.length());
        System.out.println(strb);

        System.out.println("Please enter another sentence or word to delete the 1st half: ");
        String str1 = scanner.nextLine();
        StringBuilder strb1 = new StringBuilder(str1);
        strb1.delete(0, str1.length() / 2);
        System.out.println(strb1);

        System.out.println("Please enter another sentence or word to reverse: ");
        String str2 = scanner.nextLine();
        StringBuilder strb2 = new StringBuilder(str2);
        strb2.reverse();
        System.out.println(strb2);
    }
}
