package componentesPropios;

import javax.swing.*;

public class botonGUI {
    private JPanel mainPanel;
    private JButtonImagen JButtonImagen1;
    private JButtonImagen JbuttonImagen2;
    private JButton button01Button;
    private JButton button02Button;
    private JButton button03Button;

    public static void main(String[] args) {
        JFrame frame = new JFrame("GUIBoton");
        frame.setContentPane(new botonGUI().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setBounds(0, 0, 100, 100);
    }

    private void createUIComponents() {
        JButtonImagen1 = new JButtonImagen();
    }

}

