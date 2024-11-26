import java.util.Scanner;

public class TigaSoal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan bilangan bulat: ");
        int bilangan = scanner.nextInt();
        
        boolean negatif = bilangan < 0;
        
        System.out.println(negatif);
        
        scanner.close();
    }
}
