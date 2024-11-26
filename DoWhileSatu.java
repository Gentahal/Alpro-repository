import java.util.Random;
import java.util.Scanner;

public class DoWhileSatu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int number1, number2, answer, userAnswer;
        
        do {
            // Generate dua angka acak
            number1 = random.nextInt(10) + 1; // Angka acak antara 1 dan 10
            number2 = random.nextInt(10) + 1; // Angka acak antara 1 dan 10
            
            // Hitung jawaban yang benar
            answer = number1 + number2;
            
            // Tampilkan soal kepada pengguna
            System.out.println("Berapakah hasil dari: " + number1 + " + " + number2 + " ?");
            
            // Dapatkan jawaban dari pengguna
            userAnswer = scanner.nextInt();
            
            // Jika jawaban salah, ulangi hingga benar
            if (userAnswer != answer) {
                System.out.println("Jawaban salah. Coba lagi!");
            }
        } while (userAnswer != answer);
        
        System.out.println("Jawaban benar! Selamat!");
    }
}
