/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lode;

import static java.time.Instant.MAX;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Student
 */
public class Sea {

    private int pocetFlotil;
    private int MAX_FLOTIL = 20;
    Random rand = new Random();
    private ArrayList<String> sea;

    private int pocetLodi;

    public Sea() {
        this.pocetFlotil = rand.nextInt(MAX_FLOTIL) + 1;
    }

    public void generujFlotily(int pocetLodi) {
        sea = new ArrayList();
        for (int i = 0; i < pocetFlotil; i++) {
            if (i < 10) {
                sea.add("00" + i);
                String nazev = this.sea.get(i);
                Fleet fleet = new Fleet(nazev, pocetLodi);
                fleet.spoctiLode(pocetLodi);
            } else {
                sea.add("0" + i);
                String nazev = this.sea.get(i);
                Fleet fleet = new Fleet(nazev, pocetLodi);
                fleet.spoctiLode(pocetLodi);
            }

        }

    }

}
