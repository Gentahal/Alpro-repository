import java.util.*;

public class Pesan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukan Pesan");
        String pesan = input.nextLine();

        System.out.println("berapa kali");
        int jumlah = input.nextInt();

        tampilkanPesan(pesan, jumlah);
    }

    public static void tampilkanPesan(String pesan, int jumlah) {
        for (int i = 0; i < jumlah; i++) {
            System.out.println(pesan);
        }
    }
}
