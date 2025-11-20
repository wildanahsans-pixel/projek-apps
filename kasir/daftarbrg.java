package kasir;  

import java.util.List;

public class daftarbrg {
    private List<barang> daftarBarang;
    public daftarbrg(List<barang> daftarBarang) {
        this.daftarBarang = daftarBarang;
    }
    public List<barang> getDaftarBarang() {
        return daftarBarang;
    }

    public void tambahBarang(barang brg) {
        daftarBarang.add(brg);
    }
    public boolean hapusBarang(String kodeBarang) {
        for (barang brg : daftarBarang) {
            if (brg.getKodeBarang().equalsIgnoreCase(kodeBarang)) {
                daftarBarang.remove(brg);
                return true;
            }
        }
        return false;
    }

    public void tampilkanDaftarBarang() {
        System.out.println("=== Daftar Barang ===");
        for (barang brg : daftarBarang) {
            System.out.println(brg);
        }
    }

    


}
