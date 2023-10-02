package TutorialYoutube;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Video32_PasarDeTextField_a_TextArea extends JFrame implements ActionListener{

    private JTextField textfield1;
    private JTextArea textarea1;
    private JScrollPane scrollpane1;
    private JButton boton1;

    String texto = "";

    public Video32_PasarDeTextField_a_TextArea(){
        setLayout(null);
        textfield1 = new JTextField();
        textfield1.setBounds(10,10,200,30);
        add(textfield1);

        boton1 = new JButton("Agregar");
        boton1.setBounds(250,10,100,30);
        add(boton1);
        boton1.addActionListener(this);

        textarea1 = new JTextArea();
        scrollpane1 = new JScrollPane(textarea1);
        scrollpane1.setBounds(10,50,400,300);
        add(scrollpane1);

    }

    public void actionPerformed(ActionEvent evento_pulsar){
        if (evento_pulsar.getSource() == boton1){
            texto += textfield1.getText() + "\n";  // el \n es para que de un salto de linea
            textarea1.setText(texto);
            textfield1.setText("");  // esto es para que limpie el textfield1 despues de pulsar el boton
            boton1.setBackground(Color.red);

        }
    }

    public static void main(String[] args) {
        Video32_PasarDeTextField_a_TextArea formulario1 = new Video32_PasarDeTextField_a_TextArea();
        formulario1.setBounds(0,0,540,400);
        formulario1.setVisible(true);
        formulario1.setResizable(false);
        formulario1.setLocationRelativeTo(null);
    }
}
