package Tugas4;



public class Makanan extends Barang {

    private final int kadaluarsa;

    public Makanan(String nama, int harga, int kadaluarsa) {
        super(nama, harga);
        this.kadaluarsa = kadaluarsa;
    }
    
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Kadaluarsa : " + kadaluarsa + "hari");
    }
    
    public void tambahStok(int jumlah) {
        System.out.println("Stok Makanan Ditambah : " + jumlah);
    }  
}
