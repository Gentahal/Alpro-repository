import java.util.Scanner;

public class PratikumTiga {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        double jariJari;
        double pi = 3.14;

        System.out.print("Masukan Jari Jari: ");
        jariJari = input.nextDouble();

        System.out.println("Lingkar Jari Jari: " + (pi * jariJari * jariJari));

        input.close();
    }
}
