import java.util.*;

public class HitungKeramik {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int luas, sisi;
        double luaskeramik, jumlahKeramik;

        System.out.println("masukan luas");
        luas = input.nextInt();

        System.out.println("Masukan sisi");
        sisi = input.nextInt();

        luaskeramik = (sisi * sisi) /1000;

        jumlahKeramik = luas / luaskeramik;

        double hasilBulat = jumlahKeramik;

        if (jumlahKeramik > hasilBulat) {
            hasilBulat = hasilBulat + 1;
            hasilBulat ++;
        }

        System.out.println(hasilBulat);

    }
}
