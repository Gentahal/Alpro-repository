import java.util.Scanner;

public class SoalTiga {
    public static void main(String[] args){
        Scanner nilai = new Scanner(System.in);

        System.out.println("Masukan Nilai X");
        double nilaiX = nilai.nextDouble();

        // Menghitung pangkat secara manual
        double nilaiX3 = nilaiX * nilaiX * nilaiX;  // x^3
        double nilaiX2 = nilaiX * nilaiX;           // x^2
        double nilaiX4 = nilaiX2 * nilaiX2;         // x^4

        // Perhitungan pembilang dan penyebut
        double nilaiPembilang = nilaiX3 + 3 * nilaiX;
        double nilaiPenyebut = nilaiX4 - 3 * nilaiX2 + 4;
        double nilaiHasil = nilaiPembilang / nilaiPenyebut;

        System.out.println("Nilai f(x) untuk x = " + nilaiX + " adalah " + nilaiHasil);
    }
}
