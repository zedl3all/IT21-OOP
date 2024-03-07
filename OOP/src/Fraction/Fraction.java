/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Fraction;

/**
 *
 * @author LAB203_23
 */
public class Fraction {
    public int topN;
    public int btmN;
    public String toFraction(){
        return topN+"/"+btmN;
    }
    public String toFloat(){
        double top = topN;
        double btm = btmN;
        return (top/btm)+"";
    }
    public void addFraction(Fraction f){
        if (btmN == f.btmN){
            topN += f.btmN;
            btmN = btmN;
        }else{
            topN = topN*f.btmN+f.topN*btmN;
            btmN *= f.btmN;
        }
    }
    
}
