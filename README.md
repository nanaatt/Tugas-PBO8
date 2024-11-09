# LAPORAN TUGAS KEDELAPAN PEMROGRAMAN BERORIENTASI OBJEK

👨‍🏫 **Dosen Pembimbing**: Bayu Adhi Nugroho, Ph.D  
🎓 **Program Studi**: Sistem Informasi

📋 A. Penjelasan
Laporan ini melanjutkan pembelajaran minggu sebelumnya, di mana kita telah melakukan proses CRUD dan menambahkan fitur IReport serta file CSV. Pada tugas kali ini, kita akan menerapkan Java Persistence API (JPA) dalam proses CRUD. JPA memungkinkan aplikasi untuk mengelola data di database dengan lebih mudah melalui pendekatan berbasis objek. Untuk mengimplementasikan JPA, setiap tombol CRUD memerlukan kode yang berbeda dari sebelumnya. Berikut adalah langkah-langkah untuk melakukan konfigurasi JPA.

🛠️ Langkah-langkah Implementasi JPA pada CRUD:

1. Membuat Persistence Unit. 🏗️
     - Langkah pertama adalah membuat Persistence Unit. Jika tidak menemukan opsi "Entity Classes from Database", pilih "Other" untuk mencarinya.

   ![image](https://github.com/user-attachments/assets/40ab55c8-59e2-4656-84c5-66547df807e1)

2. Memilih Database Connection. 🌐
     - Pilih database yang telah dibuat sebelumnya untuk dijadikan sebagai koneksi database utama.

   ![image](https://github.com/user-attachments/assets/f7a6d688-c95a-4044-93b9-37d2aaea901c)

3. Memindahkan Tabel ke Kanan. ⬅️➡️
     - Pada jendela berikutnya, pindahkan tabel dari kotak kiri ke kotak kanan dengan menekan tombol Add All.

   ![image](https://github.com/user-attachments/assets/1e3d9997-b4bf-40dd-84d7-7b3549a44523)

4. Menekan Tombol Next. ▶️
     - Setelah itu, tekan tombol Next untuk melanjutkan.

   ![image](https://github.com/user-attachments/assets/730c5e8b-08cd-489a-a73d-bc7b2da73c06)

5. Menyelesaikan Konfigurasi. ✅
     - Tekan tombol Finish untuk menyelesaikan konfigurasi.

   ![image](https://github.com/user-attachments/assets/756e6767-5f68-4121-a399-affec78e4824)

6. Memeriksa Package Tambahan. 📦
     - Setelah menekan Finish, akan muncul package tambahan bernama META-INF dan file-file pendukung lainnya, termasuk file/class MatakuliahPersist.java.

   ![image](https://github.com/user-attachments/assets/d673da6c-ffce-4f0a-aa20-6a1a18651fdd)

7. Menambahkan Kode pada Button Update. 🔄
     - Tambahkan kode berikut pada button Update untuk memperbarui data di database.

   ![image](https://github.com/user-attachments/assets/fef3c227-cbef-4214-bc45-11e35fba3b84)

8. Menambahkan Kode pada Button Insert. ➕
     - Tambahkan kode pada button Insert untuk menambahkan data baru ke dalam database.

   ![image](https://github.com/user-attachments/assets/e6693cb2-9cce-459a-84a5-0beff29c6d5d)

9. Menambahkan Kode pada Button Delete. ❌
     - Tambahkan kode pada button Delete untuk menghapus data dari database.

   ![image](https://github.com/user-attachments/assets/e89f0bf7-6517-44dc-8e55-3f5cc644b654)

10. Menambahkan Kode pada Button Upload. ⬆️
     - Jangan lupa tambahkan kode pada button Upload untuk mengunggah file jika diperlukan.

    ![image](https://github.com/user-attachments/assets/79670347-33c4-4c91-9dd3-60fa87498881)

11. Menambahkan Kode pada Button Tampil. 👁️
     - Langkah terakhir, tambahkan kode pada button Tampil agar data dari database dapat ditampilkan saat dipanggil.

    ![image](https://github.com/user-attachments/assets/be8d0e97-8bfa-44d8-bb56-b704c395bb80)

