package id.ac.unpas.techIn.kurir;

// JenisMember adalah class yang digunakan untuk menyimpan data jenis member

import id.ac.unpas.techIn.pelanggan.*;
// JenisMember adalah class yang digunakan untuk menyimpan data jenis member
public class Kurir {
    // id adalah variabel yang digunakan untuk menyimpan id dari jenis member
    private int id;
    // nama adalah variabel yang digunakan untuk menyimpan nama dari jenis member
    private String nama;
    private String noKendaraan;
    
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
    public void setNama(String nama) {
        // this.nama diberikan nilai dari parameter nama
        this.nama = nama;
    }

    // getter nama digunakan untuk mengambil nilai dari variabel nama
    public String getNama() {
        // mengembalikan nilai dari variabel nama
        return this.nama;
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
}
