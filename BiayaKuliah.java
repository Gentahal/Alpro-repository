public class BiayaKuliah {
    public static void main(String[] args) {
        // Inisialisasi variabel awal
        double biayaSekarang = 10000000; // Rp10.000.000
        double kenaikan = 0.06; // Kenaikan 6% setiap tahun
        double biayaTahunKe10 = biayaSekarang; // Mulai dari biaya saat ini
        double totalBiayaEmpatTahun = 0;

        // Menghitung biaya kuliah sampai tahun ke-10
        int tahun = 1;
        while (tahun <= 10) {
            biayaTahunKe10 = biayaTahunKe10 + (biayaTahunKe10 * kenaikan); // Kenaikan tiap tahun
            tahun = tahun + 1; // Manual increment untuk tiap tahun
        }

        // Menampilkan biaya pada tahun ke-10
        System.out.printf("Biaya kuliah pada tahun ke-10: Rp%.0f%n", biayaTahunKe10);

        // Menghitung total biaya untuk empat tahun setelah tahun ke-10
        tahun = 1;
        while (tahun <= 4) {
            totalBiayaEmpatTahun = totalBiayaEmpatTahun + biayaTahunKe10; // Tambahkan biaya setiap tahun
            biayaTahunKe10 = biayaTahunKe10 + (biayaTahunKe10 * kenaikan); // Kenaikan tiap tahun setelah tahun ke-10
            tahun = tahun + 1; // Manual increment untuk tiap tahun
        }

        // Menampilkan total biaya untuk 4 tahun kuliah setelah tahun ke-10
        System.out.printf("Total biaya untuk empat tahun setelah tahun ke-10: Rp%.0f%n", totalBiayaEmpatTahun);
    }
}
