/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pfecoop;

/**
 *
 * @author HP
 */
public class Gamme_Safran extends javax.swing.JFrame {

    /**
     * Creates new form Gamme_Safran
     */
    public Gamme_Safran() {
        initComponents();
        this.setSize(1000, 600);
        this.setLocationRelativeTo(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(218, 182, 238));
        jPanel1.setLayout(null);

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon("C:\\Users\\HP\\Desktop\\Logs\\Stage Zineb\\Retour.png")); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(920, 500, 50, 50);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\HP\\Desktop\\Logs\\Stage Zineb\\Logo.png")); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 48, 48);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pfecoop/2.png"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(540, 30, 160, 190);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pfecoop/1.png"))); // NOI18N
        jPanel1.add(jLabel3);
        jLabel3.setBounds(80, 30, 130, 190);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pfecoop/3.png"))); // NOI18N
        jPanel1.add(jLabel4);
        jLabel4.setBounds(290, 50, 159, 170);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pfecoop/4.png"))); // NOI18N
        jPanel1.add(jLabel5);
        jLabel5.setBounds(280, 300, 120, 170);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pfecoop/5.png"))); // NOI18N
        jPanel1.add(jLabel6);
        jLabel6.setBounds(40, 270, 150, 250);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pfecoop/6.png"))); // NOI18N
        jPanel1.add(jLabel7);
        jLabel7.setBounds(530, 320, 133, 150);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pfecoop/7.png"))); // NOI18N
        jPanel1.add(jLabel8);
        jLabel8.setBounds(770, 330, 140, 140);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pfecoop/8.png"))); // NOI18N
        jPanel1.add(jLabel9);
        jLabel9.setBounds(770, 120, 207, 100);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Safran en poudre de 2 g");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(790, 230, 170, 17);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("Safran en pistils de 0,1 g");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(310, 230, 180, 30);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("Safran en boîte de 10 g");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(210, 490, 170, 20);

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setText("Safran en pot de verre de 1 g");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(610, 490, 210, 20);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1000, 600);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        InterfacePrdts clA = new InterfacePrdts();
        clA.setVisible(true);
        this.dispose();    // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Gamme_Safran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Gamme_Safran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Gamme_Safran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Gamme_Safran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Gamme_Safran().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}