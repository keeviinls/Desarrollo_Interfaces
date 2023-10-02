package TutorialYoutube;

import javax.swing.*;

public class Video25_JFrame extends JFrame{

    public Video25_JFrame(){
        setLayout(null);
    }

    public static void main(String[] args) {

        Video25_JFrame formulario1 = new Video25_JFrame();
        formulario1.setBounds(350,100,400,550);
        formulario1.setVisible(true);
       // formulario1.setLocationRelativeTo(null);
        formulario1.setResizable(false);  // ESTO ES PARA INDICAR QUE EL USUARIO NO PUEDA MODIFICAR EL TAMAÑO DE LA INTERFAZ


    }
}
