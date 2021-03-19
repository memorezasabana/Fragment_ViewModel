<p align="center">
  <a <code><img width="150" src="https://github.com/memorezasabana/Fragment_ViewModel/blob/master/new_final_logo.png"></code>
  </a>
</p>


# Fragment Communication using ViewModel

<img align="right" width="350" src="https://github.com/memorezasabana/Fragment_ViewModel/blob/master/video_sewain.gif">

Fragment biasanya hanya berkomunikasi dengan  parent activity. 
Fragment berkomunikasi melalui  parent activity yang memungkinkan activity mengelola input dan output data dari fragment tersebut dengan berkoordinasi dengan fragmen atau activity lain.
Pikirkan activity sebagai pengontrol yang mengelola semua interaksi dengan setiap fragment yang ada di dalamnya.

### 3 Cara Fragment dan Activity Dapat Berkomunikasi:
> - [x] Bundle - Activity can construct a fragment and set arguments
> - [x] Methods - Activity can call methods on a fragment instance
> - [x] Listener - Fragment can fire listener events on an activity via an interface

### Menavigasi Antar Fragment
> - [x] TabLayout - Tabs at the top
> - [x] Fragment Navigation Drawer - Slide out navigation menu
> - [x] ViewPager - Swiping between fragments

## View Model
ViewModel adalah pilihan ideal saat Anda perlu berbagi data antara beberapa fragmen atau antara fragmen dan aktivitas host-nya. Objek ViewModel menyimpan dan mengelola data UI.

## Live Data
LiveData adalah class penyimpanan data observable. Tidak seperti observable pada umumnya, LiveData berbasis siklus proses, yang berarti observable ini mengikuti siklus proses komponen aplikasi lainnya, seperti aktivitas, fragmen, atau layanan. 
Basis ini memastikan LiveData hanya mengupdate pengamat komponen aplikasi yang dalam status siklus proses aktif.

### Keuntungan Penggunaan LiveData
| Keuntungan|Penjelasan|
|-------------|------|
|Memastikan UI cocok dengan status data|LiveData mengikuti pola pengamat. LiveData memberi tahu objek Observer saat status siklus proses berubah. Anda dapat menggabungkan kode untuk mengupdate UI di objek Observer ini. Daripada mengupdate UI setiap kali data aplikasi berubah, pengamat Anda dapat mengupdate UI setiap kali terjadi perubahan.|
|Tidak ada kebocoran memori|Pengamat terikat pada objek Lifecycle dan mengosongkan sisa proses saat siklus proses pengamat diakhiri.|
|Penghentian proses tidak menyebabkan error|Jika siklus proses pengamat tidak aktif, seperti dalam kasus aktivitas di data sebelumnya, maka siklus proses pengamat tidak menerima peristiwa LiveData apa pun.|
|Tidak ada lagi penanganan siklus proses manual|Komponen UI hanya mengamati data yang relevan dan tidak menghentikan atau melanjutkan pengamatan. LiveData otomatis mengelola semua ini karena LiveData mengetahui terjadinya perubahan status siklus proses terkait saat melakukan pengamatan.|
|Data selalu diperbarui|Jika siklus proses menjadi nonaktif, siklus proses menerima data terbaru setelah aktif kembali. Misalnya, aktivitas yang berada di latar belakang menerima data terbaru setelah kembali digunakan.|
|Perubahan konfigurasi yang tepat|Jika suatu aktivitas atau fragmen dibuat kembali karena perubahan konfigurasi, seperti rotasi perangkat, aktivitas atau fragmen tersebut segera menerima data terbaru yang tersedia.|
|Berbagi resource|Anda dapat memperluas objek LiveData menggunakan pola singleton untuk menggabungkan layanan sistem sehingga dapat dibagikan di aplikasi Anda. Objek LiveData terhubung ke layanan sistem satu kali, dan setiap pengamat yang membutuhkan resource tersebut dapat langsung mengamati objek LiveData.|

## Project
<img align="center" src="https://github.com/memorezasabana/Fragment_ViewModel/blob/master/ui_sewain.png">

