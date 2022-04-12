
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class Login extends javax.swing.JFrame {
    
    int xMouse, yMouse;
    Conexion conn;
    Connection reg;
    public Login() {
        initComponents();
        setLocationRelativeTo(null);
        conn = new Conexion();
        reg = conn.getConnection();
    
    }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Background = new javax.swing.JPanel();
        Imagen_Der = new javax.swing.JLabel();
        jPanel_Barra = new javax.swing.JPanel();
        Btn_close = new javax.swing.JPanel();
        label_Xclose = new javax.swing.JLabel();
        Favicon = new javax.swing.JLabel();
        labelIniciarsesion = new javax.swing.JLabel();
        LabelUUsuairio = new javax.swing.JLabel();
        Ingresr_usuario = new javax.swing.JTextField();
        Separator_Usuario = new javax.swing.JSeparator();
        labelpass = new javax.swing.JLabel();
        Separator_pass = new javax.swing.JSeparator();
        passField_pass = new javax.swing.JPasswordField();
        Panel_btnEnter = new javax.swing.JPanel();
        label_Entrar = new javax.swing.JLabel();
        Label_ForgetPass = new javax.swing.JLabel();
        Label_Register = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        Background.setBackground(new java.awt.Color(255, 255, 255));
        Background.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        Background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Imagen_Der.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/login.png"))); // NOI18N
        Background.add(Imagen_Der, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 0, 320, 520));

        jPanel_Barra.setBackground(new java.awt.Color(255, 255, 255));
        jPanel_Barra.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel_BarraMouseDragged(evt);
            }
        });
        jPanel_Barra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel_BarraMousePressed(evt);
            }
        });

        Btn_close.setBackground(new java.awt.Color(255, 255, 255));

        label_Xclose.setBackground(new java.awt.Color(255, 255, 255));
        label_Xclose.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
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
            .addComponent(label_Xclose, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel_BarraLayout = new javax.swing.GroupLayout(jPanel_Barra);
        jPanel_Barra.setLayout(jPanel_BarraLayout);
        jPanel_BarraLayout.setHorizontalGroup(
            jPanel_BarraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_BarraLayout.createSequentialGroup()
                .addComponent(Btn_close, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 772, Short.MAX_VALUE))
        );
        jPanel_BarraLayout.setVerticalGroup(
            jPanel_BarraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Btn_close, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        Background.add(jPanel_Barra, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 30));

        Favicon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Favicon login.png"))); // NOI18N
        Background.add(Favicon, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 50, 40));

        labelIniciarsesion.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        labelIniciarsesion.setForeground(new java.awt.Color(0, 0, 0));
        labelIniciarsesion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelIniciarsesion.setText("INICIAR SESION");
        Background.add(labelIniciarsesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, 230, 40));

        LabelUUsuairio.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        LabelUUsuairio.setForeground(new java.awt.Color(0, 0, 0));
        LabelUUsuairio.setText("Usuario");
        Background.add(LabelUUsuairio, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, -1));

        Ingresr_usuario.setBackground(new java.awt.Color(255, 255, 255));
        Ingresr_usuario.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        Ingresr_usuario.setForeground(new java.awt.Color(204, 204, 204));
        Ingresr_usuario.setText("Ingresar su nombre de usuario");
        Ingresr_usuario.setBorder(null);
        Ingresr_usuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Ingresr_usuarioMousePressed(evt);
            }
        });
        Background.add(Ingresr_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 390, 30));
        Background.add(Separator_Usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 390, 30));

        labelpass.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        labelpass.setForeground(new java.awt.Color(0, 0, 0));
        labelpass.setText("Constraseña");
        Background.add(labelpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, -1, -1));
        Background.add(Separator_pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 390, 30));

        passField_pass.setBackground(new java.awt.Color(255, 255, 255));
        passField_pass.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        passField_pass.setForeground(new java.awt.Color(204, 204, 204));
        passField_pass.setText("********");
        passField_pass.setBorder(null);
        passField_pass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                passField_passMousePressed(evt);
            }
        });
        Background.add(passField_pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 390, 30));

        Panel_btnEnter.setBackground(new java.awt.Color(255, 231, 179));

        label_Entrar.setBackground(new java.awt.Color(255, 255, 255));
        label_Entrar.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        label_Entrar.setForeground(new java.awt.Color(51, 51, 51));
        label_Entrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_Entrar.setText("ENTRAR");
        label_Entrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        label_Entrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label_EntrarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                label_EntrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                label_EntrarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                label_EntrarMousePressed(evt);
            }
        });

        javax.swing.GroupLayout Panel_btnEnterLayout = new javax.swing.GroupLayout(Panel_btnEnter);
        Panel_btnEnter.setLayout(Panel_btnEnterLayout);
        Panel_btnEnterLayout.setHorizontalGroup(
            Panel_btnEnterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_btnEnterLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(label_Entrar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        Panel_btnEnterLayout.setVerticalGroup(
            Panel_btnEnterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_btnEnterLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(label_Entrar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        Background.add(Panel_btnEnter, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 400, 130, 30));

        Label_ForgetPass.setForeground(new java.awt.Color(102, 102, 102));
        Label_ForgetPass.setText("¿Olvido la contraseña?");
        Label_ForgetPass.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Label_ForgetPass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Label_ForgetPassMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Label_ForgetPassMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Label_ForgetPassMouseExited(evt);
            }
        });
        Background.add(Label_ForgetPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 360, -1, -1));

        Label_Register.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Label_Register.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icon_user2.png"))); // NOI18N
        Label_Register.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Label_Register.setMinimumSize(new java.awt.Dimension(30, 30));
        Label_Register.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Label_RegisterMouseClicked(evt);
            }
        });
        Background.add(Label_Register, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 470, 40, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel_BarraMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel_BarraMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_jPanel_BarraMousePressed

    private void jPanel_BarraMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel_BarraMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_jPanel_BarraMouseDragged

    private void label_XcloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_XcloseMouseClicked
        System.exit(0);
       
    }//GEN-LAST:event_label_XcloseMouseClicked

    private void label_XcloseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_XcloseMouseEntered
        Btn_close.setBackground(Color.red);
        label_Xclose.setForeground(Color.white);
    }//GEN-LAST:event_label_XcloseMouseEntered

    private void label_XcloseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_XcloseMouseExited
        Btn_close.setBackground(Color.white);
        label_Xclose.setForeground(Color.black);
    }//GEN-LAST:event_label_XcloseMouseExited

    private void label_EntrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_EntrarMouseEntered
        Panel_btnEnter.setBackground(new Color(255,236,196));
    }//GEN-LAST:event_label_EntrarMouseEntered

    private void label_EntrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_EntrarMouseExited
      Panel_btnEnter.setBackground(new Color(255,231,179));
    }//GEN-LAST:event_label_EntrarMouseExited

    private void Ingresr_usuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Ingresr_usuarioMousePressed
       if (Ingresr_usuario.getText().equals("Ingresar su nombre de usuario")){
             Ingresr_usuario.setText("");
             Ingresr_usuario.setForeground(Color.black);
       }
       if(String.valueOf(passField_pass.getPassword()).isEmpty()){
             passField_pass.setText("********");
             passField_pass.setForeground(Color.gray);
       }
    }//GEN-LAST:event_Ingresr_usuarioMousePressed

    private void passField_passMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passField_passMousePressed
        if(String.valueOf(passField_pass.getPassword()).equals("********")){
                passField_pass.setText("");
                passField_pass.setForeground(Color.black);
        }
        if (Ingresr_usuario.getText().isEmpty()){
                Ingresr_usuario.setText("Ingresar su nombre de usuario");
                Ingresr_usuario.setForeground(Color.gray);
        }
    
    }//GEN-LAST:event_passField_passMousePressed

    private void label_EntrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_EntrarMouseClicked
       javax.swing.JOptionPane.showMessageDialog(this, "Bienvenido: \nUsuario: " + Ingresr_usuario.getText() + " \nContraseña: " + String.valueOf(passField_pass.getPassword()), "Login", javax.swing.JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_label_EntrarMouseClicked

    private void Label_ForgetPassMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Label_ForgetPassMouseEntered
        Label_ForgetPass.setForeground(new Color(255,188,88));
    }//GEN-LAST:event_Label_ForgetPassMouseEntered

    private void Label_ForgetPassMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Label_ForgetPassMouseExited
        Label_ForgetPass.setForeground(new Color(102,102,102));
    }//GEN-LAST:event_Label_ForgetPassMouseExited

    private void Label_ForgetPassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Label_ForgetPassMouseClicked
        ForgetPass fg = new ForgetPass();
        fg.setVisible(true);
        fg.pack();
        fg.setLocationRelativeTo(null);
        fg.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
        
    }//GEN-LAST:event_Label_ForgetPassMouseClicked

    private void Label_RegisterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Label_RegisterMouseClicked
       RegisterForm rgf = new RegisterForm();
        rgf.setVisible(true);
        rgf.pack();
        rgf.setLocationRelativeTo(null);
        rgf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_Label_RegisterMouseClicked

    private void label_EntrarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_EntrarMousePressed
        String user = "";
        String pass = "";
         user = Ingresr_usuario.getText();
         pass = String.valueOf(passField_pass.getPassword());
        if (user.equals("Ingresar su nombre de usuario") && pass.equals("********")) {
            JOptionPane.showMessageDialog(this, "Uno o mas campos estan vacios. Favor de llenarlos.");
        }else{
            try{
                   
            String query = "SELECT * FROM admin WHERE usuario ='" + user + "' and contraseña='" + pass + "'";
            Statement st = conn.getConnection().createStatement();
            ResultSet rs = st.executeQuery(query);
            
                if (rs.next()) {
                    JOptionPane.showMessageDialog(this, "Bienvenido");
                }else{
                    JOptionPane.showMessageDialog(this, "Campos incorrectos");
                }
            
            }catch(SQLException e) {
                System.err.print(e.toString());
                JOptionPane.showMessageDialog(this, "Ocurrio un error inesperado.\nFavor comunicarse con el administrador.");
            }
        }
    
    }//GEN-LAST:event_label_EntrarMousePressed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    private javax.swing.JPanel Btn_close;
    private javax.swing.JLabel Favicon;
    private javax.swing.JLabel Imagen_Der;
    private javax.swing.JTextField Ingresr_usuario;
    private javax.swing.JLabel LabelUUsuairio;
    private javax.swing.JLabel Label_ForgetPass;
    private javax.swing.JLabel Label_Register;
    private javax.swing.JPanel Panel_btnEnter;
    private javax.swing.JSeparator Separator_Usuario;
    private javax.swing.JSeparator Separator_pass;
    private javax.swing.JPanel jPanel_Barra;
    private javax.swing.JLabel labelIniciarsesion;
    private javax.swing.JLabel label_Entrar;
    private javax.swing.JLabel label_Xclose;
    private javax.swing.JLabel labelpass;
    private javax.swing.JPasswordField passField_pass;
    // End of variables declaration//GEN-END:variables
}
