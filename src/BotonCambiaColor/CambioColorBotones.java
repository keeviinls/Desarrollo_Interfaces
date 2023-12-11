package BotonCambiaColor;

import ProyectoCalculadora.Calculadora_KevinLoayza;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CambioColorBotones extends JFrame {
    private JButton boton1, boton2;
    private Color colorBoton1 = Color.GREEN;
    private Color colorBoton2 = Color.BLUE;

    public CambioColorBotones() {
        // Configurar la ventana
        setTitle("Cambio de Color de Botones");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Usar un BoxLayout vertical
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));

        // Inicializar los botones
        boton1 = new JButton("Boton1");
        boton2 = new JButton("Boton2");
        boton1.setBackground(colorBoton1);
        boton2.setBackground(colorBoton2);

        // Agregar el ActionListener para el Boton1
        boton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cambiarColores();
            }
        });

        // Agregar el ActionListener para el Boton2
        boton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cambiarColores();
            }
        });

        // Agregar rigidez para centrar verticalmente
        add(Box.createVerticalGlue());

        // Agregar los botones al panel
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout(FlowLayout.CENTER));
        panel.add(boton1);
        panel.add(boton2);

        add(panel);

        // Agregar rigidez para centrar verticalmente
        add(Box.createVerticalGlue());
    }

    private void cambiarColores() {
        // Intercambiar colores
        Color temp = colorBoton1;
        colorBoton1 = colorBoton2;
        colorBoton2 = temp;

        // Aplicar los nuevos colores
        boton1.setBackground(colorBoton1);
        boton2.setBackground(colorBoton2);
    }

    public static void main(String[] args) {
        CambioColorBotones cambiar_color_boton= new CambioColorBotones();    // Se crea la instancia para la clase, se guarda en una variable.
        cambiar_color_boton.setBounds(0, 0, 320, 500); //  Establecemos el tamaño de la venta cuando ejecutemos la calculadora
        cambiar_color_boton.setVisible(true);  // Permitimos la visibilidad de la ventana, asi se hace visible para el usuario
        cambiar_color_boton.setLocationRelativeTo(null); // Sirve para indicar que la ventana aparezca en el centro de la pantalla
        cambiar_color_boton.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}