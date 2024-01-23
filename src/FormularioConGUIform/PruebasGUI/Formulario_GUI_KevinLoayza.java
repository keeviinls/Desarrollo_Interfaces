package FormularioConGUIform.PruebasGUI;

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
