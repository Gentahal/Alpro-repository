import java.util.Scanner;

public class SoalTiga {
    public static void main(String[] args){
        Scanner nilai = new Scanner(System.in);

        System.out.println("Masukan Nilai X");
        double nilaiX = nilai.nextDouble();

        double nilaiPembilang = Math.pow(nilaiX, 3) + 3 * nilaiX;
        double nilaiPenyebut = Math.pow(nilaiX, 4) - 3 * Math.pow(nilaiX, 2) + 4;
        double nilaiHasil = nilaiPembilang / nilaiPenyebut;

        System.out.println("Nilai f(x) untuk x = " + nilaiX + " adalah " + nilaiHasil) ;
    }
}
