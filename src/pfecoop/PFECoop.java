package pfecoop;

import static database.test_parameter.HOST_DB;
import static database.test_parameter.PASSWORD_DB;
import static database.test_parameter.USERNAME_DB;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class PFECoop {

    public static void main(String[] args) {
      Connection conn=null;
        try{
            conn = DriverManager.getConnection(HOST_DB,USERNAME_DB,PASSWORD_DB);
            System.out.println("connected!");
        }
        catch(SQLException e){
            System.err.println(e);
        }
    }
    
}