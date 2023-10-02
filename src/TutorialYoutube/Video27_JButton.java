package TutorialYoutube;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*; //ESTA LIBRERIA SIRVE PARA CONTROLAR LOS EVENTOS QUE TENDRA LA INTERFAZ, POR EJEMPLO UN BOTON DE CERRAR, SI LO PULSAMOS
// SE CERRARA

public class Video27_JButton  extends JFrame implements ActionListener {  //ActionListener : sirve para que escuche que se ha ejecutado
    //un evento dentro de Jframe

    JButton boton1;

    public Video27_JButton(){
        setLayout(null);
        boton1 = new JButton("CERRAR");
        boton1.setBounds(300,250,100,30);
        boton1.setForeground(Color.green);
        Font fuente = new Font("Arial", Font.PLAIN, 30);
        boton1.setFont(fuente);

        add(boton1);
        boton1.addActionListener(this); //INDICAMOS QUE AL BOTON1 SE LE VA A AGREGAR UN EVENTO, OSEA TENDRA UNA FUNCIONALIDAD (EVENTO)
    }

    public void actionPerformed(ActionEvent evento_cerrar){  //ESTO ES PARA CAPTURAR EL EVENTO, PARA QUE CUANDO EL USUARIO DE CLICK
        //ESE EVENTO LO GUARDA AQUI
        if (evento_cerrar.getSource() == boton1){ /* getSource lo que hace es recuperar el evento que se guardo en evento_cerrar
         si ese evento es igual al boton que yo espero que de click, va a ejecutar lo indicado
         */

            System.exit(0); //Indicamos que al presionar el boton, el evento que debe ejecutar es que cierre la interfaz grafica

        }
    }

    public static void main(String[] args) {
        Video27_JButton formulario1 = new Video27_JButton();
        formulario1.setBounds(0,0, 500,350);
        formulario1.setResizable(false);
        formulario1.setVisible(true);
        formulario1.setLocationRelativeTo(null);
    }
}
