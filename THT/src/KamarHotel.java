public class KamarHotel {
    // Encapsulation: Semua atribut private 
    private String nomorKamar;
    private String tipeKamar;
    private int kapasitasMaksimal;
    private double hargaPerMalam;
    private boolean isTersedia;

    // Constructor Pertama: Pendaftaran Kilat 
    public KamarHotel(String nomorKamar, String tipeKamar, int kapasitasMaksimal) {
        this.nomorKamar = nomorKamar;
        setTipeKamar(tipeKamar); 
        this.kapasitasMaksimal = kapasitasMaksimal;
        this.hargaPerMalam = 0;
        this.isTersedia = true;
    }

    // Constructor Kedua: Pendaftaran Lengkap
    public KamarHotel(String nomorKamar, String tipeKamar, int kapasitasMaksimal, double hargaPerMalam) {
        this.nomorKamar = nomorKamar;
        setTipeKamar(tipeKamar); 
        this.kapasitasMaksimal = kapasitasMaksimal;
        setHargaPerMalam(hargaPerMalam); 
        this.isTersedia = true;
    }

    // Getter untuk semua atribut 
    public String getNomorKamar(){ 
        return nomorKamar; 
    }
    public String getTipeKamar(){ 
        return tipeKamar; 
    }
    public int getKapasitasMaksimal(){ 
        return kapasitasMaksimal; 
    }
    public double getHargaPerMalam(){ 
        return hargaPerMalam; 
    }
    public boolean isTersedia(){ 
        return isTersedia; 
    }

    // Setter dengan validasi ketat 
    public void setTipeKamar(String tipe) {
        if (tipe.equalsIgnoreCase("Reguler") || tipe.equalsIgnoreCase("Premium") || tipe.equalsIgnoreCase("Suite")) {
            this.tipeKamar = tipe;
        } else {
            System.out.println("Peringatan: Tipe '" + tipe + "' tidak valid. Otomatis diatur ke 'Reguler'.");
            this.tipeKamar = "Reguler";
        }
    }

    public void setHargaPerMalam(double harga) {
        if (harga < 50000) {
            System.out.println("Peringatan: Harga di bawah batas minimal. Otomatis diatur ke 50000.");
            this.hargaPerMalam = 50000;
        } else {
            this.hargaPerMalam = harga;
        }
    }

    // Method Overloading: Pemesanan Kamar 
    public void pesanKamar() {
        if (isTersedia) {
            isTersedia = false;
            System.out.println("Kamar " + nomorKamar + " berhasil dipesan.");
        } else {
            System.out.println("Peringatan: Kamar " + nomorKamar + " sudah terisi!"); 
        }
    }

    public void pesanKamar(int jumlahTamu) {
        if (!isTersedia) {
            System.out.println("Peringatan: Kamar sudah terisi!");
        } else if (jumlahTamu > kapasitasMaksimal) { // Validasi kapasitas 
            System.out.println("Pesanan Ditolak: Jumlah tamu (" + jumlahTamu + ") melebihi kapasitas (" + kapasitasMaksimal + ").");
        } else {
            isTersedia = false;
            System.out.println("Kamar " + nomorKamar + " berhasil dipesan untuk " + jumlahTamu + " tamu.");
        }
    }

    public void batalPesan() {
        this.isTersedia = true;  
        System.out.println("Pesanan kamar " + nomorKamar + " telah dibatalkan.");
    }

    public double hitungTotalBayar(int jumlahMalam) {
        return hargaPerMalam * jumlahMalam; 
    }

    public double hitungTotalBayar(int jumlahMalam, String kodeVoucher) {
        double total = hitungTotalBayar(jumlahMalam);
        if (kodeVoucher.equals("PROMO") && jumlahMalam >= 3) {
            System.out.println("assikk dapat diskon 20%.");
            return total * 0.8;
        } else {
            System.out.println("yahh sayang bgt kode salah atau durasi menginap kurang dari 3 malam.");
            return total;
        }
    }

    // menampilkan struk kamar
    public void tampilkanInfoKamar() {
        System.out.println("STRUK INFORMASI KAMAR");
        System.out.println("Nomor Kamar   : " + nomorKamar);
        System.out.println("Tipe Kamar    : " + tipeKamar);
        System.out.println("Kapasitas Max : " + kapasitasMaksimal + " orang");
        System.out.println("Harga/Malam   : Rp" + hargaPerMalam);
        System.out.println("Status        : " + (isTersedia ? "Tersedia" : "Terisi"));
    }
}