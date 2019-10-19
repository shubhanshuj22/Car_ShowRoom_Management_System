
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class C_Editowndetails extends javax.swing.JFrame {
Var Glb=new Var();
    /**
     * Creates new form C_Editowndetails
     */
    public C_Editowndetails() {
        initComponents();
    }
   void clear(){
   name.setText("");
   uid.setText("");
   mno.setText("");
   email.setText("");
   pass.setText("");
   cpass.setText("");
   add.setText("");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        uid = new javax.swing.JTextField();
        Opass = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        mno = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cpass = new javax.swing.JPasswordField();
        jLabel8 = new javax.swing.JLabel();
        add = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        pass = new javax.swing.JPasswordField();
        jLabel11 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Algerian", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 0, 102));
        jLabel1.setText("<HTML><BODY><U>edit client's details</U></BOD Y></HTML>");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(540, 10, 430, 50);

        uid.setEnabled(false);
        jPanel1.add(uid);
        uid.setBounds(710, 210, 258, 30);

        Opass.setEnabled(false);
        jPanel1.add(Opass);
        Opass.setBounds(710, 250, 258, 30);

        jButton1.setText("UPDATE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(710, 580, 90, 40);

        jButton2.setText("BACK");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(870, 580, 100, 40);

        jLabel2.setFont(new java.awt.Font("Tekton Pro Ext", 1, 14)); // NOI18N
        jLabel2.setText("Full Name :");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(510, 330, 146, 23);
        jPanel1.add(name);
        name.setBounds(710, 330, 258, 30);

        jLabel4.setFont(new java.awt.Font("Tekton Pro Ext", 1, 14)); // NOI18N
        jLabel4.setText("Mobile No. :");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(510, 370, 146, 23);
        jPanel1.add(mno);
        mno.setBounds(710, 370, 258, 30);

        jLabel6.setFont(new java.awt.Font("Tekton Pro Ext", 1, 14)); // NOI18N
        jLabel6.setText("Email :");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(510, 410, 146, 23);
        jPanel1.add(email);
        email.setBounds(710, 410, 258, 30);

        jLabel5.setFont(new java.awt.Font("Tekton Pro Ext", 1, 14)); // NOI18N
        jLabel5.setText("New Password :");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(510, 450, 150, 23);

        jLabel7.setFont(new java.awt.Font("Tekton Pro Ext", 1, 14)); // NOI18N
        jLabel7.setText("Confirm Password :");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(510, 490, 160, 20);

        cpass.setEnabled(false);
        jPanel1.add(cpass);
        cpass.setBounds(710, 490, 258, 30);

        jLabel8.setFont(new java.awt.Font("Tekton Pro Ext", 1, 14)); // NOI18N
        jLabel8.setText("Address :");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(510, 530, 146, 23);
        jPanel1.add(add);
        add.setBounds(710, 530, 258, 30);

        jLabel10.setFont(new java.awt.Font("Tekton Pro Ext", 0, 14)); // NOI18N
        jLabel10.setText("User ID :");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(510, 210, 140, 30);

        jLabel15.setFont(new java.awt.Font("Tekton Pro Ext", 0, 14)); // NOI18N
        jLabel15.setText("Password :");
        jPanel1.add(jLabel15);
        jLabel15.setBounds(510, 250, 160, 30);

        pass.setEnabled(false);
        jPanel1.add(pass);
        pass.setBounds(710, 450, 258, 30);

        jLabel11.setFont(new java.awt.Font("Californian FB", 1, 24)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Change Your Details To Update");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(490, 90, 350, 28);

        jCheckBox1.setText("Change Password");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jCheckBox1);
        jCheckBox1.setBounds(710, 290, 150, 23);

        jButton3.setText("Check Current Details");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(500, 140, 470, 40);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1448, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 730, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new Client().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
        if(jCheckBox1.isSelected()){
        pass.setEnabled(true);
        cpass.setEnabled(true);
        }
        else
        {       
             pass.setText("");
   cpass.setText("");
                pass.setEnabled(false);
        cpass.setEnabled(false);

        }
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         String namev=name.getText();
        String uidv=uid.getText();
        String mnov=mno.getText();
        String emailv=email.getText();
        String passv=pass.getText();
        String cpassv=cpass.getText();
        String addv=add.getText();
  
     
        int index1 = emailv.indexOf('@');
        int index2 = emailv.indexOf('.');
         //Check No details is empty
        if(namev.equals("")||uidv.equals("")||mnov.equals("")||addv.equals("")||emailv.equals("")){
            JOptionPane.showMessageDialog(rootPane,"You can't leave any Field Empty","Alert",JOptionPane.WARNING_MESSAGE);
        }
        //check email is valid or not
        else if(index1==-1||index2==-1){
            JOptionPane.showMessageDialog(rootPane,"Invalid Email Id !!");
            email.setText("");
        }
            //check password and confirmed password
      

        else
        //Connection With DATABASE
        try{
            Class.forName("java.sql.DriverManager");
            Connection con=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/CarDB","root","1919");
            Statement stmt=(Statement) con.createStatement();
            String sql1="update clientdb set password='"+passv+"',fullname='"+namev+"',mobileno='"+mnov+"',email='"+emailv+"',Address='"+addv+"' where userid='"+uidv+"';";
            String sql2="update clientdb set fullname='"+namev+"',mobileno='"+mnov+"',email='"+emailv+"',Address='"+addv+"' where userid='"+uidv+"';";
               //if user want to change password
            if(jCheckBox1.isSelected()){
               //Check Password Field is not Null
               if(passv.equals("")){
               JOptionPane.showMessageDialog(rootPane,"Please Fill the password field");
               }
               //Check Both passwords are equal or not
               else if(passv.equals(cpassv)==false){
            JOptionPane.showMessageDialog(rootPane, "Password and Confirmed Password are not matched !!");
            pass.setText("");
            cpass.setText("");
        }
               else{
            stmt.executeUpdate(sql1);
            JOptionPane.showMessageDialog(null,"Details updated successfully");
               
               }
           }
            //If user dont want to change password
            else{
            stmt.executeUpdate(sql2);
            JOptionPane.showMessageDialog(null,"Details updated successfully");
            }
            stmt.close();
            con.close();
            clear();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
            clear();
           // System.exit(0);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        clear();
         try{
            Class.forName("java.sql.DriverManager");
            Connection con=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/CarDB","root","1919");
            Statement stmt=(Statement) con.createStatement();
            String sql="select * from clientdb where userid='"+Glb.User_id+"';";
            ResultSet rs1=stmt.executeQuery(sql);
            //Print details
            while(rs1.next())
             {      
             uid.setText(rs1.getString(1));
             Opass.setText(rs1.getString(2));
             name.setText(rs1.getString(3));
             mno.setText(rs1.getString(4));
             email.setText(rs1.getString(5));
             add.setText(rs1.getString(6));
             }
            //Close statement
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
            java.util.logging.Logger.getLogger(C_Editowndetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(C_Editowndetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(C_Editowndetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(C_Editowndetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new C_Editowndetails().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField Opass;
    private javax.swing.JTextField add;
    private javax.swing.JPasswordField cpass;
    private javax.swing.JTextField email;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField mno;
    private javax.swing.JTextField name;
    private javax.swing.JPasswordField pass;
    private javax.swing.JTextField uid;
    // End of variables declaration//GEN-END:variables
}
