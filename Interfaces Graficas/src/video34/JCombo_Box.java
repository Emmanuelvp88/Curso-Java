package video34;

import javax.swing.*;
import java.awt.event.*;

public class JCombo_Box extends JFrame implements ItemListener {

    private JComboBox box1;

    public JCombo_Box() {
        setLayout(null);

        box1 = new JComboBox();
        box1.setBounds(10, 10, 80, 20);
        box1.addItemListener(this);
        add(box1);

        box1.addItem("rojo");
        box1.addItem("verde");
        box1.addItem("morado");
        box1.addItem("azul");
        box1.addItem("amarillo");
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        if (e.getSource() == box1) {
            String texto = box1.getSelectedItem().toString();
            setTitle(texto);
        }
    }

    public static void main(String args[]) {
        JCombo_Box ventana = new JCombo_Box();
        ventana.setBounds(0, 0, 250, 100);
        ventana.setVisible(true);
        ventana.setLocationRelativeTo(null);
        ventana.setResizable(false);
        ventana.setResizable(true);
    }
}
