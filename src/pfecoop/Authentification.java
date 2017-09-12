package pfecoop;

import static Controler.Classe1.con;
import javax.swing.JOptionPane;
import Controler.Classe1;
import database.*;
import com.mysql.jdbc.MysqlErrorNumbers;
import com.mysql.jdbc.integration.c3p0.MysqlConnectionTester;
import com.sun.java.swing.plaf.windows.resources.windows;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.sql.*;



public class Authentification extends javax.swing.JFrame {

    Connection con = null;
    ResultSet rs = null;
    PreparedStatement ps = null;
    
    public Authentification() {
        initComponents();
        con = Classe1.con();
        this.setSize(665, 395);
        this.setLocationRelativeTo(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pfecoop/safran-quality1.jpg"))); // NOI18N

        jLabel5.setText("jLabel5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Utilisateur :");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(330, 90, 120, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Mot de passe :");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(330, 150, 120, 30);

        jTextField1.setBackground(new java.awt.Color(218, 182, 238));
        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField1);
        jTextField1.setBounds(460, 90, 150, 30);

        jButton1.setBackground(new java.awt.Color(255, 51, 51));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(153, 0, 0));
        jButton1.setText("Se connecter");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(360, 220, 140, 40);

        jButton2.setBackground(new java.awt.Color(255, 51, 51));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(153, 0, 0));
        jButton2.setText("Fermer");
        jButton2.setBorder(null);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(510, 220, 130, 40);

        jPasswordField1.setBackground(new java.awt.Color(218, 182, 238));
        jPasswordField1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel1.add(jPasswordField1);
        jPasswordField1.setBounds(460, 150, 150, 30);

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\HP\\Desktop\\Logs\\Stage Zineb\\Logo.png")); // NOI18N
        jPanel1.add(jLabel6);
        jLabel6.setBounds(0, 0, 48, 48);

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\HP\\Desktop\\Logs\\Stage Zineb\\safran-quality1.jpg")); // NOI18N
        jPanel1.add(jLabel4);
        jLabel4.setBounds(0, 0, 650, 360);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 650, 360);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try {
            
            String sql = "select * from user where utilisateur=? and password=?";
            ps = con.prepareStatement(sql);
            ps.setString(1, jTextField1.getText());
            ps.setString(2, jPasswordField1.getText());
            rs = ps.executeQuery();
            
            if (rs.next()) {
                Accueil inter2 = new Accueil();
                inter2.setVisible(true);
                this.dispose();
              JOptionPane.showMessageDialog(null, "Vous êtes connectés !");
            } 
            else {
              JOptionPane.showMessageDialog(null, "La connexion a echoué !");
            }
        } 
        catch (Exception e) {
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Authentification.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Authentification.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Authentification.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Authentification.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Authentification().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
