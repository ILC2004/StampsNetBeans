package StampsProject;

import java.awt.*;
import java.io.*;
import java.util.ArrayList;
import javax.swing.*;

public class Ownership extends javax.swing.JFrame {

    private final String username; //stores the logged in user's username
    private final ArrayList<String[]> ownedImages = new ArrayList<>(); //stores the owned stamps
    private int currentIndex = 0; //tracks the current displayed stamp

    public Ownership(String username) {
        this.username = username;
        initComponents();
        loadOwnedImages();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        LEFT = new javax.swing.JPanel();
        lblMyCollection = new javax.swing.JLabel();
        lblImages = new javax.swing.JLabel();
        btnPrev = new javax.swing.JButton();
        btnNext = new javax.swing.JButton();
        RIGHT = new javax.swing.JPanel();
        btnBack = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnEdit = new javax.swing.JButton();
        lblDescription = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("OWNERSHIP");
        setPreferredSize(new java.awt.Dimension(800, 500));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 133, 133));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 500));

        LEFT.setBackground(new java.awt.Color(255, 247, 217));
        LEFT.setPreferredSize(new java.awt.Dimension(400, 500));

        lblMyCollection.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lblMyCollection.setForeground(new java.awt.Color(0, 133, 133));
        lblMyCollection.setText("   My Collection");

        lblImages.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblImages.setForeground(new java.awt.Color(0, 133, 133));
        lblImages.setText("                     Your collection is empty!");
        lblImages.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(242, 112, 94), 1, true));
        lblImages.setPreferredSize(new java.awt.Dimension(350, 200));

        btnPrev.setBackground(new java.awt.Color(0, 133, 133));
        btnPrev.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnPrev.setForeground(new java.awt.Color(255, 255, 255));
        btnPrev.setText("<<Prev");
        btnPrev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrevActionPerformed(evt);
            }
        });

        btnNext.setBackground(new java.awt.Color(0, 133, 133));
        btnNext.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnNext.setForeground(new java.awt.Color(255, 255, 255));
        btnNext.setText("Next>>");
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout LEFTLayout = new javax.swing.GroupLayout(LEFT);
        LEFT.setLayout(LEFTLayout);
        LEFTLayout.setHorizontalGroup(
            LEFTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LEFTLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblMyCollection, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56))
            .addGroup(LEFTLayout.createSequentialGroup()
                .addGroup(LEFTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(LEFTLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblImages, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, LEFTLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(btnPrev)
                        .addGap(166, 166, 166)
                        .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        LEFTLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnNext, btnPrev});

        LEFTLayout.setVerticalGroup(
            LEFTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LEFTLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(lblMyCollection)
                .addGap(18, 18, 18)
                .addComponent(lblImages, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(LEFTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPrev)
                    .addComponent(btnNext))
                .addContainerGap(155, Short.MAX_VALUE))
        );

        LEFTLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnNext, btnPrev});

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

        btnDelete.setBackground(new java.awt.Color(252, 251, 240));
        btnDelete.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(0, 133, 133));
        btnDelete.setText("DELETE STAMP");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/EDIT.png"))); // NOI18N
        jLabel1.setText("ADD/EDIT STAMP DESCRIPTION");

        btnEdit.setBackground(new java.awt.Color(252, 251, 240));
        btnEdit.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnEdit.setForeground(new java.awt.Color(0, 133, 133));
        btnEdit.setText("EDIT");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        lblDescription.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblDescription.setForeground(new java.awt.Color(255, 255, 255));
        lblDescription.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        lblDescription.setPreferredSize(new java.awt.Dimension(350, 200));

        javax.swing.GroupLayout RIGHTLayout = new javax.swing.GroupLayout(RIGHT);
        RIGHT.setLayout(RIGHTLayout);
        RIGHTLayout.setHorizontalGroup(
            RIGHTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RIGHTLayout.createSequentialGroup()
                .addGroup(RIGHTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(RIGHTLayout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addGroup(RIGHTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnBack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnEdit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(RIGHTLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(RIGHTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(lblDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        RIGHTLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnBack, btnDelete});

        RIGHTLayout.setVerticalGroup(
            RIGHTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RIGHTLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(btnEdit)
                .addGap(18, 18, 18)
                .addComponent(btnDelete)
                .addGap(18, 18, 18)
                .addComponent(btnBack)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        RIGHTLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnBack, btnDelete});

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(LEFT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(RIGHT, javax.swing.GroupLayout.DEFAULT_SIZE, 395, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LEFT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(RIGHT, javax.swing.GroupLayout.PREFERRED_SIZE, 484, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 807, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 16, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnPrevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrevActionPerformed
       if (!ownedImages.isEmpty()) {
            currentIndex = (currentIndex - 1 + ownedImages.size()) % ownedImages.size();
            displayCurrentImage();
        }
    }//GEN-LAST:event_btnPrevActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        if (!ownedImages.isEmpty()) {
            currentIndex = (currentIndex + 1) % ownedImages.size();
            displayCurrentImage();
        }
    }//GEN-LAST:event_btnNextActionPerformed

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

    //load owned images from file
    private void loadOwnedImages() { 
    String ownershipFile = "ownership_" + username + ".txt"; //defines ownership file, based on user logged in
    ownedImages.clear(); 
    File file = new File(ownershipFile);

    if (!file.exists()) {
        return;
    }

    //reads each line from the file
    try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
        String line;
        while ((line = reader.readLine()) != null) {
            String[] parts = line.split(",", 4);
            if (parts.length >= 3) {
                File imageFile = new File(parts[1].trim());
                //if any are unknown, stores them as an empty string
                if (imageFile.exists()) {
                    ownedImages.add(new String[]{
                        parts[0].trim().equalsIgnoreCase("Unknown") ? "" : parts[0].trim(), 
                        imageFile.getAbsolutePath(), 
                        parts[2].trim().equalsIgnoreCase("Unknown") ? "" : parts[2].trim(), 
                        parts.length > 3 && !parts[3].trim().equalsIgnoreCase("Unknown") ? parts[3].trim() : ""
                    });
                }
            }
        }

        //sets the index to first image to display
        if (!ownedImages.isEmpty()) {
            currentIndex = 0;
            displayCurrentImage();
        }
    } catch (IOException e) {
        JOptionPane.showMessageDialog(this, "Error loading collection: " + e.getMessage());
    }
}
    
    //display the current image with description
    private void displayCurrentImage() {
    if (!ownedImages.isEmpty() && currentIndex >= 0 && currentIndex < ownedImages.size()) {
        String[] currentItem = ownedImages.get(currentIndex);
        File imageFile = new File(currentItem[1]);

        if (imageFile.exists()) {
            ImageIcon icon = new ImageIcon(imageFile.getAbsolutePath());
            Image scaledImage = icon.getImage().getScaledInstance(lblImages.getWidth(), lblImages.getHeight(), Image.SCALE_SMOOTH);
            lblImages.setIcon(new ImageIcon(scaledImage));
            
        }
       
        //format description with html
        String description = "<html><div style='padding: 14px;'>";

        if (!currentItem[0].equalsIgnoreCase("Unknown")) {
            description += "<b>Name:</b> " + currentItem[0] + "<br>";
        }
        if (currentItem.length > 2 && !currentItem[2].equalsIgnoreCase("Unknown")) {
            description += "<b>Country:</b> " + currentItem[2] + "<br>";
        }
        if (currentItem.length > 3 && !currentItem[3].equalsIgnoreCase("Unknown")) {
            description += "<b>Year:</b> " + currentItem[3] + "<br>";
        }

        description += "</div></html>";
        lblDescription.setText(description);
    }
}

    //delete selected stamp
    private void deleteStamp() {
    if (!ownedImages.isEmpty() && currentIndex >= 0 && currentIndex < ownedImages.size()) {
        ownedImages.remove(currentIndex); //delete selected image
        saveOwnedImages();  //save the updated collection
        JOptionPane.showMessageDialog(this, "Stamp deleted!");  //show confirmation message

        if (!ownedImages.isEmpty()) {
            currentIndex = Math.min(currentIndex, ownedImages.size() - 1);
            displayCurrentImage(); 
        } else {           
            lblImages.setIcon(null);
            lblDescription.setText("");
        }
    }
}

    //edit stamp details
    private void editStamp() {
    if (!ownedImages.isEmpty() && currentIndex >= 0 && currentIndex < ownedImages.size()) {
        String[] currentItem = ownedImages.get(currentIndex);

        //ask user for new details
        String newName = JOptionPane.showInputDialog(this, "Enter a new name for the stamp:", currentItem[0]);
        String newCountry = JOptionPane.showInputDialog(this, "Enter the country of the stamp:", currentItem[2]);
        String newYear = JOptionPane.showInputDialog(this, "Enter the year of the stamp:", currentItem[3]);

        ownedImages.set(currentIndex, new String[]{newName, currentItem[1], newCountry, newYear});

        //save and refresh UI
        saveOwnedImages();
        displayCurrentImage();

        JOptionPane.showMessageDialog(this, "Stamp details updated successfully!");
    } else {
        JOptionPane.showMessageDialog(this, "No stamp selected to edit.");
    }
}

    //save owned images to file
    private void saveOwnedImages() {
    try (BufferedWriter writer = new BufferedWriter(new FileWriter("ownership_" + username + ".txt"))) {
        for (String[] item : ownedImages) {
            writer.write(String.join(",", item));
            writer.newLine();
        }
    } catch (IOException e) {
        JOptionPane.showMessageDialog(this, "Error saving collection.");
    }
}


    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new Ownership(Login.currentUsername).setVisible(true);
        });
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
