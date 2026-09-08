

public class lec_1 {
    public static void main(String[] args) {

        //String Concatanation

        String first = "Ada";
        String last = "Lovelace";
        String full = first + " " + last;
        System.out.println(full);

        
        System.out.println("Total: " + 2 + 3); //Total: 23
        System.out.println(2 + 3 + " Total: "); //Total: 5
        System.out.println("Total: " + (2 + 3)); //Total: 5
        System.out.println("Product: " + 2 * 3); //Product: 6


        String name = "JAVA-2026";
        System.out.println("Length of name: " + name.length());

        //trim
        String name2 = "   JAVA-2026   ";
        System.out.println("name2: " + name2.trim());
        
        //toUpperCaase

        String name3 = "java-2026";
        System.out.println("name3: " + name3.toUpperCase());

        //toLowerCase
        String name4 = "JAVA-2026";
        System.out.println("name4: " + name4.toLowerCase());

        //contains
        String name5 = "JAVA-2026";
        System.out.println("name5 contains 'AV': " + name5.contains("AV"));

        //charAt
        String name6 = "JAVA-2026";
        System.out.println("name6 charAt(2): " + name6.charAt(2));

        //indexOf
        String name7 = "JAVA-2026";
        System.out.println("name7 indexOf('A'): " + name7.indexOf('A')); //finds the first index of that target.

        //substring
        String name8 = "JAVA-2026";
        System.out.println("name8 substring(2): " + name8.substring(2));
        System.out.println("name8 substring(2, 5): " + name8.substring(2, 5)); //the second parameter is exclusive, so it will not include the character at index 5
        //basically range from index 2 to index 4, which is 3 characters in total.
        
    }
}
