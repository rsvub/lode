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
public abstract class Ship {

    protected int hp = 1;
    protected String name;

    public Ship(String name) {
        this.name = name;
    }

    public abstract int getHp();
    
    public abstract void dealDemage(Ship ship);

    public String getName() {
        return this.name;
    }

    public void decreaseHp(int demage) {
        this.hp -= demage;
    }

    public void increaseHp(Dock dock) {
        if (dock.getShip() == this) {
            this.hp++;
        }
    }

    public boolean isAlive() {
        if (this.hp > 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isSunken() {
        if (this.hp < 1) {
            return true;
        } else {
            return false;
        }

    }

    @Override
    public abstract String toString();

}
