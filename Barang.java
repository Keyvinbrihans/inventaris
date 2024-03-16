// Kelas abstrak Barang
public abstract class Barang {
    protected String kodeBarang;
    protected String namaBarang;

    public Barang(String kodeBarang, String namaBarang) {
        this.kodeBarang = kodeBarang;
        this.namaBarang = namaBarang;
    }

    // Metode abstrak untuk menghitung nilai barang
    abstract double hitungNilai();


    // Metode untuk mendapatkan kode barang
    public String getKodeBarang() {
        return kodeBarang;
    }

    // Metode untuk mendapatkan nama barang
    public String getNamaBarang() {
        return namaBarang;
    }
}
