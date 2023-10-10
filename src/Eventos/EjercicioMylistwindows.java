package Eventos;

import Mi_Primera_Ventana.Mas_Componentes2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EjercicioMylistwindows extends JFrame implements ActionListener {

    private JPanel mainpanel;
    private JTextField texto;
    private JTextArea area_texto;
    private JButton boton1, boton2, boton3;
    private JLabel label1;

    private String texto_salto= "";

    public EjercicioMylistwindows(){

    mainpanel = new JPanel();
    mainpanel.setLayout(new GridBagLayout());


    label1 = new JLabel("JList");
    label1.setFont(new Font("Tahoma", Font.BOLD, 24));
    label1.setHorizontalAlignment(SwingConstants.CENTER);
    label1.setBorder(BorderFactory.createEmptyBorder(0, 0, 10, 0));

    mainpanel.add(
            label1,
            new GridBagConstraints(
                    0,
                    0,
                    2,
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

        mainpanel.add(
                texto = new JTextField(),
                new GridBagConstraints(
                        0,
                        1,
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

        boton1 = new JButton("Agregar");
        boton1.addActionListener(this);


                mainpanel.add(
                boton1,
                new GridBagConstraints(
                        1,
                        1,
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

        mainpanel.add(
                area_texto = new JTextArea(),
                new GridBagConstraints(
                        0,
                        2,
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



        mainpanel.add(
                boton2 = new JButton("Eliminar"),
                new GridBagConstraints(
                        0,
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

        mainpanel.add(
                boton3 = new JButton("Borrar Lista"),
                new GridBagConstraints(
                        1,
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



        add(mainpanel);

    }

    public void actionPerformed(ActionEvent evento_agregar){
        if (evento_agregar.getSource() == boton1){
            texto_salto +=texto.getText() + "\n";  // el \n es para que de un salto de linea
            area_texto.setText(texto_salto);
            texto.setText("");  //
        }
    }

    public static void main(String[] args) {
        EjercicioMylistwindows prueba1 = new EjercicioMylistwindows();

        prueba1.setBounds(0,0, 325,400);
        prueba1.setVisible(true);
        prueba1.setLocationRelativeTo(null);
        prueba1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
