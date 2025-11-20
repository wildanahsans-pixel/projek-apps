

import java.util.Date;

public class transaksi {
    private String idTransaksi;
    private Date tanggalTransaksi;
    private double totalBayar;
    private String namakasir;

    public transaksi(String idTransaksi, Date tanggalTransaksi, double totalBayar, String namakasir) {
        this.idTransaksi = idTransaksi;
        this.tanggalTransaksi = tanggalTransaksi;
        this.totalBayar = totalBayar;
        this.namakasir = namakasir;
    }

    public String getIdTransaksi() {
        return idTransaksi;
    }
    public Date getTanggalTransaksi() {
        return tanggalTransaksi;
    }
    public double getTotalBayar() {
        return totalBayar;
    }
    public String getNamakasir() {
        return namakasir;
    }

    public void cetakbon() {
        System.out.println("\n================= STRUK TRANSAKSI =================");
        System.out.println("ID Transaksi   : " + idTransaksi);
        System.out.println("Tanggal        : " + tanggalTransaksi);
        System.out.println("Nama Kasir     : " + namakasir);
        System.out.println("Total Bayar    : Rp " + totalBayar);
        System.out.println("==================================================\n");
    }

    int no = 1;
    public void tampilkanDetailTransaksi() {
        System.out.println("=== Detail Transaksi ===");
        System.out.println("No. | ID Transaksi | Tanggal       | Total Bayar | Nama Kasir");
        System.out.println("----------------------------------------------------------");
        System.out.printf("%-4d| %-13s | %-13s | Rp %-10.2f | %-10s%n", 
                          no, idTransaksi, tanggalTransaksi, totalBayar, namakasir);
        no++;
    }

}
