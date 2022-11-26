
package gasolinera;


public class JPanelInicio extends javax.swing.JPanel {


    public JPanelInicio() {
        initComponents();
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlInicio = new javax.swing.JLabel();
        jlGasolinera = new javax.swing.JLabel();
        jtfCantidad = new javax.swing.JTextField();
        jlCantidad = new javax.swing.JLabel();
        jrbRegular = new javax.swing.JRadioButton();
        jrbPremiun = new javax.swing.JRadioButton();
        jrbDiesel = new javax.swing.JRadioButton();
        jbAceptar = new javax.swing.JButton();
        jbImprimir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtaSugerencias = new javax.swing.JTextArea();
        jlSugerencias = new javax.swing.JLabel();
        jlIconInicio = new javax.swing.JLabel();
        jtfUserInicio = new javax.swing.JTextField();

        jlInicio.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jlInicio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlInicio.setText("INICIO");

        jlGasolinera.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        jlGasolinera.setText("GASOLINERA");

        jlCantidad.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jlCantidad.setText("CANTIDAD ( L )");

        jrbRegular.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jrbRegular.setText("REGULAR");

        jrbPremiun.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jrbPremiun.setText("PREMIUN");

        jrbDiesel.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jrbDiesel.setText("DIESEL");

        jbAceptar.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jbAceptar.setText("ACEPTAR");

        jbImprimir.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jbImprimir.setText("IMPRIMIR RECIBO");

        jtaSugerencias.setEditable(false);
        jtaSugerencias.setColumns(20);
        jtaSugerencias.setRows(5);
        jScrollPane1.setViewportView(jtaSugerencias);

        jlSugerencias.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jlSugerencias.setText("PRODUCTOS SUGERIDOS");

        jlIconInicio.setIcon(new javax.swing.ImageIcon("C:\\Users\\Osvaldo\\Documents\\NetBeansProject\\Gasolinera\\src\\gasolinera\\resources\\imgs\\usuario-de-perfil.png")); // NOI18N

        jtfUserInicio.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jlIconInicio)
                .addGap(18, 18, 18)
                .addComponent(jtfUserInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
            .addGroup(layout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jrbDiesel, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jbAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbImprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(90, 90, 90))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jrbRegular)
                            .addComponent(jlCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jrbPremiun)
                            .addComponent(jlGasolinera, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 98, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(68, 68, 68))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jlSugerencias)
                                .addGap(106, 106, 106))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlIconInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jlInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jtfUserInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(134, 134, 134)
                                .addComponent(jlSugerencias)
                                .addGap(30, 30, 30)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(51, 51, 51)
                                .addComponent(jlGasolinera, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jtfCantidad)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jlCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(51, 51, 51)
                                .addComponent(jrbRegular)
                                .addGap(27, 27, 27)
                                .addComponent(jrbPremiun)
                                .addGap(24, 24, 24)))
                        .addGap(5, 5, 5)
                        .addComponent(jrbDiesel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                        .addComponent(jbImprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(202, 202, 202))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(165, 165, 165))))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbAceptar;
    private javax.swing.JButton jbImprimir;
    private javax.swing.JLabel jlCantidad;
    private javax.swing.JLabel jlGasolinera;
    private javax.swing.JLabel jlIconInicio;
    private javax.swing.JLabel jlInicio;
    private javax.swing.JLabel jlSugerencias;
    private javax.swing.JRadioButton jrbDiesel;
    private javax.swing.JRadioButton jrbPremiun;
    private javax.swing.JRadioButton jrbRegular;
    private javax.swing.JTextArea jtaSugerencias;
    private javax.swing.JTextField jtfCantidad;
    private javax.swing.JTextField jtfUserInicio;
    // End of variables declaration//GEN-END:variables
}
