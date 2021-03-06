/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.me.clinical;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Asim Rana
 */
public class AddUser extends javax.swing.JFrame {

    /**
     * Creates new form AddUser
     */
    public AddUser() {
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
        java.awt.GridBagConstraints gridBagConstraints;

        button = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        Type = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        LName = new javax.swing.JLabel();
        FName = new javax.swing.JTextField();
        AField = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        Gender = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        QLabel = new javax.swing.JLabel();
        QField = new javax.swing.JTextField();
        CLabel = new javax.swing.JLabel();
        CField = new javax.swing.JTextField();
        ELabel = new javax.swing.JLabel();
        EField = new javax.swing.JTextField();
        Submit = new javax.swing.JButton();
        Back = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(290, 150, 0, 0));
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jPanel1.setOpaque(false);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/me/clinical/newpackage/edited.png"))); // NOI18N

        Type.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Type.setForeground(new java.awt.Color(255, 255, 255));
        Type.setText("Type");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Assistant", "Doctor" }));

        LName.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        LName.setForeground(new java.awt.Color(255, 255, 255));
        LName.setText("Name");

        AField.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        AField.setForeground(new java.awt.Color(255, 255, 255));
        AField.setText("Address");

        Gender.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Gender.setForeground(new java.awt.Color(255, 255, 255));
        Gender.setText("Gender");

        button.add(jRadioButton1);
        jRadioButton1.setSelected(true);
        jRadioButton1.setText("Male");

        button.add(jRadioButton2);
        jRadioButton2.setText("Female");

        QLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        QLabel.setForeground(new java.awt.Color(255, 255, 255));
        QLabel.setText("Qualification");

        CLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        CLabel.setForeground(new java.awt.Color(255, 255, 255));
        CLabel.setText("Contact No.");

        ELabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ELabel.setForeground(new java.awt.Color(255, 255, 255));
        ELabel.setText("E-mail");

        Submit.setText("Submit");
        Submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitActionPerformed(evt);
            }
        });

        Back.setText("Back");
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(0, 2, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(167, 167, 167)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Type)
                    .addComponent(LName)
                    .addComponent(AField)
                    .addComponent(QLabel)
                    .addComponent(CLabel)
                    .addComponent(ELabel))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CField, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(QField, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FName, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EField, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53)
                        .addComponent(Gender)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButton2)
                            .addComponent(jRadioButton1))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(Back)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Submit)
                .addGap(201, 201, 201))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Type)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Gender)
                    .addComponent(jRadioButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton2)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LName))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(QField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(AField)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(QLabel)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CLabel)
                            .addComponent(CField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(EField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ELabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Submit)
                    .addComponent(Back))
                .addGap(23, 23, 23))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        getContentPane().add(jPanel1, gridBagConstraints);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/me/clinical/newpackage/editback.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        getContentPane().add(jLabel1, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitActionPerformed
        type = (String)jComboBox1.getSelectedItem();
        name = FName.getText();
        qual = QField.getText();
        contact = CField.getText(); 
        pass = "1234";
        try{
                Class.forName("org.sqlite.JDBC");
		Connection conn = DriverManager.getConnection("jdbc:sqlite:C:\\eclipse\\test.db");
		Statement stmt = conn.createStatement();
                
        
                ResultSet rset = stmt.executeQuery("SELECT MAX(id) FROM User;");
                if(rset.next())
                {
                    id = rset.getInt(1);
                    id = id + 1;
                }
               
                 stmt.executeUpdate("insert into  User Values ("+id+",'"+name+ "','"+ type+ "','"+qual+"','"  + contact+ "');" );
                 stmt.executeUpdate("insert into  Login Values ('"+name+ "','"+ pass+ "','"+type+ "');" );
                
                 
                 JOptionPane.showMessageDialog(null , "User name:    " + name + "\nPassword:    " + pass  + "\nId:    " + id);
                 FName.setText(null);
                 jTextField1.setText(null);
                 QField.setText(null);
                 CField.setText(null);
                 EField.setText(null);
                 rset = stmt.executeQuery("select * from Login");
                 while(rset.next())
                 {
                     System.out.println("Name " + rset.getString("name") + " Password " + rset.getString("password")  + " Type: " + rset.getString("type"));
                     
                 }
                 rset = stmt.executeQuery("select * from User");
                 while(rset.next())
                 {
                     System.out.println("id " + rset.getInt("id") + " Name " + rset.getString("name") + " Type " + rset.getString("type")  + " Qualification: " + rset.getString("qualification") + " Contact " + rset.getString("contact"));
                     
                 }
                 conn.close();
                 stmt.close();
            }
            catch(Throwable e)
            {
                System.out.println(e.getMessage());
            }
    }//GEN-LAST:event_SubmitActionPerformed

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        this.dispose();
        new Admin().setVisible(true);
    }//GEN-LAST:event_BackActionPerformed

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
            java.util.logging.Logger.getLogger(AddUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddUser().setVisible(true);
            }
        });
    }
    int id;
    private String name;
    private String pass;
    private String type;
    private String qual;
    private String contact;
    //private DBConn con;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AField;
    private javax.swing.JButton Back;
    private javax.swing.JTextField CField;
    private javax.swing.JLabel CLabel;
    private javax.swing.JTextField EField;
    private javax.swing.JLabel ELabel;
    private javax.swing.JTextField FName;
    private javax.swing.JLabel Gender;
    private javax.swing.JLabel LName;
    private javax.swing.JTextField QField;
    private javax.swing.JLabel QLabel;
    private javax.swing.JButton Submit;
    private javax.swing.JLabel Type;
    private javax.swing.ButtonGroup button;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
