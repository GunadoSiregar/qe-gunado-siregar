# Introduction JMeter and Tutorial Record with JMeter

## 1. Tools

1. Apache JMeter
2. k6
3. LOCUST
4. BlazeMeter
5. SMARTBEAR LoadNinja

## 2. Alasan Menggunakan JMeter

Apache JMeter adalah perangkat lunak sumber terbuka, aplikasi dekstop java 100% murni, yang dirancang untuk memuat uji perilaku fungsional dan mengukur kinerja situs web. Awalnya dirancang untuk aplikasi web pengujian beban tetapi sejak itu diperluas ke fungsi pengujian lainnya.

## 3.  KelebihanJMeter

- Open Source
- Easy to use with GUI/ Non GUI

## 4. Komponen skrip JMeter

Beberapa komponen skrip JMeter

1. Rencana Tes / Test Plan
   Rencana besar tes yang akan dilakukan (parent)

2. Grup Utas / Thread Groups
   Sekelompok utas menjalankan skenario yang sama

3. Sampler / Samplers
   Sebutan untuk request yang dikirim ke server

4. Elemen konfigurasi / Config elements
   Elemen yang digunakan untuk konfigurasi atau modifikasi sampier requests yang dikum ke server

- Beberapa komponen skrip JMeter :

1. Pendengar / Listeners
   Perekam data yang dihasilkan dan tes

2. Pengatur waktu / Timers
   Fitur ini akan jalan duluan sebelum semua fitur yong loin berjalan

3. Pernyataan / Assertions
   Seperti pernyataan di API/Web/Testing, ini adalah kriteria tambahan apakah lulus/tidak

4. Prosesor pra-posting / Pre-post processors
   Fitur yang memproses response data sebelum/sesudah tes

## 5. Instalasi JMeter

### Install Tools

1. Install JDK (Java Development Kit)
2. Search JMeter
3. Download File
4. Open File

### Open Terminal

1. Navigate to the bin folder
2. Run JMeter

### Install Plugin

1. Search Plugin
2. Download file .jar
3. Open directory JMeter
4. Move file .jar
5. Restart

## 6. Komponen-komponen JMeter script

- Listener
  Perekam data yang dihasilkan dari tes
- Timers
  Fitur ini akan jalan duluan sebelum semua fitur yang lain berjalan
- Assertions
  Seperti assert pada API/Web/Testing merupakan kriteria tambahan apakah pass/tidak.
- Pre-post processors
  Fitur yang memproses respons data sebelum/sesudah tes