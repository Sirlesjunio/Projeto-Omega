package Interface.EnsinoTecSemestral;

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
        mediaSemestral = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        notaExame = new javax.swing.JTextField();
        lblResultado1 = new javax.swing.JLabel();

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

        jLabel1.setText("Média Semestral");

        jLabel2.setText("Nota Exame");

        notaExame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                notaExameActionPerformed(evt);
            }
        });

        lblResultado1.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        lblResultado1.setText("Resultado");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(notaExame, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblResultado1)
                    .addComponent(btCalcula, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblResultado)
                    .addComponent(jLabel6)
                    .addComponent(mediaSemestral, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(107, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addGap(33, 33, 33)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mediaSemestral, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(notaExame, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(btCalcula, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblResultado1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(98, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btCalculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCalculaActionPerformed
        try {
            totemomega_xp.EnsinoTecnicoSemestral ensinoTecnicoSemestral = new totemomega_xp.EnsinoTecnicoSemestral();
            ensinoTecnicoSemestral.setMediaSemestral(Double.parseDouble(mediaSemestral.getText()));
            if (ensinoTecnicoSemestral.getMediaSemestral()<0){
                ensinoTecnicoSemestral.setMediaSemestral(-ensinoTecnicoSemestral.getMediaSemestral());
                this.mediaSemestral.setText(String.valueOf(ensinoTecnicoSemestral.getMediaSemestral()));
            }
            ensinoTecnicoSemestral.setNotaExame(Double.parseDouble(notaExame.getText()));
            if (ensinoTecnicoSemestral.getNotaExame()<0){
                ensinoTecnicoSemestral.setNotaExame(-ensinoTecnicoSemestral.getNotaExame());
                this.mediaSemestral.setText(String.valueOf(ensinoTecnicoSemestral.getNotaExame()));
            }
            ensinoTecnicoSemestral.mediaExameFinal();
            if (ensinoTecnicoSemestral.mediaExameFinal() > 10) {
                if (ensinoTecnicoSemestral.mediaExameFinal() >= 50) {
                    lblResultado.setText(Double.toString(ensinoTecnicoSemestral.mediaExameFinal()) + " Aprovado");
                } else {
                    lblResultado.setText(Double.toString(ensinoTecnicoSemestral.mediaExameFinal()) + " Exame");
                }
            } else if (ensinoTecnicoSemestral.mediaExameFinal() >= 5) {
                lblResultado.setText(Double.toString(ensinoTecnicoSemestral.mediaExameFinal()) + " Aprovado");
            } else {
                lblResultado.setText(Double.toString(ensinoTecnicoSemestral.mediaExameFinal()) + " Exame");
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
    private javax.swing.JLabel lblResultado1;
    private javax.swing.JTextField mediaSemestral;
    private javax.swing.JTextField notaExame;
    // End of variables declaration//GEN-END:variables
}
