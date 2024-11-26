import java.util.Scanner;

public class ModulusLoop {
    public static int modulusLoop(int n, int m) {
        while (n >= m) {
            n -= m;
        }
        return n;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan bilangan n (n >= 0): ");
        int n = scanner.nextInt();
        System.out.print("Masukkan bilangan m (m > 0): ");
        int m = scanner.nextInt();

        if (n >= 0 && m > 0) {
            int hasil = modulusLoop(n, m);
            System.out.println("Hasil modulus: " + hasil);
        } else {
            System.out.println("Input tidak valid. Pastikan n >= 0 dan m > 0.");
        }

    }
}
