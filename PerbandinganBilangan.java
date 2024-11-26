import java.util.Scanner;

public class PerbandinganBilangan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Meminta pengguna untuk memasukkan 10 bilangan pertama
        int bilanganKe11;
        System.out.print("Masukkan bilangan ke-11: ");
        bilanganKe11 = scanner.nextInt();

        // Membandingkan 10 bilangan pertama dengan bilangan ke-11
        for (int i = 1; i <= 10; i++) {
            System.out.print("Masukkan bilangan ke-" + i + ": ");
            int bilangan = scanner.nextInt();

            if (bilangan > bilanganKe11) {
                System.out.println("Bilangan ke-" + i + " lebih besar dari bilangan ke-11.");
            } else if (bilangan < bilanganKe11) {
                System.out.println("Bilangan ke-" + i + " lebih kecil dari bilangan ke-11.");
            } else {
                System.out.println("Bilangan ke-" + i + " sama dengan bilangan ke-11.");
            }
        }
    }
}
