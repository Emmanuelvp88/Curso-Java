package video32;

import javax.swing.*;
import java.awt.event.*;

public class Pasar_Texto extends JFrame implements ActionListener {

    private JTextArea area1;
    private JTextField text1;
    private JScrollPane pane1;
    private JButton boton1;
    String texto = "";

    public Pasar_Texto() {
        setLayout(null);
        setTitle("Pasar texto de JTextField a un JTextArea");

        area1 = new JTextArea();

        text1 = new JTextField();
        text1.setBounds(10, 10, 100, 20);
        add(text1);

        pane1 = new JScrollPane(area1);
        pane1.setBounds(10, 50, 200, 200);
        add(pane1);

        boton1 = new JButton("Pasar");
        boton1.setBounds(140, 10, 80, 20);
        boton1.addActionListener(this);
        add(boton1);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == boton1) {
            texto += text1.getText() + "\n";
            area1.setText(texto);
            text1.setText("");
        }
    }

    public static void main(String args[]) {
        Pasar_Texto ventana = new Pasar_Texto();
        ventana.setBounds(0, 0, 300, 300);
        ventana.setVisible(true);
        ventana.setLocationRelativeTo(null);
        ventana.setResizable(false);
    }
}
