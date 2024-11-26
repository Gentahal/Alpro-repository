import java.util.Scanner;

public class MedianFinder {
    public static int cariMedian(int a, int b, int c) {
        // Mengurutkan nilai untuk menemukan median
        if ((a > b && a < c) || (a < b && a > c)) {
            return a;
        } else if ((b > a && b < c) || (b < a && b > c)) {
            return b;
        } else {
            return c;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input tiga bilangan
        System.out.print("Masukkan bilangan pertama: ");
        int a = scanner.nextInt();
        System.out.print("Masukkan bilangan kedua: ");
        int b = scanner.nextInt();
        System.out.print("Masukkan bilangan ketiga: ");
        int c = scanner.nextInt();

        // Output median
        int median = cariMedian(a, b, c);
        System.out.println("Median dari " + a + ", " + b + ", dan " + c + " adalah: " + median);

        scanner.close();
    }
}