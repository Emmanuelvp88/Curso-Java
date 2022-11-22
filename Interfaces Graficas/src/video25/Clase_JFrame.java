package video25;

import javax.swing.*;
//En esta clase solo vemos como esque se deve de hacer una ventana.
//Los metodos setLocationRelatvetoo Y el metodo setRezisable.

public class Clase_JFrame extends JFrame {/*JFrame es una calse eredada a nuestra clase actual y sirve
    para crear una ventana panel para poder agregar todos elementos a una ventana o interfaz*/

    public Clase_JFrame() {
        setLayout(null);/*SetLayout(), significa "establecer diseño" o colocar diseño siver para
       ingresar las cordenadas a todos los elementos*/

    }

    public static void main(String args[]) {
        JFrame ventana = new JFrame();
        ventana.setBounds(0, 0, 300, 300);
        ventana.setVisible(true);
        ventana.setLocationRelativeTo(null);
        ventana.setResizable(true);

    }

}
