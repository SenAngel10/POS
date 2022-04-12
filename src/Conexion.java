
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
     private static Connection con;
     //Metodo para la conexion de la DB a pv por medio de Xampp
    public Conexion(){
      con = null;
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost/pv","root","");
        
        if(con != null)
                System.out.println("Conexión establecida exitosamente");
    }catch (SQLException e) {
            System.err.print(e.toString());
             System.out.println("Conexión Fallida:\n\n"+e);
        }

   
        }
    //metodo para obtener la conexion en cualquier javaFrame
   
     public Connection getConnection(){
        return con;
    }
}
