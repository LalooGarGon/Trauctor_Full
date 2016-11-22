package traductor;

import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {
    public static Controles Music = new Controles();
    public static ConsultasBD registros = new ConsultasBD();
    public static ArrayList<IPersona> lista;
    public static boolean enter = true;
    public static IPersona jugador;
    public static String ini = "";
    public static int nivJug;
    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        dire();
        //Music.Play("co.mp3");
    }
    
    public static void dire(){
        File dir = new File(".");
        try {
            ini = (dir.getCanonicalPath());
            //System.out.println(ini);
        } catch (IOException ex) {
            Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void ingresar() {
        String cajaUser = txtUsuario.getText();
        String cajaPass = passPass.getText();
        boolean a = false, b = false;
        String aa = "\n* Usuario", bb = "\n* Contraseña";
        if (cajaUser.compareTo("") != 0) {
            a = true;
            aa = "";
        }
        if (cajaPass.compareTo("") != 0) {
            b = true;
            bb = "";
        }

        if (a == true && b == true) {
            IPersona buscado = registros.buscarUser(cajaUser);
            if (buscado != null) {
                String pass = buscado.getPassword();
                if (cajaPass.compareTo(pass) == 0) {
                    JOptionPane.showMessageDialog(null, "Session Started");
                    enter = false;
                    jugador = buscado;
                    nivJug = jugador.getNivel();
                    Inicio abrir = new Inicio();
                    abrir.setVisible(true);
                    this.setVisible(false);
                } else {
                    JOptionPane.showMessageDialog(null, "Usuario o Contraseña Erróneos");
                    enter = false;
                }
            } 
            else {
                JOptionPane.showMessageDialog(null, "Aun no estás registrado");
                enter = false;
            }
        } else {
            JOptionPane.showMessageDialog(null, "Falta" + aa + bb);
            enter = false;
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        btnAceptar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        btnRegistrar = new javax.swing.JButton();
        passPass = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setMinimumSize(new java.awt.Dimension(430, 330));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Berlin Sans FB", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Login");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(160, 10, 100, 40);

        jLabel2.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Usuario:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(40, 90, 80, 21);

        jLabel3.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Contraseña:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(40, 130, 100, 21);

        txtUsuario.setBackground(new java.awt.Color(29, 82, 162));
        txtUsuario.setFont(new java.awt.Font("Berlin Sans FB", 0, 15)); // NOI18N
        txtUsuario.setForeground(new java.awt.Color(255, 255, 255));
        txtUsuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtUsuarioKeyReleased(evt);
            }
        });
        getContentPane().add(txtUsuario);
        txtUsuario.setBounds(150, 90, 180, 25);

        btnAceptar.setBackground(new java.awt.Color(102, 102, 255));
        btnAceptar.setFont(new java.awt.Font("Berlin Sans FB", 0, 12)); // NOI18N
        btnAceptar.setForeground(new java.awt.Color(255, 255, 255));
        btnAceptar.setText("Ingresar");
        btnAceptar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAceptar);
        btnAceptar.setBounds(160, 180, 80, 24);

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("¿Aun no estás registrado?");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(100, 230, 160, 40);

        btnRegistrar.setBackground(new java.awt.Color(102, 102, 255));
        btnRegistrar.setFont(new java.awt.Font("Berlin Sans FB", 0, 12)); // NOI18N
        btnRegistrar.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrar.setText("¡Regístrate!");
        btnRegistrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegistrar);
        btnRegistrar.setBounds(260, 240, 100, 24);

        passPass.setBackground(new java.awt.Color(29, 82, 162));
        passPass.setFont(new java.awt.Font("Berlin Sans FB", 0, 15)); // NOI18N
        passPass.setForeground(new java.awt.Color(255, 255, 255));
        passPass.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        passPass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                passPassKeyReleased(evt);
            }
        });
        getContentPane().add(passPass);
        passPass.setBounds(150, 130, 180, 25);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/traductor/8D291C8F9.jpg"))); // NOI18N
        getContentPane().add(jLabel6);
        jLabel6.setBounds(-100, -20, 600, 350);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        // TODO add your handling code here:
        ingresar();
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void txtUsuarioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUsuarioKeyReleased
        // TODO add your handling code here:
        if (evt.getKeyCode() != KeyEvent.VK_ENTER) {
            enter = true;
        }
        if (enter == true) {
            if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
                ingresar();
            }
        }

    }//GEN-LAST:event_txtUsuarioKeyReleased

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        // TODO add your handling code here:
        Sign abrir = new Sign();
        abrir.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void passPassKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passPassKeyReleased
        // TODO add your handling code here:
        if (evt.getKeyCode() != KeyEvent.VK_ENTER) {
            enter = true;
        }
        if (enter == true) {
            if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
                ingresar();
            }
        }
    }//GEN-LAST:event_passPassKeyReleased

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPasswordField passPass;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}