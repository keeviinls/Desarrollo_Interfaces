package Eventos;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.*;

public class EjercicioMyListWindows2 extends JFrame {
    private DefaultListModel<String> modelo_lista;
    private JList <String> lista;
    private JTextField nombretextfield;

    public EjercicioMyListWindows2(){

        JPanel mainpanel = new JPanel(new GridBagLayout());
        JLabel label1= new JLabel("JList");
        mainpanel.add(label1,
                new GridBagConstraints(

                        0,  //POSICION DE LA COLUMNA
                        0,      //POSICION DE LA FILA
                        0,      //NUMERO COLUMNAS QUE OCUPARA
                        1,       //NUMERO DE FILAS QUE OCUPARA
                        0,        //PESO HORIZONTAL
                        0,        //PESO VERTICAL       //SI PONE 4.0, INTENTARA OCUPAR 4 VECES MAS DE ALTURA QUE  LAS OTRAS FILAS (SI HAY HUECO)
                        GridBagConstraints.CENTER,   //ALINEACION HORIZONTAL DEL COMPONENTE
                        GridBagConstraints.BOTH,    // EL COMPONENTE SE EXPANDIRA TANTO HORIZONTAL COMO VERTICAL
                        new Insets(0,35,20,35),   //UN OBJETO INSETS, INDICA LOS MARGENES ALREDEOR DEL COMPONENTE DE LA CELDA
                        0,      //ANCHO MINIMO DEL COMPONENTE
                        0)      //ALTO MINIMO DE COMPONENTE
        );
        label1.setBorder(new BevelBorder(1));
        label1.setHorizontalAlignment(JLabel.CENTER);  //ESTO ES PARA QUE SALGA EN EL MEDIO, SI NO LO PONGO SALE A LA IZQUIERDA
        label1.setFont(new Font("Arial", Font.PLAIN, 40));


        nombretextfield = new JTextField();
        mainpanel.add(nombretextfield, new GridBagConstraints(0,1,1, 1,1,0,GridBagConstraints.WEST, GridBagConstraints.BOTH, new Insets(0, 15, 0, 10), 0, 0));

        JButton botonAgregar = new JButton("Agregar");
        mainpanel.add(botonAgregar, new GridBagConstraints(1, 1, 1, 1, 1.0, 0, GridBagConstraints.EAST, GridBagConstraints.BOTH, new Insets(0, 0, 0, 23), 0, 0));


        modelo_lista = new DefaultListModel<>();
        lista = new JList<>(modelo_lista);
        mainpanel.add(lista, new GridBagConstraints(0, 2, 3, 1, 1, 0, GridBagConstraints.CENTER, GridBagConstraints.CENTER, new Insets(5, 0, 0, 10), 0, 0));

        ScrollPane scrollPane = new ScrollPane();
        scrollPane.add(lista);
        mainpanel.add(scrollPane, new GridBagConstraints(0, 2, 3, 1, 1, 0, GridBagConstraints.CENTER, GridBagConstraints.CENTER, new Insets(5, 0, 10, 10), 0, 0));
        scrollPane.setPreferredSize(new Dimension(300, 100));



        mainpanel.setBackground(Color.LIGHT_GRAY);


        JButton botonEliminar = new JButton("Eliminar");
        mainpanel.add(botonEliminar, new GridBagConstraints(0, 3, 1, 1, 1.0, 0, GridBagConstraints.WEST, GridBagConstraints.BOTH, new Insets(0, 15, 0, 10), 0, 0));

        JButton botonBorrarLista = new JButton("Borrar Lista");
        mainpanel.add(botonBorrarLista, new GridBagConstraints(1, 3, 1, 1, 1.0, 0, GridBagConstraints.EAST, GridBagConstraints.BOTH, new Insets(0, 0, 0, 23), 0, 0));

        add(mainpanel);

    }



    public static void main(String[] args) {
        EjercicioMyListWindows2 tabla= new EjercicioMyListWindows2();
        tabla.setBounds(100, 100, 300, 300);
        tabla.setVisible(true);
        tabla.setLocationRelativeTo(null); // Centrar la ventana en la pantalla
        tabla.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
