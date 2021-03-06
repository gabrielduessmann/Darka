/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package darka;

import javax.swing.JFrame;

/**
 *
 * @author gabriel_duessmann
 */
public class TelaPosBatalha2_3_4 extends javax.swing.JFrame {

    /**
     * Creates new form TelaPosBatalha4
     */
    public TelaPosBatalha2_3_4() {
        initComponents();
        if (PerfilUsuario.vida == 800) {
            txtInformacao.setText("+ 250 pontos de vida.");
        } else if (PerfilUsuario.dano == 350) {
            txtInformacao.setText("+ 200 pontos de ataque.");
        } else if (PerfilUsuario.defesa == 80) {
            txtInformacao.setText("+ 80 pontos de defesa.");
        } 
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botao2 = new javax.swing.JButton();
        txtInformacao = new javax.swing.JLabel();
        txtHistoria1 = new javax.swing.JLabel();
        txtHistoria2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botao2.setBackground(new java.awt.Color(255, 255, 255));
        botao2.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        botao2.setText("Continuar");
        botao2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botao2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao2ActionPerformed(evt);
            }
        });
        getContentPane().add(botao2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 550, 260, -1));

        txtInformacao.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        txtInformacao.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(txtInformacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 300, 1050, 80));

        txtHistoria1.setFont(new java.awt.Font("Arial", 0, 56)); // NOI18N
        txtHistoria1.setForeground(new java.awt.Color(255, 255, 255));
        txtHistoria1.setText("Você venceu a luta! Parabéns.");
        getContentPane().add(txtHistoria1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 200, 1050, 80));

        txtHistoria2.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        txtHistoria2.setForeground(new java.awt.Color(255, 255, 255));
        txtHistoria2.setText("Clique em continuar para prosseguir com o jogo.");
        getContentPane().add(txtHistoria2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 380, 1050, 80));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/background.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, -1, 740));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botao2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao2ActionPerformed
            TelaHistoria9 telaHistoria9 = new TelaHistoria9();
            telaHistoria9.setExtendedState(JFrame.MAXIMIZED_BOTH);
            dispose();
            telaHistoria9.setVisible(true);                                      
    }//GEN-LAST:event_botao2ActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(TelaPosBatalha2_3_4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPosBatalha2_3_4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPosBatalha2_3_4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPosBatalha2_3_4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPosBatalha2_3_4().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botao2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel txtHistoria1;
    private javax.swing.JLabel txtHistoria2;
    private javax.swing.JLabel txtInformacao;
    // End of variables declaration//GEN-END:variables
}
