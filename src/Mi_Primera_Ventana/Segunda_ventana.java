package Mi_Primera_Ventana;

import javax.swing.*;
import java.awt.*;

public class Segunda_ventana {
    public static void main(String[] args) {

        JPanel panel = new JPanel();
        panel.setBackground(Color.green);
        panel.setBounds(0,0,250,250);

        JPanel Bluepanel = new JPanel();
        Bluepanel.setBackground(Color.blue);
        Bluepanel.setBounds(0,250,250,250);

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(750,750);
        frame.setVisible(true);
        frame.add(panel);
        frame.add(Bluepanel);

        // Carrgar una imagen
        ImageIcon imageIcon = new ImageIcon("C:\\Users\\KevinLoayzaS\\Desktop\\messi.jpg"); // Reemplaza con la ruta de tu imagen

        // Crear un JLabel para mostrar la imagen
        JLabel label = new JLabel(imageIcon);

        // Agregar el JLabel al panel azul
        Bluepanel.add(label);


       /* JPanel panel = new JPanel();
        panel.setBounds(100,100,100,100);
        panel.setBackground(Color.BLUE);

        f.add(panel);
        f.setContentPane(panel); */

    }
}
