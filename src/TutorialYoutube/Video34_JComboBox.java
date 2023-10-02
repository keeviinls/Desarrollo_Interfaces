package TutorialYoutube;

import javax.swing.*;
import java.awt.event.*;

public class Video34_JComboBox extends JFrame implements ItemListener {

    private JComboBox combo1;

    public Video34_JComboBox(){
        setLayout(null);
        combo1 = new JComboBox();
        combo1.setBounds(10,10,80,20);
        add(combo1);

        combo1.addItem("rojo");
        combo1.addItem("azul");
        combo1.addItem("verde");
        combo1.addItem("marron");
        combo1.addItem("amarillo");
        combo1.addItem("negro");
        combo1.addItemListener(this);  //INDICAMOS QUE EL COMBO1 VA A TENER UN EVENTO
    }

    public void itemStateChanged (ItemEvent evento_lista) { //INDICAMOS QUE CADA VEZ QUE HAYA UNA SELCCION DIFERENTE EN LA LISTA, VA A HACER EL EVENTO INDICADO
        if (evento_lista.getSource() == combo1){
            String seleccion = combo1.getSelectedItem().toString();
            setTitle(seleccion);   //PARA QUE EL TITULO DE LA VENTANA SE LLAME IGUAL QUE EL COLOR SELECCIONADO
        }
    }

    public static void main(String[] args) {
        Video34_JComboBox formulario1 = new Video34_JComboBox();
        formulario1.setBounds(0,0,400,250);
        formulario1.setVisible(true);
        formulario1.setResizable(false);
        formulario1.setLocationRelativeTo(null);
    }
}
