

public class Boolean_Values_And_Expressions {
    void main(){  
        boolean isRaining = true;
        boolean hasUmbrella = false;

        final boolean DEBUG_MODE = false;


        int age = 20;
        boolean oldEnough = age >= 18; //true
        boolean admitted = oldEnough; //admitted = true

        //boolean oldEnough2 = (age >=10) is the same as boolean oldEnough = age >= 18;
        //also the same as boolean oldEnough2 = true;

        String first = new String("Java"); //object
        String second = new String("Java"); //object
        String third = first;

        IO.println(first.getClass().getSimpleName()); //String

        IO.println(first == second); //false
        IO.println(first == third); //true
        IO.println(first.equals(second)); //true

        String savedName = "Ada";
        String enteredName = "ADA";

        boolean exactName = savedName.equals(enteredName);
        boolean flexibleName = savedName.equalsIgnoreCase(enteredName);

        IO.println(exactName); //false
        IO.println(flexibleName); //true

        // && = AND
        // || = OR
        // ! == NOT

        
        // ! priority #1
        // && priority #2
        // || priority #3
        boolean a = true;
        boolean b = false;
        boolean c = false;
    
        boolean result = !a && b || c;
        //these two are the same
        boolean result1 = ((!a) && b) || c;

        //Short-circuit evaluation *********************

        String name = null;
        boolean hasText = name != null && !name.isEmpty(); 
        //boolean = false %% something 
        // DOES not look at the second value
        // boolean = true || something
        // DOES not look at the second value
        // only apply to these 2 situations.
        
        
        //======== Conditional Operator ==========//
        int my_Age = 20;
        String label = my_Age >= 18 ? "Adult" : "Minor";  //exmaple 1
        IO.println(label);

        /*
        Example 2
        String label;

        if (age >= 10) {
            label = "Adult";
        } else { 
            label = "minor";
        }


        example 1 = example 2
        */ 
        


    }
}
