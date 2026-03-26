public class JasHujan extends ItemPinjaman {
    private String ukuran;

    public JasHujan(String kodeItem, String namaItem, boolean tersedia, String ukuran) {
        super(kodeItem, namaItem, tersedia);
        this.ukuran = ukuran;
    }

    public String getUkuran() {
        return ukuran;
    }

    @Override
    public double hitungDendaPerHari() {
        return 5000;
    }

    @Override
    public String getJenis() {
        return "Jas Hujan";
    }
}