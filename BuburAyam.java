import java.util.Scanner;

public class BuburAyam {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int bubur = 6000;

        System.out.println("Masukan True/false untuk menambahkan toping ayam");
        boolean ayam = input.nextBoolean();

        System.out.println("Masukan True/false untuk menambahkan cakue");
        boolean cakue = input.nextBoolean();

        System.out.println("Masukan True/false untuk menambahkan ati ampela");
        boolean ati = input.nextBoolean();

        System.out.println("Masukan True/false untuk menambahkan telur");
        boolean telur = input.nextBoolean();

        if (ayam) {
            bubur += 3000;
        } if (cakue) {
            bubur += 1500;
        } if (ati) {
            bubur += 4500;
        } if (telur) {
            bubur += 4000;
        }

        System.out.println("Harga bubur anda " + bubur);
    }
}
