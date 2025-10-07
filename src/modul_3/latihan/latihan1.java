package modul_3.latihan;

public class latihan1 {
    public static void main(String[] args) {
        // Data 10 nilai ujian
        double[] nilaiUjian = {78.5, 85.0, 92.5, 67.0, 88.0, 75.5, 95.0, 81.0, 70.0, 89.5};

        double totalNilai = 0;
        double nilaiTertinggi = nilaiUjian[0];
        double nilaiTerendah = nilaiUjian[0];

        for (double nilai : nilaiUjian) {
            totalNilai += nilai;

            if (nilai > nilaiTertinggi) {
                nilaiTertinggi = nilai;
            }

            if (nilai < nilaiTerendah) {
                nilaiTerendah = nilai;
            }
        }

        double rataRata = totalNilai / nilaiUjian.length;

        System.out.println("--- Tugas 1.1: Analisis Nilai Ujian ---");
        System.out.printf("Total Nilai: %.2f%n", totalNilai);
        System.out.printf("Rata-rata Nilai: %.2f%n", rataRata);
        System.out.println("Nilai Tertinggi: " + nilaiTertinggi);
        System.out.println("Nilai Terendah: " + nilaiTerendah);
    }
}