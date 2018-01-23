/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.HMS;


import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Dileka
 */
public class PatientRegistration extends javax.swing.JInternalFrame {
    UserAdmin useradmin;
    /**
     * Creates new form PatientRegistration
     */
    public PatientRegistration() {
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

        jScrollPane5 = new javax.swing.JScrollPane();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane4 = new javax.swing.JScrollPane();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        radioMale = new javax.swing.JRadioButton();
        radioFemale = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAddress = new javax.swing.JTextArea();
        txtPhone = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtPid = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtDisease = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtStatus = new javax.swing.JTextField();
        btnRegistration = new javax.swing.JButton();
        btnClose = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        comboWard = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtWno = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jLabel14 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        dcDOB = new com.toedter.calendar.JDateChooser();
        jScrollPane3 = new javax.swing.JScrollPane();
        dcCheckIn = new com.toedter.calendar.JDateChooser();

        jScrollPane4.setBorder(null);
        jScrollPane4.setHorizontalScrollBar(null);
        jScrollPane4.setName("Personal"); // NOI18N
        jScrollPane4.setOpaque(false);

        setBackground(new java.awt.Color(244, 244, 254));
        setClosable(true);
        setIconifiable(true);
        setPreferredSize(new java.awt.Dimension(720, 510));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        jLabel3.setText("CheckIn Date");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 370, 100, 20));

        jLabel4.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        jLabel4.setText("Name with initials");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, 120, 20));

        jLabel7.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        jLabel7.setText("Address");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, 60, 30));

        jLabel8.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        jLabel8.setText("Phone Number");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, -1, -1));

        jLabel9.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        jLabel9.setText("Gender");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, 110, 20));

        txtName.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });
        getContentPane().add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 90, 230, -1));

        buttonGroup1.add(radioMale);
        radioMale.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        radioMale.setText("Male");
        radioMale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioMaleActionPerformed(evt);
            }
        });
        getContentPane().add(radioMale, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 120, -1, -1));

        buttonGroup1.add(radioFemale);
        radioFemale.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        radioFemale.setText("Female");
        getContentPane().add(radioFemale, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 120, -1, -1));

        jScrollPane1.setHorizontalScrollBar(null);

        txtAddress.setColumns(20);
        txtAddress.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtAddress.setRows(5);
        jScrollPane1.setViewportView(txtAddress);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 150, 230, 40));

        txtPhone.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        getContentPane().add(txtPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 230, 230, -1));

        jLabel1.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        jLabel1.setText("Patient ID");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, -1, -1));

        txtPid.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        getContentPane().add(txtPid, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 60, 230, -1));

        jLabel5.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        jLabel5.setText("Disease");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, -1, -1));

        txtDisease.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        getContentPane().add(txtDisease, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 260, 230, -1));

        jLabel6.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        jLabel6.setText("Status of Disease");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 290, 110, -1));

        txtStatus.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        getContentPane().add(txtStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 290, 230, -1));

        btnRegistration.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnRegistration.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/HMS/Register-icon.png"))); // NOI18N
        btnRegistration.setText("Register");
        btnRegistration.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrationActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegistration, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 440, 130, -1));

        btnClose.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/HMS/symbol-delete-icon.png"))); // NOI18N
        btnClose.setText("Close");
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });
        getContentPane().add(btnClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 440, -1, -1));

        jLabel10.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        jLabel10.setText("Ward Type");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 400, 70, 20));

        comboWard.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        comboWard.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Ward", "Maternity", "Pediatrics", "Oncology", "Gynecologist", "Other" }));
        getContentPane().add(comboWard, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 400, 180, -1));

        jLabel11.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 20)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 102, 102));
        jLabel11.setText("Patient Registration");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, 310, -1));

        jLabel12.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        jLabel12.setText("Ward Number");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 370, 100, -1));

        txtWno.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        getContentPane().add(txtWno, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 370, 180, -1));

        jScrollPane2.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ward Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Georgia", 1, 12))); // NOI18N
        jScrollPane2.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        jScrollPane2.setHorizontalScrollBar(null);
        jScrollPane2.setOpaque(false);
        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, 360, 100));
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 390, 100, 40));

        jLabel13.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        jLabel13.setText("Date Of Birth");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, 80, -1));

        dcDOB.setDateFormatString("dd,MM, yyyy");
        dcDOB.setName("dcDOB"); // NOI18N
        getContentPane().add(dcDOB, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 200, 230, -1));

        jScrollPane3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Personal Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 11))); // NOI18N
        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 420, 290));

        dcCheckIn.setDateFormatString("dd,MM, yyyy");
        dcCheckIn.setName("dcCheckIn"); // NOI18N
        getContentPane().add(dcCheckIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 370, 160, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void radioMaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioMaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioMaleActionPerformed

    private void btnRegistrationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrationActionPerformed
        
        //Checking data fields of the jinternalform whether there are null values before registration
        if(txtPid.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Patient Id can not be EMPTY!","Invalid Input!",JOptionPane.ERROR_MESSAGE);
        }
        else if(txtName.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Name With Initials can not be EMPTY!","Invalid Input!",JOptionPane.ERROR_MESSAGE);
        }
        else if(radioMale.isSelected()==false && radioFemale.isSelected()==false){
            JOptionPane.showMessageDialog(null,"Gender can not be NOT SELECTED!","Invalid Input!",JOptionPane.ERROR_MESSAGE);
        }
        else if(txtAddress.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Address can not be EMPTY!","Invalid Input!",JOptionPane.ERROR_MESSAGE);
        }
        else if(((JTextField)dcDOB.getDateEditor().getUiComponent()).getText().equals("")){
            JOptionPane.showMessageDialog(null,"Date Of Birth can not be EMPTY!","Invalid Input!",JOptionPane.ERROR_MESSAGE);
        }
        else if(txtPhone.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Phone Number can not be EMPTY!","Invalid Input!",JOptionPane.ERROR_MESSAGE);
        }
        else if(txtDisease.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Disease can not be EMPTY!","Invalid Input!",JOptionPane.ERROR_MESSAGE);
        }
        else if(txtStatus.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Status of disease can not be EMPTY!","Invalid Input!",JOptionPane.ERROR_MESSAGE);
        }
        else if(txtWno.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Ward number can not be EMPTY!","Invalid Input!",JOptionPane.ERROR_MESSAGE);
        }
        else if(comboWard.getSelectedItem().equals("Select Ward")){
            JOptionPane.showMessageDialog(null,"Ward type can not be NOT SELECTED!","Invalid Input!",JOptionPane.ERROR_MESSAGE);
        }
        else if(((JTextField)dcCheckIn.getDateEditor().getUiComponent()).getText().equals("")){
            JOptionPane.showMessageDialog(null,"CheckIn date can not be EMPTY!","Invalid Input!",JOptionPane.ERROR_MESSAGE);
        }
        
  
        else{

            try{
                
            String gender=" ";
            if(radioMale.isSelected()==true){
                gender="Male";
            }
            else{
                gender="Female";
            }
            String bday = ((JTextField)dcDOB.getDateEditor().getUiComponent()).getText();
            String date1 = ((JTextField)dcCheckIn.getDateEditor().getUiComponent()).getText();
            String date2 = "Pending";
            
            
            
            Statement stat=database.getStatement();
            
            //Check whether there are duplicate patient ids
            ResultSet rs=stat.executeQuery("SELECT PatientID FROM Admission WHERE PatientID='"+txtPid.getText()+"'");
           
            if(rs.next()==true){
                JOptionPane.showMessageDialog(null,"Entered Patient ID already EXISTS!","Invalid Input!",JOptionPane.ERROR_MESSAGE);
            }
        
        
            else{
            
            //Insert data into tables
            stat.executeUpdate("INSERT INTO Patient(PatientID,NameWithInitials,Gender,Address,DOB,PhoneNumber,Disease,StatusOfDisease,WardNo,WardType,CheckInDate,CheckOutDate) VALUES('"+txtPid.getText()+"','"+txtName.getText()+"','"+gender+"','"+txtAddress.getText()+"','"+bday+"','"+txtPhone.getText()+"','"+txtDisease.getText()+"','"+txtStatus.getText()+"','"+txtWno.getText()+"','"+comboWard.getSelectedItem().toString()+"','"+date1+"','"+date2+"')");
            
            stat.executeUpdate("INSERT INTO Admission(PatientID,NameWithInitials,Gender,Address,DOB,PhoneNumber) VALUES('"+txtPid.getText()+"','"+txtName.getText()+"','"+gender+"','"+txtAddress.getText()+"','"+bday+"','"+txtPhone.getText()+"')");
                    
            JOptionPane.showMessageDialog(null,"Data entered successfully!");
            
            //Empty the fields in jinternalform that entered
            txtPid.setText("");
            txtName.setText("");
            buttonGroup1.clearSelection();
            txtAddress.setText("");
            ((JTextField)dcDOB.getDateEditor().getUiComponent()).setText("");
            txtPhone.setText("");
            txtDisease.setText("");
            txtStatus.setText("");
            txtWno.setText("");
            comboWard.setSelectedItem("Select Ward");
            ((JTextField)dcCheckIn.getDateEditor().getUiComponent()).setText("");
            
            }
            
        }
          
        catch(Exception e){
            e.printStackTrace();
        }
    
        }
        
    }//GEN-LAST:event_btnRegistrationActionPerformed

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        int x = JOptionPane.showConfirmDialog(null, "Are you sure you want to exit?");
        if(x == 0){
            this.dispose();
        }
    }//GEN-LAST:event_btnCloseActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnRegistration;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> comboWard;
    private com.toedter.calendar.JDateChooser dcCheckIn;
    private com.toedter.calendar.JDateChooser dcDOB;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JRadioButton radioFemale;
    private javax.swing.JRadioButton radioMale;
    private javax.swing.JTextArea txtAddress;
    private javax.swing.JTextField txtDisease;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPhone;
    private javax.swing.JTextField txtPid;
    private javax.swing.JTextField txtStatus;
    private javax.swing.JTextField txtWno;
    // End of variables declaration//GEN-END:variables
}
