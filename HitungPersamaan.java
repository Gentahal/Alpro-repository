import java.util.*;
import java.lang.Math;

public class HitungPersamaan {
    // Fungsi untuk menghitung nilai z berdasarkan persamaan
    public static double z(int x) {
        return Math.sqrt(4.5 * x);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukan nilai x dan y");
        int x = input.nextInt();
        int y = input.nextInt();

        double z1 = z(x);
        double z2 = z(y);

        System.out.printf("Nilai z untuk x=a, y=b: %.3f%n", z1);
        System.out.printf("Nilai z untuk x=b, y=a: %.3f%n", z2);
        
    }
}
