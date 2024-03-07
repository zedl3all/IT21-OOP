/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Football;

/**
 *
 * @author SA090164
 */
public class FootballPlayer extends Player{
    private int playerNumber;
    private String position;
    
    public void setPlayerNumber(int n){
        playerNumber = n;
    }
    public int getPlayerNumber(){
        return playerNumber;
    }
    public void setPosition(String p){
        position = p;
    }
    public String getPosition(){
        return position;
    }
    public boolean isSamePosition(FootballPlayer p){
        return this.position.equals(p.position);
    }
}
