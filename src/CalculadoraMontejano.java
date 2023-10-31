import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class CalculadoraMontejano {



        private static boolean inicio;
        private static JTextField pantalla;
        private static JTextField pantalla1;
        private static JComboBox<String> cambio1;
        private static JComboBox<String> cambio2;
        private static JLabel pantallaError;
        private static ArrayList<String> monedas = new ArrayList<>();

        public static void main(String[] args) {
            inicio = true;

            //Creamos el objeto de la clase JFrame
            JFrame ventana = new JFrame();
            //Usamos el metodo setBounds para dar las cordenadas y tamanyo a la ventana
            ventana.setBounds(10, 10, 400, 450);
            //Usamos el metodo setVisible para darle visibilidad a la ventana
            ventana.setVisible(true);
            //Usamos el metodo setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE) para cuando cerremos la ventana se pare el programa
            ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            JLabel titulo = new JLabel("CALCULADORA");

            JPanel panelPantalla = new JPanel();
            panelPantalla(panelPantalla);

            JPanel panelBotones = new JPanel();
            panelBotones(panelBotones);

            ventana.add(panelPantalla, BorderLayout.NORTH);
            ventana.add(panelBotones, BorderLayout.CENTER);


        }

        private static void panelPantalla(JPanel panelPantalla) {

            monedas.add("Euros");
            monedas.add("Dolar");
            monedas.add("Yens");
            monedas.add("Pesos(Argentinos)");
            monedas.add("Libra");

            panelPantalla.setLayout(new GridBagLayout());
            panelPantalla.repaint();
            panelPantalla.revalidate();
            panelPantalla.setBounds(10, 10, 400, 450);

            cambio1 = new JComboBox<>();
            for (String e : monedas) {
                cambio1.addItem(e);
            }

            JLabel titulo = new JLabel("Conversor de Monedas");
            titulo.setFont(new Font("Arial",Font.BOLD,20));
            panelPantalla.add(titulo,
                    new GridBagConstraints(
                            0,
                            0,
                            2,
                            1,
                            1.0,
                            1.0,
                            GridBagConstraints.CENTER,
                            GridBagConstraints.HORIZONTAL,
                            new Insets(10, 10, 0, 0),
                            10,
                            0
                    ));

            panelPantalla.add(cambio1,
                    new GridBagConstraints(
                            0,
                            1,
                            1,
                            1,
                            1.0,
                            1.0,
                            GridBagConstraints.CENTER,
                            GridBagConstraints.HORIZONTAL,
                            new Insets(20, 10, 0, 0),
                            0,
                            0
                    ));

            pantalla = new JTextField();
            pantalla.setEnabled(false);
            panelPantalla.add(pantalla,
                    new GridBagConstraints(
                            0,
                            2,
                            1,
                            1,
                            1.0,
                            1.0,
                            GridBagConstraints.CENTER,
                            GridBagConstraints.HORIZONTAL,
                            new Insets(10, 10, 20, 0),
                            0,
                            10
                    ));

            JLabel flecha = new JLabel(">>>>>>");
            panelPantalla.add(flecha,
                    new GridBagConstraints(
                            1,
                            1,
                            1,
                            1,
                            1.0,
                            1.0,
                            GridBagConstraints.SOUTH,
                            GridBagConstraints.HORIZONTAL,
                            new Insets(0, 30, 0, 0),
                            10,
                            0
                    ));

            cambio2 = new JComboBox<>();
            for (String e : monedas) {
                cambio2.addItem(e);
            }

            panelPantalla.add(cambio2,
                    new GridBagConstraints(
                            2,
                            1,
                            1,
                            1,
                            1.0,
                            1.0,
                            GridBagConstraints.CENTER,
                            GridBagConstraints.HORIZONTAL,
                            new Insets(20, 0, 0, 10),
                            0,
                            0
                    ));

            pantalla1 = new JTextField();
            pantalla1.setEnabled(false);
            panelPantalla.add(pantalla1,
                    new GridBagConstraints(
                            2,
                            2,
                            1,
                            1,
                            1.0,
                            1.0,
                            GridBagConstraints.CENTER,
                            GridBagConstraints.HORIZONTAL,
                            new Insets(10, 0, 20, 10),
                            0,
                            10
                    ));

        }

        private static void panelBotones(JPanel panelBotones) {
            int top = 10;
            int left = 10;
            int botton = 10;
            int right = 10;

            panelBotones.setLayout(new GridBagLayout());
            panelBotones.setBounds(10, 10, 350, 400);


            JButton boton7 = new JButton("7");
            boton7.setBackground(Color.white);
            panelBotones.add(boton7,
                    new GridBagConstraints(
                            0,
                            0,
                            1,
                            1,
                            1.0,
                            1.0,
                            GridBagConstraints.CENTER,
                            GridBagConstraints.BOTH,
                            new Insets(top,left,botton,right),
                            0,
                            0
                    ));
            boton7.addActionListener(accionBotones());


            JButton boton8 = new JButton("8");
            boton8.setBackground(Color.white);
            panelBotones.add(boton8,
                    new GridBagConstraints(
                            1,
                            0,
                            1,
                            1,
                            1.0,
                            1.0,
                            GridBagConstraints.CENTER,
                            GridBagConstraints.BOTH,
                            new Insets(top,left,botton,right),
                            0,
                            0
                    ));
            boton8.addActionListener(accionBotones());


            JButton boton9 = new JButton("9");
            boton9.setBackground(Color.white);
            panelBotones.add(boton9,
                    new GridBagConstraints(
                            2,
                            0,
                            1,
                            1,
                            1.0,
                            1.0,
                            GridBagConstraints.CENTER,
                            GridBagConstraints.BOTH,
                            new Insets(top,left,botton,right),
                            0,
                            0
                    ));
            boton9.addActionListener(accionBotones());



            JButton boton4 = new JButton("4");
            boton4.setBackground(Color.white);
            panelBotones.add(boton4,
                    new GridBagConstraints(
                            0,
                            1,
                            1,
                            1,
                            1.0,
                            1.0,
                            GridBagConstraints.CENTER,
                            GridBagConstraints.BOTH,
                            new Insets(top,left,botton,right),
                            0,
                            0
                    ));
            boton4.addActionListener(accionBotones());


            JButton boton5 = new JButton("5");
            boton5.setBackground(Color.white);
            panelBotones.add(boton5,
                    new GridBagConstraints(
                            1,
                            1,
                            1,
                            1,
                            1.0,
                            1.0,
                            GridBagConstraints.CENTER,
                            GridBagConstraints.BOTH,
                            new Insets(top,left,botton,right),
                            0,
                            0
                    ));
            boton5.addActionListener(accionBotones());


            JButton boton6 = new JButton("6");
            boton6.setBackground(Color.white);
            panelBotones.add(boton6,
                    new GridBagConstraints(
                            2,
                            1,
                            1,
                            1,
                            1.0,
                            1.0,
                            GridBagConstraints.CENTER,
                            GridBagConstraints.BOTH,
                            new Insets(top,left,botton,right),
                            0,
                            0
                    ));
            boton6.addActionListener(accionBotones());



            JButton boton1 = new JButton("1");
            boton1.setBackground(Color.white);
            panelBotones.add(boton1,
                    new GridBagConstraints(
                            0,
                            2,
                            1,
                            1,
                            1.0,
                            1.0,
                            GridBagConstraints.CENTER,
                            GridBagConstraints.BOTH,
                            new Insets(top,left,botton,right),
                            0,
                            0
                    ));
            boton1.addActionListener(accionBotones());


            JButton boton2 = new JButton("2");
            boton2.setBackground(Color.white);
            panelBotones.add(boton2,
                    new GridBagConstraints(
                            1,
                            2,
                            1,
                            1,
                            1.0,
                            1.0,
                            GridBagConstraints.CENTER,
                            GridBagConstraints.BOTH,
                            new Insets(top,left,botton,right),
                            0,
                            0
                    ));
            boton2.addActionListener(accionBotones());


            JButton boton3 = new JButton("3");
            boton3.setBackground(Color.white);
            panelBotones.add(boton3,
                    new GridBagConstraints(
                            2,
                            2,
                            1,
                            1,
                            1.0,
                            1.0,
                            GridBagConstraints.CENTER,
                            GridBagConstraints.BOTH,
                            new Insets(top,left,botton,right),
                            0,
                            0
                    ));
            boton3.addActionListener(accionBotones());


            JButton boton0 = new JButton("0");
            boton0.setBackground(Color.white);
            panelBotones.add(boton0,
                    new GridBagConstraints(
                            0,
                            3,
                            2,
                            1,
                            1.0,
                            1.0,
                            GridBagConstraints.CENTER,
                            GridBagConstraints.BOTH,
                            new Insets(top,left,botton,right),
                            0,
                            0
                    ));
            boton0.addActionListener(accionBotones());


      /*  JButton botonComa = new JButton(",");
        botonComa.setBackground(Color.white);
        panelBotones.add(botonComa,
                new GridBagConstraints(
                        0,
                        3,
                        1,
                        1,
                        1.0,
                        1.0,
                        GridBagConstraints.CENTER,
                        GridBagConstraints.BOTH,
                        new Insets(top,left,botton,right),
                        0,
                        0
                ));
        botonComa.addActionListener(accionBotones());
*/

            JButton botonIgual = new JButton("=");
            botonIgual.setBackground(Color.ORANGE);
            panelBotones.add(botonIgual,
                    new GridBagConstraints(
                            2,
                            3,
                            1,
                            1,
                            1.0,
                            1.0,
                            GridBagConstraints.CENTER,
                            GridBagConstraints.BOTH,
                            new Insets(top,left,botton,right),
                            0,
                            0
                    ));
            botonIgual.addActionListener(accionBotonIgual());


            JButton botonBorrar = new JButton("AC");
            botonBorrar.setBackground(Color.gray);
            panelBotones.add(botonBorrar,
                    new GridBagConstraints(
                            0,
                            4,
                            3,
                            1,
                            1.0,
                            1.0,
                            GridBagConstraints.CENTER,
                            GridBagConstraints.BOTH,
                            new Insets(10,10,10,10),
                            0,
                            0
                    ));
            botonBorrar.addActionListener(accionBotonAC());

            pantallaError = new JLabel();
            panelBotones.add(pantallaError,
                    new GridBagConstraints(
                            0,
                            5,
                            3,
                            1,
                            1.0,
                            1.0,
                            GridBagConstraints.CENTER,
                            GridBagConstraints.BOTH,
                            new Insets(10,10,10,10),
                            0,
                            0
                    ));

        }

        private static ActionListener accionBotones() {

            ActionListener ac = new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String entrada = e.getActionCommand();

                    if (inicio) {
                        pantalla.setText("");
                        inicio = false;
                    }

                    pantalla.setText(pantalla.getText() + entrada);

                }
            };
            return ac;
        }

        private static ActionListener accionBotonAC() {

            ActionListener ac = new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                    pantalla.setText("");

                }
            };
            return ac;
        }

        private static double cogerCifra() {

            //Creamos varias variables

            String result = "";
            String resultPantalla = pantalla.getText();
            double resultNum = 0;

            char[] num = resultPantalla.toCharArray();

            for (int i = 0; i < num.length; i++) {
                result += num[i];

            }
            resultNum = Integer.parseInt(result);

            return resultNum;
        }

        private static ActionListener accionBotonIgual() {

            ActionListener ac = new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                    try {


                        String monedaCambio1;
                        String monedaCambio2;

                        //EUROS
                        final double EUROSDOLAR = 1.05;
                        final double EUROSYEN = 157.82;
                        final double EUROSPESOS = 369.2;
                        final double EUROSLIBRA = 0.86;

                        //YEN
                        final double YENDOLAR = 0.00668;
                        final double YENPESOS = 2.33957;
                        final double YENLIBRA = 0.0055;
                        final double YENEURO = 0.00636;

                        //LIBRA
                        final double LIBRAYEN = 181.557;
                        final double LIBRAPESOS = 424.983;
                        final double LIBRADOLAR = 1.21413;
                        final double LIBRAEURO = 1.15483;

                        //DOLAR
                        final double DOLARYEN = 149.543;
                        final double DOLARPESOS = 350.03;
                        final double DOLARLIBRA = 0.82305;
                        final double DOLAREURO = 0.95132;

                        //PESOS
                        final double PESOSYEN = 0.42719;
                        final double PESOSDOLAR = 0.00286;
                        final double PESOSLIBRA = 0.00235;
                        final double PESOSEURO = 0.00272;

                        double numPantalla = cogerCifra();
                        double resultNumerico = 0;
                        String resultString = "";

                        monedaCambio1 = (String) cambio1.getSelectedItem();
                        monedaCambio2 = (String) cambio2.getSelectedItem();

                        if(monedaCambio1 == monedaCambio2){
                            pantallaError.setText("Las monedas no pueden ser iguales");

                        }else {


                            switch (monedaCambio1) {

                                //EUROS A OTRA MONEDA
                                case "Euros":
                                    switch (monedaCambio2) {
                                        case "Dolar":
                                            resultNumerico = numPantalla * EUROSDOLAR;
                                            break;
                                        case "Yens":
                                            resultNumerico = numPantalla * EUROSYEN;
                                            break;
                                        case "Libra":
                                            resultNumerico = numPantalla * EUROSLIBRA;
                                            break;
                                        case "Pesos(Argentinos)":
                                            resultNumerico = numPantalla * EUROSPESOS;
                                            break;
                                    }
                                    break;

                                //DOLAR A OTRA MONEDA
                                case "Dolar":
                                    switch (monedaCambio2) {
                                        case "Euros":
                                            resultNumerico = numPantalla * DOLAREURO;
                                            break;
                                        case "Yens":
                                            resultNumerico = numPantalla * DOLARYEN;
                                            break;
                                        case "Libra":
                                            resultNumerico = numPantalla * DOLARLIBRA;
                                            break;
                                        case "Pesos(Argentinos)":
                                            resultNumerico = numPantalla * DOLARPESOS;
                                            break;
                                    }
                                    break;

                                //YEN A OTRA MONEDA
                                case "Yens":
                                    switch (monedaCambio2) {
                                        case "Euros":
                                            resultNumerico = numPantalla * YENEURO;
                                            break;
                                        case "Dolar":
                                            resultNumerico = numPantalla * YENDOLAR;
                                            break;
                                        case "Libra":
                                            resultNumerico = numPantalla * YENLIBRA;
                                            break;
                                        case "Pesos(Argentinos)":
                                            resultNumerico = numPantalla * YENPESOS;
                                            break;
                                    }
                                    break;

                                //LIBRA A OTRA MONEDA
                                case "Libra":
                                    switch (monedaCambio2) {
                                        case "Euros":
                                            resultNumerico = numPantalla * LIBRAEURO;
                                            break;
                                        case "Dolar":
                                            resultNumerico = numPantalla * LIBRADOLAR;
                                            break;
                                        case "Yens":
                                            resultNumerico = numPantalla * LIBRAYEN;
                                            break;
                                        case "Pesos(Argentinos)":
                                            resultNumerico = numPantalla * LIBRAPESOS;
                                            break;
                                    }
                                    break;

                                //PESOS A OTRA MONEDA
                                case "Pesos(Argentinos)":
                                    switch (monedaCambio2) {
                                        case "Euros":
                                            resultNumerico = numPantalla * PESOSEURO;
                                            break;
                                        case "Dolar":
                                            resultNumerico = numPantalla * PESOSDOLAR;
                                            break;
                                        case "Yens":
                                            resultNumerico = numPantalla * PESOSYEN;
                                            break;
                                        case "Libra":
                                            resultNumerico = numPantalla * PESOSLIBRA;
                                            break;
                                    }
                                    break;
                            }

                            resultString = resultNumerico + "";
                            pantalla1.setText(numPantalla + " " + monedaCambio1 + " " + resultString + " " + monedaCambio2);

                        }

                    }catch (NumberFormatException ei){
                        pantallaError.setText("No puedes dejar el campo vacio, introduce parametros");
                    }
                }
            };
            return ac;
        }
    }



