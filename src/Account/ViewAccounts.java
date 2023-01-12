/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Account;

import ConnectionProvider.ConnectionProvider;
import Member.ViewMember;
import Home.Home;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Dell
 */
public class ViewAccounts extends javax.swing.JFrame {

    /**
     * Creates new form ViewAccounts
     */
    public ViewAccounts() {
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

        jPanel2 = new javax.swing.JPanel();
        jScrollPaneTable = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanelSideBar = new javax.swing.JPanel();
        jButtonViewAccount = new javax.swing.JButton();
        jButtonCreateaccount = new javax.swing.JButton();
        jButtonViewmember = new javax.swing.JButton();
        jButtontransactions = new javax.swing.JButton();
        jButtonback = new javax.swing.JButton();
        jButtonclear = new javax.swing.JButton();
        jButtonhome = new javax.swing.JButton();
        jPanelRightSidebar = new javax.swing.JPanel();
        jLabelMemberid = new javax.swing.JLabel();
        jLabelAccountnumber = new javax.swing.JLabel();
        jLabelAccountName = new javax.swing.JLabel();
        jLabelAccounttype = new javax.swing.JLabel();
        jLabelBalance = new javax.swing.JLabel();
        jTextFieldAccountnumber = new javax.swing.JTextField();
        jTextFieldMemberid = new javax.swing.JTextField();
        jTextFieldAccountName = new javax.swing.JTextField();
        jTextFieldBalance = new javax.swing.JTextField();
        jTextFieldAccountype = new javax.swing.JTextField();
        jButtonEdit = new javax.swing.JButton();
        jButtonProceed = new javax.swing.JButton();
        jButtonDrop = new javax.swing.JButton();
        jButtonCance = new javax.swing.JButton();
        jLabelHead = new javax.swing.JLabel();
        jLabelHeader2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableAccount = new javax.swing.JTable();
        jTextFieldSearch = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Member ID", "Account Number", "Account Name", "Account Type", "Balance"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPaneTable.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButtonViewAccount.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jButtonViewAccount.setText("View Accounts");
        jButtonViewAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonViewAccountActionPerformed(evt);
            }
        });

        jButtonCreateaccount.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jButtonCreateaccount.setText("Create Account");
        jButtonCreateaccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCreateaccountActionPerformed(evt);
            }
        });

        jButtonViewmember.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jButtonViewmember.setText("View Members");
        jButtonViewmember.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonViewmemberActionPerformed(evt);
            }
        });

        jButtontransactions.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jButtontransactions.setText("Transactions");
        jButtontransactions.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtontransactionsActionPerformed(evt);
            }
        });

        jButtonback.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jButtonback.setText("Back");
        jButtonback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonbackActionPerformed(evt);
            }
        });

        jButtonclear.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jButtonclear.setText("Clear");
        jButtonclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonclearActionPerformed(evt);
            }
        });

        jButtonhome.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jButtonhome.setText("Home");
        jButtonhome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonhomeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelSideBarLayout = new javax.swing.GroupLayout(jPanelSideBar);
        jPanelSideBar.setLayout(jPanelSideBarLayout);
        jPanelSideBarLayout.setHorizontalGroup(
            jPanelSideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSideBarLayout.createSequentialGroup()
                .addGroup(jPanelSideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonViewAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCreateaccount, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonViewmember, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtontransactions, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonback, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelSideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jButtonhome, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonclear, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanelSideBarLayout.setVerticalGroup(
            jPanelSideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSideBarLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jButtonViewAccount)
                .addGap(53, 53, 53)
                .addComponent(jButtonCreateaccount)
                .addGap(39, 39, 39)
                .addComponent(jButtonViewmember)
                .addGap(40, 40, 40)
                .addComponent(jButtontransactions)
                .addGap(31, 31, 31)
                .addComponent(jButtonclear)
                .addGap(19, 19, 19)
                .addComponent(jButtonhome)
                .addGap(29, 29, 29)
                .addComponent(jButtonback)
                .addContainerGap(134, Short.MAX_VALUE))
        );

        jLabelMemberid.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabelMemberid.setText("Member ID");

        jLabelAccountnumber.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabelAccountnumber.setText("Account Number");

        jLabelAccountName.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabelAccountName.setText("Account Name");

        jLabelAccounttype.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabelAccounttype.setText("Account Type");

        jLabelBalance.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabelBalance.setText("Balance");

        jTextFieldAccountnumber.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N

        jTextFieldMemberid.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N

        jTextFieldAccountName.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jTextFieldAccountName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldAccountNameActionPerformed(evt);
            }
        });

        jTextFieldBalance.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N

        jTextFieldAccountype.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N

        jButtonEdit.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jButtonEdit.setText("Edit");

        jButtonProceed.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jButtonProceed.setText("Proceed");

        jButtonDrop.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jButtonDrop.setText("Drop");

        jButtonCance.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jButtonCance.setText("Cancel");

        javax.swing.GroupLayout jPanelRightSidebarLayout = new javax.swing.GroupLayout(jPanelRightSidebar);
        jPanelRightSidebar.setLayout(jPanelRightSidebarLayout);
        jPanelRightSidebarLayout.setHorizontalGroup(
            jPanelRightSidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRightSidebarLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanelRightSidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelBalance)
                    .addGroup(jPanelRightSidebarLayout.createSequentialGroup()
                        .addComponent(jButtonEdit)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonProceed)
                        .addGap(39, 39, 39)
                        .addComponent(jButtonCance)
                        .addGap(30, 30, 30)
                        .addComponent(jButtonDrop))
                    .addGroup(jPanelRightSidebarLayout.createSequentialGroup()
                        .addGroup(jPanelRightSidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelAccounttype)
                            .addComponent(jLabelAccountName))
                        .addGap(33, 33, 33)
                        .addGroup(jPanelRightSidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldAccountype, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldAccountName, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldBalance, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanelRightSidebarLayout.createSequentialGroup()
                        .addGroup(jPanelRightSidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelAccountnumber)
                            .addComponent(jLabelMemberid))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelRightSidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldAccountnumber, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                            .addComponent(jTextFieldMemberid))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanelRightSidebarLayout.setVerticalGroup(
            jPanelRightSidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRightSidebarLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanelRightSidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelMemberid)
                    .addComponent(jTextFieldMemberid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(69, 69, 69)
                .addGroup(jPanelRightSidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelAccountnumber)
                    .addComponent(jTextFieldAccountnumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(73, 73, 73)
                .addGroup(jPanelRightSidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelAccountName)
                    .addComponent(jTextFieldAccountName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(jPanelRightSidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelAccounttype)
                    .addComponent(jTextFieldAccountype, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(jPanelRightSidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelBalance)
                    .addComponent(jTextFieldBalance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61)
                .addGroup(jPanelRightSidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonEdit)
                    .addComponent(jButtonProceed)
                    .addComponent(jButtonDrop)
                    .addComponent(jButtonCance))
                .addContainerGap(126, Short.MAX_VALUE))
        );

        jLabelHead.setFont(new java.awt.Font("Calibri", 0, 36)); // NOI18N
        jLabelHead.setText("Pashupati Mahila Jibikoparjan Krishi Sahakari Sanstha");

        jLabelHeader2.setFont(new java.awt.Font("Calibri", 0, 36)); // NOI18N
        jLabelHeader2.setText("Accounts");

        jTableAccount.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jTableAccount.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Member ID", "Account Number", "Account Name", "Account Type", "Balance"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableAccount.setAlignmentX(1.0F);
        jTableAccount.setAlignmentY(1.0F);
        jTableAccount.setRowHeight(30);
        jTableAccount.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableAccountMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTableAccount);

        jScrollPane1.setViewportView(jScrollPane2);

        jTextFieldSearch.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jTextFieldSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldSearchKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldSearchKeyReleased(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel1.setText("Search:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jPanelSideBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1279, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanelRightSidebar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabelHeader2)
                        .addGap(940, 940, 940))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabelHead)
                        .addGap(536, 536, 536))))
            .addGroup(layout.createSequentialGroup()
                .addGap(175, 175, 175)
                .addComponent(jLabel1)
                .addGap(60, 60, 60)
                .addComponent(jTextFieldSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelHead)
                .addGap(31, 31, 31)
                .addComponent(jLabelHeader2)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 476, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelSideBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelRightSidebar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonViewmemberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonViewmemberActionPerformed
        // TODO add your handling code here:
        new ViewMember().setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jButtonViewmemberActionPerformed

    private void jButtonclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonclearActionPerformed
        // TODO add your handling code here:
         jTableAccount.setModel(new DefaultTableModel(null,new String [] {
            "Member ID", "Account Number", "Account Name","Account Type", "Balance"
        }));
    }//GEN-LAST:event_jButtonclearActionPerformed

    private void jButtonbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonbackActionPerformed
        // TODO add your handling code here:
        new Member.ViewMember().setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jButtonbackActionPerformed

    private void jTextFieldAccountNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldAccountNameActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jTextFieldAccountNameActionPerformed

    private void jButtonViewAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonViewAccountActionPerformed
        // TODO add your handling code here:
                // TODO add your handling code here:
          //Clearing the table first
                jTableAccount.setModel(new DefaultTableModel(null,new String [] {
            "Member ID", "Account Number", "Account Name","Account Type", "Balance"
        }));       
        ResultSet rs;
           try{
            Connection con= ConnectionProvider.getCon();
           //step3: create sql query and execute it
           String sql="select * from account";
           PreparedStatement st=con.prepareStatement(sql);
           rs=st.executeQuery();
               while (rs.next()) {                   
                   
               
           String Member_id=String.valueOf(rs.getInt("Member_id"));
           String Account_no=String.valueOf(rs.getInt("Account_no"));
           String Account_name=rs.getString("Account_name");
           String Account_type=rs.getString("Account_type");
           String Balance=String.valueOf(rs.getInt("Balance"));
           //
           String table_data[]={Member_id,Account_no,Account_name,Account_type,Balance};
           DefaultTableModel tablemodel=(DefaultTableModel)jTableAccount.getModel();
           tablemodel.addRow(table_data);
               }
          //step4: close the connection
           con.close();
           }
       catch(Exception ex){
            System.out.println(ex);
}
           jTextFieldMemberid.setEditable(false);
           jTextFieldAccountnumber.setEditable(false);
           jTextFieldAccountName.setEditable(false);
           jTextFieldAccountype.setEditable(false);
           jTextFieldBalance.setEditable(false);

    }//GEN-LAST:event_jButtonViewAccountActionPerformed

    private void jTableAccountMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableAccountMouseClicked
        // TODO add your handling code here:
        String[] Accounts=new  String[5];
                    if (evt.getClickCount() == 2) {
                int row = jTableAccount.getSelectedRow();
                        for (int column1 = 0; column1<5 ; column1++) {
                            String data=String.valueOf(jTableAccount.getValueAt(row, column1));
                            Accounts[column1]=data;    
                        }
                     jTextFieldMemberid.setText(Accounts[0]);
                     jTextFieldAccountnumber.setText(Accounts[1]);
                     jTextFieldAccountName.setText(Accounts[2]);
                     jTextFieldAccountype.setText(Accounts[3]);
                     jTextFieldBalance.setText(Accounts[4]);
               // you can play more here to get that cell value and all
            }
    }//GEN-LAST:event_jTableAccountMouseClicked

    private void jButtonCreateaccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCreateaccountActionPerformed
        // TODO add your handling code here:
        new CreateNewAccount().setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jButtonCreateaccountActionPerformed

    private void jButtontransactionsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtontransactionsActionPerformed
        // TODO add your handling code here:
        new Transaction.Deposit().setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jButtontransactionsActionPerformed

    private void jButtonhomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonhomeActionPerformed
        // TODO add your handling code here:
        new Home().setVisible(true);
        setVisible(false);
               
    }//GEN-LAST:event_jButtonhomeActionPerformed

    private void jTextFieldSearchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldSearchKeyPressed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jTextFieldSearchKeyPressed

    private void jTextFieldSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldSearchKeyReleased
        // TODO add your handling code here:
        String search=jTextFieldSearch.getText().toLowerCase();
        DefaultTableModel table=(DefaultTableModel)jTableAccount.getModel();
        TableRowSorter<DefaultTableModel> tr=new TableRowSorter<DefaultTableModel>(table);
        jTableAccount.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(search));
    }//GEN-LAST:event_jTextFieldSearchKeyReleased

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
            java.util.logging.Logger.getLogger(ViewAccounts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewAccounts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewAccounts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewAccounts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewAccounts().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCance;
    private javax.swing.JButton jButtonCreateaccount;
    private javax.swing.JButton jButtonDrop;
    private javax.swing.JButton jButtonEdit;
    private javax.swing.JButton jButtonProceed;
    private javax.swing.JButton jButtonViewAccount;
    private javax.swing.JButton jButtonViewmember;
    private javax.swing.JButton jButtonback;
    private javax.swing.JButton jButtonclear;
    private javax.swing.JButton jButtonhome;
    private javax.swing.JButton jButtontransactions;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelAccountName;
    private javax.swing.JLabel jLabelAccountnumber;
    private javax.swing.JLabel jLabelAccounttype;
    private javax.swing.JLabel jLabelBalance;
    private javax.swing.JLabel jLabelHead;
    private javax.swing.JLabel jLabelHeader2;
    private javax.swing.JLabel jLabelMemberid;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanelRightSidebar;
    private javax.swing.JPanel jPanelSideBar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPaneTable;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTableAccount;
    private javax.swing.JTextField jTextFieldAccountName;
    private javax.swing.JTextField jTextFieldAccountnumber;
    private javax.swing.JTextField jTextFieldAccountype;
    private javax.swing.JTextField jTextFieldBalance;
    private javax.swing.JTextField jTextFieldMemberid;
    private javax.swing.JTextField jTextFieldSearch;
    // End of variables declaration//GEN-END:variables
}