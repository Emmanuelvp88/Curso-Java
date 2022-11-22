package video26;

import javax.swing.*;

public class Swing_JLabel extends JFrame {
//Esta clase se dispone a enseñarnos a como ingresar una etiqueta 
//en una interface grafica.

    private JLabel label1;
    private JLabel label2;

    public Swing_JLabel() {
        setLayout(null);

        label1 = new JLabel("Aprendiendo a Fabricar interfaces Graficas");
        label1.setBounds(30, 30, 300, 30);
        add(label1);

        label2 = new JLabel("Version 1.0");
        label2.setBounds(30, 80, 100, 30);
        add(label2);

    }

    public static void main(String args[]) {
        Swing_JLabel ventana = new Swing_JLabel();
        ventana.setBounds(0, 0, 300, 300);
        ventana.setVisible(true);
        ventana.setLocationRelativeTo(null);
        ventana.setResizable(false);

    }

}
