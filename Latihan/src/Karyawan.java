public class Karyawan {
    private String idKaryawan;
    private String nama;

    public Karyawan (String idKaryawan, String nama){
        this.idKaryawan = idKaryawan;
        this.nama = nama;
    }

    public String getidKaryawan(){
        return idKaryawan;
    }

    public String getnama(){
        return nama;
    }

    public void setKaryawan(String idKaryawan){
        this.idKaryawan = idKaryawan;
    }

    public void setnama(String nama){
        this.nama = nama;
    }
}
