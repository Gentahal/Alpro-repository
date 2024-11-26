import java.util.Scanner;

public class KonsekutifChecker {
    public static void konsekutif(int bilangan) {
        // Konversi bilangan menjadi string untuk memeriksa setiap digit
        String angka = Integer.toString(bilangan);
        boolean isKonsekutif = true;

        // Iterasi melalui digit-digit bilangan
        for (int i = 0; i < angka.length() - 1; i++) {
            int digitSekarang = Character.getNumericValue(angka.charAt(i));
            int digitBerikutnya = Character.getNumericValue(angka.charAt(i + 1));

            // Periksa apakah selisih antar digit adalah 1
            if (Math.abs(digitSekarang - digitBerikutnya) != 1) {
                isKonsekutif = false;
                break;
            }
        }

        // Output hasil
        System.out.println(isKonsekutif);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Masukkan bilangan dari pengguna
        System.out.print("Masukkan bilangan bulat positif: ");
        int bilangan = scanner.nextInt();

        // Panggil prosedur konsekutif
        konsekutif(bilangan);

        scanner.close();
    }
}
