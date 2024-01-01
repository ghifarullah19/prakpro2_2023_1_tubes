package id.ac.unpas.techIn.lacak;

// JenisMember adalah class yang digunakan untuk menyimpan data jenis member

import id.ac.unpas.techIn.permintaan.*;
import id.ac.unpas.techIn.pelanggan.*;
// JenisMember adalah class yang digunakan untuk menyimpan data jenis member
public class Lacak {
    // id adalah variabel yang digunakan untuk menyimpan id dari jenis member
    private int id;
    // namaPelanggan adalah variabel yang digunakan untuk menyimpan namaPelanggan dari jenis member
    private String namaPelanggan;
    private String namaKurir;
    private String alamatPenjemputan;
    private String alamatTujuan;
    private boolean status;
    
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
    
    // setter namaPelangganPelanggan digunakan untuk mengubah nilai dari variabel namaPelanggan
    public void setNamaPelanggan(String namaPelanggan) {
        // this.namaPelanggan diberikan nilai dari parameter namaPelanggan
        this.namaPelanggan = namaPelanggan;
    }

    // getter namaPelanggan digunakan untuk mengambil nilai dari variabel namaPelanggan
    public String getNamaPelanggan() {
        // mengembalikan nilai dari variabel namaPelanggan
        return this.namaPelanggan;
    } 
    
    // setter namaPelangganPelanggan digunakan untuk mengubah nilai dari variabel namaPelanggan
    public void setNamaKurir(String namaKurir) {
        // this.namaPelanggan diberikan nilai dari parameter namaPelanggan
        this.namaKurir = namaKurir;
    }

    // getter namaPelanggan digunakan untuk mengambil nilai dari variabel namaPelanggan
    public String getNamaKurir() {
        // mengembalikan nilai dari variabel namaPelanggan
        return this.namaKurir;
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
    public void setAlamatTujuan(String alamatTujuan) {
        // this.alamatPenjemputan diberikan nilai dari parameter alamatPenjemputan
        this.alamatTujuan = alamatTujuan;
    }

    // getter alamatPenjemputan digunakan untuk mengambil nilai dari variabel alamatPenjemputan
    public String getAlamatTujuan() {
        // mengembalikan nilai dari variabel alamatPenjemputan
        return this.alamatTujuan;
    } 
    
    // setter alamatPenjemputan digunakan untuk mengubah nilai dari variabel alamatPenjemputan
    public void setStatus(boolean status) {
        // this.alamatPenjemputan diberikan nilai dari parameter alamatPenjemputan
        this.status = status;
    }

    // getter alamatPenjemputan digunakan untuk mengambil nilai dari variabel alamatPenjemputan
    public boolean getStatus() {
        // mengembalikan nilai dari variabel alamatPenjemputan
        return this.status;
    } 
}
