package oop3;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.Random;

public class filkomart {
  public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            Random rand = new Random();
            System.out.print("Masukkan jumlah barang: ");
            int N = input.nextInt();

        
             while (jmlbrg <= N) {
                System.out.println("\nBarang ke-" + jmlbrg);
                input.nextLine(); 

                System.out.print("Nama barang: ");
                String namabrg = input.nextLine();
               

                System.out.print("Jumlah: ");
                int jumlah = input.nextInt();
                
                 

                System.out.print("Harga satuan: ");
                double harga = input.nextDouble();

                input.nextLine();


                double totalBarang = jumlah * harga;
                subtotal += totalBarang;

               
                daftarbrg += String.format("%s\n %dx   @Rp%.0f = Rp%.0f\n",
                        namabrg, jumlah, harga, totalBarang);

                jmlbrg++;
            }

     
           double subtotal = 0;
        for (Barang b : daftarBarang) {
            subtotal += b.totalHarga();
        }

        double diskon = subtotal * 0.10;
        double totalBayar = subtotal - diskon;

        input.nextLine(); 

        System.out.print("\nNama Kasir: ");
        String kasir = input.nextLine();

        System.out.print("Jumlah uang bayar: ");
        double bayar = input.nextDouble();
        double kembali = bayar - totalBayar;

        int receiptNumber = 10000 + rand.nextInt(90000);
        String orderID = "FM" + (100 + rand.nextInt(30000));

        System.out.println("\n==========================================");
        System.out.println("               FILKOM-MART");
        System.out.println("            JL. VETERAN MALANG");
        System.out.println("            TELP. 0341-577911");

        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter tglFormat = DateTimeFormatter.ofPattern("dd MMMM yyyy");
        DateTimeFormatter waktuFormat = DateTimeFormatter.ofPattern("HH:mm:ss");
        System.out.printf("%-20s %20s\n", now.format(tglFormat), now.format(waktuFormat));

        System.out.println("Receipt Number : " + receiptNumber);
        System.out.println("Order ID       : " + orderID);
        System.out.println("Collected by   : " + kasir);
        System.out.println("==========================================");

        for (Barang b : daftarBarang) {
            System.out.print(b.toString());
        }

        System.out.println("==========================================");
        System.out.printf("Subtotal\t\tRp %.0f\n", subtotal);
        System.out.printf("Diskon (10%%)\t\t-Rp %.0f\n", diskon);
        System.out.println("==========================================");
        System.out.printf("Total\t\t\tRp %.0f\n", totalBayar);
        System.out.printf("Bayar\t\t\tRp %.0f\n", bayar);
        System.out.printf("Kembali\t\t\tRp %.0f\n", kembali);
        System.out.println("=================================================");
        System.out.println("   Terima Kasih Telah Berbelanja di FILKOM-MART");
    }
}

    
             
}
