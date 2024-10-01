import java.util.Scanner;

public class DigitGanda {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Nilai Dua Digit: ");
        int n = scanner.nextInt();
        
        int digitPertama = n / 10;  
        int digitKedua = n % 10;    
                                        
        int hasil = (digitPertama * 1000) + (digitPertama * 100) + (digitKedua * 10) + digitKedua;
        
        System.out.println(hasil);
        
        scanner.close();
    }
}
