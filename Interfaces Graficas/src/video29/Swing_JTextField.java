package video29;

import javax.swing.*;
import java.awt.event.*;

public class Swing_JTextField extends JFrame implements ActionListener {

    private JButton boton1;
    private JLabel label1;
    private JTextField text1;/*Este elelmento significa "Campo de texto" es un pequeño 
    espacio donde pudes agregar texto es como una cajita de texto*/

    public Swing_JTextField() {
        setLayout(null);

        boton1 = new JButton("Aceptar");
        boton1.setBounds(10, 70, 80, 20);
        boton1.addActionListener(this);
        add(boton1);

        label1 = new JLabel("Usuario:");
        label1.setBounds(10, 20, 70, 20);
        add(label1);

        text1 = new JTextField();
        text1.setBounds(70, 20, 150, 20);
        add(text1);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == boton1) {
            String text = text1.getText();
            setTitle(text);
        }
    }

    public static void main(String args[]) {
        Swing_JTextField ventana = new Swing_JTextField();
        ventana.setBounds(0, 0, 300, 150);
        ventana.setVisible(true);
        ventana.setLocationRelativeTo(null);
        ventana.setResizable(false);
    }
}
