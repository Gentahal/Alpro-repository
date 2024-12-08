package Array;

import java.util.Scanner;

public class DuaDimensi {
    public static void main(String[] args) {
        int[][] array2D = new int[5][5];
        bacaArray2D(array2D);
        int maksimum = cariMaksimum2D(array2D);
        cetakArray2D(array2D);
        System.out.println("Nilai maksimum: " + maksimum);
    }

    public static void bacaArray2D(int[][] array2D) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan bilangan untuk array 2D (berhenti jika 0 atau negatif):");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("Baris " + (i + 1) + ", Kolom " + (j + 1) + ": ");
                int bilangan = scanner.nextInt();
                if (bilangan <= 0) {
                    return; // Berhenti jika input negatif atau nol
                }
                array2D[i][j] = bilangan;
            }
        }
    }

    public static int cariMaksimum2D(int[][] array2D) {
        int maksimum = array2D[0][0];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (array2D[i][j] > maksimum) {
                    maksimum = array2D[i][j];
                }
            }
        }
        return maksimum;
    }

    public static void cetakArray2D(int[][] array2D) {
        System.out.println("\nArray 2 Dimensi:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(array2D[i][j] + " ");
            }
            System.out.println();
        }
    }
}
