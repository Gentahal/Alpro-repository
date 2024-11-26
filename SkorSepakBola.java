import java.util.Scanner;

public class SkorSepakBola {
    public static String skor(int golKeGawangLawan, int golKeGawangSendiri) {
        if (golKeGawangLawan > golKeGawangSendiri) {
            return "menang";
        } else if (golKeGawangLawan < golKeGawangSendiri) {
            return "kalah";
        } else {
            return "draw";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input jumlah gol
        System.out.print("Masukkan jumlah gol ke gawang lawan: ");
        int golKeGawangLawan = scanner.nextInt();
        System.out.print("Masukkan jumlah gol ke gawang sendiri: ");
        int golKeGawangSendiri = scanner.nextInt();

        // Memanggil fungsi skor dan mencetak hasilnya
        String hasil = skor(golKeGawangLawan, golKeGawangSendiri);
        System.out.println("Hasil pertandingan: " + hasil);

        scanner.close();
    }
}
