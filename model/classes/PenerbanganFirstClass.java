package model.classes;

import model.enumeration.TipeTiket;
import java.util.ArrayList;

public class PenerbanganFirstClass extends Penerbangan {
    private int jumlahPesananMakan;
    private boolean asuransi;
    private ArrayList<String> listMakanan;

    public PenerbanganFirstClass(TipeTiket tipePenerbangan, double km, double beratBagasi, boolean asuransi) {
        super(tipePenerbangan, km, beratBagasi);
        this.asuransi = asuransi;
    }

    public PenerbanganFirstClass(int jumlahPesananMakan, boolean asuransi) {
        this.jumlahPesananMakan = jumlahPesananMakan;
        this.asuransi = asuransi;
    }

    public int getJumlahPesananMakan() {
        return jumlahPesananMakan;
    }

    public void setJumlahPesananMakan(int jumlahPesananMakan) {
        this.jumlahPesananMakan = jumlahPesananMakan;
    }

    public boolean isAsuransi() {
        return asuransi;
    }

    public void setAsuransi(boolean asuransi) {
        this.asuransi = asuransi;
    }

    public ArrayList<String> getListMakanan() {
        return listMakanan;
    }

    public void setListMakanan(ArrayList<String> listMakanan) {
        this.listMakanan = listMakanan;
    }

    @Override
    public void printData(){
        System.out.println("Pilihan Asuransi : " + asuransi);
        System.out.println("Total pesan Makanan : " + jumlahPesananMakan);
        for (String makan : listMakanan) {
            System.out.println("Makanan yang di makan : " + makan);
        }
    }
}
