package MiniTugas;

import java.util.Scanner;

public class ServiceMotor {
    // Array untuk menyimpan data
    static String[] namaPelanggan = new String[100];
    static String[] jamMasuk = new String[100];
    static int[] estimasiLama = new int[100];
    static String[] estimasiSelesai = new String[100];
    static int jumlahData = 0; // Menyimpan jumlah data yang ada

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pilihan;

        do {
            // Menu utama
            System.out.println("\n--- Aplikasi Service Motor ---");
            System.out.println("1. Tambah Data Service");
            System.out.println("2. Hapus Data Service");
            System.out.println("3. Edit Lama Service");
            System.out.println("4. Tampilkan Semua Data");
            System.out.println("5. Tampilkan Waktu Pengerjaan Terlama");
            System.out.println("6. Keluar");
            System.out.print("Pilihan: ");
            pilihan = scanner.nextInt();
            scanner.nextLine(); // Membersihkan buffer

            switch (pilihan) {
                case 1:
                    tambahData(scanner);
                    break;
                case 2:
                    hapusData(scanner);
                    break;
                case 3:
                    editData(scanner);
                    break;
                case 4:
                    tampilkanSemuaData();
                    break;
                case 5:
                    tampilkanTerlama();
                    break;
                case 6:
                    System.out.println("Keluar dari aplikasi.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
                    break;
            }
            
        } while (pilihan != 6);
    }

    static void tambahData(Scanner scanner) {
        System.out.print("Masukkan nama pelanggan: ");
        namaPelanggan[jumlahData] = scanner.nextLine();

        System.out.print("Masukkan jam masuk (format HH:mm): ");
        jamMasuk[jumlahData] = scanner.nextLine();

        System.out.print("Masukkan estimasi lama service (jam): ");
        estimasiLama[jumlahData] = scanner.nextInt();
        scanner.nextLine(); // Membersihkan buffer

        // Hitung estimasi waktu selesai
        estimasiSelesai[jumlahData] = hitungEstimasiSelesai(jamMasuk[jumlahData], estimasiLama[jumlahData]);

        jumlahData++;
        System.out.println("Data berhasil ditambahkan.");
    }

    static void hapusData(Scanner scanner) {
        System.out.print("Masukkan nama pelanggan yang ingin dihapus: ");
        String nama = scanner.nextLine();
        boolean ditemukan = false;

        for (int i = 0; i < jumlahData; i++) {
            if (namaPelanggan[i].equalsIgnoreCase(nama)) {
                ditemukan = true;
                // Geser data ke atas
                for (int j = i; j < jumlahData - 1; j++) {
                    namaPelanggan[j] = namaPelanggan[j + 1];
                    jamMasuk[j] = jamMasuk[j + 1];
                    estimasiLama[j] = estimasiLama[j + 1];
                    estimasiSelesai[j] = estimasiSelesai[j + 1];
                }
                jumlahData--;
                System.out.println("Data berhasil dihapus.");
                break;
            }
        }

        if (!ditemukan) {
            System.out.println("Data tidak ditemukan.");
        }
    }

    static void editData(Scanner scanner) {
        System.out.print("Masukkan nama pelanggan yang ingin diubah: ");
        String nama = scanner.nextLine();
        boolean ditemukan = false;

        for (int i = 0; i < jumlahData; i++) {
            if (namaPelanggan[i].equalsIgnoreCase(nama)) {
                ditemukan = true;
                System.out.print("Masukkan estimasi lama service baru (jam): ");
                estimasiLama[i] = scanner.nextInt();
                scanner.nextLine(); // Membersihkan buffer
                // Hitung ulang estimasi waktu selesai
                estimasiSelesai[i] = hitungEstimasiSelesai(jamMasuk[i], estimasiLama[i]);
                System.out.println("Data berhasil diubah.");
                break;
            }
        }

        if (!ditemukan) {
            System.out.println("Data tidak ditemukan.");
        }
    }

    static void tampilkanSemuaData() {
        if (jumlahData == 0) {
            System.out.println("Belum ada data.");
        } else {
            System.out.println("\n--- Daftar Semua Data Service ---");
            for (int i = 0; i < jumlahData; i++) {
                System.out.println((i + 1) + ". Nama: " + namaPelanggan[i] + ", Jam Masuk: " + jamMasuk[i] +
                                   ", Lama: " + estimasiLama[i] + " jam, Estimasi Selesai: " + estimasiSelesai[i]);
            }
        }
    }

    static void tampilkanTerlama() {
        if (jumlahData == 0) {
            System.out.println("Belum ada data.");
        } else {
            int indexTerlama = 0;
            for (int i = 1; i < jumlahData; i++) {
                if (estimasiLama[i] > estimasiLama[indexTerlama]) {
                    indexTerlama = i;
                }
            }
            System.out.println("\n--- Data dengan Waktu Pengerjaan Terlama ---");
            System.out.println("Nama: " + namaPelanggan[indexTerlama] + ", Jam Masuk: " + jamMasuk[indexTerlama] +
                               ", Lama: " + estimasiLama[indexTerlama] + " jam, Estimasi Selesai: " +
                               estimasiSelesai[indexTerlama]);
        }
    }

    static String hitungEstimasiSelesai(String jamMasuk, int lamaService) {
        String[] waktu = jamMasuk.split(":");
        int jam = Integer.parseInt(waktu[0]);
        int menit = Integer.parseInt(waktu[1]);

        jam += lamaService;
        if (jam >= 24) jam -= 24;

        return String.format("%02d:%02d", jam, menit);
    }
}
