
package krs;

import java.util.Scanner;

public class AplikasiKRS {
    private static Scanner scanner = new Scanner(System.in);
    private static Mahasiswa mahasiswa;
    
    public static void main(String[] args) {
        System.out.println("=== APLIKASI PENGISIAN KRS ===");
      
        inputDataMahasiswa();
        
        boolean isRunning = true;
        while (isRunning) {
            tampilkanMenu();
            int pilihan = scanner.nextInt();
            scanner.nextLine(); 
            
            switch (pilihan) {
                case 1:
                    tambahMataKuliah();
                    break;
                case 2:
                    hapusMataKuliah();
                    break;
                case 3:
                    lihatDaftarMataKuliah();
                    break;
                case 4:
                    cetakKRS();
                    break;
                case 5:
                    isRunning = false;
                    System.out.println("Terima kasih telah menggunakan aplikasi KRS!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        }
        
        scanner.close();
    }
    
    private static void inputDataMahasiswa() {
        System.out.print("Masukkan NIM  : ");
        String nim = scanner.nextLine();
        System.out.print("Masukkan Nama : ");
        String nama = scanner.nextLine();
        
        mahasiswa = new Mahasiswa(nim, nama);
        System.out.println("Data mahasiswa berhasil disimpan!\n");
    }
    
    private static void tampilkanMenu() {
        System.out.println("\n=== MENU UTAMA ===");
        System.out.println("1. Tambah Mata Kuliah");
        System.out.println("2. Hapus Mata Kuliah");
        System.out.println("3. Lihat Daftar Mata Kuliah");
        System.out.println("4. Cetak KRS");
        System.out.println("5. Keluar");
        System.out.print("Pilih menu (1-5): ");
    }
    
    private static void tambahMataKuliah() {
        System.out.println("\n--- TAMBAH MATA KULIAH ---");
        System.out.print("Kode MK    : ");
        String kode = scanner.nextLine();
        System.out.print("Nama MK    : ");
        String nama = scanner.nextLine();
        System.out.print("SKS        : ");
        int sks = scanner.nextInt();
        scanner.nextLine(); 
        
        if (sks <= 0) {
            System.out.println("SKS harus lebih dari 0!");
            return;
        }
        
        MataKuliah mk = new MataKuliah(kode, nama, sks);
        boolean berhasil = mahasiswa.tambahMataKuliah(mk);
        
        if (berhasil) {
            System.out.println("Mata kuliah berhasil ditambahkan!");
        }
    }
    
    private static void hapusMataKuliah() {
        System.out.println("\n--- HAPUS MATA KULIAH ---");
        System.out.print("Masukkan kode mata kuliah yang akan dihapus: ");
        String kode = scanner.nextLine();
        
        boolean berhasil = mahasiswa.hapusMataKuliah(kode);
        if (berhasil) {
            System.out.println("Mata kuliah berhasil dihapus!");
        } else {
            System.out.println("Mata kuliah dengan kode '" + kode + "' tidak ditemukan!");
        }
    }
    
    private static void lihatDaftarMataKuliah() {
        System.out.println("\n--- DAFTAR MATA KULIAH ---");
        System.out.println("NIM  : " + mahasiswa.getNim());
        System.out.println("Nama : " + mahasiswa.getNama());
        System.out.println("Total SKS: " + mahasiswa.getTotalSks() + " SKS");
        System.out.println("---------------------------");
        
        int no = 1;
        for (MataKuliah mk : mahasiswa.getMataKuliahList()) {
            System.out.println(no + ". " + mk);
            no++;
        }
        
        if (mahasiswa.getMataKuliahList().isEmpty()) {
            System.out.println("Belum ada mata kuliah yang diambil.");
        }
    }
    
    private static void cetakKRS() {
        if (mahasiswa.getMataKuliahList().isEmpty()) {
            System.out.println("Tidak dapat mencetak KRS. Belum ada mata kuliah yang diambil!");
            return;
        }
        
        KRS krs = new KRS(mahasiswa);
        krs.cetakKRS();
    }
}