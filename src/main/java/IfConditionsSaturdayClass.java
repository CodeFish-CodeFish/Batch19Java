import java.util.Scanner;

public class IfConditionsSaturdayClass {
    public static void main(String[] args) {

        /*
                TASK:

                - you need to calculate the shipping cost based on the weight and distance
                - the base cost of product is 5 if the weight is less than 5 kilos
                - the base cost is 10, if the weight is less than 20 kilos but greater than 5
                - the base cost is 15, if weight is more than 20 kilos
                - ask for weight (int) and shipping distance (int)
                    - if distance is greater than 500 kms - add 5$, otherwise free shipping
                - print out the total cost
         */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the weight of the product:");
        int weight = scanner.nextInt();

        System.out.println("Enter the distance:");
        int distance = scanner.nextInt();

        // store the total cost
        int totalCost = 0;

        // weight related checks
        if (weight <= 5) {
            totalCost = 5;
        } else if (weight > 5 && weight <= 20) {
            totalCost = 10;
        } else if (weight > 20) {
            totalCost = 15;
        } else {
            System.out.println("Invalid user input.");
        }

        // distance related check

        /*
                1. distance should be greater than 0.
                2. distance is greater than 500.

                Nested if-else
         */

        // KEEP IT SIMPLE [KISS RULE]

        if (distance <= 0) {
            System.out.println("Invalid distance input.");
        } else {
            if (distance >= 500) {
                totalCost += 5;
            }
        }

        System.out.println("Total shipping cost is: " + totalCost);

    }
}
