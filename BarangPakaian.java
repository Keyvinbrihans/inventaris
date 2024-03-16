class BarangPakaian extends Barang {
    int jumlah;
    long hargaSatuan;

    // Konstruktor
    public BarangPakaian(String kodeBarang, String namaBarang, int jumlah, long hargaSatuan) {
        super(kodeBarang, namaBarang);
        this.jumlah = jumlah;
        this.hargaSatuan = hargaSatuan;
    }
    
    // Implementasi metode hitungNilai untuk menghitung nilai barang pakaian
    @Override
    double hitungNilai() {
        // Contoh implementasi sederhana: mengembalikan total nilai (jumlah * hargaSatuan)
        return jumlah * (double)hargaSatuan;
    }
} 