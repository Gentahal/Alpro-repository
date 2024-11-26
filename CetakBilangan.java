import java.util.Scanner;

public class CetakBilangan {
    public static void cetakBilangan(int x, int y, int a, int b) {
        for (int i = x; i <= y; i++) {
            int digitPertama = Integer.parseInt(Integer.toString(i).substring(0, 1));
            int digitTerakhir = Integer.parseInt(Integer.toString(i).substring(2, 3));

            if (digitPertama != a && digitTerakhir != b) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nilai x (bilangan awal): ");
        int x = scanner.nextInt();
        System.out.print("Masukkan nilai y (bilangan akhir): ");
        int y = scanner.nextInt();
        System.out.print("Masukkan digit pertama (a): ");
        int a = scanner.nextInt();
        System.out.print("Masukkan digit terakhir (b): ");
        int b = scanner.nextInt();

        cetakBilangan(x, y, a, b);
        
    }
}
