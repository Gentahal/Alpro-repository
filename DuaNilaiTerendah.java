import java.util.Scanner;

public class DuaNilaiTerendah {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Jumlah siswa: ");
        int jumlahSiswa = scanner.nextInt();
        scanner.nextLine();  

        String namaTerendah = "";
        String namaKeduaTerendah = "";
        int nilaiTerendah = 0;
        int nilaiKeduaTerendah = 0;

        System.out.print("Siswa 1: ");
        String nama = scanner.next();
        int nilai = scanner.nextInt();
        namaTerendah = nama;
        nilaiTerendah = nilai;

        System.out.print("Siswa 2: ");
        nama = scanner.next();
        nilai = scanner.nextInt();

        if (nilai < nilaiTerendah) {
            namaKeduaTerendah = namaTerendah;
            nilaiKeduaTerendah = nilaiTerendah;
            namaTerendah = nama;
            nilaiTerendah = nilai;
        } else {
            namaKeduaTerendah = nama;
            nilaiKeduaTerendah = nilai;
        }

        int siswaSaatIni = 3;
        while (siswaSaatIni <= jumlahSiswa) {
            System.out.print("Siswa " + siswaSaatIni + ": ");
            nama = scanner.next();
            nilai = scanner.nextInt();

            if (nilai < nilaiTerendah) {
                namaKeduaTerendah = namaTerendah;
                nilaiKeduaTerendah = nilaiTerendah;
                namaTerendah = nama;
                nilaiTerendah = nilai;
            } else if (nilai < nilaiKeduaTerendah) {
                namaKeduaTerendah = nama;
                nilaiKeduaTerendah = nilai;
            }

            siswaSaatIni = siswaSaatIni + 1;
        }

        System.out.println("Siswa dengan nilai terendah: " + namaTerendah);
        System.out.println("Siswa dengan nilai kedua terendah: " + namaKeduaTerendah);

        scanner.close();
    }
}
