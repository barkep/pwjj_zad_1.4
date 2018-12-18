import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Liczba dziesiętna do zamiany na inny system: ");
        int value = scanner.nextInt();
        System.out.println("Liczba binarna: " + intToBinary(value));
        System.out.println("Liczba ósemkowa: " + intToOctal(value));
        System.out.println("Liczba szesnastkowa: " + intToHexdecimal(value));
    }

    private static String intToBinary(int value) {
        return Integer.toBinaryString(value);
    }

    private static String intToOctal(int value) {
        return Integer.toOctalString(value);
    }

    private static String intToHexdecimal(int value) {
        return Integer.toHexString(value);
    }
}
