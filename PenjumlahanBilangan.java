import java.util.Scanner;

public class PenjumlahanBilangan {
    // Prosedur jumlah untuk menjumlahkan pasangan bilangan yang memenuhi syarat
    public static void jumlah(int x, int y) {
        // Memeriksa apakah x ganjil dan y genap
        if (x % 2 != 0 && y % 2 == 0) {
            // Menampilkan jumlah jika kondisi terpenuhi
            System.out.println(x + y);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x, y;
        int total = 0;

        // Loop untuk menerima input pasangan bilangan
        while (true) {
            System.out.print("Masukkan pasangan bilangan (x y): ");
            x = scanner.nextInt();
            y = scanner.nextInt();

            // Memeriksa jika pasangan input adalah sentinel (0 0)
            if (x == 0 && y == 0) {
                break;  // Menghentikan loop jika input adalah "0 0"
            }

            // Memanggil prosedur jumlah untuk setiap pasangan input
            jumlah(x, y);
        }

        scanner.close();
    }
}
