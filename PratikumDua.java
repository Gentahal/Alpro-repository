import java.util.Scanner;

public class PratikumDua {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a , b , c;

        System.out.println("Masukan Bilangan A");
        a = input.nextInt();

        System.out.println("Masukan Bilangan B");
        b = input.nextInt();

        c = a;
        a = b;
        b = c;

        System.out.println("Nilai A: " + a);
        System.out.println("Nilai B: " + b);

        input.close();

    }
}
