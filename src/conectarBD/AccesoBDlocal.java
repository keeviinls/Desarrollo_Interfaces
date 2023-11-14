package conectarBD;


import com.mysql.cj.x.protobuf.MysqlxPrepare;
import java.sql.*;
import java.util.*;

public class AccesoBDlocal {
    static Scanner sc = new Scanner(System.in);
    static Connection conn = null;
    public static void main(String[] args) throws SQLException {
        establecerConexion();
        asignar_bd();
        consular_datos();
    }

    private static void asignar_bd() throws SQLException {
        String query = "use mydb";
        Statement st = conn.createStatement();
        st.executeUpdate(query);
        System.out.println("Asignacion realizada correctamente");
    }

    private static void consular_datos() throws SQLException {
        PreparedStatement ps = conn.prepareStatement("select * from users where id=?");
        System.out.println("Dime la ID del usuario");
        String id = sc.next();
        ps.setString(1,id);
        ResultSet rs = ps.executeQuery();
        while (rs.next()){
            System.out.println("ID: "+rs.getString(1)+" username: "+rs.getString(2) + " surname: "+rs.getString(3) +
                    " DNI: "+rs.getString(4)+ " email: "+rs.getString(5) + " password: "+rs.getString(6));
        }
    }


    private static void establecerConexion() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/";
        String user = "root";
        String pwd = "admin";

        conn = DriverManager.getConnection(url, user, pwd);
    }
}
