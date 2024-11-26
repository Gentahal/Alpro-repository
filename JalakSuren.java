import java.util.HashSet;
import java.util.Scanner;

public class JalakSuren {
    public static boolean cekLimaJenisSuara(int n, String[] suara) {
        // Set untuk mencatat jenis suara unik yang dikeluarkan
        HashSet<String> jenisSuara = new HashSet<>();

        // Menambahkan suara ke dalam set
        for (String s : suara) {
            if (s.equals("JA") || s.equals("BE") || s.equals("CI") || s.equals("JE") || s.equals("LO")) {
                jenisSuara.add(s);
            }
        }

        // Jika ukuran set sama dengan 5, berarti kelima suara unik dikeluarkan
        return jenisSuara.size() == 5;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input jumlah suara yang didengar
        System.out.print("Masukkan jumlah suara yang didengar (n): ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Mengonsumsi newline setelah angka

        // Input suara-suara yang didengar
        String[] suara = new String[n];
        System.out.println("Masukkan kode suara (JA, BE, CI, JE, LO):");
        for (int i = 0; i < n; i++) {
            suara[i] = scanner.nextLine();
        }

        // Memanggil method cekLimaJenisSuara dan mencetak hasilnya
        boolean hasil = cekLimaJenisSuara(n, suara);
        System.out.println("Apakah burung mencuitkan kelima jenis suara? " + hasil);

        scanner.close();
    }
}
