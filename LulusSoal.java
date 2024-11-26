import java.util.Scanner;

public class LulusSoal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int nilaiUjian;

        do {

            System.out.println("Masukan Nilai ujian: ");
            nilaiUjian = input.nextInt();

            if (nilaiUjian >= 60) {
                System.out.println("Selamat anda lulus");
            } else {
                System.out.println("Anda tidak lulus, coba lagi");
            } 

            if (nilaiUjian == -1) {
                System.out.println("Tidak ada nilai yang dimasukan kecuali 0");
            }

        } while (nilaiUjian != -1);

    }
}
