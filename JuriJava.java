import java.util.Scanner;

public class JuriJava {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int countYes = 0;

        System.out.println("Juri Satu");
        String juriSatu = input.next();

        System.out.println("Juri Dua");
        String juriDua = input.next();

        System.out.println("Juri Tiga");
        String juriTiga = input.next();

        if (juriSatu == "yes") {
            countYes ++;
        } if (juriDua == "yes") {
            countYes ++;
        } if (juriTiga == "yes") {
            countYes ++;
        }

        if (countYes >= 2) {
            System.out.println("LOLOS");
        } else {
            System.out.println("Tidak LOLOS");
        }
    }
}
