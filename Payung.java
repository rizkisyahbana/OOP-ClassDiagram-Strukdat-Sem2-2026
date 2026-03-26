public class Payung extends ItemPinjaman {
    private String ukuran;

    public Payung(String kodeItem, String namaItem, boolean tersedia, String ukuran) {
        super(kodeItem, namaItem, tersedia);
        this.ukuran = ukuran;
    }

    public String getUkuran() {
        return ukuran;
    }

    @Override
    public double hitungDendaPerHari() {
        return 3000;
    }

    @Override
    public String getJenis() {
        return "Payung";
    }
}