package Tablas;

import ProyectoCalculadora.Calculadora_KevinLoayza;

import javax.swing.*;

public class InterfazAltaDeUsuarios extends JFrame{
    private JPanel mainpanel;
    private JPanel panel_arriba;
    private JPanel panel_abajo;

    public InterfazAltaDeUsuarios(){


    }

    public static void main(String[] args) {
        InterfazAltaDeUsuarios interfazAltaUsuarios= new InterfazAltaDeUsuarios();    // Se crea la instancia para la clase, se guarda en una variable.
        interfazAltaUsuarios.setBounds(0, 0, 520, 430); //  Establecemos el tamaño de la venta cuando ejecutemos la calculadora
        interfazAltaUsuarios.setVisible(true);  // Permitimos la visibilidad de la ventana, asi se hace visible para el usuario
        interfazAltaUsuarios.setLocationRelativeTo(null); // Sirve para indicar que la ventana aparezca en el centro de la pantalla
        interfazAltaUsuarios.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    // Cuando se cierre la vetana, la aplicacion se detendra, asi damos por finalizada la ejecucion del programa cuando el usuario cierre la ventana

    }
}
