import java.util.Scanner;

public class Triangel {
    public static boolean isTriangle(int a, int b, int c) {
        return (a + b > c) && (a + c > b) && (b + c > a);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan sisi a: ");
        int a = sc.nextInt();
        System.out.print("Masukkan sisi b: ");
        int b = sc.nextInt();
        System.out.print("Masukkan sisi c: ");
        int c = sc.nextInt();

        if (isTriangle(a, b, c)) {
            System.out.println("segitiga");
        } else {
            System.out.println("bukan segitiga");
        }
    }
}
