import java.util.Scanner;

public class SoalDua {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nilai x: ");
        int x = scanner.nextInt();

        System.out.print("Masukkan nilai y: ");
        int y = scanner.nextInt();

        // Menghitung x kuadrat tanpa menggunakan Math.pow
        int xSquared = x * x;
        
        double fx = (1.0 / (3 * xSquared + 10)) + 10 * y + 7;

        System.out.println("Nilai f(x, y) untuk x = " + x + " dan y = " + y + " adalah: " + fx);

        scanner.close();
    }
}
