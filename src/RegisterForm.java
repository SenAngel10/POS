
import java.awt.Color;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Brayan
 */
public class RegisterForm extends javax.swing.JFrame {

    Conexion conn;
     String idus;
    Connection reg;
    public RegisterForm() {
        initComponents();
        conn = new Conexion();
        reg = conn.getConnection();
    }

    public RegisterForm(String user, String pass, String cve,String nombre, 
            String ap1, String ap2, String date, String email){
         initComponents();
        conn = new Conexion();
        reg = conn.getConnection();
        TextField_usuario.setText(user);
        TextField_pass.setText(pass);
        TextField_CVE.setText(cve);
        TextField_nombre.setText(nombre);
        TextField_Apaterno.setText(ap1);
        TextField_materno.setText(ap2);
        TextField_Born.setText(date);
        TextField_email.setText(email);
        }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel_Fondo = new javax.swing.JPanel();
        Barra_top = new javax.swing.JPanel();
        Btn_close = new javax.swing.JPanel();
        label_Xclose = new javax.swing.JLabel();
        Btn_Confir = new javax.swing.JPanel();
        label_btn = new javax.swing.JLabel();
        separator_usuario = new javax.swing.JSeparator();
        TextField_usuario = new javax.swing.JTextField();
        label_name = new javax.swing.JLabel();
        Label_icon = new javax.swing.JLabel();
        label_register = new javax.swing.JLabel();
        separator_pass = new javax.swing.JSeparator();
        TextField_pass = new javax.swing.JTextField();
        label_pass = new javax.swing.JLabel();
        separator_CVE = new javax.swing.JSeparator();
        TextField_CVE = new javax.swing.JTextField();
        label_CVE = new javax.swing.JLabel();
        separator_Apaterno = new javax.swing.JSeparator();
        TextField_Apaterno = new javax.swing.JTextField();
        label_Apaterno = new javax.swing.JLabel();
        separator_Born = new javax.swing.JSeparator();
        TextField_Born = new javax.swing.JTextField();
        label_Born = new javax.swing.JLabel();
        separator_materno = new javax.swing.JSeparator();
        TextField_materno = new javax.swing.JTextField();
        label_materno = new javax.swing.JLabel();
        separator_nombre = new javax.swing.JSeparator();
        TextField_nombre = new javax.swing.JTextField();
        label_nombre = new javax.swing.JLabel();
        separator_email = new javax.swing.JSeparator();
        TextField_email = new javax.swing.JTextField();
        label_email = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Panel_Fondo.setBackground(new java.awt.Color(255, 255, 255));
        Panel_Fondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Barra_top.setBackground(new java.awt.Color(255, 255, 255));
        Barra_top.setForeground(new java.awt.Color(255, 255, 255));

        Btn_close.setBackground(new java.awt.Color(255, 255, 255));

        label_Xclose.setBackground(new java.awt.Color(255, 255, 255));
        label_Xclose.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        label_Xclose.setForeground(new java.awt.Color(0, 0, 0));
        label_Xclose.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_Xclose.setText("X");
        label_Xclose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        label_Xclose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label_XcloseMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                label_XcloseMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                label_XcloseMouseExited(evt);
            }
        });

        javax.swing.GroupLayout Btn_closeLayout = new javax.swing.GroupLayout(Btn_close);
        Btn_close.setLayout(Btn_closeLayout);
        Btn_closeLayout.setHorizontalGroup(
            Btn_closeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_Xclose, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
        );
        Btn_closeLayout.setVerticalGroup(
            Btn_closeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Btn_closeLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(label_Xclose, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout Barra_topLayout = new javax.swing.GroupLayout(Barra_top);
        Barra_top.setLayout(Barra_topLayout);
        Barra_topLayout.setHorizontalGroup(
            Barra_topLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Barra_topLayout.createSequentialGroup()
                .addGap(0, 522, Short.MAX_VALUE)
                .addComponent(Btn_close, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        Barra_topLayout.setVerticalGroup(
            Barra_topLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Barra_topLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Btn_close, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        Panel_Fondo.add(Barra_top, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 30));

        Btn_Confir.setBackground(new java.awt.Color(255, 231, 179));

        label_btn.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        label_btn.setForeground(new java.awt.Color(0, 0, 0));
        label_btn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_btn.setText("Confirmar");
        label_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        label_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label_btnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                label_btnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                label_btnMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                label_btnMousePressed(evt);
            }
        });

        javax.swing.GroupLayout Btn_ConfirLayout = new javax.swing.GroupLayout(Btn_Confir);
        Btn_Confir.setLayout(Btn_ConfirLayout);
        Btn_ConfirLayout.setHorizontalGroup(
            Btn_ConfirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Btn_ConfirLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(label_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        Btn_ConfirLayout.setVerticalGroup(
            Btn_ConfirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Btn_ConfirLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(label_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        Panel_Fondo.add(Btn_Confir, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 530, 150, -1));
        Panel_Fondo.add(separator_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 150, 310, 12));

        TextField_usuario.setBackground(new java.awt.Color(255, 255, 255));
        TextField_usuario.setBorder(null);
        Panel_Fondo.add(TextField_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 130, 310, -1));

        label_name.setForeground(new java.awt.Color(0, 0, 0));
        label_name.setText("Nombre de usuario:");
        Panel_Fondo.add(label_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 140, -1));

        Label_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Favicon login.png"))); // NOI18N
        Panel_Fondo.add(Label_icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, 40));

        label_register.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        label_register.setForeground(new java.awt.Color(0, 0, 0));
        label_register.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_register.setText("Registro");
        label_register.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        label_register.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Panel_Fondo.add(label_register, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 50, 178, -1));
        Panel_Fondo.add(separator_pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 190, 310, 12));

        TextField_pass.setBackground(new java.awt.Color(255, 255, 255));
        TextField_pass.setBorder(null);
        Panel_Fondo.add(TextField_pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 170, 310, -1));

        label_pass.setForeground(new java.awt.Color(0, 0, 0));
        label_pass.setText("Contraseña:");
        Panel_Fondo.add(label_pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 150, -1));
        Panel_Fondo.add(separator_CVE, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 230, 310, 12));

        TextField_CVE.setBackground(new java.awt.Color(255, 255, 255));
        TextField_CVE.setBorder(null);
        Panel_Fondo.add(TextField_CVE, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 210, 310, -1));

        label_CVE.setForeground(new java.awt.Color(0, 0, 0));
        label_CVE.setText("Clave Elector:");
        Panel_Fondo.add(label_CVE, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 150, -1));
        Panel_Fondo.add(separator_Apaterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 310, 310, 12));

        TextField_Apaterno.setBackground(new java.awt.Color(255, 255, 255));
        TextField_Apaterno.setBorder(null);
        Panel_Fondo.add(TextField_Apaterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 290, 310, -1));

        label_Apaterno.setForeground(new java.awt.Color(0, 0, 0));
        label_Apaterno.setText("Apellido paterno:");
        Panel_Fondo.add(label_Apaterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, 150, -1));
        Panel_Fondo.add(separator_Born, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 390, 310, 12));

        TextField_Born.setBackground(new java.awt.Color(255, 255, 255));
        TextField_Born.setBorder(null);
        Panel_Fondo.add(TextField_Born, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 370, 310, -1));

        label_Born.setForeground(new java.awt.Color(0, 0, 0));
        label_Born.setText("Fecha de nacimiento:");
        Panel_Fondo.add(label_Born, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 370, 150, -1));
        Panel_Fondo.add(separator_materno, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 350, 310, 12));

        TextField_materno.setBackground(new java.awt.Color(255, 255, 255));
        TextField_materno.setBorder(null);
        Panel_Fondo.add(TextField_materno, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 330, 310, -1));

        label_materno.setForeground(new java.awt.Color(0, 0, 0));
        label_materno.setText("Apellido materno:");
        Panel_Fondo.add(label_materno, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, 150, -1));
        Panel_Fondo.add(separator_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 270, 310, 12));

        TextField_nombre.setBackground(new java.awt.Color(255, 255, 255));
        TextField_nombre.setBorder(null);
        Panel_Fondo.add(TextField_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 250, 310, -1));

        label_nombre.setForeground(new java.awt.Color(0, 0, 0));
        label_nombre.setText("Nombre:");
        Panel_Fondo.add(label_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, 150, -1));
        Panel_Fondo.add(separator_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 430, 310, 12));

        TextField_email.setBackground(new java.awt.Color(255, 255, 255));
        TextField_email.setBorder(null);
        Panel_Fondo.add(TextField_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 410, 310, -1));

        label_email.setForeground(new java.awt.Color(0, 0, 0));
        label_email.setText("Correo");
        Panel_Fondo.add(label_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 410, 150, -1));

        getContentPane().add(Panel_Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 570));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void label_XcloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_XcloseMouseClicked

        Login lg = new Login();
        lg.setVisible(true);
        lg.pack();
        lg.setLocationRelativeTo(null);
        lg.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_label_XcloseMouseClicked

    private void label_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_btnMouseClicked
      javax.swing.JOptionPane.showMessageDialog(this, "Registrado exitosamente \n" + TextField_usuario.getText(), "Login", javax.swing.JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_label_btnMouseClicked

    private void label_btnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_btnMouseEntered
        Btn_Confir.setBackground(new Color(255,236,196));
    }//GEN-LAST:event_label_btnMouseEntered

    private void label_btnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_btnMouseExited
       Btn_Confir.setBackground(new Color(255,231,179));
    }//GEN-LAST:event_label_btnMouseExited

    private void label_XcloseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_XcloseMouseEntered
       Btn_close.setBackground(Color.red);
       label_Xclose.setForeground(Color.white);
    }//GEN-LAST:event_label_XcloseMouseEntered

    private void label_XcloseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_XcloseMouseExited
        Btn_close.setBackground(Color.white);
        label_Xclose.setForeground(Color.black);
    }//GEN-LAST:event_label_XcloseMouseExited

    private void label_btnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_btnMousePressed
      /*String user, String pass, String cve,String nombre, 
            String ap1, String ap2, String date, String email*/
        /* TextField_usuario.setText(user);
        TextField_pass.setText(pass);
        TextField_CVE.setText(cve);
        TextField_nombre.setText(nombre);
        TextField_Apaterno.setText(ap1);
        TextField_materno.setText(ap2);
        TextField_Born.setText(date);
        TextField_email.setText(email);*/
        if(TextField_usuario.getText().equals(" ") ||  TextField_pass.getText().equals(" ") || TextField_CVE.getText().equals(" ") || TextField_nombre.getText().equals(" ")
                || TextField_Apaterno.getText().equals(" ") || TextField_materno.getText().equals(" ") || TextField_Born.getText().equals(" ") || TextField_email.getText().equals(" ")){
             javax.swing.JOptionPane.showMessageDialog(this, "Debe llenar todos los campos \n", "AVISO", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            TextField_usuario.requestFocus();
        }else{
            String user =  TextField_usuario.getText();
            String pass = TextField_pass.getText();
            String CVE = TextField_CVE.getText();
            String name = TextField_nombre.getText();
            String app1 = TextField_Apaterno.getText();
            String app2 = TextField_materno.getText();
            String nacimiento = TextField_Born.getText();
            String correo = TextField_email.getText();
            
            if(user == null || "".equals(user) || pass == null || "".equals(pass) || CVE == null || "".equals(CVE) || name == null || "".equals(name) || app1 == null || "".equals(app1) || app2 == null || "".equals(app2) || nacimiento == null || "".equals(nacimiento) || correo == null || "".equals(correo)){
                javax.swing.JOptionPane.showMessageDialog(this, "Debe llenar todos los campos \n", "AVISO", javax.swing.JOptionPane.INFORMATION_MESSAGE);
                TextField_usuario.requestFocus();
            }else{
                try{
                    InsertUser(user, pass, CVE, name, app1, app2, nacimiento, correo);
            } catch (SQLException ex) {
                    Logger.getLogger(RegisterForm.class.getName()).log(Level.SEVERE, null, ex);
            }
                
          }
        }  
           TextField_usuario.setText(" ");
        TextField_pass.setText(" ");
        TextField_CVE.setText(" ");
        TextField_nombre.setText(" ");
        TextField_Apaterno.setText(" ");
        TextField_materno.setText(" ");
        TextField_Born.setText(" ");
        TextField_email.setText(" ");
    }//GEN-LAST:event_label_btnMousePressed

     public void InsertUser(String user, String pass, String cve,String nombre, 
            String ap1, String ap2, String date, String email) throws SQLException{
        Statement stm = reg.createStatement();
        
        stm.executeUpdate("INSERT INTO `admin` (`usuario`, `contraseña`, `claveE`, `nombre`, `apellidoP`, `apellidoM`, `fechaN`, `correo`) VALUES ('"+user+"', '"+pass+"', '"+ cve +"', '"+ nombre +"', '"+ap1+"', '"+ap2+"', '"+date+"', '"+email+"')");
        javax.swing.JOptionPane.showMessageDialog(this, "¡Usuario registrado correctamente! \n", "HECHO", javax.swing.JOptionPane.INFORMATION_MESSAGE);
        
    }
    
    public static void main(String args[]) {

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisterForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Barra_top;
    private javax.swing.JPanel Btn_Confir;
    private javax.swing.JPanel Btn_close;
    private javax.swing.JLabel Label_icon;
    private javax.swing.JPanel Panel_Fondo;
    private javax.swing.JTextField TextField_Apaterno;
    private javax.swing.JTextField TextField_Born;
    private javax.swing.JTextField TextField_CVE;
    private javax.swing.JTextField TextField_email;
    private javax.swing.JTextField TextField_materno;
    private javax.swing.JTextField TextField_nombre;
    private javax.swing.JTextField TextField_pass;
    private javax.swing.JTextField TextField_usuario;
    private javax.swing.JLabel label_Apaterno;
    private javax.swing.JLabel label_Born;
    private javax.swing.JLabel label_CVE;
    private javax.swing.JLabel label_Xclose;
    private javax.swing.JLabel label_btn;
    private javax.swing.JLabel label_email;
    private javax.swing.JLabel label_materno;
    private javax.swing.JLabel label_name;
    private javax.swing.JLabel label_nombre;
    private javax.swing.JLabel label_pass;
    private javax.swing.JLabel label_register;
    private javax.swing.JSeparator separator_Apaterno;
    private javax.swing.JSeparator separator_Born;
    private javax.swing.JSeparator separator_CVE;
    private javax.swing.JSeparator separator_email;
    private javax.swing.JSeparator separator_materno;
    private javax.swing.JSeparator separator_nombre;
    private javax.swing.JSeparator separator_pass;
    private javax.swing.JSeparator separator_usuario;
    // End of variables declaration//GEN-END:variables
}
