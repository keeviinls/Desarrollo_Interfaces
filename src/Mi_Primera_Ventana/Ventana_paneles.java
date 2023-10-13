package Mi_Primera_Ventana;

import javax.swing.*;
import java.awt.*;

public class Ventana_paneles {
    public static void main(String[] args) {
        JFrame miPrimeraVentana = new JFrame();
        JPanel panel01 = new JPanel();
        JPanel panel02 = new JPanel();
        miPrimeraVentana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        miPrimeraVentana.setBounds(200,150,500,250);

        JButton boton01 = new JButton("Boton 01");
        JButton boton02 = new JButton("Boton 02");
        JButton boton03 = new JButton("Boton 03");


        miPrimeraVentana.add(boton01);

        /**
        * CENTRARLO VERTICALMENTE USANDO BOXLAYOUT
        */
        // Establece un BoxLayout en panel01 con alineación centrada
        panel01.setLayout(new BoxLayout(panel01, BoxLayout.X_AXIS));
        panel01.add(Box.createHorizontalGlue()); // Espaciado a la izquierda
        panel01.add(boton02);
        panel01.add(Box.createHorizontalGlue()); // Espaciado a la derecha

        /**
         * CENTRARLO VERTICALMENTE USANDO GRIDBAGLAYOUT
         *
         *       //   Establece un GridBagLayout en panel01
         *
         *         panel01.setLayout(new GridBagLayout());
         *         GridBagConstraints gbc = new GridBagConstraints();
         *         gbc.fill = GridBagConstraints.HORIZONTAL;
         *         panel01.add(boton02, gbc);
         */



        panel02.add(boton03);

        panel01.setBackground(Color.red);
        panel02.setBackground(Color.blue);



        miPrimeraVentana.add(panel01);
        miPrimeraVentana.add(panel02);

       // miPrimeraVentana.setLayout(new GridLayout());
        miPrimeraVentana.setLayout(new GridLayout());



        miPrimeraVentana.setVisible(true);

    }
}
