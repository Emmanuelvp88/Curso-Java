package video30;

import javax.swing.*;

public class Swing_JTextArea extends JFrame {

    private JTextField text1;
    private JTextArea area1;/*Es una area de texto mas extensa que el FTextField, es similar 
    pero con mayor campo de texto*/

    public Swing_JTextArea() {
        setLayout(null);

        setTitle("JTextArea");

        text1 = new JTextField();
        text1.setBounds(10, 10, 100, 20);
        add(text1);

        area1 = new JTextArea();
        area1.setBounds(10, 40, 300, 300);
        add(area1);

    }

    public static void main(String args[]) {
        Swing_JTextArea ventana = new Swing_JTextArea();
        ventana.setBounds(0, 0, 350, 400);
        ventana.setVisible(true);
        ventana.setLocationRelativeTo(null);
        ventana.setResizable(false);

    }
}
