
package StampsProject;

import java.awt.Color;

public class MainMenu extends javax.swing.JFrame {

    private final String username;
    
    public MainMenu(String username) {
        this.username = username;
        initComponents();
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        LEFT = new javax.swing.JPanel();
        lblMenu = new javax.swing.JLabel();
        btnManageStamps = new javax.swing.JButton();
        btnWishlist = new javax.swing.JButton();
        btnOwnership = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        RIGHT = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MAIN MENU");
        setPreferredSize(new java.awt.Dimension(800, 500));
        setResizable(false);

        jPanel3.setBackground(new java.awt.Color(255, 247, 217));
        jPanel3.setPreferredSize(new java.awt.Dimension(800, 500));

        LEFT.setBackground(new java.awt.Color(255, 247, 217));
        LEFT.setPreferredSize(new java.awt.Dimension(300, 500));

        lblMenu.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lblMenu.setForeground(new java.awt.Color(0, 133, 133));
        lblMenu.setText("         Main Menu");

        btnManageStamps.setBackground(new java.awt.Color(252, 251, 240));
        btnManageStamps.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnManageStamps.setForeground(new java.awt.Color(0, 133, 133));
        btnManageStamps.setText("Manage Stamps");
        btnManageStamps.setBorder(null);
        btnManageStamps.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnManageStampsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnManageStampsMouseExited(evt);
            }
        });
        btnManageStamps.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageStampsActionPerformed(evt);
            }
        });

        btnWishlist.setBackground(new java.awt.Color(252, 251, 240));
        btnWishlist.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnWishlist.setForeground(new java.awt.Color(0, 133, 133));
        btnWishlist.setText("Stamps Wishlist");
        btnWishlist.setBorder(null);
        btnWishlist.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnWishlistMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnWishlistMouseExited(evt);
            }
        });
        btnWishlist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnWishlistActionPerformed(evt);
            }
        });

        btnOwnership.setBackground(new java.awt.Color(252, 251, 240));
        btnOwnership.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnOwnership.setForeground(new java.awt.Color(0, 133, 133));
        btnOwnership.setText("Stamps Ownership");
        btnOwnership.setBorder(null);
        btnOwnership.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnOwnershipMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnOwnershipMouseExited(evt);
            }
        });
        btnOwnership.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOwnershipActionPerformed(evt);
            }
        });

        btnBack.setBackground(new java.awt.Color(0, 133, 133));
        btnBack.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("BACK TO LOGIN");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout LEFTLayout = new javax.swing.GroupLayout(LEFT);
        LEFT.setLayout(LEFTLayout);
        LEFTLayout.setHorizontalGroup(
            LEFTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LEFTLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(LEFTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnManageStamps, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnOwnership, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnWishlist, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(35, 35, 35))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LEFTLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblMenu, javax.swing.GroupLayout.DEFAULT_SIZE, 301, Short.MAX_VALUE)
                .addGap(72, 72, 72))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LEFTLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnBack)
                .addGap(121, 121, 121))
        );
        LEFTLayout.setVerticalGroup(
            LEFTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LEFTLayout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(lblMenu, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                .addGap(41, 41, 41)
                .addComponent(btnManageStamps, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnWishlist, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnOwnership, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                .addGap(47, 47, 47)
                .addComponent(btnBack, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                .addGap(109, 109, 109))
        );

        RIGHT.setBackground(new java.awt.Color(0, 133, 133));
        RIGHT.setPreferredSize(new java.awt.Dimension(400, 500));
        RIGHT.setLayout(null);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Welcome.png"))); // NOI18N
        RIGHT.add(jLabel2);
        jLabel2.setBounds(-40, 20, 480, 450);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LEFT, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(RIGHT, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(RIGHT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(LEFT, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 842, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 33, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    private void btnWishlistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnWishlistActionPerformed
        new Wishlist(username).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnWishlistActionPerformed

    private void btnOwnershipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOwnershipActionPerformed
        new Ownership(username).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnOwnershipActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        new Login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnManageStampsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageStampsActionPerformed
        new ManageStamps(username).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnManageStampsActionPerformed

    private void btnManageStampsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnManageStampsMouseEntered
        btnManageStamps.setBackground(new Color(242, 237, 220));
    }//GEN-LAST:event_btnManageStampsMouseEntered

    private void btnManageStampsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnManageStampsMouseExited
        btnManageStamps.setBackground(new Color(252, 251, 240));
    }//GEN-LAST:event_btnManageStampsMouseExited

    private void btnWishlistMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnWishlistMouseEntered
        btnWishlist.setBackground(new Color(242, 237, 220));
    }//GEN-LAST:event_btnWishlistMouseEntered

    private void btnWishlistMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnWishlistMouseExited
        btnWishlist.setBackground(new Color(252, 251, 240));
    }//GEN-LAST:event_btnWishlistMouseExited

    private void btnOwnershipMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnOwnershipMouseEntered
       btnOwnership.setBackground(new Color(242, 237, 220));
    }//GEN-LAST:event_btnOwnershipMouseEntered

    private void btnOwnershipMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnOwnershipMouseExited
       btnOwnership.setBackground(new Color(252, 251, 240));
    }//GEN-LAST:event_btnOwnershipMouseExited

   
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(() -> {
            new MainMenu(Login.currentUsername).setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel LEFT;
    private javax.swing.JPanel RIGHT;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnManageStamps;
    private javax.swing.JButton btnOwnership;
    private javax.swing.JButton btnWishlist;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblMenu;
    // End of variables declaration//GEN-END:variables
}
