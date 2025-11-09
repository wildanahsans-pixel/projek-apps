import java.util.Scanner;
public class arraytranspose {


    public static void main (String[] args){
        try (Scanner input = new Scanner(System.in)) {

        System.out.println("Masukkan baris: ");
        int baris = input.nextInt();
        System.out.println("Masukkan kolom : ");
        int kolom = input.nextInt();

        int[][] matriks = new int[baris][kolom];

        System.out.println("masukkan anggota array : ");
        for(int i=0;i<baris;i++){
            for(int j=0;j<kolom;j++){

                 System.out.print("M["+i+"] ["+j+"] =");
                 matriks[i][j] = input.nextInt();
            }
            System.out.println();
        }

       int transpose[][] = new int[kolom][baris];
         for(int i=0;i<baris;i++){
            for(int j=0;j<kolom;j++){
                 transpose [j][i] = matriks[i][j];
            }
            System.out.println();
        }
           System.out.println("Hasil transposenya adalah ");
           for(int i=0;i<baris;i++){
            for(int j=0;j<kolom;j++){
                System.out.print(transpose[j][i]+"");
            }
            System.out.println();
        }

            System.out.println();
            input.close();
            
           
        }
        
        

    }
    
}


