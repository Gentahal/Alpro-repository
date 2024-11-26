import java.util.*;

public class Cumlaude {
    // Fungsi untuk menentukan predikat Cumlaude
    public static boolean cekCumlaude(double ipk, int masaStudi, boolean publikasi) {
        return ipk >= 3.51 && ipk <= 4.00 && masaStudi <= 8 && publikasi;
    }

    // Fungsi untuk menentukan predikat Sangat Memuaskan
    public static boolean cekSangatMemuaskan(double ipk, int masaStudi, boolean publikasi) {
        return ipk >= 2.76 && ipk <= 3.50 && masaStudi <= 14;
    }

    // Fungsi untuk menentukan predikat Memuaskan
    public static boolean cekMemuaskan(double ipk, int masaStudi, boolean publikasi) {
        return ipk >= 2.00 && ipk <= 2.75 && masaStudi <= 14;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Masukkan IPK, masa studi, dan status publikasi (true/false):");
        double ipk = input.nextDouble();
        int masaStudi = input.nextInt();
        boolean publikasi = input.nextBoolean();

        if (cekCumlaude(ipk, masaStudi, publikasi)) {
            System.out.println("Predikat: Cumlaude");
        } else if (cekSangatMemuaskan(ipk, masaStudi, publikasi)) {
            System.out.println("Predikat: Sangat Memuaskan");
        } else if (cekMemuaskan(ipk, masaStudi, publikasi)) {
            System.out.println("Predikat: Memuaskan");
        } else {
            System.out.println("Tidak memenuhi syarat predikat.");
        }
    }
}
