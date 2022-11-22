package video27;

import javax.swing.*;
import java.awt.event.*;/*Esta libreria sirve para agregar un evento a algun elemento*/

public class Swing_JButton extends JFrame implements ActionListener {/*ActionListener es 
    para darle funcionalidad a un evento, para estar atento a la accion de un evento de algun elemeto*/

    JButton boton1, boton2;

    public Swing_JButton() {
        setLayout(null);

        boton1 = new JButton("Cerrar");
        boton1.setBounds(200, 200, 80, 30);
        boton1.addActionListener(this);
        add(boton1);

    }

    public static void main(String args[]) {
        Swing_JButton ventana = new Swing_JButton();
        ventana.setBounds(0, 0, 300, 300);
        ventana.setVisible(true);
        ventana.setLocationRelativeTo(null);
        ventana.setResizable(false);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == boton1) {
            System.exit(0);
        }
    }
}
