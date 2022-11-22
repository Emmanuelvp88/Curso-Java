package video32_InterfazGrafica;

import javax.swing.*;
import java.awt.event.*;

public class DPropio extends JFrame implements ActionListener {

    private JTextField field1;
    private JButton boton1;
    private JLabel label1;

    public DPropio() {
        
        setLayout(null);
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        label1 = new JLabel("Mensaje");
        label1.setBounds(10, 10, 80, 30);
        add(label1);

        field1 = new JTextField();
        field1.setBounds(90, 20, 180, 20);
        add(field1);

        boton1 = new JButton("Start");
        boton1.setBounds(10, 50, 70, 20);
        add(boton1);
        boton1.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == boton1) {

            String cadena = field1.getText();

            JOptionPane.showMessageDialog(null, cadena);
        }
    }

    public static void main(String[] args) {
        DPropio ventana = new DPropio();
        ventana.setBounds(10, 70, 300, 150);
        ventana.setVisible(true);
        ventana.setLocationRelativeTo(null);
    }
}
