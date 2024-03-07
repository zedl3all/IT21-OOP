
package Clock;

import java.awt.event.*;
import javax.swing.*;

public class MyFrame implements MouseListener{
    
    private static Myclock2 clock;
    
    public static void main(String[] args) {
        JFrame jf = new JFrame();
        clock = new Myclock2();
        Thread t = new Thread(clock);
        t.start();
        jf.add(clock);
        jf.addMouseListener(new MyFrame());
        jf.setSize(200,100);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (clock.isPaused() == true) {
            clock.resumeThread();
        }
        else{
            clock.pauseThread();
        }
    }
    
    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }
    
}
