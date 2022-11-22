package video41_42;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import video43.TerminosYcondiciones;

public class Bienvenido extends JFrame implements ActionListener {

    private JLabel labelcocacola, labelsistema, labelnombre, labelcompany;
    private JTextField fieldnombre;
    private JButton botoningresar;
    public static String texto = "";

    public Bienvenido() {
        setLayout(null);

        setTitle("Bienvenido");
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        setIconImage(new ImageIcon(getClass().getResource("images/icon.png")).getImage());

        getContentPane().setBackground(new Color(255, 0, 0));

        ImageIcon imagen = new ImageIcon(getClass().getResource("images/logo-coca.png"));

        labelcocacola = new JLabel(imagen);
        labelcocacola.setBounds(20, 40, 250, 80);
        add(labelcocacola);

        labelsistema = new JLabel("Sistema de Control Vacacional");
        labelsistema.setBounds(20, 130, 250, 30);
        add(labelsistema);
        labelsistema.setFont(new Font("Andale Mono", 3, 16));
        labelsistema.setForeground(new Color(255, 255, 255));

        labelnombre = new JLabel("Ingrese su nombre");
        labelnombre.setBounds(30, 180, 120, 20);
        add(labelnombre);
        labelnombre.setFont(new Font("Andale Mono,", 1, 11));
        labelnombre.setForeground(Color.white);

        fieldnombre = new JTextField();
        fieldnombre.setBounds(30, 200, 220, 20);
        add(fieldnombre);
        fieldnombre.setBackground(new Color(224, 224, 224));
        fieldnombre.setFont(new Font("Andale Mono", 1, 12));
        fieldnombre.setForeground(Color.red);

        botoningresar = new JButton("Ingresar");
        botoningresar.setBounds(90, 240, 90, 20);
        botoningresar.addActionListener(this);
        add(botoningresar);
        botoningresar.setForeground(Color.red);

        labelcompany = new JLabel("@2021 The Coca Cola Company");
        labelcompany.setBounds(50, 330, 180, 20);
        add(labelcompany);
        labelcompany.setFont(new Font("Andale Mono", 1, 11));
        labelcompany.setForeground(Color.white);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == botoningresar) {

            texto = fieldnombre.getText().trim();

            if (texto.equals("")) {
                JOptionPane.showMessageDialog(null, "Debe de Ingresar un monbre");
            } else {
                TerminosYcondiciones ventana = new TerminosYcondiciones();
                ventana.setBounds(0, 0, 700, 500);
                ventana.setVisible(true);
                ventana.setLocationRelativeTo(null);
                ventana.setResizable(false);
                this.setVisible(false);
            }
        }
    }

    public static void main(String args[]) {
        Bienvenido ventana = new Bienvenido();
        ventana.setBounds(0, 0, 300, 400);
        ventana.setVisible(true);
        ventana.setLocationRelativeTo(null);
        ventana.setResizable(false);
    }
}
