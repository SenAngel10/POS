
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JPanel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Brayan
 */
public class Dashboard extends javax.swing.JFrame {

    
    RegisterVent s1;
    Productos s2;
    Dashboard s0;
    
    
    /**
     * Creates new form Dashboard
     */
    public Dashboard() {
        initComponents();
      
    }
    
     
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Contenedor = new javax.swing.JPanel();
        panel_dash = new javax.swing.JPanel();
        pBtn_RV = new javax.swing.JPanel();
        label_RV = new javax.swing.JLabel();
        pBtn_Productos = new javax.swing.JPanel();
        label_Productos = new javax.swing.JLabel();
        pBtn_Search = new javax.swing.JPanel();
        label_Search = new javax.swing.JLabel();
        pBtn_Inventario = new javax.swing.JPanel();
        labell_Invetarios = new javax.swing.JLabel();
        pBtn_ReportV = new javax.swing.JPanel();
        label_ReportV = new javax.swing.JLabel();
        pBtn_ReportC = new javax.swing.JPanel();
        label_ReportC = new javax.swing.JLabel();
        pBtn_Reports = new javax.swing.JPanel();
        label_Reports = new javax.swing.JLabel();
        separetor_RC = new javax.swing.JSeparator();
        separetor_RV = new javax.swing.JSeparator();
        separetor_P = new javax.swing.JSeparator();
        separetor_BP = new javax.swing.JSeparator();
        separetor_I = new javax.swing.JSeparator();
        separetor_R = new javax.swing.JSeparator();
        separetor_ReportV = new javax.swing.JSeparator();
        panel_top = new javax.swing.JPanel();
        label_inicio = new javax.swing.JLabel();
        Btn_close = new javax.swing.JPanel();
        label_Xclose = new javax.swing.JLabel();
        contenido = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setUndecorated(true);
        setResizable(false);

        Contenedor.setBackground(new java.awt.Color(102, 102, 102));
        Contenedor.setForeground(new java.awt.Color(102, 102, 102));
        Contenedor.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel_dash.setBackground(new java.awt.Color(255, 255, 255));
        panel_dash.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pBtn_RV.setBackground(new java.awt.Color(255, 255, 255));

        label_RV.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        label_RV.setForeground(new java.awt.Color(0, 0, 0));
        label_RV.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_RV.setText("Registro de ventas");
        label_RV.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        label_RV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label_RVMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                label_RVMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                label_RVMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pBtn_RVLayout = new javax.swing.GroupLayout(pBtn_RV);
        pBtn_RV.setLayout(pBtn_RVLayout);
        pBtn_RVLayout.setHorizontalGroup(
            pBtn_RVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pBtn_RVLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(label_RV, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pBtn_RVLayout.setVerticalGroup(
            pBtn_RVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pBtn_RVLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(label_RV, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panel_dash.add(pBtn_RV, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 180, 40));

        pBtn_Productos.setBackground(new java.awt.Color(255, 255, 255));

        label_Productos.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        label_Productos.setForeground(new java.awt.Color(0, 0, 0));
        label_Productos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_Productos.setText("Productos");
        label_Productos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        label_Productos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label_ProductosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                label_ProductosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                label_ProductosMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pBtn_ProductosLayout = new javax.swing.GroupLayout(pBtn_Productos);
        pBtn_Productos.setLayout(pBtn_ProductosLayout);
        pBtn_ProductosLayout.setHorizontalGroup(
            pBtn_ProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pBtn_ProductosLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(label_Productos, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pBtn_ProductosLayout.setVerticalGroup(
            pBtn_ProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pBtn_ProductosLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(label_Productos, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panel_dash.add(pBtn_Productos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, -1, -1));

        pBtn_Search.setBackground(new java.awt.Color(255, 255, 255));

        label_Search.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        label_Search.setForeground(new java.awt.Color(0, 0, 0));
        label_Search.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_Search.setText("Busqueda de productos");
        label_Search.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        label_Search.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label_SearchMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                label_SearchMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                label_SearchMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pBtn_SearchLayout = new javax.swing.GroupLayout(pBtn_Search);
        pBtn_Search.setLayout(pBtn_SearchLayout);
        pBtn_SearchLayout.setHorizontalGroup(
            pBtn_SearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_Search, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
        );
        pBtn_SearchLayout.setVerticalGroup(
            pBtn_SearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_Search, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        panel_dash.add(pBtn_Search, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, -1, -1));

        pBtn_Inventario.setBackground(new java.awt.Color(255, 255, 255));

        labell_Invetarios.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        labell_Invetarios.setForeground(new java.awt.Color(0, 0, 0));
        labell_Invetarios.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labell_Invetarios.setText("Inventarios");
        labell_Invetarios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labell_Invetarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labell_InvetariosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labell_InvetariosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labell_InvetariosMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pBtn_InventarioLayout = new javax.swing.GroupLayout(pBtn_Inventario);
        pBtn_Inventario.setLayout(pBtn_InventarioLayout);
        pBtn_InventarioLayout.setHorizontalGroup(
            pBtn_InventarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 180, Short.MAX_VALUE)
            .addGroup(pBtn_InventarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(labell_Invetarios, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE))
        );
        pBtn_InventarioLayout.setVerticalGroup(
            pBtn_InventarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
            .addGroup(pBtn_InventarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(labell_Invetarios, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
        );

        panel_dash.add(pBtn_Inventario, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 180, 40));

        pBtn_ReportV.setBackground(new java.awt.Color(255, 255, 255));

        label_ReportV.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        label_ReportV.setForeground(new java.awt.Color(0, 0, 0));
        label_ReportV.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_ReportV.setText("Reporte de ventas");
        label_ReportV.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        label_ReportV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label_ReportVMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                label_ReportVMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                label_ReportVMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pBtn_ReportVLayout = new javax.swing.GroupLayout(pBtn_ReportV);
        pBtn_ReportV.setLayout(pBtn_ReportVLayout);
        pBtn_ReportVLayout.setHorizontalGroup(
            pBtn_ReportVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 180, Short.MAX_VALUE)
            .addGroup(pBtn_ReportVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(label_ReportV, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE))
        );
        pBtn_ReportVLayout.setVerticalGroup(
            pBtn_ReportVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
            .addGroup(pBtn_ReportVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(label_ReportV, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
        );

        panel_dash.add(pBtn_ReportV, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, 180, 40));

        pBtn_ReportC.setBackground(new java.awt.Color(255, 255, 255));

        label_ReportC.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        label_ReportC.setForeground(new java.awt.Color(0, 0, 0));
        label_ReportC.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_ReportC.setText("Reporte de compras");
        label_ReportC.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        label_ReportC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label_ReportCMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                label_ReportCMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                label_ReportCMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pBtn_ReportCLayout = new javax.swing.GroupLayout(pBtn_ReportC);
        pBtn_ReportC.setLayout(pBtn_ReportCLayout);
        pBtn_ReportCLayout.setHorizontalGroup(
            pBtn_ReportCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 180, Short.MAX_VALUE)
            .addGroup(pBtn_ReportCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(label_ReportC, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE))
        );
        pBtn_ReportCLayout.setVerticalGroup(
            pBtn_ReportCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
            .addGroup(pBtn_ReportCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(label_ReportC, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
        );

        panel_dash.add(pBtn_ReportC, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, 180, 40));

        pBtn_Reports.setBackground(new java.awt.Color(255, 255, 255));

        label_Reports.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        label_Reports.setForeground(new java.awt.Color(0, 0, 0));
        label_Reports.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_Reports.setText("Reportes");
        label_Reports.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        label_Reports.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label_ReportsMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                label_ReportsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                label_ReportsMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pBtn_ReportsLayout = new javax.swing.GroupLayout(pBtn_Reports);
        pBtn_Reports.setLayout(pBtn_ReportsLayout);
        pBtn_ReportsLayout.setHorizontalGroup(
            pBtn_ReportsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pBtn_ReportsLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(label_Reports, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pBtn_ReportsLayout.setVerticalGroup(
            pBtn_ReportsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pBtn_ReportsLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(label_Reports, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panel_dash.add(pBtn_Reports, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 450, 180, 40));

        separetor_RC.setBackground(new java.awt.Color(121, 121, 125));
        panel_dash.add(separetor_RC, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 420, 180, 10));

        separetor_RV.setBackground(new java.awt.Color(121, 121, 125));
        panel_dash.add(separetor_RV, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 180, 10));

        separetor_P.setBackground(new java.awt.Color(121, 121, 125));
        panel_dash.add(separetor_P, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 180, 10));

        separetor_BP.setBackground(new java.awt.Color(121, 121, 125));
        panel_dash.add(separetor_BP, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 180, 10));

        separetor_I.setBackground(new java.awt.Color(121, 121, 125));
        panel_dash.add(separetor_I, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 180, 10));

        separetor_R.setBackground(new java.awt.Color(121, 121, 125));
        panel_dash.add(separetor_R, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 490, 180, 10));

        separetor_ReportV.setBackground(new java.awt.Color(121, 121, 125));
        panel_dash.add(separetor_ReportV, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, 180, 10));

        Contenedor.add(panel_dash, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 180, 530));

        panel_top.setBackground(new java.awt.Color(255, 195, 147));
        panel_top.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label_inicio.setBackground(new java.awt.Color(204, 204, 255));
        label_inicio.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        label_inicio.setForeground(new java.awt.Color(255, 255, 255));
        label_inicio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_inicio.setText("Inicio");
        label_inicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label_inicioMouseClicked(evt);
            }
        });
        panel_top.add(label_inicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 180, 30));

        Btn_close.setBackground(new java.awt.Color(255, 255, 255));

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
            .addComponent(label_Xclose, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );
        Btn_closeLayout.setVerticalGroup(
            Btn_closeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_Xclose, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        panel_top.add(Btn_close, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 0, 40, 30));

        Contenedor.add(panel_top, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1050, 30));

        contenido.setBackground(new java.awt.Color(244, 244, 244));

        javax.swing.GroupLayout contenidoLayout = new javax.swing.GroupLayout(contenido);
        contenido.setLayout(contenidoLayout);
        contenidoLayout.setHorizontalGroup(
            contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 870, Short.MAX_VALUE)
        );
        contenidoLayout.setVerticalGroup(
            contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 530, Short.MAX_VALUE)
        );

        Contenedor.add(contenido, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, 870, 530));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Contenedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Contenedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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

    private void label_RVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_RVMouseClicked
        s1 = new RegisterVent();
        ShowPanel(s1.getFondo());
    }//GEN-LAST:event_label_RVMouseClicked

    private void label_ProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_ProductosMouseClicked
        s2 = new Productos();
        ShowPanel(s2.getFondo());
    }//GEN-LAST:event_label_ProductosMouseClicked

    private void label_inicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_inicioMouseClicked
        s0 = new Dashboard();
        ShowPanel(s0.getFondo());
    }//GEN-LAST:event_label_inicioMouseClicked

    private void label_SearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_SearchMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_label_SearchMouseClicked

    private void labell_InvetariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labell_InvetariosMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_labell_InvetariosMouseClicked

    private void label_ReportVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_ReportVMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_label_ReportVMouseClicked

    private void label_ReportCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_ReportCMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_label_ReportCMouseClicked

    private void label_ReportsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_ReportsMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_label_ReportsMouseClicked
    
    //darle el hover a los botones de cada seccion
    private void label_RVMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_RVMouseEntered
        pBtn_RV.setBackground(new Color(255,231,179));
    }//GEN-LAST:event_label_RVMouseEntered

    private void label_RVMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_RVMouseExited
        pBtn_RV.setBackground(new Color(255,255,255));
       
    }//GEN-LAST:event_label_RVMouseExited

    private void label_ProductosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_ProductosMouseEntered
        pBtn_Productos.setBackground(new Color(255,231,179));
    }//GEN-LAST:event_label_ProductosMouseEntered

    private void label_ProductosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_ProductosMouseExited
        pBtn_Productos.setBackground(new Color(255,255,255));
    }//GEN-LAST:event_label_ProductosMouseExited

    private void label_SearchMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_SearchMouseEntered
        pBtn_Search.setBackground(new Color(255,231,179));
    }//GEN-LAST:event_label_SearchMouseEntered

    private void label_SearchMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_SearchMouseExited
        pBtn_Search.setBackground(new Color(255,255,255));
    }//GEN-LAST:event_label_SearchMouseExited

    private void labell_InvetariosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labell_InvetariosMouseEntered
        pBtn_Inventario.setBackground(new Color(255,231,179));
    }//GEN-LAST:event_labell_InvetariosMouseEntered

    private void labell_InvetariosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labell_InvetariosMouseExited
        pBtn_Inventario.setBackground(new Color(255,255,255));
    }//GEN-LAST:event_labell_InvetariosMouseExited

    private void label_ReportVMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_ReportVMouseEntered
        pBtn_ReportV.setBackground(new Color(255,231,179));
    }//GEN-LAST:event_label_ReportVMouseEntered

    private void label_ReportVMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_ReportVMouseExited
        pBtn_ReportV.setBackground(new Color(255,255,255));
    }//GEN-LAST:event_label_ReportVMouseExited

    private void label_ReportCMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_ReportCMouseEntered
        pBtn_ReportC.setBackground(new Color(255,231,179));
    }//GEN-LAST:event_label_ReportCMouseEntered

    private void label_ReportCMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_ReportCMouseExited
         pBtn_ReportC.setBackground(new Color(255,255,255));
    }//GEN-LAST:event_label_ReportCMouseExited

    private void label_ReportsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_ReportsMouseEntered
        pBtn_Reports.setBackground(new Color(255,231,179));
    }//GEN-LAST:event_label_ReportsMouseEntered

    private void label_ReportsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_ReportsMouseExited
        pBtn_Reports.setBackground(new Color(255,255,255));
    }//GEN-LAST:event_label_ReportsMouseExited

      public JPanel getFondo(){
        return contenido;
    }
    private void ShowPanel(JPanel a){
        a.setSize(870, 530);
        a.setLocation(0, 0);
        contenido.removeAll();
        contenido.add(a, BorderLayout.CENTER);
        contenido.revalidate();
        contenido.repaint();
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
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Btn_close;
    private javax.swing.JPanel Contenedor;
    private javax.swing.JPanel contenido;
    private javax.swing.JLabel label_Productos;
    private javax.swing.JLabel label_RV;
    private javax.swing.JLabel label_ReportC;
    private javax.swing.JLabel label_ReportV;
    private javax.swing.JLabel label_Reports;
    private javax.swing.JLabel label_Search;
    private javax.swing.JLabel label_Xclose;
    private javax.swing.JLabel label_inicio;
    private javax.swing.JLabel labell_Invetarios;
    private javax.swing.JPanel pBtn_Inventario;
    private javax.swing.JPanel pBtn_Productos;
    private javax.swing.JPanel pBtn_RV;
    private javax.swing.JPanel pBtn_ReportC;
    private javax.swing.JPanel pBtn_ReportV;
    private javax.swing.JPanel pBtn_Reports;
    private javax.swing.JPanel pBtn_Search;
    private javax.swing.JPanel panel_dash;
    private javax.swing.JPanel panel_top;
    private javax.swing.JSeparator separetor_BP;
    private javax.swing.JSeparator separetor_I;
    private javax.swing.JSeparator separetor_P;
    private javax.swing.JSeparator separetor_R;
    private javax.swing.JSeparator separetor_RC;
    private javax.swing.JSeparator separetor_RV;
    private javax.swing.JSeparator separetor_ReportV;
    // End of variables declaration//GEN-END:variables
}
