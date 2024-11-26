import java.util.Scanner;

public class EnamSoal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan bilangan tebakan adik: ");
        int adik = input.nextInt();
        System.out.print("Masukkan bilangan tebakan kakak: ");
        int kakak = input.nextInt();

        boolean adikMenang = (adik % 2 != kakak % 2);

        System.out.println(adikMenang);
    }
}
