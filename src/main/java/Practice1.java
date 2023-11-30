public class Practice1 {
    public static void main(String[] args) {

        // ASSIGNMENT OPERATORS / COMPOUND ASSIGNMENT OPERATORS

        /*
                1. Simple assignment [=] -> int a = 5;
                2. Addition assignment [+=] -> a += 5; -> a = a + 5; -> a = 10;
                3. Subtraction assignment [-=] -> a -= 2; -> a = a - 2; -> a = 8;
                4. Multiplication assignment [*=] -> a *= 3; -> a = a * 3; a = 24;
                5. Division assignment [/=] -> a /= 3; -> a = a / 3; -> a = 8;
                6. Modulus assignment [%=] -> a %= 5; -> a = a % 5; -> a = 3
         */

        int a = 5;

        a += 5;
        System.out.println("a += 5 = " + a);

        a -= 2;
        System.out.println("a -= 2 = " + a);

        a *= 3;
        System.out.println("a *= 3 = " + a);

        a /= 3;
        System.out.println("a /= 3 = " + a);

        a %= 5;
        System.out.println("a %= 5 = " + a);


        //OPERATORS PRECEDENCE
        int result = 4 + 3 * 2 - 1 / 2 % 3;
        System.out.println(result);


        //NUMERIC PROMOTION
        short num1 = 1;
        int b = 2;
        int sum = num1 + b; // num1 is promoted to int

        byte myByte1 = 5;
        long myNum2 = 10L;
        long result1 = myByte1 + myNum2; // myByte1 is promoted to long

        byte myByte2 = 5;
        byte myByte3 = 3;
        int result2 = myByte2 + myByte3; // any arithmetic operation using short or byte or char will result in int

        short myShort1 = 6;
        short myShort2 = 7;
        int result3 = myShort1 + myShort2; // any arithmetic operation using short or byte or char will result in int

        // Any arithmetic operation using short or byte or char will result in int

        char letter1 = 'a'; // Java will take the value of 'a' from ASCII table
        short myShort3 = 5;
        int result4 = letter1 + myShort3; // 97 + 5
        System.out.println(result4);

        char letter2 = 'A'; // the value from ASCII table that's associated to 'A' is 65
        byte myByte4 = 3;
        System.out.println(letter2 + myByte4); // 68

        char letter3 = 'c'; // ASCII table value: 99
        char letter4 = 'R'; // ASCII table value: 82
        System.out.println(letter3 + letter4); // 181

        // double and float
        float myFloat1 = 2.5f;
        double myDouble1 = 5.0;
        double result5 = myFloat1 + myDouble1; // float myFloat1 is promoted to double

        // int and float
        int myInt1 = 2;
        float myFloat2 = 3.6f;
        float result6 = myInt1 + myFloat2; // int myInt1 is promoted to float

        // double and long
        double myDouble2 = 5.5;
        long myLong2 = 10L;
        double result7 = myDouble2 + myLong2; // long myLong2 is promoted to double

        // float and long
        float myFloat3 = 2.5f;
        long myLong3 = 10L;
        float result8 = myFloat3 + myLong3; // long myLong3 is promoted to float

        // int and double
        double myDouble4 = 2.5;
        int myInt4 = 2;
        System.out.println(myDouble4 + myInt4);


    }
}
