import java.util.Scanner;

public class LimaSoal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan bilangan tebakan adik: ");
        int adik = input.nextInt();
        System.out.print("Masukkan bilangan tebakan kakak: ");
        int kakak = input.nextInt();

        boolean adikMenang = (adik == kakak) || (adik == kakak + 1) || (adik == kakak - 1) || 
                             (adik == kakak + 5) || (adik == kakak - 5);

        System.out.println(adikMenang);
    }
}
