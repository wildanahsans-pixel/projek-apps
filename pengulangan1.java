
import java.util.Scanner;

public class pengulangan1 { 

    public static void main(String[] args) {
        int total = 0;
        int jmlbrg = 0;
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("Masukkan jumlah barang: ");
            jmlbrg = in.nextInt();
            
            for(int x = 1; x <= jmlbrg ; x++){
                System.out.println("nama barang : ");
                in.next();
                
                System.out.println("Masukkan harga barang : ");
                int harga = in.nextInt();
                total = total+harga;
            }
            System.out.println("Total harga : "+total);
        }
        
        
    }

}
