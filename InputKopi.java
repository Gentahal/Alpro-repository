import java.util.Scanner;

public class InputKopi {
    // // Variabel untuk menyimpan nama dan harga kopi
    // static String namaKopi1, namaKopi2, namaKopi3, namaKopi4, namaKopi5;
    // static int hargaKopi1, hargaKopi2, hargaKopi3, hargaKopi4, hargaKopi5;

    // // Prosedur untuk menampilkan menu kopi
    // public static void tampilkanMenuKopi() {
    //     System.out.println("====== MENU KOPI ======");
    //     System.out.println("1. " + namaKopi1 + " - Rp " + hargaKopi1);
    //     System.out.println("2. " + namaKopi2 + " - Rp " + hargaKopi2);
    //     System.out.println("3. " + namaKopi3 + " - Rp " + hargaKopi3);
    //     System.out.println("4. " + namaKopi4 + " - Rp " + hargaKopi4);
    //     System.out.println("5. " + namaKopi5 + " - Rp " + hargaKopi5);
    //     System.out.println("=======================");
    // }

    // public static void main(String[] args) {
    //     Scanner scanner = new Scanner(System.in);

    //     // Meminta input untuk setiap jenis kopi
    //     System.out.print("Masukkan nama kopi pertama: ");
    //     namaKopi1 = scanner.nextLine();
    //     System.out.print("Masukkan harga " + namaKopi1 + ": Rp ");
    //     hargaKopi1 = scanner.nextInt();
    //     scanner.nextLine(); // Buang newline

    //     System.out.print("Masukkan nama kopi kedua: ");
    //     namaKopi2 = scanner.nextLine();
    //     System.out.print("Masukkan harga " + namaKopi2 + ": Rp ");
    //     hargaKopi2 = scanner.nextInt();
    //     scanner.nextLine(); // Buang newline

    //     System.out.print("Masukkan nama kopi ketiga: ");
    //     namaKopi3 = scanner.nextLine();
    //     System.out.print("Masukkan harga " + namaKopi3 + ": Rp ");
    //     hargaKopi3 = scanner.nextInt();
    //     scanner.nextLine(); // Buang newline

    //     System.out.print("Masukkan nama kopi keempat: ");
    //     namaKopi4 = scanner.nextLine();
    //     System.out.print("Masukkan harga " + namaKopi4 + ": Rp ");
    //     hargaKopi4 = scanner.nextInt();
    //     scanner.nextLine(); // Buang newline

    //     System.out.print("Masukkan nama kopi kelima: ");
    //     namaKopi5 = scanner.nextLine();
    //     System.out.print("Masukkan harga " + namaKopi5 + ": Rp ");
    //     hargaKopi5 = scanner.nextInt();

    //     // Menampilkan menu kopi
    //     tampilkanMenuKopi();

    //     // Meminta pengguna untuk memilih kopi
    //     System.out.print("Silakan pilih nomor kopi yang ingin dipesan: ");
    //     int pilihan = scanner.nextInt();

    //     // Menampilkan konfirmasi pesanan berdasarkan pilihan
    //     String namaKopiTerpilih = "";
    //     switch (pilihan) {
    //         case 1:
    //             namaKopiTerpilih = namaKopi1;
    //             break;
    //         case 2:
    //             namaKopiTerpilih = namaKopi2;
    //             break;
    //         case 3:
    //             namaKopiTerpilih = namaKopi3;
    //             break;
    //         case 4:
    //             namaKopiTerpilih = namaKopi4;
    //             break;
    //         case 5:
    //             namaKopiTerpilih = namaKopi5;
    //             break;
    //         default:
    //             System.out.println("Pilihan tidak valid.");
    //             return;
    //     }
    //     System.out.println("Anda telah memesan " + namaKopiTerpilih);
    // }


    // Variabel untuk menyimpan nama dan harga kopi
    static String namaKopi1, namaKopi2, namaKopi3, namaKopi4, namaKopi5;
    static int hargaKopi1, hargaKopi2, hargaKopi3, hargaKopi4, hargaKopi5;

    // Prosedur untuk menampilkan menu kopi
    public static void tampilkanMenuKopi() {
        System.out.println("====== MENU KOPI ======");
        System.out.println("1. " + namaKopi1 + " - Rp " + hargaKopi1);
        System.out.println("2. " + namaKopi2 + " - Rp " + hargaKopi2);
        System.out.println("3. " + namaKopi3 + " - Rp " + hargaKopi3);
        System.out.println("4. " + namaKopi4 + " - Rp " + hargaKopi4);
        System.out.println("5. " + namaKopi5 + " - Rp " + hargaKopi5);
        System.out.println("=======================");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean selesai = false;

        while (!selesai) {
            // Menampilkan menu awal
            System.out.println("====== MENU UTAMA ======");
            System.out.println("1. Pesan Kopi");
            System.out.println("2. Keluar");
            System.out.println("========================");
            System.out.print("Pilih opsi: ");
            int opsi = scanner.nextInt();
            scanner.nextLine(); // Buang newline setelah input angka

            if (opsi == 1) {
                // Meminta input untuk setiap jenis kopi
                System.out.print("Masukkan nama kopi pertama: ");
                namaKopi1 = scanner.nextLine();
                System.out.print("Masukkan harga " + namaKopi1 + ": Rp ");
                hargaKopi1 = scanner.nextInt();
                scanner.nextLine();

                System.out.print("Masukkan nama kopi kedua: ");
                namaKopi2 = scanner.nextLine();
                System.out.print("Masukkan harga " + namaKopi2 + ": Rp ");
                hargaKopi2 = scanner.nextInt();
                scanner.nextLine();

                System.out.print("Masukkan nama kopi ketiga: ");
                namaKopi3 = scanner.nextLine();
                System.out.print("Masukkan harga " + namaKopi3 + ": Rp ");
                hargaKopi3 = scanner.nextInt();
                scanner.nextLine();

                System.out.print("Masukkan nama kopi keempat: ");
                namaKopi4 = scanner.nextLine();
                System.out.print("Masukkan harga " + namaKopi4 + ": Rp ");
                hargaKopi4 = scanner.nextInt();
                scanner.nextLine();

                System.out.print("Masukkan nama kopi kelima: ");
                namaKopi5 = scanner.nextLine();
                System.out.print("Masukkan harga " + namaKopi5 + ": Rp ");
                hargaKopi5 = scanner.nextInt();

                // Menampilkan menu kopi yang telah diinput
                tampilkanMenuKopi();

                // Meminta pengguna untuk memilih kopi
                System.out.print("Silakan pilih nomor kopi yang ingin dipesan: ");
                int pilihan = scanner.nextInt();

                // Menampilkan konfirmasi pesanan berdasarkan pilihan
                String namaKopiTerpilih = "";
                switch (pilihan) {
                    case 1:
                        namaKopiTerpilih = namaKopi1;
                        break;
                    case 2:
                        namaKopiTerpilih = namaKopi2;
                        break;
                    case 3:
                        namaKopiTerpilih = namaKopi3;
                        break;
                    case 4:
                        namaKopiTerpilih = namaKopi4;
                        break;
                    case 5:
                        namaKopiTerpilih = namaKopi5;
                        break;
                    default:
                        System.out.println("Pilihan tidak valid.");
                        continue;
                }
                System.out.println("Anda telah memesan " + namaKopiTerpilih);
            } else if (opsi == 2) {
                System.out.println("Terima kasih! Program selesai.");
                selesai = true; // Mengakhiri loop
            } else {
                System.out.println("Opsi tidak valid. Silakan coba lagi.");
            }
        }
        scanner.close();
    }
}
