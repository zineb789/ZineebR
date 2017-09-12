
package database;

import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;


public class test_parameter {
    public static String IPHOST = "127.0.0.1";
    public static String HOST_DB = "jdbc:mysql://localhost:3306/stagefe";
    public static String USERNAME_DB = "root";
    public static String PASSWORD_DB = "";//"root"
    //public static String PORT="11111";
    //public static String USER;
    public static int PORT = 11111;
    public static String USER;
    
    public static void main(String[] args){
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
