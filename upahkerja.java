import java.util.Scanner;

public class TIKET{
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);{
        double total = 0;
       
        
        
        System.out.println("Masukkan umur ");
        int umur = input.nextInt();
        
        System.out.println("Masukkan jumlah tiket : ");
        int jumlah = input.nextInt();
        
        System.out.println("Masukkan diskon : ");
        double diskon = input.nextDouble();
        
        
        if(umur<12){
        int harga = 30000;
        total = ((harga*diskon)/100)*jumlah;
        } else if (umur<60){
            int harga = 40000;
            total = (harga*diskon/100)*jumlah;
        
        } else if (umur>60){
            int harga = 35000;
            total = (harga*diskon/100)*jumlah;
        }
        
        System.out.println("Total biaya tiket sebesar "+ total +"rupiah");
    };
}
}