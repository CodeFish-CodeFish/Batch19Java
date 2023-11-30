public class LogicalOperators {
    public static void main(String[] args) {

        // Logical OR (|)

        // the operator symbol is called pipe

        // RULE: If either or both of the variables are true, the result is true.

        boolean isWeekend = true;
        boolean isHoliday = false;
        boolean goOut = isWeekend | isHoliday; // true | (or) false will result true

        System.out.println(goOut);
        System.out.println(isWeekend | !(!isHoliday)); // true | false ---> true

        System.out.println(!isHoliday | !isWeekend); // true | false ===> true

        System.out.println(!isWeekend | isHoliday); // false | false ===> false
    }
}
