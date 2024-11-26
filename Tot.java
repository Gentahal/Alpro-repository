import java.util.Scanner;

public class Tot {
    public static int TOT(String a, String b, String c) {
        int totalPoin = 0;

        // Cek jika semua anggota menjawab salah
        if (a.equals("T") && b.equals("T") && c.equals("T")) {
            return totalPoin; // Jika semua salah, poin tetap 0
        }

        // Menambah poin untuk setiap anggota yang menjawab benar
        if (a.equals("O")) {
            totalPoin++;
        }
        if (b.equals("O")) {
            totalPoin++;
        }
        if (c.equals("O")) {
            totalPoin++;
        }

        return totalPoin;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Membaca input jawaban dari ketiga anggota tim
        System.out.print("Masukkan jawaban anggota pertama (O/T): ");
        String a = scanner.next();
        System.out.print("Masukkan jawaban anggota kedua (O/T): ");
        String b = scanner.next();
        System.out.print("Masukkan jawaban anggota ketiga (O/T): ");
        String c = scanner.next();

        // Panggil metode TOT dan tampilkan hasilnya
        int totalPoin = TOT(a, b, c);
        System.out.println("Total Poin: " + totalPoin);

        scanner.close();
    }
}
