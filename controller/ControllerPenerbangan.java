package controller;

import java.util.ArrayList;

import main.Main;
import model.classes.*;

public class ControllerPenerbangan {

    public static double getTotal(){
        double total = 0;
        for (Penerbangan penerbangan : Main.penerbangans) {
            total += penerbangan.getTotalHarga();
        }
        return total;
    }

    public static double hitungBiayaTiket(double km, double berat, boolean parasutTambahan){
        double totalBiaya = 0;
        totalBiaya += km * 7500;
        if (berat > 5) {
            totalBiaya += berat * 1500;
        }
        if (parasutTambahan) {
            totalBiaya += 5000;
        }

        return totalBiaya;
    }

    public static double hitungBiayaTiket(double km, double berat, String makanan){
        double totalBiaya = 0;
        totalBiaya += km * 10000;
        if (berat > 5) {
            totalBiaya += berat * 2500;
        }
        if (!makanan.equals("Ga pesen makan :D")) {
            totalBiaya *= 1.1;
        }

        return totalBiaya;
    }

    public static double hitungBiayaTiket(double km, boolean asuransi){
        double totalBiaya = 0;
        totalBiaya += km * 15000;
    
        if (asuransi) {
            totalBiaya *= 1.1;
        }

        return totalBiaya;
    }

    public static int hitungJumlahPesananMakan(ArrayList<String> listMakan){
        return listMakan.size();
    }
}
