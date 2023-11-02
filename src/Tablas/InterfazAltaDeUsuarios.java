package Tablas;

import ProyectoCalculadora.Calculadora_KevinLoayza;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class InterfazAltaDeUsuarios extends JFrame{

    private JLabel nombre, nombre2, nombre3, nombre4, nombre5, nombre6;
    private JTextField barra_texto, barra_texto2, barra_texto3, barra_texto4, barra_texto5, barra_texto6;
    private DefaultTableModel tableModel;
    private JTable tabla;
    public InterfazAltaDeUsuarios(){
        setTitle("Interfaz Alta de Usuarios");

        JPanel mainpanel = new JPanel();
        mainpanel.setLayout(new BorderLayout());

        /**
         * ----------------------------------------------------------------------------------
         * ----------------------------------PANEL ARRIBA-------------------------------------
         * ----------------------------------------------------------------------------------
         */

        JPanel panel_arriba = new JPanel();
        panel_arriba.setLayout(new GridLayout(6,2));

        nombre = new JLabel("ID");
        nombre2 = new JLabel("Nombre");
        nombre3 = new JLabel("Apellidos");
        nombre4 = new JLabel("DNI");
        nombre5 = new JLabel("Email");
        nombre6 = new JLabel("Password");

        /*
        barra_texto = new JTextField(3);
        barra_texto2 = new JTextField(20);
        barra_texto3 = new JTextField(30);
        barra_texto4 = new JTextField(9);
        barra_texto5 = new JTextField(30);
        barra_texto6 = new JTextField(20);*/

        barra_texto = new JTextField(); barra_texto2 = new JTextField(); barra_texto3 = new JTextField();
        barra_texto4 = new JTextField(); barra_texto5 = new JTextField(); barra_texto6 = new JTextField();

        for (JLabel label : Arrays.asList(nombre, nombre2, nombre3, nombre4, nombre5, nombre6)) {
            label.setHorizontalAlignment(SwingConstants.RIGHT);
            label.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 10));

        }

        panel_arriba.add(nombre);panel_arriba.add(barra_texto);
        panel_arriba.add(nombre2);panel_arriba.add(barra_texto2);
        panel_arriba.add(nombre3);panel_arriba.add(barra_texto3);
        panel_arriba.add(nombre4);panel_arriba.add(barra_texto4);
        panel_arriba.add(nombre5);panel_arriba.add(barra_texto5);
        panel_arriba.add(nombre6);panel_arriba.add(barra_texto6);

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

        panel_medio.add(boton1); panel_medio.add(boton2); panel_medio.add(boton3); panel_medio.add(boton4);
        mainpanel.add(panel_medio, BorderLayout.CENTER);

        /**
         * ----------------------------------------------------------------------------------
         * ----------------------------------PANEL ABAJO-------------------------------------
         * ----------------------------------------------------------------------------------
         */

        JPanel panel_abajo = new JPanel();
        panel_abajo.setBackground(Color.green);


        // Crear la tabla con las columnas
        String[] cabezera = {"ID", "Nombre", "Apellidos", "DNI", "Email", "Password"};
        String [][] datos = {
                {"1", "Kevin", "Loayza", "49998728V", "kevin28042001@gmail.com", "Contraseña"}

        };

        DefaultTableModel mod = new DefaultTableModel(datos, cabezera);
        JTable tabla = new JTable(mod);


        panel_abajo.add(tabla);
        mainpanel.add(panel_abajo);
        add(mainpanel);
    }

    public static void main(String[] args) {
        InterfazAltaDeUsuarios interfazAltaUsuarios= new InterfazAltaDeUsuarios();    // Se crea la instancia para la clase, se guarda en una variable.
        interfazAltaUsuarios.setBounds(0, 0, 520, 430); //  Establecemos el tamaño de la venta cuando ejecutemos la calculadora
        interfazAltaUsuarios.setVisible(true);  // Permitimos la visibilidad de la ventana, asi se hace visible para el usuario
        interfazAltaUsuarios.setLocationRelativeTo(null); // Sirve para indicar que la ventana aparezca en el centro de la pantalla
        interfazAltaUsuarios.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    // Cuando se cierre la vetana, la aplicacion se detendra, asi damos por finalizada la ejecucion del programa cuando el usuario cierre la ventana

    }
}
