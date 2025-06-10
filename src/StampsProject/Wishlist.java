package StampsProject;

import java.awt.*;
import java.io.*;
import java.util.ArrayList;
import javax.swing.*;


public class Wishlist extends javax.swing.JFrame {
    private final String username;
    private final ArrayList<String[]> wishlistImages = new ArrayList<>(); // Store name and path as a pair
    private int currentIndex = 0; //tracks the current displayed stamp
    
    public Wishlist(String username) {
    this.username = username; 
    initComponents();
    loadWishlistImages(); 
}
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        RIGHT = new javax.swing.JPanel();
        btnBack = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lblDescription = new javax.swing.JLabel();
        btnEdit = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        LEFT = new javax.swing.JPanel();
        lblMyCollection = new javax.swing.JLabel();
        lblImages = new javax.swing.JLabel();
        btnNext = new javax.swing.JButton();
        btnPrev = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("WISHLIST");
        setBackground(new java.awt.Color(0, 133, 133));
        setPreferredSize(new java.awt.Dimension(800, 500));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 133, 133));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 500));

        RIGHT.setBackground(new java.awt.Color(0, 133, 133));
        RIGHT.setPreferredSize(new java.awt.Dimension(400, 500));

        btnBack.setBackground(new java.awt.Color(252, 251, 240));
        btnBack.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnBack.setForeground(new java.awt.Color(0, 133, 133));
        btnBack.setText("BACK");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/EDIT.png"))); // NOI18N
        jLabel1.setText("ADD/EDIT STAMP DESCRIPTION");

        lblDescription.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblDescription.setForeground(new java.awt.Color(255, 255, 255));
        lblDescription.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        lblDescription.setPreferredSize(new java.awt.Dimension(350, 200));

        btnEdit.setBackground(new java.awt.Color(252, 251, 240));
        btnEdit.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnEdit.setForeground(new java.awt.Color(0, 133, 133));
        btnEdit.setText("EDIT");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnDelete.setBackground(new java.awt.Color(252, 251, 240));
        btnDelete.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(0, 133, 133));
        btnDelete.setText("DELETE STAMP");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout RIGHTLayout = new javax.swing.GroupLayout(RIGHT);
        RIGHT.setLayout(RIGHTLayout);
        RIGHTLayout.setHorizontalGroup(
            RIGHTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RIGHTLayout.createSequentialGroup()
                .addGap(127, 127, 127)
                .addGroup(RIGHTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnBack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEdit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(145, 145, 145))
            .addGroup(RIGHTLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(RIGHTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(lblDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48))
        );
        RIGHTLayout.setVerticalGroup(
            RIGHTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RIGHTLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(btnEdit)
                .addGap(18, 18, 18)
                .addComponent(btnDelete)
                .addGap(18, 18, 18)
                .addComponent(btnBack)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        LEFT.setBackground(new java.awt.Color(255, 247, 217));
        LEFT.setPreferredSize(new java.awt.Dimension(400, 500));

        lblMyCollection.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lblMyCollection.setForeground(new java.awt.Color(0, 133, 133));
        lblMyCollection.setText("    My Wishlist");

        lblImages.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblImages.setForeground(new java.awt.Color(0, 133, 133));
        lblImages.setText("                     Your wishlist is empty!");
        lblImages.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(242, 112, 94), 1, true));
        lblImages.setPreferredSize(new java.awt.Dimension(350, 200));

        btnNext.setBackground(new java.awt.Color(0, 133, 133));
        btnNext.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnNext.setForeground(new java.awt.Color(255, 255, 255));
        btnNext.setText("Next>>");
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        btnPrev.setBackground(new java.awt.Color(0, 133, 133));
        btnPrev.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnPrev.setForeground(new java.awt.Color(255, 255, 255));
        btnPrev.setText("<<Prev");
        btnPrev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrevActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout LEFTLayout = new javax.swing.GroupLayout(LEFT);
        LEFT.setLayout(LEFTLayout);
        LEFTLayout.setHorizontalGroup(
            LEFTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LEFTLayout.createSequentialGroup()
                .addGroup(LEFTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(LEFTLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(LEFTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(LEFTLayout.createSequentialGroup()
                                .addComponent(btnPrev)
                                .addGap(166, 166, 166)
                                .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblImages, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(LEFTLayout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(lblMyCollection, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        LEFTLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnNext, btnPrev});

        LEFTLayout.setVerticalGroup(
            LEFTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LEFTLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(lblMyCollection)
                .addGap(18, 18, 18)
                .addComponent(lblImages, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(LEFTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNext)
                    .addComponent(btnPrev))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        LEFTLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnNext, btnPrev});

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(LEFT, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(RIGHT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(122, 122, 122))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LEFT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(RIGHT, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 32, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1015, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 42, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        deleteStamp();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        new MainMenu(username).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        editStamp();
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnPrevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrevActionPerformed
        if (!wishlistImages.isEmpty()) { 
            currentIndex = (currentIndex - 1 + wishlistImages.size()) % wishlistImages.size();
            displayCurrentImage();
        }
    }//GEN-LAST:event_btnPrevActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        if (!wishlistImages.isEmpty()) { 
            currentIndex = (currentIndex + 1) % wishlistImages.size();
            displayCurrentImage();
        }
    }//GEN-LAST:event_btnNextActionPerformed

    //load wishlist images from the saved file
    private void loadWishlistImages() {
    String wishlistFile = "wishlist_" + username + ".txt";
    wishlistImages.clear();
    File file = new File(wishlistFile);

    if (!file.exists()) {
        return;
    }

    try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
        String line;
        while ((line = reader.readLine()) != null) {
            String[] parts = line.split(",", 4); //ensure we capture all parts
            if (parts.length == 4) {
                File imageFile = new File(parts[1].trim());
                if (imageFile.exists()) {
                    wishlistImages.add(new String[]{
                        parts[0].trim(), 
                        imageFile.getAbsolutePath(), 
                        parts[2].trim(), 
                        parts[3].trim()
                    });}}}
               
        if (!wishlistImages.isEmpty()) {
            currentIndex = 0;
            displayCurrentImage();}
    } catch (IOException e) {
        JOptionPane.showMessageDialog(this, "Error loading wishlist.");
    }
}
    
    //save the wishlist back to file
    private void saveWishlist() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("wishlist_" + username + ".txt"))) {
            for (String[] item : wishlistImages) {
                writer.write(String.join(",", item));
                writer.newLine();
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Error saving wishlist.");
        }
    }

    private void displayCurrentImage() {
    if (!wishlistImages.isEmpty() && currentIndex >= 0 && currentIndex < wishlistImages.size()) {
        String[] currentItem = wishlistImages.get(currentIndex);
        File imageFile = new File(currentItem[1]);

        if (imageFile.exists()) {
            ImageIcon icon = new ImageIcon(imageFile.getAbsolutePath());
            Image scaledImage = icon.getImage().getScaledInstance(lblImages.getWidth(), lblImages.getHeight(), Image.SCALE_SMOOTH);
            lblImages.setIcon(new ImageIcon(scaledImage));
            
        } else {
            lblImages.setIcon(null);
            lblImages.setText("Image not found");
        }

        //description
        StringBuilder description = new StringBuilder("<html><div style='padding: 14px;'>");

        boolean hasData = false;

        if (currentItem.length > 0 && !currentItem[0].equalsIgnoreCase("Unknown")) {
            description.append("<b>Name:</b> ").append(currentItem[0]).append("<br>");
            hasData = true;
        }
        if (currentItem.length > 2 && !currentItem[2].equalsIgnoreCase("Unknown")) {
            description.append("<b>Country:</b> ").append(currentItem[2]).append("<br>");
            hasData = true;
        }
        if (currentItem.length > 3 && !currentItem[3].equalsIgnoreCase("Unknown")) {
            description.append("<b>Year:</b> ").append(currentItem[3]).append("<br>");
            hasData = true;
        }

        if (!hasData) {
            description.append("<b>Name:</b> <br><b>Country:</b> <br><b>Year:</b>"); //always show labels
        }

        description.append("</div></html>");
        lblDescription.setText(description.toString());
    }
}
    
    //edit selected stamp
    private void editStamp() {
    if (!wishlistImages.isEmpty() && currentIndex >= 0 && currentIndex < wishlistImages.size()) {
        String[] currentItem = wishlistImages.get(currentIndex);

        String newName = JOptionPane.showInputDialog(this, "Enter a new name for the stamp:", 
                 currentItem[0].equalsIgnoreCase("Unknown") ? "" : currentItem[0]);
        String newCountry = JOptionPane.showInputDialog(this, "Enter the country of the stamp:", 
                 currentItem[2].equalsIgnoreCase("Unknown") ? "" : currentItem[2]);
        String newYear = JOptionPane.showInputDialog(this, "Enter the year of the stamp:", 
                 currentItem[3].equalsIgnoreCase("Unknown") ? "" : currentItem[3]);


        wishlistImages.set(currentIndex, new String[]{newName, currentItem[1], newCountry, newYear});

        //save and refresh UI
        saveWishlist();
        displayCurrentImage();

        JOptionPane.showMessageDialog(this, "Stamp details updated successfully!");
    } else {
        JOptionPane.showMessageDialog(this, "No stamp selected to edit.");
    }
}
    
    //deletes selected stamp
    private void deleteStamp() {
    //checks if wishlist is not empty and current index is valid
    if (!wishlistImages.isEmpty() && currentIndex >= 0 && currentIndex < wishlistImages.size()) {
        wishlistImages.remove(currentIndex);  //removes the selected item
        saveWishlist();  //saves the updated wishlist
        JOptionPane.showMessageDialog(this, "Stamp deleted!");  //shows the confirmation message

        if (!wishlistImages.isEmpty()) {
            //adjusts index safely to prevent errors
            currentIndex = Math.min(currentIndex, wishlistImages.size() - 1);
            displayCurrentImage();  //display next available image
        } else {
            //resets UI if not items remain
            lblImages.setIcon(null);
            lblDescription.setText("");
        }
    }
}
    
     public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> new Wishlist(Login.currentUsername).setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel LEFT;
    private javax.swing.JPanel RIGHT;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnPrev;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblDescription;
    private javax.swing.JLabel lblImages;
    private javax.swing.JLabel lblMyCollection;
    // End of variables declaration//GEN-END:variables
}
