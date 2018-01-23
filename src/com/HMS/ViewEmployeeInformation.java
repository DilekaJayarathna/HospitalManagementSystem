/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.HMS;

import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Dileka
 */
public class ViewEmployeeInformation extends javax.swing.JInternalFrame {
    DefaultListModel listModel = new DefaultListModel();
    /**
     * Creates new form viewEmployeeInfo
     */
    public ViewEmployeeInformation() {
        initComponents();
        AddListEmpID();
    }
    //Add Employee ids of employees to list from employee table
     public void AddListEmpID(){
        try{
            Statement st=database.getStatement();
            ResultSet rs=st.executeQuery("SELECT EmployeeId FROM Employee");
            
            
            while (rs.next()) {
                String s=rs.getString("EmployeeId");
                
                listModel.addElement(s);
            }
            
            listEmpId.setModel(listModel);
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel11 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnSearch = new javax.swing.JButton();
        txtSearch = new javax.swing.JTextField();
        txtEmpId = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        radioMale = new javax.swing.JRadioButton();
        radioFemale = new javax.swing.JRadioButton();
        txtPhone = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAddress = new javax.swing.JTextPane();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        listEmpId = new javax.swing.JList<>();
        txtPosition = new javax.swing.JTextField();
        btnClose = new javax.swing.JButton();

        setBackground(new java.awt.Color(244, 244, 254));
        setClosable(true);
        setIconifiable(true);
        setPreferredSize(new java.awt.Dimension(720, 510));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 20)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 102, 102));
        jLabel11.setText("Employee Infomation");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, 260, -1));

        jLabel2.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        jLabel2.setText("Position");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 270, 70, 20));

        jLabel4.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        jLabel4.setText("Name with initials");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 120, 110, 20));

        jLabel7.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        jLabel7.setText("Address");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 180, 60, 30));

        jLabel8.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        jLabel8.setText("Phone Number");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 240, -1, 20));

        jLabel9.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        jLabel9.setText("Gender");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 150, 90, 20));

        jLabel1.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        jLabel1.setText("Employee ID");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 90, -1, -1));

        btnSearch.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/HMS/Search-icon.png"))); // NOI18N
        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });
        getContentPane().add(btnSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, 100, -1));

        txtSearch.setEditable(false);
        txtSearch.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        getContentPane().add(txtSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 90, 30));

        txtEmpId.setEditable(false);
        txtEmpId.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        getContentPane().add(txtEmpId, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 90, 210, -1));

        txtName.setEditable(false);
        txtName.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        getContentPane().add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 120, 210, -1));

        radioMale.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        radioMale.setText("Male");
        radioMale.setEnabled(false);
        getContentPane().add(radioMale, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 150, -1, -1));

        radioFemale.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        radioFemale.setText("Female");
        radioFemale.setEnabled(false);
        getContentPane().add(radioFemale, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 150, -1, -1));

        txtPhone.setEditable(false);
        txtPhone.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        getContentPane().add(txtPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 240, 210, -1));

        txtAddress.setEditable(false);
        txtAddress.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jScrollPane1.setViewportView(txtAddress);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 180, 210, 50));

        jLabel3.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        jLabel3.setText("Enter Employee ID");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 54, -1, 20));

        listEmpId.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        listEmpId.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listEmpIdValueChanged(evt);
            }
        });
        jScrollPane3.setViewportView(listEmpId);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 90, 290));

        txtPosition.setEditable(false);
        txtPosition.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        getContentPane().add(txtPosition, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 270, 210, -1));

        btnClose.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/HMS/symbol-delete-icon.png"))); // NOI18N
        btnClose.setText("Close");
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });
        getContentPane().add(btnClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 440, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        
        //Search database which match the entered employee id
        try{

            Statement st=database.getStatement();
            ResultSet rs=st.executeQuery("SELECT * FROM Employee WHERE EmployeeId='"+txtSearch.getText()+"'");

            while(rs.next()){
                txtEmpId.setText(rs.getString("EmployeeId"));
                txtName.setText(rs.getString("NameWithInitials"));
                String GN = rs.getString("Gender");
                if (GN.equals("Female")){
                    radioMale.setSelected(false);
                    radioFemale.setSelected(true);

                }
                else{
                    radioFemale.setSelected(false);
                    radioMale.setSelected(true);
                }
                txtAddress.setText(rs.getString("Address"));
                txtPhone.setText(rs.getString("PhoneNumber"));
                txtPosition.setText(rs.getString("Position"));

            }

        }
        catch(Exception ex){
            ex.printStackTrace();
        }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void listEmpIdValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listEmpIdValueChanged
        
        //Set textfield to selected value 
        String selected=listEmpId.getSelectedValue().toString();
        txtSearch.setText(selected);
    }//GEN-LAST:event_listEmpIdValueChanged

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        int x = JOptionPane.showConfirmDialog(null, "Are you sure you want to exit?");
        if(x == 0){
            this.dispose();
        }
    }//GEN-LAST:event_btnCloseActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnSearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JList<String> listEmpId;
    private javax.swing.JRadioButton radioFemale;
    private javax.swing.JRadioButton radioMale;
    private javax.swing.JTextPane txtAddress;
    private javax.swing.JTextField txtEmpId;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPhone;
    private javax.swing.JTextField txtPosition;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
