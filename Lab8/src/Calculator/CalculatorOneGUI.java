package Calculator;

import java.awt.*;
import javax.swing.*;
public class CalculatorOneGUI {
    private JFrame fr;
    private JButton plus, minus, multiply, divide;
    private JPanel grid1, flow1;
    private JTextField input1, input2, output1;
    
    public JPanel Operator(){
        flow1 = new JPanel();
        flow1.setLayout(new FlowLayout());
        
        plus = new JButton("Plus");
        minus = new JButton("Minus");
        multiply = new JButton("Multiply");
        divide = new JButton("Divide");
        
        flow1.add(plus);
        flow1.add(minus);
        flow1.add(multiply);
        flow1.add(divide);
        
        return flow1;
    }
    
    public CalculatorOneGUI(){
        fr = new JFrame("calculator");
        
        grid1 = new JPanel();
        grid1.setLayout(new GridLayout(4,1));
        
        input1 = new JTextField("0", 15);
        input1.setHorizontalAlignment(0);
        input2 = new JTextField("0", 15);
        input2.setHorizontalAlignment(0);
        output1 = new JTextField("output", 15);
        output1.setEditable(false);
        output1.setHorizontalAlignment(0);
        
        
        grid1.add(input1);
        grid1.add(input2);
        grid1.add(Operator());
        grid1.add(output1);
        
        fr.add(grid1);
        
        fr.pack();
        fr.setVisible(true);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
}
