/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Report;

import Account.ViewAccounts;
import Account.Viewtransactions;
import ConnectionProvider.ConnectionProvider;
import Loan.IssueLoan;
import Loan.RepaymentOfLoan;
import Loan.Viewloans;
import Member.ViewMember;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author USER
 */
public class Funds extends javax.swing.JFrame {

    /**
     * Creates new form Funds
     */
    public Funds() {
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

        jTextFieldFunds = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jButtonCreateaccount = new javax.swing.JButton();
        jButtonRepayment = new javax.swing.JButton();
        jButtonViewLoans = new javax.swing.JButton();
        jButtonViewmember = new javax.swing.JButton();
        jButtonViewAccount = new javax.swing.JButton();
        jButtonTransactions = new javax.swing.JButton();
        jButtonFunds = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableTransactions = new javax.swing.JTable();
        jDateChooserTransactionDateFrom = new com.toedter.calendar.JDateChooser();
        jLabelViewBydate = new javax.swing.JLabel();
        jButtonViewTransactionBydate = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jDateChooserTransactionDateTo = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextFieldFunds.setEditable(false);
        jTextFieldFunds.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N

        jButtonCreateaccount.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jButtonCreateaccount.setText("Issue Loan");
        jButtonCreateaccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCreateaccountActionPerformed(evt);
            }
        });

        jButtonRepayment.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jButtonRepayment.setText("Repayment of Loan");
        jButtonRepayment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRepaymentActionPerformed(evt);
            }
        });

        jButtonViewLoans.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jButtonViewLoans.setText("View Loans");
        jButtonViewLoans.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonViewLoansActionPerformed(evt);
            }
        });

        jButtonViewmember.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jButtonViewmember.setText("View Members");
        jButtonViewmember.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonViewmemberActionPerformed(evt);
            }
        });

        jButtonViewAccount.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jButtonViewAccount.setText("View Accounts");
        jButtonViewAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonViewAccountActionPerformed(evt);
            }
        });

        jButtonTransactions.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jButtonTransactions.setText("Transactions");
        jButtonTransactions.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTransactionsActionPerformed(evt);
            }
        });

        jButtonFunds.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jButtonFunds.setText("View Funds Available");
        jButtonFunds.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFundsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jButtonRepayment, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonCreateaccount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonFunds, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE))
                .addContainerGap(32, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jButtonViewLoans, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
                        .addComponent(jButtonViewmember, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
                        .addComponent(jButtonViewAccount, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
                        .addComponent(jButtonTransactions, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE))
                    .addContainerGap(32, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jButtonFunds, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonCreateaccount)
                .addGap(30, 30, 30)
                .addComponent(jButtonRepayment)
                .addContainerGap(334, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(200, 200, 200)
                    .addComponent(jButtonViewLoans)
                    .addGap(31, 31, 31)
                    .addComponent(jButtonViewmember)
                    .addGap(36, 36, 36)
                    .addComponent(jButtonViewAccount)
                    .addGap(27, 27, 27)
                    .addComponent(jButtonTransactions)
                    .addContainerGap(94, Short.MAX_VALUE)))
        );

        jTableTransactions.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jTableTransactions.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Transaction ID", "Date", "Particulars", "Debit Amount", "Credit Amount", "Balance"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableTransactions.setRowHeight(30);
        jTableTransactions.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTableTransactions);

        jDateChooserTransactionDateFrom.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N

        jLabelViewBydate.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabelViewBydate.setText("View Transaction by Date:");

        jButtonViewTransactionBydate.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jButtonViewTransactionBydate.setText("View");
        jButtonViewTransactionBydate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonViewTransactionBydateActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel1.setText("Funds Available in Office:");

        jLabel2.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel2.setText("            To");

        jDateChooserTransactionDateTo.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelViewBydate)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldFunds)
                            .addComponent(jDateChooserTransactionDateFrom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jDateChooserTransactionDateTo, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(100, 100, 100))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jButtonViewTransactionBydate)
                                .addGap(175, 175, 175))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(177, 177, 177)))))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1080, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 482, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextFieldFunds, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1))
                                .addGap(47, 47, 47)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabelViewBydate, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                                    .addComponent(jDateChooserTransactionDateFrom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(jDateChooserTransactionDateTo, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addComponent(jButtonViewTransactionBydate)))))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonFundsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFundsActionPerformed
        //clear table    
             Connection con= ConnectionProvider.getCon();

        ResultSet rs;
           try{
           
//           step3: create sql query and execute it
           String sql="SELECT SUM(Balance)  as Totalbalance FROM Account;";
           PreparedStatement st=con.prepareStatement(sql);
           rs=st.executeQuery();
               if (rs.next()) {
                String funds=rs.getString("Totalbalance");
                jTextFieldFunds.setText(funds);
               }
 
               
          //step4: close the connection
           con.close();
           }
       catch(Exception ex){
            System.out.println(ex);
}
    }//GEN-LAST:event_jButtonFundsActionPerformed

    private void jButtonCreateaccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCreateaccountActionPerformed
        // TODO add your handling code here:
        new IssueLoan().setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jButtonCreateaccountActionPerformed

    private void jButtonRepaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRepaymentActionPerformed
        // TODO add your handling code here:
        new RepaymentOfLoan().setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jButtonRepaymentActionPerformed

    private void jButtonViewLoansActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonViewLoansActionPerformed
        // TODO add your handling code here:
        new Viewloans().setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jButtonViewLoansActionPerformed

    private void jButtonViewmemberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonViewmemberActionPerformed
        // TODO add your handling code here:
        new ViewMember().setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jButtonViewmemberActionPerformed

    private void jButtonViewAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonViewAccountActionPerformed
        // TODO add your handling code here:
        new ViewAccounts().setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jButtonViewAccountActionPerformed

    private void jButtonTransactionsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTransactionsActionPerformed
        // TODO add your handling code here:
        new Viewtransactions().setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jButtonTransactionsActionPerformed

    private void jButtonViewTransactionBydateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonViewTransactionBydateActionPerformed
        // TODO add your handling code here:
        //clear table    
        jTableTransactions.setModel(new DefaultTableModel(null,new String [] {
            "Transaction ID", "Date", "Particulars","Debit Amount","Credit Amount","Balance"
        }));
        Connection con= ConnectionProvider.getCon();
        ResultSet rs;
        ResultSet rs1;
        SimpleDateFormat SDF=new SimpleDateFormat("yyyy-MM-dd");
        String TransactionDateFrom=SDF.format(jDateChooserTransactionDateFrom.getDate());
        String TransactionDateTo=SDF.format(jDateChooserTransactionDateTo.getDate());
           try{
          
//           step3: create sql query and execute it
           
                    String sql1="select * from Transaction where Date Between ? and ?";
                    PreparedStatement st1=con.prepareStatement(sql1);
                    st1.setString(1, TransactionDateFrom);
                    st1.setString(2, TransactionDateTo);
                    rs1=st1.executeQuery();
                    int Amount_balance=0;
                    while (rs1.next()) {

                        String Member_id=String.valueOf(rs1.getInt("Member_id"));
                        String Account_num=String.valueOf(rs1.getInt("Account_no"));
                        String Account_name=rs1.getString("Account_name");
                        String Transactionid=String.valueOf(rs1.getInt("Transaction_id"));
                        int Amount_retrived=rs1.getInt("Amount");
                        String Amount=String.valueOf(rs1.getInt("Amount"));
                        System.out.print(Amount);
                        String Particulars=rs1.getString("Transacted_by")+" "+rs1.getString("Remarks");
                        String Transactiondate=String.valueOf(rs1.getDate("datetime"));
                        String Transaction_type=rs1.getString("Transaction_type");
                         if (Transaction_type.equalsIgnoreCase("Deposit")) {
                             Amount_balance=Amount_balance+Amount_retrived;
                             String Amount_balancetotable=String.valueOf(Amount_balance);
                        String table_data[]={Transactionid,Transactiondate,Particulars,"",Amount,Amount_balancetotable};
                        DefaultTableModel tablemodel=(DefaultTableModel)jTableTransactions.getModel();
                        tablemodel.addRow(table_data);
                        }
                         else if (Transaction_type.equalsIgnoreCase("Withdraw")) {
                        Amount_balance=Amount_balance-Amount_retrived;
                          String Amount_balancetotable=String.valueOf(Amount_balance);
                        String table_data[]={Transactionid,Transactiondate,Particulars,Amount,"",Amount_balancetotable};
                        DefaultTableModel tablemodel=(DefaultTableModel)jTableTransactions.getModel();
                        tablemodel.addRow(table_data);
                        }
                    }


                        
                       
              
               
          //step4: close the connection
           con.close();
           }
       catch(Exception ex){
            System.out.println(ex);
}
    }//GEN-LAST:event_jButtonViewTransactionBydateActionPerformed

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
            java.util.logging.Logger.getLogger(Funds.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Funds.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Funds.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Funds.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Funds().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCreateaccount;
    private javax.swing.JButton jButtonFunds;
    private javax.swing.JButton jButtonRepayment;
    private javax.swing.JButton jButtonTransactions;
    private javax.swing.JButton jButtonViewAccount;
    private javax.swing.JButton jButtonViewLoans;
    private javax.swing.JButton jButtonViewTransactionBydate;
    private javax.swing.JButton jButtonViewmember;
    private com.toedter.calendar.JDateChooser jDateChooserTransactionDateFrom;
    private com.toedter.calendar.JDateChooser jDateChooserTransactionDateTo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelViewBydate;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableTransactions;
    private javax.swing.JTextField jTextFieldFunds;
    // End of variables declaration//GEN-END:variables
}