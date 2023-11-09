package Ejercicios_GUI;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;

public class HolaMundo extends JFrame {
    private JLabel label1;
    private JTextField texto1;
    private JButton boton1;
    private JPanel mainPanel;


    public HolaMundo(){

        setContentPane(mainPanel);
        setTitle("GUI de HolaMundo");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(500,400);
        setLocationRelativeTo(null);
        setVisible(true);
        boton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nombre = texto1.getText();
                JOptionPane.showMessageDialog(HolaMundo.this, "Hola mundo, bienvenido "+nombre);
            }
        });

    }

    public static void main(String[] args) {
        new HolaMundo();
    }


}
