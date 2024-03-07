
package Clock;

import java.awt.*;
import javax.swing.*;

public class Myclock2 extends JLabel implements Runnable{
    private int sec = 0;
    private int min = 0;
    private int hour = 0;
    private boolean paused;

    public boolean isPaused() {
        return paused;
    }
    
    public void cal(){
        sec++;
        if (sec == 60){
            sec = 0;
            min++;
            if (min == 60) {
                min = 0;
                hour++;
            }
        }
    }
    
    private synchronized void checkpaused(){
        while (paused){
            try{
                this.wait();
            }
            catch(InterruptedException IE){
                IE.printStackTrace();
            }
        }
    }
    
    public void pauseThread(){
        paused = true;
    }
    
    public synchronized void resumeThread(){
        paused = false;
        this.notify();
    }
    
    @Override
    public void run(){
        while (true) {
            this.checkpaused();
            this.cal();
            String time = String.format("%02d:%02d:%02d", hour, min, sec);
            this.setText(time);
            this.setFont(getFont().deriveFont(Font.BOLD,30));
            this.setHorizontalAlignment(CENTER);
            System.out.println(time);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                ex.toString();
            }
        }
    }
}
