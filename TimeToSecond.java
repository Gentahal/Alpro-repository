import java.util.Scanner;

public class TimeToSecond {
    public static int toSeconds(int hours, int minutes, int seconds) {
        return hours * 3600 + minutes * 60 + seconds;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jam: ");
        int hours = sc.nextInt();
        System.out.print("Masukkan menit: ");
        int minutes = sc.nextInt();
        System.out.print("Masukkan detik: ");
        int seconds = sc.nextInt();

        System.out.println("Hasil konversi = " + toSeconds(hours, minutes, seconds) + " detik");
    }
}
