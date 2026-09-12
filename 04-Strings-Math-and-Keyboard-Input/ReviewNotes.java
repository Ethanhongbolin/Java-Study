public class ReviewNotes {
    public static void main(String[] args) {
        // byte number_One = Byte.parseByte(IO.readln("Enter your first number: "));

        // byte number_Two = Byte.parseByte(IO.readln("Enter your second number: "));

        // byte total = (byte)(number_One + number_Two);
        // IO.println(total);

        // byte num = 5;

        // String num_Text = String.valueOf(num);

        byte number1 = Byte.parseByte(IO.readln("Give me first number"));
        byte number2 = Byte.parseByte(IO.readln("Give me second number"));
        byte sum = (byte) (number1 + number2);
        IO.println(sum);
    }
}
