package mentoring;

public class DietCalculatorHM {
    public static void main(String[] args) {
        int steps = 9000;
        double miles = 4.5;
        int dailyCalorieTaken = 1450;
        boolean result = (steps >= 10000 || miles >= 4.0) && dailyCalorieTaken < 1500;
        System.out.println(result);
    }
}
