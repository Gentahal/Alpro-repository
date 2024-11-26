import java.util.*;

public class MembacaNilai {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Array untuk menghitung kemunculan angka antara 1 hingga 50
        int[] hitung = new int[51];  // Indeks 0 tidak digunakan, karena angka antara 1 hingga 50

        System.out.println("Masukkan 11 bilangan bulat antara 1 hingga 50:");

        // Membaca 11 bilangan dan menghitung kemunculannya
        for (int i = 0; i < 11; i++) {
            int angka = input.nextInt();
            if (angka >= 1 && angka <= 50) {
                hitung[angka]++;  // Menambah jumlah kemunculan angka tersebut
            } else {
                System.out.println("Angka tidak valid, masukkan angka antara 1 hingga 50.");
                i--;  // Mengulang input jika angka tidak valid
            }
        }

        // Menampilkan jumlah kemunculan angka antara 1 hingga 50
        System.out.println("\nJumlah kemunculan masing-masing angka antara 1 hingga 50:");
        for (int i = 1; i <= 50; i++) {
            if (hitung[i] > 0) {
                System.out.println("Angka " + i + " muncul sebanyak " + hitung[i] + " kali.");
            }
        }
    }
}
