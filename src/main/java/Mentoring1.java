public class Mentoring1 {
    public static void main(String[] args) {
//        String str= "text";
//        System.out.println(str);
//        str="reassign";
//        System.out.println(str);
//        String str1=new String("string 2");
//
//        String str2;
//        System.out.println();
//        str2="str2";
//
//        System.out.println(str.isEmpty());

        String str= "text";
        System.out.println(str.charAt(3));
        System.out.println(str.indexOf('t'));
        System.out.println(str.contains("ex"));
        /*
        baseball bat and a ball together cost $1.10  .the bat costs $1.00 more than the ball .
         how much does the ball cost?
         */
        double totalPrice=1.10;
        double ballPrice;
        System.out.println("ball price is $"+ String.format("%.4f",((totalPrice-1.0)/2)));



    }
}
