import java.util.*;

public class ForLoop {
    public static void main(String[] args) {
        // System.out.println("Ini adalah awal program");

        // for(int nilai = 9; nilai <= 10; nilai++){
        //     System.out.println("Nilai saat ini adalah : " + nilai);
        // }

        // System.out.println("Ini adalah akhir program");

        int nilaiAwal, nilaiAkhir, total;

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai awal : ");
        nilaiAwal = input.nextInt();
        System.out.print("Masukkan nilai akhir : ");
        nilaiAkhir = input.nextInt();
        
        total = 0;

        // while(nilaiAwal <= nilaiAkhir ) {
        //     total = total + nilaiAwal;
        //     System.out.println("Ditambah " + nilaiAwal + " menjadi " + total);
        //     nilaiAwal++;
        // }

        // do{
        //     total = total + nilaiAwal;
        //     System.out.println("Ditambah " + nilaiAwal + " menjadi " + total);
        //     nilaiAwal++;
        // }while(nilaiAwal <= nilaiAkhir);

        for(; nilaiAwal <= nilaiAkhir; nilaiAwal++) {
            total = total + nilaiAwal;
            System.out.println("Ditambah " + nilaiAwal + " menjadi " + total);
        }
    }
}
