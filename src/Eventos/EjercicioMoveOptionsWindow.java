package Eventos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EjercicioMoveOptionsWindow extends JFrame {

    private JPanel mainpanel, panelizq, panelcentro, panelder;
    private JLabel label, label2;
    private JList<String> list;
    private DefaultListModel<String> listModel;

    public EjercicioMoveOptionsWindow(){
        super("Ejemplo MoveOptionsWindow");

        //Creamos el titulo de cada panel;
        label = new JLabel("Disponible");
        label2 = new JLabel("Seleccionados");

        //Creamos el Jlist y agregamos nombres

        listModel = new DefaultListModel<String>();
        list = new JList<String>();
        listModel.addElement("PRUEBA");
        listModel.addElement("PRUEBA");
        listModel.addElement("PRUEBA");
        list.setModel(listModel);

        //PANEL IZQUIERDO
        panelizq=new JPanel();
        panelizq.setLayout(new FlowLayout());
        panelizq.add(label);
        panelizq.add(list);

        mainpanel=new JPanel();
        mainpanel.setBackground(Color.red);
        mainpanel.add(panelizq);
        add(mainpanel);





    }


    public static void main(String[] args) {
        EjercicioMoveOptionsWindow tabla= new EjercicioMoveOptionsWindow();
        tabla.setBounds(0, 0, 500, 300);
        tabla.setVisible(true);
        tabla.setLocationRelativeTo(null); // Centrar la ventana en la pantalla
        tabla.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }




}