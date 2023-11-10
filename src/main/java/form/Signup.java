package form;

import java.awt.Color;
import javax.swing.ImageIcon;

public class Signup extends javax.swing.JFrame {

    Color color = new Color(239, 32, 130);

    public Signup() {
        initComponents();
        init();
    }

    public void init() {
//        txtName.setPrefixIcon(new ImageIcon(getClass().getResource("/icon/user.png")));
        txtName.setHint("Tên tài khoản");
//        txtEmail.setPrefixIcon(new ImageIcon(getClass().getResource("/icon/mail.png")));
        txtEmail.setHint("Email");
//        txtPass.setPrefixIcon(new ImageIcon(getClass().getResource("/icon/pass.png")));
        txtPass.setHint("Mật khẩu");
//        txtPassAgaint.setPrefixIcon(new ImageIcon(getClass().getResource("/icon/pass.png")));
        txtPassAgaint.setHint("Xác nhận mật khẩu");
        txtTen.setHint("Họ và tên");

        btnSignup.setBackground(color);
        btnSignup.setForeground(Color.WHITE);
        btnLogin.setBackground(color);
        btnLogin.setForeground(Color.WHITE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel1 = new swing.Panel();
        lbOut = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtPass = new swing.MyPasswordField();
        txtName = new swing.MyTextField();
        btnSignup = new swing.Button();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtEmail = new swing.MyTextField();
        txtPassAgaint = new swing.MyPasswordField();
        txtTen = new swing.MyTextField();
        btnLogin = new swing.Button();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);

        panel1.setBackground(new java.awt.Color(0, 0, 0));
        panel1.setOpaque(true);
        panel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbOut.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbOut.setForeground(new java.awt.Color(239, 32, 130));
        lbOut.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbOut.setText("X");
        lbOut.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbOut.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                lbOutMouseMoved(evt);
            }
        });
        lbOut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbOutMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbOutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbOutMouseExited(evt);
            }
        });
        panel1.add(lbOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 0, 30, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Đăng ký");
        panel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 50, 120, 30));

        txtPass.setForeground(new java.awt.Color(0, 0, 0));
        txtPass.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        panel1.add(txtPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 280, 278, -1));

        txtName.setForeground(new java.awt.Color(0, 0, 0));
        txtName.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        panel1.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 160, 278, -1));

        btnSignup.setBorder(null);
        btnSignup.setText("Đăng ký");
        btnSignup.setFocusPainted(false);
        btnSignup.setFocusable(false);
        btnSignup.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        panel1.add(btnSignup, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 420, 278, 44));

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Điều khoản ứng dụng.");
        panel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 540, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 102, 102));
        jLabel6.setText("Xem chi tiết.");
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 540, -1, -1));

        txtEmail.setForeground(new java.awt.Color(0, 0, 0));
        txtEmail.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        panel1.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 220, 278, -1));

        txtPassAgaint.setForeground(new java.awt.Color(0, 0, 0));
        txtPassAgaint.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        panel1.add(txtPassAgaint, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 340, 278, -1));

        txtTen.setForeground(new java.awt.Color(0, 0, 0));
        txtTen.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        panel1.add(txtTen, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 100, 278, -1));

        btnLogin.setBorder(null);
        btnLogin.setText("Đăng nhập");
        btnLogin.setFocusPainted(false);
        btnLogin.setFocusable(false);
        btnLogin.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        panel1.add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 480, 278, 44));
        panel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(137, 79, 37, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/signup.png"))); // NOI18N
        panel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1140, 690));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lbOutMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbOutMouseMoved

    }//GEN-LAST:event_lbOutMouseMoved

    private void lbOutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbOutMouseClicked
        System.exit(0);
    }//GEN-LAST:event_lbOutMouseClicked

    private void lbOutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbOutMouseEntered
        lbOut.setForeground(new Color(255, 102, 102));
    }//GEN-LAST:event_lbOutMouseEntered

    private void lbOutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbOutMouseExited
        lbOut.setForeground(new Color(239, 32, 130));
    }//GEN-LAST:event_lbOutMouseExited

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
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Signup().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private swing.Button btnLogin;
    private swing.Button btnSignup;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel lbOut;
    private swing.Panel panel1;
    private swing.MyTextField txtEmail;
    private swing.MyTextField txtName;
    private swing.MyPasswordField txtPass;
    private swing.MyPasswordField txtPassAgaint;
    private swing.MyTextField txtTen;
    // End of variables declaration//GEN-END:variables
}
