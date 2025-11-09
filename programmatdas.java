import java.util.Scanner;

public class programmatdas {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
        
          System.out.print("Masukkan nilai operator pertama : ");
          double z = input.nextDouble();
         System.out.print("Masukkan nilai operator kedua   : ");
          double y = input.nextDouble();




            System.out.printf("%-31s : %1.0f\n","Hasil penjumlahan   ", (z+y));
            System.out.printf("%-31s : %1.0f\n","Hasil pengurangan   ", (z-y));
            System.out.printf("%-31s : %1.0f\n","Hasil perkalian     ", (z*y));
            System.out.printf("%-31s : %1.1f\n","Hasil pembagian     ", (z/y));



        }
}}

