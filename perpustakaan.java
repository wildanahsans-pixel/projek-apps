import java.util.ArrayList;

class Buku {
    String judul;
    String penulis;
    String penerbit;
    int tahunTerbit;

    Buku(String judul, String penulis, String penerbit, int tahunTerbit) {
        this.judul = judul;
        this.penulis = penulis;
        this.penerbit = penerbit;
        this.tahunTerbit = tahunTerbit;
    }
}

class Kategori {
    String namaKategori;
    ArrayList<Buku> daftarBuku;

    Kategori(String namaKategori) {
        this.namaKategori = namaKategori;
        this.daftarBuku = new ArrayList<>();
    }

    void tambahBuku(Buku buku) {
        daftarBuku.add(buku);
    }
}

public class perpustakaan {
    public static void main(String[] args) {

        Kategori[] kategoriList = {
            new Kategori("Teknologi"),
            new Kategori("Filsafat"),
            new Kategori("Sejarah"),
            new Kategori("Agama"),
            new Kategori("Psikologi"),
            new Kategori("Politik"),
            new Kategori("Fiksi")
        };

        for (Kategori kategori : kategoriList) {
            for (int i = 1; i <= 5; i++) {

                Buku bukuBaru = new Buku(
                    "Judul Buku " + i + " (" + kategori.namaKategori + ")",
                    "Penulis " + i,
                    "Penerbit " + i,
                    2000 + i
                );

                kategori.tambahBuku(bukuBaru);
            }
        }

        
        for (Kategori kategori : kategoriList) {
            System.out.println("Kategori: " + kategori.namaKategori);
            System.out.println("------------------------------------");

            for (Buku buku : kategori.daftarBuku) {
                System.out.println("Judul     : " + buku.judul);
                System.out.println("Penulis   : " + buku.penulis);
                System.out.println("Penerbit  : " + buku.penerbit);
                System.out.println("Terbit    : " + buku.tahunTerbit);
                System.out.println();
            }
        }
    }
}

