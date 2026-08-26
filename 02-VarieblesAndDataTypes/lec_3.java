public class lec_3 {
    public static void main(String[] args) {
        //ASSIGN BEFORE READING
        int count;                     //VALID
        count = 20;
        System.out.println(count);
        
        
        
        //DO NOT REDECLARE A NAME IN OVERLAPPING SCOPE
        int score = 10;
        double score = 20.0;                //ERROR  Can not change type of varible by using this method after it's been created



        //USE A NAME ONLY INSIDE ITS SCOPE
        {
            int inside = 40;              
        }
        System.out.println(inside);           //Can not access inside scope ERROR         *ALL CURLY BRACKET{} are scopes

        
        
        
        //VARIaBLE NAMES AND CONSTANTS

        int remainingSeats = 12;
        double unitPrice = 4.5;
        boolean registrationOpen = true;



        //Literals, Variables, and Constants

        final int MAX_ATTEMPTS = 3;
        // just like js its like const, can not be changed because the "final"
        

    }

}
