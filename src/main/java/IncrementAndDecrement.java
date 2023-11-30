public class IncrementAndDecrement {
    public static void main(String[] args) {

        // Increment
        // Increment is used when the value is supposed to be increased by one

        // variable++   <---- syntax of increment [post-increment]

        // post-increment
        int a = 1;
        a++; // is equivalent to a = a + 1; --> a = 1 + 1; ---> 2
        System.out.println(a);

        int c = 5;
        c++;
        System.out.println(c);

        // post-decrement
        int b = 2;
        b--; // is equivalent to b = b - 1; ---> b = 2 - 1; ---> 1
        System.out.println(b);

        int d = 10;
        d--;
        System.out.println(d);




        // POST-INCREMENT - the value of the variable is used in expression first, and then the variable is getting increased (incremented by 1)

        /*
                int a = 2;
                System.out.println(a++);
         */

        int number = 2; // initial value
        System.out.println(number++); // it will print the number (2) and then it'll increase the value by 1
        System.out.println(number); // number is already increased by one, so it'll print out 3

        int score = 95;
        System.out.println(score++); // prints out 95, and then it's increased by 1 --> score = 96
        System.out.println(score); // prints out 96
        System.out.println(score++); // prints out 96, and then it's increased by 1 --> score = 97
        System.out.println(score); // prints out 97

        int age = 67;
        System.out.println(age++); // prints out 67 first, and then increased by 1, making it 68
        System.out.println(age); // 68
        System.out.println(age++); // prints out 68, then it's increased by 1, making it 69


        int e = 2;
        e++; // e is increased by 1
        System.out.println(e); // 3


        int ee = 2;
        System.out.println(ee++); // ee is printed as 2, and increased by 1 afterwards



        int temp = 75;
        temp++; // 76
        temp++; // 77
        System.out.println(temp); // 77
        System.out.println(temp++); // 77, and the value is increased by 1, making it 78
        System.out.println(temp); // 78



        // POST-DECREMENT - the value of the variable is used in expression first, and then the variable is getting decreased (incremented by 1)

        /*
                int a = 2;
                System.out.println(a--); // 2, but the value is decreased by 1, making it 1
         */

        //variable--   <--syntax of post-decrement

        System.out.println("_______________");
        int myNumber = 5;
        myNumber--; // myNumber is getting decreased by 1, making it 4
        System.out.println(myNumber); // 4

        int myNumber1 = 99;
        System.out.println(myNumber1--); // 99, the value of myNumber1 is printed out, and then decreased by 1

        int score1 = 85;
        score1--; // the value of score1 is decreased by 1 --> 84
        score1--; // the value of score1 is decreased by 1 ---> 83
        System.out.println(score1--); // 83, and then the value is getting decreased by 1, making it 82
        System.out.println(score1); // 82


        System.out.println("-----PRACTICE TASK------");

        int g = 1; // initial value is 1
        System.out.println(g--); // prints out 1, and then decreases the value by 1, making it 0
        g++; // 1
        g--; // 0
        System.out.println(g--); // prints out 0, and then value is getting decreased by 1, making it -1
        g++; // the value is increased by 1, making it 0
        System.out.println(g); // 0
        System.out.println(g-- + g++); // -1 + 0 = -1 ---> g-- + g++ ---> (-1) + (0) = -1
        System.out.println(g); // 0










        // 1. Write first and last name [Ulanbek Toktorov]
        // 2. Get first 3 letters of your first name and last name [ for ex: ULA, TOK ]
        // 3. Cast the letters [int a = (int) 'U' ]
        // 4. Print out the int values

        System.out.println("-------HOMEWORK-----------");

        // 1. Ulanbek Toktorov

        // 2. First 3 letters of first and last names

        char firstLetterFirstName = 'U';
        char secondLetterFirstName = 'l';
        char thirdLetterFirstName = 'a';

        char firstLetterLastName = 'T';
        char secondLetterLastName = 'o';
        char thirdLetterLastName = 'k';

        // 3. Casting: char to int

        int firstFN = firstLetterFirstName; // the casting of char to int happens implicitly // 85
        int secondFN = (int) secondLetterFirstName; // 108
        int thirdFN = (int) thirdLetterFirstName; // 97

        int firstLN = (int) firstLetterLastName; // 84
        int secondLN = (int) secondLetterLastName; // 111
        int thirdLN = (int) thirdLetterLastName; // 107

        // 4.

        System.out.println(firstFN);
        System.out.println(secondFN);
        System.out.println(thirdFN);

        System.out.println("-----------");

        System.out.println(firstLN);
        System.out.println(secondLN);
        System.out.println(thirdLN);







        int score2 = 100;
        int score3 = score2++; // the value of score2 is assigned to score3 and getting increased by 1 afterwards
        int score4 = score2; // 101, the value of score4 is 101

        int total = 88;
        total++; // total = total + 1 ----> total = 89
        int newTotal = total; // 89
        System.out.println(newTotal);


        // PRE-INCREMENT

        int x = 1;
        int y = ++x; // 2, 'x' is pre-incremented first and then assigned to 'y'
        System.out.println(y);

        int z = 99;
        ++z; // the value of 'z' is pre-incremented by 1 first
        int v = z; // 100, the value of 'z' is getting assigned to 'v'
        System.out.println(v);

        System.out.println("--------------");

        int k = 99;
        k++; // post-incremented by 1 ===> k = 100;
        k--; // post-decremented by 1 ===> k = 99;
        ++k; // pre-incremented by 1 ===> k = 100;
        System.out.println(k); // 100
        k--; // post-decremented by 1 ===> k = 99;
        ++k; // pre-incremented by 1 ===> k = 100;
        System.out.println(++k); // pre-incremented by 1, 101


        System.out.println("-----------");

        int j = 100;
        System.out.println(j++); // 100 // post-increment ===> prints out the value first, and then incremented ==> prints out 100, j = 101;
        System.out.println(++j); // 102 // pre-increment ===> the value of j is incremented (102), and then it's printing out 102, j = 102;
        j++; // post-increment ===> j = 103;
        System.out.println(j); // 103 // prints out 103, j = 103;
        j--; // post-decrement ===> j = 102;
        System.out.println(++j); // 103 // pre-increment ===> j = 103; then it's going to print out 103;
        j++; // post-increment ===> j = 104;
        System.out.println(j++); // 104 // post-increment ===> prints out the value of j and then increments by 1




        // PRE-DECREMENT

        //syntax: --variable;

        int score5 = 75;
        int score6 = --score5; // the value of score5 is decreased by 1 and then assigned to score6; ===> score6 = 74;
        System.out.println(score6); // 74

        int age1 = 25;
        System.out.println(--age1); // 24, the value of age1 is pre-decremented first, and then used in expression (printed out)

        int counter = 3;
        --counter; // pre-decrement ==> counter = counter - 1; ===> counter = 2;
        --counter; // pre-decrement ==> counter = counter - 1; ===> counter = 1
        System.out.println(counter); // 1

        System.out.println("--------------");

        int counter1 = 3;
        System.out.println(--counter1); // 2 // pre-decremented first; counter1 = counter1 - 1; counter1 = 2;
        System.out.println(--counter1); // 1 // pre-decremented first; counter1 = counter1 - 1; counter1 = 1;
        System.out.println(counter1); // 1

        System.out.println("---------------");

        // Example 1
        int aa = 5;
        int bb = 3 + --aa; //  3 + (4) = 7
        System.out.println(bb); // 7

        System.out.println("----------------");

        // Example 2
        int aaa = 5; // aaa is 5
        int bbb = 3 + aaa--; // bbb = 3 + (5) ---> bbb = 8; -----> aaa = 4;
        System.out.println(bbb); // 8; aaa = 4;
        System.out.println(aaa); // 4; bbb = 8;

        System.out.println("--------------------");

        // Example 3
        int m = 10; // m is 10;
        int n = --m + m--; // 1. --m is evaluated first ---> m is pre-decremented ---> m = 9;
                           // 2. m-- is evaluated secondly ---> m is post-decremented ---> last value of m is still 9; m = 8;
                           // 3. 9 + 9 = 18
        System.out.println(m); // 8
        System.out.println(n); // 18

        System.out.println("----------------------");

        // Example 4
        int f = 2;
        System.out.println(--f + f++ - --f + f);

        int firstExpression = --f; // pre-decrement of f; firstExpression = 1; f = 1;
        int secondExpression = f++; // post-increment of f; secondExpression = 1; f = 2;
        int thirdExpression = --f; // pre-decrement of f; thirdExpression = 1; f = 1;
        int fourthExpression = f; // simple assignment; fourthExpression = 1;

        int result = firstExpression + secondExpression - thirdExpression + fourthExpression;
            // 1 + 1 - 1 + 1  = 2



        // 1 + 1 - 1
        /*
            1. f = 1;
            2. 1 + 1; f = 2;
            3. 2 - 1; f = 1;
            4. 1 + 1; f = 1

            the result is 2


         */


        /*
                1. From left to right
                2. --f => pre-decrement of 'f' => f = 1; result = 1
                3. We are adding the outcome of the expression f++ => f is post-incremented => 1 + 1; f = 1; result = 2; f =
                4.
         */


    }
}
