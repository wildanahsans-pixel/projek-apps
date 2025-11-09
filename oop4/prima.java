package oop4;

import java.util.Scanner;

public class prima {
    public static boolean prima(int n) {
        if (n <= 1) {
            return false;
        }
      for (int i = 2; i * i <= n; i++) {
    if (n % i == 0) {
        return false;
    }
}
return true;
}

    public static void outputprima() {
        System.out.println("Bilangan prima dari 1 sampai 100 adalah:");
        for (int i = 1; i <= 100; i++) {
            if (prima(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println(); 
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== Program Pengecekan Bilangan Prima ===");
        System.out.print("Masukkan sebuah bilangan: ");
        int bilangan = input.nextInt();

        if (prima(bilangan)) {
            System.out.println(bilangan + " adalah bilangan prima.");
        } else {
            System.out.println(bilangan + " bukan bilangan prima.");
        }

        System.out.println();
        outputprima();

        input.close();
    }
}


