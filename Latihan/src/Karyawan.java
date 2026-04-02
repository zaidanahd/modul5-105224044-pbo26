public class Karyawan {
    private String idKaryawan;//buat no 1
    private String nama;//buat no 1
    private double gajiPokok;//buat no 2
    private String departemen;//buat no 3

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

    public double getgajiPokok(){
        return gajiPokok;
    }

    public void setKaryawan(String idKaryawan){
        this.idKaryawan = idKaryawan;
    }

    public void setnama(String nama){
        this.nama = nama;
    }

    public void setgajiPokok(double gajiPokokAwal){
        
        if (gajiPokokAwal >= 0) {
            this.gajiPokok = gajiPokokAwal;
        } else {
            this.gajiPokok = 0;
            System.out.println("Saldo awal gaboleh negatif.");
        }
    }

    public void settampilkanDataKaryawan(){
        
        System.out.println("123456");
        System.out.println("zaidan");
        System.out.println("5000000");
        System.out.println("AcademyUP");
    }
}
