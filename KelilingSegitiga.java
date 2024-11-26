import java.util.Scanner;

public class KelilingSegitiga {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Masukan Nilai A: ");
        double nilaiA = input.nextDouble();

        System.out.println("Masukan Nilai B: ");
        double nilaiB = input.nextDouble();

        System.out.println("Masukan Nilai C: ");
        double nilaiC = input.nextDouble();

        double hasil = nilaiA + nilaiB + nilaiC;

        System.out.println("Maka Hasilnya " + hasil);

    }
}
