package id.ac.unpas.techIn.pelanggan;

// JenisMember adalah class yang digunakan untuk menyimpan data jenis member
public class Pelanggan {
    // id adalah variabel yang digunakan untuk menyimpan id dari jenis member
    private int id;
    // nama adalah variabel yang digunakan untuk menyimpan nama dari jenis member
    private String nama;
    private String alamat;
    
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
    
    // setter alamat digunakan untuk mengubah nilai dari variabel alamat
    public void setAlamat(String alamat) {
        // this.alamat diberikan nilai dari parameter alamat
        this.alamat = alamat;
    }

    // getter alamat digunakan untuk mengambil nilai dari variabel alamat
    public String getAlamat() {
        // mengembalikan nilai dari variabel alamat
        return this.alamat;
    } 
}
