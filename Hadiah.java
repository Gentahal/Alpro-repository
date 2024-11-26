import java.util.Scanner;

public class Hadiah {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukan Ranking Anak");
        int ranking = input.nextInt();

        if (ranking >= 1 && ranking <= 5) {
            System.out.println("Mendapat Hadiah");
        } else {
            System.out.println("Tidak Mendapat Hadiah");
        }
    }
}
