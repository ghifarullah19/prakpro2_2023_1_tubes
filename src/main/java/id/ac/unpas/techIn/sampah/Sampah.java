package id.ac.unpas.techIn.sampah;

// JenisMember adalah class yang digunakan untuk menyimpan data jenis member

import id.ac.unpas.techIn.kurir.*;
import id.ac.unpas.techIn.pelanggan.*;
// JenisMember adalah class yang digunakan untuk menyimpan data jenis member
public class Sampah {
    // id adalah variabel yang digunakan untuk menyimpan id dari jenis member
    private int id;
    // nama adalah variabel yang digunakan untuk menyimpan nama dari jenis member
    private String namaPelanggan;
    private String namaKurir;
    private String noKendaraan;
    private String jenisSampah;
    private int poin;
    private int jumlahSampah;
    private float beratSampah;
    
    // setter id digunakan untuk mengubah nilai dari variabel id
    public void setId(int id) {
        // this.id diberikan nilai dari parameter id
        this.id = id;
    }
    
    // getter id digunakan untuk mengambil nilai dari variabel id
    public int getId() {
        // mengembalikan nilai dari variabel id
        return this.id;
    } 
    
    // setter nama digunakan untuk mengubah nilai dari variabel nama
    public void setNamaPelanggan(String nama) {
        // this.nama diberikan nilai dari parameter nama
        this.namaPelanggan = nama;
    }

    // getter nama digunakan untuk mengambil nilai dari variabel nama
    public String getNamaPelanggan() {
        // mengembalikan nilai dari variabel nama
        return this.namaPelanggan;
    }
    
    // setter nama digunakan untuk mengubah nilai dari variabel nama
    public void setNamaKurir(String nama) {
        // this.nama diberikan nilai dari parameter nama
        this.namaKurir = nama;
    }

    // getter nama digunakan untuk mengambil nilai dari variabel nama
    public String getNamaKurir() {
        // mengembalikan nilai dari variabel nama
        return this.namaKurir;
    } 
    
    
    // setter noKendaraan digunakan untuk mengubah nilai dari variabel noKendaraan
    public void setNoKendaraan(String noKendaraan) {
        // this.noKendaraan diberikan nilai dari parameter noKendaraan
        this.noKendaraan = noKendaraan;
    }

    // getter noKendaraan digunakan untuk mengambil nilai dari variabel noKendaraan
    public String getNoKendaraan() {
        // mengembalikan nilai dari variabel noKendaraan
        return this.noKendaraan;
    } 
    
    // setter noKendaraan digunakan untuk mengubah nilai dari variabel noKendaraan
    public void jenisSampah(String jenisSampah) {
        // this.noKendaraan diberikan nilai dari parameter noKendaraan
        this.jenisSampah = jenisSampah;
    }

    // getter noKendaraan digunakan untuk mengambil nilai dari variabel noKendaraan
    public String getJenisSampah() {
        // mengembalikan nilai dari variabel noKendaraan
        return this.jenisSampah;
    } 
    
    // setter noKendaraan digunakan untuk mengubah nilai dari variabel noKendaraan
    public void beratSampah(float beratSampah) {
        // this.noKendaraan diberikan nilai dari parameter noKendaraan
        this.beratSampah = beratSampah;
    }

    // getter noKendaraan digunakan untuk mengambil nilai dari variabel noKendaraan
    public float getBeratSampah() {
        // mengembalikan nilai dari variabel noKendaraan
        return this.beratSampah;
    } 
    
    // setter noKendaraan digunakan untuk mengubah nilai dari variabel noKendaraan
    public void poin(int poin) {
        // this.noKendaraan diberikan nilai dari parameter noKendaraan
        this.poin = poin;
    }

    // getter noKendaraan digunakan untuk mengambil nilai dari variabel noKendaraan
    public int poin() {
        // mengembalikan nilai dari variabel noKendaraan
        return this.poin;
    } 
    
    // setter noKendaraan digunakan untuk mengubah nilai dari variabel noKendaraan
    public void setjumlahSampah(int jumlahSampah) {
        // this.noKendaraan diberikan nilai dari parameter noKendaraan
        this.jumlahSampah = jumlahSampah;
    }

    // getter noKendaraan digunakan untuk mengambil nilai dari variabel noKendaraan
    public int getJumlahSampah() {
        // mengembalikan nilai dari variabel noKendaraan
        return this.jumlahSampah;
    } 
    
    
}
