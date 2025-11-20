package kasir;

import java.util.Scanner;

public class mainapp {
    private static Scanner scanner = new Scanner(System.in);
    private static daftarbrg daftarbrg = new daftarbrg(new java.util.ArrayList<>());

    public static void main(String[] args) {
        boolean running = true;
        while (running) {
            System.out.println("=== Aplikasi Kasir ===");
            System.out.println("1. Tambah Barang");
            System.out.println("2. Hapus Barang");
            System.out.println("3. Tampilkan Daftar Barang");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    tambahBarang();
                    break;
                case 2:
                    hapusBarang();
                    break;
                case 3:
                    daftarbrg.tampilkanDaftarBarang();
                    break;
                case 4:
                    running = false;
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
        scanner.close();
    }
    private static void tambahBarang() {
        System.out.print("Masukkan kode barang: ");
        String kode = scanner.nextLine();
        System.out.print("Masukkan nama barang: ");
        String nama = scanner.nextLine();
        System.out.print("Masukkan harga barang: ");
        double harga = scanner.nextDouble();
        scanner.nextLine(); 

        barang brg = new barang(kode, nama, harga);
        daftarbrg.tambahBarang(brg);
        System.out.println("Barang berhasil ditambahkan.");
    }
    private static void hapusBarang() {
        System.out.print("Masukkan kode barang yang akan dihapus: ");
        String kode = scanner.nextLine();
        boolean berhasil = daftarbrg.hapusBarang(kode);
        if (berhasil) {
            System.out.println("Barang berhasil dihapus.");
        } else {
            System.out.println("Barang dengan kode tersebut tidak ditemukan.");
        }
    }

    private static void tampilkanMenu() {
        System.out.println("\n=== MENU UTAMA ===");
        System.out.println("1. Tambah Barang");
        System.out.println("2. Hapus Barang");
        System.out.println("3. Tampilkan Daftar Barang");
        System.out.println("4. Keluar");
        System.out.print("Pilih menu (1-4): ");
    }

    private static void tampilkanDaftarBarang() {
        if (daftarbrg.getDaftarBarang().isEmpty()) {
            System.out.println("Daftar barang kosong.");
        } else {
            System.out.println("\n=== Daftar Barang ===");
            System.out.printf("%-10s %-20s %-10s%n", "Kode", "Nama", "Harga");
            for (barang brg : daftarbrg.getDaftarBarang()) {
                System.out.printf("%-10s %-20s Rp %-10.2f%n", brg.getKodeBarang(), brg.getNamaBarang(), brg.getHarga());
            }
        }3
    }


private static void cetakstruk() {
        System.out.println("\n================= STRUK TRANSAKSI =================");
        System.out.println("ID Transaksi   : " + "TRX001");
        System.out.println("Tanggal        : " + new java.util.Date());
        System.out.println("Nama Kasir     : " + "Kasir");
        double totalBayar = 0;
        for (barang brg : daftarbrg.getDaftarBarang()) {
            totalBayar += brg.getHarga();
        }
        System.out.println("Total Bayar    : Rp " + totalBayar);
        System.out.println("==================================================\n");
    }

    private static void tampilkanDetailTransaksi() {
        System.out.println("=== Detail Transaksi ===");
        System.out.println("No. | ID Transaksi | Tanggal       | Total Bayar | Nama Kasir");
        System.out.println("----------------------------------------------------------");
        int no = 1;
        for (barang brg : daftarbrg.getDaftarBarang()) {
            System.out.printf("%-4d| %-13s | %-13s | Rp %-10.2f | %-10s%n", 
                              no, brg.getKodeBarang(), new java.util.Date(), brg.getHarga(), "Kasir");
            no++;
        }
    }

    private static void keluarAplikasi() {
        System.out.println("Terima kasih telah menggunakan aplikasi kasir.");
    }

}
