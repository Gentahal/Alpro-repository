import java.util.Scanner;

public class GradeSoal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int nilai;
        System.out.println("Masukan nilai: ");
        nilai =  input.nextInt();

        if (nilai > 100) {
            System.out.println("A");
        } else if (80 <= nilai && nilai <= 90 ) {
            System.out.println("B");
        } else if (70 <= nilai && nilai <= 80) {
            System.out.println("C");
        } else if (60 <= nilai && nilai <= 70) {
            System.out.println("D");
        } else if (nilai <= 60){
            System.out.println("E");
        } else {
            System.out.println("A");
        }
    }
}
