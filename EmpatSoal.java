import java.util.Scanner;

public class EmpatSoal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah koin drachma: ");
        int nilai = scanner.nextInt();
        
        int atticTallent = nilai / (60 * 100); 
        int remainingDrachma = nilai % (60 * 100); 

        int mine = remainingDrachma / 100; 
        remainingDrachma %= 100; 

        int oboli = remainingDrachma * 6; 

        System.out.println(atticTallent + " " + mine + " " + oboli);
    }
}
