package id.ac.unpas.techIn.permintaan;

public class Permintaan {
    private int id;
    private String namaPelanggan;
    private String alamatPenjemputan;
    private boolean status;
    private int idPelanggan;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    public void setNama(String namaPelanggan) {
        this.namaPelanggan = namaPelanggan;
    }

    public String getNama() {
        return this.namaPelanggan;
    }

    public void setAlamat(String alamatPenjemputan) {
        this.alamatPenjemputan = alamatPenjemputan;
    }

    public String getAlamat() {
        return this.alamatPenjemputan;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public boolean getStatus() {
        return this.status;
    }

    public void setIdPelanggan(int idPelanggan) {
        this.idPelanggan = idPelanggan;
    }

    public int getIdPelanggan() {
        return this.idPelanggan;
    }
}
