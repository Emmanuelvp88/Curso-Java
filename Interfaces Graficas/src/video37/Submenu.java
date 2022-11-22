package video37;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Submenu extends JFrame implements ActionListener {
    private JMenu menu1,menu2,menu3;
    private JMenuBar barra;
    private JMenuItem item1,item2,item3,item4,item5;
    
   public Submenu(){
       setLayout(null);
       
       barra = new JMenuBar();
       setJMenuBar(barra);
       
       menu1 = new JMenu("Opciones");
       barra.add(menu1);
       
       menu2 = new JMenu("Temaño de ventana");
       menu1.add(menu2);
       
       menu3 = new JMenu("Color deFondo");
       menu1.add(menu3);
       
       item1 = new JMenuItem("300 x 200");
       item1.addActionListener(this);
       menu2.add(item1);
       
       item2 = new JMenuItem("640 x 480");
       item2.addActionListener(this);
       menu2.add(item2);
       
       item3 = new JMenuItem("Rojo");
       item3.addActionListener(this);
       menu3.add(item3);
       
       item4 = new JMenuItem("Verde");
       item4.addActionListener(this);
       menu3.add(item4);
       
       item5 = new JMenuItem("Azul");
       item5.addActionListener(this);
       menu3.add(item5);
       
   }
    @Override
   public void actionPerformed(ActionEvent e){
       
       if(e.getSource()== item1){
           setSize(200,300);
       }if(e.getSource()== item2){
           setSize(640,480);
       }if(e.getSource()==item3){
           getContentPane().setBackground(new Color(255,0,0));
       }if(e.getSource()==item4){
           getContentPane().setBackground(new Color(0,255,0));
       }if(e.getSource()==item5){
           getContentPane().setBackground(new Color(0,0,255));
       }
   }
   public static void main(String args []){
       Submenu ventana = new Submenu();
       ventana.setBounds(0,0,200,200);
       ventana.setVisible(true);
       ventana.setLocationRelativeTo(null);
   }
}
