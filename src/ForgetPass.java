
import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Manuel
 */
public class ForgetPass extends javax.swing.JFrame {
    PreparedStatement ps;
    public String user;
    Conexion conn;
    Connection reg;
   

    /**
     * Creates new form ForgetPass
     */
    public ForgetPass() {
        initComponents();
        conn = new Conexion();
        reg = conn.getConnection();
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
        label_usuario = new javax.swing.JLabel();
        label_NewPass = new javax.swing.JLabel();
        label_imagen = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        txtNpass = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator1 = new javax.swing.JSeparator();
        txtCpass = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        Panel_btnConf = new javax.swing.JPanel();
        label_confirmar = new javax.swing.JLabel();
        label_title = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(250, 250, 250));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label_usuario.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        label_usuario.setForeground(new java.awt.Color(0, 0, 0));
        label_usuario.setText("Usuario");
        jPanel1.add(label_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, -1, -1));

        label_NewPass.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        label_NewPass.setForeground(new java.awt.Color(0, 0, 0));
        label_NewPass.setText("Nueva Contrase??a");
        jPanel1.add(label_NewPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, -1, -1));

        label_imagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Favicon login.png"))); // NOI18N
        jPanel1.add(label_imagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        jLabel3.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Confirmar Contrase??a");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, -1, -1));

        txtUser.setBackground(new java.awt.Color(255, 255, 255));
        txtUser.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        txtUser.setForeground(new java.awt.Color(102, 102, 102));
        txtUser.setBorder(null);
        txtUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserActionPerformed(evt);
            }
        });
        jPanel1.add(txtUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 110, 240, 20));

        txtNpass.setBackground(new java.awt.Color(255, 255, 255));
        txtNpass.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        txtNpass.setForeground(new java.awt.Color(102, 102, 102));
        txtNpass.setBorder(null);
        txtNpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNpassActionPerformed(evt);
            }
        });
        jPanel1.add(txtNpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 190, 240, 20));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 220, 240, 10));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 140, 240, 10));

        txtCpass.setBackground(new java.awt.Color(255, 255, 255));
        txtCpass.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        txtCpass.setForeground(new java.awt.Color(102, 102, 102));
        txtCpass.setBorder(null);
        jPanel1.add(txtCpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 260, 240, 21));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 290, 240, 10));

        Panel_btnConf.setBackground(new java.awt.Color(255, 231, 179));

        label_confirmar.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        label_confirmar.setForeground(new java.awt.Color(0, 0, 0));
        label_confirmar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_confirmar.setText("Confirmar");
        label_confirmar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        label_confirmar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label_confirmarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                label_confirmarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                label_confirmarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout Panel_btnConfLayout = new javax.swing.GroupLayout(Panel_btnConf);
        Panel_btnConf.setLayout(Panel_btnConfLayout);
        Panel_btnConfLayout.setHorizontalGroup(
            Panel_btnConfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_confirmar, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
        );
        Panel_btnConfLayout.setVerticalGroup(
            Panel_btnConfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_confirmar, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanel1.add(Panel_btnConf, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 340, 140, 30));

        label_title.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        label_title.setForeground(new java.awt.Color(0, 0, 0));
        label_title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_title.setText("Cambio de Contrase??a");
        jPanel1.add(label_title, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 40, 200, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 579, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserActionPerformed

    private void txtNpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNpassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNpassActionPerformed

    private void label_confirmarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_confirmarMouseClicked
          String newC ="";
          String user = "";
        if(txtCpass.getText().equals("") || txtNpass.getText().equals("") || txtUser.getText().equals("")){
            JOptionPane.showMessageDialog(null, "favor de llenar los campos");
        }else{
              try{
               
                
                newC = txtNpass.getText();
               user = txtUser.getText();
                
                ps = reg.prepareStatement( "UPDATE `admin` SET `contrase??a`='" + newC + "' WHERE `admin`.`usuario`='" + user + "'");
    
               
                int rs = ps.executeUpdate();
                
                System.out.println(rs);
                JOptionPane.showMessageDialog(null, "Contrase??a Actualizada");
                limpiarCajas();
                
            } catch (SQLException e) {
                 Logger.getLogger(ForgetPass.class.getName()).log(Level.SEVERE, null, e);
            }
        }
        
    }//GEN-LAST:event_label_confirmarMouseClicked
    
     private void limpiarCajas(){
        txtCpass.setText("");
        txtNpass.setText("");
        txtUser.setText("");
     }
    private void label_confirmarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_confirmarMouseEntered
        Panel_btnConf.setBackground(new Color(255,236,196));
    }//GEN-LAST:event_label_confirmarMouseEntered

    private void label_confirmarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_confirmarMouseExited
        Panel_btnConf.setBackground(new Color(255,231,179));
    }//GEN-LAST:event_label_confirmarMouseExited

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
            java.util.logging.Logger.getLogger(ForgetPass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ForgetPass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ForgetPass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ForgetPass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ForgetPass().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Panel_btnConf;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel label_NewPass;
    private javax.swing.JLabel label_confirmar;
    private javax.swing.JLabel label_imagen;
    private javax.swing.JLabel label_title;
    private javax.swing.JLabel label_usuario;
    private javax.swing.JTextField txtCpass;
    private javax.swing.JTextField txtNpass;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
