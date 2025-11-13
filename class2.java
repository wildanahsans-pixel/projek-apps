

 class segitiga {
    double tinggi;
    double alas;
    double miring;

    double hitungLuas() {
        return alas * tinggi* 0.5;
    }

    double hitungKeliling() {
        return alas+tinggi+miring;
    }

    void tampilkanInfo() {
        System.out.println("Alas segitiga: " + alas);
        System.out.println("Tinggi segitiga: " + tinggi);
        System.out.println("Sisi miring: "+ miring);
        System.out.println("Luas Segitiga: "+ hitungLuas());
        System.out.println("Keliling segitiga: "+ hitungKeliling());
    }

}

public class class2{
    public static void main(String[] args) {
        segitiga s = new segitiga();
        s.alas = 3;
        s.tinggi = 4;
        s.miring = 5;
        s.tampilkanInfo();
    }
    
}
