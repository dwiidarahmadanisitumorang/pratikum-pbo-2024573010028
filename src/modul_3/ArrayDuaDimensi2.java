package modul_3;

import java.util.Scanner;

public class ArrayDuaDimensi2 {
    public static void main(String[] args) {
        // Langkah 1: Deklarasi array 2D untuk nilai siswa (3 siswa, 4 mata pelajaran)
        int[][] nilaiSiswa = new int[3][4];
        String[] namaSiswa = {"Alice", "Bob", "Charlie"};
        String[] mataPelajaran = {"Matematika", "Bahasa Indonesia", "IPA", "IPS"};

        Scanner input = new Scanner(System.in);

        // Langkah 2: Input nilai
        System.out.println("=== INPUT NILAI SISWA ===");
        for (int i = 0; i < 3; i++) {
            System.out.println("Input nilai untuk " + namaSiswa[i] + ":");
            for (int j = 0; j < 4; j++) {
                System.out.print(mataPelajaran[j] + " : ");
                nilaiSiswa[i][j] = input.nextInt();
            }
            System.out.println();
        }

        // Langkah 3: Menampilkan nilai dalam bentuk tabel
        System.out.println("=== TABEL NILAI SISWA ===");
        System.out.printf("%-12s", "Nama");
        for (String mapel : mataPelajaran) {
            // mapel.substring(0, Math.min(7, mapel.length())) digunakan untuk memotong string mapel agar pas di format %-8s
            System.out.printf("%-8s", mapel.substring(0, Math.min(7, mapel.length())));
        }
        System.out.println("Rata-rata");

        for (int i = 0; i < 3; i++) {
            System.out.printf("%-12s", namaSiswa[i]);
            int total = 0;
            for (int j = 0; j < 4; j++) {
                System.out.printf("%-8d", nilaiSiswa[i][j]);
                total += nilaiSiswa[i][j];
            }
            double rataRata = total / 4.0;
            System.out.printf("%%.2f%n", rataRata);
        }
    }
}
