package Eventos;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class EjercicioMyListWindows extends JFrame {

    private DefaultListModel<String> modelo_lista;
    private JList<String> lista;
    private JTextField nombreTextField;

    public EjercicioMyListWindows(){

        /**
         * ------------------------------------------------------JLABEL -------------------------------------------------------------------
         */

        JLabel titulolabel = new JLabel("JList");
        titulolabel.setFont(new Font("Arial", Font.BOLD, 24));
        titulolabel.setHorizontalAlignment(SwingConstants.CENTER);  //ESTO ES PARA QUE SALGA EN EL MEDIO, SI NO LO PONGO SALE A LA IZQUIERDA
        /**
         * LO DE ABAJO SE LO HEMOS QUITADO PQ LOS 2 NO PUEDEN IR JUNTOS, POR ESO UNO ESTA COMENTADO Y EL OTRO NO, PARA HACER QUE HAYA BORDE ABAJO DEL TITULOLABEL
         * HEMOS PUESTO 10 DE BORDE SUPERIOR EN EL PANEL DEL ARRIBA, OSAE EL PANEL DEL JTEXTFIELD Y EL DEL BOTON AGREGAR.
         */
        // titulolabel.setBorder(BorderFactory.createEmptyBorder(0, 0, 10, 0)); //PARA QUE HAYA MAS BORDE O MARGEN ABAJO DEL LABEL
        titulolabel.setBorder(new BevelBorder(1)); //ESTO ES PARA HACER EL EFECTO 3D DEL TITULOLABEL

        //CAMBIAR COLOR AL JLABEL
        titulolabel.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseEntered(MouseEvent e) {  //ESTE METODO SE EJECUTARA CUANDO EL RATON ENTRE EN EL AREA DE TITULOLABEL
                super.mouseEntered(e);  // ESTO LO PODEMOS QUITAR SI QUEREMOS
                titulolabel.setForeground(Color.red);
            }

            @Override
            public void mouseExited(MouseEvent e) {  //ESTE METODO SE EJECUTARA CUANDO EL RATON SALGA DEL AREA DEL TITULOLABEL
                super.mouseEntered(e); // ESTO LO PODEMOS QUITAR SI QUEREMOS
                titulolabel.setForeground(Color.BLUE);
            }
        });

        /**
         * ------------------------------------------------------JTEXTIELD Y BOTONE AGREGAR -------------------------------------------------------------------
         */

        //CREAR TEXTFIELD DONDE ESCRIBIREMOS LOS NOMBRES
        nombreTextField = new JTextField(20);

        //CREAR BOTON AGREGAR
        JButton boton_agregar = new JButton("Agregar");

        //ACTIONLISTENER AL BOTON AGREGAR

        boton_agregar.addActionListener(new ActionListener() {   //ESTO CONFIGURA UN ACTIONLISTENER EN "BOTON_AGREGAR"
            @Override
            public void actionPerformed(ActionEvent e) {   //METODO SE EJECUTARA CUANDO HAGAMOS CLIC EN "BOTON AGREGAR"
                String nombre = nombreTextField.getText();
                if (!nombre.isEmpty()){  //VERIFICAR QUE "NOMBRETEXTFIELD" NO ESTA VACIO, SI CONTIENE ALGO, PROCEDE A LA SIGUIENTE INSTRUCCION
                    modelo_lista.addElement(nombre);
                    nombreTextField.setText("");  //DESPUES DE AÑADIR ELEMENTO A LA LISTA, SE BORRA EL CONTENIDO DE "NOMBRETEXTFIELD"
                    // PARA QUE ESTE LISTO PARA RECIBIR UN NUEVO NOMBRE
                }
            }
        });

        /**
         * ------------------------------------------------------JLIST Y BOTONES BORRAR LISTA Y ELIMINAR -------------------------------------------------------------------
         */

        //CREAR LISTA Y AÑADIR SU MODELO
        modelo_lista = new DefaultListModel<>();
        lista = new JList<>(modelo_lista);

        //CREAR BOTONES BORRAR LISTA Y ELIMINAR

        JButton boton_borrar_lista = new JButton("Borrar lista");
        JButton boton_eliminar = new JButton("Eliminar");

        //ACTIONLISTENER PARA BOTON BORRAR LISTA
        boton_borrar_lista.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                modelo_lista.removeAllElements();
            }
        });

        //ACTIONLISTENER PARA BOTON ELIMINAR

        boton_eliminar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nombre_seleccionado = lista.getSelectedValue();
                if (nombre_seleccionado != null){
                    modelo_lista.removeElement(nombre_seleccionado);
                }
            }
        });

        /**
         * ------------------------------------------------------PANEL ARRIBA------------------------------------------------------------------
         */

        //PANEL PARA NOMBRETEXTFIELD Y PARA BOTON AGREGAR
        JPanel panel_arriba = new JPanel();
        panel_arriba.setLayout(new BoxLayout(panel_arriba, BoxLayout.X_AXIS));  // SE CONFIGURA PARA QUE LOS COMPONENTES SE PONGAN EN UNA FILA HORIZONTAL (EJE X).
        // OSEA PARA QUE LOS COMPONENTES DE ESTE PANEL IRAN UNO AL LADO DE OTRO.

        panel_arriba.add(nombreTextField);
        panel_arriba.add(boton_agregar);
        panel_arriba.setBorder(BorderFactory.createEmptyBorder(10,0,10,0)); //PARA QUE HAYA MAS BORDE O MARGEN ABAJO DEL PANEL

        /**
         * ------------------------------------------------------PANEL MEDIO------------------------------------------------------------------
         */

        //PANEL PARA LA LISTA Y EL BOTON AGREGAR VERTICALMENTE
        JPanel panel_medio = new JPanel();
        panel_medio.setLayout(new BorderLayout()); //USAMOS BORDERLAYOUT, ESTE DISEÑO DIVIDE EL PANEL EN 5 AREAS (NORTE, SUR, ESTE, OESTE, CENTRO). CADA AREA PUEDE TENER COMPONENTES
        panel_medio.add(new JScrollPane(lista), BorderLayout.CENTER);  // SE AGREGA EL SCROLLPANE EN EL CENTRO.
        panel_medio.add(panel_arriba, BorderLayout.NORTH); // SE AGREGA EL PANEL_ARRIBA EN EL NORTE DEL PANEL_MEDIO. ASI EL PANEL_ARRIBA ESTARA ENCIMA DE ESTE.
        panel_medio.setBorder(BorderFactory.createEmptyBorder(0,0,10,0)); //PARA QUE HAYA MAS BORDE O MARGEN ABAJO DEL PANEL


        /**
         * ------------------------------------------------------PANEL ABAJO------------------------------------------------------------------
         */
        //PANEL PARA BOTONES BORRAR LISTA Y ELIMINAR
        JPanel panel_abajo = new JPanel();
        panel_abajo.setLayout(new FlowLayout());  //CON FLOWLAYOUT LOS PONE EN FILA HORIZONTAL, CUANDO ESTE SE LLENA, LOS PONE EN LA SIGUIENTE FILA.
        // OSEA QUE LOS COMPONENTES SE PONEN UNO AL LADO DE OTRO SEGUN EL ORDEN EN EL QUE SE HAYAN PUESTO
        panel_abajo.add(boton_eliminar);
        panel_abajo.add(boton_borrar_lista);

        /**
         * ------------------------------------------------------MAIN PANEL-----------------------------------------------------------------
         */

        //PANEL PRINCIPAL CON MARGENES
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());
        mainPanel.setBorder(BorderFactory.createEmptyBorder(20, 10, 20, 10)); // Añadir márgenes

        mainPanel.add(titulolabel, BorderLayout.NORTH);
        mainPanel.add(panel_medio, BorderLayout.CENTER);
        mainPanel.add(panel_abajo, BorderLayout.SOUTH);

        //AGREGAR EL MAINPANEL AL CONTENIDO DEL JFRAME
        getContentPane().add(mainPanel);  //TAMBIEN VALE UN "add.(mainPanel)"


    }



    public static void main(String[] args) {
        EjercicioMyListWindows tabla= new EjercicioMyListWindows();
        tabla.setBounds(100, 100, 300, 300);
        tabla.setVisible(true);
        tabla.setLocationRelativeTo(null); // Centrar la ventana en la pantalla
        tabla.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
