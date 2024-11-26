import java.util.Scanner;

public class BintangKanan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah baris: ");
        int jumlahBaris = input.nextInt();

        for (int i = 1; i <= jumlahBaris; i++) {
            // Menambahkan spasi agar bintang dimulai dari kanan
            for (int j = 1; j <= jumlahBaris - i; j++) {
                System.out.print(" ");
            }
            // Menampilkan bintang
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
