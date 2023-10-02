package TutorialYoutube;

import javax.swing.*;
import java.awt.event.*;

public class Video28_ManejoBotones_y_Etiquetas extends JFrame implements ActionListener {
    private JButton boton1, boton2, boton3;

    private JLabel label1;

    public Video28_ManejoBotones_y_Etiquetas(){
        setLayout(null);
        boton1 = new JButton("Boton1");
        boton1.setBounds(10,100,90,30);
        add(boton1);
        boton1.addActionListener(this);

        boton2 = new JButton("Boton2");
        boton2.setBounds(110,100, 90,30);
        add(boton2);
        boton2.addActionListener(this);

        boton3 = new JButton("Boton3");
        boton3.setBounds(210,100, 90,30);
        add(boton3);
        boton3.addActionListener(this);

        label1 = new JLabel("En espera ...");
        label1.setBounds(10,10,300,30);
        add(label1);
    }

    public void actionPerformed(ActionEvent evento_pulsar){
        if (evento_pulsar.getSource() == boton1){
            label1.setText("Has pulsado el boton 1");
        }

        else if (evento_pulsar.getSource() == boton2) {
            label1.setText("Has pulsado el boton 2");
        }

        else if (evento_pulsar.getSource() == boton3) {
            label1.setText("Has pulsado el boton 3");
        }
    }

    public static void main(String[] args) {
        Video28_ManejoBotones_y_Etiquetas formulario1 = new Video28_ManejoBotones_y_Etiquetas();
        formulario1.setBounds(10,10, 350,200);
        formulario1.setResizable(false);
        formulario1.setVisible(true);
        formulario1.setLocationRelativeTo(null);
    }
}
