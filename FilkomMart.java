import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;
import java.util.Scanner;

public class FilkomMart {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            Random rand = new Random();

            System.out.print("Masukkan jumlah barang: ");
            int N = input.nextInt();
             
            int jmlbrg = 1;
            double subtotal = 0;
            String daftarbrg = "";
           

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

     
            double diskon = subtotal * 0.10; 
            double totalBayar = subtotal - diskon;

   
            System.out.print("\nNama Kasir: ");
            String kasir = input.nextLine();
            System.out.print("Jumlah uang bayar: ");
            double bayar = input.nextDouble();
            double kembali = bayar - totalBayar;

            int receiptNumber = 10000 + rand.nextInt(90000);
            String orderID = "FM" + 100 + rand.nextInt(30000);

            
            System.out.println("\n==========================================");
            System.out.println("               FILKOM-MART");
            System.out.println("            JL. VETERAN MALANG");
            System.out.println("            TELP. 0341-577911");
                 LocalDateTime sekarang = LocalDateTime.now();
        DateTimeFormatter tanggalFormat = DateTimeFormatter.ofPattern("dd MMMM yyyy");
        DateTimeFormatter waktuFormat = DateTimeFormatter.ofPattern("HH:mm:ss");

        String tanggal = sekarang.format(tanggalFormat);
        String waktu = sekarang.format(waktuFormat);

        System.out.printf("%-20s %20s\n", tanggal, waktu);
        
            System.out.println("Receipt Number : " + receiptNumber);
            System.out.println("Order ID       : " + orderID);
            System.out.println("Collected by   : " + kasir);
            System.out.println("==========================================");
            

                System.out.printf(daftarbrg);

  System.out.println("==========================================");
     
            System.out.printf("Subtotal\t\tRp %.0f\n", subtotal);
            System.out.printf("Diskon\n (10%%)\t\t\t-Rp %.0f\n", diskon);
            System.out.println("==========================================");
            System.out.printf("Total\t\t\tRp %.0f\n", totalBayar);
            System.out.printf("Bayar\t\t\tRp %.0f\n", bayar);
             System.out.println("=================================================");
            System.out.printf("Kembali\t\t\t-Rp %.0f\n", kembali);
        }
        System.out.println("=================================================");
        System.out.println("         Terima Kasih Telah Berbelanja\n                 di FILKOM-MART");
    }

    
        }
    
    

