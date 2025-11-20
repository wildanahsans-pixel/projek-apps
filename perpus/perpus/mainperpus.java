package perpus;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class mainperpus {    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<buku> daftarBuku = new ArrayList<>();
        ArrayList<mahasiswa> daftarMahasiswa = new ArrayList<>();
        Map<String, ArrayList<buku>> peminjaman = new HashMap<>(); 


        daftarBuku.add(new buku("Pemrograman Java", 123456));
        daftarBuku.add(new buku("Struktur Data", 234567));
        daftarBuku.add(new buku("Basis Data", 345678));

        daftarMahasiswa.add(new mahasiswa("Andi", "A001"));
        daftarMahasiswa.add(new mahasiswa("Budi", "A002"));
        daftarMahasiswa.add(new mahasiswa("Citra", "A003"));

        boolean running = true;
        while (running) {
            System.out.println("\n=== Menu Perpustakaan ===");
            System.out.println("1. Tambah mahasiswa");
            System.out.println("2. Tambah buku");
            System.out.println("3. Pinjam buku");
            System.out.println("4. Tampilkan mahasiswa & buku yang dipinjam");
            System.out.println("5. Tampilkan daftar buku");
            System.out.println("6. Keluar");
            System.out.print("Pilih menu: ");
            String pilihan = input.nextLine().trim();

            switch (pilihan) {
                case "1":  
                     System.out.print("Masukkan NIM: ");
                    String nim = input.nextLine().trim();
                    if (findMahasiswaByNim(daftarMahasiswa, nim) != null) {
                        System.out.println("Mahasiswa dengan NIM tersebut sudah ada.");
                        break;
                    }
                    System.out.print("Masukkan nama: ");
                    String nama = input.nextLine().trim();
                    daftarMahasiswa.add(new mahasiswa(nama, nim));
                    System.out.println("Mahasiswa ditambahkan.");
                    break;

                case "2": // tambah buku
                    System.out.print("Masukkan judul buku: ");
                    String judul = input.nextLine().trim();
                    System.out.print("Masukkan ISBN (angka): ");
                    long isbn = 0;
                    try {
                        isbn = Long.parseLong(input.nextLine().trim());
                    } catch (NumberFormatException e) {
                        System.out.println("ISBN harus berupa angka.");
                        break;
                    }
                    if (findBukuByIsbn(daftarBuku, isbn) != null) {
                        System.out.println("Buku dengan ISBN tersebut sudah ada.");
                        break;
                    }
                    daftarBuku.add(new buku(judul, isbn));
                    System.out.println("Buku ditambahkan.");
                    break;

                case "3": // pinjam buku
                    System.out.print("Masukkan NIM mahasiswa: ");
                    String nimPinjam = input.nextLine().trim();
                    mahasiswa mhs = findMahasiswaByNim(daftarMahasiswa, nimPinjam);
                    if (mhs == null) {
                        System.out.println("Mahasiswa tidak ditemukan.");
                        break;
                    }
                    System.out.println("Daftar buku tersedia:");
                    for (int i = 0; i < daftarBuku.size(); i++) {
                        buku b = daftarBuku.get(i);
                        System.out.println((i+1) + ". " + b.getJudul() + " (ISBN: " + b.getIsbn() + ")");
                    }
                    System.out.print("Pilih nomor buku untuk dipinjam: ");
                    int idx = -1;
                    try {
                        idx = Integer.parseInt(input.nextLine().trim()) - 1;
                    } catch (NumberFormatException e) {
                        System.out.println("Input tidak valid.");
                        break;
                    }
                    if (idx < 0 || idx >= daftarBuku.size()) {
                        System.out.println("Nomor buku tidak valid.");
                        break;
                    }
                    buku dipinjam = daftarBuku.get(idx);
                    ArrayList<buku> listPinjam = peminjaman.computeIfAbsent(nimPinjam, k -> new ArrayList<>());
                    if (listPinjam.contains(dipinjam)) {
                        System.out.println("Mahasiswa sudah meminjam buku ini.");
                    } else {
                        listPinjam.add(dipinjam);
                        System.out.println("Buku berhasil dipinjam.");
                    }
                    break;

                case "4": // tampilkan mahasiswa & buku yang dipinjam
                    System.out.println("\nDaftar Mahasiswa dan Buku yang Dipinjam:");
                    for (mahasiswa mm : daftarMahasiswa) {
                        System.out.println("Nama: " + mm.getNama() + ", NIM: " + mm.getNim());
                        ArrayList<buku> pinjam = peminjaman.get(mm.getNim());
                        if (pinjam == null || pinjam.isEmpty()) {
                            System.out.println("  Tidak meminjam buku.");
                        } else {
                            for (buku bb : pinjam) {
                                System.out.println("  - " + bb.getJudul() + " (ISBN: " + bb.getIsbn() + ")");
                            }
                        }
                    }
                    break;

                case "5": // tampilkan daftar buku
                    System.out.println("\nDaftar Buku di Perpustakaan:");
                    for (buku b : daftarBuku) {
                        System.out.println("Judul: " + b.getJudul() + ", ISBN: " + b.getIsbn());
                    }
                    break;

                case "6":
                    running = false;
                    break;

                default:
                    System.out.println("Pilihan tidak dikenal.");
            }
        }

        input.close();
    }

 
    private static mahasiswa findMahasiswaByNim(ArrayList<mahasiswa> daftar, String nim) {
        for (mahasiswa m : daftar) {
            if (m.getNim().equals(nim)) return m;
        }
        return null;
    }

    private static buku findBukuByIsbn(ArrayList<buku> daftar, long isbn) {
        for (buku b : daftar) {
            if (Long.toString(b.getIsbn()).equals(Long.toString(isbn))) return b;
        }
        return null;
    }
}


