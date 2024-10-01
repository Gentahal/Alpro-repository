import java.util.Scanner;

public class TigaTp {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah mil:: ");

        double mm = input.nextDouble();

        double a = mm * 1.6;

        System.out.println(mm + " Mil sama dengan " + a + " Kilometer");
    }
}
