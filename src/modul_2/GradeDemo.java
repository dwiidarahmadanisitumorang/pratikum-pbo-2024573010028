package modul_2;

import java.util.Scanner;

public class GradeDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai (0-100): ");
        int nilai = input.nextInt();

        char grade;
        String Keterangan;

        // Menggunakan if-else if-else
        if (nilai >= 90) {
            grade = 'A';
            Keterangan = "Excellent";
        } else if (nilai >= 80) {
            grade = 'B';
            Keterangan = "Good";
        } else if (nilai >= 70) {
            grade = 'C';
            Keterangan = "Fair";
        } else if (nilai >= 60) {
            grade = 'D';
            Keterangan = "Poor";
        } else {
            grade = 'E';
            Keterangan = "Fail";
        }

        System.out.println("Nilai: " + nilai);
        System.out.println("Grade: " + grade);
        System.out.println("Keterangan: " + Keterangan);

        input.close();
    }
}
