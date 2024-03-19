1.Deskripsi sturktur

-src/test/java/heleper/JSONSchemaData: tempat menyimpan kelas atu file yang berhubungan dengan pengolahan atau validasi data JSON menggunakan JSON Schema.

-src/test/java/helper: digunakan untuk menyimpan kelas-kelas utilitas atau bantuan yang mendukung pengujian dalam proyek.

-src/test/java/page/: Berisi kelas-kelas yang mewakili halaman web dan mengimplementasikan pola Model Objek Halaman.

-src/test/java/runner/:tempat untuk menempatkan file-file yang terkait dengan jalannya pengujian dalam proyek menggunakan Cucumber.

-src/test/java/stepDef/:Berisi kelas-kelas yang menentukan langkah-langkah definisi untuk skenario pengujian menggunakan Cucumber.

-src/test/resources:Berisi file Gherkin '.feature' yang berisi skenario pengujian.

2.Implementasi

-page object model(POM):setiap halaman web direpresentasikan sebagai kelas java terpisah di dalam paket 'page'.contoh 'HomePage.java' akan berisi metode untuk berinteraksi dengan elemen di halaman berbeda.

-Cucumber Step Definition:paket 'stepDef' mendefinisikan langkah-langkah untuk skenario pengujian gherkin.

-Test cases(Gehrkin syntax):file 'login.feature' berisi skenario pengujian menggunaka gherkin syntax.

-Cucumber Implementation:framework menggunakan Cucumber untuk menjalankan skenario pengujian Gherkin dan membuat laporan.








![alt text](![Cuplikan layar 2024-03-19 234214](https://github.com/shultansyafa/web-api-automation/assets/155574309/921da9e1-6d7c-478a-8561-87ba1d8d7b0b)
?raw=true)
