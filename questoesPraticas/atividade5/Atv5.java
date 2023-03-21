package atividade5;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Atv5 {
    
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
         
         JLabel labelM3 = new JLabel("Número 3:");
         labelM3.setBounds(550, 150, 200, 30);
         
         JTextField txt3 = new JTextField();
         txt3.setVisible(true);
         txt3.setBounds(550, 150, 200, 30);
         txt3.setSize(200, 40);
         
         JButton btn1 = new JButton("Resultado");
            btn1.setSize(200, 30);
            btn1.setLocation(0,150);     
            
            btn1.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    int num1 = Integer.parseInt(txt1.getText());
                    int num2 = Integer.parseInt(txt2.getText());
                    int num3 = Integer.parseInt(txt3.getText());
                    
                    String result = "";

                    if(num1 == num2 && num2 == num3 && num1 == num3 && num2 == num3){
                        result = "Triângulo equilátero";
                    }else if(num1 == num2){
                        result = "Triângulo isóceles";
                    }else if(num2 == num3){
                        result = "Triângulo isóceles";
                    }else if(num1 == num3){
                        result = "Triângulo isóceles";
                    }else if(num1 != num2 && num2 != num3 && num1 != num3 && num2 != num3){
                        result = "Triângulo escaleno";
                    }
                        
                                        
                    JOptionPane.showMessageDialog(null, result);
                }
            });
            
         f.add(labelM);
         f.add(txt1);
         f.add(labelM2);
         f.add(txt2);
         f.add(labelM3);
         f.add(txt3);
         f.add(btn1);

    }
    
}
