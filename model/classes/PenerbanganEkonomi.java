package model.classes;

import model.enumeration.TipeTiket;

public class PenerbanganEkonomi extends Penerbangan {
    private boolean parasutTambahan;

    public PenerbanganEkonomi(TipeTiket tipePenerbangan, double km, double beratBagasi, boolean parasutTambahan) {
        super(tipePenerbangan, km, beratBagasi);
        this.parasutTambahan = parasutTambahan;
    }

    public PenerbanganEkonomi(boolean parasutTambahan) {
        this.parasutTambahan = parasutTambahan;
    }

    public boolean isParasutTambahan() {
        return parasutTambahan;
    }

    public void setParasutTambahan(boolean parasutTambahan) {
        this.parasutTambahan = parasutTambahan;
    }

}
