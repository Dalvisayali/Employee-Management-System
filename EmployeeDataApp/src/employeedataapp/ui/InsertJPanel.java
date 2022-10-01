/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package employeedataapp.ui;

import employeedataapp.model.Employee;
import employeedataapp.model.EmployeeData;
import javax.swing.JOptionPane;

/**
 *
 * @author Sayali Dalvi
 */
public class InsertJPanel extends javax.swing.JPanel{

    /**
     * Creates new form InsertJPanel
     */
    
    public String gender = "";
    public EmployeeData employeeData ;
    private static long ID = 1;
    
    public InsertJPanel(EmployeeData employeeData) {
        initComponents();
        
        this.employeeData = employeeData;
        createButtonGroup();
    }
    
  
    
    private void createButtonGroup(){
        radioButtonGroup.add(jMaleRadioButton);
        radioButtonGroup.add(jFemaleRadioButton);
        radioButtonGroup.add(jOtherRadioButton);
    }
    
    private void resetForm(){
        jNameText.setText("");
        jAgeText.setText("");
        jMaleRadioButton.setSelected(false);
        jFemaleRadioButton.setSelected(false);
        jOtherRadioButton.setSelected(false);
        jStartDateText.setText("");
        jLevelText.setText("");
        jTeamText.setText("");
        jPositionText.setText("");
        jEmailText.setText("");
        jPhoneText.setText("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        radioButtonGroup = new javax.swing.ButtonGroup();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jNameText = new javax.swing.JTextField();
        jAgeText = new javax.swing.JTextField();
        jMaleRadioButton = new javax.swing.JRadioButton();
        jFemaleRadioButton = new javax.swing.JRadioButton();
        jOtherRadioButton = new javax.swing.JRadioButton();
        jStartDateText = new javax.swing.JTextField();
        jLevelText = new javax.swing.JTextField();
        jTeamText = new javax.swing.JTextField();
        jPositionText = new javax.swing.JTextField();
        jEmailText = new javax.swing.JTextField();
        jPhoneText = new javax.swing.JTextField();
        jAddButton = new javax.swing.JButton();
        jResetButton = new javax.swing.JButton();

        jLabel1.setText("Name");

        jLabel2.setText("Age");

        jLabel3.setText("Gender");

        jLabel4.setText("Start Date");

        jLabel5.setText("Level");

        jLabel6.setText("Team");

        jLabel7.setText("Position");

        jLabel8.setText("Email Id");

        jLabel9.setText("Phone no.");

        jLabel10.setText("Photo");

        jNameText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jNameTextActionPerformed(evt);
            }
        });

        jAgeText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAgeTextActionPerformed(evt);
            }
        });

        jMaleRadioButton.setText("Male");
        jMaleRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMaleRadioButtonActionPerformed(evt);
            }
        });

        jFemaleRadioButton.setText("Female");
        jFemaleRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFemaleRadioButtonActionPerformed(evt);
            }
        });

        jOtherRadioButton.setText("Other");
        jOtherRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jOtherRadioButtonActionPerformed(evt);
            }
        });

        jStartDateText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jStartDateTextActionPerformed(evt);
            }
        });

        jLevelText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jLevelTextActionPerformed(evt);
            }
        });

        jAddButton.setText("Add");
        jAddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAddButtonActionPerformed(evt);
            }
        });

        jResetButton.setText("Reset");
        jResetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jResetButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(220, 220, 220)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(142, 142, 142)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jMaleRadioButton)
                                .addGap(18, 18, 18)
                                .addComponent(jFemaleRadioButton)
                                .addGap(18, 18, 18)
                                .addComponent(jOtherRadioButton))
                            .addComponent(jStartDateText)
                            .addComponent(jLevelText, javax.swing.GroupLayout.DEFAULT_SIZE, 295, Short.MAX_VALUE)
                            .addComponent(jTeamText, javax.swing.GroupLayout.DEFAULT_SIZE, 295, Short.MAX_VALUE)
                            .addComponent(jPositionText, javax.swing.GroupLayout.DEFAULT_SIZE, 295, Short.MAX_VALUE)
                            .addComponent(jEmailText, javax.swing.GroupLayout.DEFAULT_SIZE, 295, Short.MAX_VALUE)
                            .addComponent(jPhoneText, javax.swing.GroupLayout.DEFAULT_SIZE, 295, Short.MAX_VALUE)
                            .addComponent(jAgeText)
                            .addComponent(jNameText)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(311, 311, 311)
                        .addComponent(jAddButton)
                        .addGap(139, 139, 139)
                        .addComponent(jResetButton)))
                .addContainerGap(201, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jNameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jAgeText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jMaleRadioButton)
                    .addComponent(jFemaleRadioButton)
                    .addComponent(jOtherRadioButton))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jStartDateText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLevelText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTeamText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jPositionText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jPhoneText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jEmailText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel10)
                .addGap(28, 28, 28)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jAddButton)
                    .addComponent(jResetButton))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 912, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    
    
    private void jOtherRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jOtherRadioButtonActionPerformed
        // TODO add your handling code here:
        gender = "Other";
    }//GEN-LAST:event_jOtherRadioButtonActionPerformed

    private void jStartDateTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jStartDateTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jStartDateTextActionPerformed

    private void jAddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAddButtonActionPerformed
        // TODO add your handling code here:
        Employee employee = new Employee();
        employee.setEmployeeId(ID++);
        employee.setName(jNameText.getText());
        employee.setAge(Integer.parseInt(jAgeText.getText()));
        employee.setGender(gender);
        employee.setStartDate(jStartDateText.getText());
        employee.setLevel(jLevelText.getText());
        employee.setTeamInfo(jTeamText.getText());
        employee.setPositionTitle(jPositionText.getText());
        employee.setEmailId(jEmailText.getText());
        employee.setPhone(jPhoneText.getText());
        
        employee = employeeData.addNewEmployee(employee);
        this.resetForm();
        
        JOptionPane.showMessageDialog(this, "Employee data saved successfully ! \n"+employee.toString());
        
    }//GEN-LAST:event_jAddButtonActionPerformed

    private void jNameTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jNameTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jNameTextActionPerformed

    private void jAgeTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAgeTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jAgeTextActionPerformed

    private void jLevelTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jLevelTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLevelTextActionPerformed

    private void jResetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jResetButtonActionPerformed
        // TODO add your handling code here:
        this.resetForm();
        
    }//GEN-LAST:event_jResetButtonActionPerformed

    private void jMaleRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMaleRadioButtonActionPerformed
        // TODO add your handling code here:
        gender = "M";
    }//GEN-LAST:event_jMaleRadioButtonActionPerformed

    private void jFemaleRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFemaleRadioButtonActionPerformed
        // TODO add your handling code here:
        gender = "F";
    }//GEN-LAST:event_jFemaleRadioButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jAddButton;
    private javax.swing.JTextField jAgeText;
    private javax.swing.JTextField jEmailText;
    private javax.swing.JRadioButton jFemaleRadioButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jLevelText;
    private javax.swing.JRadioButton jMaleRadioButton;
    private javax.swing.JTextField jNameText;
    private javax.swing.JRadioButton jOtherRadioButton;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jPhoneText;
    private javax.swing.JTextField jPositionText;
    private javax.swing.JButton jResetButton;
    private javax.swing.JTextField jStartDateText;
    private javax.swing.JTextField jTeamText;
    private javax.swing.ButtonGroup radioButtonGroup;
    // End of variables declaration//GEN-END:variables
}
