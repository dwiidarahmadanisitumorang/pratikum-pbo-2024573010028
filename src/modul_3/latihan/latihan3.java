package modul_3.latihan;

public class latihan3 {
    public static void main(String[] args) {
        double a = 16;
        double b = 4;
        double c = 0;

        System.out.println("--- Tugas 2.1: Method Kalkulator Lanjutan ---");

        System.out.println("Hasil Pangkat (" + a + " ^ " + b + "): " + pangkat(a, b));
        System.out.println("Hasil Akar Kuadrat (" + a + "): " + akarKuadrat(a));

        System.out.println("\n--- Validasi Pembagian ---");
        pembagianAman(a, b);  // Normal
        pembagianAman(a, c);  // Dengan Nol
    }

    // Method untuk operasi pangkat
    public static double pangkat(double basis, double eksponen) {
        return Math.pow(basis, eksponen);
    }

    // Method untuk operasi akar kuadrat
    public static double akarKuadrat(double bilangan) {
        if (bilangan >= 0) {
            return Math.sqrt(bilangan);
        } else {
            System.out.println("Error: Bilangan negatif tidak dapat diakar kuadrat.");
            return Double.NaN;
        }
    }

    // Method untuk validasi operasi pembagian dengan nol
    public static void pembagianAman(double a, double b) {
        if (b == 0) {
            System.out.println("Peringatan! Pembagian " + a + " / " + b + " GAGAL karena pembagi nol.");
        } else {
            double hasil = a / b;
            System.out.println("Hasil Pembagian " + a + " / " + b + " = " + hasil);
        }
    }
}
