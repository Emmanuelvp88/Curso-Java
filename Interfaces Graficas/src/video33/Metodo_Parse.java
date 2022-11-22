package video33;
import javax.swing.*;
import java.awt.event.*;

public class Metodo_Parse extends JFrame implements ActionListener {
    private JLabel label1, label2,label3;
    private JTextField text1,text2;
    private JButton boton1;
    private int num1,num2,resultado;
    
    public Metodo_Parse(){
        setLayout(null);
        setTitle("Metodo Parse");
        
        label1 = new JLabel("Valor1:");
        label1.setBounds(30,10,80,20);
        add(label1);
        
        label2 = new JLabel("Valor2");
        label2.setBounds(30,50,50,20);
        add(label2);
        
        label3 = new JLabel("Resultado:");
        label3.setBounds(120,100,80,20);
        add(label3);
        
        text1 = new JTextField();
        text1.setBounds(100,10,130,20);
        add(text1);
        
        text2 = new JTextField();
        text2.setBounds(100,50,130,20);
        add(text2);
        
        boton1 = new JButton("Sumar");
        boton1.setBounds(10,100,90,20);
        boton1.addActionListener(this);
        add(boton1);       
    }
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == boton1){
            num1 = Integer.parseInt(text1.getText());
            num2 = Integer.parseInt(text2.getText());
            resultado = num1 + num2;
            label3.setText("Resultado: " + resultado);
            
        }
    }
    public static void main(String args[]){
        Metodo_Parse ventana = new Metodo_Parse();
        ventana.setBounds(0,0,300,200);
        ventana.setVisible(true);
        ventana.setLocationRelativeTo(null);
        ventana.setResizable(false);
    }   
}
