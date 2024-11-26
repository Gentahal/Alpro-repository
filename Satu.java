import java.util.Scanner;

public class Satu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai n: ");
        int n = input.nextInt();
        System.out.print("Masukkan nilai m: ");
        int m = input.nextInt();

        if (n < m) {
            int i = n;
            do {
                System.out.println(i);
                i++;
            } while (i <= m);
        } else {
            System.out.println("Nilai n harus lebih kecil dari m.");
        }
    }
}
