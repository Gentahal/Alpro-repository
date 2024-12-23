package Array;

import java.util.Scanner;

public class Menghitung {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jumlah elemen: ");
        int n = scanner.nextInt();
        int[] array = new int[n];

        System.out.println("Masukkan elemen array:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        int total = 0;
        for (int num : array) {
            total += num;
        }

        double rataRata = (double) total / n;
        System.out.println("Total: " + total);
        System.out.println("Rata-rata: " + rataRata);
    }
}
