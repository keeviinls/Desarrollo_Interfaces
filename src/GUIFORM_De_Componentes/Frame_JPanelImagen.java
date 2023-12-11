package GUIFORM_De_Componentes;

import Componentes.JPanelImagen;

import javax.swing.*;

public class Frame_JPanelImagen {
    private JPanel panel1;
    private JPanelImagen panel_imagen;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Frame_JPanelImagen");
        frame.setContentPane(new Frame_JPanelImagen().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
