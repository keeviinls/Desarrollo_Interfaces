package PruebasGUI;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class Formulario_GUI_KevinLoayza extends JFrame {

    conexion con1 = new conexion();
    Connection conet;
    Statement st;
    ResultSet rs;

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
    private JScrollPane scrollpane;
    private DefaultTableModel model;

    private String id;
    private String nombre;
    private String apellidos;
    private String dni;
    private String email;
    private char[] contrasena;


    public Formulario_GUI_KevinLoayza() {
        createTable();
        consultar();


        boton_editar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Agregar();
                consultar();
                Nuevo();
            }
        });
        tabla.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int fila = tabla.getSelectedRow();
                if (fila == -1){
                    JOptionPane.showMessageDialog(null, "No se seleccionó fila");
                }
                else {
                    idc = Integer.parseInt((String) tabla.getValueAt(fila,0).toString());
                    String nombre = (String) tabla.getValueAt(fila,1);
                    String apellido = (String) tabla.getValueAt(fila,2);
                    String dni = (String) tabla.getValueAt(fila,3);
                    String email = (String) tabla.getValueAt(fila,4);
                    String contrasena = (String) tabla.getValueAt(fila,5);

                    numero_id.setText(""+idc);
                    texto_nombre.setText(nombre);
                    texto_fecha.setText(apellido);
                    texto_hora.setText(dni);
                    texto_tarea.setText(email);
                    texto_descripcion.setText(contrasena);

                }
            }
        });
        boton_eliminar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Modificar();
                consultar();
                Nuevo();
            }
        });
        boton_cambiar_estado.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Eliminar();
                consultar();
                Nuevo();
            }
        });
        boton_agregar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Nuevo();
            }
        });
    }

    private void Nuevo() {
        numero_id.setText("");
        texto_nombre.setText("");
        texto_fecha.setText("");
        texto_hora.setText("");
        texto_tarea.setText("");
        texto_descripcion.setText("");
    }

    private void Eliminar() {
        int fila = tabla.getSelectedRow();
        try {
            if (fila<0){
                JOptionPane.showMessageDialog(null, "Usuario no seleccionado");
                limpiartabla();
            }
            else {
                String sql = "delete from users where id="+idc;
                conet = con1.getConnection();
                st = conet.createStatement();
                st.executeUpdate(sql);
                JOptionPane.showMessageDialog(null, "Cliente eliminado");
                limpiartabla();
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }

    private void Modificar() {
        String id = numero_id.getText().trim();
        String nombre = texto_nombre.getText().trim();
        String apellidos = texto_fecha.getText().trim();
        String dni = texto_hora.getText().trim();
        String email = texto_tarea.getText().trim();
        String contrasena = texto_descripcion.getText().trim();

        try {
            if (nombre.equals("") || apellidos.equals("") || email.equals("")){
                JOptionPane.showMessageDialog(null, "Debes rellenar nombre, apellido y email");
                limpiartabla();
            }
            else {

                String sql = "Update users set id ='"+idc+"', username='"+nombre+"', surname='"+apellidos+"', dni='"+dni+"', email='"+email+"', password= '"+contrasena+"' where id="+idc;
                conet = con1.getConnection();
                st = conet.createStatement();
                st.executeUpdate(sql);
                JOptionPane.showMessageDialog(null, "Datos del cliente modificados");

                contadorID++;
                numero_id.setText(Integer.toString(contadorID));

                limpiartabla();
            }

        } catch (Exception e){
            System.out.println(e);
        }
    }


    private void Agregar() {
        String id = numero_id.getText().trim();
        String nombre = texto_nombre.getText().trim();
        String apellidos = texto_fecha.getText().trim();
        String dni = texto_hora.getText().trim();
        String email = texto_tarea.getText().trim();
        String contrasena = texto_descripcion.getText().trim();

        try {
            if (nombre.equals("") || apellidos.equals("") || email.equals("")){
                JOptionPane.showMessageDialog(null, "Debes rellenar nombre, apellido y email");
                limpiartabla();
            }
            else {

                String sql = "insert into users(id, username, surname, dni, email, password) values ('"+id+"', '"+nombre+"', '"+apellidos+"', '"+dni+"', '"+email+"', '"+contrasena+"')";
                conet = con1.getConnection();
                st = conet.createStatement();
                st.executeUpdate(sql);
                JOptionPane.showMessageDialog(null, "Nuevo cliente registrado");

                contadorID++;
                numero_id.setText(Integer.toString(contadorID));
                
                limpiartabla();
            }

        } catch (Exception e){
            System.out.println(e);
        }
    }

    private void limpiartabla() {
        for (int i = 0; i<= tabla.getRowCount(); i++){
            model.removeRow(i);
            i = i-1;
        }
    }

    private void consultar() {
        String sql = "select * from users";

        try {
            conet = con1.getConnection();
            st = conet.createStatement();
            rs = st.executeQuery(sql);
            Object[] usuarios = new Object[6];
            model = (DefaultTableModel) tabla.getModel();
            while (rs.next()){
                usuarios [0] = rs.getInt("id");
                usuarios [1] = rs.getString("username");
                usuarios [2] = rs.getString("surname");
                usuarios [3] = rs.getString("dni");
                usuarios [4] = rs.getString("email");
                usuarios [5] = rs.getString("password");

                model.addRow(usuarios);
            }

            tabla.setModel(model);

        } catch (Exception e){

        }
    }



    private void createTable(){
        Object [][] data = {
        };

        tabla.setModel(new DefaultTableModel(
                data,
                new String[]{"ID", "NOMBRE", "APELLIDOS", "DNI", "EMAIL", "CONTRASEÑA"}
        ));
    }

    public static void main(String[] args) {
        Formulario_GUI_KevinLoayza formulario = new Formulario_GUI_KevinLoayza();
        formulario.setContentPane(formulario.mainPanel);
        formulario.setTitle("Formulario");
        formulario.setSize(900, 550);
        formulario.setVisible(true);
        formulario.setLocationRelativeTo(null);
        formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }



}
