# Laporan Modul 2: Dasar Pemrograman Java
**Mata Kuliah:** Praktikum Pemrograman Berorientasi Objek   
**Nama:** DWI IDA RAHMADANI SITUORANG  
**NIM:** 2024573010028  
**Kelas:** TI 2E

---Gunakan fitur "Export to PDF" atau "Print to PDF" dari editor tersebut.

Simpan file PDF tersebut, biasanya di folder yang sama dengan laporan.md atau di root folder laporan Anda.

## 1. Abstrak
Laporan ini merangkum hasil implemntasi pratikum modul 2 tentang Dasar Pemograman Java.
tujuannya adalah mendemonstrasikan pemahaman dan penguasaaan konsep fundamental java, meliputi variabel dan tipe data,
mekanisme input/output menggunakan class scanner, serta implementasi berbagai struktur kontrol percabangan 
(if-else, switch) dan perulangan (for, ehile, do-while, dan nested loop). 
setiap pratikum berhasil diujicoba dan dianalisis untuk memastikan program berjalan sesuai logika yang dirancang.

---
## 2. Praktikum
### Praktikum 1 - Variabel dan Tipe Data
#### Dasar Teori
java membagi tipe data menjadi dua: primitif (int, double, boolean, char, dll.) yang menyimpan nilai aktual, 
dan reference (String, Array, dll.). 
yang menyimpan alamat memori ke objek. variabel harus dinamai sesuai aturan dan bersifat case-sensitive. 
pratikum ini juga menguji oprasi aritmatika dan casting (konversi eksplisit) antar tipe data.
#### Langkah Praktikum
1. membuat file VariabelDemo.java dan mendeklarasikan variabel dengan berbagai tipe data, termasuk string nama = "DWI IDA RAHMADANI SITUMORANG";.
2. melakukan oprasi aritmatika (+, -, *, /, %) menggunakan variabel integer.
3. mendemonstarasikan cascing dari double ke int dan automatic promotion tipe data.
#### Screenshoot Hasil
![output program VariabelDemo](screenshots/P1_VariabelDemo_Output.png)
#### Analisa dan Pembahasan
variabel data diri (nama, umur, tinggi) berhasil diinsialisasi. oprasi artimatika dasar menunjukkan bahwa hasil
pembagian int / int (misalnya 10/3) menghasilkan pembulatan ke bawah (floor) menjadi 3.
proses casting darai double (9.8) menjadi int (9) berhasil dilakukan, namun menunjukkan adanya kehilangan presisi, 
membuktikan konversi eksplisit diperlukan saat mengubah tipe data dengan ukuran atau jangkauan yang lebih kecil.

### Praktikum 2 - Input, Output dan Scanner
#### Dasar Teori
Class scanner darai package java.ulti digunakan untuk menerima masukan dari pengguna. 
method yang digunakan seperti nextLine() untuk membaca string lengkap dan nextInt() atau nextDouble() untuk membaca
nilai numerik.
#### Langkah Praktikum
1. membuat file InputOutputDemon.java dan mengimpor java.ulti.scanner.
2. menggunakan scanner untuk membaca nama (nextLine() ), umur (nextInt() ), dan tinggi (nextDouble() ).
3. menampilkan kembali data yang dimasukkan dalam format yang tersetruktur.
#### Screenshoot Hasil
![output program InputOutputDemon](screenshots/P2_InputOutputDemon_Output.png)
#### Analisa dan Pembahasan
peogram berhasil menjalankan fungsi input-output secara interaktif. 
pengguna nextLine() untuk nama menjamin nama lengkap yang mengandung spasi dapat terbaca sempurna. 
semua data yang diinputkan disimpan ke variabel dengan tipe data yang sesuai (string, int, double)
dan ditampilkan kembali, menunjukkan program dapat berintraksi dengan penguna secara efektif.

### Praktikum 3 - Program Penentuan Grade (if-else if-else)
#### Dasar Teori
struktur percabangan if-else if-else digunakan untuk membuat keputusan multi-cabang. 
program akan mengevaluasi kondisi secra brurutan, dan hanya blok kode pertama yang kondosinya true yang akan 
dieksekusi, mengabaikan sisanya.
#### Langkah Praktikum
1. membuat file GradeDemo.java dan menerima input nilai angka.
2. mengimplemtasikan logika penilaian menggunakan if-else if-else untuk menetapkan grade ('A' hingga 'E').
#### Screenshoot Hasil
![output program GradeDemo](screenshots/P3_GradeDemo.png)
#### Analisa dan Pembahasan
logika pemograman berjalan sesuai hierarki.
contohnya, jika nilai 88 dimasukkan, kondisi (nilai >=92) langsung bernilai true, menetapkan grade 'A',
dan program melompati pemeriksaan kondisi (nilai>=75), membuktikan keefektifan if-else if-else untuk penilaian berjenjang. 

### Praktikum 4 - Pemograman Menu Dengan Switch
#### Dasar Teori
struktur switch digunakan untuk memilih satu blok kode yang akan dieksekusi dari banyak pilihan case berdasarkan 
nilai pasti sebuah variabel. 
penggunaan keyword break sangat krusial untuk mencegah fall-through ke case berikutnya.
#### Langkah Praktikum
1. membuat file MenuDemo.java.
2. menampilkan menu pilihan (1-4).
3. menggunakan switch untuk menjalankan kalkulasi luas (persegi, lingkaran, segitiga) berdasarkan pilihan.
#### Screenshoot Hasil
![output program MenuDemo](screenshots/P4_MenuDemo.png)
#### Analisa dan Pembahasan

### Praktikum 5 - Pemograman Nested if
#### Dasar Teori
nested if adalah struktur if di dalam blok if lainnya, digunakan untuk implementasi logika keputusan yang lebih
kompleks dan berlapis, seringkali untuk validasi bertingkat.
#### Langkah Praktikum
1. membuat file NestedIfDemo.java dan menerima input umur.
2. menggunakan if luar untuk memverifikasi (umur >=0).
3. menggunakan if-else if-else bersarang di dalam if luar untuk mentukan katagori usia (bayi, balita, dst.).
#### Screenshoot Hasil
![output program NestedIfDemo](screenshots/P5_NestedIfDemo.png)
#### Analisa dan Pembahasan
struktur if bersarang sangat efektif untuk validasi. 
if luar berhasil memfilter input yang tidak valid (umur negatif), mengarahkan program langsung ke blok else luar. 
hanya umur yang valid yang kemudian diuji oleh netsted if-else if-else untuk dikatagorikan, menunjukkan struktur yang 
logis dan aman.

### Praktikum 6 - Perulangan For
#### Dasar Teori
for loop digunakan untuk perulangan di mana jumlah iterasi suda diketahui. 
struktur terdiri dari inisialisasi, kondisi terminasi, dan increment/decrement.
#### Langkah Praktikum
1. membuat file ForLoopDemo.java.
2. mendemonstrasikan perulangan sederhana (1-10), perulangan dengan step (genap i+=2), countdown (i--), dan pembuatan tabel perkalian.
#### Screenshoot Hasil
![output program ForLoopDemon](screenshots/P6_ForLoopDemon.png)
#### Analisa dan Pembahasan
for loop berhasil digunakan untuk semua contoh. penggunaan i += 2 pada contoh 2 dan i-- pada contoh 3 
menunjukkan kontrol penuh atas laju perulangan. 
contoh 4 menunjukkan kemampuan for loop untuk menghasilkan output yang tersetruktur (tabel perkalian) 
melalui oprasi matematika di dalam blok perulangan.

### Praktikum 7 - Perulangan While dan Do-While
#### Dasar Teori
while loop mengulang selama kondisi true, dan dengan pemeriksaan di awal. 
do-while loop menjamin eksekusi blok kode minimal satu kali, karena kondsi diperiksa diakhir perulangan.
#### Langkah Praktikum
1. membuat file WhileLoopDemo.java.
2. mengimplementasikan permaina tebak angka mengunakan while loop yang trus berjalan hinga tebakan benar.
3. mengimplemnatsikan sistem menu menggunakan do-while loop yang menjamin menu tampilan minimal sekali.
#### Screenshoot Hasil
![output program WhileLoopDemo](screenshots/P7_WhileLoopDemon.png)
#### Analisa dan Pembahasan
pada tebak angka, while loop efektif karena perulangan hanya berhenti setelah kondisi kemenangan tercapai. 
untuk menu, do-while loop memastikan pengguna selalu melihat menu utama terlebih dahulu (eksekusi minimal satu kali) 
sebelum kondisi keluar (pilihan !=3) diperiksa untuk navigasi menu.

### Praktikum 8 - Nested Loop (perulangan bersarang)
#### Dasar Teori
Nested Loop adalah perulangan di dalam perulangan lain, ideal untuk memproses pola dua dimensi, 
di mana loop luar mengontrol baris dan loop dalam mengontrol kolom atau elemen baris.
#### Langkah Praktikum
1. membuat file NestedLoopDemo.java.
2. mencetak pola bintang segitiga dan pola angka segitiga.
3. mencetak tabel perkalian 1-5.
#### Screenshoot Hasil
![output program NestedLoopDemo](screenshots/P8_NestedLoopDemo.png)
#### Analisa dan Pembahasan
Pola berhasil dibuat menggunakan perulangan bersarang. Pada Pola Segitiga, loop dalam (j) dibatasi oleh nilai
iterasi loop luar (i), menghasilkan penambahan elemen di setiap baris. 
Tabel Perkalian juga menunjukkan penggunaan nested loop secara efisien untuk menghasilkan matriks data terstruktur 5×5.

---

## 3. Kesimpulan

Praktikum Modul 2 tentang Dasar Pemrograman Java telah berhasil diselesaikan. Implementasi yang sukses dari variabel, 
tipe data, input/output (Scanner), percabangan (if-else, switch), dan perulangan (for, while, do-while, nested loop)
menunjukkan pemahaman yang kuat tentang konsep pemrograman prosedural. Penguasaan struktur kontrol ini adalah fondasi 
penting untuk merancang alur logika program yang efisien dan interaktif.

---

## 5. Referensi
1. Java Documentation: Control Flow Statements — https://docs.oracle.com/javase/tutorial/java/nutsandbolts/flow/
2. Java Documentation: Variables and Data Types — https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html

---
