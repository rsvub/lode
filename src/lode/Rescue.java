/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lode;

/**
 *
 * @author Student
 */
public class Rescue extends Ship {

    private Dock dock;
    private Ship ship;
    private int hp = 2;
    private int demage = 0;
    
    public Rescue(String name) {
        super(name);
    }

    public void toDock(Dock dock) {
        dock.recieveShip(this.ship);
    }

    public void outOfDock(Dock dock) {
        dock.releaseShip();
    }

    @Override
    public int getHp() {
        return this.hp = hp;
    }

    @Override
    public String toString() {
        return "Jméno lodi: " + name + ", počet životů: " + hp + "\n";
    }

    public void dealDemage(Ship ship) {

        if (ship == this) {
            return;
        }

        ship.decreaseHp(this.demage);

    }

}
