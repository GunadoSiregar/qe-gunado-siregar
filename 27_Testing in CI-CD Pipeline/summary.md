# Testing in CI/CD Pipeline

## 1. Introduction CI/CD
### 1. Continuous Integration
•	Continuous Integration adalah praktik mengintegrasikan kode ke dalam repositori bersama dan membangun/menguji setiap perubahan secara otomatis sedini mungkin - biasanya beberapa kali sehari
•	Pencapaian terbaik dicapai melalui integrasi dengan kontrol versi

### 2. Continuous Delivery / Deployment
•	Continuous Delivery menambahkan bahwa perangkat lunak dapat dirilis ke produksi kapan saja, seringkali dengan secara otomatis mendorong perubahan ke sistem yang berubah
•	Continuous Deployment melangkah lebih jauh dan mendorong perubahan ke produksi secara otomatis

### 3. Delivery vs Deployment
•	Continuous Delivery
1.	Secara otomatis menyiapkan dan melacak rilis ke produksi
2.	Hasil yang diinginkan adalah bahwa siapa pun dengan hak istimewa yang cukup untuk rilis baru dapat melakukannya kapan saja dalam satu atau beberapa klik. Dengan menghilangkan hampir semua tugas manual, pengembang menjadi lebih produktif

•	Continuous Deployment
1.	Setiap perubahan dalam kode sumber disebarkan ke produksi secara otomatis tanpa eksplisit dari pengembang
2.	Selama melewati kontrol kualitas

## 2. What makes for Good CI
•	Decoupled Stages
o	Setiap langkah dalam CI harus melakukan tugas tunggal yang terfokus
•	Repeatable
o	Otomatis dengan cara yang dapat diulang secara konsisten
o	Alat harus bekerja untuk pengembang lokal juga
•	Fail Fast
o	Gagal pada tanda pertama masalah
•	Design with system in mind
o	Mengcover bagian dari deployment sebanyak mungkin, seperti aplikasi, infrastruktur, konfigurasi, dan data.
•	Pipelines
o	Bsecara berkelanjutan meningkatkan kepercayaan sebagai perpindahan produksi
•	Globally Unique versions
o	Mengetahui status dari system setiap waktu
o	mampu mendemonstrasikan perbedaan antara system sekarang dan system yang akan datang

## 3. CI / CD Process
1.	Commit
2.	Build
3.	Test
4.	Deploy

## 4. Benefits and Costs from implementing CI/CD
•	Mendeteksi Bug di Tahap Awal
•	Mengurangi Jumlah Bug
•	Proses Pengembangan Lebih Transparan
•	Efisien
•	Kurangi Risikonya
•	Penerapan Tanpa Rasa Sakit
•	Mengurangi Biaya
•	Proses Otomatis Dan Transparan
•	Rilis Lebih Sering
•	Tulis Tes Otomatis
•	Server Untuk Tes Otomatis
•	Gabungkan kode sesering mungkin
•	Fondasi yang Kuat di CI
•	Membutuhkan Kualitas Tes Tertinggi
•	Dokumentasi Perlu Sering Diperbarui

## 5. CI/CD Tools
•	JenKins
•	Bamboo
•	CircleCI
•	AWS Codebuild
•	Azure DevOps
•	CI/CD
•	Travis CI
•	Github

## 6. Github Actions
### 1. Componnets of Github Actions
•	WorkFlows
Alur kerja adalah proses otomatis yang dapat dikonfigurasi yang akan menjalankan satu atau lebih pekerjaan. Alur kerja yang ditentukan oleh file YAML diperiksa ke repositori Anda dan akan berjalan ketika dipicu oleh suatu peristiwa di repositori Anda atau mereka dapat dipicu secara manual atau pada jadwal yang ditentukan
•	Events
Peristiwa adalah aktivitas spesifik dalam repositori yang memicu alur kerja berjalan.
•	Runners
Runner adalah server yang menjalankan alur kerja Anda saat dipicu. Setiap pelari dapat menjalankan satu pekerjaan pada satu waktu. GitHub menyediakan Ubuntu Linux, Microsoft Windows dan
•	Actions
Action adalah aplikasi kustom untuk platform GitHub Actions yang melakukan tugas yang kompleks namun sering diulang. Gunakan tindakan untuk membantu mengurangi jumlah kode berulang yang Anda tulis di file alur kerja Anda