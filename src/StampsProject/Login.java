
package StampsProject;

import javax.swing.*;

public class Login extends javax.swing.JFrame {

    //stores the currently logged in username
    public static String currentUsername;
    private final UserManager userManager = new UserManager();

    public Login() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        LEFT = new javax.swing.JPanel();
        lblLogin = new javax.swing.JLabel();
        lblUsername = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        chkShowPass = new javax.swing.JCheckBox();
        btnLogin = new javax.swing.JButton();
        btnRegister = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        RIGHT = new javax.swing.JPanel();
        RIGHT1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LOGIN");
        setPreferredSize(new java.awt.Dimension(800, 500));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 500));
        jPanel1.setLayout(null);

        LEFT.setBackground(new java.awt.Color(255, 247, 217));
        LEFT.setPreferredSize(new java.awt.Dimension(400, 500));

        lblLogin.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lblLogin.setForeground(new java.awt.Color(0, 133, 133));
        lblLogin.setText("LOGIN");

        lblUsername.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblUsername.setForeground(new java.awt.Color(0, 133, 133));
        lblUsername.setText("Username");

        lblPassword.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblPassword.setForeground(new java.awt.Color(0, 133, 133));
        lblPassword.setText("Password");

        txtUsername.setBackground(new java.awt.Color(255, 247, 217));
        txtUsername.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtUsername.setForeground(new java.awt.Color(0, 133, 133));
        txtUsername.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 133, 133)));

        jPasswordField1.setBackground(new java.awt.Color(255, 247, 217));
        jPasswordField1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPasswordField1.setForeground(new java.awt.Color(0, 133, 133));
        jPasswordField1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 133, 133)));

        chkShowPass.setBackground(new java.awt.Color(255, 247, 217));
        chkShowPass.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        chkShowPass.setForeground(new java.awt.Color(0, 133, 133));
        chkShowPass.setText("Show Password");
        chkShowPass.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        chkShowPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkShowPassActionPerformed(evt);
            }
        });

        btnLogin.setBackground(new java.awt.Color(0, 133, 133));
        btnLogin.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(255, 255, 255));
        btnLogin.setText("LOGIN");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        btnRegister.setBackground(new java.awt.Color(0, 133, 133));
        btnRegister.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnRegister.setForeground(new java.awt.Color(255, 255, 255));
        btnRegister.setText("REGISTER");
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(242, 112, 94));
        jLabel1.setText("I don't have an account");

        javax.swing.GroupLayout LEFTLayout = new javax.swing.GroupLayout(LEFT);
        LEFT.setLayout(LEFTLayout);
        LEFTLayout.setHorizontalGroup(
            LEFTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LEFTLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnRegister)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LEFTLayout.createSequentialGroup()
                .addContainerGap(45, Short.MAX_VALUE)
                .addGroup(LEFTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LEFTLayout.createSequentialGroup()
                        .addGroup(LEFTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chkShowPass)
                            .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPassword)
                            .addComponent(lblUsername)
                            .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LEFTLayout.createSequentialGroup()
                        .addComponent(lblLogin)
                        .addGap(130, 130, 130))))
        );
        LEFTLayout.setVerticalGroup(
            LEFTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LEFTLayout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(lblLogin)
                .addGap(30, 30, 30)
                .addComponent(lblUsername)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblPassword)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chkShowPass)
                .addGap(18, 18, 18)
                .addComponent(btnLogin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addGroup(LEFTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(btnRegister))
                .addGap(57, 57, 57))
        );

        jPanel1.add(LEFT);
        LEFT.setBounds(0, 0, 390, 500);

        RIGHT.setBackground(new java.awt.Color(0, 133, 133));
        RIGHT.setPreferredSize(new java.awt.Dimension(400, 500));
        RIGHT.setLayout(null);

        RIGHT1.setBackground(new java.awt.Color(0, 133, 133));
        RIGHT1.setPreferredSize(new java.awt.Dimension(400, 500));
        RIGHT1.setLayout(null);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Logo.png"))); // NOI18N
        RIGHT1.add(jLabel2);
        jLabel2.setBounds(20, 30, 400, 390);

        RIGHT.add(RIGHT1);
        RIGHT1.setBounds(0, 0, 400, 500);

        jPanel1.add(RIGHT);
        RIGHT.setBounds(390, 0, 410, 500);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jPanel1.getAccessibleContext().setAccessibleName("");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    //toggles password visibility
    private void chkShowPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkShowPassActionPerformed
        jPasswordField1.setEchoChar(chkShowPass.isSelected() ? (char) 0 : '*');
    }//GEN-LAST:event_chkShowPassActionPerformed
    
    //handles login process
    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
     loginUser();
    }//GEN-LAST:event_btnLoginActionPerformed
    
    //redirects to the registration form
    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
        this.dispose();
        new Register().setVisible(true);
    }//GEN-LAST:event_btnRegisterActionPerformed

    //handles login process
    private void loginUser() {
        String username = txtUsername.getText().trim();
        String password = new String(jPasswordField1.getPassword()).trim();

        if (username.isEmpty() || password.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Enter both username and password.");
            return;
        }

        if (userManager.validateUser(username, password)) {
            currentUsername = username;
            JOptionPane.showMessageDialog(this, "Login successful!");
            this.dispose();
            new MainMenu(username).setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "Please register!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    //returns the current logged in username
    public static String getCurrentUsername() {
        return currentUsername;
    }

    //runs the application
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Login().setVisible(true));
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel LEFT;
    private javax.swing.JPanel RIGHT;
    private javax.swing.JPanel RIGHT1;
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnRegister;
    private javax.swing.JCheckBox chkShowPass;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JLabel lblLogin;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
