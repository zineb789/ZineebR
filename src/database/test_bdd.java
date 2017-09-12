package database;

import java.net.Socket;
import java.sql.*;
public class test_bdd {
    
    Connection connection;
    Statement statement;
    String SQL;
    String url;
    String username;
    String password;
    Socket client;
    int Port;
    String Host;

    public test_bdd(String url, String username, String password, String Host,int Port) {
        this.url = url;
        this.username = username;
        this.password = password;
        this.Host = Host;
        
    }

  
    public Connection connexionDatabase(){
        try {
            
             Class.forName("com.mysql.jdbc.Driver");
            connection=DriverManager.getConnection(url,username,password);
        } catch(Exception e){
            System.err.println(e.getMessage());//pour afficher ou se trouve le prb exactement err pour afficher le erreur err
            
        }
        return connection;
    }
    public Connection closeconnexion(){
        try {
            connection.close();
        }
        catch (Exception e){
            System.err.println(e);
        }
        return connection;
    }
    //pour execution de requete
    public ResultSet executionQuery(String sql){
        connexionDatabase();
        ResultSet resultSet=null;
        try {
            statement = connection.createStatement();
            resultSet =statement.executeQuery(sql);
            System.out.println(sql);
            
        } catch (SQLException ex){
            System.err.println(ex);
        }
        return resultSet;
    }
    //pour execution de requete update
    public String executionUpdate (String sql){
        connexionDatabase();
        String result="";
        try {
            statement =connection.createStatement();
            statement.executeUpdate(sql);
            result=sql;
            
        }catch(SQLException ex){
            result = ex.toString();
        }
        return result;
    }
        //fonction de requete pour afficher tous 
        public ResultSet querySelectAll(String nomTable)
 {
     connexionDatabase();
     SQL = "SELECT * FROM " + nomTable;
     System.out.println(SQL);
     return this.executionQuery(SQL);
}
        //fonction pour afficher tous avec de parameter ("etat")
        public ResultSet querySelectAll(String nomTable,String etat){
            connexionDatabase();
            SQL="SELECT * FROM " + nomTable + " WHERE " + etat;
            return this.executionQuery(SQL);   
        }
        public ResultSet querySelect(String[] nomColonne,String nomTable){
        connexionDatabase();
        int i;
        SQL="SELECT";
        for(i=0;i<=nomColonne.length - 1;i++){
            SQL +=nomColonne[i];
            if(i < nomColonne.length - 1){
                SQL +=",";   
            }
        }
        SQL += "FROM" + nomTable;
        return this.executionQuery(SQL);
        }
        public ResultSet fcSelectCommand(String[] nomColonne, String nomTable,String etat){
            connexionDatabase();
            int i;
            SQL="SELECT";
            for (i=0; i<=nomColonne.length - 1;i++){
                SQL +=nomColonne[i];
                if(i<nomColonne.length-1){
                    SQL+=",";
                }
            }
            SQL+="FROM"+nomTable+"WHERE"+etat;
            return this.executionQuery(SQL);
        }
        //fonction d'entrer de donnee
        public String queryInsert(String nomTable,String[] contenuTableau){
            connexionDatabase();
            int i ;
            SQL="INSERT INTO" +nomTable+"VALUES(";
            for(i=0;i<=contenuTableau.length -1;i++){
                SQL+="'"+contenuTableau[i]+"'";
                if(i < contenuTableau.length-1) {
                    SQL+=",";
                }
                    
                }
            SQL+=")";
            return this.executionUpdate(SQL);
            }
        //
        public String queryInsert(String nomTable, String[] nomColonne,String[] contenuTableau){
            connexionDatabase();
              int i ;
            SQL="INSERT INTO" +nomTable+"(";
            for(i=0 ; i <= nomColonne.length -1 ; i++){
                SQL+= nomColonne[i];
                if(i < nomColonne.length-1) {
                    SQL+= ",";
                }
                    
                }
            SQL+=") VALUES(";
            for(i=0;i<=contenuTableau.length -1;i++){
                SQL+="'"+contenuTableau[i]+"'";
                if(i < contenuTableau.length-1) {
                    SQL+=",";
                }
                    
                }
            SQL+=")";
          
           return this.executionUpdate(SQL);
     
        }
        //
        public String queryUpdate(String nomTable, String[] nomColonne,String[] contenuTableau,String etat){
            connexionDatabase();
            int i;
            SQL="UPDATE" +nomTable+"SET";
             for(i=0;i<=nomColonne.length -1;i++){
                SQL+=nomColonne[i]+"='"+contenuTableau[i]+"'";
                if(i < nomColonne.length-1) {
                    SQL+=",";
                }
                    
                }
             SQL += "WHERE" + etat;
              return this.executionUpdate(SQL);
             
            
        }
        
        //fonction pour la requete supprimer sans parameter
        public String queryDelete(String nomtable){
           connexionDatabase();
           SQL+="DELETE FROM"+nomtable;
           return this.executionUpdate(SQL);
        }
          //fonction pour la requete supprimer avec parameter
        public String queryDelete(String nomTable,String etat){
           connexionDatabase();
           SQL+="DELETE FROM" + nomTable + "WHERE" +etat;
           return this.executionUpdate(SQL);
        }
}

