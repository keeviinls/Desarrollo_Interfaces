package PracticaCalculadora;

import javax.swing.*;
import java.awt.*;

public class CalculadoraFalsa extends JFrame {

    private JTextField pantalla;

    public CalculadoraFalsa() {
        // Configura la ventana
        setTitle("Calculadora");
        setSize(300, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Centra la ventana en la pantalla


        // Crea un panel principal con un BorderLayout
        JPanel panelPrincipal = new JPanel(new BorderLayout());
        panelPrincipal.setBackground(Color.red);


        // Crea un panel para la pantalla en la parte superior
        JPanel panelPantalla = new JPanel();
        pantalla = new JTextField(15);
        pantalla.setHorizontalAlignment(JTextField.RIGHT);

        // Configura el color de fondo en la parte superior
        panelPantalla.setBackground(Color.blue);

        // Configura el margen superior del panel de texto
        panelPantalla.setBorder(BorderFactory.createEmptyBorder(20, 0, 10, 0));

        // Configura el alto del JTextField (panel de pantalla) a un valor más grande
        Dimension alto_panel_pantalla = new Dimension(pantalla.getPreferredSize().width, 35); // Cambia 35 al alto que desees
        pantalla.setPreferredSize(alto_panel_pantalla);



        // Configura el color de fondo y el color de texto de la pantalla
        pantalla.setBackground(Color.red);
        pantalla.setForeground(Color.yellow);

        panelPantalla.add(pantalla);

        // Crea el panel de botones
        JPanel panelBotones = new JPanel(new GridLayout(5, 4)); // 5 filas para acomodar los botones especiales
        panelBotones.setBackground(Color.black);

        // Agrega los botones a panelBotones
        String[] botones = {
                "%", "√", "x²", "C",
                "7", "8", "9", "/",
                "4", "5", "6", "*",
                "1", "2", "3", "-",
                "0", ".", "=", "+",
        };
        for (String boton : botones) {
            JButton btn = new JButton(boton);

            // Configura el tamaño de los botones


            // Configura el color de fondo y el color de texto de los botones
            btn.setBackground(Color.black);
            btn.setForeground(Color.green);

            // Configura el tamaño real de los botones
            btn.setSize(btn.getPreferredSize());

            // Configura el tamaño del texto de los botones
            btn.setFont(new Font("Arial", Font.PLAIN, 18));

            panelBotones.add(btn);
        }

        // Configura el margen de los botones

        // Agrega los paneles al panel principal
        panelPrincipal.add(panelPantalla, BorderLayout.NORTH);
        panelPrincipal.add(panelBotones, BorderLayout.CENTER);

        // Agrega el panel principal a la ventana
        add(panelPrincipal);


    }

    public static void main(String[] args) {

            CalculadoraFalsa calculadora= new CalculadoraFalsa();
            // Hacer visible la ventana
            calculadora.setVisible(true);

    }
}