/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab72;

/**
 *
 * @author SA090164
 */
public class Pigeon extends Bird{
    private static int numberOfPigeon;
    
    public Pigeon(double wingSize, double weight, double height){
        super(wingSize,weight,height);
        numberOfPigeon += 1;
    }
    public Pigeon(){
        this(0.0, 0.0, 0.0);
    }
    public void eat(String food){
        if (food.equals("worm")){
            super.eat(0.5);
        }
        else if (food.equals("seed")){
            super.eat(0.2);
        }
        else{
            System.out.println("Pigeon can eat only worm and seed.");
        }
    }
    @Override
    public String toString(){
        return "Pigeon "+getWeight()+" kg and "+getHeight()+" cm. There are "+numberOfPigeon+" pigeons.";
    }
    @Override
    public void fly(){
        if(getWeight() >= 5){
            setWeight(getWeight()-0.25);
            System.out.println("Fly Fly");
        }
        else{
            System.out.println("I’m hungry.");
        }
    }
    @Override
    public void takeOff(){
        if(getWeight() >= 5){
            setWeight(getWeight()-0.5);
            System.out.println("Take Off");
        }
        else{
            System.out.println("I’m hungry.");
        }
    }
    @Override
    public void landing(){
        if(getWeight() >= 5){
            setWeight(getWeight()-0.5);
            System.out.println("Landing");
        }
        else{
            System.out.println("I’m hungry.");
        }
    }
    
}
