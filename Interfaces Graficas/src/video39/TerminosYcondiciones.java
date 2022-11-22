package video39;

import java.awt.Component;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

public class TerminosYcondiciones extends JFrame implements ActionListener,ChangeListener {
    private JLabel label;
    private JCheckBox check;
    private JButton boton;
    
    public TerminosYcondiciones(){
        setLayout(null);
        
        label = new JLabel("Terminos y condiciones");
        label.setBounds(10,10,150,20);
        add(label);
        
        check = new JCheckBox("Acepto");
        check.setBounds(10,50,150,20);
        check.addChangeListener(this);
        add(check);
        
        boton = new JButton("Continuar");
        boton.setBounds(10,90,90,20);
        boton.addActionListener(this);
        add(boton);
        boton.setEnabled(false);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()== boton){
            System.exit(0);
        }
    }

    @Override
    public void stateChanged(ChangeEvent e) {
        if(check.isSelected()== true){
            boton.setEnabled(true);
        }else{
            boton.setEnabled(false);
        }
    }
    
    public static void main(String args[]){
        TerminosYcondiciones ventana = new TerminosYcondiciones();
        ventana.setVisible(true);
        ventana.setBounds(0,0,200,200);
        ventana.setLocationRelativeTo(null);
    }
        
    }

