package Poring;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class PoringConstructor implements ActionListener{
    private JFrame jf;
    private JPanel panel;
    private JButton bn;
    private int count = 1;
    
    public PoringConstructor(){
        jf = new JFrame("Main");
        panel = new JPanel();
        bn = new JButton("Add");
        bn.addActionListener(this);
        
        panel.add(bn);
        jf.add(panel);
        
        jf.setLocationRelativeTo(null);
        
        jf.setVisible(true);
        jf.pack();
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Thread t = new Thread(new Poring(count++));
        t.start();
    }
}
