# Understanding JMeter Result

## 1. Open JMeter
1.	Open terminal
2.	Navigate to the bin folder
3.	Run JMeter

## 2. Create Your Test Plan
1.	HTTp Request Defaults : https://regres.in/
2.	Get User : /api/users/3
3.	Post User : /api/users
Body Data :
{
	“name”: “${nama}”,
	“job”:”StudentALTA”
}
4.	CSV Name File
5.	Response Assertion : Select Radio Button Response Code Fill Pattern to test with 201
6.	Before ran your test, please save the test plan and save all listener with different name in /desktop/This-is-your-report.jmx

## 3. Run Test
1.	Summary Report
2.	Aggregate Report
3.	Throughput
Throughput = (number of requests) / (total time) * conversion
Where:
-	number of requests = number of executed requests 
-	total time = (lastSampleStartTime + lastSampleLoadTime – firstSampleStartTime)
-	conversion : the the unit of conversion value, example 1000 will convert the value to the second, 1000*60 will convert the value to the minute, etc

## 4. Quick Analyze
1.	Case 1
Response Time : Rendah (LOW)
Throughput : Rendah (LOW)
Conclude : Kasus ini tidak pernah terjadi.

2.	Case 2
Response Time : Rendah (LOW)
Throughput : Tinggi (HIGH)
Conclude : Ketika laporan menunjukkan bahwa waktu Respons rendah dan Throughput sangat tinggi. Itu berarti Server bekerja dengan sangat baik. Tes kinerja lulus atau Anda dapat mempertimbangkan untuk menambah beban dan terus mencari tahu batasan Server

3.	Case 3
Response Time : Tinggi (HIGH)
Throughput : Rendah (LOW)
Conclude : Ketika kami menemukan skenario di mana waktu Respons untuk permintaan tinggi tetapi Throughput jauh lebih rendah Ini menandakan bahwa Server tidak cukup mampu untuk mempertahankan/mengeksekusi permintaan. Yang meminta penyetelan di sisi server

4.	Case 4
Response Time : Tinggi (HIGH)
Throughput : Tinggi (HIGH)
Conclude : Ketika waktu Respon tinggi tetapi Throughput dibandingkan dengan Waktu respons jauh lebih tinggi Ini menyiratkan bahwa permintaan memakan waktu lebih lama karena kesalahan dalam aplikasi, mungkin skripnya tidak cukup baik. Kita tidak boleh menyalahkan waktu pemrosesan server untuk ini. Sekarang saatnya untuk mempertimbangkan faktor-faktor lain dan menyesuaikannya untuk membuat kinerja aplikasi lebih baik.

## 5. Overview of a Performance Test Report
1.	Pembahasan data yang sudah dimiliki
a.	Summary tentang system
b.	Kondisi awal system
c.	Target yang ingin dicapai
2.	Data performance test yang didapatkan
a.	Masukkan data dari metrics yang didapatkan 
3.	Interpretasi data performance test
a.	Interpretasi hasil dari metricsnya
4.	Saran
a.	Berikan saran agar system lebih baik lagi setelah dites