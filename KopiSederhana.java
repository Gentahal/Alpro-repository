import java.util.Scanner;

public class KopiSederhana {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Masukkan jumlah gula (n), kopi (m), gula per cangkir (x), kopi per cangkir (y): ");
        
        int n = input.nextInt(); 
        int m = input.nextInt(); 
        int x = input.nextInt(); 
        int y = input.nextInt(); 
        
        int cangkir = 0;
        
        while (n >= x && m >= y) {
            n = n - x;
            m = m - y;
            
            cangkir = cangkir + 1;
        }

        System.out.println("Jumlah cangkir kopi yang bisa dibuat: " + cangkir);
        
        input.close();
    }
}
