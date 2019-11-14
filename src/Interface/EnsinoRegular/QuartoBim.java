package Interface.EnsinoRegular;

import javax.swing.JOptionPane;

public class QuartoBim extends javax.swing.JInternalFrame {

    public QuartoBim() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        nota1Bim = new javax.swing.JTextField();
        nota2Bim = new javax.swing.JTextField();
        nota3Bim = new javax.swing.JTextField();
        btCalcula = new javax.swing.JButton();
        lblResultado = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel6.setText("Digite suas notas abaixo:");

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

        btCalcula.setText("Calcular");
        btCalcula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCalculaActionPerformed(evt);
            }
        });

        lblResultado.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        lblResultado.setText("Resultado");

        jLabel1.setText("Nota do 1º Bimestre: ");

        jLabel2.setText("Nota do 2º Bimestre: ");

        jLabel3.setText("Nota do 3º Bimestre: ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(97, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel6)
                    .addComponent(nota1Bim, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nota2Bim, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nota3Bim, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btCalcula, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblResultado)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addContainerGap(101, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nota2Bim, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nota3Bim, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nota1Bim, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(btCalcula, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblResultado)
                .addContainerGap(66, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void nota1BimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nota1BimActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nota1BimActionPerformed
    private void btCalculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCalculaActionPerformed
        // TODO add your handling code here:
        try {
            totemomega_xp.EnsinoRegular ensinoRegular = new totemomega_xp.EnsinoRegular();
            ensinoRegular.setBimestre1(Double.parseDouble(nota1Bim.getText()));
            if (ensinoRegular.getBimestre1()<0){
                ensinoRegular.setBimestre1(-ensinoRegular.getBimestre1());
                this.nota1Bim.setText(String.valueOf(ensinoRegular.getBimestre1()));
            }
            ensinoRegular.setBimestre2(Double.parseDouble(nota2Bim.getText()));
            if (ensinoRegular.getBimestre2()<0){
                ensinoRegular.setBimestre2(-ensinoRegular.getBimestre2());
                this.nota2Bim.setText(String.valueOf(ensinoRegular.getBimestre1()));
            }
            ensinoRegular.setBimestre3(Double.parseDouble(nota3Bim.getText()));
            if (ensinoRegular.getBimestre3()<0){
                ensinoRegular.setBimestre3(-ensinoRegular.getBimestre3());
                this.nota3Bim.setText(String.valueOf(ensinoRegular.getBimestre1()));
            }
            ensinoRegular.notaUltimobimestre();
            if (ensinoRegular.notaUltimobimestre() > 280 || ensinoRegular.notaUltimobimestre() <= 0) {
                lblResultado.setText("Aprovado");
            } else {
                lblResultado.setText(Double.toString(ensinoRegular.notaUltimobimestre()));
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "INSIRA OS VALORES CORRETAMENTE!");
        }
    }//GEN-LAST:event_btCalculaActionPerformed
    private void nota2BimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nota2BimActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nota2BimActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCalcula;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel lblResultado;
    private javax.swing.JTextField nota1Bim;
    private javax.swing.JTextField nota2Bim;
    private javax.swing.JTextField nota3Bim;
    // End of variables declaration//GEN-END:variables
}
