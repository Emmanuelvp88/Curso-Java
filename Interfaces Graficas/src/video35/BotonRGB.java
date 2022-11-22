package video35;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class BotonRGB extends JFrame implements ActionListener {
    private JLabel label1, label2, label3;
    private JComboBox box1, box2, box3;
    private JButton boton1;

    public BotonRGB() {
        setLayout(null);

        label1 = new JLabel("Rojo");
        label1.setBounds(10, 10, 50, 20);
        add(label1);

        label2 = new JLabel("Verde");
        label2.setBounds(10, 50, 50, 20);
        add(label2);

        label3 = new JLabel("Azul");
        label3.setBounds(10, 90, 50, 20);
        add(label3);

        box1 = new JComboBox();
        box1.setBounds(70, 10, 50, 20);
        add(box1);
        for (int i = 0; i <= 255; i++) {
            box1.addItem(i);
        }

        box2 = new JComboBox();
        box2.setBounds(70, 50, 50, 20);
        add(box2);
        for (int i = 0; i <= 255; i++) {
            box2.addItem(i);
        }

        box3 = new JComboBox();
        box3.setBounds(70, 90, 50, 20);
        add(box3);
        for (int i = 0; i <= 255; i++) {
            box3.addItem(i);
        }

        boton1 = new JButton("Fijar Color");
        boton1.setBounds(20, 130, 80, 20);
        add(boton1);
        boton1.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == boton1) {

            int rojo = Integer.parseInt(box1.getSelectedItem().toString());
            int verde = Integer.parseInt(box2.getSelectedItem().toString());
            int azul = Integer.parseInt(box3.getSelectedItem().toString());

            Color color1 = new Color(rojo, verde, azul);
            boton1.setBackground(color1);
        }
    }

    public static void main(String args[]) {
        BotonRGB ventana = new BotonRGB();
        ventana.setBounds(0, 0, 200, 200);
        ventana.setVisible(true);
        ventana.setLocationRelativeTo(null);
        ventana.setResizable(false);

    }
}