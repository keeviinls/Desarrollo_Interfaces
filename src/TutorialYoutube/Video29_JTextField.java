package TutorialYoutube;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Video29_JTextField  extends JFrame implements ActionListener {

    private JTextField textfield1;
    private JLabel label1;
    private JButton boton1;

    public Video29_JTextField(){
        setLayout(null);;
        label1 = new JLabel("USUARIO: ");
        label1.setBounds(10,10,100,30);
        add(label1);

        textfield1 = new JTextField();
        textfield1.setBounds(120,17,150,20);
        add(textfield1);

        boton1 = new JButton("Aceptar");
        boton1.setBounds(10,80,100,30);
        add(boton1);
        boton1.addActionListener(this);
    }

    public void actionPerformed(ActionEvent evento_pulsar){
        if (evento_pulsar.getSource() == boton1){
            String texto = textfield1.getText();  //CREAMOS UN STRING QUE GUARDARA EL CONTENIDO DEL TEXTFIELD, OSEA LO QUE ESCRIBE EL USUARIO DENTRO
            setTitle(texto); //ESTABLECEMOS QUE EL TITULO DE LA VENTANA SEA IGUAL AL TEXTO STRING
        }
    }

    public static void main(String[] args) {
        Video29_JTextField formulario1 = new Video29_JTextField();
        formulario1.setBounds(0,0, 300,150);
        formulario1.setResizable(false);
        formulario1.setVisible(true);
        formulario1.setLocationRelativeTo(null);
    }
}
