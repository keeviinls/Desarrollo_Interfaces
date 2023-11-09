package Ejercicios_GUI;

import javax.swing.*;

public class Formulario_GUI {
    private JPanel mainPanel;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JTextField textField5;
    private JTextField textField6;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Formulario_GUI");
        frame.setContentPane(new Formulario_GUI().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}




