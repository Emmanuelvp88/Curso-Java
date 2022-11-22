package video28;

import javax.swing.*;
import java.awt.event.*;

public class Manejo_de_botones extends JFrame implements ActionListener {

    private JButton boton1, boton2, boton3, boton4;
    private JLabel label1;

    public Manejo_de_botones() {
        setLayout(null);

        boton1 = new JButton("Boton1");
        boton1.setBounds(10, 110, 80, 30);
        boton1.addActionListener(this);
        add(boton1);

        boton2 = new JButton("Boton2");
        boton2.setBounds(100, 110, 80, 30);
        boton2.addActionListener(this);
        add(boton2);

        boton3 = new JButton("Boton3");
        boton3.setBounds(190, 110, 80, 30);
        boton3.addActionListener(this);
        add(boton3);

        boton4 = new JButton("Cerrar");
        boton4.setBounds(110, 150, 80, 30);
        boton4.addActionListener(this);
        add(boton4);

        label1 = new JLabel("En Espera...");
        label1.setBounds(10, 30, 200, 30);
        add(label1);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == boton1) {
            label1.setText("Has presionado el boton1");
        } else if (e.getSource() == boton2) {
            label1.setText("Has presionado el boton2");
        } else if (e.getSource() == boton3) {
            label1.setText("Has presionado el boton3");
        } else if (e.getSource() == boton4) {
            System.exit(0);
        }
    }

    public static void main(String args[]) {
        Manejo_de_botones ventana = new Manejo_de_botones();
        ventana.setBounds(0, 0, 300, 300);
        ventana.setVisible(true);
        ventana.setResizable(false);
        ventana.setLocationRelativeTo(null);
    }
}
