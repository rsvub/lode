/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lode;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class Lode {
    
    private static final Scanner sc = new Scanner(System.in);
    protected static int pocetLodi;
    
    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {
        
        System.out.println("Zadej počet lodí ve flotile: ");

        pocetLodi = sc.nextInt();
        /**
        //Ship lod = new Ship("Bobik");
        //lod.getHp();
        Cruiser kriznik = new Cruiser("Pinda");
        kriznik.getHp();
        //kriznik.dealDemage(lod);
        //System.out.println(lod.getHp());
        
        Cruiser kriznik2 = new Cruiser("Ferda");
        kriznik2.getHp();
        kriznik2.dealDemage(kriznik);
        System.out.println(kriznik.getHp());
        
        Diplomatico diplomat = new Diplomatico("Blb");
        System.out.println(diplomat);
        
        //Dock dock = new Dock(lod);

        //lod.increaseHp(dock);
        //System.out.println(lod.getHp());
        */
        
        if(pocetLodi<3) throw new Exception("Málo lodí");
        
        /**
        Fleet swamp = new Fleet("swamp", pocetLodi);
        Fleet sawa = new Fleet("sawa", pocetLodi);
        
        
        
        swamp.drawLotsShip();
        sawa.drawLotsShip();
        

        
        System.out.println(swamp);
        System.out.println(sawa);
        
        Sea more = new Sea();
        */
        
        Simulator boj = new Simulator();
        
        
    }
    
}
