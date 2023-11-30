public class CastingPractice {
    public static void main(String[] args) {

        /*
        CASTING:
         1. Implicit casting (widening conversion) - up-casting (automatic)
         2. Explicit casting (narrowing conversion) - down-casting

         CASTING is the process of converting a value from one data type to another
         */

        // Implicit casting
        int a = 100;
        long b = a; // implicit casting is happening (int to long)

        float c = 2.5f;
        double d = c; // implicit casting is happening (float to double)

        // Explicit casting
        long e = 100L;
        int f = (int) e; // explicit casting is happening (long to int)

        double myDouble = 12.5;
        float myFloat = (float) myDouble; // explicit casting is happening (double to float)

        int myInt = (int) myDouble; // explicit casting is happening (double to int)
        System.out.println(myInt);

        //char to int
        char letter = 'a';
        int value = letter;
        System.out.println(value);

        // int to char
        int value1 = 99;
        char letter1 = (char) value1;
        System.out.println(letter1);


    }
}
