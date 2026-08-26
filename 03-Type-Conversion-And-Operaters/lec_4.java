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
        
    }
}