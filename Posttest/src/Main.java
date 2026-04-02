public class Main {
    public static void main(String[] args) {
        Barang brg = new Barang("BRG044", "Smart TV");
        brg.setHargaSatuan(0);
        brg.setHargaSatuan(-15000);
        brg.kurangiStok(5); 
        brg.setKategori("Elektronik");
        brg.setHargaSatuan(3500000);
        brg.tambahStok(50);   
        brg.kurangiStok(12);  
        brg.tampilkanDetailBarang();
    }
}