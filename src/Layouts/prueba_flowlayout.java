package Layouts;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.ActionEvent;

public class prueba_flowlayout extends JFrame  {

    private JPanel mainPanel, mainPanel2;
    private JButton boton1, boton2, boton3, boton4, boton5, boton6;

     private JRadioButton botonradio1, botonradio2;
     private JTextField barra_texto;

    public prueba_flowlayout() {



        mainPanel = new JPanel();

        mainPanel.setLayout(new FlowLayout());

        mainPanel.add(
            boton1 = new JButton("Button 1")
        );
        mainPanel.add(
                boton2 = new JButton("Button 2")
        );
        mainPanel.add(
                boton3 = new JButton("Button 3")
        );
        mainPanel.add(
                boton4 = new JButton("Long-Named Button 4")
        );
        mainPanel.add(
                boton5 = new JButton("5")
        );

        mainPanel.add(
                botonradio1 = new JRadioButton ("Left to right")
        );

        mainPanel.add(
                botonradio2 = new JRadioButton ("Right to right")
        );

        mainPanel.add(
                boton6 = new JButton("Apply Orientation")
        );


        for (int i=1; i<100;i++){
            JButton botonprueba = new JButton("boton "+i);
            mainPanel.add(botonprueba);
        }

        mainPanel.add(barra_texto);


        add(mainPanel);

    }

    public static void main(String[] args) {

        prueba_flowlayout prueba1 = new  prueba_flowlayout();
        prueba1.setBounds(0,0, 400,200);
        prueba1.setVisible(true);

        prueba1.setLocationRelativeTo(null);
        prueba1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }


}
