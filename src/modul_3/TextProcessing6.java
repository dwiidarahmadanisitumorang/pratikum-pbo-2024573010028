package modul_3;

import java.util.Scanner;

public class TextProcessing6 {

    public static void prosesDataMahasiswa(String data) {
        System.out.println("Data mentah: " + data + "\n");

        // Memisahkan data berdasarkan koma dan titik koma
        String[] dataMahasiswa = data.split("[,;]");

        // Menghilangkan spasi pada setiap data
        for (int i = 0; i < dataMahasiswa.length; i++) {
            dataMahasiswa[i] = dataMahasiswa[i].trim(); // menghilangkan spasi
            System.out.println((i + 1) + ". " + dataMahasiswa[i]);
        }

        // Analisis data
        System.out.println("\n=== ANALISIS DATA ===");
        System.out.println("Jumlah mahasiswa: " + dataMahasiswa.length);

        // Mencari nama terpanjang
        String namaTerpanjang = dataMahasiswa[0];
        String namaTerpendek = dataMahasiswa[0];

        for (String nama : dataMahasiswa) {
            if (nama.length() > namaTerpanjang.length()) {
                namaTerpanjang = nama;
            }
            if (nama.length() < namaTerpendek.length()) {
                namaTerpendek = nama;
            }
        }

        System.out.println("\nNama Terpanjang: " + namaTerpanjang + " (" + namaTerpanjang.length() + " karakter)");
        System.out.println("Nama Terpendek: " + namaTerpendek + " (" + namaTerpendek.length() + " karakter)");

        // Pengurutan array secara alfabetis (manual Bubble Sort)
        String[] namaUrut = dataMahasiswa.clone();
        for (int i = 0; i < namaUrut.length - 1; i++) {
            for (int j = 0; j < namaUrut.length - 1 - i; j++) {
                // Bandingkan string secara case-insensitive
                if (namaUrut[j].compareToIgnoreCase(namaUrut[j + 1]) > 0) {
                    String temp = namaUrut[j];
                    namaUrut[j] = namaUrut[j + 1];
                    namaUrut[j + 1] = temp;
                }
            }
        }

        System.out.println("\nNama Mahasiswa (Urutan Alfabetis):");
        for (int i = 0; i < namaUrut.length; i++) {
            System.out.println((i + 1) + ". " + namaUrut[i]);
        }
    }

    public static void formatNama(String nama) {
        String namaTrim = nama.trim();
        System.out.println("\nNama lengkap: " + namaTrim);

        // Format ke Title Case
        String namaFormat = formatTitleCase(namaTrim);

        // Hapus semua spasi
        String namaBersih = namaTrim.replaceAll("\\s+", "");

        // Buat username (contoh sederhana)
        String username = namaBersih.toLowerCase();

        System.out.println("Nama diformat: " + namaFormat);
        System.out.println("Username (contoh): " + username);
    }

    // Method untuk format menjadi Title Case (Huruf pertama setiap kata besar)
    public static String formatTitleCase(String teks) {
        if (teks == null || teks.isEmpty()) {
            return teks;
        }

        String[] kata = teks.toLowerCase().split("\\s+");
        StringBuilder result = new StringBuilder();

        for (String k : kata) {
            if (k.length() > 0) {
                result.append(Character.toUpperCase(k.charAt(0)))
                        .append(k.substring(1))
                        .append(" ");
            }
        }
        return result.toString().trim();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== PROGRAM PENGOLAHAN DATA TEKS ===");
        System.out.println("Masukkan daftar nama, pisahkan dengan koma atau titik koma:");

        // Input data
        String dataInput = input.nextLine();

        // 1. Proses data mahasiswa
        prosesDataMahasiswa(dataInput);

        // 2. Ambil nama pertama untuk didemonstrasikan formatnya
        String[] dataPisah = dataInput.split("[,;]");
        if (dataPisah.length > 0) {
            System.out.println("\n=== DEMO FORMATTING NAMA PERTAMA ===");
            formatNama(dataPisah[0]);
        }
    }
}
