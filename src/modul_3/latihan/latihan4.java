package modul_3.latihan;


import java.util.Arrays;

public class latihan4 {
    public static void main(String[] args) {
        int[] data = {10, 5, 20, 15, 30, 25, 12}; // 7 elemen (ganjil)
        int cariNilai = 15;

        System.out.println("--- Tugas 2.2: Method Pengolahan Array ---");
        System.out.println("Array Data Awal: " + Arrays.toString(data));

        // Mencari nilai
        int index = cariNilaiDalamArray(data, cariNilai);
        if (index != -1) {
            System.out.println("Nilai " + cariNilai + " ditemukan pada indeks: " + index);
        } else {
            System.out.println("Nilai " + cariNilai + " tidak ditemukan.");
        }

        // Menghitung Median (Array harus diurutkan terlebih dahulu)
        int[] dataSorted = data.clone();
        Arrays.sort(dataSorted);
        System.out.println("Array Data Urut: " + Arrays.toString(dataSorted));
        double median = hitungMedian(dataSorted);
        System.out.println("Median: " + median);
    }

    // Method untuk mencari nilai tertentu dalam array
    public static int cariNilaiDalamArray(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1; // Nilai tidak ditemukan
    }

    // Method untuk menghitung median dari array yang sudah diurutkan
    public static double hitungMedian(int[] arr) {
        int n = arr.length;
        if (n == 0) return 0.0;

        if (n % 2 != 0) {
            // Ganjil: nilai tengah
            return arr[n / 2];
        }
        else {
            // Genap: rata-rata dua nilai tengah
            int nilaiTengah1 = arr[n / 2 - 1];
            int nilaiTengah2 = arr[n / 2];
            return (double) (nilaiTengah1 + nilaiTengah2) / 2.0;
        }
    }
}
