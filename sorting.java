
import java.util.Scanner;

public class sorting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        System.out.print("Masukkan jumlah elemen array: ");
        int n = input.nextInt();

        int[] sorting = new int[n];

        System.out.println("Masukkan elemen array:");
       for (int i = 0; i < n; i++) {
            System.out.print("Elemen ke-" + (i + 1) + ": ");
            sorting[i] = input.nextInt();
        }
     
        
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (sorting[j] < sorting[j + 1]) {
                   
                    int temp = sorting[j];
                    sorting[j] = sorting[j + 1];
                    sorting[j + 1] = temp;
                }
            }
        }
        System.out.println("Array setelah diurutkan (Ascending):");
        for (int i = 0; i < n; i++) {
            System.out.print(sorting[i] + " ");
        }
    }

}
