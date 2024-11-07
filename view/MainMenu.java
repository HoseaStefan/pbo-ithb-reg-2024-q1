package view;

import java.util.ArrayList;
import java.util.Scanner;

import controller.ControllerPenerbangan;
import main.Main;
import model.classes.Penerbangan;
import model.classes.PenerbanganBisnis;
import model.classes.PenerbanganEkonomi;
import model.classes.PenerbanganFirstClass;
import model.enumeration.TipeTiket;

public class MainMenu {

    public static Scanner scan = new Scanner(System.in);

    public MainMenu() {
        showMenu();
    }

    public static void showMenu() {
        boolean lanjut = true;
        while (lanjut) {
            try {
                new MenuTipeTiket();
                System.out.print("Pilihan : ");
                int inputTiket = Integer.parseInt(scan.nextLine());

                TipeTiket inputTiketPilihan = TipeTiket.getTiket(inputTiket);

                double berat = MenuInputBerat();
                double km = MenuInputKM();

                switch (inputTiketPilihan) {
                    case EKONOMI:
                        Main.penerbangans.add(MenuPenerbanganEkonomi(inputTiketPilihan, berat, km));
                        break;
                    case BISNIS:
                        Main.penerbangans.add(MenuPenerbanganBisnis(inputTiketPilihan, berat, km));
                        break;
                    case FIRSTCLASS:
                        Main.penerbangans.add(MenuPenerbanganFirstClass(inputTiketPilihan, berat, km));
                        break;
                    default:
                        break;
                }

                System.out.print("Masih ingin pesan tiket? (true/false) : ");
                lanjut = Boolean.parseBoolean(scan.nextLine());

            } catch (Exception e) {
                System.out.println("Input Error!");
            }
        }
        new MenuShowTotalBiaya();
    }

    public static Penerbangan MenuPenerbanganEkonomi(TipeTiket tiket, double berat, double km) {
        System.out.println("Wajib membeli parasut tambahan!");
        boolean parasutTambahan = true;
        PenerbanganEkonomi tiketEkonomi = new PenerbanganEkonomi(tiket, km, berat, parasutTambahan);
        tiketEkonomi.setTotalHarga(ControllerPenerbangan.hitungBiayaTiket(km, berat, parasutTambahan));
        return tiketEkonomi;
    }

    public static Penerbangan MenuPenerbanganBisnis(TipeTiket tiket, double berat, double km) {
        String memesanMakanan = menuInputMakan();
        PenerbanganBisnis tiketBisnis = new PenerbanganBisnis(tiket, km, berat, memesanMakanan);
        tiketBisnis.setTotalHarga(ControllerPenerbangan.hitungBiayaTiket(km, berat, memesanMakanan));
        return tiketBisnis;
    }

    public static Penerbangan MenuPenerbanganFirstClass(TipeTiket tiket, double berat, double km) {
        boolean asuransiPenerbangan = menuInputAsuransi();
        ArrayList<String> listPesan = new ArrayList<>();
        listPesan = menuListPesanan(listPesan);
        PenerbanganFirstClass tiketFirstClass = new PenerbanganFirstClass(tiket, km, berat, asuransiPenerbangan);
        tiketFirstClass.setListMakanan(listPesan);
        tiketFirstClass.setJumlahPesananMakan(ControllerPenerbangan.hitungJumlahPesananMakan(listPesan));
        tiketFirstClass.setTotalHarga(ControllerPenerbangan.hitungBiayaTiket(km, asuransiPenerbangan));
        return tiketFirstClass;
    }

    public static double MenuInputBerat() {
        System.out.print("Masukan berat dalam kg : ");
        return Double.parseDouble(scan.nextLine());
    }

    public static double MenuInputKM() {
        System.out.print("Masukan jumlah KM : ");
        return Double.parseDouble(scan.nextLine());
    }

    public static String menuInputMakan() {
        System.out.print("Apakah ingin memesan makanan? (true/false) : ");
        boolean jawab = Boolean.parseBoolean(scan.nextLine());

        String makan = "Ga pesen makan :D";

        if (jawab) {
            System.out.print("Makan apa bang : ");
            makan = scan.nextLine();
        }

        return makan;
    }

    public static boolean menuInputAsuransi() {
        System.out.print("Ingin menggunakan asuransi penerbangan? (true/false) : ");
        return Boolean.parseBoolean(scan.nextLine());
    }

    public static ArrayList<String> menuListPesanan(ArrayList<String> listPesanan){
        boolean lanjutPesan = true;
        while (lanjutPesan) {
            System.out.print("Ingin pesan makan? (true/false) : ");
            lanjutPesan = Boolean.parseBoolean(scan.nextLine());
            if (lanjutPesan) {
                new MenuPilihanMakanFirstClass();
                System.out.print("Input pilihan : ");
                listPesanan.add(scan.nextLine());
            }
        }
        return listPesanan;
    }
}
