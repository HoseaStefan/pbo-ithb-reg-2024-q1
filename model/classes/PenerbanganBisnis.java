package model.classes;

import model.enumeration.TipeTiket;

public class PenerbanganBisnis extends Penerbangan {
    private String memesanMakanan;

    public PenerbanganBisnis(TipeTiket tipePenerbangan, double km, double beratBagasi, String memesanMakanan) {
        super(tipePenerbangan, km, beratBagasi);
        this.memesanMakanan = memesanMakanan;
    }

    public PenerbanganBisnis(String memesanMakanan) {
        this.memesanMakanan = memesanMakanan;
    }

    public String getMemesanMakanan() {
        return memesanMakanan;
    }

    public void setMemesanMakanan(String memesanMakanan) {
        this.memesanMakanan = memesanMakanan;
    }

    @Override
    public void printData(){
        System.out.println("Memesan makan : " + memesanMakanan);
    }

}
