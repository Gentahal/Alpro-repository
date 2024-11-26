import java.util.Scanner;

public class Audisi {
    // Prosedur untuk menentukan apakah penyanyi lolos audisi
    public static void audisi(String vote1, String vote2, String vote3) {
        // Menghitung jumlah suara "yes"
        int countYes = 0;
        
        // Menghitung suara "yes" dari setiap juri
        if (vote1.equals("yes")) countYes++;
        if (vote2.equals("yes")) countYes++;
        if (vote3.equals("yes")) countYes++;
        
        // Menentukan apakah penyanyi lolos atau tidak
        if (countYes >= 2) {
            System.out.println("lolos");
        } else {
            System.out.println("tidak lolos");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Menerima input suara dari tiga juri
        System.out.print("Masukkan suara juri 1 (yes/no): ");
        String vote1 = scanner.next();
        System.out.print("Masukkan suara juri 2 (yes/no): ");
        String vote2 = scanner.next();
        System.out.print("Masukkan suara juri 3 (yes/no): ");
        String vote3 = scanner.next();
        
        // Memanggil prosedur audisi untuk menentukan lolos atau tidak
        audisi(vote1, vote2, vote3);
        
        scanner.close();
    }
}
