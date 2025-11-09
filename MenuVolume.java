import java.util.Scanner;

public class MenuVolume {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\nMENU");
            System.out.println("0. KELUAR");
            System.out.println("1. HITUNG VOLUME BALOK");
            System.out.println("2. HITUNG VOLUME BOLA");
            System.out.println("3. HITUNG VOLUME KERUCUT");
            System.out.println("4. HITUNG VOLUME SILINDER");
            System.out.println("5. HITUNG VOLUME LIMAS SEGITIGA");
            System.out.print("MASUKKAN PILIHAN ANDA: ");
            pilihan = input.nextInt();

            switch (pilihan) {
                case 1: 
                    System.out.print("Masukkan panjang: ");
                    double p = input.nextDouble();
                    System.out.print("Masukkan lebar: ");
                    double l = input.nextDouble();
                    System.out.print("Masukkan tinggi: ");
                    double t = input.nextDouble();
                    System.out.println("Volume Balok = " + (p * l * t));
                    break;

                case 2: 
                    System.out.print("Masukkan jari-jari: ");
                    double rBola = input.nextDouble();
                    double volumeBola = (4.0 / 3.0) * 3.14 * Math.pow(rBola, 3);
                    System.out.println("Volume Bola = " + volumeBola);
                    break;

                case 3: 
                    System.out.print("Masukkan jari-jari alas: ");
                    double rKerucut = input.nextDouble();
                    System.out.print("Masukkan tinggi: ");
                    double tKerucut = input.nextDouble();
                    double volumeKerucut = (1.0 / 3.0) * 3.14 * Math.pow(rKerucut, 2) * tKerucut;
                    System.out.println("Volume Kerucut = " + volumeKerucut);
                    break;

                case 4: 
                    System.out.print("Masukkan jari-jari alas: ");
                    double rTabung = input.nextDouble();
                    System.out.print("Masukkan tinggi: ");
                    double tTabung = input.nextDouble();
                    double volumeTabung = 3.14 * Math.pow(rTabung, 2) * tTabung;
                    System.out.println("Volume Silinder = " + volumeTabung);
                    break;

                case 5: 
                    System.out.print("Masukkan alas segitiga: ");
                    double a = input.nextDouble();
                    System.out.print("Masukkan tinggi segitiga alas: ");
                    double ta = input.nextDouble();
                    System.out.print("Masukkan tinggi limas: ");
                    double tl = input.nextDouble();
                    double luasAlas = 0.5 * a * ta;
                    double volumeLimas = (1.0 / 3.0) * luasAlas * tl;
                    System.out.println("Volume Limas Segitiga = " + volumeLimas);
                    break;

                case 0:
                    System.out.println("Program selesai. Terima kasih!");
                    break;

                default:
                    System.out.println("Pilihan tidak valid. Coba lagi.");
            }

        } while (pilihan != 0);

        input.close();
    }
}