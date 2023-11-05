package Tablas;

import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MiTabla extends JFrame {

    private JPanel mainpanel;


    private JLabel titulo_id,  titulo_nombre, titulo_apellidos, titulo_dni, titulo_email, titulo_contrasena, numero_id;
    private JTextField barra_nombre, barra_apellidos, barra_dni, barra_email;

    private JPasswordField barra_contrasena;

    private JButton boton_nuevo, boton_añadir, boton_modificar, boton_eliminar;

    private int contadorID = 1;

    private DefaultTableModel modelo_tabla;
    private JTable tabla;

    public MiTabla(){
        mainpanel = new JPanel();
        mainpanel.setLayout(new BorderLayout());

        /**
         * ----------------------------------------------------------------------------------
         * ----------------------------------PANEL ARRIBA-------------------------------------
         * ----------------------------------------------------------------------------------
         */

        JPanel panel_arriba = new JPanel();

        panel_arriba.setLayout(new BorderLayout());

        /**
         * ----------------------------------------------------------------------------------
         * ----------------------------------PANEL_INTERFAZ-------------------------------------
         * ----------------------------------------------------------------------------------
         */
        JPanel panel_interfaz = new JPanel();

       /* // Crea un objeto Insets para establecer márgenes (izquierda, arriba, derecha, abajo)

        // Establece los márgenes al panel_interfaz
        panel_interfaz.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));*/
        panel_interfaz.setLayout(new GridBagLayout());




        /** ---------------------------------------------------------------**/
        /** FILA 0 **/
        panel_interfaz.add(
                titulo_id = new JLabel("ID"),
                new GridBagConstraints(
                        4,  0,  1,  1,  0,  0,
                        GridBagConstraints.CENTER,
                        GridBagConstraints.CENTER,
                        new Insets(10,0,0,10),  0,  0
                )
        );

        /** ---------------------------------------------------------------**/
        /** PRIMERA FILA **/

        panel_interfaz.add(
                numero_id = new JLabel("1"),
                new GridBagConstraints(
                        4,  1,  1,  1,  0,  0,
                        GridBagConstraints.CENTER,
                        GridBagConstraints.CENTER,
                        new Insets(5,0,0,10),  0,  0
                )
        );




        /** ---------------------------------------------------------------**/
        /** SEGUNDA FILA **/
        panel_interfaz.add(
                titulo_nombre = new JLabel("NOMBRE"),
                new GridBagConstraints(
                        0,  2,  1,  1,  0,  0,
                        GridBagConstraints.EAST,
                        GridBagConstraints.CENTER,
                        new Insets(10,0,0,0),  10,  0
                )
        );

        panel_interfaz.add(
                barra_nombre = new JTextField(),
                new GridBagConstraints(
                        1,  2,  1,  1,  0,  0,
                        GridBagConstraints.CENTER,
                        GridBagConstraints.BOTH,
                        new Insets(10,0,0,0),  0,  0
                )
        );

        panel_interfaz.add(
                titulo_apellidos = new JLabel("APELLIDOS"),
                new GridBagConstraints(
                        4,  2,  1,  1,  0,  0,
                        GridBagConstraints.EAST,
                        GridBagConstraints.CENTER,
                        new Insets(10,10,0,0),  10,  0
                )
        );

        panel_interfaz.add(
                barra_apellidos = new JTextField(20),
                new GridBagConstraints(
                        5,  2,  1,  1,  0,  0,
                        GridBagConstraints.CENTER,
                        GridBagConstraints.BOTH,
                        new Insets(10,0,0,0),  0,  0
                )
        );

        /** ---------------------------------------------------------------**/
        /** TERCERA FILA **/
        panel_interfaz.add(
                titulo_dni = new JLabel("DNI"),
                new GridBagConstraints(
                        0,  3,  1,  1,  0,  0,
                        GridBagConstraints.EAST,
                        GridBagConstraints.CENTER,
                        new Insets(10,0,0,0),  10,  0
                )
        );

        panel_interfaz.add(
                barra_dni = new JTextField(),
                new GridBagConstraints(
                        1,  3,  1,  1,  0,  0,
                        GridBagConstraints.CENTER,
                        GridBagConstraints.BOTH,
                        new Insets(10,0,0,0),  0,  0
                )
        );

        panel_interfaz.add(
                titulo_email = new JLabel("EMAIL"),
                new GridBagConstraints(
                        4,  3,  1,  1,  0,  0,
                        GridBagConstraints.EAST,
                        GridBagConstraints.CENTER,
                        new Insets(10,10,0,0),  10,  0
                )
        );

        panel_interfaz.add(
                barra_email = new JTextField(20),
                new GridBagConstraints(
                        5,  3,  1,  1,  0,  0,
                        GridBagConstraints.CENTER,
                        GridBagConstraints.BOTH,
                        new Insets(10,0,0,0),  0,  0
                )
        );

        /** ---------------------------------------------------------------**/
        /** CUARTA FILA **/
        panel_interfaz.add(
                titulo_contrasena = new JLabel("CONTRASEÑA"),
                new GridBagConstraints(
                        1,  4,  1,  1,  0,  0,
                        GridBagConstraints.CENTER,
                        GridBagConstraints.BOTH,
                        new Insets(10,0,10,0),  10,  0
                )
        );

        panel_interfaz.add(
                barra_contrasena = new JPasswordField(15),
                new GridBagConstraints(
                        4,  4,  1,  1,  0,  0,
                        GridBagConstraints.CENTER,
                        GridBagConstraints.BOTH,
                        new Insets(10,0,10,0),  0,  0
                )
        );

        /**
         * ----------------------------------------------------------------------------------
         * ----------------------------------PANEL MEDIO-------------------------------------
         * ----------------------------------------------------------------------------------
         */

        JPanel panel_medio = new JPanel();

        panel_medio.setBorder(BorderFactory.createEmptyBorder(10, 0, 10, 0));


        boton_nuevo = new JButton("NUEVO"); boton_añadir = new JButton("AÑADIR"); boton_modificar = new JButton("MODIFICAR"); boton_eliminar = new JButton("ELIMINAR");

        /**
         * ------------------------------EVENTO DE BOTON_NUEVO------------------------
         */

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

        /**
         * ------------------------------EVENTO DE BOTON_AÑADIR-----------------------------
         */

        boton_añadir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String id = numero_id.getText().trim();
                String nombre = barra_nombre.getText().trim(); //PONEMOS ".TRIM" PARA ELIMINAR LOS ESPADIOS EN BLANCO AL PRINCIPIO Y FINAL DE TEXTO
                String apellidos = barra_apellidos.getText().trim();
                String dni = barra_dni.getText().trim();
                String email = barra_email.getText().trim();
                String contrasena = barra_contrasena.getText().trim();

                if (nombre.isEmpty() || apellidos.isEmpty() || email.isEmpty()){
                    JOptionPane.showMessageDialog(null, "Es obligatorio rellenar nombre, apellidos y email", "Error faltan datos", JOptionPane.ERROR_MESSAGE);
                }
                else {
                    Object[] nuevafila = {id, nombre, apellidos, dni, email, contrasena};

                    DefaultTableModel model = (DefaultTableModel) tabla.getModel();
                    model.addRow(nuevafila);  // Agregar la nueva fila al DefaultTableModel de la tabla

                    // Incrementa el contador y actualiza el valor por defecto de texto_nombre
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

        /**
         * ------------------------------EVENTO DE BOTON_ELIMINAR-----------------------------
         */

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

        /**
         * ----------------------------------------------------------------------------------
         * ----------------------------------PANEL BAJO-------------------------------------
         * ----------------------------------------------------------------------------------
         */
        JPanel panel_bajo = new JPanel();


        String[] cabezera = {"ID", "NOMBRE", "APELLIDOS", "DNI", "EMAIL", "PASSWORD"};
        String[][] datos = {};

        modelo_tabla = new DefaultTableModel(datos,cabezera);
        tabla = new JTable(modelo_tabla);
        JScrollPane scrollPane = new JScrollPane(tabla);

        tabla.setPreferredScrollableViewportSize(new Dimension(600, 300)); // Cambia estos valores según tus necesidades


        /**
         * ----------------------------------------------------------------------------------
         * ----------------------------------DISEÑOS-------------------------------------
         * ----------------------------------------------------------------------------------
         */

        /**
         *------------------COLORES DEL PANEL------------
         */
        panel_interfaz.setBackground(new Color(37,51,58));
        panel_arriba.setBackground(new Color(37,51,58));
        panel_medio.setBackground(new Color(37,51,58));
        panel_bajo.setBackground(new Color(37,51,58));

        /**
         *------------------COLORES DEL JFIELD------------
         */

        titulo_id.setForeground(new Color(194,166,119)); titulo_id.setFont(new Font("Arial", Font.BOLD, 13));
        numero_id.setForeground(new Color(194,166,119)); numero_id.setFont(new Font("Arial", Font.BOLD, 20));
        titulo_nombre.setForeground(new Color(194,166,119));
        titulo_apellidos.setForeground(new Color(194,166,119));
        titulo_email.setForeground(new Color(194,166,119));
        titulo_contrasena.setForeground(new Color(194,166,119));
        titulo_dni.setForeground(new Color(194,166,119));

        /**
         *------------------COLORES DEL JTEXTFIELD------------
         */
        barra_apellidos.setForeground(new Color(37,51,58));
        barra_nombre.setForeground(new Color(37,51,58));
        barra_dni.setForeground(new Color(37,51,58));
        barra_email.setForeground(new Color(37,51,58));
        barra_contrasena.setForeground(new Color(37,51,58));


        /**
         *------------------COLORES DE LOS BOTONES-----------
         */

        boton_nuevo.setBackground(new Color(194,166,119));boton_nuevo.setForeground(Color.white);
        boton_añadir.setBackground(new Color(194,166,119));boton_añadir.setForeground(Color.white);
        boton_eliminar.setBackground(new Color(194,166,119));boton_eliminar.setForeground(Color.white);
        boton_modificar.setBackground(new Color(194,166,119));boton_modificar.setForeground(Color.white);

        /**
         *------------------DISEÑO TABLA-----------
         */

        tabla.getTableHeader().setDefaultRenderer(new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                Component cell = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);

                // Configura el color de fondo de las cabeceras en rojo
                cell.setBackground(new Color(194,166,119));
                cell.setForeground(Color.WHITE); // Cambia el color de texto de las cabeceras a blanco

                return cell;
            }
        });


        panel_medio.add(boton_nuevo);  panel_medio.add(boton_añadir); panel_medio.add(boton_modificar); panel_medio.add(boton_eliminar);
        panel_arriba.add(panel_interfaz, BorderLayout.CENTER);
        panel_bajo.add(scrollPane);


        mainpanel.add(panel_arriba, BorderLayout.NORTH);
        mainpanel.add(panel_medio, BorderLayout.CENTER);
        mainpanel.add(panel_bajo, BorderLayout.SOUTH);

        add(mainpanel);
    }

    public static void main(String[] args) {
        MiTabla interfaz_mitabla = new MiTabla();
        interfaz_mitabla.setBounds(0, 0, 1000, 580); // Ajusta el ancho de la ventana principal según tus necesidades
        interfaz_mitabla.setVisible(true);;
        interfaz_mitabla.setVisible(true);
        interfaz_mitabla.setLocationRelativeTo(null);
        interfaz_mitabla.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
