package StampsProject;

import java.awt.*;
import java.io.*;
import javax.swing.*;

public class ManageStamps extends javax.swing.JFrame {
    private File[] currentImageFiles; //stores image files
    private int currentIndex = 0; //tracks the current image index
    private final String username; //stores the logged in username
    private static final String IMAGE_PATH = "/images/";
    
    public ManageStamps(String username) {
        this.username = username;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        LEFT = new javax.swing.JPanel();
        lblManageStamps = new javax.swing.JLabel();
        lblCategories = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstCategories = new javax.swing.JList<>();
        btnAddToWishlist = new javax.swing.JButton();
        btnAddToCollection = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        RIGHT = new javax.swing.JPanel();
        lblImages = new javax.swing.JLabel();
        btnPrev = new javax.swing.JButton();
        btnNext = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MANAGE STAMPS");
        setPreferredSize(new java.awt.Dimension(800, 500));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 133, 133));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 500));

        LEFT.setBackground(new java.awt.Color(255, 247, 217));
        LEFT.setPreferredSize(new java.awt.Dimension(400, 800));

        lblManageStamps.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lblManageStamps.setForeground(new java.awt.Color(0, 133, 133));
        lblManageStamps.setText("Manage stamps");

        lblCategories.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblCategories.setForeground(new java.awt.Color(0, 133, 133));
        lblCategories.setText("Categories");

        lstCategories.setBackground(new java.awt.Color(255, 247, 217));
        lstCategories.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 2, 2, 0, new java.awt.Color(0, 133, 133)));
        lstCategories.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lstCategories.setForeground(new java.awt.Color(0, 133, 133));
        lstCategories.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Commemorative", "Definitive", "Mint", "Used" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        lstCategories.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstCategoriesValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(lstCategories);

        btnAddToWishlist.setBackground(new java.awt.Color(0, 133, 133));
        btnAddToWishlist.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnAddToWishlist.setForeground(new java.awt.Color(255, 255, 255));
        btnAddToWishlist.setText("ADD TO WISHLIST");
        btnAddToWishlist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddToWishlistActionPerformed(evt);
            }
        });

        btnAddToCollection.setBackground(new java.awt.Color(0, 133, 133));
        btnAddToCollection.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnAddToCollection.setForeground(new java.awt.Color(255, 255, 255));
        btnAddToCollection.setText("ADD TO COLLECTION");
        btnAddToCollection.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddToCollectionActionPerformed(evt);
            }
        });

        btnBack.setBackground(new java.awt.Color(0, 133, 133));
        btnBack.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("BACK TO MAIN MENU");
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
                .addGroup(LEFTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(LEFTLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(LEFTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCategories)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(LEFTLayout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(lblManageStamps))
                    .addGroup(LEFTLayout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addGroup(LEFTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnBack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnAddToCollection, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnAddToWishlist, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        LEFTLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnAddToCollection, btnAddToWishlist, btnBack});

        LEFTLayout.setVerticalGroup(
            LEFTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LEFTLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(lblManageStamps)
                .addGap(18, 18, 18)
                .addComponent(lblCategories)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAddToWishlist, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAddToCollection, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        LEFTLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnAddToCollection, btnAddToWishlist, btnBack});

        RIGHT.setBackground(new java.awt.Color(0, 133, 133));
        RIGHT.setPreferredSize(new java.awt.Dimension(400, 500));

        lblImages.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblImages.setForeground(new java.awt.Color(255, 255, 255));
        lblImages.setText("                          Select a category");
        lblImages.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(242, 112, 94), 1, true));
        lblImages.setPreferredSize(new java.awt.Dimension(200, 150));

        btnPrev.setBackground(new java.awt.Color(252, 251, 240));
        btnPrev.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnPrev.setForeground(new java.awt.Color(0, 133, 133));
        btnPrev.setText("<<Prev");
        btnPrev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrevActionPerformed(evt);
            }
        });

        btnNext.setBackground(new java.awt.Color(252, 251, 240));
        btnNext.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnNext.setForeground(new java.awt.Color(0, 133, 133));
        btnNext.setText("Next>>");
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/search.png"))); // NOI18N

        javax.swing.GroupLayout RIGHTLayout = new javax.swing.GroupLayout(RIGHT);
        RIGHT.setLayout(RIGHTLayout);
        RIGHTLayout.setHorizontalGroup(
            RIGHTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RIGHTLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(RIGHTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(RIGHTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lblImages, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(RIGHTLayout.createSequentialGroup()
                            .addComponent(btnPrev)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnNext))))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        RIGHTLayout.setVerticalGroup(
            RIGHTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RIGHTLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblImages, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(RIGHTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPrev)
                    .addComponent(btnNext, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(123, 123, 123))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(LEFT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(RIGHT, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(LEFT, javax.swing.GroupLayout.DEFAULT_SIZE, 504, Short.MAX_VALUE)
                    .addComponent(RIGHT, javax.swing.GroupLayout.DEFAULT_SIZE, 504, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 810, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 502, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 17, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    //loads images based on selected category
    private void lstCategoriesValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstCategoriesValueChanged
        loadImages(lstCategories.getSelectedValue());
    }//GEN-LAST:event_lstCategoriesValueChanged

    //buttons to navigate through images
    private void btnPrevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrevActionPerformed
        if (currentImageFiles != null && currentImageFiles.length > 0) {
            currentIndex = (currentIndex - 1 + currentImageFiles.length) % currentImageFiles.length;
            displayImage();
        }
    }//GEN-LAST:event_btnPrevActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        if (currentImageFiles != null && currentImageFiles.length > 0) {
            currentIndex = (currentIndex + 1) % currentImageFiles.length;
            displayImage();
        }
    }//GEN-LAST:event_btnNextActionPerformed
    
    //adds selected stamp to wishlist
    private void btnAddToWishlistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddToWishlistActionPerformed
        addToFile("wishlist");
    }//GEN-LAST:event_btnAddToWishlistActionPerformed

    //adds selected stamp to collection
    private void btnAddToCollectionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddToCollectionActionPerformed
        addToFile("ownership");
    }//GEN-LAST:event_btnAddToCollectionActionPerformed

    //back to main menu
    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        new MainMenu(username).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    //loads images based on selected category
    private void loadImages(String category) {
        if (category == null) return;

        java.net.URL dirUrl = getClass().getResource(IMAGE_PATH + category);
        if (dirUrl == null) return;

        File dir = new File(dirUrl.getPath());
        currentImageFiles = dir.listFiles((d, name) -> name.toLowerCase().endsWith(".jpg") || name.toLowerCase().endsWith(".png"));
        currentIndex = (currentImageFiles == null || currentImageFiles.length == 0) ? -1 : 0;

        displayImage();
    }

    //displays the current image
    private void displayImage() {
        if (currentImageFiles == null || currentIndex < 0) {
            lblImages.setText("Image not found!");
            return;
        }

        String category = lstCategories.getSelectedValue();
        java.net.URL imgUrl = getClass().getResource(IMAGE_PATH + category + "/" + currentImageFiles[currentIndex].getName());

        if (imgUrl != null) {
            lblImages.setIcon(new ImageIcon(new ImageIcon(imgUrl).getImage()
                    .getScaledInstance(lblImages.getWidth(), lblImages.getHeight(), Image.SCALE_SMOOTH)));
        } else {
            lblImages.setText("Image not found!");
        }
    }

    //adds the selected current stamp to either wishlist or collection, based on type parameter
    private void addToFile(String type) {
    if (currentImageFiles == null || currentIndex < 0) {
        JOptionPane.showMessageDialog(this, "No image selected!", "Error", JOptionPane.WARNING_MESSAGE);
        return;
    }
  
    File file = new File(type + "_" + username + ".txt"); //dynamic filename
    //writes image to the file
    //data is appended
    try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
        writer.write("Unknown," + currentImageFiles[currentIndex].getAbsolutePath() + ",Unknown,Unknown");
        writer.newLine();
        JOptionPane.showMessageDialog(this, "Stamp added to your " + type + "!", "Success", JOptionPane.INFORMATION_MESSAGE);
    } catch (IOException e) {
        JOptionPane.showMessageDialog(this, "Error saving to " + type + "!", "Error", JOptionPane.ERROR_MESSAGE);
    }
}

    public static void main(String args[]) {
    SwingUtilities.invokeLater(() -> {
        new ManageStamps(Login.currentUsername).setVisible(true);
    });
}
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel LEFT;
    private javax.swing.JPanel RIGHT;
    private javax.swing.JButton btnAddToCollection;
    private javax.swing.JButton btnAddToWishlist;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnPrev;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCategories;
    private javax.swing.JLabel lblImages;
    private javax.swing.JLabel lblManageStamps;
    private javax.swing.JList<String> lstCategories;
    // End of variables declaration//GEN-END:variables
}
