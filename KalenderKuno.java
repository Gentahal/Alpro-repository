import java.util.Scanner;

public class KalenderKuno {
    // Method untuk menghitung jumlah hari dalam tahun tertentu
    public static int hitungHari(int tahun) {
        // Memeriksa apakah tahun tersebut adalah tahun kabisat
        if ((tahun % 400 == 0) || (tahun % 4 == 0 && tahun % 100 != 0)) {
            // Tahun kabisat, memiliki 366 hari
            return 366;
        } else {
            // Tahun biasa, memiliki 365 hari
            return 365;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Meminta input tahun dari pengguna
        System.out.print("Masukkan tahun: ");
        int tahun = scanner.nextInt();
        
        // Menghitung jumlah hari berdasarkan tahun
        int jumlahHari = hitungHari(tahun);
        
        // Menampilkan hasil
        System.out.println("Jumlah hari dalam tahun " + tahun + " adalah: " + jumlahHari);
        
        scanner.close();
    }
}
