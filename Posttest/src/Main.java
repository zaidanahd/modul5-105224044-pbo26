public class Main {
    public static void main(String[] args) {
        Barang brg = new Barang("BRG044", "Smart TV");

        System.out.println(" UJI COBA VALIDASI SISTEM ");

        brg.setHargaSatuan(0);
        brg.setHargaSatuan(-15000);

        brg.kurangiStok(5); 

        System.out.println("\n INPUT DATA VALID ");
        
        brg.setKategori("Elektronik");
        brg.setHargaSatuan(3500000);
        brg.tambahStok(50);   
        brg.kurangiStok(12);  

        brg.tampilkanDetailBarang();
    }
}