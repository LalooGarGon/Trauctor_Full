/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package traductor;

import java.util.ArrayList;
import javax.swing.JButton;

/**
 *
 * @author ADMN
 */
public class Ejercicios extends javax.swing.JFrame {
    public static int niv;
    public static int ra = 0;
    public static int mar = 0;
    /**
     * Creates new form Ejercicios
     */
    public Ejercicios() {
        initComponents();
        setSize(680, 495);
        setLocationRelativeTo(null);
        setResizable(false);
        Login.Music.Stop();
        Login.registros.modificarNivel(Login.jugador.getUsuario(), Login.nivJug);
        botones();
        
    }
    public void botones(){
        if(Login.nivJug < 10){
            lCan.setVisible(true);
        } else {
            lCan.setVisible(false);
        }
        int val = Login.nivJug;
        int valor = -1;
        if(val <= 100){
            valor = Login.nivJug/10;
        } else{
            valor = 10;
        }
        ArrayList<JButton> bot = new ArrayList();
        bot.add(jButton1);//pos 0
        bot.add(jButton2);//pos 1
        bot.add(jButton3);//pos 2
        bot.add(jButton4);//pos 3
        bot.add(jButton5);//pos 4
        bot.add(jButton6);//pos 5
        bot.add(jButton7);//pos 6
        bot.add(jButton8);//pos 7
        bot.add(jButton9);// pos 8
        bot.add(jButton10);//pos 9
        
        //System.out.println("Nivel" + valor);
        for(int i = 0; i < valor; i++){
            bot.get(i).setEnabled(true);
        }
        if(valor == 0){
            bot.get(0).setEnabled(false);
        }
    } 
    
    public void frames(){
        int ran;
        ran = (int) (Math.random() * (5 + 0) + 1);
        if(ra == ran){
            while(ra == ran){
            ran = (int) (Math.random() * (5 + 0) + 1);
        }
        }
        if(ran == 1){
            ra = 1;
            Principal p = new Principal();
            p.setVisible(true);
            this.setVisible(false);
        }
        if(ran == 2){
            ra = 2;
            Ahor a = new Ahor();
            a.setVisible(true);
            this.setVisible(false);
        }
        if(ran == 3){
            ra = 3;
            MainFrame m = new MainFrame();
            m.setVisible(true);
            this.setVisible(false);
        }
        if(ran == 4){
            ra = 4;
            AdiPal ap = new AdiPal();
            ap.setVisible(true);
            this.setVisible(false);
        }
        if(ran == 5){
            ra = 5;
            AdiCan ad = new AdiCan();
            ad.setVisible(true);
            this.setVisible(false);
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

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();
        lCan = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Cooper Black", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("GAMES");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(270, 0, 200, 50);

        jButton1.setBackground(new java.awt.Color(0, 116, 252));
        jButton1.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("LEVEL 1");
        jButton1.setEnabled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(110, 80, 130, 40);

        jButton6.setBackground(new java.awt.Color(0, 116, 252));
        jButton6.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("LEVEL 6");
        jButton6.setEnabled(false);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6);
        jButton6.setBounds(430, 80, 130, 40);

        jButton2.setBackground(new java.awt.Color(0, 116, 252));
        jButton2.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("LEVEL 2");
        jButton2.setEnabled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(110, 150, 130, 40);

        jButton7.setBackground(new java.awt.Color(0, 116, 252));
        jButton7.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setText("LEVEL 7");
        jButton7.setEnabled(false);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7);
        jButton7.setBounds(430, 150, 130, 40);

        jButton3.setBackground(new java.awt.Color(0, 116, 252));
        jButton3.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("LEVEL 3");
        jButton3.setEnabled(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(110, 220, 130, 40);

        jButton8.setBackground(new java.awt.Color(0, 116, 252));
        jButton8.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        jButton8.setForeground(new java.awt.Color(255, 255, 255));
        jButton8.setText("LEVEL 8");
        jButton8.setEnabled(false);
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8);
        jButton8.setBounds(430, 220, 130, 40);

        jButton4.setBackground(new java.awt.Color(0, 116, 252));
        jButton4.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("LEVEL 4");
        jButton4.setEnabled(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(110, 290, 130, 40);

        jButton9.setBackground(new java.awt.Color(0, 116, 252));
        jButton9.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        jButton9.setForeground(new java.awt.Color(255, 255, 255));
        jButton9.setText("LEVEL 9");
        jButton9.setEnabled(false);
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton9);
        jButton9.setBounds(430, 290, 130, 40);

        jButton5.setBackground(new java.awt.Color(0, 116, 252));
        jButton5.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("LEVEL 5");
        jButton5.setEnabled(false);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(110, 360, 130, 40);

        jButton10.setBackground(new java.awt.Color(0, 116, 252));
        jButton10.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        jButton10.setForeground(new java.awt.Color(255, 255, 255));
        jButton10.setText("LEVEL 10");
        jButton10.setEnabled(false);
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton10);
        jButton10.setBounds(430, 360, 130, 40);

        btnRegresar.setBackground(new java.awt.Color(51, 204, 255));
        btnRegresar.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        btnRegresar.setForeground(new java.awt.Color(0, 0, 0));
        btnRegresar.setText("Return");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegresar);
        btnRegresar.setBounds(570, 420, 85, 31);

        lCan.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        lCan.setForeground(new java.awt.Color(255, 255, 255));
        lCan.setText("You still can not play, go to \"Learn\" first...");
        getContentPane().add(lCan);
        lCan.setBounds(200, 40, 350, 30);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/traductor/ju.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(-80, 0, 770, 470);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        // TODO add your handling code here:
//        Inicio abrir = new Inicio();
//        abrir.setVisible(true);
        this.setVisible(false);
        Login.Music.Stop();
        Login.Music.Play("Archivos/pok.mp3");
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        niv = 1;
        frames();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        niv = 2;
        frames();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        niv = 3;
        frames();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        niv = 4;
        frames();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        niv = 5;
        frames();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        niv = 6;
        frames();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        niv = 7;
        frames();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        niv = 8;
        frames();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        niv = 9;
        frames();
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
        niv = 10;
        frames();
    }//GEN-LAST:event_jButton10ActionPerformed

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
            java.util.logging.Logger.getLogger(Ejercicios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ejercicios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ejercicios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ejercicios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ejercicios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegresar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    public static javax.swing.JLabel lCan;
    // End of variables declaration//GEN-END:variables
}