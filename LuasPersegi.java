import java.util.*;

public class LuasPersegi {
    public static void hitungLuasPersegi(int sisi) {
        int luas = sisi * sisi;
        System.out.println("Luas persegi dengan sisi " + sisi + " adalah " + luas);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan panjang sisi persegi: ");
        int sisi = scanner.nextInt();

        // Memanggil prosedur untuk menghitung luas persegi
        hitungLuasPersegi(sisi);
    }

    
}
