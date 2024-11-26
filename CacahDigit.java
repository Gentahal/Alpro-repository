import java.util.Scanner;

public class CacahDigit {
    public static void cacah(int x) {
        // Mengubah bilangan X menjadi string untuk memudahkan pemrosesan digit
        String xStr = Integer.toString(x);

        // Menampilkan setiap digit dengan spasi
        for (int i = 0; i < xStr.length(); i++) {
            System.out.print(xStr.charAt(i)); // Menampilkan digit
            if (i < xStr.length() - 1) {
                System.out.print(" "); // Menambahkan spasi setelah digit kecuali digit terakhir
            }
        }
        System.out.println(); // Untuk pindah baris setelah semua digit ditampilkan
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Menerima input bilangan bulat positif
        System.out.print("Masukkan bilangan bulat positif X: ");
        int x = scanner.nextInt();

        // Memanggil prosedur cacah untuk mencacah digit bilangan X
        cacah(x);

        scanner.close();
    }
}
