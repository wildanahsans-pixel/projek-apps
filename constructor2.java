class persegipanjang{
    int panjang;
    int lebar;

    persegipanjang(int p, int l){
        panjang = p;
        lebar = l;
    }
    void tampilkanInfo(){
        System.out.println("Panjang: " + panjang);
        System.out.println("Lebar: " + lebar);
        System.out.println("Luas: " + (panjang * lebar));
        System.out.println("Keliling: " + 2 * (panjang + lebar));
    }
}


public class constructor2 {
    public static void main(String[] args) {
        persegipanjang pp = new persegipanjang(10, 5);
        pp.tampilkanInfo();
    }

}
