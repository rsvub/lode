/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lode;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Student
 */
public class Fleet {

    private int pocetLodi;
    private String name;
    private int nrCruiser, nrDiplomatico, nrRescue;
    ArrayList<Ship> fleet = new ArrayList<Ship>();
    Random random = new Random();
    private int numberAliveShips, nrAliveCruiser, nrAliveDiplomatico, nrAliveRescue;
    protected int randomInt;

    public Fleet(String name, int pocetLodi) {
        this.name = name;
        this.pocetLodi = pocetLodi;
        this.spoctiLode(pocetLodi);
        this.numberAliveShips = pocetLodi;
    }

    protected void spoctiLode(int pocetLodi) {
        this.nrCruiser = pocetLodi / 2;
        this.nrDiplomatico = (pocetLodi - nrCruiser) / 2;
        this.nrRescue = (pocetLodi - nrCruiser - nrDiplomatico);
        this.nrAliveCruiser = this.nrCruiser;
        this.nrAliveDiplomatico = this.nrDiplomatico;
        this.nrAliveRescue = this.nrRescue;

        for (int i = 0; i < nrCruiser; i++) {
            this.fleet.add(new Cruiser("Cruiser" + String.valueOf(i)));
        }
        for (int i = 0; i < nrDiplomatico; i++) {
            this.fleet.add(new Diplomatico("Diplomatico" + String.valueOf(i)));
        }
        for (int i = 0; i < nrRescue; i++) {
            this.fleet.add(new Rescue("Rescue" + String.valueOf(i)));
        }
    }

    public Ship getRandomAliveShip() throws Exception {
        if (this.numberAliveShips < 1) {
            throw new Exception("Flotile is sunk!");
        }
        if (this.numberAliveShips == 1) {
            for (int i = 0; i < this.fleet.size(); i++) {
                if (this.fleet.get(i).isAlive()) {
                    return this.fleet.get(i);
                }
            }
        }
        randomInt = 0;
        while (true) {
            randomInt = random.nextInt(this.numberAliveShips);

            if (this.fleet.get(randomInt).isAlive()) {
                return this.fleet.get(randomInt);
            }
        }
    }

    public Ship getRandomAliveRescueShip() throws Exception {
        if (this.nrAliveRescue < 1) {
            throw new Exception("Rescue ship is sunk!");
        }
        if (this.nrAliveRescue == 1) {
            for (int i = 0; i < this.fleet.size(); i++) {
                if (this.fleet.get(i).isAlive() && this.fleet.get(i) instanceof Rescue) {
                    return this.fleet.get(i);
                }
            }
        }
        randomInt = 0;
        while (true) {
            randomInt = random.nextInt(this.nrAliveRescue);

            if (this.fleet.get(randomInt).isAlive()) {
                return this.fleet.get(randomInt);
            }
        }
    }

    public Ship getRandomAliveDiplomaticoShip() throws Exception {
        if (this.nrAliveDiplomatico < 1) {
            throw new Exception("Diplomatico ship is sunk!");
        }
        if (this.nrAliveDiplomatico == 1) {
            for (int i = 0; i < this.fleet.size(); i++) {
                if (this.fleet.get(i).isAlive() && this.fleet.get(i) instanceof Diplomatico) {
                    return this.fleet.get(i);
                }
            }
        }
        randomInt = 0;
        while (true) {
            randomInt = random.nextInt(this.nrAliveDiplomatico);

            if (this.fleet.get(randomInt).isAlive()) {
                return this.fleet.get(randomInt);
            }
        }
    }

    public Ship getRandomAliveCruiserShip() throws Exception {
        if (this.nrAliveCruiser < 1) {
            throw new Exception("Cruiser ship is sunk!");
        }
        if (this.nrAliveCruiser == 1) {
            for (int i = 0; i < this.fleet.size(); i++) {
                if (this.fleet.get(i).isAlive() && this.fleet.get(i) instanceof Cruiser) {
                    return this.fleet.get(i);
                }
            }
        }
        randomInt = 0;
        while (true) {
            randomInt = random.nextInt(this.nrAliveCruiser);

            if (this.fleet.get(randomInt).isAlive()) {
                return this.fleet.get(randomInt);
            }
        }
    }

    public Ship drawLotsShip() throws Exception {
        int randomLots = 0;
        randomLots = random.nextInt(3) + 1;
        if (randomLots == 1) {
            this.getRandomAliveCruiserShip();
            return this.fleet.get(randomInt);
        }
        if (randomLots == 2) {
            this.getRandomAliveDiplomaticoShip();
            return this.fleet.get(randomInt);
        }
        if (randomLots == 3) {
            this.getRandomAliveRescueShip();
            return this.fleet.get(randomInt);
        }
        return this.fleet.get(randomInt);
    }

    public void removeSunkShip() {
        for (int i = 0; i < this.fleet.size(); i++) {
            if (this.fleet.get(i).isAlive() == false) {
                this.fleet.remove(i);
                if (this.fleet.get(i) instanceof Cruiser) {
                    nrAliveCruiser--;
                }
                if (this.fleet.get(i) instanceof Diplomatico) {
                    nrAliveDiplomatico--;
                }
                if (this.fleet.get(i) instanceof Rescue) {
                    nrAliveRescue--;
                }
                i--;
            }
        }
    }



    @Override
    public String toString() {
        return this.fleet.toString();
    }

}
