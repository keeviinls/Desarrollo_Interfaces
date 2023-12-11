package EjemploMVCconGUIFORM.controlador;

import EjemploMVCconGUIFORM.modelo.Modelo;
import EjemploMVCconGUIFORM.vista.Vista;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controlador implements ActionListener {

    private Vista view;
    private Modelo model;

    public Controlador (Vista view, Modelo model){
        this.view = view;
        this.model = model;
        this.view.btnMultiplicar.addActionListener(this);
    }

    public void iniciar(){
        view.setTitle("MVC Multiplicar");
        view.setLocationRelativeTo (null);
    }

    public void actionPerformed(ActionEvent e){
        model.setNumeroUno(Integer.parseInt(view.txtNumeroUno.getText()));
        model.setNumeroDos(Integer.parseInt(view.txtNumeroDos.getText()));
        model.multiplicar();
        view.txtResultado.setText(String.valueOf(model.getResultado()));
    }

    public static void main(String[] args) {
        Modelo mod = new Modelo();
        Vista view = new Vista();

        Controlador ctrl = new Controlador(view,mod);
        ctrl.iniciar();
        view.setVisible(true);
    }
}
