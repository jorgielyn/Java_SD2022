/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author iranjo_sd2022
 */
public class JaddMedAdmin extends javax.swing.JFrame {

    /**
     * Creates new form JaddMedAdmin
     */
    public JaddMedAdmin() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        allergy = new javax.swing.JButton();
        bodypain = new javax.swing.JButton();
        headache = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        addname = new javax.swing.JTextField();
        addbrand = new javax.swing.JTextField();
        addgene = new javax.swing.JTextField();
        addquan = new javax.swing.JTextField();
        addmed = new javax.swing.JButton();
        addprice = new javax.swing.JTextField();
        addcategory = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        updatemed = new javax.swing.JButton();
        deletemed = new javax.swing.JButton();
        viewmed = new javax.swing.JButton();

        allergy.setBackground(new java.awt.Color(51, 255, 51));
        allergy.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        allergy.setText("ALLERGY");
        allergy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                allergyActionPerformed(evt);
            }
        });

        bodypain.setBackground(new java.awt.Color(51, 255, 51));
        bodypain.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        bodypain.setText("BODY PAIN");
        bodypain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bodypainActionPerformed(evt);
            }
        });

        headache.setBackground(new java.awt.Color(51, 255, 51));
        headache.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        headache.setText("HEADACHE");
        headache.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                headacheActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 204, 255));
        jLabel1.setText("MEDICINEapp PHARMACIST SIDE");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel2.setText("Brand Name:");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel3.setText("Generic name:");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel4.setText("Price:");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel5.setText("Quantity:");

        addmed.setBackground(new java.awt.Color(51, 255, 51));
        addmed.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        addmed.setText("ADD MEDICINE");
        addmed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addmedActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel6.setText("Name:");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel7.setText("Category:");

        updatemed.setBackground(new java.awt.Color(204, 255, 204));
        updatemed.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        updatemed.setText("UPDATE MEDICINE");
        updatemed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatemedActionPerformed(evt);
            }
        });

        deletemed.setBackground(new java.awt.Color(255, 102, 102));
        deletemed.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        deletemed.setText("DELETE MEDICINE");
        deletemed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletemedActionPerformed(evt);
            }
        });

        viewmed.setBackground(new java.awt.Color(204, 255, 255));
        viewmed.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        viewmed.setText("VIEW MEDICINE");
        viewmed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewmedActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel7))
                    .addComponent(jLabel2)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addname)
                    .addComponent(addbrand)
                    .addComponent(addgene)
                    .addComponent(addquan)
                    .addComponent(addprice)
                    .addComponent(addcategory))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(49, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(65, 65, 65))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(viewmed)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(deletemed)
                        .addGap(18, 18, 18)
                        .addComponent(updatemed)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(addmed)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addname, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addbrand, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addgene, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(addquan, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addprice, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addcategory, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addmed)
                    .addComponent(updatemed)
                    .addComponent(deletemed)
                    .addComponent(viewmed))
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addmedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addmedActionPerformed
        // TODO add your handling code here:
        try {
            // create a mysql database connection
            String myDriver = "org.gjt.mm.mysql.Driver";
            String myUrl = "jdbc:mysql://localhost/iran_medicine";
            Class.forName(myDriver);
            Connection conn = DriverManager.getConnection(myUrl, "root", "");

            // the mysql insert statement
            //to encrypt password use MD5 beside the value to be inserted
            String query = " insert into medicines (name,brandname,genericname,quantity,price,category)"
                    + " values (?,?,?,?,?,?)";

            // create the mysql insert preparedstatement
            PreparedStatement preparedStmt = conn.prepareStatement(query);
            preparedStmt.setString(1, addname.getText());
            preparedStmt.setString(2, addbrand.getText());
            preparedStmt.setString(3, addgene.getText());
            preparedStmt.setString(4, addquan.getText());
            preparedStmt.setString(5, addprice.getText());
            preparedStmt.setString(6, addcategory.getText());

            // execute the preparedstatement
            preparedStmt.execute();
            JOptionPane.showMessageDialog(null, "Data added");
            conn.close();
        } catch (Exception e) {
            System.err.println("Got an exception!");
            JOptionPane.showMessageDialog(null, "No Data added");
            System.err.println(e.getMessage());
        }

    }//GEN-LAST:event_addmedActionPerformed
//NOTHING TO DO HERE!ALL ARE UNNECESSARY...
    private void headacheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_headacheActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_headacheActionPerformed

    private void bodypainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bodypainActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bodypainActionPerformed

    private void allergyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_allergyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_allergyActionPerformed

    private void updatemedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatemedActionPerformed
        // TODO add your handling code here:
//          try {
//            // create a mysql database connection
//            String myDriver = "org.gjt.mm.mysql.Driver";
//            String myUrl = "jdbc:mysql://localhost/iran_medicine";
//            Class.forName(myDriver);
//            Connection conn = DriverManager.getConnection(myUrl, "root", "");
//
//            // the mysql insert statement
//            //to encrypt password use MD5 beside the value to be inserted
//            String query = " update medicines (name,brandname,genericname,quantity,price,category)"
//                    + " values (?,?,?,?,?,?)";
//
//            // create the mysql insert preparedstatement
//            PreparedStatement preparedStmt = conn.prepareStatement(query);
//            preparedStmt.setString(1, addname.getText());
//            preparedStmt.setString(2, addbrand.getText());
//            preparedStmt.setString(3, addgene.getText());
//            preparedStmt.setString(4, addquan.getText());
//            preparedStmt.setString(5, addprice.getText());
//            preparedStmt.setString(6, addcategory.getText());
//
//            // execute the preparedstatement
//            preparedStmt.execute();
//            JOptionPane.showMessageDialog(null, "Data added");
//            conn.close();
//        } catch (Exception e) {
//            System.err.println("Got an exception!");
//            JOptionPane.showMessageDialog(null, "No Data added");
//            System.err.println(e.getMessage());
//        }
    }//GEN-LAST:event_updatemedActionPerformed

    private void deletemedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletemedActionPerformed
        // TODO add your handling code here:
      
        

//         try {
//            Class.forName("com.mysql.jdbc.Driver");
//            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/jframe", "root", "");
//            Statement stmt = con.createStatement();
//            //ResultSet rs = stmt.executeQuery("SELECT * FROM `medicine` WHERE brandname='" + brandname + "'"); // only choose the medicine inputted from the view
//            String sql = "DELETE FROM medicines WHERE name='" + name + "'"; // query here   
//            stmt.executeUpdate(sql); // delete the medicine you've inputted earlier
//            
//            con.close();
//        } catch (ClassNotFoundException | SQLException e) {
//            JOptionPane.showMessageDialog(null, "Error connecting to database!");
//        }
//       
    }//GEN-LAST:event_deletemedActionPerformed

    private void viewmedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewmedActionPerformed
        // TODO add your handling code here:
        new storage().setVisible(true);
    }//GEN-LAST:event_viewmedActionPerformed

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
            java.util.logging.Logger.getLogger(JaddMedAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JaddMedAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JaddMedAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JaddMedAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JaddMedAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addbrand;
    private javax.swing.JTextField addcategory;
    private javax.swing.JTextField addgene;
    private javax.swing.JButton addmed;
    private javax.swing.JTextField addname;
    private javax.swing.JTextField addprice;
    private javax.swing.JTextField addquan;
    private javax.swing.JButton allergy;
    private javax.swing.JButton bodypain;
    private javax.swing.JButton deletemed;
    private javax.swing.JButton headache;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JButton updatemed;
    private javax.swing.JButton viewmed;
    // End of variables declaration//GEN-END:variables
}
