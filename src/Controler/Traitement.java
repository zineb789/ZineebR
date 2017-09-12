package Controler;
import java.sql.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class Traitement {
    String conns="jdbc:mysql://localhost:3306/stagefe";
    String username= "root";
    String passe="";
    // ajouter
    public boolean Ajouter( String code,String civilite,String nom,String prenom,
            String cin, String tranche_age,String date_naissance,String lieu_naissance,String situation_familiale,
            String nombre_enfants,String nom_pere,String nom_mere,String adresse_village,String adresse_commune,
            String niveau_etude,String nombre_parcelles,String lieu_parcelles,String qte_safran_deposee,String pertes,
            String prix_achat,String date_depot,String date_prod,String excedent,String nombre_parts_sociales,
            String montant_parts_sociales)
    {
        String sql="INSERT INTO adherent (code,civilite,nom,prenom,cin,tranche_age,date_naissance,lieu_naissance,"
                + "situation_familiale,nombre_enfants,nom_pere,nom_mere,adresse_village,adresse_commune,niveau_etude,"
                + "nombre_parcelles,lieu_parcelles,qte_safran_deposee,pertes,prix_achat,date_depot,date_prod,excedent,"
                + "nombre_parts_sociales,montant_parts_sociales) "
                + "VALUES('"+code+"','"+civilite+"','"+nom+"','"+prenom+"','"+cin+"','"+tranche_age
                +"','"+date_naissance+"','"+ lieu_naissance+"','"+situation_familiale +"','"+nombre_enfants +"','"+nom_pere +"','"+nom_mere +"','"+ adresse_village+"','"+ adresse_commune+"','"+ niveau_etude+"','"+ nombre_parcelles+"','"+lieu_parcelles +"','"+qte_safran_deposee +"','"+ pertes+"','"+ prix_achat+"','"+date_depot +"','"+ date_prod+"','"+ excedent+"','"+nombre_parts_sociales +"','"+montant_parts_sociales +"')  ";
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
    //
    public DefaultTableModel getdata()
    {
     DefaultTableModel dm=new DefaultTableModel();
     dm.addColumn("id");
     dm.addColumn("code");
     dm.addColumn("civilite");
     dm.addColumn("nom");
     dm.addColumn("prenom");
     dm.addColumn("cin");
     dm.addColumn("tranche_age");
     dm.addColumn("date_naissance");
     dm.addColumn("lieu_naissance");
     dm.addColumn("situation_familiale");
     dm.addColumn("nombre_enfants");
     dm.addColumn("nom_pere");
     dm.addColumn("nom_mere");
     dm.addColumn("adresse_village");
     dm.addColumn("adresse_commune");
     dm.addColumn("niveau_etude");
     dm.addColumn("nombre_parcelles");
     dm.addColumn("lieu_parcelles");
     dm.addColumn("qte_safran_deposee");
     dm.addColumn("pertes");
     dm.addColumn("prix_achat");
     dm.addColumn("date_depot");
     dm.addColumn("date_prod");
     dm.addColumn("excedent");
     dm.addColumn("nombre_parts_sociales");
     dm.addColumn("montant_parts_sociales");
     String sql="SELECT * FROM adherent";
        try {
            Connection con= DriverManager.getConnection(conns,username,passe);
            Statement st=con.prepareStatement(sql);
            ResultSet rs=st.executeQuery(sql);
            while (rs.next())
            {
 //String ,String ,String ,String ,String    
                String id=rs.getString(1);
                String code=rs.getString(2);
                String civilite=rs.getString(3);
                String nom=rs.getString(4);
                String prenom=rs.getString(5);
                String cin=rs.getString(6);
                String tranche_age=rs.getString(7);
                String date_naissance=rs.getString(8);
                String lieu_naissance=rs.getString(9);
                String situation_familiale=rs.getString(10);
                String nombre_enfants=rs.getString(11);
                String nom_pere=rs.getString(12);
                String nom_mere=rs.getString(13);
                String adresse_village=rs.getString(14);
                String adresse_commune=rs.getString(15);
                String niveau_etude=rs.getString(16);
                String nombre_parcelles=rs.getString(17);
                String lieu_parcelles=rs.getString(18);
                String qte_safran_deposee=rs.getString(19);
                String pertes=rs.getString(20);
                String prix_achat=rs.getString(21);
                String date_depot=rs.getString(22);
                String date_prod=rs.getString(23);
                String excedent=rs.getString(24);
                String nombre_parts_sociales=rs.getString(25);
                String montant_parts_sociales=rs.getString(26);
                
                dm.addRow(new String []{id,code,civilite,nom,prenom,cin,tranche_age,date_naissance,lieu_naissance,situation_familiale,nombre_enfants,nom_pere,nom_mere,adresse_village,adresse_commune,niveau_etude,nombre_parcelles,lieu_parcelles,qte_safran_deposee,pertes,prix_achat,date_depot,date_prod,excedent,nombre_parts_sociales,montant_parts_sociales});
   
            }
            return dm;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null ;
    }

   // modifier
    public boolean Modifier(String id,String code,String civilite,String nom,String prenom,String cin,String tranche_age,String date_naissance,String lieu_naissance,String situation_familiale,String nombre_enfants,String nom_pere,String nom_mere,String adresse_village,String adresse_commune,String niveau_etude,String nombre_parcelles,String lieu_parcelles,String qte_safran_deposee,String pertes,String prix_achat,String date_depot,String date_prod,String excedent,String nombre_parts_sociales,String montant_parts_sociales)
    {
        String sql ="UPDATE adherent SET code ='"+code+"', civilite ='"+civilite+"', nom ='"+nom+"', prenom ='"+prenom+"',cin ='"+cin+"', tranche_age ='"+tranche_age+"',date_naissance ='"+date_naissance+"',lieu_naissance ='"+lieu_naissance+"',situation_familiale ='"+situation_familiale+"',nombre_enfants ='"+nombre_enfants+"',nom_pere ='"+nom_pere+"',nom_mere ='"+nom_mere+"',adresse_village ='"+adresse_village+"',adresse_commune ='"+adresse_commune+"',niveau_etude ='"+niveau_etude+"',nombre_parcelles ='"+nombre_parcelles+"',lieu_parcelles ='"+lieu_parcelles+"',qte_safran_deposee ='"+qte_safran_deposee+"',pertes ='"+pertes+"',prix_achat ='"+prix_achat+"',date_depot ='"+date_depot+"',date_prod ='"+date_prod+"',excedent ='"+excedent+"',nombre_parts_sociales ='"+nombre_parts_sociales+"',montant_parts_sociales ='"+montant_parts_sociales+"' WHERE id='" + id + "'";
        try {
            Connection con = DriverManager.getConnection(conns,username,passe);
            Statement st = con.prepareStatement(sql);
            st.execute(sql);
            return true;
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        return false;
        
        
    }
    // supprimer
     public boolean Supprimer(String id)
    {
        {
        //sql stmt
        String sql=" DELETE FROM adherent WHERE id ='"+id+"'";
        try {
            // get conn
            Connection con=DriverManager.getConnection(conns,username,passe);
            // stat
            Statement st=con.prepareStatement(sql);
            // execute
            st.execute(sql);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        }
    }
}
    

