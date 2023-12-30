package id.ac.unpas.techIn.permintaan;

// JenisMember adalah class yang digunakan untuk menyimpan data jenis member

import id.ac.unpas.techIn.pelanggan.*;
// JenisMember adalah class yang digunakan untuk menyimpan data jenis member
public class Permintaan {
    // id adalah variabel yang digunakan untuk menyimpan id dari jenis member
    private int id;
    // namaPelanggan adalah variabel yang digunakan untuk menyimpan namaPelanggan dari jenis member
    private String namaPelanggan;
    private String alamatPenjemputan;
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
    public void setNama(String namaPelanggan) {
        // this.namaPelanggan diberikan nilai dari parameter namaPelanggan
        this.namaPelanggan = namaPelanggan;
    }

    // getter namaPelanggan digunakan untuk mengambil nilai dari variabel namaPelanggan
    public String getNama() {
        // mengembalikan nilai dari variabel namaPelanggan
        return this.namaPelanggan;
    } 
    
    // setter alamatPenjemputan digunakan untuk mengubah nilai dari variabel alamatPenjemputan
    public void setAlamat(String alamatPenjemputan) {
        // this.alamatPenjemputan diberikan nilai dari parameter alamatPenjemputan
        this.alamatPenjemputan = alamatPenjemputan;
    }

    // getter alamatPenjemputan digunakan untuk mengambil nilai dari variabel alamatPenjemputan
    public String getAlamat() {
        // mengembalikan nilai dari variabel alamatPenjemputan
        return this.alamatPenjemputan;
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
