import java.util.Scanner;

public class PenjumlahanEmpatBilangan {

    public static int penjumlahan(int a, int b, int c, int d) {
        // Mengembalikan hasil penjumlahan dari 4 bilangan bulat
        return a + b + c + d;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input empat bilangan bulat
        System.out.print("Masukkan bilangan pertama: ");
        int bil1 = scanner.nextInt();
        System.out.print("Masukkan bilangan kedua: ");
        int bil2 = scanner.nextInt();
        System.out.print("Masukkan bilangan ketiga: ");
        int bil3 = scanner.nextInt();
        System.out.print("Masukkan bilangan keempat: ");
        int bil4 = scanner.nextInt();

        // Memanggil fungsi penjumlahan dan mencetak hasilnya
        int hasil = penjumlahan(bil1, bil2, bil3, bil4);
        System.out.println("Hasil penjumlahan: " + hasil);

        scanner.close();
    }
}