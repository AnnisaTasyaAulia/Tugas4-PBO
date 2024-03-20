package Tugas4;



public class Main {
    public static void main(String[] args) {
        Barang barang1 = new Barang("Piring", 50000);
        Makanan makanan1 = new Makanan("Sereal", 20000, 30);
        
        //memanggil method tampilkanInfo
        barang1.tampilkanInfo();
        System.out.println();
        makanan1.tampilkanInfo();
        System.out.println();

        //memanggil method tambahStok
        System.out.println("-----------------------------------");
        barang1.tambahStok(10);
        makanan1.tambahStok(20);
    }   
}
