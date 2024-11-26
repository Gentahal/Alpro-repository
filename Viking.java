import java.util.Scanner;

public class Viking {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukan Jumlah Viking");
        int viking = input.nextInt();

        System.out.println("Masukan Jumlah Saxon");
        int saxon = input.nextInt();

        int jumlahViking = viking * 4;
        int jumlahSaxon = saxon;


        if (jumlahViking > jumlahSaxon) {
            System.out.println("Viking Menang");
        } else if (jumlahSaxon > jumlahViking) {
            System.out.println("Saxon Menang");
        } else {
            System.out.println("Seri");
        }

    }
}
