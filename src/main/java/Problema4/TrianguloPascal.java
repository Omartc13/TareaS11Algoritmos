
package Problema4;

import INICIO.INICIO;

/**
 *
 * @author Omar Tc
 */
public class TrianguloPascal extends javax.swing.JFrame {

    Pascal pas= new Pascal();
    
    public TrianguloPascal() {
        initComponents();
        btnRecursivo.setEnabled(false);
        btnIterativo.setEnabled(false);
        btnPascal.setEnabled(false);
        this.setLocationRelativeTo(null);
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jProgressBar1 = new javax.swing.JProgressBar();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtArea = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtnN = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtcombina = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtcombina1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btnRecursivo = new javax.swing.JButton();
        btnIterativo = new javax.swing.JButton();
        btnPascal = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtM = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));

        txtArea.setEditable(false);
        txtArea.setBackground(new java.awt.Color(255, 255, 255));
        txtArea.setColumns(20);
        txtArea.setForeground(new java.awt.Color(0, 0, 0));
        txtArea.setRows(5);
        txtArea.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtAreaKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(txtArea);

        jLabel1.setFont(new java.awt.Font("STXinwei", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Triangulo de Pascal");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Ingrese datos:");

        txtnN.setBackground(new java.awt.Color(255, 255, 255));
        txtnN.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtnN.setForeground(new java.awt.Color(0, 0, 0));
        txtnN.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtnNKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnNKeyTyped(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Nro combinaciones:");

        txtcombina.setEditable(false);
        txtcombina.setBackground(new java.awt.Color(255, 255, 255));
        txtcombina.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtcombina.setForeground(new java.awt.Color(0, 0, 0));

        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Recursiva");

        txtcombina1.setEditable(false);
        txtcombina1.setBackground(new java.awt.Color(255, 255, 255));
        txtcombina1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtcombina1.setForeground(new java.awt.Color(0, 0, 0));

        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Iterativa");

        btnRecursivo.setBackground(new java.awt.Color(255, 255, 255));
        btnRecursivo.setForeground(new java.awt.Color(0, 0, 0));
        btnRecursivo.setText("Comb. Recursivo");
        btnRecursivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRecursivoActionPerformed(evt);
            }
        });

        btnIterativo.setBackground(new java.awt.Color(255, 255, 255));
        btnIterativo.setForeground(new java.awt.Color(0, 0, 0));
        btnIterativo.setText("Comb. Iterativo");
        btnIterativo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIterativoActionPerformed(evt);
            }
        });

        btnPascal.setBackground(new java.awt.Color(255, 255, 255));
        btnPascal.setForeground(new java.awt.Color(0, 0, 0));
        btnPascal.setText("Triangulo Pascal");
        btnPascal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPascalActionPerformed(evt);
            }
        });

        btnLimpiar.setBackground(new java.awt.Color(255, 255, 255));
        btnLimpiar.setForeground(new java.awt.Color(0, 0, 0));
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        btnSalir.setBackground(new java.awt.Color(255, 255, 255));
        btnSalir.setForeground(new java.awt.Color(0, 0, 0));
        btnSalir.setText("Regresar a inicio");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Cant. elementos");

        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Cant. de grupo");

        txtM.setBackground(new java.awt.Color(255, 255, 255));
        txtM.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtM.setForeground(new java.awt.Color(0, 0, 0));
        txtM.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtMKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtcombina, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtcombina1, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtnN, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                                .addGap(19, 19, 19)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtM))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnRecursivo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnIterativo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnPascal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnLimpiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12))
            .addComponent(jSeparator1)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtnN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtcombina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txtcombina1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnRecursivo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnIterativo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnPascal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnLimpiar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSalir)
                        .addGap(15, 15, 15)))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRecursivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRecursivoActionPerformed
        int n=Integer.parseInt(txtnN.getText());
        int m=Integer.parseInt(txtM.getText());
        
        int resultado=pas.combinacionesRecursivo(n, m);
        txtcombina.setText(""+resultado);
        
    }//GEN-LAST:event_btnRecursivoActionPerformed

    private void btnIterativoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIterativoActionPerformed
        
        int n=Integer.parseInt(txtnN.getText());
        int m=Integer.parseInt(txtM.getText());
        
        int resultado=pas.CombinacionIterativa(n, m);
        txtcombina1.setText(""+resultado);
                
    }//GEN-LAST:event_btnIterativoActionPerformed

    private void btnPascalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPascalActionPerformed
        
        int n=Integer.parseInt(txtnN.getText());
        int m=Integer.parseInt(txtM.getText());
        
        
        imprimirTrianguloPascal(n);
        
    }//GEN-LAST:event_btnPascalActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        txtArea.setText("");
        txtM.setText("");
        txtnN.setText("");
        habilitarbotones();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        INICIO newframe  = new INICIO();
        newframe.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed
    
    
    public void imprimirTrianguloPascal(int n) {
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= i; j++) {
                txtArea.append(pas.combinacionesRecursivo(i, j) + " ");
            }
            txtArea.append("\n"); // Salto de línea para la siguiente fila
        }
    }
    
    //Habilitar botones si los campose estan llenos
    public void habilitarbotones(){
        if (txtnN.getText().isEmpty() || txtM.getText().isEmpty()) {
            btnIterativo.setEnabled(false);
            btnPascal.setEnabled(false);
            btnRecursivo.setEnabled(false);
        }else{
            btnIterativo.setEnabled(true);
            btnPascal.setEnabled(true);
            btnRecursivo.setEnabled(true);
        }
    }
    
    public void habilitarbtnLimpiar(){
        if (txtArea.getText().isEmpty()) {
            btnLimpiar.setEnabled(false);
        }else{
            btnLimpiar.setEnabled(true);
        }
    }
        
    private void txtnNKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnNKeyTyped
        int key = evt.getKeyChar();
        boolean numeros = key >= 48 && key <= 57;

        if (!numeros) {
            evt.consume();
        }
    }//GEN-LAST:event_txtnNKeyTyped

    private void txtMKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMKeyTyped
        int key = evt.getKeyChar();
        boolean numeros = key >= 48 && key <= 57;

        if (!numeros) {
            evt.consume();
        }
    }//GEN-LAST:event_txtMKeyTyped

    private void txtnNKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnNKeyReleased
        habilitarbotones();
        
    }//GEN-LAST:event_txtnNKeyReleased

    private void txtMKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMKeyReleased
        habilitarbotones();
        
    }//GEN-LAST:event_txtMKeyReleased

    private void txtAreaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAreaKeyReleased
        habilitarbtnLimpiar();
    }//GEN-LAST:event_txtAreaKeyReleased

    
    
    
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
            java.util.logging.Logger.getLogger(TrianguloPascal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TrianguloPascal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TrianguloPascal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TrianguloPascal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TrianguloPascal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIterativo;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnPascal;
    private javax.swing.JButton btnRecursivo;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextArea txtArea;
    private javax.swing.JTextField txtM;
    private javax.swing.JTextField txtcombina;
    private javax.swing.JTextField txtcombina1;
    private javax.swing.JTextField txtnN;
    // End of variables declaration//GEN-END:variables
}
