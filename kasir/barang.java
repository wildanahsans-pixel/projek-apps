package kasir;

public class barang {
    private String kodeBarang;
    private String namaBarang;
    private double harga;
    private int stok;

    public barang(String kodeBarang, String namaBarang, double harga) {
        this.kodeBarang = kodeBarang;
        this.namaBarang = namaBarang;
        this.harga = harga;
        this.stok = stok;
    }
    public String getKodeBarang() {
        return kodeBarang;
    }
    public String getNamaBarang() {
        return namaBarang;
    }
    public double getHarga() {
        return harga;
    }
    public int getStok() {
        return stok;
    }
    public void setStok(int stok) {
        this.stok = stok;
    }

    @Override
    public String toString() {
        return kodeBarang + " - " + namaBarang + " | Harga: " + harga + " | Stok: " + stok;
    }



}
