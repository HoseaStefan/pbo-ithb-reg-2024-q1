package model.classes;

import model.enumeration.*;

public abstract class Penerbangan {
    private TipeTiket tipePenerbangan;
    private double km;
    private double beratBagasi;
    private double totalHarga;

    public Penerbangan(){

    }

    public Penerbangan(TipeTiket tipePenerbangan, double km, double beratBagasi) {
        this.tipePenerbangan = tipePenerbangan;
        this.km = km;
        this.beratBagasi = beratBagasi;
    }

    public TipeTiket getTipePenerbangan() {
        return tipePenerbangan;
    }

    public void setTipePenerbangan(TipeTiket tipePenerbangan) {
        this.tipePenerbangan = tipePenerbangan;
    }

    public double getKm() {
        return km;
    }

    public void setKm(double km) {
        this.km = km;
    }

    public double getBeratBagasi() {
        return beratBagasi;
    }

    public void setBeratBagasi(double beratBagasi) {
        this.beratBagasi = beratBagasi;
    }

    public double getTotalHarga() {
        return totalHarga;
    }

    public void setTotalHarga(double totalHarga) {
        this.totalHarga = totalHarga;
    }

}
