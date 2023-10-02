
import TutorialYoutube.Video29_JTextField;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Calculadora_MIA_FALSA_PRUEBA extends JFrame{

    //CREAMOS LAS DIFERENTES VARABLES QUE USAREMOS

    // Para tener una variable ya por defecto del tamaño de las letras que usaremos
    private Font letras_boton ;

    //TextField que usaremos como pantalal donde aparecen los numeros y el resultado
    private JTextField barra;

    //Tamaño de los numeros de la barra donde apareceran los numeros al pulsarlos
    private Font numeros_barra;

    //Colores tanto de los botones de los signos como de los numeros
    private Color color_signos;
    private Color color_numeros;


    //Botones para cada uno de los signos y numeros que tendran nuestra calculadora
    private JButton boton1,boton2,boton3,boton4,boton5,boton6,boton7,boton8,boton9,boton0,
            boton_punto, boton_igual,
            boton_multiplicacion, boton_dividir, boton_restar, boton_sumar, boton_porcentaje,boton_raiz,
            boton_borrar;



    //Creamos un constructor donde diseñaremos nuestra calculadora
    public Calculadora_MIA_FALSA_PRUEBA(){


        setTitle("CALCULADORA DE KEVIN");

        //COLOR FONDO DE LA VENTANA
        getContentPane().setBackground(new Color(31,31,31));

        //COLOR SIGNOS
        color_signos = new Color(26,66,76);

        //COLOR NUMEROS
        color_numeros = new Color(52,52,52);

        //TAMAÑO LETRAS
        letras_boton = new Font("boton", Font.BOLD, 30);

        //TAMAÑO LETRA BARRA
        numeros_barra = new Font("letra_barra", Font.BOLD, 50);

        //PANTALLA
        barra = new JTextField();
        //INDICAMOS LAS COORDENADAS Y EL TAMAÑO QUE TENDRA NUESTRA PANTALLA
        barra.setBounds(0,0,387,120);

        //ASIGNAMOS LOS COLORES DEL FONDO, LETRA, APLICAMOS EL TAMAÑO DE LA LETRA
        barra.setBackground(new Color(60,60,60));
        barra.setForeground(Color.white);
        barra.setFont(numeros_barra);
        barra.setHorizontalAlignment(JTextField.RIGHT);

        //AÑADIMOS LA PANTALLA PARA QUE APAREZCA A LA HORA DE EJECUTARLO
        add(barra);




        /** ------------------------------------------------------------------------------------------ **/
        /** BOTONES PRIMERA FILA % , √, X, ÷  **/

        //ESTABLECEMOS EL BOTON Y QUE QUEREMOS QUE MUESTRE ESE BOTON
        boton_porcentaje = new JButton("%");

        //INDICAMOS LAS COORDEANDAS Y EL TAMAÑO DEL BOTON DEL NUEMRO O SIGNO
        boton_porcentaje.setBounds(40,150,65,65);

        //ESTABLECEMOS EL TAMAÑO DE LA LETRA QUE APARECERA EN EL BOTON, EL COLOR Y EL FONDO
        boton_porcentaje.setFont(letras_boton);
        boton_porcentaje.setForeground(Color.white);    boton_porcentaje.setBackground( color_signos);

        //AÑADIMOS EL BOTON PARA QUE APAREZCA A LA HORA DE EJECUTARLO
        add(boton_porcentaje);

        boton_raiz = new JButton("√");
        boton_raiz.setBounds(120,150,65,65);
        boton_raiz.setFont(letras_boton);
        boton_raiz.setForeground(Color.white);  boton_raiz.setBackground(color_signos);
        add(boton_raiz);

        boton_multiplicacion= new JButton("x");
        boton_multiplicacion.setBounds(200,150,65,65);
        boton_multiplicacion.setFont(letras_boton);
        boton_multiplicacion.setForeground(Color.white);    boton_multiplicacion.setBackground( color_signos);
        add(boton_multiplicacion);

        boton_dividir= new JButton("÷");
        boton_dividir.setBounds(280,150,65,65);

        boton_dividir.setFont(letras_boton);
        boton_dividir.setForeground(Color.white);   boton_dividir.setBackground( color_signos);
        add(boton_dividir);

        /** ------------------------------------------------------------------------------------------ **/
        /** BOTONES SEGUNDA FILA 7 , 8, 9, +  **/


        boton7 = new JButton("7");
        boton7.setBounds(40,230,65,65);
        boton7.setFont(letras_boton);
        boton7.setForeground(Color.white);    boton7.setBackground( color_numeros);
        add(boton7);

        boton8 = new JButton("8");
        boton8.setBounds(120,230,65,65);
        boton8.setFont(letras_boton);
        boton8.setForeground(Color.white);    boton8.setBackground( color_numeros);
        add( boton8);

        boton9 = new JButton("9");
        boton9.setBounds(200,230,65,65);
        boton9.setFont(letras_boton);
        boton9.setForeground(Color.white);    boton9.setBackground( color_numeros);
        add( boton9);

        boton_sumar = new JButton("+");
        boton_sumar.setBounds(280,230,65,65);
        boton_sumar.setFont(letras_boton);
        boton_sumar.setForeground(Color.white);    boton_sumar.setBackground( color_signos);
        add( boton_sumar);

        /** ------------------------------------------------------------------------------------------ **/
        /** BOTONES TERCERA FILA 4 , 5, 6, -  **/

        boton4 = new JButton("4");
        boton4.setBounds(40,310,65,65);
        boton4.setFont(letras_boton);
        boton4.setForeground(Color.white);    boton4.setBackground( color_numeros);
        add(boton4);

        boton5 = new JButton("5");
        boton5.setBounds(120,310,65,65);
        boton5.setFont(letras_boton);
        boton5.setForeground(Color.white);   boton5.setBackground( color_numeros);
        add(boton5);

        boton6 = new JButton("6");
        boton6.setBounds(200,310,65,65);
        boton6.setFont(letras_boton);
        boton6.setForeground(Color.white);   boton6.setBackground( color_numeros);
        add(  boton6);

        boton_restar = new JButton("-");
        boton_restar.setBounds(280,310,65,65);
        boton_restar.setFont(letras_boton);
        boton_restar.setForeground(Color.white);   boton_restar.setBackground( color_signos);
        add(  boton_restar);

        /** ------------------------------------------------------------------------------------------ **/
        /** BOTONES CUARTA FILA 1 , 2, 3, =  **/

        boton1 = new JButton("1");
        boton1.setBounds(40,390,65,65);
        boton1.setFont(letras_boton);
        boton1.setForeground(Color.white);    boton1.setBackground( color_numeros);
        add(boton1);

        boton2 = new JButton("2");
        boton2.setBounds(120,390,65,65);
        boton2.setFont(letras_boton);
        boton2.setForeground(Color.white);    boton2.setBackground( color_numeros);
        add(boton2);

        boton3 = new JButton("3");
        boton3.setBounds(200,390,65,65);
        boton3.setFont(letras_boton);
        boton3.setForeground(Color.white);    boton3.setBackground( color_numeros);
        add( boton3);

        boton_igual = new JButton("=");
        boton_igual.setBounds(280,390,65,147);
        boton_igual.setFont(letras_boton);
        boton_igual.setForeground(Color.white);    boton_igual.setBackground( new Color(239, 161, 18));
        add( boton_igual);

        /** ------------------------------------------------------------------------------------------ **/
        /** BOTONES QUINTA FILA 0 , ., BORRAR **/

        boton0 = new JButton("0");
        boton0 .setBounds(40,470,65,65);
        boton0 .setFont(letras_boton);
        boton0 .setForeground(Color.white);    boton0 .setBackground( color_numeros);
        add(boton0 );

        boton_punto = new JButton(".");
        boton_punto .setBounds(120,470,65,65);
        boton_punto .setFont(letras_boton);
        boton_punto.setForeground(Color.white);    boton_punto.setBackground( color_numeros);
        add(boton_punto );

        boton_borrar = new JButton("C");
        boton_borrar .setBounds(200,470,65,65);
        boton_borrar.setFont(letras_boton);
        boton_borrar.setForeground(Color.white);    boton_borrar.setBackground( color_numeros);
        add(boton_borrar );

    }




    // CREAMOS EL MAIN
    public static void main(String[] args) {

        //CREAMOS EL OBJETO "calculadora1"
        Calculadora_MIA_FALSA_PRUEBA calculadora1 = new Calculadora_MIA_FALSA_PRUEBA();

        /*Seleccionamos un Layout, hay diferentes tipos de Layouts, pero en este caso usaremos el NULL
         * Usaremos este ya que anteriormente hemos indicado las coordenadas y tamaño exacto tanto de los botones
         * como de la pequeña pantalla donde aparecera el resultado. Por ese caso usaremos NULL, para hacerlo totalmente
         * diseñado a nuestro gusto y que sea diseño propio
         * */
        calculadora1.setLayout(new GridLayout(5,4));
        // Establece el tamaño máximo del marco
        calculadora1.setMaximumSize(new Dimension(400, 195));

        //INDICAMOS LAS COORDEANDAS DE LA PANTALLA Y EL TAMAÑO QUE TENDRA TANTO DE ANCHO COMO DE ALTURA
        calculadora1.setBounds(0,0, 400,600);

        /*EN MI CASO ESTABLECI QUE LA CALCULDORA NO SE PUEDE MODIFICAR DE TAMAÑO POR PARTE DEL USUARIO,
        ASI MANTENDRA UN TAMAÑO FIJO SIEMPRE*/
        // calculadora1.setResizable(false);

        //INDICAMOS QUE SE PUEDE HACER VISIBLE LA VENTANA
        calculadora1.setVisible(true);

        //INDICAMOS QUE LA VENTANA AL EJECUTARLA SIEMPRE APAREZCA EN EL CENTRO DE LA PANTALLA
        calculadora1.setLocationRelativeTo(null);

        //ESTABLECEMOS QUE CUANDO CERREMOS LA VENTANA, EL PROGRAMA TAMBIEN SE CERRARA AUTOMATICAMENTE
        calculadora1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }


}
