public abstract class Peminjam {
    private String nama;
    private String nrp;

    public Peminjam(String nama, String nrp) {
        this.nama = nama;
        this.nrp = nrp;
    }

    public String getNama() {
        return nama;
    }

    public String getNrp() {
        return nrp;
    }

    public abstract String getTipeMember();

    public abstract double hitungDiskonDenda(double denda);
}