package modul_4;

public class RencanaKartuStudi {
    private Mahasiswa mahasiswa;
    private Matakuliah[] daftarMatakuliah;
    private int maxMatkul;
    private int jumlahMatakuliah;

    public RencanaKartuStudi(Mahasiswa mahasiswa, int maxMatkul) {
        this.mahasiswa = mahasiswa;
        this.maxMatkul = maxMatkul;
        this.daftarMatakuliah = new Matakuliah[maxMatkul];
        this.jumlahMatakuliah = 0;
    }

    public boolean tambahMatakuliah(Matakuliah matkul) {
        if (jumlahMatakuliah < maxMatkul) {
            if (cariMatakuliah(matkul.getKode()) != null) {
                System.out.println("!! Mata Kuliah dengan kode " + matkul.getKode() + " sudah ada.");
                return false;
            }
            daftarMatakuliah[jumlahMatakuliah] = matkul;
            jumlahMatakuliah++;
            System.out.println("** Mata Kuliah '" + matkul.getNama() + "' berhasil ditambahkan.**");
            return true;
        } else {
            System.out.println("!! GAGAL DITAMBAHKAN: KRS sudah penuh! Maksimal " + maxMatkul + " mata kuliah.");
            return false;
        }
    }

    public boolean hapusMatakuliah(String kode) {
        for (int i = 0; i < jumlahMatakuliah; i++) {
            if (daftarMatakuliah[i].getKode().equalsIgnoreCase(kode)) {
                for (int j = i; j < jumlahMatakuliah - 1; j++) {
                    daftarMatakuliah[j] = daftarMatakuliah[j + 1];
                }
                daftarMatakuliah[jumlahMatakuliah - 1] = null;
                jumlahMatakuliah--;
                return true;
            }
        }
        return false;
    }

    public Matakuliah cariMatakuliah(String kode) {
        for (int i = 0; i < jumlahMatakuliah; i++) {
            if (daftarMatakuliah[i].getKode().equalsIgnoreCase(kode)) {
                return daftarMatakuliah[i];
            }
        }
        return null;
    }

    public int hitungTotalSKS() {
        int totalSKS = 0;
        for (int i = 0; i < jumlahMatakuliah; i++) {
            totalSKS += daftarMatakuliah[i].getSks();
        }
        return totalSKS;
    }

    public double hitungIPK() {
        if (hitungTotalSKS() == 0) return 0.0;

        double totalBobot = 0.0;
        int totalSKS = 0;

        for (int i = 0; i < jumlahMatakuliah; i++) {
            Matakuliah mk = daftarMatakuliah[i];
            totalBobot += mk.getBobotNilai() * mk.getSks();
            totalSKS += mk.getSks();
        }

        if (totalSKS > 0) {
            return totalBobot / totalSKS;
        } else {
            return 0.0;
        }
    }

    public void tampilkanKRS() {
        System.out.println("\n--------------------------------------------------");
        System.out.println("         KARTU RENCANA STUDI SEMESTER INI       ");
        System.out.println("--------------------------------------------------");
        System.out.println("Nama     : " + mahasiswa.getNama());
        System.out.println("NIM      : " + mahasiswa.getNim());
        System.out.println("Prodi    : " + mahasiswa.getJurusan());
        System.out.println("--------------------------------------------------");
        System.out.printf("%-10s %-30s %3s | %-6s\n", "KODE", "MATA KULIAH", "SKS", "NILAI");
        System.out.println("--------------------------------------------------");

        if (jumlahMatakuliah == 0) {
            System.out.println("Belum ada mata kuliah yang diambil.");
        } else {
            for (int i = 0; i < jumlahMatakuliah; i++) {
                daftarMatakuliah[i].tampilkanInfo();
            }
        }
        System.out.println("--------------------------------------------------");
        System.out.printf("Total SKS: %d\n", hitungTotalSKS());
        System.out.printf("IPK      : %.2f\n", hitungIPK());
        System.out.println("--------------------------------------------------");
    }
}