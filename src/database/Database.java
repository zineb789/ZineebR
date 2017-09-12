
package database;

import java.io.Serializable;
import java.sql.*;
/*import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;*/
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
public class Database implements Serializable {
    String SQL;
    Statement statement;
     private static Database _db;
    private Connection _con = null;

    private ResultSet _rs;

    /**
     *
     */
    private CallableStatement _cs;

    /**
     *
     */
    private PreparedStatement _ps;

    /**
     *
     */
    private DatabaseMetaData _dbmeta;

    /**
     *
     */
    private ResultSetMetaData _rsmeta;

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     *
     */
    public int currentId;
     /**
     *
     */
    private Database() {
        if (_con == null) {
            
            
            try {
                 
                Class.forName("com.mysql.jdbc.Driver");
                 
                _con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/stagefe", "root", "");
                _dbmeta = _con.getMetaData();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                System.err.println(ex.getMessage());
            }
            
        }
    }
    public Connection connexionDatabase(){
        try {
            
             Class.forName("com.mysql.jdbc.Driver");
            _con=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/stagefe", "root", "");
        } catch(Exception e){
            System.err.println(e.getMessage());
        }
        return _con;
    }
    public Connection closeconnexion(){
        try {
            _con.close();
        }
        catch (Exception e){
            System.err.println(e);
        }
        return _con;
    }

  
    
    /**
     * @param _applet
     */
 

    /**
     *
     * @return
     */
    public static Database getInstance() {
        if (_db == null) {
            _db = new Database();
        }
        return _db;
    }

    /**
     *
     * @param arg0
     * @return
     */
    
    public synchronized ResultSet Keys() {
        try {
            _rs=_ps.getGeneratedKeys();
        } catch (SQLException e) {
        }
        return _rs;
    }
    
    public synchronized ResultSet doQuery(String arg0) {
        try {
            _ps = _con.prepareStatement(arg0);
            _rs = _ps.executeQuery();
            _rsmeta = _rs.getMetaData();
        } catch (SQLException e) {
        }
        return _rs;
    }

    /**
     * @param arg0
     * @return
     * @throws SQLException
     */
    public synchronized ResultSet doCall(String arg0) throws SQLException {
        try {
            _cs = _con.prepareCall(arg0);
            _rs = _ps.executeQuery();
            _rsmeta = _rs.getMetaData();
        } catch (SQLException e) {
            throw new SQLException(e.getMessage());
        }
        return _rs;
    }

    public synchronized ResultSet doQuery(String arg0, Object... objects) throws SQLException {
        try {
            _ps = _con.prepareStatement(arg0);
            for (int i = 0; i < objects.length; i++) {
                _ps.setObject(i + 1, objects[i]);
            }
            _rs = _ps.executeQuery();
            _rsmeta = _rs.getMetaData();
        } catch (SQLException e) {
            throw new SQLException(e.getMessage());
        }
        return _rs;
    }

     public ResultSet executionQuery(String sql){
        connexionDatabase();
        ResultSet resultSet=null;
        try {
            statement = _con.createStatement();
            resultSet =statement.executeQuery(sql);
            System.out.println(sql);
            
        } catch (SQLException ex){
            System.err.println(ex);
        }
        return resultSet;
    }
    public synchronized ResultSet doCall(String arg0, Object... objects) throws SQLException {
        try {
            _cs = _con.prepareCall(arg0);
            for (int i = 0; i < objects.length; i++) {
                _cs.setObject(i + 1, objects[i]);
            }
            _rs = _cs.executeQuery();
            _rsmeta = _rs.getMetaData();
        } catch (SQLException e) {
            throw new SQLException(e.getMessage());
        }
        return _rs;
    }

    public synchronized boolean doNonQuery(String arg0) throws SQLException {
        try {
            _ps = _con.prepareStatement(arg0,PreparedStatement.RETURN_GENERATED_KEYS    );
            _ps.execute();
            return true;
        } catch (SQLException e) {
            throw new SQLException(e.getMessage());
        }
    }

    public synchronized boolean doNonQuery(String arg0, Object... objects) throws SQLException {
        try {
            _ps = _con.prepareStatement(arg0,PreparedStatement.RETURN_GENERATED_KEYS   );
            for (int i = 0; i < objects.length; i++) {
                _ps.setObject(i + 1, objects[i]);
            }
            _ps.execute();
            return true;
        } catch (SQLException e) {
            throw new SQLException(e.getMessage());
        }
    }

    public synchronized Connection getConnection() {
        return _con;
    }

    public void comboFill(JComboBox c,String arg0) throws SQLException{
        c.removeAllItems();
        ResultSet rs = this.doQuery(arg0);
        while(rs.next()){
            c.addItem(rs.getString(1));
        }
        
    }
    
    public synchronized void setConnection(Connection _con) {
        this._con = _con;
    }
    
   

    @Override
    protected void finalize() throws Throwable {
        try {
            _rs.close();
            _ps.close();
            _cs.close();
            _con.close();
            super.finalize();
        } catch (SQLException e) {
            throw new SQLException(e.getMessage());
        }

    }
   

}

    

