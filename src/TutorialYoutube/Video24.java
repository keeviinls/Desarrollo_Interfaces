package TutorialYoutube;

import javax.swing.*;
public class Video24 extends JFrame{  //

    private   JLabel label1 ;  //JLABEL : NOS PERMITE CREAR ETIQUETAS, NOS DEJA MOSTRAR DATOS EN PANTALLA SIN USAR PRINTLN
    //PRINCIPALMENTE SE PONEN EN PRIVADOS YA QUE SOLO SE USAN EN LA INTERFAZ QUE ESTAMOS PROGRAMANDO


    public Video24(){   // CONSTRUCTOR, SE DEBE LLAMAR IGUAL QUE LE NOMBRE DE LA CLASE. EL CONSTRUCTOR PERMITE CONSTRUIR COSAS PERO NO EN EL LUGAR DONDE LO ESTAS PROGRAMANDO,
        //SI NO EN UN LUGAR DONDE NOSOTROS LO VAYAMOS A INVOCAR
    //ESTO SIRVE PARA DECIR AL PROGRAMA QUE TIENE QUE CREAR TODO ESO.CONTIENE EL DISEÑO DE NUESTRA ETIQUETA.

        setLayout(null);  //METODO QUE SIRVE PARA INDICAR AL PROGRAMA A TRAVES DE COORDENADAS DONDE QUEREMOS COLOCAR LOS ELEMEENTOS DEL PROGRAMA
        //LO PONEMOS  EN NULL PARA QUE NO NOS LO PONGA DONDE EL QUIERA

        label1 = new JLabel("Hola Buenos Dias");  // MENSAJE QUE SE MOSTRARA EN LA INTERFAZ, SIMILAR A UN PRINTL
        label1.setBounds(10,20,200,300); //COORDENAS Y ANCHO Y ALTO DE LA ETIQUETA
        add(label1); //PARA INDICAR QUE TODO LO QUE ACABAMOS DE ESCRIBNIR, LO VAMOS A COLOCAR DENTRO DE UNA ETIQUETA, QUE ES LABEL1;
    }

    public static void main(String[] args) {  //
        Video24 formulario1 = new Video24(); // ES EL CONTENEDOR, LA PANTALLA, EL CUADRADO GRANDE,
        formulario1.setBounds(0,0,400,300);   //SI PONEMOS 0,0 EN COORDENADAS APARECERA EN EL MEDIO
        formulario1.setVisible(true);
        formulario1.setLocationRelativeTo(null); // QUIERO QUE MI INTERFAZ AL MOMENTO DE EJECUTARLO APAREZCA AL CENTRO DE MI PANTALLA
    }

}
