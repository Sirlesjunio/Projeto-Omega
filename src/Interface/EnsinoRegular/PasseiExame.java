package Interface.EnsinoRegular;

import javax.swing.JOptionPane;

public class PasseiExame extends javax.swing.JInternalFrame {

    public PasseiExame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btCalcula = new javax.swing.JButton();
        lblResultado = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        mediaAnual = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        notaExame = new javax.swing.JTextField();

        btCalcula.setText("Calcular");
        btCalcula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCalculaActionPerformed(evt);
            }
        });

        lblResultado.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        lblResultado.setText("Resultado");

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel6.setText("Digite suas notas abaixo:");

        jLabel1.setText("Média Anual");

        jLabel2.setText("Nota Exame");

        notaExame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                notaExameActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(91, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(notaExame, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btCalcula, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblResultado)
                    .addComponent(jLabel6)
                    .addComponent(mediaAnual, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addContainerGap(107, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mediaAnual, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(notaExame, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(btCalcula, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(143, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void btCalculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCalculaActionPerformed
        try {
            totemomega_xp.EnsinoRegular ensinoRegular = new totemomega_xp.EnsinoRegular();
            ensinoRegular.setMediaAnual(mediaAnual.getText());
            if (ensinoRegular.getMediaAnual()< 0) {
                ensinoRegular.setMediaAnual(-ensinoRegular.getMediaAnual());
                this.mediaAnual.setText(String.valueOf(ensinoRegular.getMediaAnual()));
            }
            ensinoRegular.setNotaExame(notaExame.getText());
            if (ensinoRegular.getNotaExame()< 0) {
                ensinoRegular.setNotaExame(-ensinoRegular.getNotaExame());
                this.notaExame.setText(String.valueOf(ensinoRegular.getNotaExame()));
            }
            ensinoRegular.mediaExameFinal();

            if (ensinoRegular.mediaExameFinal() > 10) {
                if (ensinoRegular.mediaExameFinal() >= 50) {
                    lblResultado.setText(Double.toString(ensinoRegular.mediaExameFinal()) + " Aprovado");
                } else {
                    lblResultado.setText(Double.toString(ensinoRegular.mediaExameFinal()) + " Reprovado");
                }
            } else if (ensinoRegular.mediaExameFinal() >= 5) {
                lblResultado.setText(Double.toString(ensinoRegular.mediaExameFinal()) + " Aprovado");
            } else {
                lblResultado.setText(Double.toString(ensinoRegular.mediaExameFinal()) + " Reprovado");
                //lblResultado.setText(Double.toString(ensinoRegular.mediaExameFinal()) + " Exame");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "INSIRA OS VALORES CORRETAMENTE!");
        }
    }//GEN-LAST:event_btCalculaActionPerformed
    private void notaExameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_notaExameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_notaExameActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCalcula;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel lblResultado;
    private javax.swing.JTextField mediaAnual;
    private javax.swing.JTextField notaExame;
    // End of variables declaration//GEN-END:variables
}
