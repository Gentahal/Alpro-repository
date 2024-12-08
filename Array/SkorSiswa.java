package Array;
import java.util.*;

public class SkorSiswa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Meminta jumlah mahasiswa
        System.out.print("Masukkan jumlah mahasiswa: ");
        int numberOfStudents = input.nextInt();

        int[] scores = new int[numberOfStudents];
        int bestScore = 0;

        // Meminta skor untuk setiap mahasiswa dan menentukan skor terbaik
        System.out.println("Masukkan nilai setiap mahasiswa:");
        for (int i = 0; i < numberOfStudents; i++) {
            scores[i] = input.nextInt();
            if (scores[i] > bestScore) {
                bestScore = scores[i];
            }
        }

        // Menentukan grade untuk setiap mahasiswa
        for (int i = 0; i < numberOfStudents; i++) {
            char grade;

            if (scores[i] >= bestScore - 5) {
                grade = 'A';
            } else if (scores[i] >= bestScore - 10) {
                grade = 'B';
            } else if (scores[i] >= bestScore - 15) {
                grade = 'C';
            } else if (scores[i] >= bestScore - 20) {
                grade = 'D';
            } else {
                grade = 'F';
            }

            // Menampilkan hasil
            System.out.println("Student " + i + " score is " + scores[i] + " and grade is " + grade);
        }

    }
}
