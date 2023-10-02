package TutorialYoutube;

import javax.swing.*;

public class Video26_JLabel extends JFrame{

    private JLabel label1;
    private JLabel label2;

    public Video26_JLabel(){
        setLayout(null);

        label1 = new JLabel("interfaz grafica");
        label1.setBounds(10,20,30,30);  //PONEMOS 30, SOLO PARA VER QUE AL EJECUTARLO, NO SE VE LA FRASE ENTERA, YA QUE SE CORTA POR EL CORTO
        // TAMAÑO QUE TIENE

        add(label1);

        label2 = new JLabel("Version 1.0, LABEL 2");
        label2.setBounds(10,100,100,30);
        add(label2);
    }

    public static void main(String[] args) {
        Video26_JLabel formulario1 = new Video26_JLabel();
        formulario1.setBounds(0,0, 500,200);
        formulario1.setResizable(false);
        formulario1.setVisible(true);
        formulario1.setLocationRelativeTo(null);

    }

}
