package perpus;

public class mahasiswa {
    String nama;
    String nim;

    public mahasiswa(String nama, String nim) {
        this.nama = nama;
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }
    public String getNim() {
        return nim;
    }
    
    public boolean tambahbuku(buku bk) {
        return true;
    }

    public boolean hapusbuku(String isbn) {
        return true;
    }
        

}
