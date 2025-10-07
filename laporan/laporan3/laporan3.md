# Laporan Modul 2: Dasar Pemrograman Java Lanjutan
**Mata Kuliah:** Praktikum Pemrograman Berorientasi Objek   
**Nama:** DWI IDA RAHMADANI SITUORANG  
**NIM:** 2024573010028  
**Kelas:** TI 2E

---
## 1. Abstrak
Laporan ini merangkum hasil implementasi pratikum modul 3, yang berfokus pada konsep pemograman java lanjutan. 
tujuan utama laporan ini adalah untuk mendemonstarsikan penguasaan terhadap Array (satu dan dua dimensi) sebagai struktur 
dan homogen, Method/Function untuk modularisasi kode, dan String Manipulation untuk pengolahan data teks, termasuk validasi. 
setiap pratikum diuji coba, dan hasilnya dianalisis untuk memastikan program belajar sesuai logika yang dirancang.
---
## 2. Praktikum
### Praktikum 1.1 - Array Satu Dimensi (ArraySatuDimensi.java)
#### Dasar Teori
Array satu dimensi (1D) adalah struktur data yang menyimpan urutan elemen dan tipe data yang sama, diakses melalui indeks tunggal. 
ukuran array dideklarasikan di awal dan bersifat tetap (fixed size).
#### Langkah Praktikum
1. Mendeklarasikan dan menginisialisasi array integer (nilai) dan array string (nama).
2. Menampilkan panjang array menggunakan properti .length.
3. Mengakses dan mencetak elemen pertama array melalui indeks [0].
4. Menggunakan perulangan for untuk mencetak semua data mahasiswa (nama dan nilai) secara berurutan, serta mengidentifikasi 
5. dan mencetak nilai tertinggi dan terendah.
#### Screenshoot Hasil
![output program ArraySatuDimensi](screenshots/G1_ArraySatuDimensi.png)
#### Analisa dan Pembahasan
Array 1 dimensi berhasil diimplementasikan untuk data nilai. fitur pencaraian nilai tertinggi dan terendah dilakukan dnegan 
inisialisai variabel max dan min ke elemen pertama, diikuti dengan iterasi menggunakan for-each loop. logika ini memastikan
bawha seluruh elemen array diperiksa untuk menemukan nilai extrem.

### Praktikum 1.2 - Array Dua Dimensi (ArrayDuaDimensi.java)
#### Dasar Teori
Array dua dimensi (2D) digunakan untuk merepresentasikan data tabular atau matriks, diakses menggunakan dua indeks yaitu baris 
dan kolom. array dua dimensi sering diperoses menggunakan perulangan bersarang (nested loop).
#### Langkah Praktikum
1. Mendeklarasikan array dua dimensi integer (nilaiSiswa) dan array satu dimensi string (namaSiswa,mapel).
2. Menggunakan scanner dan nested loop (loop luar untuk siswa, loop dalam untuk mapel) untuk mengisi nilai ke dalam array dua dimensi.
3. Menampilkan header tabel, termasuk nama mata pelajaran.
4. Menggunakan nested loop lagi untuk mencetak semua nilai dan menghitung rata-rata nilai setiap siswa.
#### Screenshoot Hasil
![output program ArrayDuaDimensi](screenshots/G2_ArrayDuaDimensi.png)
#### Analisa dan Pembahasan
peogram array dua dimensi berjalan sukses menggunakan nested loop. loop luar mengontrol barisan (siswa), dan loop dalam 
mengontrol kolom (nilai mata kuliah). data berhasil diinput menggunakan scanner dan dan ditampilkan dalam format tabel, 
membuktikan efektivitas array dua dimensi untuk manajemen data multivariat.

### Praktikum 2.1 - Methode Dasar (methodDasar.java)
#### Dasar Teori
Methode memungkinkan kode dipecah menjadi unit-unit logis yang independen dan dapat digunakan kembali (reusable). method 
dapat memiliki tipe void (tidak mengembalikan nilai) atau memiliki tipe return (mengembalikan nilai).
#### Langkah Praktikum
1. Membuat methode tampilkanHeader() bertipe void untuk menampilkan  judul program.
2. Membuat return method seperti tambah(), kurang(), kali(), dan bagi() yang menerima dua parameter double.
3. Mengimplementasikan validasi pembagi nol di dalam method bagi().
4. Memanggil semua method dari dalam main untuk demonstrasi fungsionalitas.
#### Screenshoot Hasil
![output program methodDasar](screenshots/G3_MethodDasar.png)
#### Analisa dan Pembahasan
Methode aritmatika berhasil diimplemntasikan sebagai return method. memisahkan logika perhitungan dari main method. 
method tampilkanHasil diimplemntasikan sebagai method void yang bertugas hanya untuk mencetak hasil, menunjukkan pemisahan 
tanggung jawab yang baik antar method.

### Praktikum 2.2 - Method Dengan Array (ArrayMethod.java)
#### Dasar Teori
Method sering menerima array sebagai parameter untuk melakukan pemrosesan data massal. 
Karena array dilewatkan secara referensi di Java, method memiliki akses langsung untuk memproses data.
#### Langkah Praktikum
1. Membuat method inputArray() yang menerima ukuran dan mengembalikan array yang sudah diisi oleh pengguna.
2. Membuat method cariMaksimum(), cariMinimum(), dan hitungRataRata() yang menerima array integer.
3. Membuat method urutkanArray() yang menyalin array asli menggunakan Arrays.copyOf() sebelum mengurutkannya.
4. Memanggil semua method di main untuk menganalisis data array.
#### Screenshoot Hasil
![output program ArrayMethod](screenshots/G4_ArrayMethod.png)
#### Analisa dan Pembahasan
Method berhasil digunakan untuk menganalisis array, termasuk cariMaksimum dan hitungRataRata. 
Method urutkanArray dibuat dengan menyalin array asli, yang menjaga integritas data array asli di main method, 
sebuah praktik yang baik saat bekerja dengan array yang dilewatkan melalui referensi.

### Praktikum 3.1 - Manipulasi String Dasar (StringDasar.java)
#### Dasar Teori
String adalah objek immutable (tidak dapat diubah) di Java, menyediakan banyak built-in method (length(), toUpperCase(), 
replaceAll()) untuk manipulasi teks.
#### Langkah Praktikum
1. Membuat method analisisString() untuk menampilkan panjang, karakter, dan case dari string.
2. Membuat method reverseString() menggunakan StringBuilder untuk membalik urutan string.
3. Membuat method boolean isPalindrome() yang membersihkan string (menghilangkan spasi/tanda baca) sebelum membandingkannya dengan versi terbalik.
4. Di main method, meminta input kalimat dan menguji apakah kalimat tersebut merupakan palindrome.
![output program StringDasar](screenshots/G5_StringDasar.png)
#### Analisa dan Pembahasan
Program sukses menentukan apakah input adalah palindrome. Hal ini dicapai dengan membersihkan string dan mengubahnya 
menjadi huruf kecil, kemudian membandingkannya dengan versi terbalik. Penggunaan StringBuilder dalam proses pembalikan 
string jauh lebih efisien dibandingkan dengan konkatenasi string biasa.

### Praktikum 3.2 - Pengolahan Data Teks (TextProcessing.java)
#### Dasar Teori
Pengolahan data tekstual sering memerlukan pemisahan data berdasarkan delimiter (pemisah). Method split() menggunakan 
regular expression (regex) untuk memecah string menjadi array.
#### Langkah Praktikum
1. Menerima input string yang berisi daftar nama dipisahkan oleh koma (,) atau titik koma (;).
2. Menggunakan method split("[,;]") untuk memecah string menjadi array.
3. Melakukan analisis data, termasuk: menghitung jumlah elemen, mencari nama terpanjang dan terpendek, serta mengurutkan daftar nama secara alfabetis.
4. Mendemonstrasikan String Formatting seperti mengubah string menjadi format Title Case.
#### Screenshoot Hasil
![output program extProcessing](screenshots/G6_TextProcessing.png)
#### Analisa dan Pembahasan
Program berhasil memisahkan daftar nama menggunakan regex split("[,;]"). Setelah dipisahkan, 
program menganalisis panjang nama dan mengurutkannya menggunakan Arrays.sort(). Program ini menunjukkan kemampuan penting 
untuk mengurai dan menganalisis data terstruktur dalam format teks.

## 3. Tugas Latihan
### Latihan 1 -Array Satu dimensi Analisis (latihan1.java)
#### Langkah Praktikum
1. Mendeklarasikan array integer untuk 10 nilai ujian.
2. Menggunakan for loop untuk menghitung total nilai, sekaligus mencari nilai maksimum (max) dan minimum (min) dalam satu kali iterasi.
3. Mencetak hasil: daftar nilai, rata-rata, nilai tertinggi, dan nilai terendah.
#### Screenshoot Hasil
![output program latihan1](screenshots/latihan_1.png)
#### Analisa dan Pembahasan
Program berhasil menghitung rata-rata nilai ujian dan mengidentifikasi nilai tertinggi serta terendah dari array 10 siswa. 
Logika iterasi tunggal digunakan secara efisien untuk menghitung total nilai secara keseluruhan sekaligus mencari nilai ekstrem.

### Latihan 2 -Array Dua Dimensi lanjut (latihan2.java)
#### Langkah Praktikum
1. Mendeklarasikan array 2D untuk nilai siswa dan mata pelajaran.
2. Menggunakan nested loop untuk: Mencari nilai tertinggi per siswa, dan Menghitung total nilai per mata pelajaran.
3. Mencetak nama mata pelajaran dengan nilai tertinggi untuk setiap siswa.
4. Mencetak rata-rata nilai untuk setiap mata pelajaran.
#### Screenshoot Hasil
![output program latihan2](screenshots/latihan_2.png)
#### Analisa dan Pembahasan
Program berhasil menampilkan mata pelajaran dengan nilai tertinggi per siswa dan menghitung rata-rata nilai per mata pelajaran.
Perhitungan rata-rata per mata pelajaran memerlukan iterasi kolom/vertikal pada array 2D.

### Latihan 3 -Method Kalkulator Lanjutan (latihan3.java)
#### Langkah Praktikum
1. Membuat method kalkulator dasar (tambah, kurang, kali, bagi).
2. Menambahkan method pangkat() menggunakan Math.pow().
3. Menambahkan method akarKuadrat() menggunakan Math.sqrt().
4. Memperkuat method bagi() dengan validasi pembagi nol eksplisit.
#### Screenshoot Hasil
![output program latihan3](screenshots/latihan_3.png)
#### Analisa dan Pembahasan
Dua method baru ditambahkan: operasi pangkat dan akar kuadrat. Yang paling penting, method pembagian diimplementasikan 
dengan validasi pembagi nol untuk menghindari runtime error ArithmeticException, meningkatkan keandalan program.

### Latihan 4 -Array dan Median (latihan4.java)
#### Langkah Praktikum
1. Membuat method cariNilai() yang mengembalikan indeks nilai target.
2. Membuat method hitungMedian() yang: Menyalin dan mengurutkan array input.
3. Menghitung median (elemen tengah tunggal untuk ganjil, rata-rata dua elemen tengah untuk genap).
4. Memanggil kedua method tersebut di main dan mencetak hasilnya.
#### Screenshoot Hasil
![output program latihan4](screenshots/latihan_4.png)
#### Analisa dan Pembahasan
Method hitungMedian berhasil diterapkan dengan langkah awal pengurutan array. Logika pengecekan array ganjil atau genap 
digunakan untuk menentukan median secara akurat.


### Latihan 5 -String Konsonan dan Pascal Case (latihan5.java)
#### Langkah Praktikum
1. Membuat method hitungKonsonan(): membersihkan string dan menghitung karakter yang bukan vokal ('a', 'i', 'u', 'e', 'o').
2. Membuat method toPascalCase(): memecah string berdasarkan spasi, mengkapitalisasi huruf pertama setiap kata, dan menggabungkannya tanpa spasi.
3. Menguji kedua method dengan input dari pengguna.
#### Screenshoot Hasil
![output program latihan5](screenshots/latihan_5.png)
#### Analisa dan Pembahasan
Method hitungKonsonan berhasil memfilter vokal. Method toPascalCase berhasil diterapkan, menjadikannya sesuai standar 
penamaan kelas Java (misalnya: "pemrograman berorientasi objek" menjadi "PemrogramanBerorientasiObjek").

### Latihan 6 -Generate Email & Validasi Nama (latihan6.java)
#### Langkah Praktikum
1. Membuat method boolean validasiNama() yang menggunakan Regular Expression (Regex) [a-zA-Z\\s]+ untuk memastikan input nama hanya berisi huruf dan spasi.
2. Membuat method generateEmail(): memecah nama lengkap menjadi kata-kata, mengambil kata pertama dan terakhir, dan merakitnya menjadi format email standar.
3. Menggunakan do-while loop dan validasiNama() untuk meminta input nama yang valid.
#### Screenshoot Hasil
![output program latihan6](screenshots/latihan_6.png)
#### Analisa dan Pembahasan
Dua fungsionalitas utama diselesaikan: Validasi Nama menggunakan regex mencegah input karakter ilegal. Kemudian, 
generateEmail merakit alamat email secara otomatis, menunjukkan aplikasi praktis dari manipulasi string.
---

## 3. Kesimpulan

Praktikum Modul 3 tentang Dasar Pemrograman Java Lanjutan telah berhasil dilaksanakan. Penguasaan Array memungkinkan 
penanganan data terstruktur, sementara penerapan Method meningkatkan modularitas. Keterampilan String Manipulation dan 
penggunaan Regular Expression terbukti esensial dalam pengolahan dan validasi data tekstual.
---

## 5. Referensi
1. Java Documentation: Collections and Array — https://docs.oracle.com/javase/tutorial/collections/
2. Java Documentation: Methods — https://docs.oracle.com/javase/tutorial/java/javaOO/methods.html

---
