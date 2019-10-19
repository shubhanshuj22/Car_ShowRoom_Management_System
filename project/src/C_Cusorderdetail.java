
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class C_Cusorderdetail extends javax.swing.JFrame {
Var cli=new Var();
    /**
     * Creates new form C_Cusorderdetail
     */
    public C_Cusorderdetail() {
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
        mob = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Algerian", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 0, 102));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("<HTML><BODY><U>customer Order DETAILS</U></BODY></HTML>");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(500, 30, 600, 50);

        buttonGroup1.add(all);
        all.setText("ALL");
        all.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                allActionPerformed(evt);
            }
        });
        jPanel1.add(all);
        all.setBounds(363, 140, 80, 23);

        buttonGroup1.add(par);
        par.setText("PARTICULAR CUSTOMER");
        par.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                parActionPerformed(evt);
            }
        });
        jPanel1.add(par);
        par.setBounds(360, 170, 180, 23);

        mob.setEnabled(false);
        mob.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mobActionPerformed(evt);
            }
        });
        jPanel1.add(mob);
        mob.setBounds(640, 160, 210, 30);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CUSTOMER NAME ", " E-MAIL", "MOBILE NO", "ADHAR CARD NO", "CAR MODEL", "CAR COLOUR", "ACCESSORIES"
            }
        ));
        jTable1.setIntercellSpacing(new java.awt.Dimension(3, 3));
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(50, 330, 1280, 190);

        jButton1.setText("VIEW");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(650, 260, 90, 23);

        jLabel3.setFont(new java.awt.Font("Adobe Fan Heiti Std B", 1, 14)); // NOI18N
        jLabel3.setText(" (Give the MOBILE NO of the particular CUSTOMER)");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(880, 170, 360, 20);

        jLabel4.setText("MOBILE NO.");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(550, 160, 80, 30);

        jButton2.setText("CLEAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(750, 260, 100, 23);

        jButton4.setText("BACK");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(860, 260, 90, 23);

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

    private void mobActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mobActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mobActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        mob.setText("");
         DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
       model.setRowCount(0);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new Client().setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         DefaultTableModel model=(DefaultTableModel)jTable1.getModel();
    
       model.setRowCount(0);
    
      try{
                Class.forName("java.sql.DriverManager");
                Connection con=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/CarDB","root","1919");
                Statement stmt=(Statement) con.createStatement();
                ResultSet rs1;
                
                //If particular customer is Selected
                if(par.isSelected()){
                             String mobv=mob.getText();
                  //Check Weather input is null or not
                             if(mobv.equals(""))
                                 JOptionPane.showMessageDialog(rootPane,"please input mobile no of customer");
                             
                    String sql1="select * from  "+cli.User_id+"ordertbl where mobileno='"+mobv+"';";
                 rs1=stmt.executeQuery(sql1);
         while(rs1.next())
             {      
                 String custname=rs1.getString(1);
                 String email=rs1.getString(2);
                 String mNo=rs1.getString(3);
                 String adhno=rs1.getString(4);
                 String carmodel=rs1.getString(5);
                 String colour=rs1.getString(6);
                 String date=rs1.getString(7);
                 String eca=rs1.getString(8);
               //Print in table
                 model.addRow(new Object[]{custname,email,mNo,adhno,carmodel,colour,date,eca});
       }
                }
                
                //If All is Selected
               else{
                String sql1="select * from  "+cli.User_id+"ordertbl;";
                 rs1=stmt.executeQuery(sql1);
          while(rs1.next())
             {      
                 String custname=rs1.getString(1);
                 String email=rs1.getString(2);
                 String mNo=rs1.getString(3);
                 String adhno=rs1.getString(4);
                 String carmodel=rs1.getString(5);
                 String colour=rs1.getString(6);
                 String date=rs1.getString(7);
                 String eca=rs1.getString(8);
               //Print in table
                 model.addRow(new Object[]{custname,email,mNo,adhno,carmodel,colour,date,eca});
       }
                }
             //Close Statement
                rs1.close();
                stmt.close();
                con.close();
        }
       
        catch(Exception e){
        JOptionPane.showMessageDialog(null,e);
        System.exit(0);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void parActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_parActionPerformed
        // TODO add your handling code here:
        if(par.isSelected())
            mob.setEnabled(true);
    }//GEN-LAST:event_parActionPerformed

    private void allActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_allActionPerformed
        // TODO add your handling code here:
        if(all.isSelected()){
            mob.setEnabled(false);
        mob.setText("");
        }
    }//GEN-LAST:event_allActionPerformed

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
            java.util.logging.Logger.getLogger(C_Cusorderdetail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(C_Cusorderdetail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(C_Cusorderdetail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(C_Cusorderdetail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new C_Cusorderdetail().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton all;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField mob;
    private javax.swing.JRadioButton par;
    // End of variables declaration//GEN-END:variables
}
