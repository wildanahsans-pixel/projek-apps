
import java.util.Scanner;
 
public class Main {
    public static void main (String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int p;
            int b;
            System.out.println("Masukkan nilai panjang: ");
             p = input.nextInt();
            System.out.println("Masukkan nilai lebar: ");
             b = input.nextInt();
             int luas = p * b;

             System.out.println("nilai L: "+ luas);
        }

    }

}
