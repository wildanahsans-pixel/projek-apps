import java.util.Scanner;

public class kasus3A {
    
    public static void main (String[] args){
        try (Scanner input = new Scanner(System.in)) {
           
            int[] x = new int[3];
            int[] z = new int[4];
            int[] m = new int[4];
            

            for(int i=0; i < 3;i++){
               System.out.println("masukkan bilangan ke"+i+": ");
               x[i]= input.nextInt();
            }
          for(int j=0;j<4;j++){
             
             System.out.println("masukkan bilangan ke"+j+": ");
               z[j]= input.nextInt();
                 for(int i=0;i<4;i++){
                m[i] = x[i]+z[j];
                System.out.println(m[i]+"");

            }
               

          }
        
           
            System.out.println("");
            input.close();
            


            
           
        }
        
        

    }
    
}