package PruebasGUI;

import javax.swing.*;

public class Formulario_GUI extends JFrame {




    private JPanel mainPanel;
    private JPanel panel_izquierdo;
    private JPanel panel_derecho;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JTextField textField5;
    private JTable table1;
    private JLabel titulo;
    private JButton boton_nuevo;
    private JButton boton_eliminar;
    private JButton boton_añadir;
    private JButton boton_modificar;
    private JPanel panel_botones;
    private JPanel panel_formulario;
    private JPanel panel_titulo;


    public static void main(String[] args) {
        Formulario_GUI formulario = new Formulario_GUI();
        formulario.setContentPane(formulario.mainPanel);
        formulario.setTitle("Formulario");
        formulario.setSize(900,550);
        formulario.setVisible(true);
        formulario.setLocationRelativeTo(null);
        formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }


    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
