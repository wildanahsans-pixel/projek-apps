import java.util.Scanner;

public class kpop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Selamat datang di program KPOP Grid!");
        System.out.println("Di sini kamu bisa atur posisi member KPOP dalam sebuah grid.");
        System.out.println("Simbol: K = Karina, W = Winter, N = Ningning, G = Giselle");

        System.out.print("Masukkan jumlah baris: ");
        int jumlahBaris = input.nextInt();
        System.out.print("Masukkan jumlah kolom: ");
        int jumlahKolom = input.nextInt();

        if (jumlahBaris <= 0 || jumlahKolom <= 0) {
            System.out.println("Input tidak sesuai!");
            return;
        }

        System.out.print("Masukkan jumlah member KPOP: ");
        int jumlahMember = input.nextInt();

        char[][] grid = new char[jumlahBaris][jumlahKolom];

        for (int i = 0; i < jumlahBaris; i++) {
            for (int j = 0; j < jumlahKolom; j++) {
                grid[i][j] = '.';
            }
        }

        int posisiKarinaBaris = -1;
        int posisiKarinaKolom = -1;

        System.out.println("Masukkan posisi dan simbol member KPOP:");
        for (int i = 0; i < jumlahMember; i++) {
            System.out.print("Member ke-" + (i + 1) + " (baris kolom simbol): ");
            int baris = input.nextInt();
            int kolom = input.nextInt();
            char simbol = input.next().charAt(0);

            if (baris < 0 || baris >= jumlahBaris || kolom < 0 || kolom >= jumlahKolom) {
                System.out.println("Input tidak sesuai!");
                return;
            }

            grid[baris][kolom] = simbol;

            if (simbol == 'K') {
                posisiKarinaBaris = baris;
                posisiKarinaKolom = kolom;
            }
        }

        if (posisiKarinaBaris == -1 || posisiKarinaKolom == -1) {
            System.out.println("Tidak ada posisi Karina yang dimasukkan!");
            return;
        }

        for (int i = posisiKarinaBaris - 1; i >= 0; i--) {
            if (grid[i][posisiKarinaKolom] == '.') {
                grid[i][posisiKarinaKolom] = '*';
            } else {
                break;
            }
        }
        

        for (int i = posisiKarinaBaris + 1; i < jumlahBaris; i++) {
            if (grid[i][posisiKarinaKolom] == '.') {
                grid[i][posisiKarinaKolom] = '*';
            } else {
                break;
            }
        }

        for (int j = posisiKarinaKolom - 1; j >= 0; j--) {
            if (grid[posisiKarinaBaris][j] == '.') {
                grid[posisiKarinaBaris][j] = '*';
            } else {
                break;
            }
        }

  
        for (int j = posisiKarinaKolom + 1; j < jumlahKolom; j++) {
            if (grid[posisiKarinaBaris][j] == '.') {
                grid[posisiKarinaBaris][j] = '*';
            } else {
                break;
            }
        }

        System.out.println("\nHasil akhir grid KPOP:");
        for (int i = 0; i < jumlahBaris; i++) {
            for (int j = 0; j < jumlahKolom; j++) {
                System.out.print(grid[i][j]);
                if (j < jumlahKolom - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        input.close();
    }
}