
import java.awt.event.ActionEvent;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.awt.event.ActionListener;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author user
 */
public class HospitalRegister extends javax.swing.JFrame {

    /**
     * Creates new form HospitalRegister
     */
    public HospitalRegister() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField_USER = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextField_HNAME = new javax.swing.JTextField();
        jTextField_BG = new javax.swing.JTextField();
        jTextField_CONTACT = new javax.swing.JTextField();
        jTextField_EMAIL = new javax.swing.JTextField();
        jTextField_ADDRESS = new javax.swing.JTextField();
        jButton1_Hregister = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPasswordField_PASS = new javax.swing.JPasswordField();
        jPasswordField_REPASS = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(248, 148, 6));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Hospital Registration");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("X");
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("-");
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addGap(17, 17, 17))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addGap(0, 4, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(44, 62, 80));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Hospital Name:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Blood Group:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Contact Information:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Mobile no.:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Username:");

        jTextField_USER.setBackground(new java.awt.Color(108, 122, 137));
        jTextField_USER.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField_USER.setForeground(new java.awt.Color(228, 241, 254));
        jTextField_USER.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_USERActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Address:");

        jTextField_HNAME.setBackground(new java.awt.Color(108, 122, 137));
        jTextField_HNAME.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField_HNAME.setForeground(new java.awt.Color(228, 241, 254));
        jTextField_HNAME.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_HNAMEActionPerformed(evt);
            }
        });

        jTextField_BG.setBackground(new java.awt.Color(108, 122, 137));
        jTextField_BG.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField_BG.setForeground(new java.awt.Color(228, 241, 254));
        jTextField_BG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_BGActionPerformed(evt);
            }
        });

        jTextField_CONTACT.setBackground(new java.awt.Color(108, 122, 137));
        jTextField_CONTACT.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField_CONTACT.setForeground(new java.awt.Color(228, 241, 254));
        jTextField_CONTACT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_CONTACTActionPerformed(evt);
            }
        });

        jTextField_EMAIL.setBackground(new java.awt.Color(108, 122, 137));
        jTextField_EMAIL.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField_EMAIL.setForeground(new java.awt.Color(228, 241, 254));
        jTextField_EMAIL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_EMAILActionPerformed(evt);
            }
        });

        jTextField_ADDRESS.setBackground(new java.awt.Color(108, 122, 137));
        jTextField_ADDRESS.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField_ADDRESS.setForeground(new java.awt.Color(228, 241, 254));
        jTextField_ADDRESS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_ADDRESSActionPerformed(evt);
            }
        });

        jButton1_Hregister.setBackground(new java.awt.Color(34, 167, 240));
        jButton1_Hregister.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1_Hregister.setForeground(new java.awt.Color(255, 255, 255));
        jButton1_Hregister.setText("Register");
        jButton1_Hregister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1_HregisterActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(192, 57, 43));
        jButton2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Cancel");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("email-id:");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Password:");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Re-type Pass:");

        jPasswordField_PASS.setBackground(new java.awt.Color(108, 122, 137));

        jPasswordField_REPASS.setBackground(new java.awt.Color(108, 122, 137));
        jPasswordField_REPASS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField_REPASSActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextField_CONTACT, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextField_EMAIL, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField_HNAME, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField_BG, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(13, 13, 13)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(74, 74, 74)
                                        .addComponent(jButton2)
                                        .addGap(43, 43, 43)
                                        .addComponent(jButton1_Hregister)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jTextField_ADDRESS, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jLabel4)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel12))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jPasswordField_REPASS, javax.swing.GroupLayout.DEFAULT_SIZE, 292, Short.MAX_VALUE)
                                    .addComponent(jPasswordField_PASS)
                                    .addComponent(jTextField_USER))))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel8)
                            .addGap(332, 332, 332))))
                .addContainerGap(66, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel2)
                        .addGap(24, 24, 24))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jTextField_HNAME, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField_BG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField_CONTACT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jTextField_EMAIL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jTextField_USER, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jPasswordField_PASS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jPasswordField_REPASS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jTextField_ADDRESS, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1_Hregister)
                            .addComponent(jButton2))
                        .addGap(37, 37, 37))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField_HNAMEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_HNAMEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_HNAMEActionPerformed

    private void jTextField_BGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_BGActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_BGActionPerformed

    private void jTextField_CONTACTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_CONTACTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_CONTACTActionPerformed

    private void jTextField_EMAILActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_EMAILActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_EMAILActionPerformed

    private void jTextField_ADDRESSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_ADDRESSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_ADDRESSActionPerformed

    private void jButton1_HregisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_HregisterActionPerformed
       
        int idhospital = 0;
        String hname = jTextField_HNAME.getText();
        String bg = jTextField_BG.getText();
        String contact = jTextField_CONTACT.getText();
        String email = jTextField_EMAIL.getText();
        String username = jTextField_USER.getText();
        String pass = jPasswordField_PASS.getText();
        String repass = jPasswordField_REPASS.getText();
        String address = jTextField_ADDRESS.getText();
        
         if(username.equals(""))
      {
         JOptionPane.showMessageDialog(null, "Add a username");
      }
      
      else if(pass.equals(""))
      {
         JOptionPane.showMessageDialog(null, "Add a password");
      }
      
      else if(!pass.equals(repass))
      {
         JOptionPane.showMessageDialog(null, "Re-Type password again");
      }
      
      else if(checkUsername(username))
      {
         JOptionPane.showMessageDialog(null, "This username already exists");
      }
      else
      {
        PreparedStatement st;
        String query;
        query = "INSERT INTO `loginregister`.`hospital`\n" +
"(`idhospital`,\n" +
"`hname`,\n" +
"`bg`,\n" +
"`contact`,\n" +
"`email`,\n" +
"`username`,\n" +
"`pass`,\n" +
"`repass`,\n" +
"`address`)\n" +
"VALUES\n" +
"(?,\n" +
"?,\n" +
"?,\n" +
"?,\n" +
"?,\n" +
"?,\n" +
"?,\n" +
"?,\n" +
"?);";
        try{
        st = MyConnection.getConnection().prepareStatement(query);
            
            st.setInt(1, idhospital);
            st.setString(2, hname);
            st.setString(3, bg);
            st.setString(4, contact);
            st.setString(5, email);
            st.setString(6, username);
            st.setString(7, pass);
            st.setString(8, repass);
            st.setString(9, address);
            
            
            if(st.executeUpdate()>0)
            {
                JOptionPane.showMessageDialog(null, "Thanks for registering!");
            }
        }catch(SQLException ex){
        java.util.logging.Logger.getLogger(HospitalRegister.class.getName()).log(Level.SEVERE, null, ex);
        }
        
      } 
    }//GEN-LAST:event_jButton1_HregisterActionPerformed
public boolean checkUsername(String username)
    {
     PreparedStatement st;
     ResultSet rs;
     boolean checkUser = false;
     
     String query="SELECT * FROM loginregister.hospital WHERE 'usernsme' =? ";
        try {
            st = MyConnection.getConnection().prepareStatement(query);
            st.setString(1, username);
            rs =st.executeQuery();
            if(rs.next())
            {
                checkUser = true;
            }
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(HospitalRegister.class.getName()).log(Level.SEVERE, null, ex);
        }
        return checkUser;
    }
    
    
    /**/
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         Home h=new Home();
        h.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked

       System.exit(0);
       
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jPasswordField_REPASSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField_REPASSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField_REPASSActionPerformed

    private void jTextField_USERActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_USERActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_USERActionPerformed

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
            java.util.logging.Logger.getLogger(HospitalRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HospitalRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HospitalRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HospitalRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HospitalRegister().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1_Hregister;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jPasswordField_PASS;
    private javax.swing.JPasswordField jPasswordField_REPASS;
    private javax.swing.JTextField jTextField_ADDRESS;
    private javax.swing.JTextField jTextField_BG;
    private javax.swing.JTextField jTextField_CONTACT;
    private javax.swing.JTextField jTextField_EMAIL;
    private javax.swing.JTextField jTextField_HNAME;
    private javax.swing.JTextField jTextField_USER;
    // End of variables declaration//GEN-END:variables
}