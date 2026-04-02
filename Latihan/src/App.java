public class App {
    public static void main(String[] args) throws Exception {
     Mahasiswa mhs = new Mahasiswa();

     mhs.nama = "zaidan";
     //mhs.nim = "105224";

     System.out.println(mhs.nama);
     mhs.setNim("105224044");
     System.out.println(mhs.getNim());
     System.out.println(mhs.namaOr);

    }
}
