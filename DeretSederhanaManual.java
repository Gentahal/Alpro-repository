import java.util.Scanner;

public class DeretSederhanaManual {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Meminta input dari pengguna
        System.out.print("Masukkan bilangan bulat positif n: ");
        int n = scanner.nextInt();

        int jumlah = 0;
        int i = 1;  // Mulai dari angka 1

        // Melakukan perhitungan secara manual menggunakan while loop
        while (i <= n) {
            jumlah = jumlah + i;  // Tambahkan i ke jumlah
            i = i + 1;  // Naikkan i secara manual
        }

        // Tampilkan hasilnya
        System.out.println("Jumlah deret dari 1 sampai " + n + " adalah: " + jumlah);

        scanner.close();
    }
}
