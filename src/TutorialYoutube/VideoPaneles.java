package TutorialYoutube;

import javax.swing.*;
import java.awt.*;

public class VideoPaneles extends JFrame {
    private JLabel lbltitulo;
    private JButton btnPanel1,btnPanel2;
    private JTextArea textArea;

    private JPanel panel1, panel2;

    public VideoPaneles(){

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(387,365);
        setTitle("EJEMPLOP JPANEL BASICO");
        setLayout(null);

        setLocationRelativeTo(null);
        iniciarComponentes();
    }

    private void iniciarComponentes(){

        panel1 = new JPanel();
        panel1.setBackground(Color.red);
        panel1.setBounds(5,112,370,200);
        panel1.setLayout(null);

        panel2 = new JPanel();
        panel2.setBackground(Color.blue);

        lbltitulo = new JLabel("Ejemplo JPanel");
        lbltitulo.setFont(new Font("Yu Ghotic UI Semilight", Font.PLAIN,30));
        lbltitulo.setBounds(10,14,221,51);

        btnPanel1= new JButton("Panel 1");
        btnPanel1.setBounds(10,76,89,23);

        btnPanel2=new JButton("Panel 2");
        btnPanel2.setBounds(109,76,89,23);

        textArea = new JTextArea();
        textArea.setBounds(10,10,350,181);

        //textArea.setText();

        add(btnPanel2);
        add(btnPanel1);
        add(lbltitulo);
        panel1.add(textArea);

        add(panel1);
        add(panel2);

    }

    public static void main(String[] args) {
        VideoPaneles pruebaPanel = new VideoPaneles();
        pruebaPanel.setVisible(true);
    }

}
