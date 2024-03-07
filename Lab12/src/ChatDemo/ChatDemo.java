package ChatDemo;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class ChatDemo implements ActionListener, WindowListener{
    
    private JFrame jfr;
    private JPanel buttonPanel, bottomPanel;
    private JTextArea textArea;
    private JTextField textField;
    private JButton summitButton, resetButton;
    private String text1 = "";
    
    public JPanel buttonPanel(){
        buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
        
        summitButton = new JButton("Summit");
        resetButton = new JButton("Reset");
        
        summitButton.addActionListener(this);
        resetButton.addActionListener(this);
        
        buttonPanel.add(summitButton);
        buttonPanel.add(resetButton);
        
        return buttonPanel;
    
    }
    
    public JPanel buttomPanel(){
        bottomPanel = new JPanel();
        bottomPanel.setLayout(new BorderLayout());
        
        textField = new JTextField(45);
        
        bottomPanel.add(textField, BorderLayout.NORTH);
        bottomPanel.add(buttonPanel(), BorderLayout.CENTER);
    
        return bottomPanel;
    }
    
    public ChatDemo(){
        jfr = new JFrame("ChatDemo");
        jfr.setLayout(new BorderLayout());
        
        textArea = new JTextArea(text1,20,45);
        textArea.setEditable(false);
        textArea.setForeground(Color.blue);
        
        jfr.add(textArea, BorderLayout.CENTER);
        jfr.add(buttomPanel(), BorderLayout.SOUTH);
        
        jfr.addWindowListener(this);
        
        jfr.pack();
        jfr.setVisible(true);
        jfr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource().equals(summitButton)){
            
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
            
            textArea.append(dtf.format(LocalDateTime.now())+" : "+textField.getText()+"\n");
            textField.setText("");
        }
        if (ae.getSource().equals(resetButton)){
            textArea.setText("");
        }
    }

    @Override
    public void windowOpened(WindowEvent e) {
        try(FileInputStream fis = new FileInputStream("ChatDemo.dat")){
            
            int i = fis.read();
            
            while(i != -1){
                text1 += (char)i;
                i = fis.read();
            }
            
            System.out.println("File Load.");
            textArea.setText(text1);
            
        }catch(IOException ioe){
            System.out.println(ioe);
        }
    }

    @Override
    public void windowClosing(WindowEvent e) {
        //System.out.println(textArea.getText());
        String data = textArea.getText();
        try(FileOutputStream fos = new FileOutputStream("ChatDemo.dat")){
            
            for(int i = 0; i<data.length(); i++){
                fos.write(data.charAt(i));
            }
            
            System.out.println("File Saved.");
            
        } catch (IOException ioe) {
            System.out.println(ioe);
        }
    }

    @Override
    public void windowClosed(WindowEvent e) {
    }

    @Override
    public void windowIconified(WindowEvent e) {
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
    }

    @Override
    public void windowActivated(WindowEvent e) {
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
    }
}
