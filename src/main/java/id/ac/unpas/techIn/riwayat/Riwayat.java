package id.ac.unpas.techIn.riwayat;

// JenisMember adalah class yang digunakan untuk menyimpan data jenis member

import id.ac.unpas.techIn.penjemputan.*;
import id.ac.unpas.techIn.riwayat.*;
import id.ac.unpas.techIn.pelanggan.*;
// JenisMember adalah class yang digunakan untuk menyimpan data jenis member
public class Riwayat {
    // id adalah variabel yang digunakan untuk menyimpan id dari jenis member
    private int id;
    // namaKurir adalah variabel yang digunakan untuk menyimpan namaKurir dari jenis member
    private String namaKurir;
    private String namaPelanggan;
    private String alamatPenjemputan;
    private String noKendaraan;
    private float beratSampah;
    private int jumlahSampah;
    private float hargaSampah;
    private int poinSampah;
    private int idPermintaan;
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
    
    // setter namaKurirKurir digunakan untuk mengubah nilai dari variabel namaKurir
    public void setNamaKurir(String namaKurir) {
        // this.namaKurir diberikan nilai dari parameter namaKurir
        this.namaKurir = namaKurir;
    }

    // getter namaKurir digunakan untuk mengambil nilai dari variabel namaKurir
    public String getNamaKurir() {
        // mengembalikan nilai dari variabel namaKurir
        return this.namaKurir;
    } 
    
    // setter namaKurirKurir digunakan untuk mengubah nilai dari variabel namaKurir
    public void setNamaPelanggan(String namaPelanggan) {
        // this.namaKurir diberikan nilai dari parameter namaKurir
        this.namaPelanggan = namaPelanggan;
    }

    // getter namaKurir digunakan untuk mengambil nilai dari variabel namaKurir
    public String getNamaPelanggan() {
        // mengembalikan nilai dari variabel namaKurir
        return this.namaPelanggan;
    } 
    // setter alamatPenjemputan digunakan untuk mengubah nilai dari variabel alamatPenjemputan
    public void setAlamatPenjemputan(String alamatPenjemputan) {
        // this.alamatPenjemputan diberikan nilai dari parameter alamatPenjemputan
        this.alamatPenjemputan = alamatPenjemputan;
    }

    // getter alamatPenjemputan digunakan untuk mengambil nilai dari variabel alamatPenjemputan
    public String getAlamatPenjemputan() {
        // mengembalikan nilai dari variabel alamatPenjemputan
        return this.alamatPenjemputan;
    } 
    
    // setter alamatPenjemputan digunakan untuk mengubah nilai dari variabel alamatPenjemputan
    public void setNoKendaraan(String noKendaraan) {
        // this.alamatPenjemputan diberikan nilai dari parameter alamatPenjemputan
        this.noKendaraan = noKendaraan;
    }

    // getter alamatPenjemputan digunakan untuk mengambil nilai dari variabel alamatPenjemputan
    public String getNoKendaraan() {
        // mengembalikan nilai dari variabel alamatPenjemputan
        return this.noKendaraan;
    } 
    
    // setter namaKurirKurir digunakan untuk mengubah nilai dari variabel namaKurir
    public void setBeratSampah(float beratSampah) {
        // this.namaKurir diberikan nilai dari parameter namaKurir
        this.beratSampah = beratSampah;
    }

    // getter namaKurir digunakan untuk mengambil nilai dari variabel namaKurir
    public float getBeratSampah() {
        // mengembalikan nilai dari variabel namaKurir
        return this.beratSampah;
    } 
    
    // setter namaKurirKurir digunakan untuk mengubah nilai dari variabel namaKurir
    public void setHargaSampah(float hargaSampah) {
        // this.namaKurir diberikan nilai dari parameter namaKurir
        this.hargaSampah = hargaSampah;
    }

    // getter namaKurir digunakan untuk mengambil nilai dari variabel namaKurir
    public float getHargaSampah() {
        // mengembalikan nilai dari variabel namaKurir
        return this.hargaSampah;
    } 
    
    // setter namaKurirKurir digunakan untuk mengubah nilai dari variabel namaKurir
    public void setJumlahSampah(int jumlahSampah) {
        // this.namaKurir diberikan nilai dari parameter namaKurir
        this.jumlahSampah = jumlahSampah;
    }

    // getter namaKurir digunakan untuk mengambil nilai dari variabel namaKurir
    public int getJumlahSampah() {
        // mengembalikan nilai dari variabel namaKurir
        return this.jumlahSampah;
    } 
    
    // setter namaKurirKurir digunakan untuk mengubah nilai dari variabel namaKurir
    public void setPoinSampah(int poinSampah) {
        // this.namaKurir diberikan nilai dari parameter namaKurir
        this.poinSampah = poinSampah;
    }

    // getter namaKurir digunakan untuk mengambil nilai dari variabel namaKurir
    public int getPoinSampah() {
        // mengembalikan nilai dari variabel namaKurir
        return this.poinSampah;
    } 

    // setter id digunakan untuk mengubah nilai dari variabel id
    public void setIdPermintaan(int idPermintaan) {
        // this.id diberikan nilai dari parameter id
        this.idPermintaan = idPermintaan;
    }
    
    // getter id digunakan untuk mengambil nilai dari variabel id
    public int getIdPermintaan() {
        // mengembalikan nilai dari variabel id
        return this.idPermintaan;
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
