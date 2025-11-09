import java.util.Scanner;

public class array1 {
    
    public static void main (String[] args){
        try (Scanner input = new Scanner(System.in)) {
            int y = input.nextInt();
            int[] n =new int[y];
            for(int i=0; i < y;i++){
                System.out.println("Masukkan bilangan ke-"+i+" : ");
                n[i] = input.nextInt();
            }
            
            for(int i = 0;i<y;i++){
                System.out.println(n[i]+" ");
            }
        }
        
        

    }
    
}
    

