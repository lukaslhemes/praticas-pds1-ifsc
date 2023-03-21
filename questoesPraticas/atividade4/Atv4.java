package atividade4;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Atv4 {
    
    public static void main(String[] args) {
        
         JFrame f = new JFrame("Atividade 4");
         f.setSize(1280, 720);
         f.setLocation(350,150);
         f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
         
         JLabel labelM = new JLabel("Número 1:");
         labelM.setBounds(300, 50, 200, 30);

         f.setVisible(true);  

         JTextField txt1 = new JTextField();
         txt1.setVisible(true);
         txt1.setBounds(300, 80, 200, 30);
         txt1.setSize(200, 40);
         
         JLabel labelM2 = new JLabel("Número 2:");
         labelM2.setBounds(800, 50, 200, 30);
         
         JTextField txt2 = new JTextField();
         txt2.setVisible(true);
         txt2.setBounds(800, 80, 200, 30);
         txt2.setSize(200, 40);
         
         JButton btn1 = new JButton("Somar");
            btn1.setSize(200, 30);
            btn1.setLocation(0,150);     
            
            btn1.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    int num1 = Integer.parseInt(txt1.getText());
                    int num2 = Integer.parseInt(txt2.getText());
                // Calculate sum
                    int result = num1 + num2;
                    
                    
                    JOptionPane.showMessageDialog(null, result);
                }
            });
            
            
         JButton btn2 = new JButton("Subtrair");
            btn2.setSize(200, 30);
            btn2.setLocation(0,200);
                    
            btn2.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    int num1 = Integer.parseInt(txt1.getText());
                    int num2 = Integer.parseInt(txt2.getText());
                // Calculate sum
                    int result = num1 - num2;
                    
                    
                    JOptionPane.showMessageDialog(null, result);
                }
            });
         
         JButton btn3 = new JButton("Dividir");
            btn3.setSize(200, 30);
            btn3.setLocation(0,250);
         
            btn3.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    int num1 = Integer.parseInt(txt1.getText());
                    int num2 = Integer.parseInt(txt2.getText());
                // Calculate sum
                    int result = num1 / num2;
                    
                    
                    JOptionPane.showMessageDialog(null, result);
                }
            });
            
         JButton btn4 = new JButton("Multiplicar");
            btn4.setSize(200, 30);
            btn4.setLocation(0,300);
         
            btn4.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    int num1 = Integer.parseInt(txt1.getText());
                    int num2 = Integer.parseInt(txt2.getText());
                // Calculate sum
                    int result = num1 * num2;
                    
                    
                    JOptionPane.showMessageDialog(null, result);
                }
            });
            
         f.add(labelM);
         f.add(txt1);
         f.add(labelM2);
         f.add(txt2);
         
         f.add(btn1);
         f.add(btn2);
         f.add(btn3);
         f.add(btn4);
    }
    
}