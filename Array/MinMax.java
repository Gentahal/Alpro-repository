package Array;

import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jumlah elemen: ");
        int n = scanner.nextInt();
        int[] array = new int[n];

        System.out.println("Masukkan elemen array:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        int max = array[0];
        int min = array[0];
        for (int num : array) {
            if (num > max) max = num;
            if (num < min) min = num;
        }

        System.out.println("Nilai maksimum: " + max);
        System.out.println("Nilai minimum: " + min);
    }
}
