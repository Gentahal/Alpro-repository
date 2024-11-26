import java.util.*;

public class HitungBus {
    // Fungsi untuk menghitung jumlah bus
    public static int hitungJumlahBus(int penumpang, int kapasitas) {
        int jumlahBus = penumpang / kapasitas; // Pembagian
        if (penumpang % kapasitas != 0) { // Jika ada sisa, tambah 1 bus
            jumlahBus++;
        }
        return jumlahBus;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Bagian 2: Menghitung jumlah bus
        System.out.println("Masukkan jumlah penumpang dan kapasitas bus:");
        int penumpang = input.nextInt();
        int kapasitas = input.nextInt();

        int jumlahBus = hitungJumlahBus(penumpang, kapasitas);
        System.out.println("Jumlah bus yang diperlukan: " + jumlahBus + " bus");
    }
}
