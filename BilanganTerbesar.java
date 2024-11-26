import java.util.Scanner;

public class BilanganTerbesar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan bilangan pertama: ");
        int satu = input.nextInt();
        
        System.out.print("Masukkan bilangan kedua: ");
        int dua = input.nextInt();
        
        System.out.print("Masukkan bilangan ketiga: ");
        int tiga = input.nextInt();
        
        System.out.print("Masukkan bilangan keempat: ");
        int empat = input.nextInt();

        int terbesar = satu;
        
        if (dua > terbesar) {
            terbesar = dua;
        }
        if (tiga > terbesar) {
            terbesar = tiga;
        }
        if (empat > terbesar) {
            terbesar = empat;
        }

        System.out.println("Bilangan terbesar: " + terbesar);

        input.close();
    }
    
}
