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
public class TelaHistoria11 extends javax.swing.JFrame {

    /**
     * Creates new form TelaHistoria11
     */
    public TelaHistoria11() {
        initComponents();
        PerfilUsuario.checkpoint = 11;
        txtHistoria.setText("<html>Ao entrar na sala, vê Zabba, então "+ArmazenaCadastroPersonagem.nome+" corre em direção a ele, quando está puxando a espada para o matar, Zabba diz ser seu pai."
                + "<br>Obviamente "+ArmazenaCadastroPersonagem.nome+" não acredita! Fala que sua mãe sempre dizia que seu pai tinha os abandonado.</html");
        btnInventario.setOpaque(false);
        btnInventario.setContentAreaFilled(false);
        btnInventario.setBorderPainted(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botao1 = new javax.swing.JButton();
        txtHistoria = new javax.swing.JLabel();
        btnInventario = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botao1.setBackground(new java.awt.Color(255, 255, 255));
        botao1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        botao1.setText("Matar Zabba");
        botao1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botao1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao1ActionPerformed(evt);
            }
        });
        getContentPane().add(botao1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 560, 250, -1));

        txtHistoria.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        txtHistoria.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(txtHistoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, 1050, 130));

        btnInventario.setBackground(new java.awt.Color(51, 51, 51));
        btnInventario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/backpack.png"))); // NOI18N
        btnInventario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnInventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInventarioActionPerformed(evt);
            }
        });
        getContentPane().add(btnInventario, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 450, 180, 180));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/background.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botao1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao1ActionPerformed
        
        TelaHistoria13 telaHistoria13 = new TelaHistoria13();
        telaHistoria13.setExtendedState(JFrame.MAXIMIZED_BOTH);
        dispose();
        telaHistoria13.setVisible(true);
    }//GEN-LAST:event_botao1ActionPerformed

    private void btnInventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInventarioActionPerformed
        TelaInventario telaInventario = new TelaInventario();
        telaInventario.setExtendedState(JFrame.MAXIMIZED_BOTH);
        dispose();
        telaInventario.setVisible(true);
    }//GEN-LAST:event_btnInventarioActionPerformed

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
            java.util.logging.Logger.getLogger(TelaHistoria11.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaHistoria11.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaHistoria11.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaHistoria11.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaHistoria11().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botao1;
    private javax.swing.JButton btnInventario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel txtHistoria;
    // End of variables declaration//GEN-END:variables
}
