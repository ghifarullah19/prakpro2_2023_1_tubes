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
    private String alamatPenjemputan;
    private String jenisSampah;
    private int poin;
    private int jumlahSampah;
    private float beratSampah;
    private float hargaSampah;
    private int idKurir;
    private int idPelanggan;
    
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
    public void setAlamatPenjemputan(String alamatPenjemputan) {
        // this.noKendaraan diberikan nilai dari parameter noKendaraan
        this.alamatPenjemputan = alamatPenjemputan;
    }

    // getter noKendaraan digunakan untuk mengambil nilai dari variabel noKendaraan
    public String getAlamatPenjemputan() {
        // mengembalikan nilai dari variabel noKendaraan
        return this.alamatPenjemputan;
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
    public void setJenisSampah(String jenisSampah) {
        // this.noKendaraan diberikan nilai dari parameter noKendaraan
        this.jenisSampah = jenisSampah;
    }

    // getter noKendaraan digunakan untuk mengambil nilai dari variabel noKendaraan
    public String getJenisSampah() {
        // mengembalikan nilai dari variabel noKendaraan
        return this.jenisSampah;
    } 
    
    // setter noKendaraan digunakan untuk mengubah nilai dari variabel noKendaraan
    public void setPoin(int poin) {
        // this.noKendaraan diberikan nilai dari parameter noKendaraan
        this.poin = poin;
    }

    // getter noKendaraan digunakan untuk mengambil nilai dari variabel noKendaraan
    public int getPoin() {
        // mengembalikan nilai dari variabel noKendaraan
        return this.poin;
    } 
    
    // setter noKendaraan digunakan untuk mengubah nilai dari variabel noKendaraan
    public void setJumlahSampah(int jumlahSampah) {
        // this.noKendaraan diberikan nilai dari parameter noKendaraan
        this.jumlahSampah = jumlahSampah;
    }

    // getter noKendaraan digunakan untuk mengambil nilai dari variabel noKendaraan
    public int getJumlahSampah() {
        // mengembalikan nilai dari variabel noKendaraan
        return this.jumlahSampah;
    } 
    
    // setter noKendaraan digunakan untuk mengubah nilai dari variabel noKendaraan
    public void setBeratSampah(float beratSampah) {
        // this.noKendaraan diberikan nilai dari parameter noKendaraan
        this.beratSampah = beratSampah;
    }

    // getter noKendaraan digunakan untuk mengambil nilai dari variabel noKendaraan
    public float getBeratSampah() {
        // mengembalikan nilai dari variabel noKendaraan
        return this.beratSampah;
    }
    
    // setter noKendaraan digunakan untuk mengubah nilai dari variabel noKendaraan
    public void setHargaSampah(float hargaSampah) {
        // this.noKendaraan diberikan nilai dari parameter noKendaraan
        this.hargaSampah = hargaSampah;
    }

    // getter noKendaraan digunakan untuk mengambil nilai dari variabel noKendaraan
    public float getHargaSampah() {
        // mengembalikan nilai dari variabel noKendaraan
        return this.hargaSampah;
    }

    // setter id digunakan untuk mengubah nilai dari variabel id
    public void setIdKurir(int idKurir) {
        // this.id diberikan nilai dari parameter id
        this.idKurir = idKurir;
    }
    
    // getter id digunakan untuk mengambil nilai dari variabel id
    public int getIdKurir() {
        // mengembalikan nilai dari variabel id
        return this.idKurir;
    } 
    
    // setter id digunakan untuk mengubah nilai dari variabel id
    public void setIdPelanggan(int idPelanggan) {
        // this.id diberikan nilai dari parameter id
        this.idPelanggan = idPelanggan;
    }
    
    // getter id digunakan untuk mengambil nilai dari variabel id
    public int getIdPelanggan() {
        // mengembalikan nilai dari variabel id
        return this.idPelanggan;
    } 
}
