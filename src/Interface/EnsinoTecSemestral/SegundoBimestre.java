package Interface.EnsinoTecSemestral;

import javax.swing.JOptionPane;

public class SegundoBimestre extends javax.swing.JInternalFrame {

    public SegundoBimestre() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        nota1Bim = new javax.swing.JTextField();
        btCalcula = new javax.swing.JButton();
        lblResultado = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel6.setText("Digite suas notas abaixo:");

        nota1Bim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nota1BimActionPerformed(evt);
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

        jLabel1.setText("Nota do 1º Bimestre");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(99, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(btCalcula, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblResultado)
                    .addComponent(jLabel6)
                    .addComponent(jLabel1)
                    .addComponent(nota1Bim, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(99, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(90, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nota1Bim, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btCalcula, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblResultado)
                .addContainerGap(169, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nota1BimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nota1BimActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_nota1BimActionPerformed
    private void btCalculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCalculaActionPerformed
        // TODO add your handling code here:
        try {
            totemomega_xp.EnsinoTecnicoSemestral EnsinoTecnicoSemestral = new totemomega_xp.EnsinoTecnicoSemestral();
            EnsinoTecnicoSemestral.setBimestre1(Double.parseDouble(nota1Bim.getText()));
            if (EnsinoTecnicoSemestral.getBimestre1()<0){
                EnsinoTecnicoSemestral.setBimestre1(-EnsinoTecnicoSemestral.getBimestre1());
                this.nota1Bim.setText(String.valueOf(EnsinoTecnicoSemestral.getBimestre1()));
            }
            EnsinoTecnicoSemestral.notaUltimobimestre();
            if (EnsinoTecnicoSemestral.notaUltimobimestre() > 140 || EnsinoTecnicoSemestral.notaUltimobimestre() <= 0) {
                lblResultado.setText("Aprovado");
            } else {
                lblResultado.setText(Double.toString(EnsinoTecnicoSemestral.notaUltimobimestre()));
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "INSIRA OS VALORES CORRETAMENTE!");
        }
    }//GEN-LAST:event_btCalculaActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCalcula;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel lblResultado;
    private javax.swing.JTextField nota1Bim;
    // End of variables declaration//GEN-END:variables
}
