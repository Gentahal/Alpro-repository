import java.util.Scanner;

public class DiscountToCalculator {
    public static double calculateDiscount(int total, boolean isMember) {
        if (total > 100000) {
            return isMember ? total * 0.9 : total * 0.95;
        }
        return total;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan total belanja: ");
        int total = sc.nextInt();
        System.out.print("Apakah Anda member? (true/false): ");
        boolean isMember = sc.nextBoolean();

        double finalTotal = calculateDiscount(total, isMember);
        System.out.println("Total belanja akhir: " + finalTotal);
    }
}
