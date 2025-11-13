package krs;

import java.util.ArrayList;
import java.util.List;

public class Mahasiswa {
    private String nim;
    private String nama;
    private List<MataKuliah> mataKuliahList;
    private int totalSks;
    
    public Mahasiswa(String nim, String nama) {
        this.nim = nim;
        this.nama = nama;
        this.mataKuliahList = new ArrayList<>();
        this.totalSks = 0;
    }
    
    // Getter methods
    public String getNim() {
        return nim;
    }
    
    public String getNama() {
        return nama;
    }
    
    public List<MataKuliah> getMataKuliahList() {
        return mataKuliahList;
    }
    
    public int getTotalSks() {
        return totalSks;
    }
    
    // Method untuk menambah mata kuliah
    public boolean tambahMataKuliah(MataKuliah mk) {
        if (totalSks + mk.getSks() <= 24) {
            mataKuliahList.add(mk);
            totalSks += mk.getSks();
            return true;
        } else {
            System.out.println("Gagal menambah mata kuliah " + mk.getNama() + 
                             ". Total SKS melebihi batas maksimal 24 SKS.");
            return false;
        }
    }
    
    // Method untuk menghapus mata kuliah
    public boolean hapusMataKuliah(String kode) {
        for (MataKuliah mk : mataKuliahList) {
            if (mk.getKode().equalsIgnoreCase(kode)) {
                totalSks -= mk.getSks();
                mataKuliahList.remove(mk);
                return true;
            }
        }
        return false;
    }
}