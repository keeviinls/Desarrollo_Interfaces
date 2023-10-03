package Layouts;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class prueba_gridbaglayout extends JFrame implements ActionListener {
    private JPanel mainPanel;
    private JTextField texto;
    private JButton boton;
    public prueba_gridbaglayout(){

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new GridBagLayout());
        mainPanel.add(
                boton = new JButton("Button 1"),
                new GridBagConstraints(
                        0,
                        0,
                        1,
                        1,
                        1.0,
                        1.0,
                        GridBagConstraints.CENTER,
                        GridBagConstraints.BOTH,
                        new Insets(0,0,0,0),
                        0,
                        0
                )

        );
        boton.addActionListener(this);

        mainPanel.add(
                new JButton("Button 2"),
                new GridBagConstraints(
                        1,
                        0,
                        1,
                        1,
                        1.0,
                        1.0,
                        GridBagConstraints.CENTER,
                        GridBagConstraints.BOTH,
                        new Insets(0,0,0,0),
                        0,
                        0
                ));


        mainPanel.add(
                new JButton("Button 3"),
                new GridBagConstraints(
                        2,
                        0,
                        1,
                        1,
                        1.0,
                        1.0,
                        GridBagConstraints.CENTER,
                        GridBagConstraints.BOTH,
                        new Insets(0,0,0,0),
                        0,
                        0
                ));


        mainPanel.add(

               // new JButton("Long named button 4"),
                texto = new JTextField(),
                new GridBagConstraints(
                        0,
                        1,
                        3,
                        1,
                        1.0,
                        4.0,
                        GridBagConstraints.CENTER,
                        GridBagConstraints.BOTH,
                        new Insets(0,0,0,0),
                        0,
                        0
                ));


        mainPanel.add(
                new JButton("5"),
                new GridBagConstraints(
                        1,
                        2,
                        2,
                        1,
                        1.0,
                        1.0,
                        GridBagConstraints.SOUTH,
                        GridBagConstraints.HORIZONTAL,
                        new Insets(0,0,0,0),
                        0,
                        0
                ));



        add(mainPanel);
    }

    public void actionPerformed(ActionEvent evento_pulsar) {
        if (evento_pulsar.getSource() == boton) {
            texto.setText("Has pulsado el boton 1");
        }
    }


    public static void main(String[] args) {

        prueba_gridbaglayout prueba1 = new prueba_gridbaglayout();
        prueba1.setBounds(0,0, 400,200);
        prueba1.setVisible(true);

        prueba1.setLocationRelativeTo(null);
        prueba1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
