# Behaviour Driven Development (BDD)

## 1. What is BDD

BDD merupakan Proses software development yang menerapkan penulisan test case sebelum developer menuliskan instruction codenya. Proses ini berfokus pada komponen dalam sistem dan test case ditulis dalam bahasa pemograman.
BDD merupakan penerapan test case yang sama dengan TDD namun dengan fokus yang berbeda, dalam BDD test tim developer akan menuliskan berbagai skenario yang menjelaskan behaviour sistem dari perspektif pengguna. Scenario di tuliskan dnegan format bahasa dengan mudah di pahami oleh seluruh stackholder dalam pengembangan sistem.

## 2. Tujuan utama BDD
1.BDD memiliki tujuan utama untuk meningkatkan komunikasi dan kolaborasi antara seluruh stakeholders — tim bisnis maupun teknikal — yang terlibat dalam pengembangan sistem.

Dengan menggunakan BDD maka akan membantu kita memastikan bahwa :

- Fitur-fitur dalam sistem dapat dipahami dengan baik oleh seluruh anggota tim. Komunikasi yang baik dapat menyatukan persepsi stakeholders yang berbeda-beda dalam suatu pemahaman dan ekspektasi yang sama.
- Fitur-fitur dalam sistem dapat memenuhi kebutuhan pengguna dan menghasilkan business value.
- Deksripsi yang ada pada fitur file berfungsi sebagai test logic yang kemudian akan menjadi dasar bagi Quality Assurance dalam melakukan pengujian dan dasar development untuk membangun sistem.

## 3. Format BDD

- Feature file dalam BDD ditulis dalam bahasa Gerkins yang dapat dipahami oleh siapapun sehingga non technical dapat memahami aspek bisnis yang sedang dilakukan.

Ada beberapa tahap yang digunakan dalam BDD

1. User Story
2. - As a [x]
   - I Want [Y]
   - So that [z]
3. Scenario
4. - Given - When - Then
     Prinsip dasar dari BDD adalah mendeskripsikan behavior dari sebuah sistem tanpa melibatkan penjelasan implementasinya secara rinci. Terdapat pemisahan antara keduanya.
     Dalam pendekatan BDD, seluruh stakeholders (technical & non-technical) saling berkolaborasi untuk mendeskripsikan kebutuhan pengguna dan kebutuhan fungsional (behavior) sistem, yang dituliskan melalui feature files. Deskripsi yang ada dalam feature files berperan sebagai test logic, yang kemudian akan menjadi dasar bagi Quality Assurance (QA) dalam menuliskan test script untuk implementasi pengujian, dan dasar bagi developer dalam menuliskan implementation code untuk membangun sistem.
     Feature files pada BDD dituliskan menggunakan bahasa Gherkin, dengan format berbahasa Inggris yang mudah dipahami oleh siapa pun — terlepas dari technical knowledge yang dimiliki. Dengan demikian, non-technical stakeholders dapat tetap memahami test logic tanpa perlu memahami implementasi menggunakan kode pemrograman yang lebih kompleks. Begitu pula sebaliknya, technical stakeholders atau developer dapat turut memahami aspek bisnis dari sistem yang mereka implementasikan.

## 4. Tahapan BDD

- Tahap 1 — Menentukan user stories; untuk menjelaskan kebutuhan pengguna dan fungsionalitas sistem yang diharapkan
- Tahap 2 — Menuliskan skenario (dalam feature files, menggunakan Gherkin) berdasarkan user stories
- Tahap 3 — Mengimplementasikan test script (dalam step files) berdasarkan skenario
  Terdapat 3 keyword sebagai elemen utama dalam skenario BDD:
- Given — menjelaskan konteks dari skenario
- When — menjelaskan tindakan yang dilakukan oleh user
- Then — menjelaskan outcome dari tindakan yang dilakukan oleh user

## 5. Apa itu Cucumber?

Cucumber adalah sebuah tool yang mendukung BDD yang akan melakukan serangkaian behaviour test. Cucumber membaca semacam ketentuan yang dapat dieksekusi, dimana ditulis menggunakan teks biasa dan ketentuan tersebut memvalidasi bahwa sistem atau aplikasi melakukan apa yang dituliskan dalam ketentuan tersebut. Ketentuan tersebut terdiri dari beberapa skenario.