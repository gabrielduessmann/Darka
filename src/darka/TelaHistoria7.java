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
public class TelaHistoria7 extends javax.swing.JFrame {

    /**
     * Creates new form TelaHistoria7
     */
    public TelaHistoria7() {
        initComponents();
        PerfilUsuario.checkpoint = 7;
        txtHistoria.setText("<html>Ao eliminar o inimigo encontram 3 bombas no corpo dele.<br>"
                +"Clique nas bombas para pegá-las.<html>");
        btnInventario.setOpaque(false);
        btnInventario.setContentAreaFilled(false);
        btnInventario.setBorderPainted(false);
        imgBomba1.setOpaque(false);
        imgBomba1.setContentAreaFilled(false);
        imgBomba1.setBorderPainted(false);
        imgBomba3.setOpaque(false);
        imgBomba3.setContentAreaFilled(false);
        imgBomba3.setBorderPainted(false);
        imgBomba2.setOpaque(false);
        imgBomba2.setContentAreaFilled(false);
        imgBomba2.setBorderPainted(false);
        if (PerfilUsuario.bomba1 == true) {
            imgBomba1.setVisible(true);
        } else {
            imgBomba1.setVisible(false);
        }
        
        if (PerfilUsuario.bomba2 == true) {
            imgBomba2.setVisible(true);
        } else {
            imgBomba2.setVisible(false);
        }
        
        if (PerfilUsuario.bomba3 == true) {
            imgBomba3.setVisible(true);
        } else {
            imgBomba3.setVisible(false);
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

        txtHistoria = new javax.swing.JLabel();
        btnInventario = new javax.swing.JButton();
        imgBomba2 = new javax.swing.JButton();
        imgBomba3 = new javax.swing.JButton();
        imgBomba1 = new javax.swing.JButton();
        botao1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtHistoria.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        txtHistoria.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(txtHistoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, 1050, 70));

        btnInventario.setBackground(new java.awt.Color(51, 51, 51));
        btnInventario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/backpack.png"))); // NOI18N
        btnInventario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnInventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInventarioActionPerformed(evt);
            }
        });
        getContentPane().add(btnInventario, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 450, 180, 180));

        imgBomba2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bomb1.png"))); // NOI18N
        imgBomba2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        imgBomba2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imgBomba2ActionPerformed(evt);
            }
        });
        getContentPane().add(imgBomba2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 290, -1, -1));

        imgBomba3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bomb1.png"))); // NOI18N
        imgBomba3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        imgBomba3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imgBomba3ActionPerformed(evt);
            }
        });
        getContentPane().add(imgBomba3, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 290, -1, -1));

        imgBomba1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bomb1.png"))); // NOI18N
        imgBomba1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        imgBomba1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imgBomba1ActionPerformed(evt);
            }
        });
        getContentPane().add(imgBomba1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 290, -1, -1));

        botao1.setBackground(new java.awt.Color(255, 255, 255));
        botao1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        botao1.setText("Continuar");
        botao1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botao1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao1ActionPerformed(evt);
            }
        });
        getContentPane().add(botao1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 550, 220, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/background.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInventarioActionPerformed
        TelaInventario telaInventario = new TelaInventario();
        telaInventario.setExtendedState(JFrame.MAXIMIZED_BOTH);
        dispose();
        telaInventario.setVisible(true);
    }//GEN-LAST:event_btnInventarioActionPerformed

    private void imgBomba1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imgBomba1ActionPerformed
        imgBomba1.setVisible(false);
        PerfilUsuario.qtdeBomba ++;
        PerfilUsuario.bomba1 = false;
    }//GEN-LAST:event_imgBomba1ActionPerformed

    private void imgBomba2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imgBomba2ActionPerformed
        imgBomba2.setVisible(false);
        PerfilUsuario.qtdeBomba ++;
        PerfilUsuario.bomba2 = false;
    }//GEN-LAST:event_imgBomba2ActionPerformed

    private void imgBomba3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imgBomba3ActionPerformed
        imgBomba3.setVisible(false);
        PerfilUsuario.qtdeBomba ++;
        PerfilUsuario.bomba3 = false;
    }//GEN-LAST:event_imgBomba3ActionPerformed

    private void botao1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao1ActionPerformed
        TelaHistoria8 telaHistoria8 = new TelaHistoria8();
        telaHistoria8.setExtendedState(JFrame.MAXIMIZED_BOTH);
        dispose();
        telaHistoria8.setVisible(true);
    }//GEN-LAST:event_botao1ActionPerformed

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
            java.util.logging.Logger.getLogger(TelaHistoria7.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaHistoria7.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaHistoria7.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaHistoria7.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaHistoria7().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botao1;
    private javax.swing.JButton btnInventario;
    private javax.swing.JButton imgBomba1;
    private javax.swing.JButton imgBomba2;
    private javax.swing.JButton imgBomba3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel txtHistoria;
    // End of variables declaration//GEN-END:variables
}
