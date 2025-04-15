//Exercise 5.34

public class NumberConversions {

    public static void main(String[] args) {
        System.out.println("Decimal\tBinary\tOctal\tHexadecimal");
        for (int i = 1; i <= 256; i++) {
            String binary = Integer.toBinaryString(i);
            String octal = Integer.toOctalString(i);
            String hex = Integer.toHexString(i).toUpperCase();
            System.out.println(i + "\t\t" + binary + "\t\t" + octal + "\t\t" + hex); // Display conversions [cite: 88]
        }
    }
}