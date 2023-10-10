package Mi_Primera_Ventana;

import javax.swing.*;
import java.awt.*;

public class Mas_Componentes2 extends JFrame {

    private JPanel mainPanel, panel1, panel2;

    private JList lista;

    private JScrollPane scrollpane1;
    private JPasswordField contraseña;
    private JTextArea area_texto;
    private JLabel label1;
    private JScrollPane scroll;
    private JTextField barra_texto;


    public Mas_Componentes2(){
        mainPanel = new JPanel();
        mainPanel.setLayout(new FlowLayout());
        add(mainPanel);

        panel1 = new JPanel();
        mainPanel.add(panel1);

        panel1.setLayout(new FlowLayout());

        label1 = new JLabel("NOMBRE");
        label1.setBackground(Color.blue);
        panel1.add(label1);

        barra_texto = new JTextField(15);
        panel1.add(barra_texto);

        label1 = new JLabel("CONTRASEÑA");
        panel1.add(label1);

        contraseña = new JPasswordField(15);
        panel1.add(contraseña);

        label1 = new JLabel("DIME TU EDAD");
        panel1.add(label1);

        lista = new JList<>();
        DefaultListModel modelo = new DefaultListModel<>();

        for (int i = 0; i<100;i++){
            modelo.addElement(i);
            lista.setModel(modelo);
        }

        lista.setBounds(0,0,30,30);

         panel1.add(lista);

        scrollpane1 = new JScrollPane(lista);
        scrollpane1.setPreferredSize(new java.awt.Dimension(40, 60));

        panel1.add(scrollpane1);

        panel2 = new JPanel();
        panel2.setBounds(0,0,100,100);
        panel2.setLayout(new GridBagLayout());


        mainPanel.add(panel2);

        panel2.add(
                label1 = new JLabel("MAS INFORMACION"),
                new GridBagConstraints(
                        0,
                        0,
                        1,
                        1,
                        1.0,
                        0.1,
                        GridBagConstraints.WEST,
                        GridBagConstraints.CENTER,
                        new Insets(0,0,0,0),
                        10,
                        0
                )

        );

        panel2.add(
                area_texto = new JTextArea(),
                new GridBagConstraints(
                        0,
                        1,
                        3,
                        2,
                        1.0,
                        1.0,
                        GridBagConstraints.CENTER,
                        GridBagConstraints.BOTH,
                        new Insets(0,0,0,0),
                        40,
                        120
                )


        );



        mainPanel.add(panel2);
    }

    public static void main(String[] args) {

        Mas_Componentes2 prueba1 = new Mas_Componentes2();

        prueba1.setBounds(0,0, 650,400);
        prueba1.setVisible(true);
        prueba1.setLocationRelativeTo(null);
        prueba1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
