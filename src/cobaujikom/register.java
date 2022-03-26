/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cobaujikom;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Arrays;
import org.joda.time.LocalDate;
import org.joda.time.Period;
import org.joda.time.PeriodType;
import javax.swing.JOptionPane;

/**
 *
 * @author Administrator
 */
public class register extends javax.swing.JFrame {

    public register() {
        initComponents();
        setResizable(false);
        revalidate();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        registerPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        formNIK = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        formNama = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        formEmail = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        buttonSubmit = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        formNomorHP = new javax.swing.JTextField();
        dateChooser = new com.toedter.calendar.JDateChooser();
        boxKelamin = new javax.swing.JComboBox<>();
        formPassword = new javax.swing.JPasswordField();
        formPassword1 = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        registerPanel.setBackground(new java.awt.Color(38, 38, 38));

        jLabel2.setBackground(new java.awt.Color(204, 204, 204));
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("NIK");

        formNIK.setToolTipText("Username");
        formNIK.setName(""); // NOI18N

        jLabel3.setBackground(new java.awt.Color(204, 204, 204));
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("Nama Lengkap");

        formNama.setToolTipText("Password");

        jLabel4.setBackground(new java.awt.Color(204, 204, 204));
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("Password");

        jLabel5.setBackground(new java.awt.Color(204, 204, 204));
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("Jenis Kelamin");

        jLabel6.setBackground(new java.awt.Color(204, 204, 204));
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("Email");

        formEmail.setToolTipText("Password");

        jLabel7.setBackground(new java.awt.Color(204, 204, 204));
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("Konfirmasi Password");

        buttonSubmit.setText("Daftar Atuh");
        buttonSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSubmitActionPerformed(evt);
            }
        });

        jLabel8.setBackground(new java.awt.Color(204, 204, 204));
        jLabel8.setForeground(new java.awt.Color(204, 204, 204));
        jLabel8.setText("Tanggal Lahir");

        jLabel9.setBackground(new java.awt.Color(204, 204, 204));
        jLabel9.setForeground(new java.awt.Color(204, 204, 204));
        jLabel9.setText("Nomor Telepon");

        formNomorHP.setToolTipText("Password");

        boxKelamin.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Laki-laki", "Perempuan", "Bencong" }));

        formPassword1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                formPassword1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout registerPanelLayout = new javax.swing.GroupLayout(registerPanel);
        registerPanel.setLayout(registerPanelLayout);
        registerPanelLayout.setHorizontalGroup(
            registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(registerPanelLayout.createSequentialGroup()
                .addGroup(registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(registerPanelLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(registerPanelLayout.createSequentialGroup()
                        .addContainerGap(61, Short.MAX_VALUE)
                        .addGroup(registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(registerPanelLayout.createSequentialGroup()
                                .addGroup(registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(formNIK)
                                            .addComponent(jLabel3)
                                            .addComponent(formNama, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                                            .addComponent(jLabel2))
                                        .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(registerPanelLayout.createSequentialGroup()
                                .addGroup(registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(formPassword, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(dateChooser, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE))
                                .addGap(73, 73, 73)))
                        .addGroup(registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(formEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addComponent(formNomorHP, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(boxKelamin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(formPassword1))))
                .addContainerGap(68, Short.MAX_VALUE))
        );
        registerPanelLayout.setVerticalGroup(
            registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(registerPanelLayout.createSequentialGroup()
                .addContainerGap(68, Short.MAX_VALUE)
                .addGroup(registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(formNIK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boxKelamin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(registerPanelLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(formNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(registerPanelLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(formEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(formNomorHP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(registerPanelLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(formPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(registerPanelLayout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(formPassword1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(26, 26, 26)
                .addComponent(buttonSubmit)
                .addGap(67, 67, 67))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 614, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(registerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 436, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(registerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSubmitActionPerformed
        if (formNIK.getText().equals("") || formNama.getText().equals("")
                || formNama.getText().equals("") || boxKelamin.getSelectedItem().equals("")
                || formEmail.getText().equals("") || dateChooser.getDate().equals("")
                || formNomorHP.getText().equals("") || formPassword.getText().equals("")
                || formPassword1.getText().equals("")){  
            JOptionPane.showMessageDialog(this, "ada form yang masih kosong");   
            
        } else if (!Arrays.equals(formPassword.getPassword(), formPassword1.getPassword())){
            JOptionPane.showMessageDialog(this, "kolom password beda");  
              
        } else {
            try {
                LocalDate birthdate = new LocalDate(dateChooser.getDate());
                LocalDate today = new LocalDate();
                Period period = new Period(birthdate, today, PeriodType.yearMonthDay());
                int umurUser = period.getYears();

                String sql = "INSERT INTO user VALUES ('"+formNIK.getText()+"','"
                        +formNama.getText()+"','"+boxKelamin.getSelectedItem()+"','"
                        +formEmail.getText()+"','"+umurUser+"','"
                        +formNomorHP.getText()+"','"+formPassword.getText()+"')";
                    java.sql.Connection conn=(Connection)Koneksi.configDB();
                    java.sql.PreparedStatement pst=conn.prepareStatement(sql);
                    pst.execute();

                JOptionPane.showMessageDialog(this, "Anda berhasil mendaftar, silahkan masuk");
                this.dispose();
                
            } catch (HeadlessException | SQLException e) {
                JOptionPane.showMessageDialog(this, e.getMessage(), "Ada yang salah", JOptionPane.INFORMATION_MESSAGE);
            }
        }        
        
    }//GEN-LAST:event_buttonSubmitActionPerformed

    private void formPassword1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_formPassword1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_formPassword1ActionPerformed

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
            java.util.logging.Logger.getLogger(register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> boxKelamin;
    private javax.swing.JButton buttonSubmit;
    private com.toedter.calendar.JDateChooser dateChooser;
    private javax.swing.JTextField formEmail;
    private javax.swing.JTextField formNIK;
    private javax.swing.JTextField formNama;
    private javax.swing.JTextField formNomorHP;
    private javax.swing.JPasswordField formPassword;
    private javax.swing.JPasswordField formPassword1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel registerPanel;
    // End of variables declaration//GEN-END:variables
}
