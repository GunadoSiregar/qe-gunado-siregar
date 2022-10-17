# Mobile Automation Testing with Appium

## 1. Appium Intro
### 1. Appium
•	Appium adalah kerangka kerja otomatisasi seluler untuk menjalankan uji otomatisasi seluler.
•	Appium mendukung banyak bahasa pemrograman seperti java, python, javascript, ruby.
•	Pustaka Appium dibuat di atas pustaka Selenium
•	Mendukung aplikasi Android, iOS, dan Windows

### 2. Appium High Level Architecture
•	XCUITest
•	UIAutomator2/ Espreso
•	WinAppDriver

### 3. Appium Components
•	Di Appium ada dua komponen utama yang kami gunakan:
o	Server Appium. Appium Server digunakan sebagai jembatan untuk mengontrol perangkat pengujian. Ada dua versi, kita dapat menggunakan appium dekstop atau menginstal perintah appium menggunakan npm.
o	Appium Client. Sebuah Library yang ditulis dalam beberapa bahasa untuk membuat skrip pengujian sehingga kita dapat mengirim perintah ke server appium.

## 2. Installing Appium
### 1. Prerequisites
•	Jva JDK 8/11
•	Install Android SDk Platform-Tools & Command-line tools.
•	Appium Desktop
•	Node JS
•	Appium -doctor

## 3. Running Appium Desktop & Inspector
•	Connecting the Devices
•	Checking the Connected Devices
•	Running Appium Desktop
•	Using Appium Inspector
•	Desired Capabilities
•	Filing the Capabilities
•	Appium Inspector

## 4. Appium Locators
•	Appium Locator digunakan untuk menempatkan lokasi elemen-elemen (button, text field, radio button)
•	7 Locators:
o	ID
o	Class Name
o	Xpath
o	Accessibility ID
o	Android UI Automator
o	Android View Tag (Espresso Only)
o	iOS UI Automation

## 5. Project Initialization & Appium Basic Action
### 1. Using Maven Archetype
•	Pola dasar Maven digunakan untuk menghasilkan proyek dasar dengan semua dependensi dan struktur dasar
•	Serenity memiliki perpustakaan pola dasar sehingga Anda dapat menghasilkan proyek sampel baik menggunakan baris perintah atau menggunakan IDE
•	Anda dapat mengakses sampel pola dasar yang dihasilkan di github
•	Sudah menggunakan versi serenity-core terbaru.

### 2. Appium basic action and cucumber
•	Cucumber Frameworks
o	Mentimun BDD adalah kerangka kerja yang mendukung untuk membuat tes Otomasi pengembangan yang digerakkan oleh perilaku (BDD)
o	Menggunakan Sintaks gherkin
o	Mendukung berbagai bahasa pemrograman Java, Ruby, JavaScript, Python
o	Memiliki fitur dan dukungan hebat dengan Intellij IDEA IDE.

•	Adding Feature Files
Feature: Add Employee Feature

    Scenario: Success to add new employee

        Given Navigate to login page
        When User enter username "Admin"
        And User enter password "admin123"
        And Click button login
        Then validate title page login
        When User click button add
        And User enter firstName "Raden"
        And User enter middleName "Gunado"
        And User enter lastName "Siregar"
        And Click button save

### 3. Cucumber Tags
•	Tag adalah cara yang bagus untuk mengatur fitur dan skenario Anda
•	Mereka dapat digunakan untuk dua tujuan
•	Menjalankan subset scenario
•	Membatasi kait ke subste scenario
•	Anda dapat meletakkan tag pada kata kunci Fitur atau Skenario di atas pada file fitur
•	Tag pada kata kunci Fitur akan mewarisi semua skenario di dalam file fitur
•	Tag pada kata kunci skenario hanya diterapkan pada skenario tunggal

### 4. The WebdriverWait Object
•	Objek WebdriverWait digunakan untuk mengatur waktu tunggu hingga elemen memenuhi kondisi
•	Contoh : Tunggu sampai elemen terlihat tunggu sampai elemen hilang.
•	Ini adalah bagian dari penantian eksplisit
•	Konstruktor itu sendiri memiliki 3 parameter
1.	Parameter pertama untuk Objek AndroidDriver
2.	Parameter ke-2 untuk timeoit (waktu maksimum kita menunggu elemen memenuhi kondisi)
3.	Parameter ke-3 untuk waktu pemungutan suara (periksa setiap dan penggilingan)
•	Objek ExoectedConditions menyimpan daftar kondisi yang didukung oleh appium