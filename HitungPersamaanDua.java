import java.util.Scanner;

public class HitungPersamaanDua {
    // Fungsi untuk menghitung y = 1/x
    public static double hitungY(double x) {
        if (x == 0) {
            throw new IllegalArgumentException("x tidak boleh bernilai 0.");
        }
        return 1 / x;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Meminta input nilai x
        System.out.print("Masukkan nilai x (kecuali 0): ");
        double x = scanner.nextDouble();

        try {
            // Memanggil fungsi dan mencetak hasil
            double y = hitungY(x);
            System.out.println("Nilai y = 1/x adalah: " + y);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        scanner.close();
    }
}
