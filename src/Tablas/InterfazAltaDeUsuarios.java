package Tablas;

import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class InterfazAltaDeUsuarios extends JFrame {

    private JLabel nombre, nombre2, nombre3, nombre4, nombre5, nombre6;
    private JTextField barra_texto, barra_texto2, barra_texto3, barra_texto4, barra_texto5, barra_texto6;
    private DefaultTableModel tableModel;
    private JTable tabla;

    public InterfazAltaDeUsuarios() {
        setTitle("Interfaz Alta de Usuarios");

        JPanel mainpanel = new JPanel();
        mainpanel.setLayout(new BorderLayout());

        /**
         * ----------------------------------------------------------------------------------
         * ----------------------------------PANEL ARRIBA-------------------------------------
         * ----------------------------------------------------------------------------------
         */

        JPanel panel_arriba = new JPanel();
        panel_arriba.setLayout(new GridLayout(6, 2));

        nombre = new JLabel("ID");
        nombre2 = new JLabel("Nombre");
        nombre3 = new JLabel("Apellidos");
        nombre4 = new JLabel("DNI");
        nombre5 = new JLabel("Email");
        nombre6 = new JLabel("Password");

        barra_texto = new JTextField();
        barra_texto2 = new JTextField();
        barra_texto3 = new JTextField();
        barra_texto4 = new JTextField();
        barra_texto5 = new JTextField();
        barra_texto6 = new JTextField();

        for (JLabel label : Arrays.asList(nombre, nombre2, nombre3, nombre4, nombre5, nombre6)) {
            label.setHorizontalAlignment(SwingConstants.RIGHT);
            label.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 10));
        }

        panel_arriba.add(nombre);
        panel_arriba.add(barra_texto);
        panel_arriba.add(nombre2);
        panel_arriba.add(barra_texto2);
        panel_arriba.add(nombre3);
        panel_arriba.add(barra_texto3);
        panel_arriba.add(nombre4);
        panel_arriba.add(barra_texto4);
        panel_arriba.add(nombre5);
        panel_arriba.add(barra_texto5);
        panel_arriba.add(nombre6);
        panel_arriba.add(barra_texto6);

        mainpanel.add(panel_arriba, BorderLayout.NORTH);

        /**
         * ----------------------------------------------------------------------------------
         * ----------------------------------PANEL MEDIO-------------------------------------
         * ----------------------------------------------------------------------------------
         */

        JPanel panel_medio = new JPanel();

        JButton boton1 = new JButton("Nuevo");
        JButton boton2 = new JButton("Añadir");
        JButton boton3 = new JButton("Modificar");
        JButton boton4 = new JButton("Eliminar");

        panel_medio.add(boton1);
        panel_medio.add(boton2);
        panel_medio.add(boton3);
        panel_medio.add(boton4);
        panel_medio.setBackground(Color.red);
        mainpanel.add(panel_medio, BorderLayout.CENTER);

        // Agregar un ActionListener al botón "Añadir"
        boton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Obtener el texto de los JTextField
                String id = barra_texto.getText();
                String nombre = barra_texto2.getText();
                String apellidos = barra_texto3.getText();
                String dni = barra_texto4.getText();
                String email = barra_texto5.getText();
                String password = barra_texto6.getText();

                // Crear una nueva fila de datos
                String[] nuevaFila = {id, nombre, apellidos, dni, email, password};

                // Agregar la nueva fila al DefaultTableModel
                DefaultTableModel model = (DefaultTableModel) tabla.getModel();
                model.addRow(nuevaFila);

                // Limpiar los JTextField después de agregar la fila
                barra_texto.setText("");
                barra_texto2.setText("");
                barra_texto3.setText("");
                barra_texto4.setText("");
                barra_texto5.setText("");
                barra_texto6.setText("");
            }
        });

        /**
         * ----------------------------------------------------------------------------------
         * ----------------------------------PANEL ABAJO-------------------------------------
         * ----------------------------------------------------------------------------------
         */

        JPanel panel_abajo = new JPanel();
        panel_abajo.setBackground(Color.green);

        // Crear la tabla con las columnas
        String[] cabezera = {"ID", "Nombre", "Apellidos", "DNI", "Email", "Password"};
        String[][] datos = {
        };

        DefaultTableModel mod = new DefaultTableModel(datos, cabezera);
        tabla = new JTable(mod);

        // Configura el renderizador personalizado para la tabla
        // Configura el renderizador personalizado para las filas de datos
        tabla.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                Component cell = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);

                // Configura el color de fondo de las filas de datos en amarillo (excepto la fila de encabezado)
                if (row > 0) {
                    cell.setBackground(Color.YELLOW);
                }

                return cell;
            }
        });

        // Configura el renderizador personalizado para las cabeceras de la tabla
        tabla.getTableHeader().setDefaultRenderer(new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                Component cell = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);

                // Configura el color de fondo de las cabeceras en rojo
                cell.setBackground(Color.RED);
                cell.setForeground(Color.WHITE); // Cambia el color de texto de las cabeceras a blanco

                return cell;
            }
        });


        // Configura la tabla para ajustar automáticamente la altura de las filas
        tabla.setFillsViewportHeight(true);

        // Crea un JScrollPane y agrega la tabla a él
        JScrollPane scrollPane = new JScrollPane(tabla);

        panel_abajo.add(scrollPane);
        mainpanel.add(panel_abajo, BorderLayout.SOUTH);
        add(mainpanel);
    }

    public static void main(String[] args) {
        InterfazAltaDeUsuarios interfazAltaUsuarios = new InterfazAltaDeUsuarios();
        interfazAltaUsuarios.setBounds(0, 0, 520, 430);
        interfazAltaUsuarios.setVisible(true);
        interfazAltaUsuarios.setLocationRelativeTo(null);
        interfazAltaUsuarios.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}