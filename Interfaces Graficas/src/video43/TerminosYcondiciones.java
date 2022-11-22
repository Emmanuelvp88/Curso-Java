package video43;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import video41_42.Bienvenido;
import video44.Interfazprincipal;


public class TerminosYcondiciones extends JFrame implements ActionListener {

    private JButton botoncontinuar, botonnoacepto;
    private JLabel labelterminos, labelcocacola;
    private JTextArea areaterminos;
    private JScrollPane pane1;
    private JCheckBox checkacepto;
    String nombre = "";

    public TerminosYcondiciones() {
        setLayout(null);//con esta linea establecemos un diseño para el JFrame
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);//aqui serramos la ejecucion de el progrma
        //por completo cerrando el Dmonia que crea cuando se ejecuta en segundo plano
        
        setTitle("Licencia de uso");//establecemos un titulo en el encabezado

        //con esta linea establecemos ina imagen en el iconoen vez de la tasita de cafe.
        setIconImage(new ImageIcon(getClass().getResource("images/icon.png")).getImage());
        
        //con esta lineas de codigo estamos recuepereando la varible "nombre"
        //de la calse Bienvenida y asi poderle dar uso en esta clese.
        Bienvenido recuperar = new Bienvenido();
        nombre = recuperar.texto;
        
        labelterminos = new JLabel("TERMINOS Y CONDICIONES");
        labelterminos.setBounds(230, 10, 400, 30);
        add(labelterminos);
        labelterminos.setForeground(Color.black);
        labelterminos.setFont(new Font("", 1, 15));

        //creamos un objeto de tipo "ImageIcon" para ingresarle una imagen y asi poder usar 
        //ese objeto dentro de un JLabel "una etiqueta"
        ImageIcon imagen = new ImageIcon(getClass().getResource("images/coca-cola.png"));

        labelcocacola = new JLabel(imagen);
        labelcocacola.setBounds(420, 360, 250, 80);
        add(labelcocacola);

        areaterminos = new JTextArea(""
                + "\n\n       TERMINOS Y CONDICIONES\n\n"
                + "            A. PROHIBIDA SU VENTA O DISTRIBUCION SIN AUTORIZACION DE EMMANUEL VILLALVA\n"
                + "            B. PROHIBIDA LA ALTERACION DEL CONTENIDO FUENTE O DISEÑO DE LA INTERFAZ GRAFICA\n"
                + "            C. EMMANEL VILLALVA NO SE HACE RESPONSABLE DEL MAL USO DE ESTE SOFTWARE\n\n"
                + "          LOS ACUERDOS LAGALES EXPUSTOS A CONTINUACION RIGEN EL USO QUE USTED HAGA DE ESTE\n"
                + "           SOFTWARE (EMMANUEL VILLALVA) NO HACE RESPONSABLE DEL USO QUE USTED LE DE A ESTE\n"
                + "          SOFTWARE Y SUS SERVICIOS PARA ACEPTAR ESTOS TERMINOS Y CONDICIONES HAGA CLIC EN \n"
                + "          (ACEPTO) SI USTED ACEPTA ESTOS TERMINOS Y CONDICIONES, HAGA CLIC EN (NO ACEPTO ) \n"
                + "          Y NO UTILICE ESTE SOFTWARE.\n\n"
                + "          PARA MAYOR INFORMACION SOBRE NUSTROS PRODUCTOS O SERVICIOS PORFAVOR VOSITE\n"
                + "          http//:www.EmmanuelVillava.com");
        pane1 = new JScrollPane(areaterminos);
        pane1.setBounds(15, 40, 650, 300);
        add(pane1);

        checkacepto = new JCheckBox("Yo " +nombre+ " acepto");
        checkacepto.setBounds(10, 360, 200, 20);
        add(checkacepto);
        checkacepto.addActionListener(this);

        botoncontinuar = new JButton("Continuar");
        botoncontinuar.setBounds(10, 400, 100, 30);
        add(botoncontinuar);
        botoncontinuar.addActionListener(this);
        botoncontinuar.setEnabled(false);

        botonnoacepto = new JButton("No Acepto");
        botonnoacepto.setBounds(120, 400, 100, 30);
        add(botonnoacepto);
        botonnoacepto.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        //estas
        if (checkacepto.isSelected() == true) {
            botoncontinuar.setEnabled(true);
            botonnoacepto.setEnabled(false);
        } else {
            botoncontinuar.setEnabled(false);
            botonnoacepto.setEnabled(true);
        }
        //Este es el evento del boton1 que consiste en redirecionarme
        //a la interfaz principal
        if (e.getSource() == botoncontinuar) {
            Interfazprincipal ventana = new Interfazprincipal();
            ventana.setBounds(0, 0, 600, 500);
            ventana.setVisible(true);
            ventana.setResizable(false);
            ventana.setLocationRelativeTo(null);
            this.setVisible(false);
        }  if(e.getSource() == botonnoacepto) {//esta me redireccioan a al interfaz de Bienvenida
            Bienvenido ventana = new Bienvenido();
            ventana.setBounds(0, 0, 300, 400);
            ventana.setVisible(true);
            ventana.setLocationRelativeTo(null);
            ventana.setResizable(false);
            this.setVisible(false);
        }
    }

    public static void main(String args[]) {
        TerminosYcondiciones ventana = new TerminosYcondiciones();
        ventana.setBounds(0, 0, 700, 500);
        ventana.setVisible(true);
        ventana.setLocationRelativeTo(null);
        ventana.setResizable(false);

    }
}
