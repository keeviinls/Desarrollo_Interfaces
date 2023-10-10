package Layouts;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class prueba2_gridbaglayout extends JFrame {
    private JPanel mainPanel;
    private JTextField barra_texto;

    private JTextArea area_texto;
    private JLabel label;
    private JButton boton;

    public prueba2_gridbaglayout(){

        mainPanel = new JPanel();
        mainPanel.setLayout(new GridBagLayout());

        /** ---------------------------------------------------------------**/
        /** PRIMERA FILA **/
        mainPanel.add(
                label = new JLabel("Full Name"),
                new GridBagConstraints(
                        0,
                        0,
                        1,
                        1,
                        1.0,
                        0.1,
                        GridBagConstraints.EAST,
                        GridBagConstraints.CENTER,
                        new Insets(0,0,0,0),
                        10,
                        0
                )

        );

        mainPanel.add(
                barra_texto= new JTextField(),
                new GridBagConstraints(
                        1,
                        0,
                        3,
                        1,
                        1.0,
                        0.1,
                        GridBagConstraints.CENTER,
                        GridBagConstraints.BOTH,
                        new Insets(0,0,0,0),
                        0,
                        0
                )

        );

        /** ---------------------------------------------------------------**/
        /** SEGUNDA FILA **/

        mainPanel.add(
                label = new JLabel("Street"),
                new GridBagConstraints(
                        1,
                        1,
                        1,
                        1,
                        2.0,
                        0.1,
                        GridBagConstraints.CENTER,
                        GridBagConstraints.CENTER,
                        new Insets(0,0,0,0),
                        0,
                        0
                )

        );

        mainPanel.add(
                label = new JLabel("City"),
                new GridBagConstraints(
                        2,
                        1,
                        1,
                        1,
                        1.0,
                        0.1,
                        GridBagConstraints.CENTER,
                        GridBagConstraints.CENTER,
                        new Insets(0,0,0,0),
                        0,
                        0
                )

        );

        mainPanel.add(
                label = new JLabel("Zip Code"),
                new GridBagConstraints(
                        3,
                        1,
                        1,
                        1,
                        1.0,
                        0.1,
                        GridBagConstraints.CENTER,
                        GridBagConstraints.CENTER,
                        new Insets(0,0,0,0),
                        0,
                        0
                )

        );



        /** ---------------------------------------------------------------**/
        /** TERCERA FILA **/

        mainPanel.add(
                label = new JLabel("Address"),
                new GridBagConstraints(
                        0,
                        2,
                        1,
                        1,
                        1.0,
                        0.1,
                        GridBagConstraints.EAST,
                        GridBagConstraints.CENTER,
                        new Insets(0,0,0,0),
                        10,
                        0
                )
        );

        mainPanel.add(
                barra_texto= new JTextField(),
                new GridBagConstraints(
                        1,
                        2,
                        1,
                        1,
                        2.0,
                        0.1,
                        GridBagConstraints.CENTER,
                        GridBagConstraints.BOTH,
                        new Insets(0,0,0,0),
                        0,
                        0
                )
        );

        mainPanel.add(
                barra_texto= new JTextField(),
                new GridBagConstraints(
                        2,
                        2,
                        1,
                        1,
                        1.0,
                        0.1,
                        GridBagConstraints.CENTER,
                        GridBagConstraints.BOTH,
                        new Insets(0,0,0,0),
                        0,
                        0
                )
        );

        mainPanel.add(
                barra_texto= new JTextField(),
                new GridBagConstraints(
                        3,
                        2,
                        1,
                        1,
                        1.0,
                        0.1,
                        GridBagConstraints.CENTER,
                        GridBagConstraints.BOTH,
                        new Insets(0,0,0,0),
                        0,
                        0
                )
        );

        /** ---------------------------------------------------------------**/
        /** CUARTA FILA **/

        mainPanel.add(
                label = new JLabel("Phone"),
                new GridBagConstraints(
                        0,
                        3,
                        1,
                        1,
                        1.0,
                        0.1,
                        GridBagConstraints.EAST,
                        GridBagConstraints.CENTER,
                        new Insets(0,0,0,0),
                        10,
                        0
                )
        );

        mainPanel.add(
                barra_texto= new JTextField(),
                new GridBagConstraints(
                        1,
                        3,
                        1,
                        1,
                        2.0,
                        0.1,
                        GridBagConstraints.CENTER,
                        GridBagConstraints.BOTH,
                        new Insets(0,0,0,0),
                        0,
                        0
                )
        );

        mainPanel.add(
                label = new JLabel("Age"),
                new GridBagConstraints(
                        2,
                        3,
                        1,
                        1,
                        1.0,
                        0.1,
                        GridBagConstraints.EAST,
                        GridBagConstraints.CENTER,
                        new Insets(0,0,0,0),
                        10,
                        0
                )
        );

        mainPanel.add(
                barra_texto= new JTextField(),
                new GridBagConstraints(
                        3,
                        3,
                        1,
                        1,
                        1.0,
                        0.1,
                        GridBagConstraints.CENTER,
                        GridBagConstraints.BOTH,
                        new Insets(0,0,0,0),
                        0,
                        0
                )
        );

        /** ---------------------------------------------------------------**/
        /** QUINTA FILA **/

        mainPanel.add(
                label = new JLabel("Description"),
                new GridBagConstraints(
                        0,
                        4,
                        1,
                        1,
                        1.0,
                        1.0,
                        GridBagConstraints.NORTHEAST,
                        GridBagConstraints.CENTER,
                        new Insets(0,0,0,0),
                        10,
                        0
                )
        );

        mainPanel.add(
                area_texto= new JTextArea(),
                new GridBagConstraints(
                        1,
                        4,
                        3,
                        1,
                        1.0,
                        3.0,
                        GridBagConstraints.CENTER,
                        GridBagConstraints.BOTH,
                        new Insets(0,0,0,0),
                        0,
                        0
                )
        );

        /** ---------------------------------------------------------------**/
        /** SEXTA FILA **/
        mainPanel.add(
                boton = new JButton("Submit"),
                new GridBagConstraints(
                        2,
                        5,
                        2,
                        1,
                        1.0,
                        0.1,
                        GridBagConstraints.CENTER,
                        GridBagConstraints.BOTH,
                        new Insets(0,0,0,0),
                        0,
                        0
                )

        );

        add(mainPanel);

    }
    public static void main(String[] args) {

        prueba2_gridbaglayout prueba1 = new  prueba2_gridbaglayout();
        prueba1.setBounds(0,0, 400,300);
        prueba1.setVisible(true);

        prueba1.setLocationRelativeTo(null);
        prueba1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }


}
