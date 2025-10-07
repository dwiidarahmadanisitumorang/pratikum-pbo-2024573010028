package modul_3.latihan;

public class latihan2 {
    public static void main(String[] args) {
        // Data nilai siswa. Baris = Siswa, Kolom = Mapel
        int[][] nilaiSiswa = {
                {80, 90, 75}, // Siswa 1 (Andi)
                {95, 85, 88}, // Siswa 2 (Budi)
                {70, 75, 80}, // Siswa 3 (Citra)
        };

        String[] namaSiswa = {"Andi", "Budi", "Citra"};
        String[] namaMapel = {"Matematika", "Fisika", "Kimia"};

        int jumlahSiswa = nilaiSiswa.length;
        int jumlahMapel = nilaiSiswa[0].length;

        System.out.println("--- Tugas 1.2: Analisis Nilai Array 2D ---");

        // 1. Mata pelajaran dengan nilai tertinggi untuk setiap siswa
        System.out.println("A. Nilai Tertinggi Per Siswa:");
        for (int i = 0; i < jumlahSiswa; i++) {
            int nilaiTertinggiSiswa = nilaiSiswa[i][0];
            String mapelTertinggi = namaMapel[0];

            for (int j = 1; j < jumlahMapel; j++) {
                if (nilaiSiswa[i][j] > nilaiTertinggiSiswa) {
                    nilaiTertinggiSiswa = nilaiSiswa[i][j];
                    mapelTertinggi = namaMapel[j];
                }
            }
            System.out.printf("   - %s: Nilai tertinggi %s (%d)%n",
                    namaSiswa[i], mapelTertinggi, nilaiTertinggiSiswa);
        }

        // 2. Hitung rata-rata nilai untuk setiap mata pelajaran
        System.out.println("\nB. Rata-rata Nilai Setiap Mata Pelajaran:");
        for (int j = 0; j < jumlahMapel; j++) { // Iterasi kolom (Mapel)
            int totalNilaiMapel = 0;

            for (int i = 0; i < jumlahSiswa; i++) { // Iterasi baris (Siswa)
                totalNilaiMapel += nilaiSiswa[i][j];
            }

            double rataRataMapel = (double) totalNilaiMapel / jumlahSiswa;

            System.out.printf("   - Rata-rata %s: %.2f%n", namaMapel[j], rataRataMapel);
        }
    }
}
