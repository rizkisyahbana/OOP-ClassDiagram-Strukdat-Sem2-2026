public class Main {
    public static void main(String[] args) {
        Peminjam p1 = new MemberBiasa("Rizki", "5027251095");
        Peminjam p2 = new MemberPrioritas("Rehan", "5027251101");

        ItemPinjaman i1 = new Payung("P001", "Payung Lipat Hitam", true, "Sedang");
        ItemPinjaman i2 = new JasHujan("J001", "Jas Hujan Transparan", true, "L");

        Peminjaman pinjam1 = new Peminjaman(p1, i1, 2, 3);
        Peminjaman pinjam2 = new Peminjaman(p2, i2, 4, 2);

        pinjam1.tampilkanDetail();
        pinjam2.tampilkanDetail();
    }
}