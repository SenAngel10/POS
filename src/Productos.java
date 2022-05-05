
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;


public class Productos extends javax.swing.JFrame {

         Conexion conn;
         Connection reg;
         PreparedStatement ps;
         ResultSet rs;
         DefaultTableModel model;
    public Productos() {
        initComponents();
        model = new DefaultTableModel();
         conn = new Conexion();
         reg = conn.getConnection();
          try {
               //llamdo de los datos de Una BD a la Jtable
            GetProducts();
              ;
        } catch (SQLException ex) {
            Logger.getLogger(Productos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
   
    
     public JPanel getFondo(){
        return ContenidoP;
    }
   
     private void limpiarCajas(){
        textfield_id.setText(null);
        textfield_NamePro.setText(null);
        textfield_marca.setText(null);
        textfield_precio.setText(null);
        textfield_descrip.setText(null);
        textfield_descuento.setText(null);
        textfield_existencia.setText(null);
        textfield_date.setText(null);
        
         
     }
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ContenidoP = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_prodcuts = new javax.swing.JTable();
        label_id = new javax.swing.JLabel();
        textfield_id = new javax.swing.JTextField();
        label_NamePro = new javax.swing.JLabel();
        textfield_NamePro = new javax.swing.JTextField();
        label_marca = new javax.swing.JLabel();
        textfield_marca = new javax.swing.JTextField();
        label_precio = new javax.swing.JLabel();
        textfield_precio = new javax.swing.JTextField();
        label_descripcion = new javax.swing.JLabel();
        textfield_descrip = new javax.swing.JTextField();
        label_descuento = new javax.swing.JLabel();
        textfield_descuento = new javax.swing.JTextField();
        label_stock = new javax.swing.JLabel();
        textfield_existencia = new javax.swing.JTextField();
        label_date = new javax.swing.JLabel();
        textfield_date = new javax.swing.JTextField();
        button_agregar = new javax.swing.JButton();
        button_delete = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ContenidoP.setBackground(new java.awt.Color(255, 255, 255));
        ContenidoP.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Productos");
        ContenidoP.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 10, 290, 40));

        table_prodcuts.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre del producto", "marca", "precio", "descripcion", "Precio descuento", "existencia", "FechaCad"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(table_prodcuts);

        ContenidoP.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 70, 590, 340));

        label_id.setForeground(new java.awt.Color(0, 0, 0));
        label_id.setText("ID");
        ContenidoP.add(label_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        textfield_id.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textfield_idMouseClicked(evt);
            }
        });
        ContenidoP.add(textfield_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, 140, -1));

        label_NamePro.setForeground(new java.awt.Color(0, 0, 0));
        label_NamePro.setText("Nombre del proucto");
        ContenidoP.add(label_NamePro, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, -1));
        ContenidoP.add(textfield_NamePro, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, 140, -1));

        label_marca.setForeground(new java.awt.Color(0, 0, 0));
        label_marca.setText("marca");
        ContenidoP.add(label_marca, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, -1, -1));
        ContenidoP.add(textfield_marca, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, 140, -1));

        label_precio.setForeground(new java.awt.Color(0, 0, 0));
        label_precio.setText("precio");
        ContenidoP.add(label_precio, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, -1, -1));
        ContenidoP.add(textfield_precio, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 220, 140, -1));

        label_descripcion.setForeground(new java.awt.Color(0, 0, 0));
        label_descripcion.setText("Descpricion");
        ContenidoP.add(label_descripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, -1, -1));
        ContenidoP.add(textfield_descrip, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 260, 140, -1));

        label_descuento.setForeground(new java.awt.Color(0, 0, 0));
        label_descuento.setText("Precio descuento");
        ContenidoP.add(label_descuento, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, -1, -1));
        ContenidoP.add(textfield_descuento, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 300, 140, -1));

        label_stock.setForeground(new java.awt.Color(0, 0, 0));
        label_stock.setText("existencia");
        ContenidoP.add(label_stock, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, -1, -1));
        ContenidoP.add(textfield_existencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 340, 140, -1));

        label_date.setForeground(new java.awt.Color(0, 0, 0));
        label_date.setText("fecha de caducidad");
        ContenidoP.add(label_date, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, -1, -1));
        ContenidoP.add(textfield_date, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 380, 140, -1));

        button_agregar.setText("Agregar");
        button_agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_agregarActionPerformed(evt);
            }
        });
        ContenidoP.add(button_agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 460, -1, -1));

        button_delete.setText("Eliminar");
        button_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_deleteActionPerformed(evt);
            }
        });
        ContenidoP.add(button_delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 460, -1, -1));

        jButton1.setText("Actualizar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        ContenidoP.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 460, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ContenidoP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ContenidoP, javax.swing.GroupLayout.DEFAULT_SIZE, 530, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void button_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_agregarActionPerformed
              
        if(textfield_id.getText().equals("") || textfield_NamePro.equals("") || textfield_marca.getText().equals("") || textfield_precio.getText().equals("") || textfield_descrip.getText().equals("") || textfield_descuento.getText().equals("") || textfield_existencia.getText().equals("") || textfield_date.getText().equals("")){
            javax.swing.JOptionPane.showMessageDialog(this, "Debe llenar todos los campos \n", "AVISO", javax.swing.JOptionPane.INFORMATION_MESSAGE);
        }else{
             try{
               ps = reg.prepareStatement("INSERT INTO `productos` (`id_product`, `nombre`, `marca`, `precio`, `descripcion`, `precioDesc`, `existencia`, `fechaC`) VALUES(?,?,?,?,?,?,?,?)");
               ps.setInt(1, Integer.valueOf(textfield_id.getText()));
               ps.setString(2, textfield_NamePro.getText());
               ps.setString(3, textfield_marca.getText());
               ps.setInt(4, Integer.valueOf(textfield_precio.getText()));
               ps.setString(5, textfield_descrip.getText());
               ps.setInt(6, Integer.valueOf(textfield_descuento.getText()));
               ps.setInt(7, Integer.valueOf(textfield_existencia.getText()));
               ps.setString(8, textfield_date.getText());
               
               int res = ps.executeUpdate();
               
      
                
                 Object[] row = new Object[8];
                 
                 row [0] = textfield_id.getText();
                 row [1] = textfield_NamePro.getText();
                 row [2] = textfield_marca.getText();
                 row [3] = textfield_precio.getText();
                 row [4] = textfield_descrip.getText();
                 row [5] = textfield_descuento.getText();
                 row [6] = textfield_existencia.getText();
                 row [7] = textfield_date.getText();
                 
                 model = (DefaultTableModel) table_prodcuts.getModel();
                  
                 model.addRow(row);
                                    
               if(res > 0){
                   JOptionPane.showMessageDialog(null, "producto guardado");
                   limpiarCajas();
               }else{
                   JOptionPane.showMessageDialog(null, "producto no guardado");
                   limpiarCajas();
               }
               
               
               
             }catch(SQLException ex){
                 System.out.println(ex);
                 Logger.getLogger(Productos.class.getName()).log(Level.SEVERE, null, ex);
             }
        }
    }//GEN-LAST:event_button_agregarActionPerformed

    private void button_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_deleteActionPerformed
       int i = table_prodcuts.getSelectedRow();
        int res;
        try{
            if(i>=0){
                ps = reg.prepareStatement("DELETE FROM `productos` WHERE `id_product` = ?");
                ps.setObject(1, table_prodcuts.getValueAt(i, 0));
                res = ps.executeUpdate();
                
                JOptionPane.showMessageDialog(null, "Producto eliminado");        
                model.removeRow(i);
                GetProducts();
                }else{
                  JOptionPane.showMessageDialog(null, "Seleccione una fila porfavor");
            }
          
            }catch(SQLException ex){
               System.out.println(ex);
               
               Logger.getLogger(Productos.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }//GEN-LAST:event_button_deleteActionPerformed

    private void textfield_idMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textfield_idMouseClicked
    
    }//GEN-LAST:event_textfield_idMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       try {
               //llamdo de los datos de Una BD a la Jtable
            GetProducts();
              ;
        } catch (SQLException ex) {
            Logger.getLogger(Productos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    
    
     private void GetProducts() throws SQLException{
       Statement stm = reg.createStatement();
        ResultSet counter = stm.executeQuery("SELECT * FROM `productos`");
        
        int count = 0;
        while(counter.next()){count++;}
        
        String list[][] = new String[count][8];
        int i = 0;
        ResultSet re = stm.executeQuery("SELECT * FROM `productos`");
        while(re.next()){
            list[i][0] = re.getString("id_product");
            list[i][1] = re.getString("nombre");
            list[i][2] = re.getString("marca");
            list[i][3] = re.getString("precio");
            list[i][4] = re.getString("descripcion");
            list[i][5] = re.getString("precioDesc");
            list[i][6] = re.getString("existencia");
            list[i][7] = re.getString("fechaC");
           
            i++;
        }
        
        table_prodcuts.setModel(new javax.swing.table.DefaultTableModel(
        list,
        new String [] {
            "ID", "Nombre del producto", "marca", "precio", "descripcion", "Precio descuento", "existencia", "FechaCad"
        }));
             
     }
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
            java.util.logging.Logger.getLogger(Productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Productos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ContenidoP;
    private javax.swing.JButton button_agregar;
    private javax.swing.JButton button_delete;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel label_NamePro;
    private javax.swing.JLabel label_date;
    private javax.swing.JLabel label_descripcion;
    private javax.swing.JLabel label_descuento;
    private javax.swing.JLabel label_id;
    private javax.swing.JLabel label_marca;
    private javax.swing.JLabel label_precio;
    private javax.swing.JLabel label_stock;
    private javax.swing.JTable table_prodcuts;
    private javax.swing.JTextField textfield_NamePro;
    private javax.swing.JTextField textfield_date;
    private javax.swing.JTextField textfield_descrip;
    private javax.swing.JTextField textfield_descuento;
    private javax.swing.JTextField textfield_existencia;
    private javax.swing.JTextField textfield_id;
    private javax.swing.JTextField textfield_marca;
    private javax.swing.JTextField textfield_precio;
    // End of variables declaration//GEN-END:variables
}
