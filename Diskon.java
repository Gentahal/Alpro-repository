import java.util.Scanner;

public class Diskon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user for input
        System.out.print("Masukkan nilai: ");
        int nilai = input.nextInt();

        // Extract digits from the input value
        int ribuan = (nilai / 1000) % 10;
        int ratusan = (nilai / 100) % 10; // This variable is unused, consider removing it
        int puluhan = (nilai / 10) % 10;
        int satuan = nilai % 10; // This variable is unused, consider removing it

        // Determine if there is a discount based on the puluhan digit
        boolean diskon = (puluhan % 2 == 0);

        // Determine if there is a cashback based on the ribuan and puluhan digits
        boolean cashback = (ribuan + puluhan) % 4 == 0;

        // Output the results
        System.out.println("Diskon: " + diskon);
        System.out.println("Cashback: " + cashback);

        // Close the scanner to avoid resource leaks
        input.close();
    }
}