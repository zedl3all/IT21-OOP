/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vehicle;

/**
 *
 * @author SA090164
 */
public class Plane extends Vehicle{
    public void showPlaneInfo(){
        System.out.println("Plane detail is, Fuel is " + getFuel() + " litre and Top Speed is " + getTopSpeed() + " m/s.");
    }
    public void setPlaneInfo(int s, String t){
        setFuel(s);
        setTopSpeed(t);
    }
    public void fly(){
        int fuelnow = getFuel();
        if (fuelnow-200 < 0){
            System.out.println("Please add fuel.");
        }else{
            System.out.println("Fly.");
            setFuel(fuelnow-200);
       }
    }
}
