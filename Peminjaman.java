public class Peminjaman {
    private Peminjam peminjam;
    private ItemPinjaman item;
    private int lamaPinjam;
    private int lamaTerlambat;

    public Peminjaman(Peminjam peminjam, ItemPinjaman item, int lamaPinjam, int lamaTerlambat) {
        this.peminjam = peminjam;
        this.item = item;
        this.lamaPinjam = lamaPinjam;
        this.lamaTerlambat = lamaTerlambat;
    }

    public double hitungTotalDenda() {
        double dendaAwal = lamaTerlambat * item.hitungDendaPerHari();
        return peminjam.hitungDiskonDenda(dendaAwal);
    }

    public void tampilkanDetail() {
        System.out.println("===== DETAIL PEMINJAMAN =====");
        System.out.println("Nama Peminjam   : " + peminjam.getNama());
        System.out.println("NRP             : " + peminjam.getNrp());
        System.out.println("Tipe Member     : " + peminjam.getTipeMember());
        System.out.println("Item            : " + item.getNamaItem());
        System.out.println("Jenis Item      : " + item.getJenis());
        System.out.println("Lama Pinjam     : " + lamaPinjam + " hari");
        System.out.println("Terlambat       : " + lamaTerlambat + " hari");
        System.out.println("Total Denda     : Rp" + hitungTotalDenda());
        System.out.println();
    }
}