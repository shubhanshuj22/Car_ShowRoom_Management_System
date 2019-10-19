
import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class A_CDetails extends javax.swing.JFrame {

    /**
     * Creates new form A_CDetails
     */
    public A_CDetails() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        all = new javax.swing.JRadioButton();
        par = new javax.swing.JRadioButton();
        uid = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Algerian", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 0, 102));
        jLabel1.setText("<HTML><BODY><U>CLIENT DETAILS</U></BODY></HTML>");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(530, 30, 310, 50);

        buttonGroup1.add(all);
        all.setText("ALL");
        all.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                allMouseClicked(evt);
            }
        });
        all.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                allActionPerformed(evt);
            }
        });
        jPanel1.add(all);
        all.setBounds(360, 130, 43, 23);

        buttonGroup1.add(par);
        par.setText("PARTICULAR");
        par.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                parMouseClicked(evt);
            }
        });
        jPanel1.add(par);
        par.setBounds(459, 130, 110, 23);

        uid.setEnabled(false);
        jPanel1.add(uid);
        uid.setBounds(490, 170, 290, 30);

        jLabel2.setFont(new java.awt.Font("Adobe Fan Heiti Std B", 1, 14)); // NOI18N
        jLabel2.setText(" (Give the Client-Id of the particular person)");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(580, 130, 300, 20);

        jTable1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "                          FULL NAME", "                           USER -ID   ", "                           MOBILE NO  ", "                           E-MAIL  ", "                           PASSWORD  ", "                           ADDRESS  "
            }
        ));
        jTable1.setAlignmentX(1.0F);
        jTable1.setAlignmentY(1.0F);
        jTable1.setColumnSelectionAllowed(true);
        jTable1.setEditingRow(0);
        jTable1.setEnabled(false);
        jTable1.setGridColor(new java.awt.Color(102, 102, 102));
        jTable1.setIntercellSpacing(new java.awt.Dimension(3, 3));
        jTable1.setRowSelectionAllowed(false);
        jTable1.setSelectionForeground(new java.awt.Color(153, 153, 153));
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(40, 290, 1300, 360);

        jButton1.setText("VIEW");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(510, 220, 59, 23);

        jLabel3.setText("Enter Client-ID :");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(380, 170, 100, 20);

        jButton2.setText("BACK");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(700, 220, 80, 23);

        jButton3.setText("CLEAR");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(590, 220, 90, 23);

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
                .addGap(0, 2, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void allActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_allActionPerformed
    
    }//GEN-LAST:event_allActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
                this.setVisible(false);
        new Admin().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        uid.setText("");
       DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
       model.setRowCount(0);
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        DefaultTableModel model=(DefaultTableModel)jTable1.getModel();
    
    
      try{
                Class.forName("java.sql.DriverManager");
                Connection con=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/CarDB","root","1919");
                Statement stmt=(Statement) con.createStatement();
                ResultSet rs1;
                //If particular is Selected
                if(par.isSelected()){
                String User=uid.getText();
                String sql1="select * from Clientdb where userid='"+User+"';";
                 rs1=stmt.executeQuery(sql1);
          while(rs1.next())
             {      
                 String UserId=rs1.getString(1);
                 String pass=rs1.getString(2);
                 String fullName=rs1.getString(3);
                 String mNo=rs1.getString(4);
                 String email=rs1.getString(5);
                 String add=rs1.getString(6);
               //Print in table
                 model.addRow(new Object[]{fullName,UserId,mNo,email,pass,add});
       }
                }
                
                //If All is Selected
                else{
                    String sql1="select * from Clientdb;";
                 rs1=stmt.executeQuery(sql1);
          while(rs1.next())
             {      
                 String UserId=rs1.getString(1);
                 String pass=rs1.getString(2);
                 String fullName=rs1.getString(3);
                 String mNo=rs1.getString(4);
                 String email=rs1.getString(5);
                 String add=rs1.getString(6);
               //Print in table
                 model.addRow(new Object[]{fullName,UserId,mNo,email,pass,add});
                
                
       }
                }
                
             //Close Statement
                rs1.close();
                stmt.close();
                con.close();
        }
       
        catch(Exception e){
            System.out.println(e);
        JOptionPane.showMessageDialog(null,e);
        System.exit(0);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void parMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_parMouseClicked
        // TODO add your handling code here:
        uid.setEnabled(true);
    }//GEN-LAST:event_parMouseClicked

    private void allMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_allMouseClicked
        // TODO add your handling code here:
        uid.setText("");
        uid.setEnabled(false);
    }//GEN-LAST:event_allMouseClicked

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
            java.util.logging.Logger.getLogger(A_CDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(A_CDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(A_CDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(A_CDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new A_CDetails().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton all;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JRadioButton par;
    private javax.swing.JTextField uid;
    // End of variables declaration//GEN-END:variables
}
