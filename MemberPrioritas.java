public class MemberPrioritas extends Peminjam {

    public MemberPrioritas(String nama, String nrp) {
        super(nama, nrp);
    }

    @Override
    public String getTipeMember() {
        return "Member Prioritas";
    }

    @Override
    public double hitungDiskonDenda(double denda) {
        return denda * 0.8;
    }
}