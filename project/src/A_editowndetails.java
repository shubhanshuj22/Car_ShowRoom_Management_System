
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class A_editowndetails extends javax.swing.JFrame {
 Var nn=new Var();
   
    public A_editowndetails() {
        initComponents();
       
    }
@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        uid = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        cnp = new javax.swing.JPasswordField();
        cp = new javax.swing.JPasswordField();
        np = new javax.swing.JPasswordField();
        jCheckBox1 = new javax.swing.JCheckBox();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Algerian", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 0, 102));
        jLabel1.setText("<HTML><BODY><U>edit admin's details</U></BOD Y></HTML>");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(530, 10, 430, 50);

        jButton1.setText("UPDATE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(630, 390, 90, 23);

        jButton2.setText("BACK");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(790, 390, 90, 23);

        jLabel12.setFont(new java.awt.Font("Tekton Pro Ext", 1, 14)); // NOI18N
        jLabel12.setText("User ID :");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(470, 140, 146, 23);

        uid.setEnabled(false);
        jPanel1.add(uid);
        uid.setBounds(680, 140, 258, 30);

        jLabel13.setFont(new java.awt.Font("Tekton Pro Ext", 1, 14)); // NOI18N
        jLabel13.setText("Current Password :");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(470, 180, 146, 23);

        jLabel11.setFont(new java.awt.Font("Tekton Pro Ext", 1, 14)); // NOI18N
        jLabel11.setText("New Password :");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(470, 280, 146, 23);

        jLabel14.setFont(new java.awt.Font("Tekton Pro Ext", 1, 14)); // NOI18N
        jLabel14.setText("Confirm Password :");
        jPanel1.add(jLabel14);
        jLabel14.setBounds(470, 320, 200, 23);

        cnp.setEnabled(false);
        jPanel1.add(cnp);
        cnp.setBounds(680, 320, 260, 30);

        cp.setEnabled(false);
        jPanel1.add(cp);
        cp.setBounds(680, 180, 260, 30);

        np.setEnabled(false);
        jPanel1.add(np);
        np.setBounds(680, 280, 260, 30);

        jCheckBox1.setFont(new java.awt.Font("Adobe Caslon Pro", 0, 14)); // NOI18N
        jCheckBox1.setText(" Change Password");
        jCheckBox1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCheckBox1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jCheckBox1MouseEntered(evt);
            }
        });
        jPanel1.add(jCheckBox1);
        jCheckBox1.setBounds(680, 240, 160, 23);

        jButton3.setText("Current Details");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(470, 83, 470, 40);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1448, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 730, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
                this.setVisible(false);
        new Admin().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jCheckBox1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBox1MouseClicked
        // TODO add your handling code here:
        if(jCheckBox1.isSelected()){
            
        np.setEnabled(true);
        cnp.setEnabled(true);
        }
        else{
        np.setEnabled(false);
        cnp.setEnabled(false);
        }
    }//GEN-LAST:event_jCheckBox1MouseClicked

    private void jCheckBox1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBox1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox1MouseEntered

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        try{   
                Class.forName("java.sql.DriverManager");
                Connection con=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/CarDB","root","1919");
                Statement stmt=(Statement) con.createStatement();
                if(!jCheckBox1.isSelected()){
                JOptionPane.showMessageDialog(rootPane,"Click Check Box To Update ");
                }
                else{
                    String newP=null,cNewP=null;
                    
               if(jCheckBox1.isSelected()){
               newP=np.getText();
               cNewP=cnp.getText();
               if(newP.equals(null)){
               JOptionPane.showMessageDialog(rootPane,"You can't leave New password field empty !");
               }
               else if(!cNewP.equals(newP)){
               JOptionPane.showMessageDialog(rootPane, "Both password should be same !");
               np.setText("");
               cnp.setText("");
               }
               else{
              String sql1="update admindb set password='"+newP+"' where userid='"+uid.getText()+"';";  
               stmt.executeUpdate(sql1);
                       JOptionPane.showMessageDialog(rootPane, "Updated successfully");
               }
               }
                //Clear Password Change field
              np.setText("");
             cnp.setText("");
                 stmt.close();
                con.close();
        }
        }
       
        catch(Exception e){
        JOptionPane.showMessageDialog(null,e);
        System.exit(0);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        
        try{   
                Class.forName("java.sql.DriverManager");
                Connection con=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/CarDB","root","1919");
                Statement stmt=(Statement) con.createStatement();
                 String sql1="select * from admindb where userid='"+nn.User_id+"';";
                 ResultSet rs1=stmt.executeQuery(sql1);
          while(rs1.next())
             {      
                 uid.setText(rs1.getString(1));
                 cp.setText(rs1.getString(2));
             }
                rs1.close();
                stmt.close();
                con.close();
        }
       
        catch(Exception e){
        JOptionPane.showMessageDialog(null,e);
        System.exit(0);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(A_editowndetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(A_editowndetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(A_editowndetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(A_editowndetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new A_editowndetails().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField cnp;
    private javax.swing.JPasswordField cp;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField np;
    private javax.swing.JTextField uid;
    // End of variables declaration//GEN-END:variables
}
