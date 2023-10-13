package Eventos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class Ejercicio_InterfaceSeleccion extends JFrame{
    private JList<String> lista_izquierda, listaderecha;
    private DefaultListModel<String> modelo_izquierda, modelo_derecha;
    private JLabel label1, label2;

    public Ejercicio_InterfaceSeleccion(){

        JPanel mainpanel = new JPanel(new GridBagLayout());
        label1 = new JLabel("Disponibles:");
        mainpanel.add(label1,
                new GridBagConstraints(0,0, 1,1,0,0,GridBagConstraints.CENTER,GridBagConstraints.BOTH,new Insets(0,50,5,0),100,0));

        label2 = new JLabel("Seleccionados:");
        label2.setBackground(Color.red);
        mainpanel.add(label2,
                new GridBagConstraints(2,0, 1,1,0,0,GridBagConstraints.CENTER,GridBagConstraints.BOTH,new Insets(0,0,0,50),100,0));

        modelo_izquierda = new DefaultListModel<>();
        lista_izquierda = new JList<>(modelo_izquierda);
        modelo_izquierda.addElement("PRIMERO");
        modelo_izquierda.addElement("PRIMERO");
        modelo_izquierda.addElement("PRIMERO");
        modelo_izquierda.addElement("PRIMERO");
        mainpanel.add(lista_izquierda,
                new GridBagConstraints(0,1, 1,4,0,0,GridBagConstraints.CENTER,GridBagConstraints.BOTH,new Insets(0,50,0,0),0,0));

        JButton boton_uno = new JButton(">>");
        boton_uno.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                for (int i = 0; i < modelo_izquierda.size(); i++) {
                    modelo_derecha.addElement(modelo_izquierda.getElementAt(i));
                }
                modelo_izquierda.removeAllElements();
            }
        });

        mainpanel.add(boton_uno,
                new GridBagConstraints(1,1, 1,1,0,0,GridBagConstraints.CENTER,GridBagConstraints.BOTH,new Insets(0, 15,5,15),0,0));

        JButton boton_dos = new JButton(">");
        boton_dos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                List<String> elementosSeleccionados = lista_izquierda.getSelectedValuesList();
                for (String elemento : elementosSeleccionados) {
                    modelo_derecha.addElement(elemento);
                    modelo_izquierda.removeElement(elemento);
                }
            }
        });

        mainpanel.add(boton_dos,
                new GridBagConstraints(1,2, 1,1,0,0,GridBagConstraints.CENTER,GridBagConstraints.BOTH,new Insets(0,15,15,15),0,0));

        JButton boton_tres = new JButton("<");
        boton_tres.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                List<String> elementosSeleccionados = listaderecha.getSelectedValuesList();
                for (String elemento : elementosSeleccionados) {
                    modelo_izquierda.addElement(elemento);
                    modelo_derecha.removeElement(elemento);
                }
            }
        });

        mainpanel.add(boton_tres,
                new GridBagConstraints(1,3, 1,1,0,0,GridBagConstraints.CENTER,GridBagConstraints.BOTH,new Insets(0,15,5,15),0,0));

        JButton boton_cuatro = new JButton("<<");
        boton_cuatro.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                for (int i = 0; i < modelo_derecha.size(); i++) {
                    modelo_izquierda.addElement(modelo_derecha.getElementAt(i));
                }
                modelo_derecha.removeAllElements();
            }
        });

        mainpanel.add(boton_cuatro,
                new GridBagConstraints(1,4, 1,1,0,0,GridBagConstraints.CENTER,GridBagConstraints.BOTH,new Insets(0,15,0,15),0,0));

        modelo_derecha = new DefaultListModel<>();
        listaderecha = new JList<>(modelo_derecha);
        mainpanel.add(listaderecha,
                new GridBagConstraints(2,1, 1,4,0,0,GridBagConstraints.CENTER,GridBagConstraints.BOTH,new Insets(0,0,0,50),0,0));

        add(mainpanel);
    }

    public static void main(String[] args) {
        Ejercicio_InterfaceSeleccion tabla= new Ejercicio_InterfaceSeleccion();
        tabla.setBounds(100, 100, 450, 300);
        tabla.setVisible(true);
        tabla.setLocationRelativeTo(null); // Centrar la ventana en la pantalla
        tabla.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
