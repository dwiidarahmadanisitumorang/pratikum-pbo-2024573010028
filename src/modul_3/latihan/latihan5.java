package modul_3.latihan;

public class latihan5 {
    public static void main(String[] args) {
        String teks = "belajar pemrograman java";

        System.out.println("--- Tugas 3.1: Manipulasi String Lanjutan ---");
        System.out.println("Teks Awal: \"" + teks + "\"");

        // Menghitung Konsonan
        int jumlahKonsonan = hitungKonsonan(teks);
        System.out.println("Jumlah Konsonan: " + jumlahKonsonan);

        // Mengubah ke Pascal Case
        String pascalTeks = ubahKePascalCase(teks);
        System.out.println("Pascal Case: " + pascalTeks);
    }

    // Method untuk menghitung jumlah konsonan
    public static int hitungKonsonan(String s) {
        s = s.toLowerCase();
        int hitung = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            // Cek apakah karakter adalah huruf, dan bukan vokal
            if (c >= 'a' && c <= 'z') {
                if (c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u') {
                    hitung++;
                }
            }
        }
        return hitung;
    }

    // Method untuk mengubah string menjadi Pascal Case (Contoh: BelajarPemrogramanJava)
    public static String ubahKePascalCase(String s) {
        if (s == null || s.isEmpty()) {
            return s;
        }

        // Pisahkan kata, buang spasi berlebihan
        String[] kata = s.toLowerCase().split("\\s+");
        StringBuilder hasil = new StringBuilder();

        for (String k : kata) {
            if (k.length() > 0) {
                // Kapitalisasi huruf pertama dan append sisa kata
                hasil.append(k.substring(0, 1).toUpperCase())
                        .append(k.substring(1));
            }
        }
        return hasil.toString();
    }
}
