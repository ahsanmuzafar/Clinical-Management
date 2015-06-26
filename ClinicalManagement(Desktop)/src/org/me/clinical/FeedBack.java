/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.me.clinical;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Asim Rana
 */
public class FeedBack extends javax.swing.JFrame {

    /**
     * Creates new form FeedBack
     */
    public FeedBack() {
        initComponents();
        setValues();
    }
     public void setValues()
     {
         try{
                Class.forName("org.sqlite.JDBC");
		Connection conn = DriverManager.getConnection("jdbc:sqlite:C:\\eclipse\\test.db");
		Statement stmt = conn.createStatement();
        
                ResultSet rset = stmt.executeQuery("SELECT * FROM Feedback where question = 'How do you rate our Services';");
                if(rset.next())
                {
                    
                    String ex = rset.getString("excellent");
                    int e = Integer.parseInt(ex);
                    
                    ex = rset.getString("good");
                    int g = Integer.parseInt(ex);
                    
                    ex = rset.getString("satisfactory");
                    int s = Integer.parseInt(ex);
 
                    ex = rset.getString("dknow");
                    int d = Integer.parseInt(ex);
                    
                    setTable(e , g , s , d , 0);
                    
                    
                }
                rset = stmt.executeQuery("SELECT * FROM Feedback where question = 'What are you feeling after visiting this clinic';");
                if(rset.next())
                {
                    
                    String ex = rset.getString("excellent");
                    int e = Integer.parseInt(ex);
                    
                    ex = rset.getString("good");
                    int g = Integer.parseInt(ex);
                    
                    ex = rset.getString("satisfactory");
                    int s = Integer.parseInt(ex);
 
                    ex = rset.getString("dknow");
                    int d = Integer.parseInt(ex);
                    
                    setTable(e , g , s , d , 1);
                    
                    
                }
                
                rset = stmt.executeQuery("SELECT * FROM Feedback where question = 'Is medical staff is helpful';");
                if(rset.next())
                {
                    
                    String ex = rset.getString("excellent");
                    int e = Integer.parseInt(ex);
                    
                    ex = rset.getString("good");
                    int g = Integer.parseInt(ex);
                    
                    ex = rset.getString("satisfactory");
                    int s = Integer.parseInt(ex);
 
                    ex = rset.getString("dknow");
                    int d = Integer.parseInt(ex);
                    
                    setTable(e , g , s , d , 2);
                    
                    
                }
                
                 rset = stmt.executeQuery("SELECT * FROM Feedback where question = 'How do you rate the skills of our doctors';");
                if(rset.next())
                {
                    
                    String ex = rset.getString("excellent");
                    int e = Integer.parseInt(ex);
                    
                    ex = rset.getString("good");
                    int g = Integer.parseInt(ex);
                    
                    ex = rset.getString("satisfactory");
                    int s = Integer.parseInt(ex);
 
                    ex = rset.getString("dknow");
                    int d = Integer.parseInt(ex);
                    
                    setTable(e , g , s , d , 3);
                    
                    
                }
               
                 conn.close();
                 stmt.close();
            }
            catch(Throwable e)
            {
                System.out.println(e.getMessage());
            }
    }
     public void setTable(int e , int g , int s , int d , int i)
     {
           // DefaultTableModel defaultModel = (DefaultTableModel) jTable1.getModel();;
            //defaultModel.addRow(new Object[]{"" , "" , "" , "" , ""});
         
            double sum = e + g + s + d;
            
            double ee = (e / sum) * 100;
            double gg = (g / sum) * 100;
            double ss = (s / sum) * 100;
            double dd = (d / sum) * 100;
           
            e = (int)ee;
            g = (int)gg;
            s = (int)ss;
            d = (int)dd;
            jTable1.setValueAt(e+"%" , i , 1);
            jTable1.setValueAt(g+"%" , i , 2);
            jTable1.setValueAt(s+"%" , i , 3);
            jTable1.setValueAt(d+"%" , i , 4);
     }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(290, 150, 0, 0));
        setMinimumSize(new java.awt.Dimension(708, 428));
        getContentPane().setLayout(null);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/me/clinical/newpackage/edited.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 710, 100);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"How do you rate our Services", null, null, null, null},
                {"What are you feeling after visiting this clinic", null, null, null, null},
                {"Is medical staff is helpful", null, null, null, null},
                {"How do you rate the skills of our doctors", null, null, null, null}
            },
            new String [] {
                "   Question", "    Excellent", "   Good", "  Satisfactory", "  Don't Know"
            }
        ));
        jScrollPane1.setViewportView(jTable1);
        jTable1.getColumnModel().getColumn(0).setPreferredWidth(200);
        jTable1.getColumnModel().getColumn(1).setPreferredWidth(20);
        jTable1.getColumnModel().getColumn(2).setPreferredWidth(15);
        jTable1.getColumnModel().getColumn(3).setPreferredWidth(25);
        jTable1.getColumnModel().getColumn(4).setPreferredWidth(25);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(50, 190, 590, 90);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("FeedBack");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(280, 110, 130, 29);

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(20, 360, 73, 23);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/me/clinical/newpackage/editback.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(-10, 30, 740, 500);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
        new Admin().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(FeedBack.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FeedBack.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FeedBack.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FeedBack.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FeedBack().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
