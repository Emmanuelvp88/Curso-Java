package video36;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Menu extends JFrame implements ActionListener {

    private JMenuBar barra;
    private JMenu menu;
    private JMenuItem item1, item2, item3;

    public Menu() {
        setLayout(null);

        barra = new JMenuBar();
        setJMenuBar(barra);

        menu = new JMenu("Opciones");
        barra.add(menu);

        item1 = new JMenuItem("Rojo");
        menu.add(item1);
        item1.addActionListener(this);

        item2 = new JMenuItem("Verde");
        menu.add(item2);
        item2.addActionListener(this);

        item3 = new JMenuItem("Azul");
        menu.add(item3);
        item3.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Container fondo = this.getContentPane();

        if (e.getSource() == item1) {
            fondo.setBackground(new Color(255, 0, 0));
        }
        if (e.getSource() == item2) {
            fondo.setBackground(new Color(0, 255, 0));
        }
        if (e.getSource() == item3) {
            fondo.setBackground(new Color(0, 0, 255));
        }
    }

    public static void main(String args[]) {
        Menu ventana = new Menu();
        ventana.setVisible(true);
        ventana.setBounds(0, 0, 200, 200);
        ventana.setResizable(false);
        ventana.setLocationRelativeTo(null);
    }

}
