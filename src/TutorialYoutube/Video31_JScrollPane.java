package TutorialYoutube;
import  javax.swing.*;

/** JSCROLLPANE SIRVE PARA AÑADIR UNA BARRA Y MOVERSE DENTRO DEL TEXTAREA, ASI SI ESCRIBIMOS MUCHO TEXTO
 * YA SEA ANCHO O ALTURA, NO SE CORTE Y CON LA BARRA PODEMOS LEER EL TEXTO ENTERO**/

public class Video31_JScrollPane extends JFrame {
    private JTextField textfield1;
    private JTextArea textarea1;
    private JScrollPane scrollpane1;

    public Video31_JScrollPane(){
        setLayout(null);
        textfield1 = new JTextField();
        textfield1.setBounds(10,10,200,30);
        add(textfield1);

        textarea1 = new JTextArea();
        scrollpane1 = new JScrollPane(textarea1); //PONEMOS textarea1 PQ QUEREMOS QUE EL TEXTAREA ESTER DENTRO DEL SCROLLPANE
        // ASI PODEMOS MOVERNOS DENTRO DEL TEXTAREA CON LA BARRA
        scrollpane1.setBounds(10,50,400,300);
        add(scrollpane1);
    }

    public static void main(String[] args) {
        Video31_JScrollPane formulario1 = new Video31_JScrollPane();
        formulario1.setBounds(0,0,540,400);
        formulario1.setVisible(true);
        formulario1.setResizable(false);
        formulario1.setLocationRelativeTo(null);
    }
}
