package model.enumeration;

public enum TipeTiket {
    EKONOMI, BISNIS, FIRSTCLASS;

    public static TipeTiket getTiket(int pilihan) {
        switch (pilihan) {
            case 1:
                return EKONOMI;
            case 2:
                return BISNIS;
            default:
                return FIRSTCLASS;
        }
    }
}
