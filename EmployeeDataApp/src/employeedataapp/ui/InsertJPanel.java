/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package employeedataapp.ui;

import employeedataapp.model.Employee;
import employeedataapp.model.EmployeeData;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.regex.Pattern;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTabbedPane;
import javax.swing.SwingUtilities;
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
    public String selectedLevel = "";
    public boolean isUpdateScreen = false;
    public Employee emp;
    
    public InsertJPanel(EmployeeData employeeData, long ID) {
        initComponents();
        
        this.employeeData = employeeData;
        this.ID = ID;
//        this.isUpdateScreen = isUpdate;
        System.out.println("Inside InsertPanel");
        createButtonGroup();
        setAddButtons();
        setProperties();
    }
    
    public InsertJPanel(EmployeeData employeeData, long ID, Employee emp) {
        initComponents();
        
        this.employeeData = employeeData;
        this.ID = ID;
//        this.isUpdateScreen = isUpdate;
        System.out.println("Inside InsertPanel");
        createButtonGroup();
        this.emp = emp;
        setEmployee(emp);
        setUpdateButtons();
        setProperties();
    }
    
    public void setProperties(){
        
        Font font = new Font("Verdana", Font.PLAIN, 12);
        jLabel1.setFont(font);
        jLabel2.setFont(font);
        jLabel3.setFont(font);
        jLabel4.setFont(font);
        jLabel5.setFont(font);
        jLabel6.setFont(font);
        jLabel7.setFont(font);
        jLabel8.setFont(font);
        jLabel9.setFont(font);
        jLabel10.setFont(font);
    }
    
    
    
   public void setEmployee(Employee emp){
       
       System.out.println("Inside set employee "+emp);
         jNameText.setText(emp.getName());
        jAgeText.setText(String.valueOf(emp.getAge()));
        if(emp.getGender().equalsIgnoreCase("M"))
            jMaleRadioButton.setSelected(true);
        if(emp.getGender().equalsIgnoreCase("F"))
            jFemaleRadioButton.setSelected(true);
        if(emp.getGender().equalsIgnoreCase("Other"))
            jOtherRadioButton.setSelected(true);
        jStartDateText.setText(emp.getStartDate());
        jLevelComboBox.setSelectedItem(emp.getLevel());
        jTeamText.setText(emp.getTeamInfo());
        jPositionText.setText(emp.getPositionTitle());
        jEmailText.setText(emp.getEmailId());
        jPhoneText.setText(emp.getPhone());
        System.out.println(jPhoneText.getText());
        
        if(emp.getPhotoPath() != null){
        selectedImagePath = emp.getPhotoPath();
        jFilePathLabel.setText(selectedImagePath);
         //Display image on jlable
            ImageIcon ii = new ImageIcon(selectedImagePath);
//            Resize image to fit jlabel
            Image image = ii.getImage().getScaledInstance(250, 206, Image.SCALE_SMOOTH);
             
            jLabelImage.setIcon(new ImageIcon(image));
        }
       
     }
   
   public void setUpdateButtons(){
       jAddButton.setText("Update");
       jAddButton.addActionListener(new ActionListener(){  
            @Override
            public void actionPerformed(ActionEvent e){  
            jUpdateButtonActionPerformed();  
        }  
        });  
       
       jResetButton.setText("Delete");
       jResetButton.addActionListener(new ActionListener(){  
            @Override
            public void actionPerformed(ActionEvent e){  
            jDeleteButtonActionPerformed();  
        }  
        });
   }
   
   public void setAddButtons(){
       jAddButton.setText("Add");
       jAddButton.addActionListener(new ActionListener(){  
            @Override
            public void actionPerformed(ActionEvent e){  
            jAddButtonClicked();  
        }  
        });  
       
       jResetButton.setText("Reset");
       jResetButton.addActionListener(new ActionListener(){  
            @Override
            public void actionPerformed(ActionEvent e){  
            resetForm();  
        }  
        });
   }

    
    private void createButtonGroup(){
        radioButtonGroup.add(jMaleRadioButton);
        radioButtonGroup.add(jFemaleRadioButton);
        radioButtonGroup.add(jOtherRadioButton);
        
        jLevelComboBox.addItem("L1");
        jLevelComboBox.addItem("L2");
        jLevelComboBox.addItem("L3");
        jLevelComboBox.addItem("L4");
        jLevelComboBox.addItem("L5");
        jLevelComboBox.addItem("L6");
    }
    
    public void resetForm(){
        jNameText.setText("");
        jAgeText.setText("");
        radioButtonGroup.clearSelection();
        jStartDateText.setText("");
        jLevelComboBox.setSelectedIndex(0);
        jTeamText.setText("");
        jPositionText.setText("");
        jEmailText.setText("");
        jPhoneText.setText("");
        jFilePathLabel.setText("");
    }
    
     
   public boolean deleteEmployee(Employee emp){
       return employeeData.getEmployeeList().remove(emp);
   }
   
   private void jDeleteButtonActionPerformed() {                                             
        // TODO add your handling code here:
        if(this.deleteEmployee(emp)){
            JTabbedPane parent = (JTabbedPane) SwingUtilities.getAncestorOfClass(JTabbedPane.class, this);
        parent.remove(this);
        parent.setSelectedIndex(0);
        JOptionPane.showMessageDialog(this, "Employee data deleted successfully ! \n"+emp.toString());
        }
        else{
        JOptionPane.showMessageDialog(this, "Some Error occurred. Please try again. \n"+emp.toString());

        }
    }  
   
   private void jUpdateButtonActionPerformed() {                                           
        // TODO add your handling code here:
        Employee employee = new Employee();
//        employee.setEmployeeId(ID++);
        employee.setName(jNameText.getText());
        employee.setAge(Integer.parseInt(jAgeText.getText()));
        
        if(jMaleRadioButton.isSelected())
            gender = "M";
        if(jFemaleRadioButton.isSelected())
            gender = "F";
        if(jOtherRadioButton.isSelected())
            gender = "Other";
        employee.setGender(gender);
        
        employee.setStartDate(jStartDateText.getText());
        employee.setLevel(selectedLevel);
        employee.setTeamInfo(jTeamText.getText());
        employee.setPositionTitle(jPositionText.getText());
        employee.setEmailId(jEmailText.getText());
        employee.setPhone(jPhoneText.getText());
        employee.setPhotoPath(jFilePathLabel.getText());

//        employee = employeeData.addNewEmployee(employee);
        ArrayList<Employee> emps = employeeData.getEmployeeList();
        for(int i = 0 ; i < emps.size() ; i++){
            if(emps.get(i).getEmployeeId() == emp.getEmployeeId()){
                System.out.println("Found in lsit : "+emps.get(i).getEmployeeId());
                employee.setEmployeeId(emps.get(i).getEmployeeId());
                emps.set(i, employee);
            }
        }
//        System.out.println(employeeData.toString());
        JTabbedPane parent = (JTabbedPane) SwingUtilities.getAncestorOfClass(JTabbedPane.class, this);
        parent.remove(this);
        parent.setSelectedIndex(0);
        JOptionPane.showMessageDialog(this, "Employee data saved successfully ! \n"+employee.toString());

    }  
   
   private void jAddButtonClicked(){
        Employee employee = new Employee();
        employee.setEmployeeId(ID++);
        employee.setName(jNameText.getText());
        employee.setAge(Integer.parseInt(jAgeText.getText()));
        employee.setGender(gender);
        employee.setStartDate(jStartDateText.getText());
        employee.setLevel(selectedLevel);
        employee.setTeamInfo(jTeamText.getText());
        employee.setPositionTitle(jPositionText.getText());
        employee.setEmailId(jEmailText.getText());
        employee.setPhone(jPhoneText.getText());
        employee.setPhotoPath(jFilePathLabel.getText());
        
        employee = employeeData.addNewEmployee(employee);
        System.out.println(employeeData.toString());
        this.resetForm();
       
        JOptionPane.showMessageDialog(this, "Employee data saved successfully ! \n"+employee.toString());
        
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
        jTeamText = new javax.swing.JTextField();
        jPositionText = new javax.swing.JTextField();
        jEmailText = new javax.swing.JTextField();
        jPhoneText = new javax.swing.JTextField();
        jAddButton = new javax.swing.JButton();
        jResetButton = new javax.swing.JButton();
        jBrowseButton = new javax.swing.JButton();
        jFilePathLabel = new javax.swing.JLabel();
        jLevelComboBox = new javax.swing.JComboBox<>();
        jLabelImage = new javax.swing.JLabel();

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

        jAgeText.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jAgeTextFocusLost(evt);
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

        jStartDateText.setToolTipText("MM/DD/YYYY");
        jStartDateText.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jStartDateTextFocusLost(evt);
            }
        });

        jEmailText.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jEmailTextFocusLost(evt);
            }
        });

        jPhoneText.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jPhoneTextFocusLost(evt);
            }
        });

        jAddButton.setText("Add");

        jResetButton.setText("Reset");

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

        jFilePathLabel.setText("hiiiiiiiiiii");

        jLevelComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jLevelComboBoxActionPerformed(evt);
            }
        });

        jLabelImage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelImage.setText("Photo");
        jLabelImage.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(421, 421, 421)
                        .addComponent(jBrowseButton))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(61, 61, 61)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jFilePathLabel)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jAgeText, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addComponent(jMaleRadioButton)
                                                .addGap(18, 18, 18)
                                                .addComponent(jFemaleRadioButton)
                                                .addGap(18, 18, 18)
                                                .addComponent(jOtherRadioButton))
                                            .addComponent(jNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(65, 65, 65)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                        .addComponent(jPhoneText, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(58, 58, 58)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLevelComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jStartDateText, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jPositionText, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
                                        .addComponent(jTeamText, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addComponent(jEmailText, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(64, 64, 64)
                                .addComponent(jAddButton, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(138, 138, 138)
                                .addComponent(jResetButton, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(315, 315, 315)
                        .addComponent(jLabelImage, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(176, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabelImage, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jBrowseButton)
                .addGap(15, 15, 15)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jStartDateText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jNameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jAgeText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5)
                    .addComponent(jLevelComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jMaleRadioButton)
                    .addComponent(jFemaleRadioButton)
                    .addComponent(jOtherRadioButton)
                    .addComponent(jLabel6)
                    .addComponent(jTeamText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jPositionText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jPhoneText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jEmailText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(jFilePathLabel))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jAddButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jResetButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(131, Short.MAX_VALUE))
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

    private void jLevelComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jLevelComboBoxActionPerformed
        // TODO add your handling code here:
        selectedLevel = jLevelComboBox.getItemAt(jLevelComboBox.getSelectedIndex());
    }//GEN-LAST:event_jLevelComboBoxActionPerformed

    private void jAgeTextFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jAgeTextFocusLost
        // TODO add your handling code here:
        if( ! isNumeric(jAgeText.getText())){
            JOptionPane.showMessageDialog(this,
    "Age should be an integer.",
    "Error",
    JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jAgeTextFocusLost

    private void jPhoneTextFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPhoneTextFocusLost
        // TODO add your handling code here:
        if( !isNumeric(jPhoneText.getText()) || jPhoneText.getText().length() < 10){
            JOptionPane.showMessageDialog(this,
    "Phone should be a 10 digit number.",
    "Error",
    JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jPhoneTextFocusLost

    private void jEmailTextFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jEmailTextFocusLost
        // TODO add your handling code here:
        String regexPattern = "^(.+)@(\\S+)$";
        String emailAddress = jEmailText.getText();
        if( !Pattern.compile(regexPattern).matcher(emailAddress).matches()){
            JOptionPane.showMessageDialog(this,
    "Email Id should be in \"username@domain.com\" format.",
    "Error",
    JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_jEmailTextFocusLost

    public boolean validateJavaDate(String strDate)
   {
	if (strDate.trim().equals("")){
	    return true;
	}
        else{
            SimpleDateFormat sdfrmt = new SimpleDateFormat("MM/dd/yyyy");
	    sdfrmt.setLenient(false);
	    try
	    {
	        Date javaDate = sdfrmt.parse(strDate); 
	        System.out.println(strDate+" is valid date format");
	    }
	    /* Date format is invalid */
	    catch (ParseException e)
	    {
	        System.out.println(strDate+" is Invalid Date format");
                JOptionPane.showMessageDialog(this,
            "Please enter date in MM/dd/yyyy format",
            "Error",
        JOptionPane.ERROR_MESSAGE);
	        return false;
	    }
	    return true;
	}
   }
    
    private void jStartDateTextFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jStartDateTextFocusLost
        // TODO add your handling code here:
        validateJavaDate(jStartDateText.getText());
    }//GEN-LAST:event_jStartDateTextFocusLost


    public static boolean isNumeric(String strNum) {
    if (strNum == null) {
        return false;
    }
    try {
        int d = Integer.parseInt(strNum);
    } catch (NumberFormatException nfe) {
        return false;
    }
    return true;
}
    
    
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
    private javax.swing.JComboBox<String> jLevelComboBox;
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
