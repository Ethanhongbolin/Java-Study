public class lec_4 {
    public static void main(String[] args) {
        System.out.println("hello");
        System.out.println(7 / 2); //3             
        System.out.println(7.0 / 2); //3.5
        System.out.println(7 / 2.0);//3.5
        byte maximum = 127;  
        System.out.println(maximum + 1);

        int maximum2 = 2_147_483_647;
        long tooLate = maximum2 + 1; //does right hand side first than goes to left.
        long safeNext = 2_147_483_647L +1; // converts the number in long because of the 'L'
        System.out.println(tooLate);
        System.out.println(safeNext);
        double stuff = 0.1 + 0.2;
        System.out.println(stuff);
        System.out.println(1/10.0 + 0.2);
        System.out.println((1+2)/10.0);
        

        // Precedence and parentheses

        int result1 = 2 + 3 * 4;
        int result2 = (2 + 3) * 4;
        int result3 = 20 / 5 * 2;
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);

        // Numeric promotion and casting
        // Smaller to larger data type is called promotion, and larger to smaller is called casting
        int count = 12; //32bits
        byte smallerCount = (byte) count; //8 //ERROR because the int is bigger than byte, so it can not be converted to smaller data type
        long largeCount = count; //64bits
        double measurement = count; //64bits

        double wrongAverage = (double) (5 / 2); //2.0   5 divided by 2 is 2 with a remainder of 1, and then the 2 is converted to 2.0, so the answer is 2.0
        double rightAverage = (double) 5 / 2;//2.5      5 goes into 5.0 and than 2 goes into 2.0 and then they divide

        System.out.println(wrongAverage);
        System.out.println(rightAverage);

        //Promotion inside and arithmetic expression
        byte first = 10;
        byte second = 20;
        int sum = first + second;

        System.out.println(first);
        System.out.println(second);
        System.out.println(sum);

        //float can only store accurate up to 7 decimal places, and double can store accurate up to 15 decimal places
        float decimal = 0.28473838f;
        double decimal2 = 0.384628463847364;
        System.out.println(decimal);
        System.out.println(decimal2);
    }
}