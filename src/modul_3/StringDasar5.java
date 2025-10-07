package modul_3;

import java.util.Scanner;

public class StringDasar5 {

    // Method untuk menampilkan analisis dasar string
    public static void analisisString(String teks) {
        System.out.println("=== ANALISIS STRING ===");
        System.out.println("Teks asli: \"" + teks + "\"");
        System.out.println("Panjang string: " + teks.length());
        System.out.println("Karakter pertama: " + teks.charAt(0));
        System.out.println("Karakter terakhir: " + teks.charAt(teks.length() - 1));
        System.out.println("Teks uppercase: " + teks.toUpperCase());
        System.out.println("Teks lowercase: " + teks.toLowerCase());

        // Menghitung jumlah kata
        String[] kata = teks.trim().split("\\s+");
        System.out.println("\nJumlah kata: " + kata.length);

        // Menghitung jumlah vokal
        System.out.println("Jumlah vokal: " + hitungVokal(teks));
    }

    // Method untuk menghitung jumlah vokal
    public static int hitungVokal(String teks) {
        String vokal = "aeiouAEIOU";
        int count = 0;

        for (int i = 0; i < teks.length(); i++) {
            // Mengambil karakter pada indeks i dan mengecek apakah terdapat dalam string 'vokal'
            if (vokal.contains(String.valueOf(teks.charAt(i)))) {
                count++;
            }
        }
        return count;
    }

    // Method untuk membalik string
    public static String reverseString(String teks) {
        StringBuilder reversed = new StringBuilder();
        for (int i = teks.length() - 1; i >= 0; i--) {
            reversed.append(teks.charAt(i));
        }
        return reversed.toString();
    }

    // Method untuk cek Palindrome
    public static boolean isPalindrome(String teks) {
        // Membersihkan string (menghapus karakter non-alfabet dan angka) dan mengubah ke huruf kecil
        String clean = teks.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String reversed = reverseString(clean);
        return clean.equals(reversed);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== PROGRAM MANIPULASI STRING ===");
        System.out.print("Masukkan sebuah kalimat: ");
        String kalimat = input.nextLine();

        // Analisis dasar
        analisisString(kalimat);

        // String terbalik dan Palindrome
        System.out.println("\nString terbalik: \"" + reverseString(kalimat) + "\"");

        if (isPalindrome(kalimat)) {
            System.out.println("String ini adalah palindrome.");
        } else {
            System.out.println("String ini bukan palindrome.");
        }

        // Pencarian Substring
        System.out.print("\nMasukkan kata yang ingin dicari: ");
        String cari = input.nextLine();

        if (kalimat.toLowerCase().contains(cari.toLowerCase())) {
            int posisi = kalimat.toLowerCase().indexOf(cari.toLowerCase());
            System.out.println("Kata \"" + cari + "\" ditemukan dalam kalimat.");
            System.out.println("Posisi pertama: " + posisi);
        } else {
            System.out.println("Kata \"" + cari + "\" tidak ditemukan dalam kalimat.");
        }
    }
}
