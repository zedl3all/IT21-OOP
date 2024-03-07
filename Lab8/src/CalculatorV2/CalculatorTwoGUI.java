package CalculatorV2;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class CalculatorTwoGUI implements ActionListener{
    private JFrame fr;
    private JButton bn0, bn1, bn2, bn3, bn4, bn5, bn6, bn7, bn8, bn9, plus, minus, multiply, divide, bnc, bnequal;
    private JPanel border1, grid1;
    private JTextField output1;
    
    private ArrayList<String> equation = new ArrayList<>();
    private String show = "";
    
    public JPanel keyboard(){
        grid1 = new JPanel(new GridLayout(4,4));
        bn0 = new JButton("0");
        bn1 = new JButton("1");
        bn2 = new JButton("2");
        bn3 = new JButton("3");
        bn4 = new JButton("4");
        bn5 = new JButton("5");
        bn6 = new JButton("6");
        bn7 = new JButton("7");
        bn8 = new JButton("8");
        bn9 = new JButton("9");
        bnc = new JButton("c");
        plus = new JButton("+");
        minus = new JButton("-");
        multiply = new JButton("*");
        divide = new JButton("/");
        bnequal = new JButton("=");
        
        bn0.addActionListener(this);
        bn1.addActionListener(this);
        bn2.addActionListener(this);
        bn3.addActionListener(this);
        bn4.addActionListener(this);
        bn5.addActionListener(this);
        bn6.addActionListener(this);
        bn7.addActionListener(this);
        bn8.addActionListener(this);
        bn9.addActionListener(this);
        bnc.addActionListener(this);
        plus.addActionListener(this);
        minus.addActionListener(this);
        multiply.addActionListener(this);
        divide.addActionListener(this);
        bnequal.addActionListener(this);
        
        grid1.add(bn7);
        grid1.add(bn8);
        grid1.add(bn9);
        grid1.add(plus);
        grid1.add(bn4);
        grid1.add(bn5);
        grid1.add(bn6);
        grid1.add(minus);
        grid1.add(bn1);
        grid1.add(bn2);
        grid1.add(bn3);
        grid1.add(multiply);
        grid1.add(bn0);
        grid1.add(bnc);
        grid1.add(bnequal);
        grid1.add(divide);
        
        return grid1;
    }
    
    public JPanel mainpanel(){
        border1 = new JPanel(new BorderLayout());
        output1 = new JTextField(show);
        output1.setEditable(false);
        output1.setHorizontalAlignment(0);
        
        border1.add(output1, BorderLayout.NORTH);
        border1.add(keyboard(), BorderLayout.CENTER);
        
        return border1;
    }
    
    public CalculatorTwoGUI(){
        fr = new JFrame("My Calculator");
        
        fr.add(mainpanel());
        
        fr.setSize(350, 350);
        fr.setVisible(true);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public void cal(){
        while (equation.size()!= 1) {
            
            double result = 0;
            
            if (equation.contains("*")) {
                for (int i = 0; i < equation.size(); i++) {
                    if (equation.get(i).equals("*")) {
                        result = Double.parseDouble(equation.get(i-1)) * Double.parseDouble(equation.get(i+1));
                        equation.remove(i + 1);
                        equation.remove(i);
                        equation.set(i - 1, result + "");
                        break;
                    }
                }
            }
            else if (equation.contains("/")){
                for (int i = 0; i < equation.size(); i++) {
                    if (equation.get(i).equals("/")) {
                        result = Double.parseDouble(equation.get(i-1)) / Double.parseDouble(equation.get(i+1));
                        equation.remove(i + 1);
                        equation.remove(i);
                        equation.set(i - 1, result + "");
                        break;
                    }
                }
            }
            else if (equation.contains("+")){
                for (int i = 0; i < equation.size(); i++) {
                    if (equation.get(i).equals("+")) {
                        result = Double.parseDouble(equation.get(i-1)) + Double.parseDouble(equation.get(i+1));
                        equation.remove(i + 1);
                        equation.remove(i);
                        equation.set(i - 1, result + "");
                        break;
                    }
                }
            }
            else if (equation.contains("-")){
                for (int i = 0; i < equation.size(); i++) {
                    if (equation.get(i).equals("-")) {
                        result = Double.parseDouble(equation.get(i-1)) - Double.parseDouble(equation.get(i+1));
                        equation.remove(i + 1);
                        equation.remove(i);
                        equation.set(i - 1, result + "");
                        break;
                    }
                }
            }
            else{
                JOptionPane.showMessageDialog(null, "Please Try Again.", "Error", JOptionPane.ERROR_MESSAGE);
                output1.setText("");
                equation.clear();
                break;
            }
        }
    }
    

    @Override
    public void actionPerformed(ActionEvent ae) {
        
        if (ae.getSource().equals(bnc)) {
            show = "";
            equation.clear();
        }
        if (ae.getSource().equals(bn1)) {
            show += 1;
        }
        if (ae.getSource().equals(bn2)) {
            show += 2;
        }
        if (ae.getSource().equals(bn3)) {
            show += 3;
        }
        if (ae.getSource().equals(bn4)) {
            show += 4;
        }
        if (ae.getSource().equals(bn5)) {
            show += 5;
        }
        if (ae.getSource().equals(bn6)) {
            show += 6;
        }
        if (ae.getSource().equals(bn7)) {
            show += 7;
        }
        if (ae.getSource().equals(bn8)) {
            show += 8;
        }
        if (ae.getSource().equals(bn9)) {
            show += 9;
        }
        if (ae.getSource().equals(bn0)) {
            show += 0;
        }
        if (ae.getSource().equals(plus)) {
            if (!output1.getText().isEmpty()) {
                equation.add(output1.getText());
                equation.add("+");
                show = "";
            }
        }
        if (ae.getSource().equals(minus)) {
            if (!output1.getText().isEmpty()) {
                equation.add(output1.getText());
                equation.add("-");
                show = "";
            }
        }
        if (ae.getSource().equals(multiply)) {
            if (!output1.getText().isEmpty()) {
                equation.add(output1.getText());
                equation.add("*");
                show = "";
            }
        }
        if (ae.getSource().equals(divide)) {
            if (!output1.getText().isEmpty()) {
                equation.add(output1.getText());
                equation.add("/");
                show = "";
            }
        }
        if (ae.getSource().equals(bnequal)) {
            if (!output1.getText().isEmpty()) {
                equation.add(output1.getText());
                System.out.println("prenum "+equation);
                show = "";
                cal();
                show = equation.get(0);
                equation.clear();
            }
        }
        System.out.println("prenum "+equation);
        System.out.println("show "+show);
        output1.setText(show);
    }
}
