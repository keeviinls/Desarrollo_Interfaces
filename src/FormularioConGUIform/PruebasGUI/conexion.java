package FormularioConGUIform.PruebasGUI;

import java.sql.Connection;
import java.sql.DriverManager;

public class conexion {
    Connection con;

    public conexion(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "Noteloesperas1");

        }catch (Exception e){
            System.err.println("No se pudo establecer conexion con la Base de Datos. Error "+ e);
        }
    }

    public Connection getConnection(){
        return con;
    }
}
