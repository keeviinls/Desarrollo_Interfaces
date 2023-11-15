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

    private JPanel mainpanel;
    private JPanel panel_izquierdo;
    private JPanel panel_derecho;
    private JTextField barra_nombre;
    private JTextField barra_apellidos;
    private JTextField barra_dni;
    private JTextField barra_email;

    private int contadorID = 1;

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
    private JTextField numero_id;
    private JButton boton_eliminar;
    private JPanel panel_tabla;
    private JTable showTable;
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


        boton_añadir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Agregar();
                consultar();
                Nuevo();
            }
        });
        showTable.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int fila = showTable.getSelectedRow();
                if (fila == -1){
                    JOptionPane.showMessageDialog(null, "No se seleccionó fila");
                }
                else {
                    idc = Integer.parseInt((String) showTable.getValueAt(fila,0).toString());
                    String nombre = (String) showTable.getValueAt(fila,1);
                    String apellido = (String) showTable.getValueAt(fila,2);
                    String dni = (String) showTable.getValueAt(fila,3);
                    String email = (String) showTable.getValueAt(fila,4);
                    String contrasena = (String) showTable.getValueAt(fila,5);

                    numero_id.setText(""+idc);
                    barra_nombre.setText(nombre);
                    barra_apellidos.setText(apellido);
                    barra_dni.setText(dni);
                    barra_email.setText(email);
                    barra_contrasena.setText(contrasena);

                }
            }
        });
        boton_modificar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Modificar();
                consultar();
                Nuevo();
            }
        });
        boton_eliminar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Eliminar();
                consultar();
                Nuevo();
            }
        });
        boton_nuevo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Nuevo();
            }
        });
    }

    private void Nuevo() {
        numero_id.setText("");
        barra_nombre.setText("");
        barra_apellidos.setText("");
        barra_dni.setText("");
        barra_email.setText("");
        barra_contrasena.setText("");
    }

    private void Eliminar() {
        int fila = showTable.getSelectedRow();
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
        String nombre = barra_nombre.getText().trim();
        String apellidos = barra_apellidos.getText().trim();
        String dni = barra_dni.getText().trim();
        String email = barra_email.getText().trim();
        String contrasena = barra_contrasena.getText().trim();

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
        String nombre = barra_nombre.getText().trim();
        String apellidos = barra_apellidos.getText().trim();
        String dni = barra_dni.getText().trim();
        String email = barra_email.getText().trim();
        String contrasena = barra_contrasena.getText().trim();

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
        for (int i = 0;i<=showTable.getRowCount();i++){
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
            model = (DefaultTableModel) showTable.getModel();
            while (rs.next()){
                usuarios [0] = rs.getInt("id");
                usuarios [1] = rs.getString("username");
                usuarios [2] = rs.getString("surname");
                usuarios [3] = rs.getString("dni");
                usuarios [4] = rs.getString("email");
                usuarios [5] = rs.getString("password");

                model.addRow(usuarios);
            }

            showTable.setModel(model);

        } catch (Exception e){

        }
    }



    private void createTable(){
        Object [][] data = {
        };

        showTable.setModel(new DefaultTableModel(
                data,
                new String[]{"ID", "NOMBRE", "APELLIDOS", "DNI", "EMAIL", "CONTRASEÑA"}
        ));
    }

    public static void main(String[] args) {
        Formulario_GUI_KevinLoayza formulario = new Formulario_GUI_KevinLoayza();
        formulario.setContentPane(formulario.mainpanel);
        formulario.setTitle("Formulario");
        formulario.setSize(900, 550);
        formulario.setVisible(true);
        formulario.setLocationRelativeTo(null);
        formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }



}
