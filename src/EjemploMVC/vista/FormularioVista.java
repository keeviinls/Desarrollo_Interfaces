package EjemploMVC.vista;

import EjemploMVC.controlador.Controlador;

import javax.swing.*;



public class FormularioVista {
    private JTextField txtNombre;
    private JTextField txtApellidos;
    private JButton btnSaludar;

    public FormularioVista() {
        JFrame frame = new JFrame("Formulario MVC");
        JPanel panel = new JPanel();

        txtNombre = new JTextField(15);
        txtApellidos = new JTextField(15);
        btnSaludar = new JButton("Saludar");

        panel.add(new JLabel("Nombre:"));
        panel.add(txtNombre);
        panel.add(new JLabel("Apellidos:"));
        panel.add(txtApellidos);
        panel.add(btnSaludar);

        frame.getContentPane().add(panel);
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public String getNombre() {
        return txtNombre.getText();
    }

    public String getApellidos() {
        return txtApellidos.getText();
    }

    public void mostrarMensaje(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje);
    }

    public void agregarControlador(Controlador controlador) {
        btnSaludar.addActionListener(controlador);
    }
}
