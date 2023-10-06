# smartwatch
sample for java
Langkah 1: Siapkan Lingkungan Pengembangan Java Anda
Instal Jawa:
Pastikan Anda telah menginstal Java Development Kit (JDK). Jika belum, Anda bisa mendownloadnya dari website resmi Oracle JDK atau menggunakan OpenJDK.

Siapkan Variabel Lingkungan (Opsional):
Siapkan variabel lingkungan PATH untuk menyertakan direktori bin JDK sehingga Anda dapat menjalankan javac dan java dari terminal.

Langkah 2: Buat Kelas SmartWatch
Buat File Baru untuk Kelas SmartWatch:
Buat file baru bernama SmartWatch.java dan buka di editor kode favorit Anda.

Tentukan Kelas SmartWatch:
Salin dan tempel kode kelas SmartWatch yang disediakan ke SmartWatch.java. Kelas ini mewakili jam tangan pintar dan berisi properti dan metode untuk menampilkan informasi dan melakukan tindakan.

Simpan Berkas:
Simpan file SmartWatch.java.

Langkah 3: Kompilasi Kelas SmartWatch
Buka Terminal:
Buka terminal atau prompt perintah.

Arahkan ke Direktori yang Berisi SmartWatch.java:
Gunakan perintah cd untuk mengubah direktori ke lokasi penyimpanan SmartWatch.java.

Kompilasi Kelas SmartWatch:
Jalankan perintah berikut untuk mengkompilasi kelas SmartWatch:

bash
Salin kode
javac SmartWatch.java
Langkah 4: Buat Kelas MainWatch
Buat File Baru untuk Kelas MainWatch:
Buat file baru bernama MainWatch.java dan buka di editor kode Anda.

Tentukan Kelas MainWatch:
Salin dan tempel kode kelas MainWatch yang disediakan ke MainWatch.java. Kelas ini membuat instance SmartWatch, menetapkan propertinya, dan memanggil metodenya.

Simpan Berkas:
Simpan file MainWatch.java.

Langkah 5: Kompilasi Kelas MainWatch
Buka Terminal:
Buka terminal atau prompt perintah.

Arahkan ke Direktori yang Berisi MainWatch.java:
Gunakan perintah cd untuk mengubah direktori ke lokasi penyimpanan MainWatch.java.

Kompilasi Kelas MainWatch:
Jalankan perintah berikut untuk mengkompilasi kelas MainWatch. Flag -cp menentukan classpath dan menyertakan direktori saat ini:

bash
Salin kode
javac -cp . MainWatch.java
Langkah 6: Jalankan Program Java
Jalankan Program Java:
Jalankan program Java yang telah dikompilasi menggunakan perintah java:

bash
Salin kode
java MainWatch
Program ini akan membuat instance SmartWatch, mengatur propertinya, dan menampilkan informasi tentang jam tangan pintar, mensimulasikan tampilan notifikasi, dan mensimulasikan pembuatan panggilan.

Langkah 7: Sesuaikan dan Eksperimen
Jangan ragu untuk menyesuaikan properti dan perilaku kelas SmartWatch agar sesuai dengan kebutuhan Anda. Anda dapat mengubah properti, menambahkan metode baru, atau menyempurnakan format tampilan dalam metode displayInfo().

Bereksperimenlah dengan nilai berbeda untuk properti jam tangan pintar dan amati bagaimana informasi tersebut ditampilkan saat Anda menjalankan program.

Selamat! Anda sekarang telah berhasil membuat dan menggunakan kelas SmartWatch di Java. Jangan ragu untuk menjelajahi dan memperluas fungsionalitas berdasarkan kebutuhan Anda.
