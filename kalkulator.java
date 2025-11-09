
import java.util.Scanner;

public class kalkulator {

    public static double jumlah(double a, double b) {
        return a + b;
    }

    public static double kurang(double a, double b) {
        return a - b;
    }

    public static double kali(double a, double b) {
        return a * b;
    }

    public static double bagi(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Pembagian dengan nol tidak bisa!");
            return 0;
        }
        return a / b;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== Kalkulator Sederhana ===");
        System.out.print("Masukkan bilangan pertama: ");
        double bilangan1 = input.nextDouble();

 System.out.print("Masukkan operasi (+, -, *, /): ");
        char operasi = input.next().charAt(0);

        System.out.print("Masukkan bilangan kedua: ");
        double bilangan2 = input.nextDouble();

       

        double hasil;

        switch (operasi) {
            case '+':
                hasil = jumlah(bilangan1, bilangan2);
                break;
            case '-':
                hasil = kurang(bilangan1, bilangan2);
                break;
            case '*':
                hasil = kali(bilangan1, bilangan2);
                break;
            case '/':
                hasil = bagi(bilangan1, bilangan2);
                break;
            default:
                System.out.println("Operasi tidak valid");
                input.close();
                return;
        }

        System.out.println("Hasil: " + hasil);
        input.close();
    }
}