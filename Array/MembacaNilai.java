package Array;

import java.util.*;

public class MembacaNilai {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nilai = new int[11];

        System.out.println("Masukan nilai 11 kali");

        for(int i = 0; i < 11; i++){
            nilai[i] = input.nextInt();
        }

        int pembanding = nilai[10];

        for(int i = 0; i < 10; i++ ){
            if (nilai[i] < pembanding) {
                System.out.println(nilai[i] + "lebih kecil dari " + pembanding);
            } else if (nilai[i] > pembanding) {
                System.out.println(nilai[i] + "lebih besar dari " + pembanding);
            } else {
                System.out.println(nilai[i] + "sama dengan " + pembanding);
            }
        }
    }
}


