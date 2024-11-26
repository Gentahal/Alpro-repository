import java.util.Scanner;

public class JumlahKelipatan {
    public static int jumlahKelipatan(int m, int n, int x) {
        if (x <= 0 || m > n) {
            throw new IllegalArgumentException("Input tidak valid. Pastikan x > 0 dan m <= n.");
        }

        int sum = 0;
        for (int i = m; i <= n; i++) {
            if (i % x == 0) {
                sum += i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nilai m (batas bawah): ");
        int m = scanner.nextInt();
        System.out.print("Masukkan nilai n (batas atas): ");
        int n = scanner.nextInt();
        System.out.print("Masukkan nilai x (kelipatan): ");
        int x = scanner.nextInt();

        try {
            int hasil = jumlahKelipatan(m, n, x);
            System.out.println("Jumlah kelipatan " + x + " dalam interval [" + m + ", " + n + "] adalah: " + hasil);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        scanner.close();
    }
}
