package Interface.EnsinoSemestral;

import javax.swing.JOptionPane;

public class PasseiSemestre extends javax.swing.JInternalFrame {

    public PasseiSemestre() {

        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        btCalcula = new javax.swing.JButton();
        lblResultado = new javax.swing.JLabel();
        nota1Bim = new javax.swing.JTextField();
        nota2Bim = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblResultado1 = new javax.swing.JLabel();

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel6.setText("Digite suas notas abaixo:");

        btCalcula.setText("Calcular");
        btCalcula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCalculaActionPerformed(evt);
            }
        });

        lblResultado.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        lblResultado.setText("Resultado");

        nota1Bim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nota1BimActionPerformed(evt);
            }
        });

        nota2Bim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nota2BimActionPerformed(evt);
            }
        });

        jLabel3.setText("Nota do 1º Bimestre");

        jLabel4.setText("Nota do 2º Bimestre");

        lblResultado1.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        lblResultado1.setText("Resultado");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(90, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(btCalcula, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblResultado1)
                    .addComponent(jLabel6)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3))
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nota1Bim, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nota2Bim, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(lblResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(108, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(100, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nota1Bim, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nota2Bim, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(btCalcula, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblResultado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblResultado1)
                .addContainerGap(126, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void btCalculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCalculaActionPerformed
        try {
            totemomega_xp.EnsinoSemestral ensinoSemestral = new totemomega_xp.EnsinoSemestral();
            ensinoSemestral.setBimestre1(Double.parseDouble(nota1Bim.getText()));
            if (ensinoSemestral.getBimestre1()<0){
                ensinoSemestral.setBimestre1(-ensinoSemestral.getBimestre1());
                this.nota1Bim.setText(String.valueOf(ensinoSemestral.getBimestre1()));
            }
            ensinoSemestral.setBimestre2(Double.parseDouble(nota2Bim.getText()));
            if (ensinoSemestral.getBimestre2()<0){
                ensinoSemestral.setBimestre2(-ensinoSemestral.getBimestre2());
                this.nota2Bim.setText(String.valueOf(ensinoSemestral.getBimestre2()));
            }
            ensinoSemestral.media();
            if (ensinoSemestral.media() > 10) {
                if (ensinoSemestral.media() >= 70) {
                    lblResultado.setText(Double.toString(ensinoSemestral.media()) + " Aprovado");
                } else {
                    lblResultado.setText(Double.toString(ensinoSemestral.media()) + " Exame");
                }
            } else if (ensinoSemestral.media() >= 7) {
                lblResultado.setText(Double.toString(ensinoSemestral.media()) + " Aprovado");
            } else {
                lblResultado.setText(Double.toString(ensinoSemestral.media()) + " Exame");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "INSIRA OS VALORES CORRETAMENTE!");
        }
    }//GEN-LAST:event_btCalculaActionPerformed
    private void nota1BimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nota1BimActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nota1BimActionPerformed
    private void nota2BimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nota2BimActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nota2BimActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCalcula;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel lblResultado;
    private javax.swing.JLabel lblResultado1;
    private javax.swing.JTextField nota1Bim;
    private javax.swing.JTextField nota2Bim;
    // End of variables declaration//GEN-END:variables

}
