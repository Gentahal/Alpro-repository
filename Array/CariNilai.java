package Array;

import java.util.ArrayList;
import java.util.Scanner;

public class CariNilai {
    
    public static void main(String[] args) {
        int[] array = bacaArray();
        int maksimum = cariMaksimum(array);
        int minimum = cariMinimum(array);
        cetakHasil(array, maksimum, minimum);
    }

    // Subprogram untuk membaca elemen array
    public static int[] bacaArray() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        
        System.out.println("Masukkan bilangan (masukkan bilangan nol atau negatif untuk berhenti):");
        while (list.size() < 20) {
            System.out.print("Masukkan bilangan: ");
            int bilangan = scanner.nextInt();
            if (bilangan <= 0) break;
            list.add(bilangan);
        }
        
        // Konversi ArrayList ke array
        int[] array = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            array[i] = list.get(i);
        }
        
        return array;
    }

    // Subprogram untuk mencari nilai maksimum
    public static int cariMaksimum(int[] array) {
        int maksimum = array[0];
        for (int bilangan : array) {
            if (bilangan > maksimum) {
                maksimum = bilangan;
            }
        }
        return maksimum;
    }

    // Subprogram untuk mencari nilai minimum
    public static int cariMinimum(int[] array) {
        int minimum = array[0];
        for (int bilangan : array) {
            if (bilangan < minimum) {
                minimum = bilangan;
            }
        }
        return minimum;
    }

    // Subprogram untuk mencetak hasil
    public static void cetakHasil(int[] array, int maksimum, int minimum) {
        System.out.print("Elemen array: [");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
        System.out.println("Nilai maksimum: " + maksimum);
        System.out.println("Nilai minimum: " + minimum);
    }
}
