package TellerGUI;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class TellerGUI implements ActionListener{
    private JFrame fr;
    private JButton deposit, withdraw, exit;
    private JPanel gridmain, flow2, grid1, grid2;
    private JTextField output1, input1;
    private JLabel balance, amount;
    private Account money = new Account(0, "");
    
    public JPanel Balance(){
        grid1 = new JPanel(new GridLayout(1, 2));
        output1 = new JTextField(money.getBalance()+"", 15);
        output1.setEditable(false);
        output1.setHorizontalAlignment(0);
        balance = new JLabel("  Balance ");
        
        grid1.add(balance);
        grid1.add(output1);
        
        
        return grid1;
    }
    
    public JPanel Amount(){
        grid2 = new JPanel(new GridLayout(1, 2));
        input1 = new JTextField("", 15);
        input1.setHorizontalAlignment(0);
        amount = new JLabel("  Amount ");
        
        grid2.add(amount);
        grid2.add(input1);
        
        
        return grid2;
    }
    
    public JPanel Tellerbutton(){
        flow2 = new JPanel(new FlowLayout());
        
        deposit = new JButton("Deposit");
        withdraw = new JButton("Withdraw");
        exit = new JButton("Exit");
        
        deposit.addActionListener(this);
        withdraw.addActionListener(this);
        exit.addActionListener(this);
        
        flow2.add(deposit);
        flow2.add(withdraw);
        flow2.add(exit);
        
        return flow2;
    }
    
    public JPanel MainPanel(){
        gridmain = new JPanel(new GridLayout(4,1));
        
        gridmain.add(Balance());
        gridmain.add(Amount());
        gridmain.add(Tellerbutton());
    
        return gridmain;
    }
    
    public TellerGUI(){
        fr = new JFrame("Teller GUI");
        
        fr.add(MainPanel());
    
        fr.pack();
        fr.setVisible(true);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        
        if(ae.getSource().equals(exit)){
            System.exit(0);
        }
        
        if (input1.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please Enter Something.", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else{
            try{
                int use_amount = Integer.parseInt(input1.getText());
                if (ae.getSource().equals(deposit)) {
                    money.deposit(use_amount);
                    output1.setText(money.getBalance()+"");
                }
                else if (ae.getSource().equals(withdraw)){
                    if (money.getBalance() >= use_amount) {
                        money.withdraw(use_amount);
                        output1.setText(money.getBalance()+"");
                    }
                }
            }
            catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "\"" + input1.getText()+"\"" + " is not Integer.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}
