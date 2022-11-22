package video44;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.*;
import video41_42.Bienvenido;

public class Interfazprincipal extends JFrame implements ActionListener {

    private JLabel labelimagencoca, labelbienvenido, labeldatos, labelnombre, labeldepartamento, labelapellidoP, labelantiguedad, labelapellidoM;
    private JLabel labelcalculo, label10;
    private JTextField fieldnombre, fieldapellidoP, fieldapellidoM;
    private JComboBox combodepartamento, comboantiguedad;
    private JTextArea arearesultado;
    private JMenuBar bar1;
    private JMenu menuopciones, colorfondo, menuacercade;
    private JMenuItem itemcreador, itemrojo, itemmorado, itemnegro, itemsalir;
    private JButton botoncalcular, botonlimpiar;
    String nombre;

    public Interfazprincipal() {
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        setTitle("Pantalla Principal");

        setIconImage(new ImageIcon(getClass().getResource("images/icon.png")).getImage());

        //Tenenos que declarar un objeto del tipo de la clase de donde deseamos llamar a
        //a la variable que queremos ocuapar en esta clase, y despues alojarla en una 
        //variable del mismo tipo
        Bienvenido recuperar = new Bienvenido();
        nombre = recuperar.texto;

        getContentPane().setBackground(Color.red);

        bar1 = new JMenuBar();
        bar1.setBackground(Color.red);       
        setJMenuBar(bar1);

        menuopciones = new JMenu("Opciones");
        menuopciones.setForeground(Color.white);
        bar1.add(menuopciones);

        colorfondo = new JMenu("Color de fondo");
        menuopciones.add(colorfondo);

        itemrojo = new JMenuItem("Rojo");
        colorfondo.add(itemrojo);
        itemrojo.addActionListener(this);

        itemmorado = new JMenuItem("morado");
        colorfondo.add(itemmorado);
        itemmorado.addActionListener(this);

        itemnegro = new JMenuItem("Negro");
        itemnegro.addActionListener(this);
        colorfondo.add(itemnegro);

        itemsalir = new JMenuItem("Salir");
        itemsalir.addActionListener(this);
        menuopciones.add(itemsalir);

        menuacercade = new JMenu("Acerca de");
        menuacercade.setForeground(Color.white);
        bar1.add(menuacercade);

        itemcreador = new JMenuItem("Creador");      
        itemcreador.addActionListener(this);
        menuacercade.add(itemcreador);

        ImageIcon imagen = new ImageIcon(getClass().getResource("images/logo-coca.png"));
        labelimagencoca = new JLabel(imagen);
        labelimagencoca.setBounds(10, 10, 230, 80);
        add(labelimagencoca);

        labelbienvenido = new JLabel("Bienvenido " + nombre);
        labelbienvenido.setBounds(280, 40, 300, 30);
        labelbienvenido.setFont(new Font("", 1, 24));
        labelbienvenido.setForeground(Color.white);
        add(labelbienvenido);

        labeldatos = new JLabel("Datos del trabajador para el calculo de vacaciones");
        labeldatos.setBounds(30, 120, 450, 30);
        labeldatos.setFont(new Font("Andale Mono", 0, 19));
        labeldatos.setForeground(Color.white);
        add(labeldatos);

        labelnombre = new JLabel("Nombre:");
        labelnombre.setBounds(20, 180, 100, 20);
        labelnombre.setForeground(Color.white);
        labelnombre.setFont(new Font("", 1, 11));
        add(labelnombre);

        labeldepartamento = new JLabel("Seleciona el departamento:");
        labeldepartamento.setBounds(200, 180, 150, 20);
        labeldepartamento.setFont(new Font("", 1, 11));
        labeldepartamento.setForeground(Color.white);
        add(labeldepartamento);

        fieldnombre = new JTextField();
        fieldnombre.setBounds(20, 200, 150, 20);
        fieldnombre.setFont(new Font("", 1, 12));
        fieldnombre.setForeground(Color.red);
        fieldnombre.setBackground(new Color(224, 224, 244));
        add(fieldnombre);

        combodepartamento = new JComboBox();
        combodepartamento.setBounds(200, 200, 190, 20);
        combodepartamento.setFont(new Font("", 1, 12));
        combodepartamento.setForeground(Color.red);
        combodepartamento.addItem("");
        combodepartamento.addItem("Atencion a clientes");
        combodepartamento.addItem("Logistica");
        combodepartamento.addItem("Gerencia");
        add(combodepartamento);

        labelapellidoP = new JLabel("Apellido Paterno:");
        labelapellidoP.setBounds(20, 240, 150, 20);
        labelapellidoP.setFont(new Font("", 1, 11));
        labelapellidoP.setForeground(Color.white);
        add(labelapellidoP);

        labelantiguedad = new JLabel("Selecciona la antiguedad:");
        labelantiguedad.setBounds(200, 240, 150, 20);
        labelantiguedad.setForeground(Color.white);
        labelantiguedad.setFont(new Font("", 1, 11));
        add(labelantiguedad);

        fieldapellidoP = new JTextField();
        fieldapellidoP.setBounds(20, 260, 150, 20);
        fieldapellidoP.setFont(new Font("", 1, 12));
        fieldapellidoP.setBackground(new Color(224, 224, 224));
        fieldapellidoP.setForeground(Color.red);
        add(fieldapellidoP);

        comboantiguedad = new JComboBox();
        comboantiguedad.setBounds(200, 260, 190, 20);
        comboantiguedad.setFont(new Font("", 1, 12));
        comboantiguedad.setForeground(Color.red);
        comboantiguedad.addItem("");
        comboantiguedad.addItem("1 Año de servicio");
        comboantiguedad.addItem("2 a 6 Años de servicio");
        comboantiguedad.addItem("7 o mas Años de servicio");
        add(comboantiguedad);

        labelapellidoM = new JLabel("Apellido Materno");
        labelapellidoM.setBounds(20, 300, 150, 20);
        labelapellidoM.setFont(new Font("", 1, 11));
        labelapellidoM.setForeground(Color.white);
        add(labelapellidoM);

        labelcalculo = new JLabel("Resutado de calculo");
        labelcalculo.setBounds(200, 300, 150, 20);
        labelcalculo.setForeground(Color.white);
        labelcalculo.setFont(new Font("", 1, 11));
        add(labelcalculo);

        fieldapellidoM = new JTextField();
        fieldapellidoM.setBounds(20, 320, 150, 20);
        fieldapellidoM.setBackground(new Color(224, 224, 224));
        fieldapellidoM.setFont(new Font("", 1, 12));
        fieldapellidoM.setForeground(Color.red);
        add(fieldapellidoM);

        arearesultado = new JTextArea("\n    Aqui aparecera el resultado de tus Vacaciones ");
        arearesultado.setBounds(200, 320, 350, 80);
        arearesultado.setFont(new Font("", 1, 12));
        arearesultado.setForeground(Color.red);
        arearesultado.setBackground(new Color(224, 224, 224));
        add(arearesultado);

        botoncalcular = new JButton("Calcular");
        botoncalcular.setBounds(420, 260, 90, 20);
        botoncalcular.setForeground(Color.red);
        botoncalcular.setBackground(Color.GREEN);
        botoncalcular.addActionListener(this);
        add(botoncalcular);

        botonlimpiar = new JButton("Limpiar");
        botonlimpiar.setBounds(420, 200, 90, 20);
        botonlimpiar.setForeground(Color.red);
        botonlimpiar.setBackground(Color.white);
        botonlimpiar.addActionListener(this);
        add(botonlimpiar);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String departamento = combodepartamento.getSelectedItem().toString();
        String antiguedad = comboantiguedad.getSelectedItem().toString();
        String apellidoP = fieldapellidoP.getText();
        String apellidoM = fieldapellidoM.getText();
        String nombre = fieldnombre.getText();

        //Dentro de este if dode se programa el evento del boton Calcualr, agregamos 
        //otro if con su else, para poner la condiciones que compararan que los campos 
        //esten llenos y encaso de que no mandar uun mensaje con un JOptionPane.
        if (e.getSource() == botoncalcular) {

            //Este if es el compara que todos los campos sean llenados con algun texto
            //ya que si se ciumple no permitira continuar el programa mandando un mensaje en pantalla
            if (nombre.equalsIgnoreCase("") || apellidoP.equalsIgnoreCase("")
                    || antiguedad.equalsIgnoreCase("") || apellidoM.equalsIgnoreCase("")
                    || departamento.equalsIgnoreCase("")) {

                JOptionPane.showMessageDialog(null, "Debes de llenar todos los campos");

            } else {
                if (departamento.equalsIgnoreCase("Atencion a clientes")) {

                    if (antiguedad.equalsIgnoreCase("1 año de servicio")) {
                        arearesultado.setText("\n  El trabajador " + fieldnombre.getText() + " del departamento de \n  "
                                + departamento + " con " + antiguedad + "\n  tiene derecho a 6 dias de vacaiones");
                    }
                    if (antiguedad.equalsIgnoreCase("2 a 6 años de servicio")) {
                        arearesultado.setText("\n  El trabajador " + fieldnombre.getText() + " del departamento de \n  "
                                + departamento + " con " + antiguedad + "\n  tiene derecho a 9 dias de vacaiones");
                    }
                    if (antiguedad.equalsIgnoreCase("7 o mas años de servicio")) {
                        arearesultado.setText("\n  El trabajador " + fieldnombre.getText() + " del departamento de \n  "
                                + departamento + " con " + antiguedad + "\n  tiene derecho a 14 dias de vacaiones");
                    }
                }

                if (departamento.equalsIgnoreCase("logistica")) {

                    if (antiguedad.equalsIgnoreCase("1 año de servicio")) {
                        arearesultado.setText("\n  El trabajador " + fieldnombre.getText() + " del departamento de \n  "
                                + departamento + " con " + antiguedad + "\n  tiene derecho a 7 dias de vacaiones");
                    }
                    if (antiguedad.equalsIgnoreCase("2 a 6 años de servicio")) {
                        arearesultado.setText("\n  El trabajador " + fieldnombre.getText() + " del departamento de \n  "
                                + departamento + " con " + antiguedad + "\n  tiene derecho a 11 dias de vacaiones");
                    }
                    if (antiguedad.equalsIgnoreCase("7 o mas años de servicio")) {
                        arearesultado.setText("\n  El trabajador " + fieldnombre.getText() + " del departamento de \n  "
                                + departamento + " con " + antiguedad + "\n  tiene derecho a 18 dias de vacaiones");
                    }
                }
                if (departamento.equalsIgnoreCase("Gerencia")) {

                    if (antiguedad.equalsIgnoreCase("1 año de servicio")) {
                        arearesultado.setText("\n  El trabajador " + fieldnombre.getText() + " del departamento de \n  "
                                + departamento + " con " + antiguedad + "\n  tiene derecho a 10 dias de vacaiones");
                    }
                    if (antiguedad.equalsIgnoreCase("2 a 6 años de servicio")) {
                        arearesultado.setText("\n  El trabajador " + fieldnombre.getText() + " del departamento de \n  "
                                + departamento + " con " + antiguedad + "\n  tiene derecho a 20 dias de vacaiones");
                    }
                    if (antiguedad.equalsIgnoreCase("7 o mas años de servicio")) {
                        arearesultado.setText("\n  El trabajador " + fieldnombre.getText() + " del departamento de \n  "
                                + departamento + " con " + antiguedad + "\n  tiene derecho a 30 dias de vacaiones");
                    }
                }
            }
        }
        //Aqui generamos en vento del boton limpiar que consiste en establecerle un texto en blaco
        //a todos los campos con su devido metodo.
        if (e.getSource() == botonlimpiar) {
            fieldnombre.setText("");
            fieldapellidoP.setText("");
            fieldapellidoM.setText("");
            combodepartamento.setSelectedIndex(0);
            comboantiguedad.setSelectedItem("");
            arearesultado.setText("\n    Aqui aparecera el resultado de tus Vacaciones ");

        }

        Container fondo = this.getContentPane();

        if (e.getSource() == itemrojo) {
            fondo.setBackground(Color.red);
        }
        if (e.getSource() == itemmorado) {
            fondo.setBackground(new Color(51, 0, 51));
        }
        if (e.getSource() == itemnegro) {
            fondo.setBackground(Color.black);
        }
        if (e.getSource() == itemsalir) {
            Bienvenido ventana = new Bienvenido();
            ventana.setBounds(0, 0, 300, 400);
            ventana.setVisible(true);
            ventana.setLocationRelativeTo(null);
            ventana.setResizable(false);
            this.setVisible(false);
        }
        if (e.getSource() == itemcreador) {
            JOptionPane.showMessageDialog(null, "El creador de este SoftWare\n  Emmanuel Villalva Perez");
        }
    }

    public static void main(String args[]) {
        Interfazprincipal ventana = new Interfazprincipal();
        ventana.setBounds(0, 0, 600, 500);
        ventana.setVisible(true);
        ventana.setResizable(false);
        ventana.setLocationRelativeTo(null);
    }
}
