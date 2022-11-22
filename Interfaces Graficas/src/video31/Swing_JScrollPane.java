package video31;

import javax.swing.*;

public class Swing_JScrollPane extends JFrame {

    private JTextField text1;
    private JTextArea area1;
    private JScrollPane pane1;

    public Swing_JScrollPane() {
        setLayout(null);

        setTitle("JScrollPane");

        text1 = new JTextField();
        text1.setBounds(10, 10, 100, 20);
        add(text1);

        area1 = new JTextArea();

        pane1 = new JScrollPane(area1);
        pane1.setBounds(10, 50, 200, 200);
        add(pane1);

    }

    public static void main(String args[]) {
        Swing_JScrollPane ventana = new Swing_JScrollPane();
        ventana.setBounds(0, 0, 300, 300);
        ventana.setVisible(true);
        ventana.setLocationRelativeTo(null);
        ventana.setResizable(false);
    }
}
