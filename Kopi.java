import java.util.Scanner;

public class Kopi {
    // 4. Prosedur tampilkanMenuKopi
    public static void tampilkanMenuKopi() {
        System.out.println("====== MENU KOPI ======");
        System.out.println("1. Kopi Hitam - Rp 15.000");
        System.out.println("2. Kopi Susu - Rp 20.000");
        System.out.println("3. Cappuccino - Rp 25.000");
        System.out.println("4. Espresso - Rp 30.000");
        System.out.println("5. Mochaccino - Rp 35.000");
        System.out.println("=======================");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Memanggil prosedur tampilkanMenuKopi
        tampilkanMenuKopi();

        // Meminta pengguna untuk memasukkan nomor pilihan kopi
        System.out.print("Silakan pilih nomor kopi yang ingin dipesan: ");
        int pilihan = scanner.nextInt();

        // Menampilkan pesan konfirmasi pemesanan
        String namaKopi = "";
        switch (pilihan) {
            case 1:
                namaKopi = "Kopi Hitam";
                break;
            case 2:
                namaKopi = "Kopi Susu";
                break;
            case 3:
                namaKopi = "Cappuccino";
                break;
            case 4:
                namaKopi = "Espresso";
                break;
            case 5:
                namaKopi = "Mochaccino";
                break;
            default:
                System.out.println("Pilihan tidak valid.");
                return;
        }
        System.out.println("Anda telah memesan " + namaKopi);
    }
}
