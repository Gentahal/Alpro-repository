package Array;

import java.util.Scanner;

public class ValidHimpunan2D {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Langkah 1: Input ukuran matriks
        System.out.println("Masukkan jumlah baris dalam matriks: ");
        int baris = input.nextInt();

        System.out.println("Masukkan jumlah kolom dalam matriks: ");
        int kolom = input.nextInt();

        // Langkah 2: Buat matriks untuk menyimpan elemen
        int[][] matriks = new int[baris][kolom];

        // Langkah 3: Input elemen-elemen matriks
        System.out.println("Masukkan elemen-elemen matriks: ");
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                matriks[i][j] = input.nextInt();
            }
        }

        // Langkah 4: Cek apakah matriks valid
        if (cekValidMatriks(matriks)) {
            System.out.println("Matriks ini VALID (tidak ada elemen yang duplikat).");
        } else {
            System.out.println("Matriks ini TIDAK VALID (ada elemen yang duplikat).");
        }
    }

    // Metode untuk mengecek validitas matriks
    public static boolean cekValidMatriks(int[][] matriks) {
        // Langkah 5: Cek setiap elemen, apakah ada yang duplikat
        for (int i = 0; i < matriks.length; i++) {
            for (int j = 0; j < matriks[i].length; j++) {
                // Bandingkan elemen (i, j) dengan elemen lainnya
                for (int k = 0; k < matriks.length; k++) {
                    for (int l = 0; l < matriks[k].length; l++) {
                        // Lewati elemen yang sama
                        if (i == k && j == l) {
                            continue;
                        }
                        // Jika ditemukan duplikat
                        if (matriks[i][j] == matriks[k][l]) {
                            return false;
                        }
                    }
                }
            }
        }
        // Jika tidak ditemukan duplikat, matriks valid
        return true;
    }
}
