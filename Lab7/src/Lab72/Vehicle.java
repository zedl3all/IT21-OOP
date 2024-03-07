/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab72;

/**
 *
 * @author SA090164
 */
public abstract class Vehicle implements Dieselable{
    protected double fuel;
    
    public void setFuel(double fuel){
        this.fuel = fuel;
    }
    public double getFuel(){
        return fuel;
    }
    public void addFuel(double fuel){
        if (fuel > 0){
            this.fuel += fuel;
        }
        else{
            System.out.println("Fuel is empty.");
        }
    }
    public Vehicle(double fuel){
        this.fuel = fuel;
    }
    public Vehicle(){
        this(0.0);
    }
    public abstract void honk();
}
