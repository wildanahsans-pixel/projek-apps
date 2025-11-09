
import java.util.Scanner;

public class modul2 {
public static void main(String[] args){     
     try (Scanner input = new Scanner(System.in)) {
        {

          System.out.println("Menu : ");
          System.out.println("1.Menghitung luas dan keliling persegi panjang  ");
          System.out.println("2.Menghitung luas dan keliling persegi          ");
          System.out.println("3.Menghitung luas dan keliling segitiga         ");
          System.out.print("Pilih menu =  ");
          int pilihan = input.nextInt();
          System.out.println("Pilihan anda                        : "+(pilihan));

          switch (pilihan){
            case 1 -> {
                System.out.print("Masukkan nilai panjang            = ");
                int panjang = input.nextInt();
                System.out.print("Masukkan nilai lebar              = ");
                int lebar = input.nextInt();
                System.out.println("Keliling persegi panjang          = "+ (2*(panjang+lebar)));
                System.out.println("Luas persegi panjang              = "+ (panjang*lebar));
                }
          case 2 -> {
              System.out.print("Masukkan nilai Sisi A               = ");
              int sisiA = input.nextInt();
                 System.out.print("Masukkan nilai Sisi B            = ");
              int sisiB = input.nextInt();
              System.out.println("Keliling persegi                    = "+ ((2*sisiA)+(2*sisiB)));
              System.out.println("Luas persegi panjang                = "+ (sisiA*sisiB));
                }
           case 3 -> {
               System.out.print("Masukkan nilai alas                = ");
               int alas = input.nextInt();
               System.out.print("Masukkan nilai tinggi              = ");
               int tinggi = input.nextInt();
               
               System.out.println("Keliling segitiga                  = "+ (Math.sqrt(Math.pow(alas, 2) + Math.pow(tinggi, 2))+alas+tinggi));
               System.out.println("Luas persegi panjang               = "+ (alas*tinggi/2));
                }
          default -> System.out.println("Tidak dapat ditemukan");
        

         }   
        }
     }   
      


}}
