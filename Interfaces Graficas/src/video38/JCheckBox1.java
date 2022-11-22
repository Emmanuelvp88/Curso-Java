package video38;
import javax.swing.event.*;
import javax.swing.*;

public class JCheckBox1 extends JFrame implements ChangeListener{
    private JCheckBox check1,check2,check3;
     
    public JCheckBox1(){
    setLayout(null);
    
    check1 = new JCheckBox("Ingles");
    check1.setBounds(10,10,100,20);
    check1.addChangeListener(this);
    add(check1);
    
    check2 = new JCheckBox("Frances");
    check2.setBounds(10,50,100,20);
    check2.addChangeListener(this);
    add(check2);
    
    check3 = new JCheckBox("Alemam");
    check3.setBounds(10,90,100,20);
    check3.addChangeListener(this);
    add(check3);
    
 }
    @Override
    public void stateChanged(ChangeEvent e){
        
        String cadena = "";
        
        if(check1.isSelected()== true){
            cadena = cadena + "Ingles - ";
        }if(check2.isSelected()==true){
            cadena = cadena + "Frances - ";
        }if(check3.isSelected()==true){
            cadena = cadena + "Aleman - ";
        }
        setTitle(cadena);
    }
    public static void main(String args[]){
        JCheckBox1 ventana = new JCheckBox1();
        ventana.setBounds(0,0,350,200);
        ventana.setVisible(true);
        ventana.setLocationRelativeTo(null);
        ventana.setResizable(false);
    } 
}
