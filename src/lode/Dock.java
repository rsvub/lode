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
public class Dock {
    
    private Ship ship;
    
    public Dock(Ship ship){
        this.ship = ship;
    }
    
    public void recieveShip(Ship ship){
        this.ship = ship;
    }
    
    public void releaseShip(){
        this.ship = null;
    }
    
    public Ship getShip(){
        return this.ship;
    }
    
}
