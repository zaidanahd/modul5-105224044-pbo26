public class Barang {
    private String idBarang;
    private String namaBarang;
    private String kategori;
    private int stok;
    private double hargaSatuan;

    public Barang(String idBarang, String namaBarang) {
        this.idBarang = idBarang;
        this.namaBarang = namaBarang;
        this.stok = 0; 
        this.hargaSatuan = 0; 
        this.kategori = "belom ada Kategori";
    }

    public String getIdBarang(){
         return idBarang; 
    }
    public void setIdBarang(String idBarang){ 
        this.idBarang = idBarang; 
    }

    public String getNamaBarang(){ 
        return namaBarang; 
    }
    public void setNamaBarang(String namaBarang){ 
        this.namaBarang = namaBarang; 
    }

    public String getKategori(){ 
        return kategori; 
    }
    public void setKategori(String kategori){ 
        this.kategori = kategori; 
    }

    public int getStok(){ 
        return stok; 
    }

    public void setStok(int stok) {
        if (stok >= 0) {
            this.stok = stok;
        } else {
            System.out.println("Stok gaboleh di bawah 0");
        }
    }

    public double getHargaSatuan(){ 
        return hargaSatuan; 
    }

    public void setHargaSatuan(double hargaSatuan){
        if (hargaSatuan > 0) {
            this.hargaSatuan = hargaSatuan;
        } else {
            System.out.println("harga satuannya wajib lebih dari 0");
        }
    }

    public void tambahStok(int jumlah) {
        if (jumlah > 0) {
            this.stok += jumlah;
            System.out.println("[asekk berhasil] Tambah stok: +" + jumlah);
        } else {
            System.out.println("[yahh gagal] Jumlah tambah harus positif");
        }
    }

    public void kurangiStok(int jumlah) {
        if (jumlah <= 0) {
            System.out.println("[yahh gagal] Jumlah kurangi harus positif!");
        } else if (this.stok - jumlah < 0) {
            System.out.println("[yahh gagal] Stok tidak cukup! Stok saat ini: " + this.stok);
        } else {
            this.stok -= jumlah;
            System.out.println("[asekk berhasil] Kurangi stok: -" + jumlah);
        }
    }

    public void tampilkanDetailBarang() {
        System.out.println("      LAPORAN STOK GUDANG     ");
        System.out.println("==============================");
        System.out.println("ID Barang    : " + idBarang);
        System.out.println("Nama Barang  : " + namaBarang);
        System.out.println("Kategori     : " + kategori);
        System.out.println("Stok Tersedia: " + stok);
        System.out.println("Harga Satuan : Rp " + hargaSatuan);
        System.out.println("==============================\n");
    }
}