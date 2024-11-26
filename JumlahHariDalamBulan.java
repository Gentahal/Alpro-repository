import java.util.Scanner;

public class JumlahHariDalamBulan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan tahun: ");
        int tahun = scanner.nextInt();

        System.out.print("Masukkan nama bulan: ");
        String bulan = scanner.next();

        if (bulan.length() < 3 || !Character.isUpperCase(bulan.charAt(0))) {
            System.out.println(bulan + " bukan nama bulan yang benar");
            return;
        }

        bulan = bulan.substring(0, 3);

        int jumlahHari;
        switch (bulan) {
            case "Jan": case "Mar": case "Mei": case "Jul": case "Agu": case "Okt": case "Des":
                jumlahHari = 31;
                break;
            case "Apr": case "Jun": case "Sep": case "Nov":
                jumlahHari = 30;
                break;
            case "Feb":
                jumlahHari = (tahun % 4 == 0 && (tahun % 100 != 0 || tahun % 400 == 0)) ? 29 : 28;
                break;
            default:
                System.out.println(bulan + " bukan nama bulan yang benar");
                return;
        }

        System.out.println(bulan + " " + tahun + " memiliki " + jumlahHari + " hari");

        scanner.close();
    }
}