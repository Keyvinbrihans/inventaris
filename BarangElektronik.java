
public class BarangElektronik extends Barang{
    double harga;

    // Konstruktor
    public BarangElektronik(String kodeBarang, String namaBarang, double harga) {
        super(kodeBarang, namaBarang);
        this.harga = harga;
    }

    // Implementasi metode hitungNilai untuk menghitung nilai barang elektronik
    @Override
    double hitungNilai() {
        // Contoh implementasi sederhana: mengembalikan harga
        return harga;
    }
    enum JenisBarang {
            ELEKTRONIK,
            PAKAIAN
        }
}

