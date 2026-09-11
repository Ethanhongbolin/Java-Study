

public class String_Methods {
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

        //length()
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

        //charAt(index)
        String name6 = "JAVA-2026";
        System.out.println("name6 charAt(2): " + name6.charAt(2));

        //indexOf(text)
        String name9 = "JAVA-2026";
        System.out.println("name9 indexOf('AV'): " + name9.indexOf("VA")); //finds the first index of that target.

        //indexOf(text, fromIndex)
        System.out.println("name9 indexOf('VA', 2): " + name9.indexOf("VA", 2)); //finds the first index of that target starting from index 2

        //lastIndexOf(text)
        String name10 = "JAVA-2026";
        System.out.println("name10 lastIndexOf('A'): " + name10.lastIndexOf("A"));
        
        //lastIndexOf(text, fromIndex)
        System.out.println("name10 lastIndexOf('A', 2): " + name10.lastIndexOf("A", 2)); //finds the last index of that target starting from index 2

        //substring(begin)
        String name8 = "JAVA-2026";
        System.out.println("name8 substring(2): " + name8.substring(2));

        //substring(begin, end)
        System.out.println("name8 substring(2, 5): " + name8.substring(2, 5)); //the second parameter is exclusive, so it will not include the character at index 5
        //basically range from index 2 to index 4, which is 3 characters in total.
        
        //contains(text)
        String name11 = "JAVA-2026";
        System.out.println("name11 contains 'AV': " + name11.contains("VA"));

        //startWith(prefix)
        System.out.println("name11 startsWith('JAVA'): " + name11.startsWith("JAVA"));
        
        //endWith(suffix)
        System.out.println("name11 endsWith('2026'): " + name11.endsWith("2026"));
    
        //isEmpty()
        System.out.println("name11 isEmpty(): " + name11.isEmpty());

        //isBlank()
        String name12 = "   ";
        System.out.println("name12 isBlank(): " + name12.isBlank());

        //equals(text)
        System.out.println("name11 equals('JAVA-2026'): " + name11.equals("JAVA-2026"));    

        //equalsIgnoreCase(text)
        System.out.println("name11 equalsIgnoreCase('java-2026'): " + name11.equalsIgnoreCase("java-2026"));    

        //strip()
        String name13 = "   JAVA-2026   ";
        System.out.println("name13 strip(): " + name13.strip());

        //replace(oldChar, newChar)
        String name14 = "JAVA-2026";
        System.out.println("name14 replace('A', 'a'): " + name14.replace('A', 'a'));    

        //replace(oldString, newString)
        System.out.println("name14 replace('JAVA', 'java'): " + name14.replace("JAVA", "java"));    

        //replace(target, replacement)
        System.out.println("name14 replace('JAVA', 'java'): " + name14.replace("JAVA", "java"));    
        
        //replaceAll(regex, replacement)
        String name15 = "JAVA-2026";
        System.out.println("name15 replaceAll('A', 'a'): " + name15.replaceAll("A", "a"));      

    
    }
}
