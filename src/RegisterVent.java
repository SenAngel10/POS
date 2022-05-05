
import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Brayan
 */
public class RegisterVent extends javax.swing.JFrame {

    private int image;
    private String titulo;
    private byte[] imagen;
    private TableRowSorter filtro;
     Conexion conn;
         Connection reg;
         PreparedStatement ps;
         ResultSet rs;
         DefaultTableModel model, model2;
         Statement st;
         
         double total;
         double sub_total;
         double importe;
    
    public RegisterVent() {
        initComponents();
          model = new DefaultTableModel();
          model2 = new DefaultTableModel();
         conn = new Conexion();
         reg = conn.getConnection();
         total = 0;
         sub_total = 0.0;
         importe = 0.0;
        
    }

     public JPanel getFondo(){
        return ContenidoR;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ContenidoR = new javax.swing.JPanel();
        label_Cantidad = new javax.swing.JLabel();
        Panel_ContainerBTn = new javax.swing.JPanel();
        panel_Cantidad = new javax.swing.JPanel();
        textfield_cantidadFinal = new javax.swing.JTextField();
        Panel_acciones = new javax.swing.JPanel();
        label_serie = new javax.swing.JLabel();
        Textfield_serie = new javax.swing.JTextField();
        label_NumVenta = new javax.swing.JLabel();
        Textfield_NumVenta = new javax.swing.JTextField();
        label_Monto = new javax.swing.JLabel();
        Textfield__Monto = new javax.swing.JTextField();
        label_confirmarPago = new javax.swing.JLabel();
        Button_confirmar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        label_Montorecibido = new javax.swing.JLabel();
        label_Total = new javax.swing.JLabel();
        Label_Cambio = new javax.swing.JLabel();
        label_contMonto = new javax.swing.JLabel();
        label_contTotal = new javax.swing.JLabel();
        label_contCambio = new javax.swing.JLabel();
        button_calcular = new javax.swing.JButton();
        Textfield_busqueda = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_productosAdd = new javax.swing.JTable();
        button_eliminar = new javax.swing.JButton();
        button_clean = new javax.swing.JButton();
        label_Producto = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        table_search = new javax.swing.JTable();
        button_agregar = new javax.swing.JButton();
        Textfield_cont = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(870, 530));

        ContenidoR.setBackground(new java.awt.Color(255, 255, 255));
        ContenidoR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ContenidoRMouseClicked(evt);
            }
        });
        ContenidoR.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label_Cantidad.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        label_Cantidad.setForeground(new java.awt.Color(0, 0, 0));
        label_Cantidad.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_Cantidad.setText("Cantidad");
        ContenidoR.add(label_Cantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 20, 90, 20));

        Panel_ContainerBTn.setBackground(new java.awt.Color(18, 30, 49));
        Panel_ContainerBTn.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel_Cantidad.setBackground(new java.awt.Color(153, 153, 255));

        textfield_cantidadFinal.setBackground(new java.awt.Color(102, 102, 255));
        textfield_cantidadFinal.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        textfield_cantidadFinal.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout panel_CantidadLayout = new javax.swing.GroupLayout(panel_Cantidad);
        panel_Cantidad.setLayout(panel_CantidadLayout);
        panel_CantidadLayout.setHorizontalGroup(
            panel_CantidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(textfield_cantidadFinal, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
        );
        panel_CantidadLayout.setVerticalGroup(
            panel_CantidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(textfield_cantidadFinal, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
        );

        Panel_ContainerBTn.add(panel_Cantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 280, 80));

        Panel_acciones.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label_serie.setText("Serie");
        Panel_acciones.add(label_serie, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        Textfield_serie.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        Textfield_serie.setText("001");
        Panel_acciones.add(Textfield_serie, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 80, -1));

        label_NumVenta.setText("Numero de venta");
        Panel_acciones.add(label_NumVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, -1, -1));

        Textfield_NumVenta.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        Textfield_NumVenta.setText("00001");
        Panel_acciones.add(Textfield_NumVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, 80, -1));

        label_Monto.setText("Monto recibido");
        Panel_acciones.add(label_Monto, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, -1));

        Textfield__Monto.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        Panel_acciones.add(Textfield__Monto, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 80, -1));

        label_confirmarPago.setText("Recibo de pago");
        Panel_acciones.add(label_confirmarPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 290, -1, -1));

        Button_confirmar.setText("Confirmar");
        Panel_acciones.add(Button_confirmar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, -1, -1));
        Panel_acciones.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 230, 10));

        label_Montorecibido.setText("Monto recibido");
        Panel_acciones.add(label_Montorecibido, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, -1, -1));

        label_Total.setText("Total");
        Panel_acciones.add(label_Total, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, -1, -1));

        Label_Cambio.setText("Cambio");
        Panel_acciones.add(Label_Cambio, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, -1, -1));

        label_contMonto.setText("00.00");
        Panel_acciones.add(label_contMonto, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, 80, -1));

        label_contTotal.setText("00.00");
        Panel_acciones.add(label_contTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, 80, -1));

        label_contCambio.setText("00.00");
        Panel_acciones.add(label_contCambio, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 240, 80, -1));

        button_calcular.setText("Calcular");
        button_calcular.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button_calcularMouseClicked(evt);
            }
        });
        Panel_acciones.add(button_calcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 310, -1, -1));

        Panel_ContainerBTn.add(Panel_acciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 280, 370));

        ContenidoR.add(Panel_ContainerBTn, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 30, 280, 450));

        Textfield_busqueda.setForeground(new java.awt.Color(204, 204, 204));
        Textfield_busqueda.setText("Busqueda de productos");
        Textfield_busqueda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Textfield_busquedaMouseClicked(evt);
            }
        });
        Textfield_busqueda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Textfield_busquedaKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Textfield_busquedaKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Textfield_busquedaKeyTyped(evt);
            }
        });
        ContenidoR.add(Textfield_busqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 190, 20));

        table_productosAdd.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre del Producto", "Precio", "Cantidad", "Importe"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(table_productosAdd);

        ContenidoR.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 570, 150));

        button_eliminar.setText("Eliminar");
        ContenidoR.add(button_eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 420, -1, -1));

        button_clean.setText("Limpiar");
        button_clean.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button_cleanMouseClicked(evt);
            }
        });
        ContenidoR.add(button_clean, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 20, -1, -1));

        label_Producto.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        label_Producto.setForeground(new java.awt.Color(0, 0, 0));
        label_Producto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_Producto.setText("Producto");
        ContenidoR.add(label_Producto, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 90, 20));

        table_search.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre del producto", "Precio", "stock"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(table_search);

        ContenidoR.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, 440, 90));

        button_agregar.setText("Agregar");
        button_agregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button_agregarMouseClicked(evt);
            }
        });
        ContenidoR.add(button_agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 180, -1, -1));
        ContenidoR.add(Textfield_cont, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 20, 60, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ContenidoR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ContenidoR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Textfield_busquedaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Textfield_busquedaMouseClicked
        if(Textfield_busqueda.getText().equals("Busqueda de productos")){
            Textfield_busqueda.setText("");
            Textfield_busqueda.setForeground(Color.black);
        }
        
    }//GEN-LAST:event_Textfield_busquedaMouseClicked

    private void ContenidoRMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ContenidoRMouseClicked
        if(Textfield_busqueda.getText().equals("")){
            Textfield_busqueda.setText("Busqueda de productos");
            Textfield_busqueda.setForeground(Color.gray);
        }
    }//GEN-LAST:event_ContenidoRMouseClicked
    private void GetProducts(String valor) throws SQLException{
      
        Object[] row = new Object[3];
   
        if(valor != null || Textfield_busqueda.getText().trim().length() != 0 || Textfield_busqueda.getText() != null){
        try{
            
                st = reg.createStatement();
                rs = st.executeQuery("SELECT * FROM `productos` WHERE nombre LIKE '"+valor+"%'");
                model = (DefaultTableModel) table_search.getModel();
                System.out.println(valor);
                
            while(rs.next()){
                 row[0] = rs.getObject("nombre");
                 row[1] = rs.getObject("precio");
                 row[2] = rs.getObject("existencia");
                 model.addRow(row);
            }
            table_search.setModel(model);
            rs.close();
            st.close();
                
               
         
        }catch (SQLException ex) {
            Logger.getLogger(RegisterVent.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
             
     }
    
    private void GetProducts() throws SQLException{
       try{
         st = reg.createStatement();
         rs = st.executeQuery("SELECT * FROM `productos`");

        }catch (SQLException ex) {
            Logger.getLogger(RegisterVent.class.getName()).log(Level.SEVERE, null, ex);
        }
       
             
     }
    
    private void Textfield_busquedaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Textfield_busquedaKeyTyped
                   
    }//GEN-LAST:event_Textfield_busquedaKeyTyped

    private void Textfield_busquedaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Textfield_busquedaKeyReleased
       if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            String cadena = Textfield_busqueda.getText();
        System.out.println(cadena);
     
       if(Textfield_busqueda.getText().trim().length() != 0){
        try {
            
            GetProducts(cadena);
          
            
            } catch (SQLException ex) {
            Logger.getLogger(RegisterVent.class.getName()).log(Level.SEVERE, null, ex);
                }
        }
       }
    }//GEN-LAST:event_Textfield_busquedaKeyReleased

    private void Textfield_busquedaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Textfield_busquedaKeyPressed
    
    }//GEN-LAST:event_Textfield_busquedaKeyPressed

    private void button_cleanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_cleanMouseClicked
      
        // eliminacion de la tabla con el boton clean para limpiar los datos obtenidos por medio de la busqueda
        model.getDataVector().removeAllElements();
       table_search.updateUI();  
    }//GEN-LAST:event_button_cleanMouseClicked

    private void button_agregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_agregarMouseClicked
        //agregarcion de un producto
        Object[] row = new Object[4];
        
        int select = table_search.getSelectedRow();
        try{
             if(select>=0){
                 
                 String valor = "";
                 valor = table_search.getValueAt(select, 0).toString();
                 
                st = reg.createStatement();
                rs = st.executeQuery("SELECT * FROM `productos` WHERE nombre LIKE '"+valor+"%'");
                model2 = (DefaultTableModel) table_productosAdd.getModel();
           
                 while(rs.next()){
                 row[0] = rs.getObject("nombre");
                 row[1] = rs.getObject("precio");
                 
                 String cant = Textfield_cont.getText();
                 String precio = table_search.getValueAt(select, 1).toString();
                 //realizando los calculos
                 
                 double x = (Integer.parseInt(precio) * Integer.parseInt(cant)); 
                 
                 
                 //se añade
                 
                 System.out.println(cant);
                 System.out.println(x);

                 row[2] = cant;
                 row[3] = x;                 
                 model2.addRow(row);
             
                 Double calcula = x;
                 
                 total = total + calcula;
                textfield_cantidadFinal.setText(String.valueOf(total));
            }
                                  
            table_productosAdd.setModel(model2);
                              
            rs.close();
            st.close();
            Textfield_cont.setText("");
                 
                 JOptionPane.showMessageDialog(null, "agregada");
               
            }else{
                 JOptionPane.showMessageDialog(null, "Seleccione una fila porfavor");
             }
             }catch(SQLException ex) {
            Logger.getLogger(RegisterVent.class.getName()).log(Level.SEVERE, null, ex);
                }
        
    }//GEN-LAST:event_button_agregarMouseClicked

    private void button_calcularMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_calcularMouseClicked
        
            
                double aux = Double.valueOf(Textfield__Monto.getText());
                 
                double cambio = aux - Double.valueOf(textfield_cantidadFinal.getText());
                 
               
                 if(cambio != 0){
                 label_contMonto.setText(Textfield__Monto.getText());
                 label_contTotal.setText(textfield_cantidadFinal.getText());
                 label_contCambio.setText(String.valueOf(cambio));
               
                 }else if(Textfield__Monto.getText().equals("")){
                    JOptionPane.showMessageDialog(null, "cambio por favor"); 
                 }
    }//GEN-LAST:event_button_calcularMouseClicked

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
            java.util.logging.Logger.getLogger(RegisterVent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegisterVent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegisterVent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegisterVent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisterVent().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Button_confirmar;
    private javax.swing.JPanel ContenidoR;
    private javax.swing.JLabel Label_Cambio;
    private javax.swing.JPanel Panel_ContainerBTn;
    private javax.swing.JPanel Panel_acciones;
    private javax.swing.JTextField Textfield_NumVenta;
    private javax.swing.JTextField Textfield__Monto;
    private javax.swing.JTextField Textfield_busqueda;
    private javax.swing.JTextField Textfield_cont;
    private javax.swing.JTextField Textfield_serie;
    private javax.swing.JButton button_agregar;
    private javax.swing.JButton button_calcular;
    private javax.swing.JButton button_clean;
    private javax.swing.JButton button_eliminar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel label_Cantidad;
    private javax.swing.JLabel label_Monto;
    private javax.swing.JLabel label_Montorecibido;
    private javax.swing.JLabel label_NumVenta;
    private javax.swing.JLabel label_Producto;
    private javax.swing.JLabel label_Total;
    private javax.swing.JLabel label_confirmarPago;
    private javax.swing.JLabel label_contCambio;
    private javax.swing.JLabel label_contMonto;
    private javax.swing.JLabel label_contTotal;
    private javax.swing.JLabel label_serie;
    private javax.swing.JPanel panel_Cantidad;
    private javax.swing.JTable table_productosAdd;
    private javax.swing.JTable table_search;
    private javax.swing.JTextField textfield_cantidadFinal;
    // End of variables declaration//GEN-END:variables
}
