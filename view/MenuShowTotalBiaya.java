package view;

import controller.ControllerPenerbangan;
import main.Main;
import model.classes.Penerbangan;

public class MenuShowTotalBiaya {
    public MenuShowTotalBiaya(){
        showTotal();
    }

    public static void showTotal(){
        for (Penerbangan penerbangan : Main.penerbangans) {
            int i = 1;
            System.out.println("=============================");
            System.out.println("PENERBANGAN ke - " + i);
            System.out.println("TIKET : " + penerbangan.getTipePenerbangan());
            System.out.println("KM : " + penerbangan.getKm());
            System.out.println("BERAT BAGASI : " + penerbangan.getBeratBagasi());
            System.out.println("TOTAL BAYAR : " + penerbangan.getTotalHarga());
        }
        System.out.println("+=======================+");
        System.out.println("GRAND TOTAL : " + ControllerPenerbangan.getTotal());
        System.out.println("+=======================+");

    }
}
