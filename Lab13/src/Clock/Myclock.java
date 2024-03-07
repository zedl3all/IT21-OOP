
package Clock;

import java.awt.*;
import java.util.Calendar;
import javax.swing.*;

public class Myclock extends JLabel implements Runnable{
    @Override
    public void run(){
        while (true) {    
            Calendar d = Calendar.getInstance();
            int sec = d.get(Calendar.SECOND);
            int min = d.get(Calendar.MINUTE);
            int hour = d.get(Calendar.HOUR_OF_DAY);
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
