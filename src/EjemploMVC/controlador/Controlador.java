package EjemploMVC.controlador;

import EjemploMVC.vista.FormularioVista;
import EjemploMVC.modelo.UsuarioModelo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class Controlador implements ActionListener {
    private UsuarioModelo modelo;
    private FormularioVista vista;

    public Controlador(UsuarioModelo modelo, FormularioVista vista) {
        this.modelo = modelo;
        this.vista = vista;
        this.vista.agregarControlador(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String nombre = vista.getNombre();
        String apellidos = vista.getApellidos();

        modelo.setNombre(nombre);
        modelo.setApellidos(apellidos);

        String mensaje = "¡Bienvenido, " + modelo.getNombre() + " " + modelo.getApellidos() + "!";
        vista.mostrarMensaje(mensaje);
    }

    public static void main(String[] args) {
        UsuarioModelo modelo = new UsuarioModelo();
        FormularioVista vista = new FormularioVista();
        Controlador controlador = new Controlador(modelo, vista);
    }
}
