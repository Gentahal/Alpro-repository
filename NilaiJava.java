import java.util.*;

public class NilaiJava{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Meminta pengguna untuk memasukkan jumlah total mahasiswa
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMahasiswa = input.nextInt();

        // Variabel untuk menyimpan nilai tertinggi
        int nilaiTerbaik = 0;

        // Meminta pengguna untuk memasukkan nilai setiap mahasiswa dan mencari nilai tertinggi
        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            int nilai = input.nextInt();

            // Memperbarui nilai terbaik jika nilai saat ini lebih tinggi
            if (nilai > nilaiTerbaik) {
                nilaiTerbaik = nilai;
            }
        }

        // Menampilkan nilai huruf untuk setiap mahasiswa
        System.out.println("\nNilai Huruf Mahasiswa:");
        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + " untuk menampilkan nilai huruf: ");
            int nilai = input.nextInt();

            char nilaiHuruf;
            if (nilai >= nilaiTerbaik - 5) {
                nilaiHuruf = 'A';
            } else if (nilai >= nilaiTerbaik - 10) {
                nilaiHuruf = 'B';
            } else if (nilai >= nilaiTerbaik - 15) {
                nilaiHuruf = 'C';
            } else if (nilai >= nilaiTerbaik - 20) {
                nilaiHuruf = 'D';
            } else {
                nilaiHuruf = 'F';
            }
            System.out.println("Mahasiswa ke-" + (i + 1) + ": " + nilaiHuruf);
        }

    }
}