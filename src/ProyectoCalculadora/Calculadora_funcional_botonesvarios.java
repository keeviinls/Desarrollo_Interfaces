package ProyectoCalculadora;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Calculadora_funcional_botonesvarios extends JFrame implements ActionListener {

    /**
     * -----------------------------------------------ATRIBUTOS PRINCIPALES--------------------------------------------
     */

    private JTextField pantalla_resultado;  // Campo de texto para mostrar el resultado de la operaciones
    private JTextField pantalla_operaciones;    // Campo de texto para mostrar las operaciones en curso
    private JButton boton_dividir, boton_potencia, boton_raiz, boton_ce, boton_multiplicar, boton_restar, boton_sumar, boton_igual, boton_punto, boton_c;   // Botones para las diferentes operaciones
    private JButton boton_1, boton_2, boton_3, boton_4, boton_5, boton_6, boton_7, boton_8, boton_9, boton_0;   // Botones para indicar los diferentes numeros
    private String cadenaNumeros="";    // Guardara los numeros que el alumno vaya seleccionando, cada vez que presiona un boton numerico, se guardara aqui
    private String operacion = "nula";  // Usaremmos para tener un seguimiento de la operacion actual. Cuando un usuario pulse un boton de operacion, se actualizara segun la operacion que sea
    private double primerNumero, resultado; // Almacenaran el primer numero seleccinoado por el usuario, igual que le resultado
    private boolean activado = true;    // Servira para controlar si se debe activar la entrada de numeros, se pondra en "false" cuando se selecciona una operacion.
    private boolean punto = true;   // Controlara si se puede ingresar un punto decimal en la cadena de numeros


    //TAMAÑO y TIPO DE LETRAS
    Font estilo_boton = new Font("boton", Font.ITALIC, 20); // Establecemos un tipo de letra para los diferentes botones y asi tengan todos el mismo

    public Calculadora_funcional_botonesvarios(){

        /**-----------------------------------------------------------------------------------------------------------------------------
         *                                                 DISEÑO DE LA CALCULADORA
         * -----------------------------------------------------------------------------------------------------------------------------
         */


        setTitle("Calculadora M.B.Cossío"); // Estrablecemos el titulo de la ventana

        /**
         * -----------------------------------------------MAIN PANEL--------------------------------------------
         */

        JPanel mainpanel = new JPanel();    // Actuara como panel principal de la ventana, tendra todos los demas componentes
        mainpanel.setLayout(new BorderLayout());    // Ponemos BorderLayout, asi pòdremos poner los componentes en norte, sur, este, oeste o centro


        /**
         * -----------------------------------------------PANEL DE ARRIBA--------------------------------------------
         */


        JPanel panel_arriba = new JPanel(new BorderLayout());   // Este panel estara en la parte superior de la ventana, guardara las 2 pantallas
        panel_arriba.setBackground(new Color(3,41,64));

        panel_arriba.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));   // Margenes a cada lado del panel.

        /**
         * -----------------------------------------------PANTALLA OPERACIONES-------------------------------------------
         */


        pantalla_operaciones = new JTextField();    // Creamos un campo de texto que sera la pantalla de operaciones
        pantalla_operaciones.setHorizontalAlignment(JTextField.RIGHT); // Esto indica que al escribir texto en la pantalla, lo mostrará alineado a la derecha


        pantalla_operaciones.setBackground(new Color(253,223,185)); // Color de fondo
        pantalla_operaciones.setFont(new Font("letra_pantalla", Font.ITALIC, 15));  // Tipo letra
        pantalla_operaciones.setForeground(Color.black);    // Color de la letra


        Dimension altura_panel_arriba = new Dimension(pantalla_operaciones.getPreferredSize().width, 30);   // Se usa para indicar la altura exacta de la pantalla operaciones.
        pantalla_operaciones.setPreferredSize(altura_panel_arriba); // Se le establece la altura a la pantalla_operaciones indicada anteiormente por la Dimension

        pantalla_operaciones.setPreferredSize(new Dimension(Integer.MAX_VALUE, pantalla_operaciones.getPreferredSize().height));    // Para que la pantalla_operaciones ocupe todo el ancho disponible del panel de arriba

        panel_arriba.add(pantalla_operaciones, BorderLayout.NORTH); // Se agrega la pantalla_operaciones al panel de arriba en la zona superior de este panel


        /**
         * -----------------------------------------------PANTALLA-------------------------------------------
         * Basicamente tiene las mismas indicaciones que la pantalla de operaciones, solo cambian pequeños detalles que estan comentadios
         */

        pantalla_resultado = new JTextField("0");
        pantalla_resultado.setHorizontalAlignment(JTextField.RIGHT);



        pantalla_resultado.setBackground(new Color(253,223,185));
        pantalla_resultado.setFont(new Font("letra_pantalla", Font.ITALIC, 30));    // Cambia Tamaño letra
        pantalla_resultado.setForeground(Color.black);


        Dimension altura_panel_arriba_dos = new Dimension(pantalla_resultado.getPreferredSize().width, 70); // Cambia la altura de la pantalla
        pantalla_resultado.setPreferredSize(altura_panel_arriba_dos);


        pantalla_resultado.setPreferredSize(new Dimension(Integer.MAX_VALUE, pantalla_resultado.getPreferredSize().height));
        panel_arriba.add(pantalla_resultado, BorderLayout.CENTER);  // Lo agregamos al panel, pero esta vez en el centro del panel, asi se pondra debajo del panel_operaciones



        /**
         * -----------------------------------------------PANEL DE ABAJO-------------------------------------------
         */
        JPanel panel_abajo = new JPanel();  // Panel que ocupara todo le demas que sobre del panel superior, aqui guardaremos los botones
        panel_abajo.setBackground(new Color(3,41,64));  // Color del panel
        panel_abajo.setLayout(new GridLayout(5,4, 10, 10)); // GridLayout, asi organizara en panel en 5 filas, 4 columnas, 10px de espacio entre cada celda
        panel_abajo.setBorder(BorderFactory.createEmptyBorder(20,10,20,10));    // Margenes para cada lado, la aprte superior e inferior tendran 20px y los lados 10px


        /**
         * -----------------------------------------------BOTONES-------------------------------------------
         */


        boton_dividir = new JButton("/"); // Indicamos al boton indicado anteriomente en variables, el contenido del boton, que representa la opearcion de division
        panel_abajo.add(boton_dividir);     // Agregamos al panel de abajo este boton creado recientemente
        boton_dividir.addActionListener(this);  // Se agrega ActionListener para que cuando pulsemos el boton, este haga un evento indicado mas tarde.

        /**
         * Hacemos los mismos pasos con los demas botones
         */

        boton_potencia = new JButton("x²"); panel_abajo.add(boton_potencia); boton_potencia.addActionListener(this);
        boton_raiz = new JButton("√"); panel_abajo.add(boton_raiz); boton_raiz.addActionListener(this);
        boton_ce = new JButton("CE"); panel_abajo.add(boton_ce); boton_ce.addActionListener(this);

        // FILA 2
        boton_multiplicar = new JButton("x"); panel_abajo.add(boton_multiplicar); boton_multiplicar.addActionListener(this);
        boton_7 = new JButton("7"); panel_abajo.add(boton_7); boton_7.addActionListener(this);
        boton_8 = new JButton("8"); panel_abajo.add(boton_8); boton_8.addActionListener(this);
        boton_9 = new JButton("9"); panel_abajo.add(boton_9); boton_9.addActionListener(this);

        // FILA 3
        boton_restar = new JButton("-"); panel_abajo.add(boton_restar); boton_restar.addActionListener(this);
        boton_4 = new JButton("4"); panel_abajo.add(boton_4); boton_4.addActionListener(this);
        boton_5 = new JButton("5"); panel_abajo.add(boton_5); boton_5.addActionListener(this);
        boton_6 = new JButton("6"); panel_abajo.add(boton_6); boton_6.addActionListener(this);

        // FILA 4
        boton_sumar = new JButton("+"); panel_abajo.add(boton_sumar); boton_sumar.addActionListener(this);
        boton_1 = new JButton("1"); panel_abajo.add(boton_1); boton_1.addActionListener(this);
        boton_2 = new JButton("2"); panel_abajo.add(boton_2); boton_2.addActionListener(this);
        boton_3 = new JButton("3"); panel_abajo.add(boton_3); boton_3.addActionListener(this);

        //FILA 5
        boton_igual = new JButton("="); panel_abajo.add(boton_igual); boton_igual.addActionListener(this);
        boton_0 = new JButton("0"); panel_abajo.add(boton_0); boton_0.addActionListener(this);
        boton_punto = new JButton("."); panel_abajo.add(boton_punto); boton_punto.addActionListener(this);
        boton_c = new JButton("C"); panel_abajo.add(boton_c); boton_c.addActionListener(this);

        /**
         * -----------------------------------------------DISEÑO DE LOS BOTONES-------------------------------------------
         */


        /**
         * BOTONES DE OPERACIONES
         */
        boton_dividir.setBackground( new Color(49,127,146));    // Color de fondo del boton
        boton_dividir.setForeground(Color.white);   // Color de la letra del boton
        boton_dividir.setFont(estilo_boton);    // Estilo de texto del boton, anteriormennte indicado en las variables

        /**
         * Hacemos los mismos pasos con los demas botones
         */
        boton_potencia.setBackground(new Color(49,127,146)); boton_potencia.setForeground(Color.white); boton_potencia.setFont(estilo_boton);
        boton_raiz.setBackground(new Color (49,127,146)); boton_raiz.setForeground(Color.white); boton_raiz.setFont(estilo_boton);
        boton_ce.setBackground(new Color (49,127,146)); boton_ce.setForeground(Color.white); boton_ce.setFont(estilo_boton);
        boton_multiplicar.setBackground(new Color(49,127,146)); boton_multiplicar.setForeground(Color.white); boton_multiplicar.setFont(estilo_boton);
        boton_restar.setBackground(new Color (49,127,146)); boton_restar.setForeground(Color.white); boton_restar.setFont(estilo_boton);
        boton_sumar.setBackground(new Color(49,127,146)); boton_sumar.setForeground(Color.white); boton_sumar.setFont(estilo_boton);



        /**
         * BOTONES DE NUMEROS
         */
        boton_0.setBackground(Color.white); boton_0.setForeground(new Color(3,41,64));; boton_0.setFont(estilo_boton);
        boton_1.setBackground(Color.white); boton_1.setForeground(new Color(3,41,64));; boton_1.setFont(estilo_boton);
        boton_2.setBackground(Color.white); boton_2.setForeground(new Color(3,41,64));; boton_2.setFont(estilo_boton);
        boton_3.setBackground(Color.white); boton_3.setForeground(new Color(3,41,64));; boton_3.setFont(estilo_boton);
        boton_4.setBackground(Color.white); boton_4.setForeground(new Color(3,41,64));; boton_4.setFont(estilo_boton);
        boton_5.setBackground(Color.white); boton_5.setForeground(new Color(3,41,64));; boton_5.setFont(estilo_boton);
        boton_6.setBackground(Color.white); boton_6.setForeground(new Color(3,41,64));; boton_6.setFont(estilo_boton);
        boton_7.setBackground(Color.white); boton_7.setForeground(new Color(3,41,64));; boton_7.setFont(estilo_boton);
        boton_8.setBackground(Color.white); boton_8.setForeground(new Color(3,41,64));; boton_8.setFont(estilo_boton);
        boton_9.setBackground(Color.white); boton_9.setForeground(new Color(3,41,64));; boton_9.setFont(estilo_boton);
        boton_c.setBackground(Color.white); boton_c.setForeground(new Color(3,41,64));; boton_c.setFont(estilo_boton);
        boton_punto.setBackground(Color.white); boton_punto.setForeground(new Color(3,41,64));; boton_punto.setFont(estilo_boton);

        /**
         * BOTONES DE RESULTADO
         */

        boton_igual.setBackground(new Color(125,27,59)); boton_igual.setForeground(Color.white); boton_igual.setFont(estilo_boton);





        /**
         * -----------------------------------------------RELLENAR MAIN PANEL------------------------------------------
         */
        mainpanel.add(panel_arriba,BorderLayout.NORTH); //Agregamos al mainpanel todo el contenido del panel_arriba e indicamos que se ponga en la parte superior del panel
        mainpanel.add(panel_abajo,BorderLayout.CENTER); // Agregamos al mainpanel todo el contenido del panel_abajo e indicamos que se ponga en la parte centro del panel, asi estara debajo del panel_arriba
        add(mainpanel); // Agregamos a la ventana el main_panel
    }


    /**-----------------------------------------------------------------------------------------------------------------------------
     *                                               FUNCIONAMIENTO DE LA CALCULADORA
     * -----------------------------------------------------------------------------------------------------------------------------
     */
    public void actionPerformed(ActionEvent evento_pulsar) {    // Metodo con el que manejamos los eventos cuando pulsamos los botones de la calculadora

        /**
         * -----------------------------------------------PULSAR BOTON DE NUMERO------------------------------------------
         */

        if (evento_pulsar.getSource() == boton_0) { // Verifica si pulsamos el boton0, se ejecutara el siguiente contenido

            if (pantalla_resultado.getText().equals("0")){  //Comprueba si pantalla_resultado esta a 0, esto esta para que no ponga 0 si ya hay un 0, asi evita cosas como "0000"
                cadenaNumeros = "0";    // Se establece en cadenaNumeros el numero 0 en pantalla
            }
            else {
                cadenaNumeros +="0";    // Si pantalla_resultado no esta en 0, se agrega un 0 al final de la cadena almacenada en cadena mueros
            }
            pantalla_resultado.setText(cadenaNumeros);  // Se actualiza la pantalla_resultado con el contenido de cadenaNumeros
            activado=true;  // Se activa la entrada de numeros, aunque por defecto ya venia en true
            punto = true;   //Permite agregar el punto
        }

        /**
         * Hacemos los mismos pasos con los demas botones
         */

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

        /**
         * -----------------------------------------------FUNCIONES DE CADA OPERACION BASICA------------------------------------------
         */

        if (evento_pulsar.getSource() == boton_sumar) {     // Comprueba si el evento viene del boton sumar

            if (activado == true){  // Comprueba que activado este en true
                primerNumero = Double.parseDouble(cadenaNumeros);   // Guarda en primerNumero el contenido de cadenaNumeros y lo copnvierte en un Double.
                pantalla_operaciones.setText(cadenaNumeros+ " + ");     // Muestra en pantalla_operaciones la opearcion que se va realizar
                cadenaNumeros = "";     //Limpia la variable cadenaNumeros para despues ingresar otro numero nuevo
                operacion = "sumar";    // Establece "sumar" en operacion, asi luego indicara que esta operacion es una suma
                activado = false;   // Indica que la calculadora no esta lista para realizar operacion, todavia ya que falta el segundo numero
            }
        }

        /**
         * Hacemos los mismos pasos con las demas operaciones, vemos que es basicamente igual pero cambia el nombre y el "+" por "-"
         */

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

        /**
         * -----------------------------------------------FUNCIONES PARA PUNTO Y BORRAR-----------------------------------------
         */

        /**
         * AGREGAR DECIMAL
         */

        if (evento_pulsar.getSource() == boton_punto) {     //Verifica que el evento viene del boton punto

            if (punto == true){ // Verifica que punto esta en true
                if (cadenaNumeros.equals("")){  // Comprueba si la cadena de numeros esta vacia
                    cadenaNumeros = "0.";   // Si esta vacia, agrega un "." despues del 0. En lugar de poner solo el punto sin un numero ni nada
                }
                else {
                    cadenaNumeros += ".";   // Si no esta vacia, añade el punto al contenido que tenia puesto
                }
            }
            pantalla_resultado.setText(cadenaNumeros);  // Actualiza la pantalla_resultado para mostrar el numero con el decimal agregado
            punto = false;  // Se pone en false, indica que no se puede ingresar otro punto decimal a la varibale actual, ya que ya tiene un decimal puesto
        }

        /**
         * BORRAR TODO
         */

        if (evento_pulsar.getSource() == boton_c) {     // Verficia que el boton pulsado es el C

            pantalla_operaciones.setText("");   // Limpia la pantalla de operaciones
            pantalla_resultado.setText(""); // Limpia la pantalla de resultado
            operacion = "nula"; // Indica que no se esta realizando ninguna opearacion
            cadenaNumeros = ""; // Limpia la cadena de numeros
            activado = true;    // Indica que la calculadora esta lista para una nueva opearcion
            punto = true;   // Permite agregar un punto decimal otra vez

        }

        if (evento_pulsar.getSource() == boton_ce) {    // Verifica que el boton pulsado es el CE

            int tamaño = cadenaNumeros.length();    // Calcula la longitud de la cadena de numeros y lo guarda en la variable tamaño
            if (tamaño > 0){    // Veficia si es mayor a 0, si lo es procedera a hacer la tarea siguiente

                if (tamaño == 1){   // Si el tamaño es igual a 1, la cadena de numeros automaticamente se volvera a 0
                    cadenaNumeros = "0";
                }
                else {
                    cadenaNumeros = cadenaNumeros.substring(0,cadenaNumeros.length()-1);    // Si es menor a 1, se eliminara el ultimo caracterde la cadena de nuemros. Esto con la ayuda de substring
                }
                pantalla_resultado.setText(cadenaNumeros);  //La pantalla resultado mostrara el valor actual de la cadena de numeros
            }
        }

        /**
         * -----------------------------------------------FUNCIONES DE CADA OPERACION COMPLEJA-----------------------------------------
         */

        /**
         * OPERACION RAIZ
         */

        if (evento_pulsar.getSource() == boton_raiz) {  // Verifica que el boton pulsado ese el de raiz cuadrada

            primerNumero = Double.parseDouble(cadenaNumeros);   // Guarda en primerNumero el contenido de la cadena de numero convertida en un Double
            pantalla_operaciones.setText("sqrt("+cadenaNumeros+")");    // Muestra en pantalla de opearciones la operacion
            resultado = Math.sqrt(primerNumero);    // Con la funcion Math.sqrt se calcula la raiz cuadrada del primer numero, y lo guarda en resultado
            pantalla_resultado.setText(String.valueOf(resultado));  // Se actualiza para mostrar el resultado de la raiz cuadrada
            cadenaNumeros = String.valueOf(resultado);  // Actualiza con el resultado de esa raiz cuadrada para que asi pueda hacer operaciones adicionales con ese resuiltado
            punto = true;   // Permite agregar decimal si el usuario lo desea

        }

        /**
         * OPERACION POTENCIA ELEVADA A 2
         * es basicamente lo mismo que el de la raiz cuadrada, pero cambiamos la operacion del resultado
         */

        if (evento_pulsar.getSource() == boton_potencia) {
            primerNumero = Double.parseDouble(cadenaNumeros);
            pantalla_operaciones.setText("sqr("+cadenaNumeros+")");
            resultado = Math.pow(primerNumero,2);
            pantalla_resultado.setText(String.valueOf(resultado));
            cadenaNumeros = String.valueOf(resultado);
            punto = true;
        }

        /**
         * -----------------------------------------------CALCULAR RESULTADOS OPERACIONES-----------------------------------------
         */

        /**
         * BOTON IGUAL
         */
        if (evento_pulsar.getSource() == boton_igual) { // Verificamos que el boton pulsado es el de igual
            double segundoNumero;   // Creamos una nueva variable que guardara el segundo numero introducido por el usuario
            if (operacion.equals("nula")){  // Verifica si operacione esta igual a nula
                pantalla_resultado.setText(cadenaNumeros);  // Muestra el contenido de cadena numeros en la pantalla de resultado
            }

                /**
                 * CALCULAR SUMA
                 */
                else if (operacion.equals("sumar")) {   // Verifica que la opearcion esta indicada como "sumar", esto indica que el usuario ha seleccionado antes la operacion de sumar

                    segundoNumero = Double.parseDouble(cadenaNumeros);  // Recoge el contenido de la cadena de nuemros y lo convierte en un double para guardarlo en la variable segundoNumero
                    resultado = primerNumero + segundoNumero;   // Calcula la suma de los 2 numeros
                    pantalla_resultado.setText(String.valueOf(resultado));  // Muestra en pantalla el resultado de esa suma
                    cadenaNumeros = String.valueOf(resultado);  // Actualiza con el resultado de esa suma, para depues hacer operaciones siguiendo con el resultado
                    operacion = "nula"; // Operacion vuelve a ser nula, indicando que no ha seleccionado una operacion

                }

                /**
                 * Las demas operaciones vemos que es basicamente lo mismo, cambiamos los nombres de sumar por restar, como calcular el resultado y ya
                 */

                /**
                 * CALCULAR RESTA
                 */

                else if (operacion.equals("restar")) {
                    segundoNumero = Double.parseDouble(cadenaNumeros);
                    resultado = primerNumero - segundoNumero;
                    pantalla_resultado.setText(String.valueOf(resultado));
                    cadenaNumeros = String.valueOf(resultado);
                    operacion = "nula";
                }

                /**
                 * CALCULAR MULTIPLICACION
                 */

                else if (operacion.equals("multiplicar")) {
                    segundoNumero = Double.parseDouble(cadenaNumeros);
                    resultado = primerNumero * segundoNumero;
                    pantalla_resultado.setText(String.valueOf(resultado));
                    cadenaNumeros = String.valueOf(resultado);
                    operacion = "nula";
                }

                /**
                 * CALCULAR DIVISION
                 */

                else if (operacion.equals("dividir")) {
                    segundoNumero = Double.parseDouble(cadenaNumeros);

                    if (segundoNumero == 0){
                        pantalla_resultado.setText("No se puede dividir entre 0");  // Si el segundo numero es 0, mostrara ese mensaje, ya que ningun numnero se puede dividir entre 0
                    }

                    else {  // Si no es 0, calculara el resultado como haciamos en las anteriores operaciones
                        resultado = primerNumero / segundoNumero;
                        pantalla_resultado.setText(String.valueOf(resultado));
                        cadenaNumeros = String.valueOf(resultado);
                        operacion = "nula";
                    }


                }

            pantalla_operaciones.setText("");  // Pantalla operaciones se limpara y quedara vacia
            activado = true;    // Permite al usuario ingresar otro nuievo numero
            punto = false;  // Permite agregar un punto decimal en el próximo numero que el usuario ingrese
        }

    }

    public static void main(String[] args) {
        Calculadora_funcional_botonesvarios calculadora_funciona= new Calculadora_funcional_botonesvarios();    // Se crea la instancia para la clase, se guarda en una variable.
        calculadora_funciona.setBounds(0, 0, 320, 500); //  Establecemos el tamaño de la venta cuando ejecutemos la calculadora
        calculadora_funciona.setVisible(true);  // Permitimos la visibilidad de la ventana, asi se hace visible para el usuario
        calculadora_funciona.setLocationRelativeTo(null); // Sirve para indicar que la ventana aparezca en el centro de la pantalla
        calculadora_funciona.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    // Cuando se cierre la vetana, la aplicacion se detendra, asi damos por finalizada la ejecucion del programa cuando el usuario cierre la ventana
    }

}




