public class RekeningBank {
    private String nomorRekening;
    private double saldo;

    public RekeningBank(String nomorRekening, double saldoAwal) {
        this.nomorRekening = nomorRekening;

        if (saldoAwal >= 0) {
            this.saldo = saldoAwal;
        } else {
            this.saldo = 0;
            System.out.println("Saldo awal gaboleh negatif. Set lagi ke 0.");
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldoBaru) {
        if (saldoBaru >= 0) {
            this.saldo = saldoBaru;
            System.out.println("Saldo diperbarui.");
        } else {
            System.out.println("Saldo gaboleh negatif!");
        }
    }
    public String getNomorRekening() {
        return nomorRekening;
    }
}