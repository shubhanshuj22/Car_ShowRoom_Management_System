
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class C_Ordercar extends javax.swing.JFrame {
Var cli=new Var();
    /**
     * Creates new form C_Oredercar
     */
    public C_Ordercar() {
        initComponents();
    }
    void clear(){
      cn.setText("");
      em.setText("");
      mob.setText("");
      idty.setText("");
      cm.setText("");
      cc.setText("");
      datee.setText("");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        yes = new javax.swing.JRadioButton();
        no = new javax.swing.JRadioButton();
        jLabel13 = new javax.swing.JLabel();
        cc = new javax.swing.JTextField();
        mob = new javax.swing.JTextField();
        cn = new javax.swing.JTextField();
        em = new javax.swing.JTextField();
        idty = new javax.swing.JTextField();
        cm = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel14 = new javax.swing.JLabel();
        datee = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Algerian", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 0, 102));
        jLabel1.setText("<HTML><BODY><U>order car </U></BOD Y></HTML>");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(570, 30, 220, 50);

        jButton2.setText("BACK");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(720, 650, 120, 23);

        jLabel6.setFont(new java.awt.Font("Elephant", 0, 18)); // NOI18N
        jLabel6.setText("<HTML><BODY><U>CUSTOMER DETAILS</U></BODY></HTML>");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(480, 120, 226, 23);

        jLabel2.setFont(new java.awt.Font("Tekton Pro Ext", 0, 14)); // NOI18N
        jLabel2.setText("CUSTOMER NAME");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(400, 180, 139, 20);

        jLabel3.setFont(new java.awt.Font("Tekton Pro Ext", 0, 14)); // NOI18N
        jLabel3.setText("MOBILE NO.");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(450, 260, 91, 15);

        jLabel9.setFont(new java.awt.Font("Tekton Pro Ext", 0, 14)); // NOI18N
        jLabel9.setText("E-MAIL");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(480, 220, 55, 20);

        jLabel8.setFont(new java.awt.Font("Tekton Pro Ext", 0, 14)); // NOI18N
        jLabel8.setText("ADHAR CARD NO.");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(410, 300, 150, 30);

        jLabel7.setFont(new java.awt.Font("Elephant", 0, 18)); // NOI18N
        jLabel7.setText("<HTML><BODY><U>CAR DETAILS</U></BODY></HTML>");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(540, 370, 146, 23);

        jLabel10.setFont(new java.awt.Font("Tekton Pro Ext", 0, 14)); // NOI18N
        jLabel10.setText("CAR MODEL");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(440, 420, 100, 20);

        jLabel11.setFont(new java.awt.Font("Tekton Pro Ext", 0, 14)); // NOI18N
        jLabel11.setText("CAR COLOR");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(440, 470, 110, 20);

        jLabel12.setFont(new java.awt.Font("Tekton Pro Ext", 0, 14)); // NOI18N
        jLabel12.setText(" EXTRA CAR  ACCESORIES");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(350, 570, 230, 20);

        buttonGroup2.add(yes);
        yes.setText("YES");
        jPanel1.add(yes);
        yes.setBounds(610, 570, 60, 23);

        buttonGroup2.add(no);
        no.setText("NO");
        no.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noActionPerformed(evt);
            }
        });
        jPanel1.add(no);
        no.setBounds(680, 570, 50, 23);

        jLabel13.setFont(new java.awt.Font("Sitka Text", 0, 12)); // NOI18N
        jLabel13.setText("\"YYYY/MM/DD\" formate only");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(780, 520, 170, 20);
        jPanel1.add(cc);
        cc.setBounds(610, 460, 150, 30);
        jPanel1.add(mob);
        mob.setBounds(600, 260, 150, 30);
        jPanel1.add(cn);
        cn.setBounds(600, 180, 150, 30);
        jPanel1.add(em);
        em.setBounds(600, 220, 150, 30);
        jPanel1.add(idty);
        idty.setBounds(600, 300, 150, 30);

        cm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmActionPerformed(evt);
            }
        });
        jPanel1.add(cm);
        cm.setBounds(610, 410, 150, 30);

        jButton3.setText("OREDER NOW");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(540, 650, 150, 23);

        jSeparator2.setForeground(new java.awt.Color(51, 0, 102));
        jPanel1.add(jSeparator2);
        jSeparator2.setBounds(290, 350, 620, 20);

        jLabel14.setFont(new java.awt.Font("Tekton Pro Ext", 0, 14)); // NOI18N
        jLabel14.setText("Date of Order");
        jPanel1.add(jLabel14);
        jLabel14.setBounds(420, 520, 140, 20);
        jPanel1.add(datee);
        datee.setBounds(610, 510, 150, 30);

        jLabel15.setFont(new java.awt.Font("Sitka Text", 0, 12)); // NOI18N
        jLabel15.setText("(If you are selecting YES as EXTRA CAR ACCESORIES than you have to pay extra for it)");
        jPanel1.add(jLabel15);
        jLabel15.setBounds(390, 600, 490, 20);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1448, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 752, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void noActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_noActionPerformed

    private void cmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
                this.setVisible(false);
        new Client().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        //Input for all
        String name=cn.getText();
        String email=em.getText();
        String mno=mob.getText();
        String adhno=idty.getText();
        String model=cm.getText();
        String colour=cc.getText();
        String date=datee.getText();
        String eca=null;
        if(yes.isSelected())
            eca="YES";
        else
            eca="No";
        //Check Null values
        if(name.equals("")||email.equals("")||mno.equals("")||adhno.equals("")||model.equals("")||colour.equals("")||eca.equals("")){
        JOptionPane.showMessageDialog(rootPane,"Fill all the details");
        }
        //Check Weather option is choose or not for ECA
        else if(!yes.isSelected()&&!no.isSelected()){
        JOptionPane.showMessageDialog(rootPane,"Choose Any one option in ECA");
        }
        //Input in database
        else{
         try{
                Class.forName("java.sql.DriverManager");
                Connection con=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/CarDB","root","1919");
                Statement stmt=(Statement) con.createStatement();
                //Query for admin table
               String sql1="insert into admin_cus_order values('"+cli.User_id+"','"+name+"','"+email+"','"+mno+"','"+adhno+"','"+model+"','"+colour+"','"+date+"','"+eca+"');";
               stmt.executeUpdate(sql1);
               
            
               //Query for client table 
            
               String sql2="insert into "+cli.User_id+"ordertbl values('"+name+"','"+email+"','"+mno+"','"+adhno+"','"+model+"','"+colour+"','"+date+"','"+eca+"');";
               stmt.executeUpdate(sql2);
               JOptionPane.showMessageDialog(rootPane, "Order Details Saved successfully");
               clear();
               
                stmt.close();
                con.close();
        }
       
        catch(Exception e){
        JOptionPane.showMessageDialog(null,e);
        clear();
       // System.exit(0);
        }
         
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
            java.util.logging.Logger.getLogger(C_Ordercar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(C_Ordercar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(C_Ordercar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(C_Ordercar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new C_Ordercar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JTextField cc;
    private javax.swing.JTextField cm;
    private javax.swing.JTextField cn;
    private javax.swing.JTextField datee;
    private javax.swing.JTextField em;
    private javax.swing.JTextField idty;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField mob;
    private javax.swing.JRadioButton no;
    private javax.swing.JRadioButton yes;
    // End of variables declaration//GEN-END:variables
}
