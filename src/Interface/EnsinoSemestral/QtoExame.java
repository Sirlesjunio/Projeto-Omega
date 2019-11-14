package Interface.EnsinoSemestral;

import javax.swing.JOptionPane;

public class QtoExame extends javax.swing.JInternalFrame {

    public QtoExame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        mediaSemestral = new javax.swing.JTextField();
        btCalcula = new javax.swing.JButton();
        lblResultado = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel6.setText("Digite suas notas abaixo:");

        mediaSemestral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mediaSemestralActionPerformed(evt);
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

        jLabel1.setText("Média Semestral");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(122, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel6)
                    .addComponent(mediaSemestral, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btCalcula, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblResultado)
                    .addComponent(jLabel1))
                .addContainerGap(76, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(95, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(mediaSemestral, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btCalcula, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(lblResultado)
                .addContainerGap(154, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void mediaSemestralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mediaSemestralActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mediaSemestralActionPerformed
    private void btCalculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCalculaActionPerformed
        try {
            totemomega_xp.EnsinoSemestral ensinoSemestral = new totemomega_xp.EnsinoSemestral();
            ensinoSemestral.setMediaSemestral(Double.parseDouble(mediaSemestral.getText()));
            if (ensinoSemestral.getMediaSemestral()<0){
                ensinoSemestral.setMediaSemestral(-ensinoSemestral.getMediaSemestral());
                this.mediaSemestral.setText(String.valueOf(ensinoSemestral.getMediaSemestral()));
            }
            ensinoSemestral.notaMinimaExame();
            lblResultado.setText(Double.toString(ensinoSemestral.notaMinimaExame()));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "INSIRA OS VALORES CORRETAMENTE!");
        }
    }//GEN-LAST:event_btCalculaActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCalcula;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel lblResultado;
    private javax.swing.JTextField mediaSemestral;
    // End of variables declaration//GEN-END:variables
}
