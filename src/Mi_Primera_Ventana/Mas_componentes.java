package Mi_Primera_Ventana;

import Layouts.prueba_gridbaglayout;

import javax.swing.*;
import java.awt.*;

public class Mas_componentes extends JFrame {
    private JPanel mainPanel;

    private JList lista;

    private JScrollPane scrollpane1;
    private JPasswordField contraseña;
    private JTextArea area_texto;
    private JLabel label1, label2, label3, label4;

    private JScrollPane scroll;
    private JTextField barra_texto;

    public Mas_componentes(){



        mainPanel = new JPanel();
        mainPanel.setLayout(new FlowLayout());
        // mainPanel.setBackground(Color.red);
        add(mainPanel);

        label1 = new JLabel("NOMBRE");
        label1.setBackground(Color.blue);
        mainPanel.add(label1);

        barra_texto = new JTextField(15);
        mainPanel.add(barra_texto);

        label1 = new JLabel("CONTRASEÑA");
        mainPanel.add(label1);

        contraseña = new JPasswordField(15);
        mainPanel.add(contraseña);

        label1 = new JLabel("DIME TU EDAD");
        mainPanel.add(label1);

        lista = new JList<>();
        DefaultListModel modelo = new DefaultListModel<>();

        for (int i = 0; i<20;i++){
            modelo.addElement(i);
            lista.setModel(modelo);
        }

        lista.setBounds(0,0,30,50);

        mainPanel.add(lista);

        scrollpane1 = new JScrollPane(lista);
        scrollpane1.setPreferredSize(new java.awt.Dimension(40, 60));

        mainPanel.add(scrollpane1);


        label1 = new JLabel("MAS INFORMACION");
        mainPanel.add(label1);

        area_texto = new JTextArea();
        area_texto.setBounds(0,0,200,200);
        mainPanel.add(area_texto);





    }

    public static void main(String[] args) {

        Mas_componentes prueba1 = new Mas_componentes();
        prueba1.setBounds(0,0, 400,400);
        prueba1.setVisible(true);

        prueba1.setLocationRelativeTo(null);
        prueba1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

}
