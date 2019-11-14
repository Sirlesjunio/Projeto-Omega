package Interface.EnsinoSemestral;

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
        lblResultado1 = new javax.swing.JLabel();

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

        lblResultado1.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        lblResultado1.setText("Resultado");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(99, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(btCalcula, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblResultado)
                    .addComponent(lblResultado1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel6)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                .addComponent(nota1Bim, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel1))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(99, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(jLabel6)
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nota1Bim, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btCalcula, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblResultado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblResultado1)
                .addContainerGap(139, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void nota1BimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nota1BimActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nota1BimActionPerformed
    private void btCalculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCalculaActionPerformed
        // TODO add your handling code here:
        try {
            totemomega_xp.EnsinoSemestral ensinoSemestral = new totemomega_xp.EnsinoSemestral();
            ensinoSemestral.setBimestre1(Double.parseDouble(nota1Bim.getText()));
            if (ensinoSemestral.getBimestre1()<0){
                ensinoSemestral.setBimestre1(-ensinoSemestral.getBimestre1());
                this.nota1Bim.setText(String.valueOf(ensinoSemestral.getBimestre1()));
            }
            ensinoSemestral.notaUltimobimestre();
            if (ensinoSemestral.notaUltimobimestre() > 140 || ensinoSemestral.notaUltimobimestre() <= 0) {
                lblResultado.setText("Aprovado");
            } else {
                lblResultado.setText(Double.toString(ensinoSemestral.notaUltimobimestre()));
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
    private javax.swing.JLabel lblResultado1;
    private javax.swing.JTextField nota1Bim;
    // End of variables declaration//GEN-END:variables
}
