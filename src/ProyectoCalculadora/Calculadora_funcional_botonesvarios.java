package ProyectoCalculadora;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculadora_funcional_botonesvarios extends JFrame implements ActionListener {

    private JTextField pantalla_resultado;
    private JTextField pantalla_operaciones;
    private JButton boton_dividir, boton_potencia, boton_raiz, boton_ce, boton_multiplicar, boton_restar, boton_sumar, boton_igual, boton_punto, boton_c;
    private JButton boton_1, boton_2, boton_3, boton_4, boton_5, boton_6, boton_7, boton_8, boton_9, boton_0;

    private String cadenaNumeros="";
    private String operacion = "nula";
    private double primerNumero, resultado;
    private boolean activado = true;
    private boolean punto = true;


    //TAMAÑO y TIPO DE LETRAS
    Font estilo_boton = new Font("boton", Font.ITALIC, 20);

    public Calculadora_funcional_botonesvarios(){
        setTitle("CALCULADORA DE KEVIN");

        /**
         * -----------------------------------------------MAIN PANEL--------------------------------------------
         */

        //CREAMOS EL MAINPANEL Y ESTABLECEMOS BORDERLAYOUT
        JPanel mainpanel = new JPanel();
        mainpanel.setLayout(new BorderLayout());


        /**
         * -----------------------------------------------PANEL DE ARRIBA--------------------------------------------
         */

        //PANEL DE ARRIBA, AQUI IRA LA PANTALLA DONDE APARECERAN LOS NUMEROS SELECCIONADOS Y EL RESULTADO
        JPanel panel_arriba = new JPanel(new BorderLayout());
        panel_arriba.setBackground(new Color(161,0,68));

        panel_arriba.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));

        /**
         * -----------------------------------------------PANTALLA OPERACIONES-------------------------------------------
         */

        // PANTALLA OPERACIONES
        pantalla_operaciones = new JTextField();
        pantalla_operaciones.setHorizontalAlignment(JTextField.RIGHT); // Esto indica que al escribir texto en la pantalla, lo mostrará alineado a la derecha.
        // ESTILO DE LA PANTALLA
        pantalla_operaciones.setBackground(Color.white);
        pantalla_operaciones.setFont(new Font("letra_pantalla", Font.ITALIC, 15));
        pantalla_operaciones.setForeground(Color.black);

        // Configura el alto del JTextField (panel de pantalla_operaciones) a un valor más grande
        Dimension altura_panel_arriba = new Dimension(pantalla_operaciones.getPreferredSize().width, 30); //
        pantalla_operaciones.setPreferredSize(altura_panel_arriba);

        // Configuramos el JTextField para ocupar todo el espacio disponible en el panel_arriba
        pantalla_operaciones.setPreferredSize(new Dimension(Integer.MAX_VALUE, pantalla_operaciones.getPreferredSize().height));

        panel_arriba.add(pantalla_operaciones, BorderLayout.NORTH); // Colócalo encima de "pantalla_operaciones"


        /**
         * -----------------------------------------------PANTALLA-------------------------------------------
         */

        //PANTALLA
        pantalla_resultado = new JTextField();
        pantalla_resultado.setHorizontalAlignment(JTextField.RIGHT); //ESTO INDICA QUE AL ESCRIBIR TEXTO EN LA PANTALLA, LO MOSTRARA ALINEADO A LA DERECHA. OSEA EMPEZARA POR LA DERECHA.

        //ESTILO DE LA PANTALLA
        pantalla_resultado.setBackground(Color.white);
        pantalla_resultado.setFont(new Font("letra_pantalla", Font.ITALIC, 30));
        pantalla_resultado.setForeground(Color.black);

        // Configura el alto del JTextField (panel de pantalla) a un valor más grande
        Dimension altura_panel_arriba_dos = new Dimension(pantalla_resultado.getPreferredSize().width, 70); //
        pantalla_resultado.setPreferredSize(altura_panel_arriba_dos);

        // Configuramos el JTextField para ocupar todo el espacio disponible en el panel_arriba
        pantalla_resultado.setPreferredSize(new Dimension(Integer.MAX_VALUE, pantalla_resultado.getPreferredSize().height));

        panel_arriba.add(pantalla_resultado, BorderLayout.CENTER);


        panel_arriba.add(pantalla_resultado);

        /**
         * -----------------------------------------------PANEL DE ABAJO-------------------------------------------
         */
        //PANEL DE ABAJO, AQUI COLOCAREMOS LOS BOTONES
        JPanel panel_abajo = new JPanel();
        panel_abajo.setLayout(new GridLayout(5,4, 10, 10));
        panel_abajo.setBorder(BorderFactory.createEmptyBorder(20,10,20,10));


        /**
         * -----------------------------------------------BOTONES-------------------------------------------
         */

        //CREAMOS LOS BOTONES
        boton_dividir = new JButton("/"); panel_abajo.add(boton_dividir); boton_dividir.addActionListener(this);
        boton_potencia = new JButton("x²"); panel_abajo.add(boton_potencia); boton_potencia.addActionListener(this);
        boton_raiz = new JButton("√"); panel_abajo.add(boton_raiz); boton_raiz.addActionListener(this);
        boton_ce = new JButton("CE"); panel_abajo.add(boton_ce); boton_ce.addActionListener(this);

        boton_multiplicar = new JButton("x"); panel_abajo.add(boton_multiplicar); boton_multiplicar.addActionListener(this);
        boton_7 = new JButton("7"); panel_abajo.add(boton_7); boton_7.addActionListener(this);
        boton_8 = new JButton("8"); panel_abajo.add(boton_8); boton_8.addActionListener(this);
        boton_9 = new JButton("9"); panel_abajo.add(boton_9); boton_9.addActionListener(this);

        boton_restar = new JButton("-"); panel_abajo.add(boton_restar); boton_restar.addActionListener(this);
        boton_4 = new JButton("4"); panel_abajo.add(boton_4); boton_4.addActionListener(this);
        boton_5 = new JButton("5"); panel_abajo.add(boton_5); boton_5.addActionListener(this);
        boton_6 = new JButton("6"); panel_abajo.add(boton_6); boton_6.addActionListener(this);

        boton_sumar = new JButton("+"); panel_abajo.add(boton_sumar); boton_sumar.addActionListener(this);
        boton_1 = new JButton("1"); panel_abajo.add(boton_1); boton_1.addActionListener(this);
        boton_2 = new JButton("2"); panel_abajo.add(boton_2); boton_2.addActionListener(this);
        boton_3 = new JButton("3"); panel_abajo.add(boton_3); boton_3.addActionListener(this);

        boton_igual = new JButton("="); panel_abajo.add(boton_igual); boton_igual.addActionListener(this);
        boton_0 = new JButton("0"); panel_abajo.add(boton_0); boton_0.addActionListener(this);
        boton_punto = new JButton("."); panel_abajo.add(boton_punto); boton_punto.addActionListener(this);
        boton_c = new JButton("C"); panel_abajo.add(boton_c); boton_c.addActionListener(this);

        //LES DISEÑAMOS EL ESTILO A LOS BOTONES

        //DISEÑO BOTONES DE OPERACIONES
        boton_dividir.setBackground( new Color(0,39,131)); boton_dividir.setForeground(Color.white); boton_dividir.setFont(estilo_boton);
        boton_potencia.setBackground(new Color(0,39,131)); boton_potencia.setForeground(Color.white); boton_potencia.setFont(estilo_boton);
        boton_raiz.setBackground(new Color(0,39,131)); boton_raiz.setForeground(Color.white); boton_raiz.setFont(estilo_boton);
        boton_ce.setBackground(new Color(0,39,131)); boton_ce.setForeground(Color.white); boton_ce.setFont(estilo_boton);
        boton_multiplicar.setBackground(new Color(0,39,131)); boton_multiplicar.setForeground(Color.white); boton_multiplicar.setFont(estilo_boton);
        boton_restar.setBackground(new Color(0,39,131)); boton_restar.setForeground(Color.white); boton_restar.setFont(estilo_boton);
        boton_sumar.setBackground(new Color(0,39,131)); boton_sumar.setForeground(Color.white); boton_sumar.setFont(estilo_boton);

        //DISEÑO BOTONES NUMEROS
        boton_0.setBackground(Color.white); boton_0.setForeground(new Color(0,39,131));; boton_0.setFont(estilo_boton);
        boton_1.setBackground(Color.white); boton_1.setForeground(new Color(0,39,131));; boton_1.setFont(estilo_boton);
        boton_2.setBackground(Color.white); boton_2.setForeground(new Color(0,39,131));; boton_2.setFont(estilo_boton);
        boton_3.setBackground(Color.white); boton_3.setForeground(new Color(0,39,131));; boton_3.setFont(estilo_boton);
        boton_4.setBackground(Color.white); boton_4.setForeground(new Color(0,39,131));; boton_4.setFont(estilo_boton);
        boton_5.setBackground(Color.white); boton_5.setForeground(new Color(0,39,131));; boton_5.setFont(estilo_boton);
        boton_6.setBackground(Color.white); boton_6.setForeground(new Color(0,39,131));; boton_6.setFont(estilo_boton);
        boton_7.setBackground(Color.white); boton_7.setForeground(new Color(0,39,131));; boton_7.setFont(estilo_boton);
        boton_8.setBackground(Color.white); boton_8.setForeground(new Color(0,39,131));; boton_8.setFont(estilo_boton);
        boton_9.setBackground(Color.white); boton_9.setForeground(new Color(0,39,131));; boton_9.setFont(estilo_boton);
        boton_c.setBackground(Color.white); boton_c.setForeground(new Color(0,39,131));; boton_c.setFont(estilo_boton);
        boton_punto.setBackground(Color.white); boton_punto.setForeground(new Color(0,39,131));; boton_punto.setFont(estilo_boton);

        //DISEÑO BOTON RESULTADO

        boton_igual.setBackground(new Color(161,0,68)); boton_igual.setForeground(Color.white); boton_igual.setFont(estilo_boton);





        /**
         * -----------------------------------------------AÑADIMOS EL CONTENIDO AL MAIN PANEL-------------------------------------------
         * -----------------------------------------------Y EL MAINPANEL AL JFRAME-------------------------------------------
         */
        mainpanel.add(panel_arriba,BorderLayout.NORTH);
        mainpanel.add(panel_abajo,BorderLayout.CENTER);
        add(mainpanel);
    }

    public void actionPerformed(ActionEvent evento_pulsar) {

        //BOTONES DE LOS NUMEROS
        if (evento_pulsar.getSource() == boton_0) {
            if (pantalla_resultado.getText().equals("0")){
                cadenaNumeros = "0";
            }
            else {
                cadenaNumeros +="0";
            }
            pantalla_resultado.setText(cadenaNumeros);
            activado=true;
            punto = true;
        }

        else if (evento_pulsar.getSource() == boton_1) { if (pantalla_resultado.getText().equals("1")){cadenaNumeros = "1"; }
        else {cadenaNumeros +="1";} pantalla_resultado.setText(cadenaNumeros);activado=true;}
        else if (evento_pulsar.getSource() == boton_2) { if (pantalla_resultado.getText().equals("2")){cadenaNumeros = "2"; }
        else {cadenaNumeros +="2";} pantalla_resultado.setText(cadenaNumeros);activado=true;}
        else if (evento_pulsar.getSource() == boton_3) { if (pantalla_resultado.getText().equals("3")){cadenaNumeros = "3"; }
        else {cadenaNumeros +="3";} pantalla_resultado.setText(cadenaNumeros);activado=true;}
        else if (evento_pulsar.getSource() == boton_4) { if (pantalla_resultado.getText().equals("4")){cadenaNumeros = "4"; }
        else {cadenaNumeros +="4";} pantalla_resultado.setText(cadenaNumeros);activado=true;}
        else if (evento_pulsar.getSource() == boton_5) { if (pantalla_resultado.getText().equals("5")){cadenaNumeros = "5"; }
        else {cadenaNumeros +="5";} pantalla_resultado.setText(cadenaNumeros);activado=true;}
        else if (evento_pulsar.getSource() == boton_6) { if (pantalla_resultado.getText().equals("6")){cadenaNumeros = "6"; }
        else {cadenaNumeros +="6";} pantalla_resultado.setText(cadenaNumeros);activado=true;}
        else if (evento_pulsar.getSource() == boton_7) { if (pantalla_resultado.getText().equals("7")){cadenaNumeros = "7"; }
        else {cadenaNumeros +="7";} pantalla_resultado.setText(cadenaNumeros);activado=true;}
        else if (evento_pulsar.getSource() == boton_8) { if (pantalla_resultado.getText().equals("8")){cadenaNumeros = "8"; }
        else {cadenaNumeros +="8";} pantalla_resultado.setText(cadenaNumeros);activado=true;}
        else if (evento_pulsar.getSource() == boton_9) { if (pantalla_resultado.getText().equals("9")){cadenaNumeros = "9"; }
        else {cadenaNumeros +="9";} pantalla_resultado.setText(cadenaNumeros);activado=true;}

        //OPERACION DE SUMAR

        if (evento_pulsar.getSource() == boton_sumar) {
            if (activado == true){
                primerNumero = Double.parseDouble(cadenaNumeros);
                pantalla_operaciones.setText(cadenaNumeros+ " + ");
                cadenaNumeros = "";
                operacion = "sumar";
                activado = false;
            }
        }

        //OPERACION RESTAR

        if (evento_pulsar.getSource() == boton_restar) {
            if (activado == true){
                primerNumero = Double.parseDouble(cadenaNumeros);
                pantalla_operaciones.setText(cadenaNumeros+ " - ");
                cadenaNumeros = "";
                operacion = "restar";

                activado = false;
            }
        }

        //OPERACION MULITPLICAR

        if (evento_pulsar.getSource() == boton_multiplicar) {
            if (activado == true){
                primerNumero = Double.parseDouble(cadenaNumeros);
                pantalla_operaciones.setText(cadenaNumeros+ " x ");
                cadenaNumeros = "";
                operacion = "multiplicar";

                activado = false;
            }
        }

        //OPERACION DIVIDIR

        if (evento_pulsar.getSource() == boton_dividir) {
            if (activado == true){
                primerNumero = Double.parseDouble(cadenaNumeros);
                pantalla_operaciones.setText(cadenaNumeros+ " / ");
                cadenaNumeros = "";
                operacion = "dividir";

                activado = false;
            }
        }

        // PUNTOS Y BORRAR

        if (evento_pulsar.getSource() == boton_punto) {
            if (punto == true){
                if (cadenaNumeros.equals("")){
                    cadenaNumeros = "0.";
                }
                else {
                    cadenaNumeros += ".";
                }
            }
            pantalla_resultado.setText(cadenaNumeros);
            punto = false;
        }

        if (evento_pulsar.getSource() == boton_c) {
            pantalla_operaciones.setText("");
            pantalla_resultado.setText("");
            operacion = "nula";
            cadenaNumeros = "";
            activado = true;
            punto = true;
        }

        if (evento_pulsar.getSource() == boton_ce) {
            int tamaño = cadenaNumeros.length();
            if (tamaño > 0){
                if (tamaño == 1){
                    cadenaNumeros = "0";
                }
                else {
                    cadenaNumeros = cadenaNumeros.substring(0,cadenaNumeros.length()-1);
                }
                pantalla_resultado.setText(cadenaNumeros);
            }
        }

        //OPERACION RAIZ

        if (evento_pulsar.getSource() == boton_raiz) {
            primerNumero = Double.parseDouble(cadenaNumeros);
            pantalla_operaciones.setText("sqrt("+cadenaNumeros+")");
            resultado = Math.sqrt(primerNumero);
            pantalla_resultado.setText(String.valueOf(resultado));
            cadenaNumeros = String.valueOf(resultado);
            punto = true;
        }

        if (evento_pulsar.getSource() == boton_potencia) {
            primerNumero = Double.parseDouble(cadenaNumeros);
            pantalla_operaciones.setText("sqr("+cadenaNumeros+")");
            resultado = Math.pow(primerNumero,2);
            pantalla_resultado.setText(String.valueOf(resultado));
            cadenaNumeros = String.valueOf(resultado);
            punto = true;
        }

        //OPERACION RESULTADOS
        if (evento_pulsar.getSource() == boton_igual) {
            double segundoNumero;
            if (operacion.equals("nula")){
                pantalla_resultado.setText(cadenaNumeros);
            }

            else if (operacion.equals("sumar")) {
                segundoNumero = Double.parseDouble(cadenaNumeros);
                resultado = primerNumero + segundoNumero;
                pantalla_resultado.setText(String.valueOf(resultado));
                cadenaNumeros = String.valueOf(resultado);
                operacion = "nula";
            }

            else if (operacion.equals("restar")) {
                segundoNumero = Double.parseDouble(cadenaNumeros);
                resultado = primerNumero - segundoNumero;
                pantalla_resultado.setText(String.valueOf(resultado));
                cadenaNumeros = String.valueOf(resultado);
                operacion = "nula";
            }

            else if (operacion.equals("multiplicar")) {
                segundoNumero = Double.parseDouble(cadenaNumeros);
                resultado = primerNumero * segundoNumero;
                pantalla_resultado.setText(String.valueOf(resultado));
                cadenaNumeros = String.valueOf(resultado);
                operacion = "nula";
            }

            else if (operacion.equals("dividir")) {
                segundoNumero = Double.parseDouble(cadenaNumeros);

                if (segundoNumero == 0){
                    pantalla_resultado.setText("No se puede dividir entre 0");
                }

                else {
                    resultado = primerNumero / segundoNumero;
                    pantalla_resultado.setText(String.valueOf(resultado));
                    cadenaNumeros = String.valueOf(resultado);
                    operacion = "nula";
                }


            }

            pantalla_operaciones.setText("");
            activado = true;
            punto = false;
        }





    }




    public static void main(String[] args) {
        Calculadora_funcional_botonesvarios calculadora_funciona= new Calculadora_funcional_botonesvarios();
        calculadora_funciona.setBounds(0, 0, 400, 500);
        calculadora_funciona.setVisible(true);
        calculadora_funciona.setLocationRelativeTo(null); // Centrar la ventana en la pantalla
        calculadora_funciona.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}

/**
 *
 * String[] botones = {
 *                 "÷", "%", "√", "x²",
 *                 "x", "7", "8", "9",
 *                 "+", "4", "5", "6",
 *                 "-", "1", "2", "3",
 *                 "=", "0", ".", "C",
 *         };
 *
 *         for (String boton_string : botones){
 *             boton = new JButton(boton_string);
 *
 *             // Agregar un ActionListener al botón actual
 *             boton.addActionListener(e -> {
 *                 // Obtener la etiqueta del botón presionado
 *                 String etiquetaBoton = ((JButton) e.getSource()).getText();
 *
 *                 // Realizar alguna acción basada en la etiqueta del botón
 *                 if (etiquetaBoton.equals("5")) {
 *                     // Código a ejecutar cuando se presiona el botón "5"
 *                     // Por ejemplo, puedes mostrar "5" en la pantalla
 *                     pantalla.setText(this.pantalla.getText()+"5");
 *
 *                 } else if (etiquetaBoton.equals("=")) {
 *                     // Código a ejecutar cuando se presiona el botón "="
 *                     // Por ejemplo, puedes realizar una operación de cálculo
 *                     // aquí o mostrar el resultado en la pantalla
 *                 }
 *                 // Agrega más condiciones para otros botones según lo que quieras hacer
 *
 *                 // ...
 *             });
 *             panel_abajo.add(boton);
 *         }
 *
 *
 */


