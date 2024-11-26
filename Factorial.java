import java.util.Scanner;

public class Factorial {
    public static int factorial(int n) {
        if (n == 0 || n == 1) return 1;
        return n * factorial(n - 1);
    }

    public static int permutation(int x, int y) {
        if (x >= y) return factorial(x) / factorial(x - y);
        return factorial(y) / factorial(y - x);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai x: ");
        int x = sc.nextInt();
        System.out.print("Masukkan nilai y: ");
        int y = sc.nextInt();

        int xFact = factorial(x);
        int yFact = factorial(y);
        int perm = permutation(x, y);

        System.out.println("x! = " + xFact);
        System.out.println("y! = " + yFact);
        System.out.println("Permutasi = " + perm);
    }
}
