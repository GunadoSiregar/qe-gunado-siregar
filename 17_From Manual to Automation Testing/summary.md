# From Manual To Automation Testing

## Introduction
Pada saat mengembangkan software akan sering ditemukan error untuk meminimalisir kerusakan pada software tersebut diperlukan testing yang dilakukan dengan cara Manual Testing dan Automation Testing.

## 1. Manual Testing 
Pengujian manual adalah langkah untuk mencari cacat/bug pada program perangkat lunka. Pada metode ini tester berperan penting untuk pengecekan aplikasi apakah bekerja dengan benar. Penguji melakukan pengecekan secara manual tanpa tools/script untuk memastikan aplikasi berjalan dengan baik tanpa ditemukan error. Pengujian testing bersifat visual karena langsung menguji cara kerja aplikasi tersebut. User Interface/UI adalah feedback atau hal yang tidak dapat ditemukan oleh automation testing.

### 1. Kelebihan Manual Testing
    - Mendapat visual feedback dimana tools tidak dapat membantu atau memberikan opini terhadap tampilan UI suatu software
    - Test Manual tidak memerlukan menggunakan tools atau software yang mahal.
    - Saat menguji perubahan kecil, tes otomatisasi akan membutuhkan pengkodean yang bisa memakan waktu. Sementara Anda bisa menguji secara manual dengan cepat.

### 2. Kekurangan Manual Testing
    - Kurang teliti dikarenakan kemungkinan akan terjadi Human Error.
    - Jika mendapat perubahan maka harus ditest secara awal.
    - Kelelahan dari kesalahan yang akan melewatkan dari kesalahan.

## 2. Automation Testing 
Automation testing merupakan testing yang membutuhkan automation tools yang digunakan untuk mengeksekusi test case kita untuk melakukan proses automation testing. Quality Assurance perlu membuat code atau script testing. Script yang sudah ditulis dengan benar akan melakukan validasi untuk membandingkan hasil yang diharapkan dengan hasil yang ada pada saat proses script berjalan. Quality Assurance akan mengecek apakah aplikasi yang sudah dijalankan apakah sudah berjalan atau tidak.

### 1. Kelebihan menggunakan Automation Testing
- Dapat menemukan bug pada manual tester dimana script dalam mencari lebih dalam dari manual biasa.
- Script lebih cepat dari tester 
- Test dapat dilakukan secara berulang dan berkala 

### 2. Kekurangan Menggunakan Automation Testing
- Penggunaan Automation Testing relatif mahalnamun dapat menghemat waktu serta utibilitas
- Kurangnya human element 
- Tidak adanya feedback dengan UI.

### 3. Kenapa harus menggunakan Automation Testing 
- Cara terbaik untuk meningkatkan efeksitivitas, cakupan pengujian.
- Sulit untuk menguji situs multi bahasa secara manual.
- Automation test dalam perangkat lunak dapat dilakukan tanpa kerja tangan manusia dimana dalam melakukan automation testing tidak perlu dilakukan pengawasan.
- Automation test meningkatkan kecepatan eksekusi test.
- Automation test membantu meningkatkan scope dari test tersebut.

### 4. Which Test Case to Automate 
- Kasus uji yang dieksekusi berulang kali
- Uji kasus yang sangat membosankan atau sulit dilakukan secara manual
- Uji kasus yang memakan waktu untuk dilakukan secara manual.

### 5. Which Test Case NOT to Automate?
- Test case yang baru dirancang dan belum pernah dieksekusi sama sekali 
- Test case yang sering berubah 

### 6. Automate Testing Process 
1. Test Tool Selection 
- Usabilty
- Simplicity
- Cost 

2. Define Scope of Automation 
    Ada beberapa poin yang digunakan untuk menentukan scope dari pengujian sebuah software antara lain : 
    - Fitur fitur yang penting untuk bisnis
    - Scenario yang memiliki banyak data
    - Functional umum di seluruh aplikasi bisnis 
    - Kelayakan Teknis
    - Sejauh mana komponen bisnis digunakan kembali
    - Kompleksitas test case  
    - Kemampuan untuk menggunakan test case yang sama untuk pengujian lintas browser 

3. Planning, Design dan Development
Pada fase ini akan dirancang strategi yang nantinya akan berisi berupa tools automation yang dipilih, desain kerangka dan fitur-fiturnya, item automation di dalam dan diluar cakupan, persiapan test plan automation, jadwal dan timeline dari scripting yang dieksekusi serta timeline dari script yang telah dirancang.

4. Test Execution 
Script yang telah dibuat akan dijalankan pada fase ini. Script membutuhkan input test data sebelum dijalankan dan setelah dijalankan kita akan mendapatkan sebuah record dengan menggunakan bantuan trigger manajemen tools.

5. Maintenance 
Maintenance perlu dilakukan ketika Automation Script perlu ditambahkan, direview untuk meningkatkan automation testing di script yang berurutan.

### Automation Best Practices
1. Scope of automation
2. Select the right automation tool
3. Scripting Standars
4. Measure metrics 