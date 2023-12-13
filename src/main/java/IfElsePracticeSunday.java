import java.util.Scanner;

public class IfElsePracticeSunday {
    public static void main(String[] args) {

        //HOMEWORK REVIEW:

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input the weather (sunny, rainy, cloudy):");
        String weather = scanner.next();

        System.out.println("Please input the time of the day (morning, afternoon, evening):");
        String timeOfDay = scanner.next();

        boolean isMorning = timeOfDay.equalsIgnoreCase("morning");
        boolean isAfternoon = timeOfDay.equalsIgnoreCase("afternoon");
        boolean isEvening = timeOfDay.equalsIgnoreCase("evening");

        String invalidTimeOfTheDay = "Invalid time of the day input.";

        if (weather.equalsIgnoreCase("sunny")) {
            if (isMorning) {
                System.out.println("Great time for a morning jog.");
            } else if (isAfternoon) {
                System.out.println("Perfect for a picnic in the park.");
            } else if (isEvening) {
                System.out.println("Enjoy a beautiful sunset.");
            } else {
                System.out.println(invalidTimeOfTheDay);
            }
        } else if (weather.equalsIgnoreCase("rainy")) {
            if (isMorning) {
                System.out.println("Good time for indoor yoga.");
            } else if (isAfternoon) {
                System.out.println("How about visiting a museum?");
            } else if (isEvening) {
                System.out.println("Relax with a book and some tea.");
            } else {
                System.out.println(invalidTimeOfTheDay);
            }
        } else if (weather.equalsIgnoreCase("cloudy")) {
            if (isMorning) {
                System.out.println("Take a walk and enjoy the cool air.");
            } else if (isAfternoon) {
                System.out.println("Visit a local café or a library.");
            } else if (isEvening) {
                System.out.println("A good evening for a movie at home.");
            } else {
                System.out.println(invalidTimeOfTheDay);
            }
        } else {
            System.out.println("Invalid weather input.");
        }

        // RULE: DO NOT REPEAT YOURSELF (DRY)

        // SPAGHETTI CODE

        // HOMEWORK 2:

        System.out.println("Please input the number of guests:");
        int numOfGuests = scanner.nextInt();

        System.out.println("Please choose seating preference (outdoor/indoor):");
        String seatingPreference = scanner.next();

        int maxIndoorCapacity = 20;
        int maxOutdoorCapacity = 15;
        int currentIndoorGuests = 10;
        int currentOutdoorGuests = 8;

        String message = "Table reserved in the " + seatingPreference + " area.";

        if (seatingPreference.equalsIgnoreCase("indoor")) {
            if (currentIndoorGuests + numOfGuests <= maxIndoorCapacity) {
                System.out.println(message);
            } else {
                System.out.println("Indoor area is full. Would you like outdoor seating?");
            }
        } else if (seatingPreference.equalsIgnoreCase("outdoor")) {
            if (currentOutdoorGuests + numOfGuests <= maxOutdoorCapacity) {
                System.out.println(message);
            } else {
                System.out.println("Outdoor area is full. Would you like indoor seating?");
            }
        } else {
            System.out.println("Invalid seating preference.");
        }

        // TASK:

        /*
                The task is to calculate the fine based on the days late.

                RULES:

                    1. If book is returned on time, no fine.
                    2. If book is returned late, fines will be calculated as follows:
                        - if book is late less than 5 days, the fine is 2$ per day
                        - if book is late days, fine is 5$ per day
                        - if book is late for more than 10 days, 10$ per day and also message the user about the membership revocation.

                REQ-TS:

                    - Ask user to input the number of days late.
                    - Print out the total fine.
         */

        System.out.println("Please enter the days you're late to return the book/s:");
        int daysLate = scanner.nextInt();

        int totalFine = 0;

        if (daysLate > 0 && daysLate < 5) {
            totalFine = daysLate * 2;
        } else if (daysLate >= 5 && daysLate < 10) {
            totalFine = daysLate * 5;
        } else if (daysLate >= 10) {
            totalFine = daysLate * 10;
            System.out.println("Your library membership is revoked.");
        } else {
            System.out.println("No fine!");
        }


        if (daysLate > 0){
            System.out.println("The total fine is: " + totalFine + "$.");
        }

        // == - checks the equality of two variables
        // != - checks the not equality of two variables

    }
}
