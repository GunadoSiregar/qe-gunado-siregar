# 10 Introduction Basic Programming

## 1. Java Programming

- Java adalah bahasa pemrograman tingkat tinggi yang berorientasi objek dan program java tersusun dari bagian yang disebut kelas. Kelas terdiri atas metode-metode yang melakukan pekerjaan dan mengembalikan informasi setelah melakukan tugasnya.

#### Alasan menggunakan bahasa pemograman Java

1. Mudah Dikembangkan
   Setiap program atau aplikasi yang dibuat menggunakan bahasa pemrograman Java mempunyai kemampuan sangat baik untuk dikembangkan lebih lanjut. Hal ini tentunya membantu para programmer serta developer dalam mengembangkan aplikasi berbasis Java dengan lebih baik dari waktu ke waktu.

2. Bersifat Multiplatform
   Bahasa pemrograman Java bersifat universal atau multiplatform atau sistem operasi komputer, sehingga dapat dipakai dalam platform apa saja. Hal ini menjadi alasan mengapa banyak pengembang aplikasi yang memanfaatkan Java.

3. Mempunyai kemudahan dalam penyusunan suatu script
   Java adalah salah satu jenis bahasa pemrograman yang cukup mudah dipelajari. Para developer dan programmer harus memakai script dalam menyusuh sebuah program agar bisa berjalan. Dengan memakai bahasa pemrograman Java, maka script tersebut menjadi lebih mudah untuk dibuat serta dipelajari.

4. Berorientasi Kepada Objek
   Kelebihan lainnya dari Java yakni bersifat teknis. Java adalah salah satu jenis atau bentuk bahasa pemrograman yang berorientasi objek. Hal ini berarti setiap aplikasi yang dibuat dengan memanfaatkan Java dapat disesuaikan dengan objek dan bisa pula dengan interface atau tampilan dari aplikasi tersebut.

5. Pengumpulan Sampah secara Otomatis
   Bahasa pemrograman ini mempunyai fasilitas pengaturan pemakaian memori. Dengan demikian para programmer tidak perlu kerepotan dalam melakukan setting atau pengaturan memori.

6. Dinamis
   Java memiliki sifat dinamis yang mudah untuk dikembangkan oleh programer. Struktur kodenya dapat dengan mudah dikembangkan dan dimodifikasi sesuai kebutuhan user.

7. Terdapat Garbage Collector
   Fungsi dari garbage collector mampu mengumpulka “sampah” secara otomatis. Dengan begitu, programmer tidak perlu dibebani dengan adanya memori yang rusak. Java ini dapat menghilangkan keperluan aritmatika pointer yang bisa jadi membahayakan dan peluang terjadinya kesalahan juga tinggi.

8. Daftar perpustakaan yang lengkap
   Bahasa Java mempunyai daftar perpustakaan yang cukup lengkap. Dengan begitu, programmer dapat membuat suatu aplikasi sesuai dengan apa yang diinginkan. Perlu diperhatikan jika tidak semua bahasa pemrograman memiliki database yang diinginkan oleh programmer. Java menjadi populer juga karena ini.

9. Adanya Fitur GUI
   GUI atau singkatan dari Grafical User Interface merupakan salah satu fitur yang ada di dalam Java. Elemen dasar pada Java untuk terciptanya tampilan berbasis grafis ada dua macam yakni AWT dan juga Swing. AWT adalah singkatan dari Abstract Windowing Toolkit merupakan sebuah pustaka windowing yang bertujuan secara umum dan juga multiplatform.

## 2. TOOLS

Tools yang digunakan dalam bahasa pemograman Java adalah JDK dan IDE.

- JDK adalah sebuah perangkat lunak yang digunakan untuk melakukan proses kompilasi dari kode java ke bytecode yang dapat dimengerti dan dapat dijalankan oleh JRE (Java Runtime Envirotment). JDK wajib terinstall pada komputer yang akan melakukan proses pembuatan aplikasi berbasis java, namun tidak wajib terinstall di komputer yang akan menjalankan aplikasi yang dibangun dengan java.
- IDE adalah (Integrated Development Environment) adalah program komputer sebagai lingkungan pengembangan aplikasi atau program komputer yang mempunyai beberapa fasilitas yang dibutuhkan dalam pembangunan perangkat lunak (Software).

1. Fungsi JDK

- Developing
- Debugging
- Monitoring

2. IDE

- BlueJ
- NetBeans
- Eclipse
- Intelij IDEA

## 3. BASIC PROGRAMMING

#### TYPE DATA

Tipe data adalah adalah sebuah pengklasifikasian data berdasarkan jenis data tersebut. Tipe data dibutuhkan agar kompiler dapat mengetahui bagaimana sebuah data akan digunakan. Untuk mengembangkan sebuah program, ada beberapa tipe data yang akan kita pelajari. Di antaranya adalah Character, String, Array, Numbers dan Booleans.

1. Integer (int) = 100.10
   Tipe bilangan bulat (Integer) adalah tipe data numerik yang biasa digunakan apabila bertemu dengan bilangan bulat, seperti 1, 27, 100, dll. Bilangan ini juga mengenal nilai positif dan negatif (signed number).

2. Float (0.2, 0.05)
   Tipe data floating point adalah tipe data yang berfungsi menampung nilai real berupa desimal atau pecahan. Tipe data floating point dideklarasikan dengan kata “float” dan membutuhkan 4 byte memori. Contoh tipe data floating point adalah nilai “0,5”, “3,14”, dan “999,99”.

3. Double (0.03234, 0.00015)
   Tipe data double adalah tipe data 64 bit IEEE 754 floating point. tipe data ini umumnya digunakan untuk tipe data desimal. sebaiknya tipe data double tidak digunakan untuk nilai presisi seperti mata uang.

4. Boolean (True, False)
   Tipe data Boolean adalah tipe data yang berfungsi menampung nilai logika sepertu benar (true) dan salah (false). Tipe data Boolean dideklarasikan dengan kata “bool”.

5. Char ('A', 'Z')
   Tipe data (char) merupakan tipe data yang digunakan untuk menyimpan satu huruf, angka, tanda baca, simbol, atau spasi kosong.

6. String ("alterra", "id")
   Tipe data string adalah tipe data yang digunakan untuk menyimpan barisan karakter. Sebuah string umumnya dianggap sebagai tipe data dan sering diimplementasikan sebagai struktur data array bita (atau kata) yang menyimpan urutan elemen, biasanya karakter, menggunakan beberapa pengkodean karakter.

#### ARRAY

Array adalah variabel yang mempunyai indeks sehingga dapat menyimpan sejumlah data yang bertipe sama. Dimensi array adalah jumlah indeks pada variabel array. Array multi dimensi (lebih dari satu indeks, maksimal 7 indeks). Dalam perhitungan, array sering digunakan untuk operasi matriks.

#### Operator

Operator dalam pemrograman digunakan untuk melakukan operasi tertentu. Misalkan kita ingin menjumlahkan nilai dari variabel x dan y, maka kita bisa menggunakan operator penjumlahan (+).

- Assignment (=)
- Arithmetic (+, -, \*, /, %)
- Unary (+, -, ++, --, !)
- Equality and Relational (==, !=, >. >=, <,<=>)
- Conditional (&&, ||)

#### Input Output

Seperti yang kita ketahui program komputer terdiri dari 3 komponen yaitu input, proses dan output. Input yaitu nilai yang kita masukkan ke dalam program. Sedangkan proses adalah step by step yang dilakukan untuk mengelola input menjadi sesuatu yang berguna atau output. Output adalah hasil dari pengolahannya. Class yang digunakan Java untuk mengolah inputnya itu Class Scanner, BufferedReader dan Konsol. Scanner adalah class yang menyediakan fungsi-fungsi untuk mengambil input dari keyboard.

### Branching

Percabangan hanyalah sebuah istilah yang digunakan untuk menyebut alur program yang bercabang. Percabangan juga dikenal dengan “Control Flow”, “Struktur Kondisi”, “Struktur IF”, “Decision”, dsb. Semuanya itu sama. Pada diagram alur (Flow Chart) seperti di atas, alurnya memang satu. Tapi setelah kita menggunakan percabangan, alurnya akan bertambah. Pada java kita menggunakan kata kunci if, else, switch, dan case, dan operator ternary.

#### Percabangan IF

Fungsi IF memungkinkan Anda untuk membuat perbandingan logis antara nilai dan apa yang diharapkan dengan menguji kondisi dan mengembalikan hasil jika True atau False. Oleh karena itu, pernyataan IF dapat memiliki dua hasil. Hasil pertama jika perbandingan Anda Benar dan hasil kedua jika perbandingan Salah.

#### - Percabangan SWITCH/CASE

Percabangan kode program dimana kita membandingkan isi sebuah variabel dengan beberapa nilai. Jika proses perbandingan tersebut menghasilkan nilai true, maka block kode program akan dijalankan.

### Looping

Looping merupakan proses perulangan suatu blok pernyataan sebanyak yang diinginkan.
Ada tiga bentuk dalam proses perulangan:

1. Perulangan While
   Perulangan ini digunakan jika jumlah perulangannya belum diketahui. Proses perulangan akan terus berlanjut selama kondisinya bernilai benar (true) dan akan berhenti bila kondisinya bernilai salah.

2. Perulangan Do..While
   Perulangan ini digunakan jika jumlah perulangannya belum diketahui. Proses perulangan akan terus berlanjut selama kondisinya bernilai benar (true) dan akan berhenti bila kondisinya bernilai salah.

3. Perulangan For
   For do adalah bentuk perulangan dimana block statement akan dieksekusi secara berulang ulang sesuai dengan jumlah perulangan yang ditentukan.