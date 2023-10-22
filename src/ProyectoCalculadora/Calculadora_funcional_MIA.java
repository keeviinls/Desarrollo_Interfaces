package ProyectoCalculadora;

import javax.swing.*;
import java.awt.*;

public class Calculadora_funcional_MIA extends JFrame {

    private JTextField pantalla_resultado;
    private JTextField pantalla_operaciones;
    private JButton boton;

    private String cadenaNumeros="";
    private String operacion = "nula";
    private double primerNumero, resultado;
    private boolean activado = true;
    private boolean punto = true;

    //TAMAÑO y TIPO DE LETRAS
    Font estilo_boton = new Font("boton", Font.ITALIC, 20);

    public Calculadora_funcional_MIA(){
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
        panel_arriba.setBackground(new Color(3,41,64));
        panel_arriba.setBorder(BorderFactory.createEmptyBorder(20,10,10,10));

        /**
         * -----------------------------------------------PANTALLA OPERACIONES-------------------------------------------
         */

        // PANTALLA OPERACIONES
        pantalla_operaciones = new JTextField();
        pantalla_operaciones.setHorizontalAlignment(JTextField.RIGHT); // Esto indica que al escribir texto en la pantalla, lo mostrará alineado a la derecha.
        // ESTILO DE LA PANTALLA
        pantalla_operaciones.setBackground(new Color(253,223,185));
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
        pantalla_resultado = new JTextField("0");
        pantalla_resultado.setHorizontalAlignment(JTextField.RIGHT); //ESTO INDICA QUE AL ESCRIBIR TEXTO EN LA PANTALLA, LO MOSTRARA ALINEADO A LA DERECHA. OSEA EMPEZARA POR LA DERECHA.

        //ESTILO DE LA PANTALLA
        pantalla_resultado.setBackground(new Color(253,223,185));
        pantalla_resultado.setFont(new Font("letra_pantalla", Font.ITALIC, 30));
        pantalla_resultado.setForeground(Color.black);

        // Configura el alto del JTextField (panel de pantalla) a un valor más grande
        Dimension altura_panel_arriba_dos = new Dimension(pantalla_resultado.getPreferredSize().width, 70); //
        pantalla_resultado.setPreferredSize(altura_panel_arriba_dos);

        // Configuramos el JTextField para ocupar todo el espacio disponible en el panel_arriba
        pantalla_resultado.setPreferredSize(new Dimension(Integer.MAX_VALUE, pantalla_resultado.getPreferredSize().height));

        panel_arriba.add(pantalla_resultado, BorderLayout.CENTER);



        /**
         * -----------------------------------------------PANEL DE ABAJO-------------------------------------------
         */
        //PANEL DE ABAJO, AQUI COLOCAREMOS LOS BOTONES
        JPanel panel_abajo = new JPanel();
        panel_abajo.setBackground(new Color(3,41,64));
        panel_abajo.setLayout(new GridLayout(5,4, 10, 10));
        panel_abajo.setBorder(BorderFactory.createEmptyBorder(20,10,20,10));



        /**
         * -----------------------------------------------BOTONES-------------------------------------------
         */

        String[] botones = {
                "/", "x²", "√", "CE",
                "x", "7", "8", "9",
                "-", "4", "5", "6",
                "+", "1", "2", "3",
                "=", "0", ".", "C",
        };

        for (String boton_string : botones){
            boton = new JButton(boton_string);
            // Agregar un ActionListener al botón actual
            boton.addActionListener(e -> {
                // Obtener la etiqueta del botón presionado
                String etiquetaBoton = ((JButton) e.getSource()).getText();

                //BOTONES NUMEROS

                if (etiquetaBoton.equals("0")) {
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

                if (etiquetaBoton.equals("1")) { if (pantalla_resultado.getText().equals("0")){cadenaNumeros = "1"; } else {cadenaNumeros +="1";}
                    pantalla_resultado.setText(cadenaNumeros);activado=true;}
                if (etiquetaBoton.equals("2")) { if (pantalla_resultado.getText().equals("0")){cadenaNumeros = "2"; } else {cadenaNumeros +="2";}
                    pantalla_resultado.setText(cadenaNumeros);activado=true;}
                if (etiquetaBoton.equals("3")) { if (pantalla_resultado.getText().equals("0")){cadenaNumeros = "3"; } else {cadenaNumeros +="3";}
                    pantalla_resultado.setText(cadenaNumeros);activado=true;}
                if (etiquetaBoton.equals("4")) { if (pantalla_resultado.getText().equals("0")){cadenaNumeros = "4"; } else {cadenaNumeros +="4";}
                    pantalla_resultado.setText(cadenaNumeros);activado=true;}
                if (etiquetaBoton.equals("5")) { if (pantalla_resultado.getText().equals("0")){cadenaNumeros = "5"; } else {cadenaNumeros +="5";}
                    pantalla_resultado.setText(cadenaNumeros);activado=true;}
                if (etiquetaBoton.equals("6")) { if (pantalla_resultado.getText().equals("0")){cadenaNumeros = "6"; } else {cadenaNumeros +="6";}
                    pantalla_resultado.setText(cadenaNumeros);activado=true;}
                if (etiquetaBoton.equals("7")) { if (pantalla_resultado.getText().equals("0")){cadenaNumeros = "7"; } else {cadenaNumeros +="7";}
                    pantalla_resultado.setText(cadenaNumeros);activado=true;}
                if (etiquetaBoton.equals("8")) { if (pantalla_resultado.getText().equals("0")){cadenaNumeros = "8"; } else {cadenaNumeros +="8";}
                    pantalla_resultado.setText(cadenaNumeros);activado=true;}
                if (etiquetaBoton.equals("9")) { if (pantalla_resultado.getText().equals("0")){cadenaNumeros = "9"; } else {cadenaNumeros +="9";}
                    pantalla_resultado.setText(cadenaNumeros);activado=true;}


            //OPERACION SUMAR
                if (etiquetaBoton.equals("+")) {
                    if (activado == true){
                        primerNumero = Double.parseDouble(cadenaNumeros);
                        pantalla_operaciones.setText(cadenaNumeros+ " + ");
                        cadenaNumeros = "";
                        operacion = "sumar";
                        activado = false;
                    }
                }


                //OPERACION RESTAR
                if (etiquetaBoton.equals("-")) {
                    if (activado == true){
                        primerNumero = Double.parseDouble(cadenaNumeros);
                        pantalla_operaciones.setText(cadenaNumeros+ " - ");
                        cadenaNumeros = "";
                        operacion = "restar";

                        activado = false;
                    }
                }

                //OPERACION MULTIPLICAR
                if (etiquetaBoton.equals("x")) {
                    if (activado == true){
                        primerNumero = Double.parseDouble(cadenaNumeros);
                        pantalla_operaciones.setText(cadenaNumeros+ " x ");
                        cadenaNumeros = "";
                        operacion = "multiplicar";

                        activado = false;
                    }
                }

                //OPERACION DIVIDIR
                if (etiquetaBoton.equals("/")) {
                    if (activado == true){
                        primerNumero = Double.parseDouble(cadenaNumeros);
                        pantalla_operaciones.setText(cadenaNumeros+ " / ");
                        cadenaNumeros = "";
                        operacion = "dividir";

                        activado = false;
                    }
                }

                //PUNTO
                if (etiquetaBoton.equals(".")){
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

                //OPERACION RAIZ
                if (etiquetaBoton.equals("√")) {

                        primerNumero = Double.parseDouble(cadenaNumeros);
                        pantalla_operaciones.setText("sqrt("+cadenaNumeros+")");
                        resultado = Math.sqrt(primerNumero);
                        pantalla_resultado.setText(String.valueOf(resultado));
                        cadenaNumeros = String.valueOf(resultado);
                    punto = true;

                }

                //OPERACION POTENCIA
                if (etiquetaBoton.equals("x²")) {

                    primerNumero = Double.parseDouble(cadenaNumeros);
                    pantalla_operaciones.setText("sqr("+cadenaNumeros+")");
                    resultado = Math.pow(primerNumero,2);
                    pantalla_resultado.setText(String.valueOf(resultado));
                    cadenaNumeros = String.valueOf(resultado);
                    punto = true;

                }


                //OPERACION RESULTADO
                if (etiquetaBoton.equals("=")) {
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


            // BOTONES BORRAR

                //BOTON C
                if (etiquetaBoton.equals("C")) {
                    pantalla_operaciones.setText("");
                    pantalla_resultado.setText("");
                    operacion = "nula";
                    cadenaNumeros = "";
                    activado = true;
                    punto = true;
                }

                //BOTON CE
                if (etiquetaBoton.equals("CE")) {
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


                });

            //BUCLE PARA CREAR LOS BOTONES Y NO HACERLOS DE 1 EN 1
                // Configura el color de fondo de los botones 5, 6 y 7 a rojo
                if (boton_string.equals("/") || boton_string.equals("CE") || boton_string.equals("√") ||
                        boton_string.equals("x") || boton_string.equals("+") || boton_string.equals("-")
                        || boton_string.equals("x²") ) {
                    boton.setBackground(new Color(49,127,146));
                    boton.setForeground(Color.white);

                }

                // Configura el color de fondo de los botones 1, 2 y 3 a amarillo
                else if (boton_string.equals("=")) {
                    boton.setBackground(new Color(125,27,59));
                    boton.setForeground(Color.white);

                }

                else {
                    boton.setBackground(Color.white);
                    boton.setForeground(new Color(3,41,64));

                }

                boton.setFont(estilo_boton);

            panel_abajo.add(boton);
        }




        /**
         * -----------------------------------------------AÑADIMOS EL CONTENIDO AL MAIN PANEL-------------------------------------------
         * -----------------------------------------------Y EL MAINPANEL AL JFRAME-------------------------------------------
         */
        mainpanel.add(panel_arriba,BorderLayout.NORTH);
        mainpanel.add(panel_abajo,BorderLayout.CENTER);
        add(mainpanel);


    }





    public static void main(String[] args) {
        Calculadora_funcional_MIA calculadora_funciona= new Calculadora_funcional_MIA();
        calculadora_funciona.setBounds(0, 0, 320, 500);
        calculadora_funciona.setVisible(true);
        calculadora_funciona.setLocationRelativeTo(null); // Centrar la ventana en la pantalla
        calculadora_funciona.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}


/* else if (etiquetaBoton.equals("1")) { pantalla.setText(this.pantalla.getText()+"1");}    else if (etiquetaBoton.equals("2")) { pantalla.setText(this.pantalla.getText()+"2");}      else if (etiquetaBoton.equals("3")) { pantalla.setText(this.pantalla.getText()+"3");}
                else if (etiquetaBoton.equals("4")) { pantalla.setText(this.pantalla.getText()+"4");}   else if (etiquetaBoton.equals("5")) { pantalla.setText(this.pantalla.getText()+"5");}    else if (etiquetaBoton.equals("6")) { pantalla.setText(this.pantalla.getText()+"6");}
                else if (etiquetaBoton.equals("7")) { pantalla.setText(this.pantalla.getText()+"7");}   else if (etiquetaBoton.equals("8")) { pantalla.setText(this.pantalla.getText()+"8");}    else if (etiquetaBoton.equals("9")) { pantalla.setText(this.pantalla.getText()+"9");}
*/