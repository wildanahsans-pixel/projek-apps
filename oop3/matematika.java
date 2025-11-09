package oop4;

import java.util.Scanner;

public class matematika {
     public static int faktorial(int n) {
        int hasil = 1;
        for (int i = 1; i <= n; i++) {
            hasil *= i;
        }
        return hasil;
    }

    // Method untuk menghitung permutasi (nPr)
    public static int permutasi(int n, int r) {
        return faktorial(n) / faktorial(n - r);
    }

    // Method untuk menghitung kombinasi (nCr)
    public static int kombinasi(int n, int r) {
        return faktorial(n) / (faktorial(r) * faktorial(n - r));
    }

    // Main method
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilihan, n, r;

        do {
            System.out.println("Program Penghitung Kombinasi dan Permutasi");
            System.out.println("1. Menghitung Permutasi");
            System.out.println("2. Menghitung Kombinasi");
            System.out.println("3. Keluar");
            System.out.print("Masukkan pilihan anda: ");
            pilihan = input.nextInt();

            if (pilihan == 1) {
                System.out.print("Masukkan nilai n: ");
                n = input.nextInt();
                System.out.print("Masukkan nilai r: ");
                r = input.nextInt();
                System.out.println("nPr = n! / (n - r)! = " + permutasi(n, r));
                System.out.println("Maka hasil permutasinya adalah: " + permutasi(n, r));
                System.out.println();
            } else if (pilihan == 2) {
                System.out.print("Masukkan nilai n: ");
                n = input.nextInt();
                System.out.print("Masukkan nilai r: ");
                r = input.nextInt();
                System.out.println("nCr = n! / (r! * (n - r)!) = " + kombinasi(n, r));
                System.out.println("Maka hasil kombinasinya adalah: " + kombinasi(n, r));
                System.out.println();
            } else if (pilihan != 3) {
                System.out.println("Pilihan tidak valid.\n");
            }

        } while (pilihan != 3);

        System.out.println("Program selesai.");
        input.close();
    }
}

}
