public class App {
    public static void main(String[] args) {
        // Membuat objek InventarisApp untuk mengelola BarangElektronik
        InventarisApp<BarangElektronik> inventarisElektronik = new InventarisApp<>();
        InventarisApp<BarangPakaian> inventarisPakaian = new InventarisApp<>();

        // Menambahkan barang elektronik ke inventaris
        BarangElektronik barang1 = new BarangElektronik("001", "Laptop", 15000000);
        BarangElektronik barang2 = new BarangElektronik("002", "Smartphone", 8000000);
        BarangPakaian barang3 = new BarangPakaian("003", "kaos", 100000, 30000);
        BarangPakaian barang4 = new BarangPakaian("002", "Smartphone", 8000000, 40000);
        inventarisElektronik.tambahBarang(barang1);
        inventarisElektronik.tambahBarang(barang2);
        inventarisPakaian.tambahBarang(barang3);
        inventarisPakaian.tambahBarang(barang4);
        // Menampilkan daftar barang elektronik
        inventarisElektronik.tampilkanDaftarBarang();
        inventarisPakaian.tampilkanDaftarBarang();

        // Menghitung total nilai inventaris barang elektronik
        double totalNilaiElektronik = inventarisElektronik.hitungTotalNilaiInventaris();
        System.out.println("Total nilai inventaris barang elektronik: " + totalNilaiElektronik);
    }
}
