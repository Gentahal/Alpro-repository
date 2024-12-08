package Array;
import java.util.*;

public class NilaiSkor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int [] skor = new int[100];
        int hitung  = 0;
        int jumlah = 0;

        System.out.println("Masukan Skor");

        while (true) {
            int score = input.nextInt();
            if(score < 0){
                break;
            }
            skor[hitung] = score;
            jumlah += score;
            hitung++;
        }

        if (hitung == 0) {
            System.out.println("Tidak ada skor yang dimasukan");
            return;
        }

        double rataRata = (double) jumlah / hitung;

        int skorAtas = 0;
        int skorBawah = 0;
        int skorSama = 0;

        for(int i = 0; i < hitung; i++){
            if(skor[i] > rataRata){
                skorAtas++;
            } else if (skor[i] == rataRata) {
                skorSama++;
            } else {
                skorBawah++;
            }
        }

        System.out.println(skorAtas + " scores above the average!");
        System.out.println(skorSama + " scores equals the average!");
        System.out.println(skorBawah + " scores below the average!");
    }
}
