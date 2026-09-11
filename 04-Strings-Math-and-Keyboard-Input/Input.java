public class Input {
    void main(String[] var0) {
        IO.print("Ethan your full name: ");
        String name = IO.readln();
        IO.println("Hello, " + name + ".");

        IO.print("What is your age?: ");
        String age1 = IO.readln();
        IO.println("Your age is: " + age1 + ".");

        //Converting String to Integer
        String ageText = IO.readln("Enter your age as a whole number: ");
        int age = Integer.parseInt(ageText);
        IO.println("Text plus 1: " + (ageText + 1));
        IO.println("Number plus 1: " + (age + 1));

        //Converting String to Double
        String heightText = IO.readln("Enter your height as a decimal number: ");
        double height = Double.parseDouble(heightText);
        IO.println("Text plus 1: " + (heightText + 1));
        IO.println("Number plus 1: " + (height + 1));

        //Convert String to byte
        String byteText = IO.readln("Enter a byte value: ");
        byte byteValue = Byte.parseByte(byteText);
        IO.println("Text plus 1: " + (byteText + 1));
        IO.println("Number plus 1: " + (byteValue + 1));

        //Convert String into long
        String longText = IO.readln("Enter a long value: ");
        long longValue = Long.parseLong(longText);
        IO.println("Text plus 1: " + (longText + 1));
        IO.println("Number plus 1: " + (longValue + 1));

        //Convert String into float
        String floatText = IO.readln("Enter a float value: ");
        float floatValue = Float.parseFloat(floatText);
        IO.println("Text plus 1: " + (floatText + 1));
        IO.println("Number plus 1: " + (floatValue + 1));


        // Clean way to convert String to int and double
        int age2 = Integer.parseInt(IO.readln("Age:"));
        double height2 = Double.parseDouble(IO.readln("Height:"));
        IO.println("Age: " + age2);
        IO.println("Height: " + height2);


    }
}
