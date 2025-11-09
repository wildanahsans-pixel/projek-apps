import java.util.Scanner;

public class bilgenap {
    
  public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)){
            System.out.print("Masukkan nilai n : ");
            int n = input.nextInt();

            int count = 0;
            int angka = 2;
            while (count<n) {
               
                    System.out.print(angka+" ");
                    angka+=2;
                    count++;
                }
                
            input.close();
          

}}}