import java.util.Scanner;

public class DuaSoal {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nomor voucher (4 digit): ");
        int x = input.nextInt();

        int a = x / 1000;           
        int b = (x / 100) % 10;     
        int c = (x / 10) % 10;      
        int d = x % 10;             

        boolean diskon = (b % 2 == 0) && (c % 2 == 0);

        boolean cashback = (d != 0) && ((a + c) % d == 0);

        boolean voucher = (diskon || cashback) && !(diskon && cashback);

        System.out.println(x);
        System.out.println(diskon + " " + cashback + " " + voucher);
    }
}
