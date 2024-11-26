import java.util.Scanner;

public class TetanggaPeta {
    public static boolean isTetangga(char daerah1, char daerah2) {
        // Logika hubungan bertetangga manual
        if ((daerah1 == 'A' && (daerah2 == 'B' || daerah2 == 'C')) ||
            (daerah1 == 'B' && (daerah2 == 'A' || daerah2 == 'D')) ||
            (daerah1 == 'C' && (daerah2 == 'A' || daerah2 == 'E')) ||
            (daerah1 == 'D' && daerah2 == 'B') ||
            (daerah1 == 'E' && daerah2 == 'C') ||

            // Hubungan sebaliknya untuk memastikan simetri
            (daerah2 == 'A' && (daerah1 == 'B' || daerah1 == 'C')) ||
            (daerah2 == 'B' && (daerah1 == 'A' || daerah1 == 'D')) ||
            (daerah2 == 'C' && (daerah1 == 'A' || daerah1 == 'E')) ||
            (daerah2 == 'D' && daerah1 == 'B') ||
            (daerah2 == 'E' && daerah1 == 'C')) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input dua nama daerah
        System.out.print("Masukkan nama daerah pertama (A-E): ");
        char daerah1 = scanner.next().charAt(0);
        System.out.print("Masukkan nama daerah kedua (A-E): ");
        char daerah2 = scanner.next().charAt(0);

        // Memanggil method isTetangga dan mencetak hasil
        boolean hasil = isTetangga(daerah1, daerah2);
        System.out.println("Apakah " + daerah1 + " dan " + daerah2 + " bertetangga? " + hasil);

        scanner.close();
    }
}
