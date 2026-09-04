
// 01 - 

import java.util.Scanner;

public class Print_Escape_Characters {
    
    public static void main(String[] args) {
        
        System.out.println("Name:\tAlex"); //the /t is called escape character and is formed called char
        System.out.println("She \nsaid, \"Hello.\"");
        System.out.println("C:\\study\\java");
        System.out.println("Student: Alex");
        System.out.println("Student: " + "Alex");  
        System.out.print("Student: "); System.out.println("Alex");



        System.out.println("-----Ethan's Example-----");
        System.out.println("Hello, \'World\'");


        System.out.println("-----Text Block Example-----");
        System.out.println("""
                "WOW"
                """);
    }
}
