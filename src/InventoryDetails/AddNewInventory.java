/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InventoryDetails;

import ConnectionProvider.ConnectionProvider;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Types;
import javax.swing.JOptionPane;

/**
 *
 * @author Dell
 */
public class AddNewInventory extends javax.swing.JFrame {

    /**
     * Creates new form AddNewInventory
     */
    public AddNewInventory() {
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

        jInventory = new javax.swing.JLabel();
        jAddNewInventory = new javax.swing.JLabel();
        jInventoryID = new javax.swing.JLabel();
        jInventoryName = new javax.swing.JLabel();
        jInventoryType = new javax.swing.JLabel();
        jSupplierID = new javax.swing.JLabel();
        jSupplierName = new javax.swing.JLabel();
        jQuantity = new javax.swing.JLabel();
        jRate = new javax.swing.JLabel();
        jTotal = new javax.swing.JLabel();
        jTextFieldInventoryid = new javax.swing.JTextField();
        jTextFieldInventoryName = new javax.swing.JTextField();
        jTextFieldSupplierID = new javax.swing.JTextField();
        jTextFieldCash = new javax.swing.JTextField();
        jTextFieldSupplierName = new javax.swing.JTextField();
        jTextFieldQuantity = new javax.swing.JTextField();
        jTextFieldRate = new javax.swing.JTextField();
        jTextFieldTotal = new javax.swing.JTextField();
        jCash = new javax.swing.JLabel();
        jComboBoxInventoryType = new javax.swing.JComboBox<>();
        jButtonProceed = new javax.swing.JButton();
        jButtonClear = new javax.swing.JButton();
        jButtonBack = new javax.swing.JButton();
        jTextFieldCredit = new javax.swing.JTextField();
        jCredit = new javax.swing.JLabel();
        jTextFieldinvalidinventoryno = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jInventory.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jInventory.setText("Inventory");

        jAddNewInventory.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jAddNewInventory.setText("Add Inventory");

        jInventoryID.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jInventoryID.setText("Inventory ID");

        jInventoryName.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jInventoryName.setText("Inventory Name");

        jInventoryType.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jInventoryType.setText("Inventory Type");

        jSupplierID.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jSupplierID.setText("Supplier ID");

        jSupplierName.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jSupplierName.setText("Supplier Name");

        jQuantity.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jQuantity.setText("Quantity");

        jRate.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jRate.setText("Rate");

        jTotal.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jTotal.setText("Total");

        jTextFieldInventoryid.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jTextFieldInventoryid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldInventoryidActionPerformed(evt);
            }
        });
        jTextFieldInventoryid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldInventoryidKeyPressed(evt);
            }
        });

        jTextFieldInventoryName.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N

        jTextFieldSupplierID.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jTextFieldSupplierID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldSupplierIDKeyPressed(evt);
            }
        });

        jTextFieldCash.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jTextFieldCash.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCashActionPerformed(evt);
            }
        });
        jTextFieldCash.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldCashKeyPressed(evt);
            }
        });

        jTextFieldSupplierName.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N

        jTextFieldQuantity.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jTextFieldQuantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldQuantityActionPerformed(evt);
            }
        });
        jTextFieldQuantity.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldQuantityKeyPressed(evt);
            }
        });

        jTextFieldRate.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jTextFieldRate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldRateActionPerformed(evt);
            }
        });
        jTextFieldRate.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldRateKeyPressed(evt);
            }
        });

        jTextFieldTotal.setEditable(false);
        jTextFieldTotal.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jTextFieldTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldTotalActionPerformed(evt);
            }
        });

        jCash.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jCash.setText("Cash");

        jComboBoxInventoryType.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jComboBoxInventoryType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Organic Fertilizer", "Chemical Fertilizer", "Pesticide and Insecticide", "Vegetable Seeds","Crop Seeds","Agriculture Tools","Machine and Equipments","Others"}));

        jButtonProceed.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jButtonProceed.setText("Proceed");
        jButtonProceed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonProceedActionPerformed(evt);
            }
        });

        jButtonClear.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jButtonClear.setText("Clear");
        jButtonClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonClearActionPerformed(evt);
            }
        });

        jButtonBack.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jButtonBack.setText("Back");
        jButtonBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBackActionPerformed(evt);
            }
        });

        jTextFieldCredit.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jTextFieldCredit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCreditActionPerformed(evt);
            }
        });

        jCredit.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jCredit.setText("Credit");

        jTextFieldinvalidinventoryno.setEditable(false);
        jTextFieldinvalidinventoryno.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jTextFieldinvalidinventoryno.setBorder(null);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButtonProceed)
                                .addGap(70, 70, 70)
                                .addComponent(jButtonClear)
                                .addGap(81, 81, 81)
                                .addComponent(jButtonBack))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jInventoryName)
                                        .addComponent(jInventoryID, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jInventoryType, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addComponent(jSupplierID)
                                    .addComponent(jSupplierName)
                                    .addComponent(jQuantity)
                                    .addComponent(jRate)
                                    .addComponent(jTotal)
                                    .addComponent(jCash)
                                    .addComponent(jCredit))
                                .addGap(95, 95, 95)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextFieldSupplierID, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                    .addComponent(jTextFieldInventoryName, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                    .addComponent(jTextFieldInventoryid, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                    .addComponent(jTextFieldCash, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                    .addComponent(jTextFieldSupplierName, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                    .addComponent(jTextFieldQuantity, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                    .addComponent(jTextFieldRate, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                    .addComponent(jTextFieldTotal, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                    .addComponent(jTextFieldCredit, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                    .addComponent(jComboBoxInventoryType, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(54, 54, 54)
                                .addComponent(jTextFieldinvalidinventoryno, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(197, 197, 197)
                        .addComponent(jAddNewInventory))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(223, 223, 223)
                        .addComponent(jInventory)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jInventory)
                .addGap(26, 26, 26)
                .addComponent(jAddNewInventory)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jInventoryID)
                    .addComponent(jTextFieldInventoryid, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldinvalidinventoryno, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jInventoryName)
                    .addComponent(jTextFieldInventoryName, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jInventoryType)
                    .addComponent(jComboBoxInventoryType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSupplierID)
                    .addComponent(jTextFieldSupplierID, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSupplierName)
                    .addComponent(jTextFieldSupplierName, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jQuantity)
                    .addComponent(jTextFieldQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldRate, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRate))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTotal))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldCash, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCash))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldCredit, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCredit))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonProceed)
                    .addComponent(jButtonClear)
                    .addComponent(jButtonBack))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldInventoryidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldInventoryidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldInventoryidActionPerformed

    private void jTextFieldQuantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldQuantityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldQuantityActionPerformed

    private void jTextFieldTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldTotalActionPerformed
        // in total
//         Double Inventory_rate=Double.parseDouble(jTextFieldRate.getText());
//         Integer Inventory_quantity=Integer.parseInt(jTextFieldQuantity.getText());
//         jTextFieldTotal.setText(String.valueOf(Inventory_rate*Inventory_quantity));
    }//GEN-LAST:event_jTextFieldTotalActionPerformed

    private void jTextFieldCashActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCashActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCashActionPerformed

    private void jButtonClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonClearActionPerformed
        // TODO add your handling code here:
        jTextFieldCash.setText(null);
        jTextFieldCredit.setText(null);
        jTextFieldInventoryName.setText(null);
        jTextFieldInventoryid.setText(null);
        jTextFieldQuantity.setText(null);
        jTextFieldRate.setText(null);
        jTextFieldSupplierID.setText(null);
        jTextFieldSupplierName.setText(null);
        jTextFieldTotal.setText(null);
        jTextFieldinvalidinventoryno.setText(null);
    }//GEN-LAST:event_jButtonClearActionPerformed

    private void jButtonBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBackActionPerformed
        //Back TO inventory
        new Inventory().setVisible(true);
        setVisible(false);
        
    }//GEN-LAST:event_jButtonBackActionPerformed

    private void jButtonProceedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonProceedActionPerformed
        //Adding Inventory
        int Inventory_id=Integer.parseInt(jTextFieldInventoryid.getText());
        String Inventory_name=jTextFieldInventoryName.getText();
        String Inventory_type=String.valueOf(jComboBoxInventoryType.getSelectedItem());
        Integer Supplier_id=Integer.parseInt(jTextFieldSupplierID.getText());
        String Supplier_name=jTextFieldSupplierName.getText();
        Integer Inventory_quantity=Integer.parseInt(jTextFieldQuantity.getText());
        Double Inventory_rate=Double.parseDouble(jTextFieldRate.getText());
        Double Inventory_total=Double.parseDouble(jTextFieldTotal.getText());
        Double Inventory_cash=Double.parseDouble(jTextFieldCash.getText());
        Double Inventory_credit=Double.parseDouble(jTextFieldCredit.getText());
             Connection con= ConnectionProvider.getCon();
        ResultSet rs;
           try{

           //step3: create sql query and execute it
          String sql="insert into add_inventory(Inventory_id,Inventory_name,Inventory_type,Supplier_id,Supplier_name,Inventory_quantity,Inventory_rate,Inventory_total,Inventory_cash,Inventory_credit)values(?,?,?,?,?,?,?,?,?,?)";
           PreparedStatement st=con.prepareStatement(sql);
           st.setInt(1, Inventory_id);
           st.setString(2, Inventory_name);
           st.setString(3, Inventory_type);
           st.setInt(4,Supplier_id);
           st.setString(5,Supplier_name);
           st.setInt(6, Inventory_quantity);
           st.setDouble(7, Inventory_rate);
           st.setDouble(8, Inventory_total);
           st.setDouble(9, Inventory_cash);
           st.setDouble(10, Inventory_credit);
           st.execute();
           String sql2="select Quantity from inventory where Inventory_id="+Inventory_id;
           int Quantity=0;
           PreparedStatement st2=con.prepareStatement(sql2);
           rs=st2.executeQuery();
           while(rs.next()){
               Quantity=rs.getInt("Quantity");
           }
           Quantity=Quantity+Inventory_quantity;
           st2.execute();
           String sql3="Update inventory set Quantity=? where Inventory_id=?";
//           String sql3="Update inventory set Quantity="+ Quantity + "where Inventory_id="+Inventory_id;
           PreparedStatement st4=con.prepareStatement(sql3);
           st4.setInt(1, Quantity);
           st4.setInt(2,Inventory_id);
           st4.executeUpdate();
          //step4: close the connection
           con.close();
               JOptionPane.showMessageDialog(rootPane, "Sucessfully Added.");
           }
       catch(Exception ex){
            System.out.println(ex);
}
           try {
        jTextFieldCash.setText(null);
        jTextFieldCredit.setText(null);
        jTextFieldInventoryName.setText(null);
        jTextFieldInventoryid.setText(null);
        jTextFieldQuantity.setText(null);
        jTextFieldRate.setText(null);
        jTextFieldSupplierID.setText(null);
        jTextFieldSupplierName.setText(null);
        jTextFieldTotal.setText(null);
        jTextFieldinvalidinventoryno.setText(null);
        } catch (Exception e) {
        }

    }//GEN-LAST:event_jButtonProceedActionPerformed

    private void jTextFieldRateKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldRateKeyPressed
        // TODO add your handling code here:
        
             try {
             char c=evt.getKeyChar();
        if (Character.isDigit(c)|| evt.getKeyCode()==KeyEvent.VK_BACK_SPACE ||
                evt.getKeyCode()==KeyEvent.VK_DELETE||evt.getKeyCode() == KeyEvent.VK_ENTER || 
                evt.getKeyCode() == KeyEvent.VK_DOWN || evt.getKeyCode() == KeyEvent.VK_RIGHT|| 
                evt.getKeyCode()==KeyEvent.VK_DECIMAL) {
            jTextFieldRate.setEditable(true);
        }
        else{
            jTextFieldRate.setEditable(false);
        }
        } catch (Exception e) {
        }
        
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            int total_quantity=Integer.parseInt(jTextFieldQuantity.getText());
            double rate=Double.parseDouble(jTextFieldRate.getText());
            double total=0;
            total=total_quantity*rate;
            jTextFieldTotal.setText(String.valueOf(total));    
        }
        if (evt.getKeyCode() == KeyEvent.VK_ENTER || evt.getKeyCode() == KeyEvent.VK_DOWN ) {
            jTextFieldCash.requestFocus();
            
        }
    }//GEN-LAST:event_jTextFieldRateKeyPressed

    private void jTextFieldRateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldRateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldRateActionPerformed

    private void jTextFieldCashKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldCashKeyPressed

        // TODO add your handling code here:
         try {
             char c=evt.getKeyChar();
        if (Character.isDigit(c)|| evt.getKeyCode()==KeyEvent.VK_BACK_SPACE ||
                evt.getKeyCode()==KeyEvent.VK_DELETE||evt.getKeyCode() == KeyEvent.VK_ENTER || 
                evt.getKeyCode() == KeyEvent.VK_DOWN || evt.getKeyCode() == KeyEvent.VK_RIGHT|| 
                evt.getKeyCode()==KeyEvent.VK_DECIMAL) {
            jTextFieldCash.setEditable(true);
        }
        else{
            jTextFieldCash.setEditable(false);
        }
        } catch (Exception e) {
        }
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
        double cash=Double.parseDouble(jTextFieldCash.getText());
        double total=Double.parseDouble(jTextFieldTotal.getText());
        double credit=0;
        credit=total-cash;
        jTextFieldCredit.setText(String.valueOf(credit));
        jTextFieldCredit.setEditable(false);
        }
    }//GEN-LAST:event_jTextFieldCashKeyPressed

    private void jTextFieldInventoryidKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldInventoryidKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER || evt.getKeyCode() == KeyEvent.VK_DOWN || evt.getKeyCode() == KeyEvent.VK_RIGHT) {
        String Inventory_id=(jTextFieldInventoryid.getText());

             Connection con= ConnectionProvider.getCon();
        ResultSet rs = null;
       
           try{
           con.setAutoCommit(false);

           //step3: create sql query and execute it
           String sql="select Inventory_id,Inventory_name,Inventory_type from Inventory where Inventory_id="+Inventory_id;
           PreparedStatement st=con.prepareStatement(sql);
           rs=st.executeQuery();
           String s1=String.valueOf(rs);
               if(rs.wasNull()) {
                   jTextFieldinvalidinventoryno.setText("Invalid Inventory id.");
               }

               else{
               while(rs.next()){
               String Inventory_name=rs.getString("Inventory_name");
               String Inventory_type=rs.getString("Inventory_type");
               Object obj=Inventory_type;
               jTextFieldInventoryName.setText(Inventory_name);
               jComboBoxInventoryType.setSelectedItem(obj);
           }
               }
          //step4: close the connection
           con.commit();

           con.close();
           }
       catch(Exception ex){
           try{
              con.rollback();
           }catch(Exception e){
               JOptionPane.showMessageDialog(rootPane,"Invalid Inventory id.");
           }
       }
       jTextFieldSupplierID.requestFocus();
      }
    }//GEN-LAST:event_jTextFieldInventoryidKeyPressed

    private void jTextFieldSupplierIDKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldSupplierIDKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER || evt.getKeyCode() == KeyEvent.VK_DOWN || evt.getKeyCode() == KeyEvent.VK_RIGHT) {
        int Supplier_id=Integer.parseInt(jTextFieldSupplierID.getText());
         Connection con= ConnectionProvider.getCon();
        ResultSet rs = null;

           try{

           con.setAutoCommit(false);

           //step3: create sql query and execute it
           String sql="select Supplier_id,Supplier_Name from Supplier where Supplier_id="+Supplier_id;
           PreparedStatement st=con.prepareStatement(sql);
           rs=st.executeQuery();
           String s1=String.valueOf(rs);
               if(rs.wasNull()) {
                   jTextFieldinvalidinventoryno.setText("Invalid Supplier id.");
               }
               else{
               while(rs.next()){
               String Supplier_name=rs.getString("Supplier_Name");
               jTextFieldSupplierName.setText(Supplier_name);
           }
               }
          //step4: close the connection
           con.commit();

           con.close();
           }
       catch(Exception ex){
           try{
              con.rollback();
           }catch(Exception e){
               JOptionPane.showMessageDialog(rootPane,"Invalid Supplier id.");
           }
       }
        jTextFieldQuantity.requestFocus();
      }
    }//GEN-LAST:event_jTextFieldSupplierIDKeyPressed

    private void jTextFieldQuantityKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldQuantityKeyPressed
        // TODO add your handling code here:
               try {
             char c=evt.getKeyChar();
        if (Character.isDigit(c)|| evt.getKeyCode()==KeyEvent.VK_BACK_SPACE ||
                evt.getKeyCode()==KeyEvent.VK_DELETE||evt.getKeyCode() == KeyEvent.VK_ENTER || 
                evt.getKeyCode() == KeyEvent.VK_DOWN || evt.getKeyCode() == KeyEvent.VK_RIGHT|| 
                evt.getKeyCode()==KeyEvent.VK_DECIMAL) {
                jTextFieldQuantity.setEditable(true);
        }
        else{
            jTextFieldQuantity.setEditable(false);
        }
        } catch (Exception e) {
        }
               if (evt.getKeyCode() == KeyEvent.VK_ENTER ) {
             jTextFieldRate.requestFocus();
        }
       
    }//GEN-LAST:event_jTextFieldQuantityKeyPressed

    private void jTextFieldCreditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCreditActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCreditActionPerformed

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
            java.util.logging.Logger.getLogger(AddNewInventory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddNewInventory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddNewInventory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddNewInventory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddNewInventory().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jAddNewInventory;
    private javax.swing.JButton jButtonBack;
    private javax.swing.JButton jButtonClear;
    private javax.swing.JButton jButtonProceed;
    private javax.swing.JLabel jCash;
    private javax.swing.JComboBox<String> jComboBoxInventoryType;
    private javax.swing.JLabel jCredit;
    private javax.swing.JLabel jInventory;
    private javax.swing.JLabel jInventoryID;
    private javax.swing.JLabel jInventoryName;
    private javax.swing.JLabel jInventoryType;
    private javax.swing.JLabel jQuantity;
    private javax.swing.JLabel jRate;
    private javax.swing.JLabel jSupplierID;
    private javax.swing.JLabel jSupplierName;
    private javax.swing.JTextField jTextFieldCash;
    private javax.swing.JTextField jTextFieldCredit;
    private javax.swing.JTextField jTextFieldInventoryName;
    private javax.swing.JTextField jTextFieldInventoryid;
    private javax.swing.JTextField jTextFieldQuantity;
    private javax.swing.JTextField jTextFieldRate;
    private javax.swing.JTextField jTextFieldSupplierID;
    private javax.swing.JTextField jTextFieldSupplierName;
    private javax.swing.JTextField jTextFieldTotal;
    private javax.swing.JTextField jTextFieldinvalidinventoryno;
    private javax.swing.JLabel jTotal;
    // End of variables declaration//GEN-END:variables
}