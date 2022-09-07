# linux Basic Commands

## 1. Introduction
Linux Command adalah sebuah uitlitas dari sebuah operasi Linux. Semua tugas dasar dan lanjutan dapat dilakukan dengan menjalankan command.

Linux adalah sebuah terminal antarmuka baris perintah yang dapat berinteraksi dengan sistem yang mirip dengan CMD di windows

- Kelebihan Command
1. Less Resources 
2. Repetitive Task Friendly
3. Powerfull 

## 2. Basic Linix Commands

### Linux Commands Structure 
command [options] [parameter]
ls -a /usr = File yang akan menampilkan namanya dimulai dari titik atau tersembunyi.

### Basic Command
- Cal = berfunngsi untuk menampilkan kalender
- Date = berfungsi untuk menampilkan tanggal

### File System Commands
- Touch merupakan command linux yang memperbolehkan untuk membuat file yang kosong melalui baris perintah linux.

- touch /home/username/document/web.html yang berfungsi membuat file web.html di dalam direktori
 dokumen.
- cat adalah salah satu perintah dasar berfungsi untuk membuat daftar konten atau isi file pada standard output contoh : cat file.txt
- cp adalah salah satu perintah yang berfungsi untuk menyalin file dari direktori aktif ke direktori lain.
- mv adalah salah satu perintah command linux yang dapat digunakan untuk memindahkan file ke direktori lain  dapat juga digunakan untuk mengganti nama file
 mv file.txt/home/username
 
- rm adalah command dasar linux untuk menghapus direktori beserta isinya dimana kita harus berhati hati untuk mencek direktori mana yang akan kita hapus dikarenakan file yang sudah dihapus tidak akan dapat dikembalikan lagi.

- mkdir untuk membuat direktori baru
- rmdir untuk menghapus direktori yang kosong
- cd digunakan untuk menjelajahi file di Linux
- pwd digunakan untuk memberikan informasi mengenai direktori aktif yang sedang Anda akses

### Process CONTROL Commands
1. top = berfungsi untuk menampilkan kinerja sistem secara real time seperti CPU, Memory, Serta proses yang sedang berjalan. Pengawasan terhadap resource sistem sangat disarankan
2. clear = berfungsi untuk membersihkan layar terminal. Dimana dengan mengeetikkan perintah terebut akan membersihkan perintah sebelummnya yang ada pada layar terminal linux.
3. history = berfungsi untuk mengecek kembali komen yang sudah ditambahkan sebelumnya.

### Utilities Program Commands
1. ls = menampilkan semua file yang ada di direktori kita
2. which = berfungsi untuk yang digunakan untuk mencari file yang dapat dieksekusi terkait dengan comment yang diberikan.
3. sudo = Sudo merupakan sebuah perintah yang digunakan untuk menjalankan task yang memerlukan hak akses atau permission adminstratif (root) penggunaan sudo tidak terlalu disarankan karena kapan saja bisa terjadi error apabila kita melakukan kesalahan.
4. find = find digunakan untuk mencari file dan direktori, lebih ditujukan untuk mencari file yang berlokasi di direktori yang dituju.

### FILE ACCESS Permissions
1. chmod = perintah dasar linuk yang digunakan untuk membaca permission dari file dan direktori.
2. chown = memungkinkan kita untuk ntuk mengubah pemilik file sistem file, direktori.

## 3. Shell Script
Shell script adalah sebuah bahasa pemrograman yang dieksekusi berdasakan shell commands dan juga shell merupakan program yang berfungsi sebagai jembatan antara user dan kernel. 
Keuntungan menggunakan shell pada dunia testing yaitu ketika harus mengeksekusi beberapa commands beruturut-turut, hal itu membuat kita harus menunggu command pertama baru bisa melakukan command berikutnya.