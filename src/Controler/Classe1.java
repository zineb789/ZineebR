package Controler;

import java.sql.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
public class Classe1 {
    Connection con=null;
    String conns="jdbc:mysql://localhost:3306/stagefe";
    String username= "root";
    String passe="";
    public static Connection con(){
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/stagefe", "root", "");
            //JOptionPane.showMessageDialog(null, "la connexion de la base de donnee est reussite ");
            return con;
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
    // ajouter
    public boolean Ajouter( String code,String civilite,String nom,String prenom, String cin, String tranche_age,String date_naissance,String lieu_naissance,String situation_familiale,String nombre_enfants,String nom_pere,String nom_mere,String adresse_village,String adresse_commune,String niveau_etude,String nombre_parcelles,String lieu_parcelles,String qte_safran_deposee,String pertes,String prix_achat,String date_depot,String date_prod,String excedent,String nombre_parts_sociales,String montant_parts_sociales)
    {
        String sql="INSERT INTO adherent (code,civilite,nom,prenom,cin,tranche_age,date_naissance,lieu_naissance,situation_familiale,nombre_enfants,nom_pere,nom_mere,adresse_village,adresse_commune,niveau_etude,nombre_parcelles,lieu_parcelles,qte_safran_deposee,pertes,prix_achat,date_depot,date_prod,excedent,nombre_parts_sociales,montant_parts_sociales) "
                + "VALUES('"+code+"','"+civilite+"','"+nom+"','"+prenom+"','"+cin+"','"+tranche_age+"','"+date_naissance+"','"+lieu_naissance+"','"+situation_familiale+"','"+nombre_enfants+"','"+nom_pere+"','"+nom_mere+"','"+adresse_village+"','"+adresse_commune+"','"+niveau_etude+"','"+nombre_parcelles+"','"+lieu_parcelles+"','"+qte_safran_deposee+"','"+pertes+"','"+prix_achat+"','"+date_depot+"','"+date_prod+"','"+excedent+"','"+nombre_parts_sociales+"','"+montant_parts_sociales+"')  ";
        try {
        
        Connection con= DriverManager.getConnection(conns,username,passe);
        Statement st=con.prepareStatement(sql);
        st.execute(sql);
        return true;
        
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
        
    }
    
}
