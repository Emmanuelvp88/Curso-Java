package video40;
import javax.swing.*;
import javax.swing.event.*;

public class RadioButton extends JFrame implements ChangeListener {
    
    private JRadioButton radio1,radio2,radio3;
    private ButtonGroup grupo1;
    
    public RadioButton(){
        setLayout(null);
        
        grupo1 = new ButtonGroup();
        
        radio1 = new JRadioButton("640 x 480");
        radio1.setBounds(10,10,100,20);
        radio1.addChangeListener(this);
        add(radio1);
        grupo1.add(radio1);
        
        radio2 = new JRadioButton("800 x 600");
        radio2.setBounds(10,40,100,20);
        radio2.addChangeListener(this);
        add(radio2);
        grupo1.add(radio2);
        
        radio3 = new JRadioButton("1024 x 768");
        radio3.setBounds(10,70,100,20);
        radio3.addChangeListener(this);
        add(radio3);
        grupo1.add(radio3);
        
        
    }
    @Override
    public void stateChanged(ChangeEvent e){
        if(radio1.isSelected() == true){
            setSize(640,480);
        }if(radio2.isSelected() == true){
            setSize(800,600);
        }if(radio3.isSelected() == true){
            setSize(1024,768);
        }
    }
    public static void main(String args[]){
        RadioButton ventana = new RadioButton();
        ventana.setBounds(0,0,300,300);
        ventana.setVisible(true);
        ventana.setResizable(false);
        ventana.setLocationRelativeTo(null);
    }
}
