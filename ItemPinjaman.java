public abstract class ItemPinjaman {
    private String kodeItem;
    private String namaItem;
    private boolean tersedia;

    public ItemPinjaman(String kodeItem, String namaItem, boolean tersedia) {
        this.kodeItem = kodeItem;
        this.namaItem = namaItem;
        this.tersedia = tersedia;
    }

    public String getKodeItem() {
        return kodeItem;
    }

    public String getNamaItem() {
        return namaItem;
    }

    public boolean isTersedia() {
        return tersedia;
    }

    public void setTersedia(boolean tersedia) {
        this.tersedia = tersedia;
    }

    public abstract double hitungDendaPerHari();

    public abstract String getJenis();
}