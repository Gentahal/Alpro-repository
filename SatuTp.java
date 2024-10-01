import java.util.Scanner;

public class SatuTp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukan Nilai Y: ");
        int y = input.nextInt();

        System.out.println("Masukan Nilai X: ");
        int x = input.nextInt();

        int hasil = y % x;

        System.out.println("Hasilnya: " + hasil);
    }
}
