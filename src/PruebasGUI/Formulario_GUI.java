package PruebasGUI;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Formulario_GUI extends JFrame {


    private JPanel mainPanel;
    private JPanel panel_izquierdo;
    private JPanel panel_derecho;
    private JTextField barra_nombre;
    private JTextField barra_apellidos;
    private JTextField barra_dni;
    private JTextField barra_email;

    private int contadorID = 1;

    private DefaultTableModel modelo_tabla;
    private JLabel titulo;
    private JButton boton_nuevo;
    private JButton boton_añadir;
    private JButton boton_modificar;
    private JPanel panel_botones;
    private JPanel panel_formulario;
    private JPanel panel_titulo;
    private JLabel titulo_nombre;
    private JLabel titulo_apellidos;
    private JLabel titulo_dni;
    private JLabel titulo_email;
    private JLabel titulo_contrasena;
    private JPasswordField barra_contrasena;
    private JLabel titulo_id;
    private JLabel numero_id;
    private JButton boton_eliminar;
    private JPanel panel_tabla;
    private JTable showTable;

    private String id;
    private String nombre;
    private String apellidos;
    private String dni;
    private String email;
    private String contrasena;


    public Formulario_GUI() {
        boton_nuevo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //LIMPIAR LOS CAMPOS

                barra_nombre.setText("");
                barra_apellidos.setText("");
                barra_dni.setText("");
                barra_email.setText("");
                barra_contrasena.setText("");
            }
        });



        boton_añadir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                id = numero_id.getText().trim();
                nombre = barra_nombre.getText().trim(); //PONEMOS ".TRIM" PARA ELIMINAR LOS ESPADIOS EN BLANCO AL PRINCIPIO Y FINAL DE TEXTO
                apellidos = barra_apellidos.getText().trim();
                dni = barra_dni.getText().trim();
                email = barra_email.getText().trim();
                contrasena = barra_contrasena.getText().trim();

                if (nombre.isEmpty() || apellidos.isEmpty() || email.isEmpty()){
                    JOptionPane.showMessageDialog(null, "Es obligatorio rellenar nombre, apellidos y email", "Error faltan datos", JOptionPane.ERROR_MESSAGE);
                }

                else {
                    Object[] nuevafila = {id, nombre, apellidos, dni, email, contrasena};

                    DefaultTableModel model = (DefaultTableModel) showTable.getModel();
                    model.addRow(nuevafila);  // AGREGA NUEVA FILA A LA TABLA

                    // INCREMENTA EL CONTADOR Y ACTUALIZA EL VALOR POR DEFECTO DE TEXTO_NOMBRE
                    contadorID++;
                    numero_id.setText(Integer.toString(contadorID));

                    //LIMPIAR LOS CAMPOS DESPUES DE AGREGAR LA FILA

                    barra_nombre.setText("");
                    barra_apellidos.setText("");
                    barra_dni.setText("");
                    barra_email.setText("");
                    barra_contrasena.setText("");
                }
            }
        });
        createTable();
        boton_eliminar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int filaseleccionada = showTable.getSelectedRow();

                if (filaseleccionada >= 0) {
                    DefaultTableModel model = (DefaultTableModel) showTable.getModel();
                    model.removeRow(filaseleccionada);
                } else {
                    JOptionPane.showMessageDialog(null, "Por favor, seleccione una fila para eliminar.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

    }

    public static void main(String[] args) {
        Formulario_GUI formulario = new Formulario_GUI();
        formulario.setContentPane(formulario.mainPanel);
        formulario.setTitle("Formulario");
        formulario.setSize(900, 550);
        formulario.setVisible(true);
        formulario.setLocationRelativeTo(null);
        formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void createTable(){
        Object [][] data = {
        };

        showTable.setModel(new DefaultTableModel(
                data,
                new String[]{"ID", "NOMBRE", "APELLIDOS", "DNI", "EMAIL", "CONTRASEÑA"}
        ));
    }

}
