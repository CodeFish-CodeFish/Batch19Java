package mentoring;

import java.util.Scanner;

public class StringMethodsHM {
    public static void main(String[] args) {
        /*
        1.Print the first char of a given song name
        2.Print the last char of a given song name
        3.Print the length of given song name
        4.Print the index of 'k' in this song name
        5.Print the char from an index number of 3
        6.Print the song name in upper case
        7.Print the song name in lower case
          songname=Mockingbird

         */
        Scanner scanner=new Scanner(System.in);
        System.out.println("please enter song name");
        String songName=scanner.nextLine();
        System.out.println(songName.charAt(0));
        System.out.println(songName.charAt(songName.length()-1));
        System.out.println(songName.length());
        System.out.println(songName.indexOf("k"));
        System.out.println(songName.charAt(3));
        System.out.println(songName.toUpperCase());
        System.out.println(songName.toLowerCase());

    }
}
