public class RelationalOperators {
    public static void main(String[] args) {

        // EQUALS TO (==)

        int a = 1;
        int b = 2;
        boolean booleanOne = (a == b); // the value is FALSE

        System.out.println(booleanOne);

        int currentYear = 2023;
        int birthYear = 1989;
        boolean booleanTwo = (currentYear == birthYear); // false
        System.out.println(booleanTwo);

        double temperatureToday = 45.5;
        double temperatureYesterday = 57.75;
        //boolean booleanThree = (temperatureToday == temperatureYesterday); // false
        System.out.println(temperatureToday == temperatureYesterday); // 45.5 == 57.75 => false

        char letter1 = 'a';
        char letter2 = 'a';
        System.out.println(letter1 == letter2); // true

        char letter3 = 'A';
        char letter4 = 'a';
        System.out.println(letter3 == letter4); // false

        float rate = 1.34f;
        float updatedRate = 1.345f;
        System.out.println(rate == updatedRate); // false, because 1.34 is not equal to 1.345

        long number = 45000L;
        long number1 = 45000L;
        System.out.println(number == number1); // false

        //Example 1
        int c = 1;
        System.out.println((c--) == (c++)); // 1 == 0 <---- false

        /*
                1. c-- ===> post-decrement ===> 1
                2. c++ ===> post-increment ===> 0
         */


        // Recap of increment and decrement

        /*
                Pre-increment - ++variable; the variable is incremented by 1 and then used in the expression
                Pre-decrement - --variable; the variable is decremented by 1 and then used in the expression
                Post-increment - variable++; the variable is used in the expression and then incremented by 1
                Post-decrement - variable--; the variable is used in the expression and decremented by 1
         */

        int age = 10;
        int age1 = ++age; // 11

        int score = 20;
        int score1 = score++; // 20
        int score2 = score; // 21

        int percentage = 75;
        int percentage1 = --percentage; // 74

        int temperature = 37;
        int tempYesterday = temperature--; // 37 --> post-decrementing first and then assigning to tempYesterday
        int tempTomorrow = temperature; // 36



        // EQUALS TO (==)

        // Used to compare two values and returns true/false based on comparison

        // byte
        byte byte1 = 5;
        byte byte2 = 4;

        boolean result = byte1 == byte2; // false

        byte byte3 = 5;
        boolean result1 = byte3 == byte1; // true

        // short
        short short1 = 15;
        short short2 = short1--;

        boolean result3 = short1 == short2; // true

        // int
        int int1 = 100;
        int int2 = --int1; // pre-decremented value is assigned to int2 ---> 99

        boolean result4 = int1 == int2; // false


        // double

        double pi = 3.1415;
        double double1 = 3.14151;

        boolean result5 = pi == double1; // false

        // float
        float float1 = 37.45f;
        float float2 = 38.15f;

        boolean result6 = float1 == float2; // false

        //char

        char letter5 = '1';
        char letter6 = 'a';

        boolean result7 = letter5 == letter6; // false

        int asciiValue = 97;
        char firstLetter = 'a';

        boolean result8 = asciiValue == firstLetter; // true


        //long

        long bigNumber = 12000000l;
        long anotherBigNumber = 120000l;

        boolean result9 = bigNumber == anotherBigNumber; // false


        System.out.println("-----NOT EQUALS TO-------");

        // NOT EQUALS TO (!=)
        // not equals to is used to find out if two values are not equal to each other

        int x = 5;
        int y = 10;

        System.out.println(x != y); // true, because two values are not equal

        double double2 = 49.99;
        double double3 = 39.99;

        System.out.println(double2 != double3); // true

        char myChar1 = 'a';
        char myChar2 = 'Z';

        boolean resultOne = myChar1 != myChar2; // true

        int ageJohn = 39;
        int ageJoe = 29;
        int agePaul = 40;

        boolean resultTwo = (agePaul - ageJohn--) != ageJoe;
        // the outcome in brackets is 1
        // 1 != 29 ====> true

        int score3 = 1;
        int score4 = --score3; // score4 = 0;
        boolean resultThree = score3 != score4; // true


        System.out.println("------GREATER THAN (>)-----");
        // GREATER THAN (>)

        int score6 = 2;
        int score7 = 3;

        System.out.println(score6 > score7); // 2 > 3 ==> false
        System.out.println(score6 > 100); // 2 > 100 ==> false

        double price1 = 19.99;
        double price2 = 10.99;

        System.out.println(price1 > price2); // true, 19.99 > 10.99
        System.out.println(price2 > price1); // false, 10.99 > 19.99

        char myLetter2 = 'a'; // 97
        char myLetter3 = 'b'; // 98
        System.out.println(myLetter2 > myLetter3); // 97 > 98 ---> false

        char myLetter4 = 'Z'; // 90
        char myLetter5 = 'c'; // 99
        System.out.println(myLetter5 > myLetter4); // 99 > 90 ---> true

        int myInt5 = 88;
        myInt5++; // post-increment
        // myInt5 = 89;
        char myLetter6 = 'Y'; // Y ---> 89 is ascii value of Y
        System.out.println(myLetter6 > myInt5); // 89 > 89


        // LESS THAN (<)
        System.out.println("------LESS THAN (>)-----");

        int myInt3 = 10;
        int myInt4 = 9;

        System.out.println(myInt3 < myInt4); // false, 10 < 9 would give us FALSE

        double price3 = 17.50;
        double price4 = 16.99;

        System.out.println(price3 < price4); // false

        System.out.println((price3 < price4) == false); // price3 is less than price4, and gives us FALSE
                                                        // false is equals to false ---> true

        char firstLetter1 = 'h'; // 104
        char secondLetter2 = 'P'; // 80
        System.out.println(firstLetter1 < secondLetter2); // 104 < 80 ---> FALSE

        System.out.println("------GREATER THAN OR EQUALS TO (>=)------");

        // GREATER THAN OR EQUALS TO (>=)
        // this is not a correct syntax =>

        int hoursWorked = 40;
        int hoursRequired = 40;
        System.out.println(hoursWorked >= hoursRequired); // true

        double balanceOfCheckingAccount = 10111.45;
        double balanceOfSavingsAccount = 5999.99;
        System.out.println(balanceOfCheckingAccount >= balanceOfSavingsAccount); // true

        char gradeStudentA = 'F'; // 70
        char gradeStudentB = 'A'; // 65
        System.out.println(gradeStudentA >= gradeStudentB); // 70 >= 65 ---> true
        System.out.println(gradeStudentB >= 65); // 65 >= 65 ----> true

        long distance1 = 34563l;
        long distance2 = 834750l;
        System.out.println(distance2 >= distance1); // 834750l >= 34563l ===> true

        System.out.println("--------LESS THAN OR EQUALS TO (<=)----------");


        // LESS THAN OR EQUALS TO (<=)

        int apples = 3;
        int oranges = 5;
        System.out.println(apples <= oranges); // true

        double heightTom = 5.6;
        double heightJerry = 6.0;
        System.out.println(heightTom <= heightJerry); // true, because 5.6 is less than 6.0

        char charZ = 'Z'; // 90
        char charY = 'Y'; // 89
        System.out.println(charY <= charZ); // 89 <= 90 // true


        /*
                1. Find out the prices of bitcoin in 2022 and 2023, compare them using ( >, <, ==, !=)
                    * print out the results
                2. Compare the last letter of your last name with the first letter of your first name using ( >, <, ==, !=)
                    * print out the results
         */

        double priceBitcoin2022 = 16498.40;
        double priceBitcoin2023 = 37813.90;

        System.out.println(priceBitcoin2022 > priceBitcoin2023); // false
        System.out.println(priceBitcoin2022 < priceBitcoin2023); // true
        System.out.println(priceBitcoin2022 == priceBitcoin2023); // false
        System.out.println(priceBitcoin2022 != priceBitcoin2023); // true

        System.out.println("-----------second part--------------");

        //( >, <, ==, !=)

        char firstLetterFirstName = 'U'; // 85
        char lastLetterLastName = 'v'; // 118

        System.out.println(firstLetterFirstName > lastLetterLastName); // 85 > 118 ---> false
        System.out.println(firstLetterFirstName < lastLetterLastName); // 85 < 118 ----> true
        System.out.println(firstLetterFirstName == lastLetterLastName); // 85 == 118 ----> false
        System.out.println(firstLetterFirstName != lastLetterLastName); // 85 != 118 ---> true


        System.out.println("----------UNARY OPERATORS-----------");

        // unary plus
        int myInteger1 = +15; // positive 15

        // unary minus
        int myInteger2 = -myInteger1; // minus 15 or negative 15
        System.out.println(myInteger2);

        // logical complement/negation
        boolean isCompleted = false;
        boolean isStarted = !isCompleted; // isStarted is true
        System.out.println(isStarted); // true

        System.out.println(!isStarted == !(!isCompleted));

        /*
                1. The last value of isStarted is TRUE
                2. !isStarted is FALSE
                3. !isCompleted is TRUE
                4. !TRUE is FALSE
                5. FALSE == FALSE ----> true
         */
        System.out.println("----------RECAP EXERCISE - logical Or -----------------");

        // RECAP EXERCISE - logical Or

        // Exercise 1
        boolean hasTicket = true;
        boolean hasVisa = false;

        boolean canTravel = hasTicket | hasVisa; // true
        System.out.println(canTravel);

        // Exercise 2
        boolean result2 = (true | false) | (false | false);
                /*
                        1. Evaluate the expression within parentheses
                        2. (true) | (false)
                        3. true
                 */
        System.out.println(result2); // true

        System.out.println("----------logical And -----------------");

    // LOGICAL AND [&]

        boolean hasReadPermission = true;
        boolean hasWritePermission = false;

        boolean hasFullAccess = hasReadPermission & hasWritePermission; // false

        System.out.println(hasFullAccess);

        boolean isProductInStock = true;
        boolean isProductDiscontinued = false;
        boolean isProductOutOfStock = false;

        System.out.println((isProductDiscontinued | isProductOutOfStock) & isProductInStock); // (false | false) & true
                                                                                                // false & true --> false

        boolean isWeatherSunny = true;
        boolean isAirQualityGood = true;
        boolean isSuitableForOutdoorEvent = false;

        System.out.println(isWeatherSunny & (isAirQualityGood | isSuitableForOutdoorEvent)); // true & (true | false) --> true & true ---> true

        System.out.println("------------SHORT-CIRCUIT OR (||)---------------");

    // SHORT-CIRCUIT OR (||)

        boolean isSunny = true;
        boolean isWindy = false;

        boolean goForWalk = isSunny || isWindy;
        System.out.println(goForWalk);

        /*
                1. It will evaluate first variable and if it's true, then the overall expression becomes true regardless of the second variable
                2. true || false ---> is our first var is true? yes.
                3. Overall expression becomes true
         */




        boolean isOfficeClosed = false;
        boolean isOfficeCold = true;

        boolean goToClass = isOfficeClosed || isOfficeCold;

        /*
                1. It will evaluate first variable and if it's true, then the overall expression becomes true regardless of the second variable.
                2. false || true ---> false or true ---> true
                3. Overall expression becomes true
         */


        boolean boolean1 = true;
        boolean boolean2 = false;
        boolean boolean3 = true;

        boolean myResult = boolean1 || (boolean2 || boolean3); // false || false || true ---> false || true ---> true
        System.out.println(myResult);



        // to debug ---> is to run your code manually step by step

        System.out.println("------------SHORT-CIRCUIT AND [&&]-------------");

        // SHORT-CIRCUIT AND [&&]

        boolean hasGoodCreditScore = true;
        boolean hasGoodIncome = true;
        System.out.println(hasGoodCreditScore && hasGoodIncome); // true && true ---> true

        boolean isEmergencyExitAccessible = false;
        boolean isFireEquipmentFunctional = true;
        boolean isEmergencyMedicalKitAvailable = false;
        System.out.println(isEmergencyExitAccessible && isFireEquipmentFunctional); // false && true ---> false

        System.out.println(isEmergencyExitAccessible && (isFireEquipmentFunctional & isEmergencyMedicalKitAvailable)); // false, false, false

        // false && false ----> false


        // single &, logical And
        System.out.println(true & false); // false
        // double &, short-circuit &&
        System.out.println(true && false); // false


        // TASK 1

        boolean a1 = true;
        boolean b1 = false;
        boolean c1 = true;

        boolean result11 = (a1 | b1) & (c1 || b1); // true, true, true, true 4:0
        System.out.println(result11); //

        /*
                1. a1 | b1 ---> true
                2. c1 || b1 ----> true
                3. true & true ---> true
         */

        //TASK 2
        boolean a2 = true;
        boolean b2 = false;
        boolean c3 = true;
        boolean d3 = false;

        boolean result12 = (a2 || b2) && (c3 | d3); //
        System.out.println(result12);

        /*
                1. a2 || b2 ---> true || false ---> true
                2. c3 | d3 ----> true | false ----> true
                3. true && true ---> true
         */

        // TASK 3

        boolean x1 = true;
        boolean y1 = false;
        boolean z1 = true;

        boolean result13 = x1 && y1 || z1 && !y1;
        System.out.println(result13); // true (4 votes)

        // NOTE: ! (logical NOT) will be a priority in execution.

        /*
                   1. !y1 ---> true
                   2. x1 && y1 ----> false
                   3. z1 && !y1 ---> true && true ---> true
                   4. false || true ---> true
         */











    }
}
