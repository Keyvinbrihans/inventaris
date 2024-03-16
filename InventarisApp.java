import java.util.ArrayList;
import java.util.List;

public class InventarisApp<T extends Barang> {
    private List<T> inventaris;

    // Konstruktor
    public InventarisApp() {
        inventaris = new ArrayList<>();
    }

    // Metode untuk menambahkan barang baru ke inventaris
    public void tambahBarang(T barang) {
        inventaris.add(barang);
    }

    // Metode untuk menampilkan daftar barang
    public void tampilkanDaftarBarang() {
        for (T barang : inventaris) {
            System.out.println("Kode Barang: " + barang.getKodeBarang());
            System.out.println("Nama Barang: " + barang.getNamaBarang());
            System.out.println("Nilai Barang: " + barang.hitungNilai());
            System.out.println();
        }
    }

    // Metode untuk menghitung total nilai inventaris
    public double hitungTotalNilaiInventaris() {
        double totalNilai = 0;
        for (T barang : inventaris) {
            totalNilai += barang.hitungNilai();
        }
        return totalNilai;
    }
}
