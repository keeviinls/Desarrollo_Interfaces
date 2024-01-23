package examen_hecho_por_mi;

import PruebasGUI.conexion;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class Formulario_examen_prueba extends JFrame {

    int idc;

    private JPanel mainPanel;
    private JPanel panel_izquierdo;
    private JPanel panel_derecho;
    private JTextField texto_nombre;
    private JTextField texto_fecha;
    private JTextField texto_hora;
    private JTextField texto_tarea;

    private int contadorID = 1;

    private JLabel titulo;
    private JButton boton_agregar;
    private JButton boton_editar;
    private JButton boton_eliminar;
    private JPanel panel_botones;
    private JPanel panel_formulario;
    private JPanel panel_titulo;
    private JLabel titulo_nombre;
    private JLabel titulo_apellidos;
    private JLabel titulo_dni;
    private JLabel titulo_email;
    private JLabel titulo_contrasena;
    private JPasswordField texto_descripcion;
    private JTextField numero_id;
    private JButton boton_cambiar_estado;
    private JPanel panel_tabla;
    private JTable tabla;
    private JButton boton_filtrar;
    private JButton boton_informacion_adicional;
    private JButton boton_ayuda;
    private DefaultTableModel model;

    private String id;
    private String nombre;
    private String apellidos;
    private String dni;
    private String email;
    private char[] contrasena;


    public Formulario_examen_prueba() {

        crear_tabla();

        boton_agregar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nombre = texto_nombre.getText().trim();
                String fecha = texto_fecha.getText().trim();
                String hora = texto_hora.getText().trim();
                String tarea = texto_tarea.getText().trim();
                String descripcion = texto_descripcion.getText().trim();

                if (nombre.isEmpty() || fecha.isEmpty() || hora.isEmpty()  || tarea .isEmpty()){
                    JOptionPane.showMessageDialog(null, "Es obligatorio rellenar los campos todos los campos, exceptuando descripcion", "Error faltan datos", JOptionPane.ERROR_MESSAGE);
                }
                else {
                    Object[] nuevafila = {nombre, fecha, hora, tarea, descripcion};
                    DefaultTableModel model = (DefaultTableModel) tabla.getModel();
                    model.addRow(nuevafila);
                }

                texto_nombre.setText("");
                texto_fecha.setText("");
                texto_hora.setText("");
                texto_tarea.setText("");
                texto_descripcion.setText("");

            }
        });
        boton_ayuda.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Este formulario recoge informacion sobre la fecha, hora, tarea y descripcion de una tarea, mediante los diferentes botones, podras realizar diferentes acciones. Las tareas podran ser visualizadas en la tabla" , "Bienvenido a Ayuda", JOptionPane.PLAIN_MESSAGE);

            }
        });
        boton_editar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Primero debes seleccionar una fila de la tabla", "Selecciona una fila", JOptionPane.ERROR_MESSAGE);

            }
        });
        boton_cambiar_estado.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Primero debes seleccionar una fila de la tabla", "Selecciona una fila", JOptionPane.ERROR_MESSAGE);
            }
        });
        boton_eliminar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                int filaseleccionada = tabla.getSelectedRow();
                if (filaseleccionada >= 0) {
                    DefaultTableModel model = (DefaultTableModel) tabla.getModel();
                    model.removeRow(filaseleccionada);
                } else {
                    JOptionPane.showMessageDialog(null, "Por favor, seleccione una fila para eliminar.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }
    private void crear_tabla() {
        Object [][] data = {
        };
        tabla.setModel(new DefaultTableModel(
                data,
                new String[]{"NOMBRE", "FECHA", "HORA", "TAREA", "DESCRIPCIÓN"}
        ));
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Formulario");
        frame.setContentPane(new Formulario_examen_prueba().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }



}
