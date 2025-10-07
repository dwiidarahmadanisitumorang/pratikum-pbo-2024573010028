package modul_3.latihan;

public class latihan6 {
    public static void main(String[] args) {
        // Data input direvisi menggunakan nama dari uji coba Anda
        String namaLengkap1 = "Dwi Ida Rahmadani Situmorang";
        String namaLengkap2 = "Muhammad Alzam Lembeng";
        String namaLengkap3 = "Iqbal@maulana"; // Nama yang tidak valid (untuk pengujian)
        String domain = "ub.ac.id";

        System.out.println("--- Tugas 3.2: Pengolahan Nama dan Email ---");

        // Tes 1: Nama Valid, menghasilkan email dengan nama depan dan belakang
        System.out.println("Nama 1: " + namaLengkap1);
        prosesNamaDanEmail(namaLengkap1, domain);

        // Tes 2: Nama Valid, menghasilkan email dengan nama depan dan belakang
        System.out.println("\nNama 2: " + namaLengkap2);
        prosesNamaDanEmail(namaLengkap2, domain);

        // Tes 3: Nama Tidak Valid (mengandung karakter khusus)
        System.out.println("\nNama 3: " + namaLengkap3);
        prosesNamaDanEmail(namaLengkap3, domain);
    }

    // Method pembantu untuk menjalankan validasi dan generate
    public static void prosesNamaDanEmail(String nama, String domain) {
        if (validasiFormatNama(nama)) {
            String email = generateEmail(nama, domain);
            System.out.println("  -> Validasi: OK.");
            System.out.println("  -> Email: " + email);
        } else {
            System.out.println("  -> Validasi: GAGAL (Hanya boleh huruf dan spasi).");
        }
    }

    /**
     * Menghasilkan email address dalam format: nama_depan.nama_belakang@domain.
     * Membersihkan nama dari karakter non-alfabet.
     */
    public static String generateEmail(String namaLengkap, String domain) {
        // Hapus semua karakter yang bukan huruf/spasi, ubah ke kecil, dan pisahkan kata
        String cleanedNama = namaLengkap.replaceAll("[^a-zA-Z\\s]", "").toLowerCase();
        String[] parts = cleanedNama.split("\\s+");

        String firstName = "";
        String lastName = "";

        if (parts.length > 0) {
            firstName = parts[0];
        }
        if (parts.length >= 2) {
            // Ambil kata terakhir sebagai nama belakang
            lastName = parts[parts.length - 1];
        }

        String username = firstName;
        if (!lastName.isEmpty() && !lastName.equals(firstName)) {
            username += "." + lastName;
        }

        return username + "@" + domain;
    }

    /**
     * Memvalidasi format nama: hanya boleh mengandung huruf alfabet (a-z, A-Z) dan spasi (\s).
     */
    public static boolean validasiFormatNama(String nama) {
        // Regex: Memastikan seluruh string hanya terdiri dari huruf dan spasi
        return nama.matches("[a-zA-Z\\s]+");
    }
}