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
public class WardInformation extends javax.swing.JInternalFrame {
    DefaultListModel listModel = new DefaultListModel();
    /**
     * Creates new form WardInformation
     */
    public WardInformation() {
        initComponents();
        AddListWard();
    }
    
    //Add ward numbers of wards to list from ward table 
     public void AddListWard(){
        try{
            Statement st=database.getStatement();
            ResultSet rs=st.executeQuery("SELECT WardNo FROM Ward");
            
            
            while (rs.next()) {
                String s=rs.getString("WardNo");
                
                listModel.addElement(s);
            }
            
            listWard.setModel(listModel);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtWardNo = new javax.swing.JTextField();
        txtServiceCharge = new javax.swing.JTextField();
        txtStatus = new javax.swing.JTextField();
        comboWard = new javax.swing.JComboBox<>();
        btnUpdate = new javax.swing.JToggleButton();
        btnCancel = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtBedCount = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        listWard = new javax.swing.JList<>();
        jLabel7 = new javax.swing.JLabel();
        txtDoctor = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtDocCharge = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();

        jScrollPane1.setViewportView(jTextPane1);

        jLabel9.setText("jLabel9");

        jLabel10.setText("jLabel10");

        setBackground(new java.awt.Color(244, 244, 254));
        setClosable(true);
        setIconifiable(true);
        setPreferredSize(new java.awt.Dimension(720, 510));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 20)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 102, 102));
        jLabel11.setText("Ward Infomation");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, 290, -1));

        txtSearch.setEditable(false);
        txtSearch.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        getContentPane().add(txtSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 90, 30));

        btnSearch.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/HMS/Search-icon.png"))); // NOI18N
        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });
        getContentPane().add(btnSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, 100, -1));

        jLabel1.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        jLabel1.setText("Enter Ward No");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 54, 90, 20));

        jLabel2.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        jLabel2.setText("Ward Number");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 80, 110, 20));

        jLabel3.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        jLabel3.setText("Ward Type");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 120, 90, 20));

        jLabel4.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        jLabel4.setText("Medicine & Service Charge");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 280, 160, 20));

        jLabel5.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        jLabel5.setText("Status Of Ward");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 320, 130, 20));

        txtWardNo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        getContentPane().add(txtWardNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 80, 170, -1));

        txtServiceCharge.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        getContentPane().add(txtServiceCharge, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 280, 170, -1));

        txtStatus.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStatusActionPerformed(evt);
            }
        });
        getContentPane().add(txtStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 320, 170, -1));

        comboWard.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        comboWard.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Ward", "Maternity", "Pediatrics", "Oncology", "Gynecologist", "Other" }));
        getContentPane().add(comboWard, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 120, 170, -1));

        btnUpdate.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/HMS/update-icon.png"))); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        getContentPane().add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 440, -1, -1));

        btnCancel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnCancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/HMS/symbol-delete-icon.png"))); // NOI18N
        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 440, -1, -1));

        jLabel6.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        jLabel6.setText("No Of Beds");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 240, -1, 20));

        txtBedCount.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        getContentPane().add(txtBedCount, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 240, 170, -1));

        btnAdd.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/HMS/Add-icon.png"))); // NOI18N
        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        getContentPane().add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 440, 90, -1));

        listWard.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        listWard.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listWardValueChanged(evt);
            }
        });
        jScrollPane3.setViewportView(listWard);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 90, 290));

        jLabel7.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        jLabel7.setText("Doctor In Charge");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 150, 100, 40));

        txtDoctor.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        getContentPane().add(txtDoctor, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 160, 170, -1));

        jLabel8.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        jLabel8.setText("Charge Of Doctor");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 200, 110, 20));

        txtDocCharge.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        getContentPane().add(txtDocCharge, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 200, 170, -1));
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 400, 60, 30));

        jLabel13.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        jLabel13.setText("Rs.");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 200, 20, 20));

        jLabel14.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        jLabel14.setText("Rs.");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 280, 20, 20));

        jLabel15.setFont(new java.awt.Font("Georgia", 0, 11)); // NOI18N
        jLabel15.setText("Dr.");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 150, 20, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStatusActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        
        //Checking data fields of the jinternalform whether there are null values before insert
        if(txtWardNo.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Ward Number can not be EMPTY!","Invalid Input!",JOptionPane.ERROR_MESSAGE);
        }
        else if(comboWard.getSelectedItem().equals("Select Ward")){
            JOptionPane.showMessageDialog(null,"Ward Type can not be NOT SELECTED!","Invalid Input!",JOptionPane.ERROR_MESSAGE);
        }
        else if(txtDoctor.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Doctor In Charge can not be EMPTY!","Invalid Input!",JOptionPane.ERROR_MESSAGE);
        }
        else if(txtDocCharge.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Charge of Doctor can not be EMPTY!","Invalid Input!",JOptionPane.ERROR_MESSAGE);
        }
        else if(txtBedCount.getText().equals("")){
            JOptionPane.showMessageDialog(null,"No of Beds can not be EMPTY!","Invalid Input!",JOptionPane.ERROR_MESSAGE);
        }
        else if(txtServiceCharge.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Charge of Medicine & Service can not be EMPTY!","Invalid Input!",JOptionPane.ERROR_MESSAGE);
        }
        else if(txtStatus.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Status of Ward can not be EMPTY!","Invalid Input!",JOptionPane.ERROR_MESSAGE);
        }
        else{
        
        try{  
            Statement stat=database.getStatement();
            
            //Check whether there are duplicate ward numbers
            ResultSet rs=stat.executeQuery("SELECT WardNo FROM Ward WHERE WardNo='"+txtWardNo.getText()+"'");
           
                if(rs.next()==true){
                    JOptionPane.showMessageDialog(null,"Entered Ward Number already EXISTS!","Invalid Input!",JOptionPane.ERROR_MESSAGE);
                }
       
                else{
                   //Insert data into ward table
                    stat.executeUpdate("INSERT INTO Ward(WardNo,WardType,DoctorInCharge,DoctorCharge,NoOfBeds,ServiceCharge,Status) VALUES('"+txtWardNo.getText()+"','"+comboWard.getSelectedItem()+"','"+txtDoctor.getText()+"','"+txtDocCharge.getText()+"','"+txtBedCount.getText()+"','"+txtServiceCharge.getText()+"','"+txtStatus.getText()+"')");
                    JOptionPane.showMessageDialog(null,"Data added successfully!");
                    
                    //Empty the fields in jinternalform that entered 
                    txtWardNo.setText("");
                    comboWard.setSelectedItem("Select Ward");
                    txtDoctor.setText("");
                    txtDocCharge.setText("");
                    txtBedCount.setText("");
                    txtServiceCharge.setText("");
                    txtStatus.setText("");
        
                    
                }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
         
        //Checking data fields of the jinternalform whether there are null values before update
        if(txtWardNo.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Ward Number can not be EMPTY!","Invalid Input!",JOptionPane.ERROR_MESSAGE);
        }
        else if(comboWard.getSelectedItem().equals("Select Ward")){
            JOptionPane.showMessageDialog(null,"Ward Type can not be NOT SELECTED!","Invalid Input!",JOptionPane.ERROR_MESSAGE);
        }
        else if(txtDoctor.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Doctor In Charge can not be EMPTY!","Invalid Input!",JOptionPane.ERROR_MESSAGE);
        }
        else if(txtDocCharge.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Charge of Doctor can not be EMPTY!","Invalid Input!",JOptionPane.ERROR_MESSAGE);
        }
        else if(txtBedCount.getText().equals("")){
            JOptionPane.showMessageDialog(null,"No of Beds can not be EMPTY!","Invalid Input!",JOptionPane.ERROR_MESSAGE);
        }
        else if(txtServiceCharge.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Charge of Medicine & Service can not be EMPTY!","Invalid Input!",JOptionPane.ERROR_MESSAGE);
        }
        else if(txtStatus.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Status of Ward can not be EMPTY!","Invalid Input!",JOptionPane.ERROR_MESSAGE);
        }
        else{
        
            int x = JOptionPane.showConfirmDialog(null, "Are you sure you want to update this record?");
            if(x == 0){
        
            try{
                Statement st=database.getStatement();
             
                //Update table with changed values
                st.executeUpdate("UPDATE Ward SET WardNo='"+txtWardNo.getText()+"', WardType='"+comboWard.getSelectedItem()+"', DoctorInCharge='"+txtDoctor.getText()+"', DoctorCharge='"+txtDocCharge.getText()+"', NoOfBeds='"+txtBedCount.getText()+"',ServiceCharge='"+txtServiceCharge.getText()+"',Status='"+txtStatus.getText()+"' WHERE WardNo='"+txtWardNo.getText()+"'");
                JOptionPane.showMessageDialog(null,"Data updated successfully!");
                
                //Empty the fields in jinternalform that entered
                txtWardNo.setText("");
                comboWard.setSelectedItem("Select Ward");
                txtDoctor.setText("");
                txtDocCharge.setText("");
                txtBedCount.setText("");
                txtServiceCharge.setText("");
                txtStatus.setText("");
                
            }
            catch(Exception e){
                e.printStackTrace();
            }
            
            }
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        int x = JOptionPane.showConfirmDialog(null, "Are you sure you want to exit?");
        if(x == 0){
            this.dispose();
        }
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        
         //Search database which match the entered ward no
        try{
            
            Statement st=database.getStatement();
            ResultSet rs=st.executeQuery("SELECT * FROM Ward WHERE WardNo='"+txtSearch.getText()+"'");
            
                 
            while(rs.next()){
                txtWardNo.setText(rs.getString("WardNo"));
                comboWard.setSelectedItem(rs.getString("WardType"));
                txtDoctor.setText(rs.getString("DoctorInCharge"));
                txtDocCharge.setText(rs.getString("DoctorCharge"));
                txtBedCount.setText(rs.getString("NoOfBeds"));
                txtServiceCharge.setText(rs.getString("ServiceCharge"));
                txtStatus.setText(rs.getString("Status"));
                
            }
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void listWardValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listWardValueChanged
        
        //Set textfield to selected value 
        String selected = listWard.getSelectedValue().toString();
        txtSearch.setText(selected);   
    }//GEN-LAST:event_listWardValueChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnSearch;
    private javax.swing.JToggleButton btnUpdate;
    private javax.swing.JComboBox<String> comboWard;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JList<String> listWard;
    private javax.swing.JTextField txtBedCount;
    private javax.swing.JTextField txtDocCharge;
    private javax.swing.JTextField txtDoctor;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtServiceCharge;
    private javax.swing.JTextField txtStatus;
    private javax.swing.JTextField txtWardNo;
    // End of variables declaration//GEN-END:variables
}
