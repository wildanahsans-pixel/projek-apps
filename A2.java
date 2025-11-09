import java.util.Scanner;

public class A2 {
    
  public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)){
            System.out.print("Masukkan nilai n : ");
            int n = input.nextInt();

            int i = n;
            while (i>0) {
                int j = 1;
                while (j<=i){
                    System.out.print(j );
                    j++;
                }
                System.out.println( );
                i--;

            }
            input.close();
          

}}}
