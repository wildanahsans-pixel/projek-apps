import java.util.Scanner;

public class avesum {
     public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
int pilihan;
int jumlah = 0;

        int[] data = new int[100];
        do { 
    System.out.println("\nPilihan MENU : ");
            
            System.out.println("1. input data");
            System.out.println("2. Lihat data");
            System.out.println("3. average data");
            System.out.println("4. sum data");
            System.out.println("5. max data");
            System.out.println("6. min data");
            System.out.println("0. KELUAR");
            System.out.print("MASUKKAN PILIHAN ANDA: ");
            pilihan = input.nextInt();

        
            

            switch (pilihan){
                  case 1: 
                    System.out.print("Mau berapa banyak data yang di input : ");
                   jumlah = input.nextInt();
                for (int i = 0; i < jumlah; i++) {
                    System.out.print("Masukkan data ke-" + (i + 1) + ": "); 
                    data[i] = input.nextInt();     
                }
                    
                    break;

                case 2: 
                  System.out.print("lihat data : ");
                  for (int i = 0; i < jumlah; i++) {
                   
                        System.out.print(data[i] + " ");
                    }
                   System.out.println();
                    break;

                case 3: 
                    double sum = 0;
                    for (int i = 0; i < jumlah; i++) {
                        sum += data[i];
                    }
                    double average = sum / jumlah;
                    System.out.println("Average : " + average);
                    break;

                case 4: 
                sum = 0;
                    for (int i = 0; i < jumlah; i++) {
                        sum += data[i];
                    }
                    System.out.println("Sum : " + sum);
                      
                    break;

                case 5: 
                    int max = data[0];
                    for (int i = 1; i < data.length; i++) {
                        if (data[i] > max) {
                            max = data[i];
                        }
                    }
                    System.out.println("Max : " + max);
                    break;
               
                case 6: 
                int min = data[0];
                for (int i = 0; i < data.length; i++) {
                    if(data[i]<min){
                        min = data[i];
                    }
                    
                }
                System.out.println("Min : " + min);
                break;
                    

                case 0:
                    System.out.println("Program selesai. Terima kasih!");
                    break;

                default:
                    System.out.println("Pilihan tidak valid. Coba lagi.");
            }
    
} while (pilihan !=7);

input.close();


}}
