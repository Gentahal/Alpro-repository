import java.util.Scanner;

public class TigaDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan bilangan bulat positif (maks 999): ");
        int x = scanner.nextInt();

        int d1 = x / 100;         // Digit pertama
        int d2 = (x / 10) % 10;   // Digit kedua
        int d3 = x % 10;          // Digit ketiga

        // Menampilkan keluaran
        System.out.println("Keluaran: " + d1 + " " + d2 + " " + d3);

        scanner.close();
    }
}
