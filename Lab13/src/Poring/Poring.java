package Poring;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Random;

public class Poring implements MouseListener, Runnable{
    
    private JFrame jf;
    private JLabel lb;
    private ImageIcon image;
    private Random random = new Random();
    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    
    
    public Poring(int count){
        jf = new JFrame("Poring");
        image = new ImageIcon("src/Poring/Image/Img1.png");
        lb = new JLabel(image);
        lb.setText(count+"");
        lb.addMouseListener(this);
        jf.addMouseListener(this);
        
        jf.add(lb);
        
        int xposition = random.nextInt((screenSize.width)-250);
        int yposition = random.nextInt((screenSize.height)-250);
        
        jf.setLocation(xposition, yposition);
        jf.setResizable(false);
        jf.pack();
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        
        Thread td = new Thread(this);
        td.start();
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        jf.dispose();
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
    @Override
    public void run(){
        while(true){
            int movex = random.nextInt(-7,7);
            int movey = random.nextInt(-7,7);
            jf.setLocation(jf.getX()+movex,jf.getY()+movey);
            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                ex.toString();
            }
        }
    }
}
