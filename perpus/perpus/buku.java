package perpus;

public class buku {
    String judul;
    int isbn;

    public buku(String judul, int isbn) {
        this.judul = judul;
        this.isbn = isbn;
    }

    buku(String judul, long bn) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public String getJudul() {
        return judul;
    }
    public int getIsbn() {
        return isbn;
    }
    
}
