
import java.util.Scanner;

public class KonversiNilai255150400111010 {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            float nilai;
            System.out.println("Masukkan nilai : ");
            nilai = input.nextInt();
            if (nilai >= 80) {
                System.out.println("nilai : A");
            } else if (nilai > 74.9) {
                System.out.println("nilai : B+");
            } else if (nilai >= 70) {
                System.out.println("nilai : B");
            } else if (nilai > 64.9) {
                System.out.println("nilai : C+");
            } else if (nilai >= 60) {
                System.out.println("nilai : C");
            } else if (nilai > 54.9) {
                System.out.println("nilai : D+");
            } else if (nilai >= 40) {
                System.out.println("nilai : D");
                 }
                 else if (nilai < 40) {
                System.out.println("nilai : E");
                 }
        }
    }

}