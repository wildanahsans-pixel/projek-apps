import java.util.Scanner;

public class arraykereta {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int pilihan;
String[][] tabel= {
    {"Jenis","harga","diskon","AC","Colokan"},
    {"Ekonomi","50000","2%","Tidak Ada","Tidak Ada"},
    {"Bisnis","100000","5%","Ada","Ada","Tidak ada"},
    {"Eksekutif","200000","7%","Ada","Tidak Ada"},
    {"Swasta","300000","10%","Ada","Tidak Ada"}
   
};
String[] pesanan = new String[100000];
int jmlpesan = 0;
int[] jmltiket = new int[100000];
int[] totalharga = new int[100000];

do { 
    System.out.println("\nPilihan MENU : ");
            
            System.out.println("1. Melihat Daftar Kereta Api");
            System.out.println("2. Melihat Daftar Kereta Api yang ada AC");
            System.out.println("3. Melihat Daftar Kereta Api yang ada Colokan");
            System.out.println("4. Memesan Tiket kereta Api");
            System.out.println("5. Melihat Pesanan tiket");
            System.out.println("0. KELUAR");
            System.out.print("MASUKKAN PILIHAN ANDA: ");
            
            pilihan = input.nextInt();

            switch (pilihan){
                  case 1: 
                    System.out.println("Daftar Kereta Api : ");
                     System.out.println(tabel[0][0]); 
                     System.out.println("=======================");  
                      System.out.println(tabel[1][0]);
                       System.out.println(tabel[2][0]);
                        System.out.println(tabel[3][0]);
                         System.out.println(tabel[4][0]);
                    break;

                case 2: 
                    System.out.println("\nDaftar Kereta Api yang ada AC : ");
                     System.out.println(tabel[0][0] + " | " + tabel[0][3]);
                     System.out.println("==============================="); 
                         System.out.println(tabel[1][0] + " | " + tabel[1][3]);
                            System.out.println(tabel[2][0] + " | " + tabel[2][3]);
                               System.out.println(tabel[3][0] + " | " + tabel[3][3]);
                                  System.out.println(tabel[4][0] + " | " + tabel[4][3]);
                    break;

                case 3: 
                       System.out.println("\nDaftar Kereta Api yang ada Colokan : ");
                     System.out.println(tabel[0][0] + " | " + tabel[0][4]);
                      System.out.println("==============================="); 
                         System.out.println(tabel[1][0] + " | " + tabel[1][4]);
                            System.out.println(tabel[2][0] + " | " + tabel[2][4]);
                               System.out.println(tabel[3][0] + " | " + tabel[3][4]);
                                  System.out.println(tabel[4][0] + " | " + tabel[4][4]);
                    break;

                case 4: 
                      System.out.println("\nPilih kereta yang ingin dipesan:");
                    for (int i = 1; i < tabel.length; i++) {
                        System.out.println(i + ". " + tabel[i][0] + " - Rp" + tabel[i][1]);
                    }
                    System.out.print("Masukkan nomor kereta: ");
                    int pilihKereta = input.nextInt();

                    if (pilihKereta >= 1 && pilihKereta < tabel.length) {
                        System.out.print("Mau pesan berapa tiket? ");
                        int jumlah = input.nextInt();

                        int harga = Integer.parseInt(tabel[pilihKereta][1]); 
                        int total = harga * jumlah;

                        if (jmlpesan < pesanan.length) {
                            pesanan[jmlpesan] = tabel[pilihKereta][0];
                            jmltiket[jmlpesan] = jumlah;
                            totalharga[jmlpesan] = total;
                            jmlpesan++;
                            System.out.println("Pesanan berhasil: " + jumlah + "\ntiket " 
                                               + tabel[pilihKereta][0] 
                                               + "\nTotal Rp" + total);
                        } else {
                            System.out.println("Kapasitas pesanan penuh!");
                        }
                    } else {
                        System.out.println("Nomor kereta tidak valid!");
                    }
                    break;

                case 5: 
                System.out.print("Lihat pesanan tiket ");
                for (int i = 0; i < jmlpesan; i++) {
                    System.out.println((i+1) + "\n " + pesanan[i] + "\nJumlah: " + jmltiket[i] + "\nTotal: Rp" + totalharga[i]);
                }
                break;

                case 0:
                    System.out.println("Program selesai. Terima kasih!");
                    break;

                default:
                    System.out.println("Pilihan tidak valid. Coba lagi.");
            }
    
} while (pilihan !=0);

input.close();

}}



