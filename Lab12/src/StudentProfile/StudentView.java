package StudentProfile;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;

public class StudentView implements ActionListener, WindowListener{
    
    private JFrame jfr;
    private JLabel LID, LName, LMoney;
    private JTextField textid, textname, textmoney;
    private JButton DepositBN, WithdrawBN;
    private JPanel topPanel, bottomPanel;
    private Student s1 = new Student();
    
    public JPanel topPanel(){
        topPanel = new JPanel();
        topPanel.setLayout(new GridLayout(3,2));
        
        LID = new JLabel("ID :");
        LName = new JLabel("Name :");
        LMoney = new JLabel("Money :");
        
        textid = new JTextField();
        textname = new JTextField();
        textmoney = new JTextField();
        textmoney.setEditable(false);
        
        topPanel.add(LID);
        topPanel.add(textid);
        topPanel.add(LName);
        topPanel.add(textname);
        topPanel.add(LMoney);
        topPanel.add(textmoney);
        
        return topPanel;
    }
    
    public JPanel bottomPanel(){
        bottomPanel = new JPanel();
        bottomPanel.setLayout(new FlowLayout());
        
        DepositBN = new JButton("Deposit");
        WithdrawBN = new JButton("Withdraw");
        
        DepositBN.addActionListener(this);
        WithdrawBN.addActionListener(this);
        
        bottomPanel.add(DepositBN);
        bottomPanel.add(WithdrawBN);
        
        return bottomPanel;
    }
    
    public StudentView(){
        jfr = new JFrame("StudentView");
        
        jfr.addWindowListener(this);
        
        jfr.setLayout(new BorderLayout());
        
        jfr.add(topPanel(), BorderLayout.NORTH);
        jfr.add(bottomPanel(), BorderLayout.CENTER);
        
        jfr.setSize(500,150);
        jfr.setVisible(true);
        jfr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource().equals(DepositBN)){
            s1.setMoney(s1.getMoney()+100);
            textmoney.setText(s1.getMoney()+"");
        }
        if(ae.getSource().equals(WithdrawBN)){
            s1.setMoney(s1.getMoney()-100);
            textmoney.setText(s1.getMoney()+"");
        }
    }

    @Override
    public void windowOpened(WindowEvent e) {
        try(FileInputStream fis = new FileInputStream("StudentM.dat");
                ObjectInputStream ois = new ObjectInputStream(fis)){
            
            s1 = (Student) ois.readObject();
            
            textid.setText(s1.getID()+"");
            textname.setText(s1.getName());
            textmoney.setText(s1.getMoney()+"");
            
            System.out.println("File Loaded.");
        }catch (IOException ioe){
            System.out.println(ioe);
        }catch (ClassNotFoundException cnfe){
            System.out.println(cnfe);
        }
    }

    @Override
    public void windowClosing(WindowEvent e) {
        try(FileOutputStream fos = new FileOutputStream("StudentM.dat");
                ObjectOutputStream oos = new ObjectOutputStream(fos)){
            
            s1.setID(Integer.parseInt(textid.getText()));
            s1.setName(textname.getText());
            
            oos.writeObject(s1);
            
            System.out.println("File Saved.");
        }catch(IOException ioe){
            System.out.println(ioe);
        }catch(NumberFormatException nfe){
            System.out.println(nfe);
            System.out.println("Please Enter ID as Number!!!!!!!!!!!!!!!!!!!!!!");
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
