package Array;

import java.util.Scanner;

public class ValidHimpunan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Langkah 1: Input jumlah elemen
        System.out.println("Masukkan jumlah elemen dalam himpunan: ");
        int jumlahElemen = input.nextInt();

        // Langkah 2: Buat array untuk menyimpan elemen himpunan
        int[] himpunan = new int[jumlahElemen];

        // Langkah 3: Input elemen-elemen himpunan
        System.out.println("Masukkan elemen-elemen himpunan: ");
        for (int i = 0; i < jumlahElemen; i++) {
            himpunan[i] = input.nextInt();
        }

        // Langkah 4: Cek apakah elemen-elemen himpunan valid
        if (cekValidHimpunan(himpunan)) {
            System.out.println("Himpunan ini VALID (tidak ada elemen yang duplikat).");
        } else {
            System.out.println("Himpunan ini TIDAK VALID (ada elemen yang duplikat).");
        }
    }

    // Metode untuk mengecek validitas himpunan
    public static boolean cekValidHimpunan(int[] himpunan) {
        // Langkah 5: Cek setiap elemen, apakah ada yang duplikat
        for (int i = 0; i < himpunan.length; i++) {
            for (int j = i + 1; j < himpunan.length; j++) {
                // Jika ada elemen yang sama, himpunan tidak valid
                if (himpunan[i] == himpunan[j]) {
                    return false; 
                }
            }
        }
        // Jika tidak ditemukan duplikat, himpunan valid
        return true;
    }
}
