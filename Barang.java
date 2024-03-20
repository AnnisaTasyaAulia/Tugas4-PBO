package Tugas4;



public class Barang {
    protected String nama;
    protected int harga;

    public Barang(String nama, int harga) {
        this.nama = nama;
        this.harga = harga;
    }

    public void tampilkanInfo() {
        System.out.println("Nama Barang : " + nama);
        System.out.println("Harga : " + harga);
    }

    public void tambahStok(int jumlah) {
        System.out.println("Stok Barang Ditambah : " + jumlah);
    }
}
