package Tablas;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Primera_Prueba extends JFrame {


    private JTable tabla;
    private int contadorNombre = 1; // Inicializa el contador de nombre

    public Primera_Prueba(){
        JPanel mainpanel = new JPanel();
        mainpanel.setLayout(new BorderLayout());

        /**
         * ----------------------------------------------------------------------------------
         * ----------------------------------PANEL IZQUIERDA-------------------------------------
         * ----------------------------------------------------------------------------------
         */

        JPanel panel_izquierda = new JPanel();
        panel_izquierda.setBackground(Color.red);
        panel_izquierda.setLayout(new GridLayout(9, 2));

        JLabel titulo_nombre = new JLabel("Nombre");
        JLabel titulo_apellido = new JLabel("Apellido");
        JLabel titulo_favorito = new JLabel("Favorito");

        JLabel texto_nombre = new JLabel("1");

        JTextField texto_apellido = new JTextField(20);
        JPasswordField texto_favorito = new JPasswordField(20);

        panel_izquierda.add(titulo_nombre);
        panel_izquierda.add(texto_nombre);
        panel_izquierda.add(titulo_apellido);
        panel_izquierda.add(texto_apellido);
        panel_izquierda.add(titulo_favorito);
        panel_izquierda.add(texto_favorito);


        /**
         * ----------------------------------------------------------------------------------
         * ----------------------------------PANEL CENTRO------------------------------------
         * ----------------------------------------------------------------------------------
         */

        JPanel panel_central = new JPanel();
        panel_central.setBackground(Color.green);

        // Usar un GridBagLayout
        GridBagLayout gridBagLayout = new GridBagLayout();
        panel_central.setLayout(gridBagLayout);

        GridBagConstraints constraints = new GridBagConstraints();
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.insets = new Insets(5, 5, 5, 5); // Márgenes internos
        constraints.gridwidth = GridBagConstraints.REMAINDER; // El botón ocupa una fila completa

        JButton boton_nuevo = new JButton("NUEVO");
        JButton boton = new JButton("AGREGAR");
        JButton boton_eliminar = new JButton("ELIMINAR");
        JButton boton_modificar = new JButton("MODIFICAR");

        panel_central.add(boton, constraints);
        panel_central.add(boton_eliminar, constraints);
        panel_central.add(boton_nuevo, constraints);
        panel_central.add(boton_modificar, constraints);

        // Agregar un ActionListener al botón "AGREGAR"
        boton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nombre = texto_nombre.getText().trim();
                String apellido = texto_apellido.getText().trim();
                char[] contrasena = texto_favorito.getPassword();

                if (nombre.isEmpty() || apellido.isEmpty() || contrasena.length == 0) {
                    JOptionPane.showMessageDialog(null, "Por favor, complete los campos de Nombre, Apellido y Contraseña.", "Error", JOptionPane.ERROR_MESSAGE);
                } else {

                    Object[] nuevaFila = {nombre, apellido, contrasena};  // Crear una nueva fila de datos

                    DefaultTableModel model = (DefaultTableModel) tabla.getModel();
                    model.addRow(nuevaFila);  // Agregar la nueva fila al DefaultTableModel de la tabla

                    // Incrementa el contador y actualiza el valor por defecto de texto_nombre
                    contadorNombre++;
                    texto_nombre.setText(Integer.toString(contadorNombre));


                    // Limpiar los campos después de agregar la fila

                    texto_apellido.setText("");
                    texto_favorito.setText("");
                }
            }
        });

        boton_eliminar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int filaSeleccionada = tabla.getSelectedRow();

                if (filaSeleccionada >= 0) {
                    DefaultTableModel model = (DefaultTableModel) tabla.getModel();
                    model.removeRow(filaSeleccionada);
                } else {
                    JOptionPane.showMessageDialog(null, "Por favor, seleccione una fila para eliminar.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        boton_nuevo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Limpiar los campos de texto
                texto_nombre.setText("");
                texto_apellido.setText("");
                texto_favorito.setText("");
            }
        });


        /**
         * ----------------------------------------------------------------------------------
         * ----------------------------------PANEL DERECHO------------------------------------
         * ----------------------------------------------------------------------------------
         */

        JPanel panel_derecha = new JPanel();
        panel_derecha.setBackground(Color.blue);
        panel_derecha.setLayout(new FlowLayout());



        String[] cabezera = {"NOMBRE", "APELLIDOS", "FAVORITO"};
        String[][] datos = {};
        DefaultTableModel mod = new DefaultTableModel(datos,cabezera);
        tabla = new JTable(mod);
        JScrollPane scrollPane = new JScrollPane(tabla);

        panel_derecha.add(scrollPane);


        mainpanel.add(panel_izquierda, BorderLayout.WEST);
        mainpanel.add(panel_central, BorderLayout.CENTER);
        mainpanel.add(panel_derecha, BorderLayout.EAST);


        add(mainpanel);

    }


    public static void main(String[] args) {
        Primera_Prueba primeraprueba = new Primera_Prueba();
        primeraprueba.setBounds(0, 0, 520, 430);
        primeraprueba.setVisible(true);
        primeraprueba.setLocationRelativeTo(null);
        primeraprueba.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
