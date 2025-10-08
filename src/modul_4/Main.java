package modul_4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("===============================================");
        System.out.println("      SISTEM KARTU RENCANA STUDI (KRS) JAVA   ");
        System.out.println("===============================================");

        System.out.print("Masukkan NIM Mahasiswa  : ");
        String nim = input.nextLine();
        System.out.print("Masukkan Nama Mahasiswa : ");
        String nama = input.nextLine();
        System.out.print("Masukkan Prodi Mahasiswa: ");
        String prodi = input.nextLine();

        // Membuat object Mahasiswa (memanggil constructor 3 parameter)
        Mahasiswa mhs = new Mahasiswa(nama, nim, prodi);

        // Membuat object KRS (menggunakan RencanaKartuStudi)
        RencanaKartuStudi krs = new RencanaKartuStudi(mhs, 10);

        // Tambah data awal mata kuliah (memanggil constructor 4 parameter)
        Matakuliah[] daftarMatkul = {
                new Matakuliah("MK001", "Pemrograman Dasar", 3, 85),
                new Matakuliah("MK002", "Struktur Data", 3, 78),
                new Matakuliah("MK003", "Basis Data", 3, 90),
                new Matakuliah("MK004", "Matematika Diskrit", 2, 65),
                new Matakuliah("MK005", "Jaringan Komputer", 3, 88)
        };

        for (Matakuliah mk : daftarMatkul) {
            krs.tambahMatakuliah(mk);
        }

        int pilihan;
        do {
            System.out.println("\n================ MENU KRS ================");
            System.out.println("1. Tampilkan KRS");
            System.out.println("2. Tambah Mata Kuliah");
            System.out.println("3. Hapus Mata Kuliah");
            System.out.println("4. Cari Mata Kuliah");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");

            if (!input.hasNextInt()) {
                System.out.println("Pilihan tidak valid! Masukkan angka.");
                input.next();
                pilihan = 0;
                continue;
            }

            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {
                case 1:
                    krs.tampilkanKRS();
                    break;

                case 2:
                    System.out.print("Masukkan kode mata kuliah: ");
                    String kode = input.nextLine();
                    System.out.print("Masukkan nama mata kuliah: ");
                    String namaMk = input.nextLine();

                    int sks = 0;
                    double nilai = 0.0;
                    try {
                        System.out.print("Masukkan jumlah SKS: ");
                        sks = input.nextInt();
                        System.out.print("Masukkan nilai: ");
                        nilai = input.nextDouble();
                    } catch (java.util.InputMismatchException e) {
                        System.out.println("Input SKS atau Nilai tidak valid! Harap masukkan angka.");
                        input.nextLine();
                        break;
                    }
                    input.nextLine();

                    Matakuliah mkBaru = new Matakuliah(kode, namaMk, sks, nilai);
                    krs.tambahMatakuliah(mkBaru);
                    break;

                case 3:
                    System.out.print("Masukkan kode mata kuliah yang ingin dihapus: ");
                    String hapusKode = input.nextLine();
                    if (krs.hapusMatakuliah(hapusKode)) {
                        System.out.println("Mata kuliah dengan kode " + hapusKode + " berhasil dihapus!");
                    } else {
                        System.out.println("Mata kuliah tidak ditemukan!");
                    }
                    break;

                case 4:
                    System.out.print("Masukkan kode mata kuliah yang ingin dicari: ");
                    String cariKode = input.nextLine();
                    Matakuliah hasilCari = krs.cariMatakuliah(cariKode);
                    if (hasilCari != null) {
                        System.out.println("Ditemukan:");
                        hasilCari.tampilkanInfo();
                    } else {
                        System.out.println("Mata kuliah tidak ditemukan!");
                    }
                    break;

                case 5:
                    System.out.println("Terima kasih telah menggunakan sistem KRS.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }

        } while (pilihan != 5);

        input.close();
    }
}