import java.util.Scanner;

public class pln {    
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)){
        System.out.println("Program penghitung pemakaian listrik sederhana");

      
        System.out.printf("%-20s : ","Masukkan nama                  ");
        String nama = input.nextLine();
  
        System.out.printf("%-20s : ","Masukkan kelurahan             ");
        String lurah = input.next();
       
        System.out.printf("%-20s : ","Masukkan posisi awal kwh meter ");
        double awal = input.nextDouble();  
          
        System.out.printf("%-20s : ","Masukkan posisi akhir kwh meter");
        double akhir = input.nextDouble();
         
        System.out.printf("%-20s : ","Masukkan biaya beban saat ini  ");
        double beban = input.nextDouble();
        
        System.out.printf("%-20s : ","Masukkan ppj(dalam persen)     ");
        double ppj = input.nextDouble();

        
        System.out.println("===================PLN Java===================");
        System.out.printf("%-20s : %2s\n","Nama ", nama);
        System.out.printf("%-20s : %2s\n","Kelurahan ", lurah); 
        System.out.printf("%-20s : %1.0f Kwh Meter\n","Pemakaian bulan ini ", (akhir-awal));
        System.out.printf("%-20s : Rp %1.2f,-\n","Tarif listrik ", ((akhir-awal)*beban));
        System.out.printf("%-20s : Rp %1.2f,-\n","PPJ 10% ", ((akhir-awal)*beban)*ppj/100);
        System.out.printf("%-20s : Rp %1.2f,-\n","Total biaya ", (((akhir-awal)*beban) + (((akhir-awal)*beban)*ppj/100)));

        
        }

    }}
