package krs;

import java.text.SimpleDateFormat;
import java.util.Date;

public class KRS {
    private Mahasiswa mahasiswa;
    private String ttdKPS;
    private Date tanggalCetak;
    
    public KRS(Mahasiswa mahasiswa) {
        this.mahasiswa = mahasiswa;
        this.tanggalCetak = new Date();
        // TTD KPS berdasarkan NIM dan Nama mahasiswa
        this.ttdKPS = "KPS - " + mahasiswa.getNim() + " - " + mahasiswa.getNama();
    }
    
    // Method untuk mencetak KRS
    public void cetakKRS() {
        System.out.println("\n==========================================");
        System.out.println("           KARTU RENCANA STUDI (KRS)");
        System.out.println("==========================================");
        System.out.println("NIM          : " + mahasiswa.getNim());
        System.out.println("Nama         : " + mahasiswa.getNama());
        System.out.println("Total SKS    : " + mahasiswa.getTotalSks() + " SKS");
        System.out.println("------------------------------------------");
        System.out.println("            DAFTAR MATA KULIAH");
        System.out.println("------------------------------------------");
        
        int no = 1;
        for (MataKuliah mk : mahasiswa.getMataKuliahList()) {
            System.out.println(no + ". " + mk);
            no++;
        }
        
        System.out.println("------------------------------------------");
        System.out.println("Tanggal Cetak: " + 
                         new SimpleDateFormat("dd-MM-yyyy HH:mm:ss").format(tanggalCetak));
        System.out.println("TTD KPS      : " + ttdKPS);
        System.out.println("==========================================\n");
    }
    
    // Getter methods
    public Mahasiswa getMahasiswa() {
        return mahasiswa;
    }
    
    public String getTtdKPS() {
        return ttdKPS;
    }
    
    public Date getTanggalCetak() {
        return tanggalCetak;
    }
}