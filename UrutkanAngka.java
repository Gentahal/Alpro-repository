import java.util.Scanner;

public class UrutkanAngka {
    public static void urutkanAngka(int a, int b, int c) {
        // Menggunakan if-else untuk membandingkan dan mengurutkan angka
        if (a > b) {
            int temp = a;
            a = b;
            b = temp;
        }
        if (a > c) {
            int temp = a;
            a = c;
            c = temp;
        }
        if (b > c) {
            int temp = b;
            b = c;
            c = temp;
        }
        
        // Menampilkan angka-angka yang telah diurutkan
        System.out.println(a + " " + b + " " + c);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Menerima input 3 bilangan bulat
        System.out.print("Masukkan angka pertama: ");
        int a = scanner.nextInt();
        System.out.print("Masukkan angka kedua: ");
        int b = scanner.nextInt();
        System.out.print("Masukkan angka ketiga: ");
        int c = scanner.nextInt();
        
        // Memanggil method untuk mengurutkan angka
        urutkanAngka(a, b, c);

        scanner.close();
    }
}
