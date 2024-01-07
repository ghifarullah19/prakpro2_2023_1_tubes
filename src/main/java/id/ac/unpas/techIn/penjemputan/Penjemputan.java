package id.ac.unpas.techIn.penjemputan;

// JenisMember adalah class yang digunakan untuk menyimpan data jenis member

import id.ac.unpas.techIn.pelanggan.*;

// JenisMember adalah class yang digunakan untuk menyimpan data jenis member
public class Penjemputan {
    // id adalah variabel yang digunakan untuk menyimpan id dari jenis member
    private int id;
    // namaKurir adalah variabel yang digunakan untuk menyimpan namaKurir dari jenis
    // member
    private String namaKurir;
    private String alamatPenjemputan;
    private String alamatTujuan;
    private boolean status;
    private int idPermintaan;
    private int idKurir;

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
    public void setNama(String namaKurir) {
        // this.namaKurir diberikan nilai dari parameter namaKurir
        this.namaKurir = namaKurir;
    }

    // getter namaKurir digunakan untuk mengambil nilai dari variabel namaKurir
    public String getNama() {
        // mengembalikan nilai dari variabel namaKurir
        return this.namaKurir;
    }

    // setter alamatPenjemputan digunakan untuk mengubah nilai dari variabel
    // alamatPenjemputan
    public void setAlamat(String alamatPenjemputan) {
        // this.alamatPenjemputan diberikan nilai dari parameter alamatPenjemputan
        this.alamatPenjemputan = alamatPenjemputan;
    }

    // getter alamatPenjemputan digunakan untuk mengambil nilai dari variabel
    // alamatPenjemputan
    public String getAlamat() {
        // mengembalikan nilai dari variabel alamatPenjemputan
        return this.alamatPenjemputan;
    }

    // setter alamatPenjemputan digunakan untuk mengubah nilai dari variabel
    // alamatPenjemputan
    public void setAlamatTujuan(String alamatTujuan) {
        // this.alamatPenjemputan diberikan nilai dari parameter alamatPenjemputan
        this.alamatTujuan = alamatTujuan;
    }

    // getter alamatPenjemputan digunakan untuk mengambil nilai dari variabel
    // alamatPenjemputan
    public String getAlamatTujuan() {
        // mengembalikan nilai dari variabel alamatPenjemputan
        return this.alamatTujuan;
    }

    // setter alamatPenjemputan digunakan untuk mengubah nilai dari variabel
    // alamatPenjemputan
    public void setStatus(boolean status) {
        // this.alamatPenjemputan diberikan nilai dari parameter alamatPenjemputan
        this.status = status;
    }

    // getter alamatPenjemputan digunakan untuk mengambil nilai dari variabel
    // alamatPenjemputan
    public boolean getStatus() {
        // mengembalikan nilai dari variabel alamatPenjemputan
        return this.status;
    }

    // setter alamatPenjemputan digunakan untuk mengubah nilai dari variabel
    // alamatPenjemputan
    public void setIdPermintaan(int idPermintaan) {
        // this.alamatPenjemputan diberikan nilai dari parameter alamatPenjemputan
        this.idPermintaan = idPermintaan;
    }

    // getter alamatPenjemputan digunakan untuk mengambil nilai dari variabel
    // alamatPenjemputan
    public int getIdPermintaan() {
        // mengembalikan nilai dari variabel alamatPenjemputan
        return this.idPermintaan;
    }

    // setter alamatPenjemputan digunakan untuk mengubah nilai dari variabel
    // alamatPenjemputan
    public void setIdKurir(int idKurir) {
        // this.alamatPenjemputan diberikan nilai dari parameter alamatPenjemputan
        this.idKurir = idKurir;
    }

    // getter alamatPenjemputan digunakan untuk mengambil nilai dari variabel
    // alamatPenjemputan
    public int getIdKurir() {
        // mengembalikan nilai dari variabel alamatPenjemputan
        return this.idKurir;
    }
}
