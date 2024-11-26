import java.util.Scanner;

public class JumlahDigitPertamaDanTerakhir {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah bilangan: ");
        int n = input.nextInt();

        for (int a = 0; a < n; a++) {
            System.out.print("Masukkan bilangan ke-" + (a + 1) + " 4  digit ");
            int bilangan = input.nextInt();

            if (bilangan < 1000 || bilangan > 9999) {
                System.out.println(" berdigit 4.");
                a--; 
                continue; 
            }

            int digitPertama = bilangan / 1000; 
            int digitTerakhir = bilangan % 10;   

            int jumlahDigit = digitPertama + digitTerakhir;

            System.out.println("Jumlah digit pertama dan terakhir dari " + bilangan + " adalah: " + jumlahDigit);
        }
    }
}
