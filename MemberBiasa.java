public class MemberBiasa extends Peminjam {

    public MemberBiasa(String nama, String nrp) {
        super(nama, nrp);
    }

    @Override
    public String getTipeMember() {
        return "Member Biasa";
    }

    @Override
    public double hitungDiskonDenda(double denda) {
        return denda;
    }
}