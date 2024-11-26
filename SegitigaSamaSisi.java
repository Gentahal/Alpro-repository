import java.util.Scanner;

public class SegitigaSamaSisi {
    public static boolean segitigaSamaSisi(double a, double b, double c) {
        // Syarat segitiga: jumlah dua sisi harus lebih besar dari sisi ketiga
        if (a <= 0 || b <= 0 || c <= 0) {
            return false; // Sisi segitiga harus positif
        }
        if (a + b > c && a + c > b && b + c > a) {
            // Segitiga sama sisi: ketiga sisi harus sama
            return a == b && b == c;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input tiga sisi segitiga
        System.out.println("Masukkan tiga sisi segitiga:");
        System.out.print("Sisi a: ");
        double a = scanner.nextDouble();
        System.out.print("Sisi b: ");
        double b = scanner.nextDouble();
        System.out.print("Sisi c: ");
        double c = scanner.nextDouble();

        // Memeriksa apakah segitiga sama sisi
        boolean hasil = segitigaSamaSisi(a, b, c);
        System.out.println("Apakah segitiga sama sisi? " + hasil);

    }
}
