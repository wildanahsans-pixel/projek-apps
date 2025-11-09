import java.util.Scanner;

public class soal2 {
public static void main(String[] args){     
     try (Scanner input = new Scanner(System.in)){
        System.out.print("Berat badan (kg)          = ");
         double berat = input.nextDouble();

         System.out.print("Tinggi badan (m)         = ");
         double tinggi = input.nextDouble();

         double IMT = berat/(tinggi*tinggi);
         if (IMT <= 18.5){
          System.out.printf("IMT = %.2f Termasuk Terlalu kurus\n", IMT);
        } else if (IMT<=25){
            System.out.printf("IMT = %.2f Termasuk normal\n", IMT);
            
        } else if (IMT<=30){
            System.out.printf("IMT = %.2f Termasuk gemuk\n", IMT);
        }
        else{ 
            System.out.printf("IMT = %.2f Terlalu gemuk\n", IMT);
         }   
     }



}}
