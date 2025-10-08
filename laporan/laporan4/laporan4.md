# Laporan Modul 4: Pengenalan Object-Oriented Programming (OOP)
**Mata Kuliah:** Praktikum Pemrograman Berorientasi Objek   
**Nama:** DWI IDA RAHMADANI SITUORANG  
**NIM:** 2024573010028  
**Kelas:** TI 2E

---
## 1. Abstrak
Laporan ini merangkum hasil implementasi praktikum Modul 4, yang berfokus pada konsep dasar Object-Oriented Programming (OOP) menggunakan Java. 
Program yang dikembangkan adalah Sistem Kartu Rencana Studi (KRS). Tujuan utama adalah mendemonstrasikan penguasaan terhadap 
pembuatan Class, Object, penerapan Enkapsulasi melalui private attributes dan public methods, serta implementasi Relasi 
Antar Class (KartuRencanaStudi has-a Mahasiswa dan has-a Matakuliah). Fungsionalitas sistem mencakup perhitungan IPK, penambahan, penghapusan, dan validasi SKS.
---
## 2. Praktikum :Implementasi Object-Oriented Programming
Praktikum ini melibatkan pengembangan empat class (Mahasiswa, Matakuliah, KartuRencanaStudi, Main) yang saling berinteraksi untuk membentuk sistem manajemen KRS.

### Praktikum 2.1 - Class Mahasiswa dan Enkapsulasi
#### Dasar Teori
Class Mahasiswa berfungsi sebagai blueprint untuk objek mahasiswa. Prinsip Enkapsulasi diterapkan dengan mendeklarasikan 
atribut (nama, nim, jurusan) sebagai private, sehingga akses ke data harus melalui public method Getter (getNama(), getNim(), getJurusan()), yang menjaga integritas data.
#### Langkah Praktikum
1. Mendeklarasikan atribut nama, nim, dan jurusan dengan access modifier private.
2. Membuat Constructor untuk inisialisasi objek.
3. Mendefinisikan public method Getter untuk memungkinkan class lain mengakses nilai atribut.
#### Analisa dan Pembahasan
Struktur class Mahasiswa berhasil dibuat. Enkapsulasi memastikan bahwa objek Mahasiswa hanya dapat diakses melalui 
antarmuka yang ditentukan (Getter), yang merupakan praktik baik dalam OOP.

### Praktikum 2.2 - Clas Matakuliah dan Business logic
#### Dasar Teori
Class Matakuliah merepresentasikan data mata kuliah. Selain menyimpan atribut dasar (kode, nama, SKS, nilai), class ini 
bertanggung jawab atas logika bisnis seperti konversi nilai dan validasi.
#### Langkah Praktikum
1. Mendeklarasikan atribut kode, nama, sks, dan nilai sebagai private.
2. Membuat Constructor untuk inisialisasi.
3. Mengimplementasikan method setNilai(double nilai) yang mencakup validasi rentang nilai (0≤nilai≤100).
4. Membuat method getNilaiHuruf() dan getBobotNilai() untuk konversi nilai yang penting dalam perhitungan IPK.
#### Analisa dan Pembahasan
Pemisahan tanggung jawab dilakukan dengan baik. Class Matakuliah tidak hanya menyimpan data, tetapi juga menyediakan 
layanan konversi data (NilaiHuruf dan BobotNilai), menunjukkan bahwa object adalah unit yang menyimpan data dan perilaku.

### Praktikum 2.3 - Class KartuRencanaStudi (Relasi & Agregasi)
#### Dasar Teori
Class KartuRencanaStudi (KRS) menunjukkan Relasi Asosiasi ("has-a") dengan menyimpan satu objek Mahasiswa dan sebuah array Matakuliah. 
Class ini berfungsi sebagai agregator dan bertanggung jawab atas fungsionalitas tingkat sistem, seperti perhitungan IPK dan pengelolaan daftar mata kuliah.
#### Langkah Praktikum
1. Mendeklarasikan atribut mahasiswa (objek Mahasiswa) dan daftarMataKuliah (array Matakuliah[]).
2. Membuat method hitungTotalSKS() dan hitungIPK() untuk memproses data dari array Matakuliah.
3. Mengimplementasikan method tambahMataKuliah() dengan logika validasi total SKS (maksimum 24 SKS).
4. Menambahkan method hapusMataKuliah() (Tugas Praktikum) untuk menghapus elemen dari array KRS.
#### Analisa dan Pembahasan
Relasi antar class berhasil diimplementasikan. Class KRS mengagregasi objek lain untuk menjalankan fungsionalitas kompleks. Perhitungan IPK=
∑SKS
∑(SKS×Bobot Nilai)
​
menunjukkan pemanfaatan data dari method objek Matakuliah di dalam objek KartuRencanaStudi.

## 3. Hasil Uji Coba Program
Program Main.java berhasil menginisialisasi objek, menerima input pengguna, dan memproses menu dengan menggunakan 
method dari class yang telah dibuat.

#### uji coba dilakukan secara berurutan
1. Program diawali dengan input data Mahasiswa (DWI IDA RAHMADANI SITUMORANG, NIM: 2024573010028) dan inisialisasi awal 5 Mata Kuliah.
2. Pemilihan Menu 1 (Tampilkan KRS) menunjukkan Total SKS=14 dan IPK=3.51.
3. Pemilihan Menu 2 (Tambah Mata Kuliah) memasukkan mata kuliah baru (MK006 - Kalkulus I, SKS 3).
4. Pemilihan Menu 1 lagi menunjukkan nilai terupdate: Total SKS=17 dan IPK=3.65.
5. Pemilihan Menu 3 (Hapus Mata Kuliah) menghapus mata kuliah dengan kode MK004 (Matematika Diskrit).
6. Pemilihan Menu 1 untuk ketiga kalinya menunjukkan hasil akhir setelah penghapusan: Total SKS=15 dan IPK=3.82.
#### Screenshoot Hasil
![output 1 ](screenshots/OUTPUT_1.png)
![output 2 ](screenshots/OUTPUT_2.png)
![output 3 ](screenshots/OUTPUT_3.png)
![output 4 ](screenshots/OUTPUT_4.png)
![output 5 ](screenshots/OUTPUT_5.png)
![output 6 ](screenshots/OUTPUT_6.png)
#### Analisa dan Pembahasan
Hasil output menunjukkan bahwa semua konsep OOP dan fungsionalitas yang diminta berhasil diimplementasikan:
1. Objek dan Method: Objek Mahasiswa, Matakuliah, dan KartuRencanaStudi berinteraksi sesuai alur program.
2. Perhitungan IPK: Perhitungan IPK (dari 3.65 menjadi 3.82 setelah menghapus nilai rendah) dan total SKS berjalan dinamis dan akurat.
3. Tugas Tambahan: Fitur hapusMataKuliah berhasil diimplementasikan, memvalidasi kemampuan memanipulasi array objek di class KRS.
4. Validasi: Fungsionalitas seperti validasi nilai dan (secara implisit) validasi SKS menunjukkan penanganan error yang terstruktur.

---

## 4. Kesimpulan
Praktikum Modul 4 telah berhasil diimplementasikan, memberikan pemahaman mendalam tentang Object-Oriented Programming (OOP). 
Konsep inti seperti Class, Object, Enkapsulasi, dan Relasi Antar Class (KartuRencanaStudi sebagai agregator) diterapkan 
secara efektif untuk membangun Sistem KRS yang terstruktur dan modular. Pemisahan tugas (class Matakuliah mengurus 
konversi nilai, class KartuRencanaStudi mengurus agregasi dan perhitungan IPK) membuktikan keunggulan desain OOP dalam 
membuat kode yang mudah di-maintain dan mudah dikembangkan.

---

## 5. Referensi
1. Java Documentation: Classes and Objects — https://docs.oracle.com/javase/tutorial/java/javaOO/
2. Schildt, Herbert. (2014). Java: The Complete Reference, Ninth Edition. McGraw-Hill Education.
3. Eckel, Bruce. (2006). Thinking in Java, 4th Edition. Prentice Hall.
4. Formula Perhitungan Indeks Prestasi Kumulatif (IPK) Perguruan Tinggi.

---
