public class Input2 {
    void main(String[] var0) {
        String item = "Notebook";
        byte quantity = 3;
        double total = 13.5;
        String report = String.format("%s x %d = $%.2f", item, quantity, total);
        IO.println(report);


    }
}
