import java.util.Scanner;

public class Fibonacci {
    public static int fibonacciSum(int n) {
        int a = 0, b = 1, sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += a;
            int temp = a + b;
            a = b;
            b = temp;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai N: ");
        int n = sc.nextInt();

        System.out.println("Hasil penjumlahan deret Fibonacci: " + fibonacciSum(n));
    }
}
