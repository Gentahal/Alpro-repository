public class HitungTotalDanRataRata {
    public static void main(String[] args) {
        int total = 0;
        int jumlahAngka = 500;

        // Menghitung total dari 1 hingga 500
        for (int i = 1; i <= jumlahAngka; i++) {
            total += i;
        }

        // Menghitung rata-rata
        double rataRata = (double) total / jumlahAngka;

        // Menampilkan hasil
        System.out.println("Total : " + total);
        System.out.println("Rata-rata : " + rataRata);
    }
}
