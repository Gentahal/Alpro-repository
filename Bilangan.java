import java.util.Scanner;

public class Bilangan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan bilangan pertama: ");
        int satu = input.nextInt();
        
        System.out.print("Masukkan bilangan kedua: ");
        int dua = input.nextInt();
        
        System.out.print("Masukkan bilangan ketiga: ");
        int tiga = input.nextInt();

        if (satu % 2 != 0 && dua % 2 != 0 && tiga % 2 != 0) {
            System.out.println("ganjil");
        } else if (satu % 2 == 0 && dua % 2 == 0 && tiga % 2 == 0) {
            System.out.println("genap");
        } else {
            System.out.println("bukan ganjil atau genap");
        }

        input.close();
    }
}
