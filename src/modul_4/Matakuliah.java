package modul_4;

public class Matakuliah {
    private String kode;
    private String nama;
    private int sks;
    private double nilai;

    // Konstruktor 3 parameter (untuk input baru tanpa nilai awal)
    public Matakuliah(String kode, String nama, int sks) {
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
        this.nilai = 0.0;
    }

    // Konstruktor 4 parameter (dibutuhkan untuk data awal di Main.java)
    public Matakuliah(String kode, String nama, int sks, double nilai) {
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
        setNilai(nilai);
    }

    // Getter dan Setter
    public String getKode() {
        return kode;
    }
    public String getNama() {
        return nama;
    }
    public int getSks() {
        return sks;
    }
    public double getNilai() {
        return nilai;
    }

    public void setNilai(double nilai) {
        if (nilai >= 0.0 && nilai <= 100.0) {
            this.nilai = nilai;
        } else {
            System.out.println("Nilai harus antara 0-100!");
        }
    }

    // Konversi nilai angka ke huruf (sesuai SS Anda)
    public String getNilaiHuruf() {
        if (nilai > 85) return "A";
        else if (nilai > 80) return "A-";
        else if (nilai > 78) return "B+";
        else if (nilai > 70) return "B";
        else if (nilai > 65) return "C+";
        else if (nilai > 60) return "C";
        else if (nilai > 55) return "D";
        else return "E";
    }

    // Konversi nilai huruf ke bobot (sesuai SS Anda)
    public double getBobotNilai() {
        String huruf = getNilaiHuruf();
        switch (huruf) {
            case "A":
                return 4.0;
            case "A-":
                return 3.7;
            case "B+":
                return 3.3;
            case "B":
                return 3.0;
            case "C+":
                return 2.3;
            case "C":
                return 2.0;
            case "D":
                return 1.0;
            default:
                return 0.0;
        }
    }

    public void tampilkanInfo() {
        System.out.printf("%-10s %-30s %3d | %6.2f (%s)\n",
                kode, nama, sks, nilai, getNilaiHuruf());
    }
}