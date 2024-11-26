import java.util.Scanner;

public class SistemPerpustakaan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Buku buku1 = new Buku(101, "Pemrograman Java", "John Doe");
        Buku buku2 = new Buku(102, "Struktur Data", "Alice Smith");
        Buku buku3 = new Buku(103, "Basis Data", "Bob Johnson");
        Buku buku4 = new Buku(104, "Algoritma Pemrograman", "David Miller");
        Buku buku5 = new Buku(105, "Pemrograman Web", "Jane Adams");

        boolean running = true;

        while (running) {
            System.out.println("Menu Utama:");
            System.out.println("1. Daftar Buku");
            System.out.println("2. Peminjaman Buku");
            System.out.println("3. Pengembalian Buku");
            System.out.println("4. Daftar Buku yang Dipinjam");
            System.out.println("0. Keluar");
            System.out.print("Masukkan pilihan: ");
            int pilihan = scanner.nextInt();
            scanner.nextLine(); 

            switch (pilihan) {
                case 1:
                    System.out.println("Daftar Buku:");
                    buku1.tampilkanInfoBuku();
                    buku2.tampilkanInfoBuku();
                    buku3.tampilkanInfoBuku();
                    buku4.tampilkanInfoBuku();
                    buku5.tampilkanInfoBuku();
                    break;

                case 2:
                    System.out.println("Peminjaman Buku");
                    System.out.print("Masukkan nama peminjam: ");
                    String peminjam = scanner.nextLine();
                    System.out.print("Masukkan ID buku: ");
                    int idBukuPinjam = scanner.nextInt();
                    System.out.print("Masukkan jumlah hari peminjaman: ");
                    int jumlahHari = scanner.nextInt();

                    if (idBukuPinjam == buku1.idBuku) {
                        buku1.pinjamBuku(peminjam, jumlahHari);
                    } else if (idBukuPinjam == buku2.idBuku) {
                        buku2.pinjamBuku(peminjam, jumlahHari);
                    } else if (idBukuPinjam == buku3.idBuku) {
                        buku3.pinjamBuku(peminjam, jumlahHari);
                    } else if (idBukuPinjam == buku4.idBuku) {
                        buku4.pinjamBuku(peminjam, jumlahHari);
                    } else if (idBukuPinjam == buku5.idBuku) {
                        buku5.pinjamBuku(peminjam, jumlahHari);
                    } else {
                        System.out.println("ID Buku tidak ditemukan.");
                    }
                    break;

                case 3:
                    System.out.println("Pengembalian Buku");
                    System.out.print("Masukkan nama peminjam: ");
                    String namaPengembali = scanner.nextLine();
                    System.out.print("Masukkan ID buku: ");
                    int idBukuKembali = scanner.nextInt();

                    if (idBukuKembali == buku1.idBuku && buku1.peminjam.equals(namaPengembali)) {
                        buku1.kembalikanBuku();
                    } else if (idBukuKembali == buku2.idBuku && buku2.peminjam.equals(namaPengembali)) {
                        buku2.kembalikanBuku();
                    } else if (idBukuKembali == buku3.idBuku && buku3.peminjam.equals(namaPengembali)) {
                        buku3.kembalikanBuku();
                    } else if (idBukuKembali == buku4.idBuku && buku4.peminjam.equals(namaPengembali)) {
                        buku4.kembalikanBuku();
                    } else if (idBukuKembali == buku5.idBuku && buku5.peminjam.equals(namaPengembali)) {
                        buku5.kembalikanBuku();
                    } else {
                        System.out.println("Pengembalian gagal. Data tidak cocok.");
                    }
                    break;

                case 4:
                    System.out.println("Daftar Buku yang Dipinjam:");
                    if (buku1.status.equals("Dipinjam")) {
                        buku1.tampilkanInfoBuku();
                    }
                    if (buku2.status.equals("Dipinjam")) {
                        buku2.tampilkanInfoBuku();
                    }
                    if (buku3.status.equals("Dipinjam")) {
                        buku3.tampilkanInfoBuku();
                    }
                    if (buku4.status.equals("Dipinjam")) {
                        buku4.tampilkanInfoBuku();
                    }
                    if (buku5.status.equals("Dipinjam")) {
                        buku5.tampilkanInfoBuku();
                    }
                    break;

                case 0:
                    System.out.println("Keluar dari program...");
                    running = false;
                    break;

                default:
                    System.out.println("Pilihan tidak valid.");
                    break;
            }
        }

        scanner.close();
    }
}

class Buku {
    int idBuku;
    String judul;
    String pengarang;
    String status;  
    String peminjam;
    int sisaHari;

    Buku(int idBuku, String judul, String pengarang) {
        this.idBuku = idBuku;
        this.judul = judul;
        this.pengarang = pengarang;
        this.status = "Tersedia";
        this.peminjam = "";
        this.sisaHari = 0;
    }

    public void pinjamBuku(String peminjam, int jumlahHari) {
        if (status.equals("Tersedia")) {
            this.peminjam = peminjam;
            this.sisaHari = jumlahHari;
            this.status = "Dipinjam";
            System.out.println("Buku \"" + judul + "\" berhasil dipinjam oleh " + peminjam + " selama " + jumlahHari + " hari.");
        } else {
            System.out.println("Buku \"" + judul + "\" sedang dipinjam.");
        }
    }

    public void kembalikanBuku() {
        if (status.equals("Dipinjam")) {
            this.peminjam = "";
            this.sisaHari = 0;
            this.status = "Tersedia";
            System.out.println("Buku \"" + judul + "\" berhasil dikembalikan.");
        } else {
            System.out.println("Buku \"" + judul + "\" tidak sedang dipinjam.");
        }
    }

    public void tampilkanInfoBuku() {
        System.out.println("ID Buku: " + idBuku);
        System.out.println("Judul: " + judul);
        System.out.println("Pengarang: " + pengarang);
        System.out.println("Status: " + status);
        if (status.equals("Dipinjam")) {
            System.out.println("Dipinjam oleh: " + peminjam);
            System.out.println("Sisa hari: " + sisaHari);
        }
        System.out.println();
    }
}