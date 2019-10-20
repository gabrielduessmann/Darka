/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package darka;

import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author gabriel_duessmann
 */
public class TelaBatalha5 extends javax.swing.JFrame {

    /**
     * Creates new form TelaBatalha5
     */
    public TelaBatalha5() {
        initComponents();
        if (ArmazenaCadastroPersonagem.sexo == null) {
            ArmazenaCadastroPersonagem.sexo = "Masculino";
        }
        if (ArmazenaCadastroPersonagem.sexo.equals("Masculino")){
            img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/meskim fight male.png")));
        } else {
            img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/meskim fight female.png")));
        }
        txtVidaPersonagem.setText(Integer.toString(PerfilUsuario.vida));
        txtQtdePot.setText(Integer.toString(PerfilUsuario.qtdePot));
        txtQtdeBomba.setText(Integer.toString(PerfilUsuario.qtdeBomba));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        txtDanoPersonagem = new javax.swing.JLabel();
        txtDanoInimigo = new javax.swing.JLabel();
        txtVidaInimigo = new javax.swing.JLabel();
        txtVidaPersonagem = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtQtdeBomba = new javax.swing.JLabel();
        txtQtdePot = new javax.swing.JLabel();
        img = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jButton2.setText("Atacar");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 550, 250, 40));

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("INFORMAÇÕES");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 580, -1, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        txtDanoPersonagem.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtDanoPersonagem.setForeground(new java.awt.Color(0, 204, 51));
        txtDanoPersonagem.setText("Dano Personagem: 0");
        jPanel1.add(txtDanoPersonagem);

        txtDanoInimigo.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtDanoInimigo.setForeground(new java.awt.Color(204, 0, 0));
        txtDanoInimigo.setText("Dano Inimigo: 0");
        jPanel1.add(txtDanoInimigo);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 610, 200, 60));

        txtVidaInimigo.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        txtVidaInimigo.setForeground(new java.awt.Color(204, 0, 0));
        txtVidaInimigo.setText("1200");
        getContentPane().add(txtVidaInimigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 60, -1, -1));

        txtVidaPersonagem.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        txtVidaPersonagem.setForeground(new java.awt.Color(0, 153, 51));
        txtVidaPersonagem.setText("vida");
        getContentPane().add(txtVidaPersonagem, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 270, -1, -1));

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jButton3.setText("Atacar Bomba");
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 600, 250, -1));

        jButton4.setBackground(new java.awt.Color(255, 255, 255));
        jButton4.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jButton4.setText("Usar poção de vida");
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 650, 250, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/potion3.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bomb3.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        txtQtdeBomba.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        txtQtdeBomba.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(txtQtdeBomba, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, 30, 30));

        txtQtdePot.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        txtQtdePot.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(txtQtdePot, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, 30, 30));

        img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/meskim fight male.png"))); // NOI18N
        getContentPane().add(img, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Random  gerador = new Random();
        int danoPersonagem;
        int danoInimigo;
        do {
            danoPersonagem = gerador.nextInt(PerfilUsuario.dano);
        } while (danoPersonagem < 50);
        do {
            danoInimigo = gerador.nextInt(PerfilInimigos.danoMeskim);
        } while (danoInimigo < 70);

        PerfilUsuario.vida -= (danoInimigo-PerfilUsuario.defesa);
        PerfilInimigos.vidaMeskim -= danoPersonagem;
        txtVidaPersonagem.setText(Integer.toString(PerfilUsuario.vida));
        txtVidaInimigo.setText(Integer.toString(PerfilInimigos.vidaMeskim));
        txtDanoPersonagem.setText("Dano Personagem: "+danoPersonagem);
        txtDanoInimigo.setVisible(true);
        txtDanoInimigo.setText("Dano Inimigo: "+danoInimigo);

        if (PerfilInimigos.vidaMeskim <= 0) {
                TelaPosBatalha5 telaPosBatalha5 = new TelaPosBatalha5();
                telaPosBatalha5.setExtendedState(JFrame.MAXIMIZED_BOTH);
                dispose();
                telaPosBatalha5.setVisible(true);
                PerfilUsuario.vida = 1000;
            
        }  
        if (PerfilUsuario.vida <= 0) {
            
            Object[] options = { "Fechar o jogo", "Voltar ao ínicio"};
            int opcao = JOptionPane.showOptionDialog(null, ArmazenaCadastroPersonagem.nome+" perde a luta e é executado "
                    + "pelo inimigo.", "Morte", 
                JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, options, options[0]);
        if (opcao == 1){
            VoltarAoInicio.reinicia();
            TelaHistoria1 telaHistoria1 = new TelaHistoria1();
            telaHistoria1.setExtendedState(JFrame.MAXIMIZED_BOTH);
            dispose();
            telaHistoria1.setVisible(true);
        } else {
            System.exit(0);
        }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed


        if ( PerfilUsuario.qtdeBomba != 0) {

            Random  gerador = new Random();
            int danoInimigo;
            do{
                danoInimigo = gerador.nextInt(PerfilInimigos.danoMeskim);
            } while (danoInimigo < 70);

            PerfilUsuario.vida -= danoInimigo;
            PerfilInimigos.vidaMeskim -= 200;
            txtVidaPersonagem.setText(Integer.toString(PerfilUsuario.vida));
            txtVidaInimigo.setText(Integer.toString(PerfilInimigos.vidaMeskim));
            txtDanoPersonagem.setText("Dano Personagem: "+200);
            txtDanoInimigo.setVisible(true);
            txtDanoInimigo.setText("Dano Inimigo: "+danoInimigo);
            PerfilUsuario.qtdeBomba -= 1;
            txtQtdeBomba.setText(Integer.toString(PerfilUsuario.qtdeBomba));

            if (PerfilInimigos.vidaMeskim <= 0) {
                TelaPosBatalha5 telaPosBatalha5 = new TelaPosBatalha5();
                telaPosBatalha5.setExtendedState(JFrame.MAXIMIZED_BOTH);
                dispose();
                telaPosBatalha5.setVisible(true);
                PerfilUsuario.vida = 1000;
           
            } else if (PerfilUsuario.vida <= 0) {
                
            Object[] options = { "Fechar o jogo", "Voltar ao ínicio"};
            int opcao = JOptionPane.showOptionDialog(null, ArmazenaCadastroPersonagem.nome+" perde a luta e é executado "
                    + "pelo inimigo.", "Morte", 
                JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, options, options[0]);
            if (opcao == 0) {
                System.exit(0);
            } else if (opcao == 1){
                VoltarAoInicio.reinicia();
                TelaHistoria1 telaHistoria1 = new TelaHistoria1();
                telaHistoria1.setExtendedState(JFrame.MAXIMIZED_BOTH);
                dispose();
                telaHistoria1.setVisible(true);
            } else {
                System.exit(0);
        }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Você não possui bombas.");
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        if (PerfilUsuario.qtdePot != 0) {
            PerfilUsuario.vida += 150;
            txtVidaPersonagem.setText(Integer.toString(PerfilUsuario.vida));
            PerfilUsuario.qtdePot -= 1;
            txtQtdePot.setText(Integer.toString(PerfilUsuario.qtdePot));
            txtDanoPersonagem.setText("Vida recuperada: 200");
            txtDanoInimigo.setVisible(false);
        } else {
            JOptionPane.showMessageDialog(null, "Você não possui poção de vida.");
        }
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(TelaBatalha5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaBatalha5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaBatalha5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaBatalha5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaBatalha5().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel img;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel txtDanoInimigo;
    private javax.swing.JLabel txtDanoPersonagem;
    private javax.swing.JLabel txtQtdeBomba;
    private javax.swing.JLabel txtQtdePot;
    private javax.swing.JLabel txtVidaInimigo;
    private javax.swing.JLabel txtVidaPersonagem;
    // End of variables declaration//GEN-END:variables
}
