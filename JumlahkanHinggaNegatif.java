import java.util.Scanner;

public class JumlahkanHinggaNegatif {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int total = 0;
        int bilangan;

        System.out.print("Masukkan bilangan bulat dan negatif di akhir");

        while (true) {
            bilangan = input.nextInt();
            
            if (bilangan < 0) {
                break;
            }
            
            total += bilangan;
        }

        System.out.println(total);
    }
}
