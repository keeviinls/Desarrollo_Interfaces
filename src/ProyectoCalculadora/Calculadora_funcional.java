package ProyectoCalculadora;

import Eventos.Ejercicio_InterfaceSeleccion;

import javax.swing.*;
import java.awt.*;

public class Calculadora_funcional extends JFrame {

    private JTextField pantalla;

    //TAMAÑO y TIPO DE LETRAS
    Font estilo_boton = new Font("boton", Font.ITALIC, 20);

    public Calculadora_funcional(){
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
        panel_arriba.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));


        /**
         * -----------------------------------------------PANTALLA-------------------------------------------
         */

        //PANTALLA
        pantalla = new JTextField();
        pantalla.setHorizontalAlignment(JTextField.RIGHT); //ESTO INDICA QUE AL ESCRIBIR TEXTO EN LA PANTALLA, LO MOSTRARA ALINEADO A LA DERECHA. OSEA EMPEZARA POR LA DERECHA.

        //ESTILO DE LA PANTALLA
        pantalla.setBackground(new Color(188,209,192));
        pantalla.setFont(new Font("letra_pantalla", Font.ITALIC, 50));
        pantalla.setForeground(Color.black);

        // Configura el alto del JTextField (panel de pantalla) a un valor más grande
        Dimension altura_panel_arriba = new Dimension(pantalla.getPreferredSize().width, 100); //
        pantalla.setPreferredSize(altura_panel_arriba);

        // Configuramos el JTextField para ocupar todo el espacio disponible en el panel_arriba
        pantalla.setPreferredSize(new Dimension(Integer.MAX_VALUE, pantalla.getPreferredSize().height));

        panel_arriba.add(pantalla, BorderLayout.CENTER);


        panel_arriba.add(pantalla);

        /**
         * -----------------------------------------------PANEL DE ABAJO-------------------------------------------
         */
        //PANEL DE ABAJO, AQUI COLOCAREMOS LOS BOTONES
        JPanel panel_abajo = new JPanel();
        panel_abajo.setLayout(new GridLayout(5,4));

        /**
         * -----------------------------------------------BOTONES-------------------------------------------
         */

        //CREAMOS LOS BOTONES
        String[] botones = {        //Este arreglo contiene una lista de etiquetas de botones que se utilizarán en la interfaz de usuario.
                                    // Cada cadena representa el texto que aparecerá en un botón.
            "÷", "%", "√", "x²",
            "x", "7", "8", "9",
            "+", "4", "5", "6",
            "-", "1", "2", "3",
            "=", "0", ".", "C",
        };

        //BUCLE PARA CREAR LOS BOTONES Y NO HACERLOS DE 1 EN 1
        for (String boton_string : botones){  //ESTE BUCLE RECORRE CADA ELEMENTO DEL ARRAY "botones"
            JButton boton = new JButton(boton_string);     //SE CREA UN NUEVO BOTON CON EL TEXTO INDICADO POR LA VARIABLE DEL ARRAY.

            // Configura el color de fondo de los botones 5, 6 y 7 a rojo
            if (boton_string.equals("÷") || boton_string.equals("%") || boton_string.equals("√") ||
                    boton_string.equals("x") || boton_string.equals("+") || boton_string.equals("-")
                    || boton_string.equals("x²")) {
                boton.setBackground(new Color(26,66,76));
            }

            // Configura el color de fondo de los botones 1, 2 y 3 a amarillo
            else if (boton_string.equals("=")) {
                boton.setBackground(new Color(239, 161, 18));
            }

            else {
                boton.setBackground(Color.black);
            }


            boton.setForeground(Color.white);


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
        Calculadora_funcional calculadora_funciona= new Calculadora_funcional();
        calculadora_funciona.setBounds(0, 0, 400, 500);
        calculadora_funciona.setVisible(true);
        calculadora_funciona.setLocationRelativeTo(null); // Centrar la ventana en la pantalla
        calculadora_funciona.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}


