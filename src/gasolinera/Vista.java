
package gasolinera;


public class Vista extends javax.swing.JFrame {
    
    
    JPanelInicio jpanelinicio;
    JPanelLogin jpanellogin;
    JPanelVenta jpanelventa;
    JPanelAdministrador jpaneladministrador;
    JPanelCarrito jpanelcarrito;

    public Vista() {
        initComponents();
        
        setSize(1200,800);
        setResizable(false);
        setTitle("Ingenieria de Software Gasolinera");
        setLocationRelativeTo(null);
        jpanelinicio = new JPanelInicio();
        jpanelinicio.setBounds(400,0,800,800);
        add(jpanelinicio);
        
        jpanellogin = new JPanelLogin();
        jpanellogin.setBounds(400,0, 800, 800);
        add(jpanellogin);
        jpanellogin.setVisible(false);
        
        jpanelventa = new JPanelVenta();
        jpanelventa.setBounds(400,0,800,800);
        add(jpanelventa);
        jpanelventa.setVisible(false);
        
        jpaneladministrador = new JPanelAdministrador();
        jpaneladministrador.setBounds(400,0,800,800);
        add(jpaneladministrador);
        jpaneladministrador.setVisible(false);
        
        jpanelcarrito = new JPanelCarrito();
        jpanelcarrito.setBounds(400,0,800,800);
        add(jpanelcarrito);
        jpanelcarrito.setVisible(false);
        
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpOpciones = new javax.swing.JPanel();
        jtfTituloVista = new javax.swing.JLabel();
        jbLoginVista = new javax.swing.JButton();
        jbVentasVista = new javax.swing.JButton();
        jbInicioVista = new javax.swing.JButton();
        jbCarritoVista = new javax.swing.JButton();
        jbVistaImagen = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jpOpciones.setBackground(new java.awt.Color(153, 153, 153));

        jtfTituloVista.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jtfTituloVista.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jtfTituloVista.setText("PANEL DE OPCIONES");
        jtfTituloVista.setAlignmentY(0.0F);

        jbLoginVista.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jbLoginVista.setText("LOGIN");
        jbLoginVista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLoginVistaActionPerformed(evt);
            }
        });

        jbVentasVista.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jbVentasVista.setText("VENTAS PRODUCTO");
        jbVentasVista.setOpaque(false);
        jbVentasVista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbVentasVistaActionPerformed(evt);
            }
        });

        jbInicioVista.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jbInicioVista.setText("INICIO ");
        jbInicioVista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbInicioVistaActionPerformed(evt);
            }
        });

        jbCarritoVista.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jbCarritoVista.setText("CARRO DE COMPRAS");
        jbCarritoVista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCarritoVistaActionPerformed(evt);
            }
        });

        jbVistaImagen.setIcon(new javax.swing.ImageIcon("C:\\Users\\Osvaldo\\Documents\\NetBeansProject\\Gasolinera\\src\\gasolinera\\resources\\imgs\\gasolinera.png")); // NOI18N
        jbVistaImagen.setContentAreaFilled(false);

        javax.swing.GroupLayout jpOpcionesLayout = new javax.swing.GroupLayout(jpOpciones);
        jpOpciones.setLayout(jpOpcionesLayout);
        jpOpcionesLayout.setHorizontalGroup(
            jpOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpOpcionesLayout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addGroup(jpOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jpOpcionesLayout.createSequentialGroup()
                        .addComponent(jbInicioVista, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                        .addComponent(jbCarritoVista, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpOpcionesLayout.createSequentialGroup()
                        .addComponent(jbLoginVista, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbVentasVista, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(33, 33, 33))
            .addGroup(jpOpcionesLayout.createSequentialGroup()
                .addGroup(jpOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpOpcionesLayout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(jbVistaImagen))
                    .addGroup(jpOpcionesLayout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(jtfTituloVista, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpOpcionesLayout.setVerticalGroup(
            jpOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpOpcionesLayout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addComponent(jbVistaImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jtfTituloVista, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jpOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpOpcionesLayout.createSequentialGroup()
                        .addGap(208, 208, 208)
                        .addGroup(jpOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbInicioVista, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbCarritoVista, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jpOpcionesLayout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(jpOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbVentasVista, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbLoginVista, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(202, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpOpciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(799, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpOpciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbLoginVistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLoginVistaActionPerformed
        
        jpanellogin.setVisible(true);
        jpanelinicio.setVisible(false);
        jpanelventa.setVisible(false);
        jpaneladministrador.setVisible(false);
        jpanelcarrito.setVisible(false);
        
        revalidate();
        repaint();
    }//GEN-LAST:event_jbLoginVistaActionPerformed

    private void jbVentasVistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbVentasVistaActionPerformed
        jpanelventa.setVisible(true);
        jpanellogin.setVisible(false);
        jpanelinicio.setVisible(false);
        jpaneladministrador.setVisible(false);
        jpanelcarrito.setVisible(false);
        
        revalidate();
        repaint();
    }//GEN-LAST:event_jbVentasVistaActionPerformed

    private void jbInicioVistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbInicioVistaActionPerformed
        jpanelinicio.setVisible(true);
        jpanelventa.setVisible(false);
        jpanellogin.setVisible(false);
        jpaneladministrador.setVisible(false);
        jpanelcarrito.setVisible(false);
        
        revalidate();
        repaint();
    }//GEN-LAST:event_jbInicioVistaActionPerformed

    private void jbCarritoVistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCarritoVistaActionPerformed
        jpanelcarrito.setVisible(true);
        jpanelinicio.setVisible(false);
        jpanelventa.setVisible(false);
        jpanellogin.setVisible(false);
        jpaneladministrador.setVisible(false);
        
        revalidate();
        repaint();
    }//GEN-LAST:event_jbCarritoVistaActionPerformed


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
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vista().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbCarritoVista;
    private javax.swing.JButton jbInicioVista;
    private javax.swing.JButton jbLoginVista;
    private javax.swing.JButton jbVentasVista;
    private javax.swing.JButton jbVistaImagen;
    public javax.swing.JPanel jpOpciones;
    private javax.swing.JLabel jtfTituloVista;
    // End of variables declaration//GEN-END:variables
}
