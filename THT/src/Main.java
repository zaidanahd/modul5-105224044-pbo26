public class Main {
    public static void main(String[] args) {
        // 1. Uji Kamar Pertama
        System.out.println("Uji Kamar 1:");
        KamarHotel kamar1 = new KamarHotel("A1", "Presidential", 4, -10000);
        kamar1.tampilkanInfoKamar();

        // 2. Uji Kamar Kedua
        System.out.println(" Uji Kamar 2:");
        KamarHotel kamar2 = new KamarHotel("A2", "Suite", 2);
        kamar2.setHargaPerMalam(100000); // Set harga manual karena awalnya 0
        
        kamar2.pesanKamar(4); // Coba pesan 4 orang (max 2)
        kamar2.pesanKamar(2); // Terus pesan kamar itu pakai jumlah tamu misalnya 2 orang 
        kamar2.pesanKamar(); // Coba lakuin pemesanan lagi tapi ga pakai parameter pesanKamar() pada kamar yang sama untuk lihat ada peringatan kalau kamar tersebut sudah dipesan

        // Uji Penagihan
        System.out.println("Uji Penagihan:");
        System.out.println("Tagihan Kamar 1 (2 malam, PROMO):");
        double tagihanKamar1 = kamar1.hitungTotalBayar(2, "PROMO");
        System.out.println("Total Bayar: Rp" + tagihanKamar1);

        // Hitung tagihan kamar kedua untuk 4 malam dengan voucher "PROMO"
        System.out.println("Tagihan Kamar 2 (4 malam, PROMO):");
        double tagihanKamar2 = kamar2.hitungTotalBayar(4, "PROMO");
        System.out.println("Total Bayar: Rp" + tagihanKamar2);

        // cetak struk akhir
        System.out.println("\n=== STRUK INFORMASI AKHIR ===");
        kamar1.tampilkanInfoKamar();
        kamar2.tampilkanInfoKamar();
    }
}