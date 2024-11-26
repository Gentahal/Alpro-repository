import java.util.Scanner;

public class Pertempuran {
    public static void duel(int turki, int mongol) {
        // Menghitung kekuatan efektif masing-masing pasukan
        int kekuatanTurki = turki * 3; // 1 prajurit Turki = 3 prajurit Mongol
        int kekuatanMongol = mongol;

        // Menentukan hasil pertempuran
        if (kekuatanTurki > kekuatanMongol) {
            System.out.println("turki menang");
        } else if (kekuatanTurki < kekuatanMongol) {
            System.out.println("mongol menang");
        } else {
            System.out.println("imbang");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input jumlah prajurit Turki
        System.out.print("Masukkan jumlah prajurit Turki: ");
        int turki = scanner.nextInt();

        // Input jumlah prajurit Mongol
        System.out.print("Masukkan jumlah prajurit Mongol: ");
        int mongol = scanner.nextInt();

        // Panggil prosedur duel
        duel(turki, mongol);

        scanner.close();
    }
}
