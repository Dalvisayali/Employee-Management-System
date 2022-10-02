/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package employeedataapp.ui;

import employeedataapp.model.Employee;
import employeedataapp.model.EmployeeData;
import java.awt.Image;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

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
    public long ID;
    public String selectedImagePath = "";
    
    public InsertJPanel(EmployeeData employeeData, long ID) {
        initComponents();
        
        this.employeeData = employeeData;
        this.ID = ID;
        System.out.println("Inside InsertPanel");
        createButtonGroup();
    }
    
   public void setEmployee(Employee emp){
         jNameText.setText(emp.getName());
        jAgeText.setText(String.valueOf(emp.getAge()));
        if(emp.getGender().equalsIgnoreCase("M"))
            jMaleRadioButton.setSelected(true);
        if(emp.getGender().equalsIgnoreCase("F"))
            jFemaleRadioButton.setSelected(true);
        if(emp.getGender().equalsIgnoreCase("Other"))
            jOtherRadioButton.setSelected(true);
        jStartDateText.setText(emp.getStartDate());
        jLevelText.setText(emp.getLevel());
        jTeamText.setText(emp.getTeamInfo());
        jPositionText.setText(emp.getPositionTitle());
        jEmailText.setText(emp.getEmailId());
        jPhoneText.setText(emp.getPhone());
        jFilePathLabel.setText(emp.getPhotoPath());
     }

    
    private void createButtonGroup(){
        radioButtonGroup.add(jMaleRadioButton);
        radioButtonGroup.add(jFemaleRadioButton);
        radioButtonGroup.add(jOtherRadioButton);
    }
    
    private void resetForm(){
        jNameText.setText("");
        jAgeText.setText("");
        radioButtonGroup.clearSelection();
        jStartDateText.setText("");
        jLevelText.setText("");
        jTeamText.setText("");
        jPositionText.setText("");
        jEmailText.setText("");
        jPhoneText.setText("");
        jFilePathLabel.setText("");
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
        jBrowseButton = new javax.swing.JButton();
        jLabelImage = new javax.swing.JLabel();
        jFilePathLabel = new javax.swing.JLabel();

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

        jBrowseButton.setText("Browse");
        jBrowseButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBrowseButtonMouseClicked(evt);
            }
        });
        jBrowseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBrowseButtonActionPerformed(evt);
            }
        });

        jLabelImage.setText("jLabel11");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(222, 222, 222)
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
                    .addComponent(jNameText)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jBrowseButton)
                        .addGap(18, 18, 18)
                        .addComponent(jFilePathLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addComponent(jAddButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 229, Short.MAX_VALUE)
                .addComponent(jLabelImage, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(122, 122, 122)
                .addComponent(jResetButton)
                .addGap(162, 162, 162))
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
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jBrowseButton)
                    .addComponent(jFilePathLabel))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jAddButton)
                            .addComponent(jResetButton)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelImage, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(117, Short.MAX_VALUE))
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
        employee.setPhotoPath(jFilePathLabel.getText());
        
        employee = employeeData.addNewEmployee(employee);
        System.out.println(employeeData.toString());
        this.resetForm();
       
        JOptionPane.showMessageDialog(this, "Employee data saved successfully ! \n"+employee.toString());
        
    }//GEN-LAST:event_jAddButtonActionPerformed

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

    private void jBrowseButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBrowseButtonMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jBrowseButtonMouseClicked

    private void jBrowseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBrowseButtonActionPerformed
        // TODO add your handling code here:
        JFileChooser browseImageFile = new JFileChooser();
        //Filter image extensions
        FileNameExtensionFilter fnef = new FileNameExtensionFilter("IMAGES", "png", "jpg", "jpeg");
        browseImageFile.addChoosableFileFilter(fnef);
        int showOpenDialogue = browseImageFile.showOpenDialog(null);
         
        if (showOpenDialogue == JFileChooser.APPROVE_OPTION) {
            File selectedImageFile = browseImageFile.getSelectedFile();
            selectedImagePath = selectedImageFile.getAbsolutePath();
            jFilePathLabel.setText(selectedImagePath);
//            JOptionPane.showMessageDialog(null, selectedImagePath);
            //Display image on jlable
            ImageIcon ii = new ImageIcon(selectedImagePath);
//            Resize image to fit jlabel
            Image image = ii.getImage().getScaledInstance(jLabelImage.getWidth(), jLabelImage.getHeight(), Image.SCALE_SMOOTH);
             
            jLabelImage.setIcon(new ImageIcon(image));
        }
    }//GEN-LAST:event_jBrowseButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jAddButton;
    private javax.swing.JTextField jAgeText;
    private javax.swing.JButton jBrowseButton;
    private javax.swing.JTextField jEmailText;
    private javax.swing.JRadioButton jFemaleRadioButton;
    private javax.swing.JLabel jFilePathLabel;
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
    private javax.swing.JLabel jLabelImage;
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
