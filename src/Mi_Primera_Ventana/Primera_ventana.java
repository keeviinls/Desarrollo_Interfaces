package Mi_Primera_Ventana;

import javax.swing.*;

public class Primera_ventana {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setBounds(1000,500,300,200);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel mainPanel = new JPanel();

        JLabel pregunta1 = new JLabel("Apellidos");
        JLabel pregunta2 = new JLabel("Nombre");
        JLabel pregunta3 = new JLabel("Sexo");
        JLabel pregunta4 = new JLabel("Nacionalidad");
        JLabel pregunta5 = new JLabel("Fecha de Nacimiento");
        JLabel pregunta6 = new JLabel("Domicilio");

        JTextField apellidos = new JTextField(15);
        JTextField nombre = new JTextField(10);
        JComboBox<String> sexo = new JComboBox<>(new String[]{"Masculino", "Femenino", "Otro"});
        JTextField nacionalidad = new JTextField(10);
        JTextField fecha_nacimiento = new JTextField(10);
        JTextField domicilio = new JTextField(15);

        mainPanel.add(pregunta1); mainPanel.add(apellidos);

        mainPanel.add(pregunta2); mainPanel.add(nombre);

        mainPanel.add(pregunta3); mainPanel.add(sexo);

        mainPanel.add(pregunta4); mainPanel.add(nacionalidad);

        mainPanel.add(pregunta5); mainPanel.add(fecha_nacimiento);

        mainPanel.add(pregunta6); mainPanel.add(domicilio);

        f.setContentPane(mainPanel);

    }
}
