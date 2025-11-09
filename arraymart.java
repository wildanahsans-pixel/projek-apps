
import java.util.Scanner;

public class arraymart {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
       
            System.out.println("Menu : ");
          System.out.println("1.beras  ");
          System.out.println("2.gula          ");
          System.out.println("3.minyakgoreng         ");
          System.out.println("4.sabun ");
          System.out.println("5.telur  ");
          
            
            System.out.print("Masukkan jumlah barang: ");
            int N = input.nextInt();

        String[] daftarbrg = {"beras","gula","minyakgoreng","sabun","telur"};
        int[] hargabrg ={55000,10000,56000,15000,25000};

    int[] jmlbrg = new int[N];
    double[] total = new double[N];
    double subtotal = 0;
    String daftarblnj = "";
   

     for (int i=0; i < N;i++) {
                System.out.println("\nBarang ke-" + (i+1));
                input.nextLine(); 

                System.out.print("Nama barang: ");
                daftarbrg[i] = input.nextLine();
               

                System.out.print("Jumlah: ");
                jmlbrg[i] = input.nextInt();
                


                input.nextLine();


                 total[i] = jmlbrg[i] * hargabrg[i];
                subtotal += total[i];

              
                daftarblnj += String.format("%s\n %dx   @Rp%d = Rp%.0f\n",
                        daftarbrg[i], jmlbrg[i], hargabrg[i], total[i]);

                jmlbrg[i]++;
            }

            System.out.print("Jumlah uang bayar: ");
            double bayar = input.nextDouble();
            double kembali = bayar - subtotal;

           
            
            System.out.println("\n==========================================");
            System.out.println("               FILKOM-MART");
            System.out.println("            JL. VETERAN MALANG");
            System.out.println("            TELP. 0341-577911");
              
            System.out.println("==========================================");
            

                System.out.print(daftarblnj);

            System.out.println("==========================================");
     
            System.out.printf("Subtotal\t\tRp %.0f\n", subtotal);
            System.out.println("==========================================");
            System.out.printf("Bayar\t\t\tRp %.0f\n", bayar);
            System.out.println("=================================================");
            System.out.printf("Kembali\t\t\tRp %.0f\n", kembali);
        }



        }}
 