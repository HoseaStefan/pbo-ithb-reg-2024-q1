package main;

import java.util.ArrayList;

import model.classes.Penerbangan;
import view.MainMenu;

public class Main {

    public static ArrayList<Penerbangan> penerbangans = new ArrayList<>();

    public static void main(String[] args) {
        new MainMenu();
    }
}
