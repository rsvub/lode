/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lode;

import static lode.Lode.pocetLodi;

/**
 *
 * @author Student
 */
public class Simulator {

    public Simulator() throws Exception {
        Fleet swamp = new Fleet("swamp", pocetLodi);
        Fleet sawa = new Fleet("sawa", pocetLodi);

        Ship ship1 = swamp.drawLotsShip();
        Ship ship2 = sawa.drawLotsShip();

        ship1.dealDemage(ship2);

        if (ship2.isSunken()) {
            System.out.println(ship2);
        }

        System.out.println(swamp);
        System.out.println(sawa);

    }

}
