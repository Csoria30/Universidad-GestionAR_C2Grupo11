
package Vistas;

import Conexion.Conexion;
import Funciones.*;
import java.awt.Graphics;
import java.awt.Image;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;


public class Login extends javax.swing.JFrame {
    private final Connection con;
    static String usuarioSesion = "";
    static String rolSesion = "";
    
    
    public Login() {
        con = Conexion.getConexion();
        initComponents();
        centrarIconos();
        this.setLocationRelativeTo(null);
    }
    
    //Centrando iconos de Login y Password
    void centrarIconos(){
        labelIconoUsuario.setHorizontalAlignment(SwingConstants.CENTER); 
        labelIconoUsuario.setVerticalAlignment(SwingConstants.CENTER);
        labelIconoPassword.setHorizontalAlignment(SwingConstants.CENTER); 
        labelIconoPassword.setVerticalAlignment(SwingConstants.CENTER);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ImageIcon icon = new ImageIcon(getClass().getResource("/Imagenes/fnodoLogin.png"));
        Image image = icon.getImage();
        jPanelDesktop = new javax.swing.JPanel(){
            public void paintComponent(Graphics grafico){
                grafico.drawImage(image,0,0,getWidth(),getHeight(),this);
            }
        };
        jpUsuario = new javax.swing.JPanel();
        jtfUsuario = new javax.swing.JTextField();
        labelIconoUsuario = new javax.swing.JLabel();
        jpPassword = new javax.swing.JPanel();
        labelIconoPassword = new javax.swing.JLabel();
        passwordLogin = new javax.swing.JPasswordField();
        btnLogin = new javax.swing.JButton();
        logo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(800, 450));
        setResizable(false);

        jtfUsuario.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jtfUsuario.setBorder(null);
        jtfUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfUsuarioKeyTyped(evt);
            }
        });

        labelIconoUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/user.png"))); // NOI18N

        javax.swing.GroupLayout jpUsuarioLayout = new javax.swing.GroupLayout(jpUsuario);
        jpUsuario.setLayout(jpUsuarioLayout);
        jpUsuarioLayout.setHorizontalGroup(
            jpUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpUsuarioLayout.createSequentialGroup()
                .addComponent(labelIconoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jtfUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 445, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jpUsuarioLayout.setVerticalGroup(
            jpUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelIconoUsuario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
            .addComponent(jtfUsuario, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        labelIconoPassword.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/key.png"))); // NOI18N

        passwordLogin.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        passwordLogin.setBorder(null);
        passwordLogin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                passwordLoginKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jpPasswordLayout = new javax.swing.GroupLayout(jpPassword);
        jpPassword.setLayout(jpPasswordLayout);
        jpPasswordLayout.setHorizontalGroup(
            jpPasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpPasswordLayout.createSequentialGroup()
                .addComponent(labelIconoPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(passwordLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 447, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jpPasswordLayout.setVerticalGroup(
            jpPasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelIconoPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
            .addComponent(passwordLogin)
        );

        btnLogin.setText("Iniciar Sesion");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logoLogin.png"))); // NOI18N

        javax.swing.GroupLayout jPanelDesktopLayout = new javax.swing.GroupLayout(jPanelDesktop);
        jPanelDesktop.setLayout(jPanelDesktopLayout);
        jPanelDesktopLayout.setHorizontalGroup(
            jPanelDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelDesktopLayout.createSequentialGroup()
                .addContainerGap(165, Short.MAX_VALUE)
                .addGroup(jPanelDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jpPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jpUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 509, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(128, 128, 128))
            .addGroup(jPanelDesktopLayout.createSequentialGroup()
                .addGap(303, 303, 303)
                .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelDesktopLayout.setVerticalGroup(
            jPanelDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelDesktopLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(logo)
                .addGap(33, 33, 33)
                .addComponent(jpUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jpPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(89, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelDesktop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelDesktop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtfUsuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfUsuarioKeyTyped
        Funciones.soloNumeros(jtfUsuario, evt, 8);
    }//GEN-LAST:event_jtfUsuarioKeyTyped

    private void passwordLoginKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordLoginKeyTyped
        Funciones.soloNumerosYLetras(passwordLogin, evt, 15);
    }//GEN-LAST:event_passwordLoginKeyTyped
    
    //Bonton Login
    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        String user = jtfUsuario.getText();
        String pass = passwordLogin.getText();
        
        String query    = "SELECT dni, password, rolSistema " 
                        + "FROM miembro " 
                        + "WHERE estado = 1 "
                        + "AND dni = '"+user+"' "
                        + "LIMIT 1";
        
        try {
            PreparedStatement stmt = con.prepareStatement(query);
            ResultSet resultado = stmt.executeQuery();
            
            if( resultado.next() ){
                String usuarioValidado = resultado.getString("dni");
                String passValidado = resultado.getString("password");
                String rolValidado = resultado.getString("rolSistema");

                if ( pass.equals(passValidado) ){ //Validando contraseñas
                    usuarioSesion = usuarioValidado;
                    rolSesion = rolValidado;
                    
                    Menu menu = new Menu();
                    this.setVisible(false);
                    menu.setExtendedState(menu.MAXIMIZED_BOTH); // abrir en pantalla completa
                    menu.setVisible(true);                   

                }else{
                    JOptionPane.showMessageDialog(null, Menu.ERROR_PASSWORD_LOGIN, Menu.TT_ERROR_AUTENTICACION, JOptionPane.WARNING_MESSAGE);
                }
                
            }else{
                JOptionPane.showMessageDialog(null, Menu.ERROR_USUARIO_LOGIN, Menu.TT_ERROR_AUTENTICACION,JOptionPane.ERROR_MESSAGE);
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, Menu.ERROR + ex);
        }
        
    }//GEN-LAST:event_btnLoginActionPerformed

    public static void main(String args[]) {
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
        java.awt.EventQueue.invokeLater(() -> {
            new Login().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JPanel jPanelDesktop;
    private javax.swing.JPanel jpPassword;
    private javax.swing.JPanel jpUsuario;
    private javax.swing.JTextField jtfUsuario;
    private javax.swing.JLabel labelIconoPassword;
    private javax.swing.JLabel labelIconoUsuario;
    private javax.swing.JLabel logo;
    private javax.swing.JPasswordField passwordLogin;
    // End of variables declaration//GEN-END:variables
}
