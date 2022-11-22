package video24;

import javax.swing.*;/*La libreria Swing sive para importar elementos para una interfaz grafica
el asterisco al final espara imprtar todos los elementos de la libreria y no importar
uno por uno. no es recomendable*/

public class Libreria_swing extends JFrame {

    private JLabel label1;

    public Libreria_swing() {
        setLayout(null);
        label1 = new JLabel("Emmanuel Villalva perez");
        label1.setBounds(80, 100, 200, 30);
        add(label1);
    }

    public static void main(String[] args) {
        Libreria_swing ventana = new Libreria_swing();
        ventana.setBounds(0, 0, 300, 300);
        ventana.setVisible(true);
        ventana.setLocationRelativeTo(null);
    }
}
