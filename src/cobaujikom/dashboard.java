/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cobaujikom;

import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Administrator
 */
public class dashboard extends javax.swing.JFrame {

    /**
     * Creates new form dashboard
     */
    public dashboard() {
        initComponents();
        setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dashboardPanel = new javax.swing.JPanel();
        isiData = new javax.swing.JButton();
        lihatData = new javax.swing.JButton();
        keluarSesi = new javax.swing.JButton();
        labelNama = new javax.swing.JLabel();
        labelNIK = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        dashboardPanel.setBackground(new java.awt.Color(38, 38, 38));

        isiData.setText("Isi Data Perjalanan");
        isiData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                isiDataActionPerformed(evt);
            }
        });

        lihatData.setText("Catatan Perjalanan");
        lihatData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lihatDataActionPerformed(evt);
            }
        });

        keluarSesi.setText("Logout Sesi");
        keluarSesi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keluarSesiActionPerformed(evt);
            }
        });

        labelNama.setBackground(new java.awt.Color(204, 204, 204));
        labelNama.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        labelNama.setForeground(new java.awt.Color(204, 204, 204));
        labelNama.setText("user");

        labelNIK.setBackground(new java.awt.Color(204, 204, 204));
        labelNIK.setForeground(new java.awt.Color(204, 204, 204));
        labelNIK.setText("nik");

        jLabel7.setBackground(new java.awt.Color(204, 204, 204));
        jLabel7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("Selamat datang di aplikasi SelfCare!");

        javax.swing.GroupLayout dashboardPanelLayout = new javax.swing.GroupLayout(dashboardPanel);
        dashboardPanel.setLayout(dashboardPanelLayout);
        dashboardPanelLayout.setHorizontalGroup(
            dashboardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dashboardPanelLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(dashboardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dashboardPanelLayout.createSequentialGroup()
                        .addGroup(dashboardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(labelNIK)
                            .addComponent(labelNama))
                        .addContainerGap(329, Short.MAX_VALUE))
                    .addGroup(dashboardPanelLayout.createSequentialGroup()
                        .addComponent(isiData)
                        .addGap(77, 77, 77)
                        .addComponent(lihatData)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(keluarSesi)
                        .addGap(48, 48, 48))))
        );
        dashboardPanelLayout.setVerticalGroup(
            dashboardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dashboardPanelLayout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(labelNama)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelNIK)
                .addGap(45, 45, 45)
                .addComponent(jLabel7)
                .addGap(83, 83, 83)
                .addGroup(dashboardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(isiData)
                    .addComponent(lihatData)
                    .addComponent(keluarSesi))
                .addContainerGap(131, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 614, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(dashboardPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 436, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(dashboardPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void isiDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_isiDataActionPerformed
        try {
            String sql1 = "SELECT * FROM user WHERE NIK ='" + labelNIK.getText()+"';";
            java.sql.Connection conn1 = (Connection)Koneksi.configDB();
            java.sql.Statement stm = conn1.createStatement();
            java.sql.ResultSet res = stm.executeQuery(sql1);
            
            while (res.next()){
                isiPerjalanan a = new isiPerjalanan();
                a.labelNIK.setText("Logged in as " + Usr.usrId);
                System.out.println(Usr.usrId);
                new isiPerjalanan().setVisible(true);              
            }
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Ada yang salah", JOptionPane.INFORMATION_MESSAGE);
        }
        

    }//GEN-LAST:event_isiDataActionPerformed

    private void lihatDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lihatDataActionPerformed
        new catatanPerjalanan().setVisible(true);
    }//GEN-LAST:event_lihatDataActionPerformed

    private void keluarSesiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keluarSesiActionPerformed
       int jawab = JOptionPane.showOptionDialog(this, 
                    "Yakinn logout?", 
                    "Ya halo", 
                    JOptionPane.YES_NO_OPTION, 
                    JOptionPane.QUESTION_MESSAGE, null, null, null);
    
        if(jawab == JOptionPane.YES_OPTION){
            this.dispose();
            new login().setVisible(true);
        }
    }//GEN-LAST:event_keluarSesiActionPerformed

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
            java.util.logging.Logger.getLogger(dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new dashboard().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel dashboardPanel;
    private javax.swing.JButton isiData;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JButton keluarSesi;
    public javax.swing.JLabel labelNIK;
    public javax.swing.JLabel labelNama;
    private javax.swing.JButton lihatData;
    // End of variables declaration//GEN-END:variables
}
