# Object Oriented Programming
## 1. Introduction

### a. Pengertian Object Oriented Programming
Object Oriented Programming merupakan sebuah paradigma atau teknik pemograman yang berfokus atau beriorentasi objek pada OOP. Dalam OOp, fungsi dan variabel dibungkus dalam sebuah objek atau class yang dapat saling berinteraksi sehingga dapat membuat sebuah program. Object Oriented Programming bertujuan untuk mempermudah pengembangan  sebuah program yang memiliki variabel dan fungsi yang dibungkus dalam sebuah object atau class.

### b. Alasan menggunakan Object Oriented Programming
•	OOP mampu meminimalisir program sehingga kode program tertata lebih rapi
•	Mempercepat proses pembuatan aplikasi. semakin besar aplikasi maka semakin kompleks kode program yang membuat kode sulit dimaintenance dan terjadi kesulitan dalam memodifikasi.
•	Dengan OOP, proses reuse kode-kode yang dibuat hampir sama dan mudah, karena kode yang sudah di buat sudah rapih dan terstruktur.

## 2. Komponen- Komponen OOP
    ### a. Attribute
    •	Atribut (attribute) adalah variabel pada kelas yang menyatakan properti atau karakteristik atau ciri dari suatu obyek. Dalam contoh kelas Animal (binatang) maka atribut dapat berupa name (nama), speed (kecepatan), sound (suara), dsb.

    ### b. Method
    •	Metode adalah fungsi yang didefinisikan di dalam kelas yang menggambarkan perilaku suatu objek. Setiap metode yang terkandung dalam definisi kelas dimulai dengan referensi ke objek instance.
    •	Metode di dalam kelas adalah block statement yang memiliki nama dan bisa dieksekusi dengan memanggilnya. Pemanggilan metode biasa disebut dengan “invoke”.
    •	Dalam contoh kelas Animal (binatang) maka method dapat berupa run (berlari), makeSound (bersuara), dsb.

    ### c. Class
    •	Class adalah prototype, atau blueprint, atau rancangan yang mendefinisikan variable dan method-methode pada seluruh objek tertentu. Class berfungsi untuk menampung isi dari program yang akan di jalankan, di dalamnya berisi atribut / type data dan method untuk menjalankan suatu program.
    •	Class merupakan suatu blueprint atau cetakan untuk menciptakan suatu instant dari object. class juga merupakan grup suatu object dengan kemiripan attributes/properties, behaviour dan relasi ke object lain. Contoh : Class Person, Vehicle, Tree, Fruit dan lain-lain. Pembuatan Class harus diawali dengan huruf besar

    ### d. Object
    •	Objek adalah instance dari kelas yang dibuat dengan data yang ditentukan secara khusus. Objek dapat sesuai dengan objek dunia nyata atau entitas abstrak. Ketika kelas didefinisikan pada awalnya, deskripsi adalah satu-satunya objek yang didefinisikan.
    •	Berikut tahapan dalam objek, yaitu:
    a.	Declaration: mendeklarasikan nama sebuah obyek
    b.	Instantiation: memerlukan sebuah perintah new untuk menciptakan obyek
    c.	Initialization: inisialisasi dari sebuah obyek setelah perintah new

    ### e. Inheritance
    •	Inheritance adalah konsep OOP dimana sebuah class dapat menurunkan property dan method yang dimilikinya kepada class lain. Konsep inheritance dipakai untuk memanfaatkan fitur code reuse, yakni menghindari terjadinya duplikasi kode program.
    •	Inheritance dalam konsep OOP adalah kemampuan untuk membentuk class baru yang memiliki fungsi turunan atau mirip dengan fungsi yang ada sebelumnya. Kelas dapat menggunakan kembali kode dari kelas lain. 
    •	Hubungan dan subkelas antar objek dapat ditetapkan, memungkinkan pengembang menggunakan kembali logika umum sambil tetap mempertahankan hierarki unik. Properti OOP ini memaksa analisis data yang lebih menyeluruh, mengurangi waktu pengembangan, dan memastikan tingkat akurasi yang lebih tinggi.

    ### f. Encapsulation
    •	Prinsip ini menyatakan bahwa semua informasi penting terkandung di dalam suatu objek dan hanya informasi tertentu yang terpapar. Implementasi dan status setiap objek disimpan secara pribadi di dalam kelas yang ditentukan. Objek lain tidak memiliki akses ke kelas ini atau otoritas untuk membuat perubahan. Mereka hanya dapat memanggil daftar fungsi atau metode publik. Karakteristik penyembunyian data ini memberikan keamanan program yang lebih besar dan menghindari kerusakan data yang tidak diinginkan.

    ### g. Abstraction
    •	Abstraction berarti menyembunyikan detail latar belakang dan hanya mewakili informasi yang diperlukan untuk dunia luar. Ini adalah proses penyederhanaan konsep dunia nyata menjadi komponen yang mutlak diperlukan. Seperti kala menggunakan handphone, kamu cukup memberikan suatu perintah, tanpa tahu bagaimana proses terlaksananya perintah tersebut.

    ### h. Polymorphism
    •	Polymorphism adalah kemampuan suatu pesan atau data untuk diproses lebih dari satu bentuk. Polymorphism sendiri adalah konsep di mana suatu objek yang berbeda-beda dapat diakses melalui interface yang sama.
    •	Sebagai contoh, kamu memiliki fungsi untuk menghitung luas suatu benda, sementara benda tersebut berbentuk segitiga, lingkaran, dan persegi yang memiliki rumus perhitungan tersendiri. Dengan polymorphism, dapat memasukkan fungsi perhitungan luas ke tiga benda tersebut, dengan tiap benda memiliki metode perhitungannya sendiri. Ini tentu akan mempermudah perintah yang sama untuk beberapa class atau subclass tertentu.

## 3.  Object Oriented Programming

    ### a. Class
    Contoh:
    Object: Motor
    Class: MotorSport, MotorMatic
    Kode program:
    •	MotorSport.java
    public class MotorSport {
        //body class
    }
    •	MotorMatic.java
    public class MotorMatic {
        //body class
    }

    ### b. Object
    •	Declaration
    •	Instantiation
    •	Initialization
    membuat Object Motor:
    Motor	objectMotor = new Motor();
    Motor  Inisialisasi Nama Objek
    objectMotor  Deklarasi Nama Objek
    Motor()  Instantiation Objek

    ### c. Method
    Object:	Variabel – Access Modifier
    #### Access Modifier
    •	Public (Class, Package, Subclass, Global)
    Public: Access modifier public bisa kita sebut sebagai modifier global. Artinya bisa diakses dari manapun bahkan package yang berbeda.
    •	Default (Class, Package)
    Default: Default modifier berarti penulisan kodenya tanpa atribut modifier. Ini berlaku untuk semua kelas, member, atau fungsi yang kita tuliskan tanpa access modifier. Modifier default bisa diakses selama masih dalam satu package.
    •	Private (Class)
    Private: Access modifier private akan membatasi akses hanya di dalam class. Private biasanya digunakan sebagai modifier dari member dan metode suatu class.
    •	Protected (Class, Package, Subclass)
    Protected: Access modifier protected bisa diakses selama masih dalam satu package. Protected memiliki sedikit perbedaan dengan default modifier. Perbedaannya adalah protected bisa diakses dari luar package. Akan tetapi, satu-satunya cara untuk akses dari luar package adalah kelas yang hendak mengakses, merupakan kelas turunannya.
    Contoh:
    public class Motor {				// Public Modifier
        int roda;
        int ccMesin;
        String merk;

            void jumlahRoda (int roda) {		// Default Modifier
                this.roda = roda;
            }
            private void jenis (String merk) {	// Private Modifier
                this.merk = merk;
            }
            protected void kecepatan (int cekMesin) {	// Protected Modifier
                this.ccMesin = ccMesin;
            }
    }

    ### d. Inheritance
    •	Parent
    Kode program: Motor,java
    public class Motor {
        String lisensi;

        void rem() {
            System.out.println(“Menjalankan fungsi rem”);
        }
        void gas() {
            System.out.println(“Menjalankan fungsi gas”);
        }
    }
    •	Child
    Kode program: MotorMatic,java
    public class MotorMatic extends Motor {
        void suara() {
            System.out.println(“brum brum brum”);
        }
        void setLisensi(String l) {
            lisensi = l;
        }
        Stirng getLisensi() {
            return lisensi;
        }
    }

    Kode program: MotorMoge,java
    public class MotorMoge extends Motor {
        void suara() {
            System.out.println(“roar roar roar”);
        }
        void setLisensi(String l) {
            lisensi = l;
        }
        Stirng getLisensi() {
            return lisensi;
        }
    }