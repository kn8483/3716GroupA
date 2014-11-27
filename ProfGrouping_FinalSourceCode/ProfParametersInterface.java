/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package profgrouping;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;

/**
 *
 * @author Anya
 */
public class ProfParametersInterface extends javax.swing.JFrame {

    private SessionController sessionController; 

    /**
     * Creates new form ProfParametersInterface
     */
    public ProfParametersInterface(String courseName) {
        sessionController = new SessionController(courseName); 
        initComponents();
        classlistLabel.setText(courseName);  
        DefaultListModel listModel = new DefaultListModel();
        ArrayList<Student> classlist = sessionController.getClasslist(); 
        for (Student s : classlist) {
            listModel.addElement(s); 
        }
        ClassList.setModel(listModel);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupSBS = new javax.swing.ButtonGroup();
        profPanel = new javax.swing.JPanel();
        ParametersLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ClassList = new javax.swing.JList();
        jLabel1 = new javax.swing.JLabel();
        GroupSizeField = new javax.swing.JTextField();
        createGroupsBtn = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        addStudentButton = new javax.swing.JButton();
        forbidButton = new javax.swing.JButton();
        mandateButton = new javax.swing.JButton();
        ParametersLabel1 = new javax.swing.JLabel();
        classlistLabel = new javax.swing.JLabel();
        guaranteeGroupSizeCheckBox = new javax.swing.JCheckBox();
        balanceGPARadioButton = new javax.swing.JRadioButton();
        randomizeRadioButton = new javax.swing.JRadioButton();
        assignSequentiallyRadioButton = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        profPanel.setBackground(new java.awt.Color(0, 51, 102));

        ParametersLabel.setBackground(new java.awt.Color(0, 51, 102));
        ParametersLabel.setFont(new java.awt.Font("Simplified Arabic", 1, 25)); // NOI18N
        ParametersLabel.setForeground(new java.awt.Color(255, 255, 255));
        ParametersLabel.setText("Parameters");

        ClassList.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        ClassList.setForeground(new java.awt.Color(0, 0, 51));
        ClassList.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                ClassListPropertyChange(evt);
            }
        });
        ClassList.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                ClassListAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane1.setViewportView(ClassList);

        jLabel1.setFont(new java.awt.Font("Simplified Arabic", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setLabelFor(GroupSizeField);
        jLabel1.setText("Group Size");

        GroupSizeField.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        GroupSizeField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GroupSizeFieldActionPerformed(evt);
            }
        });

        createGroupsBtn.setBackground(new java.awt.Color(0, 102, 102));
        createGroupsBtn.setFont(new java.awt.Font("Simplified Arabic", 1, 18)); // NOI18N
        createGroupsBtn.setText("Create Groups");
        createGroupsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createGroupsBtnActionPerformed(evt);
            }
        });

        jList1.setModel(new DefaultListModel());
        jScrollPane4.setViewportView(jList1);

        addStudentButton.setText("Add student to specify rule ->");
        addStudentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addStudentButtonActionPerformed(evt);
            }
        });

        forbidButton.setText("These students must NOT work together.");
        forbidButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                forbidButtonActionPerformed(evt);
            }
        });

        mandateButton.setText("These students must work together.");
        mandateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mandateButtonActionPerformed(evt);
            }
        });

        ParametersLabel1.setBackground(new java.awt.Color(0, 51, 102));
        ParametersLabel1.setFont(new java.awt.Font("Simplified Arabic", 1, 14)); // NOI18N
        ParametersLabel1.setForeground(new java.awt.Color(255, 255, 255));
        ParametersLabel1.setText("Specify a rule for these students:");

        classlistLabel.setFont(new java.awt.Font("Simplified Arabic", 1, 18)); // NOI18N
        classlistLabel.setForeground(new java.awt.Color(255, 255, 255));
        classlistLabel.setText("COURSE NAME");

        guaranteeGroupSizeCheckBox.setForeground(new java.awt.Color(255, 255, 255));
        guaranteeGroupSizeCheckBox.setSelected(true);
        guaranteeGroupSizeCheckBox.setText("Guarantee group size");

        buttonGroupSBS.add(balanceGPARadioButton);
        balanceGPARadioButton.setForeground(new java.awt.Color(255, 255, 255));
        balanceGPARadioButton.setSelected(true);
        balanceGPARadioButton.setText("Balance GPA among groups");

        buttonGroupSBS.add(randomizeRadioButton);
        randomizeRadioButton.setForeground(new java.awt.Color(255, 255, 255));
        randomizeRadioButton.setText("Randomize class list");

        buttonGroupSBS.add(assignSequentiallyRadioButton);
        assignSequentiallyRadioButton.setForeground(new java.awt.Color(255, 255, 255));
        assignSequentiallyRadioButton.setText("Assign sequentially");

        javax.swing.GroupLayout profPanelLayout = new javax.swing.GroupLayout(profPanel);
        profPanel.setLayout(profPanelLayout);
        profPanelLayout.setHorizontalGroup(
            profPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(profPanelLayout.createSequentialGroup()
                .addGroup(profPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(profPanelLayout.createSequentialGroup()
                        .addGroup(profPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(profPanelLayout.createSequentialGroup()
                                .addGap(152, 152, 152)
                                .addComponent(classlistLabel))
                            .addGroup(profPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(profPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(profPanelLayout.createSequentialGroup()
                                        .addGap(15, 15, 15)
                                        .addComponent(jLabel1)
                                        .addGap(18, 18, 18)
                                        .addComponent(GroupSizeField, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(guaranteeGroupSizeCheckBox)
                                    .addComponent(addStudentButton)
                                    .addGroup(profPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(assignSequentiallyRadioButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(randomizeRadioButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(balanceGPARadioButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                        .addGroup(profPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(profPanelLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(profPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(ParametersLabel1)
                                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(forbidButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(mandateButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(profPanelLayout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(createGroupsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(profPanelLayout.createSequentialGroup()
                        .addGap(363, 363, 363)
                        .addComponent(ParametersLabel)))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        profPanelLayout.setVerticalGroup(
            profPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(profPanelLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(ParametersLabel)
                .addGap(18, 18, 18)
                .addGroup(profPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(classlistLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ParametersLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(profPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(profPanelLayout.createSequentialGroup()
                        .addGroup(profPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(profPanelLayout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addComponent(addStudentButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(guaranteeGroupSizeCheckBox)))
                        .addGroup(profPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(profPanelLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(mandateButton)
                                .addGap(15, 15, 15)
                                .addComponent(forbidButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(profPanelLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(balanceGPARadioButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(randomizeRadioButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(assignSequentiallyRadioButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(profPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(createGroupsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(GroupSizeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))))
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(profPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(profPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void createGroupsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createGroupsBtnActionPerformed
        int groupSize = Integer.parseInt(GroupSizeField.getText());
        boolean guaranteeGroupSize = guaranteeGroupSizeCheckBox.isSelected(); 
        boolean balanceGPA = balanceGPARadioButton.isSelected();
        boolean randomize = randomizeRadioButton.isSelected();
        boolean sequential = assignSequentiallyRadioButton.isSelected(); 
        sessionController.useGroupMaker(groupSize, guaranteeGroupSize, balanceGPA, randomize, sequential); //List of groups is inside sessionController
        close();
        GroupsInterface groupsIF = new GroupsInterface(sessionController);
        groupsIF.setVisible(true);
    }//GEN-LAST:event_createGroupsBtnActionPerformed

    private void ClassListAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_ClassListAncestorAdded

    }//GEN-LAST:event_ClassListAncestorAdded

    private void ClassListPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_ClassListPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_ClassListPropertyChange

    private void addStudentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addStudentButtonActionPerformed
        DefaultListModel dlm = (DefaultListModel) jList1.getModel(); 
        dlm.addElement(ClassList.getSelectedValue()); 
    }//GEN-LAST:event_addStudentButtonActionPerformed

    private void forbidButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_forbidButtonActionPerformed
        DefaultListModel dlm = (DefaultListModel) jList1.getModel();
        Object[] students = dlm.toArray();
        sessionController.forbid(students);
        JOptionPane.showMessageDialog(profPanel, "These students will not be assigned to the same group.");  
        dlm.clear(); 
    }//GEN-LAST:event_forbidButtonActionPerformed

    private void mandateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mandateButtonActionPerformed
        DefaultListModel dlm = (DefaultListModel) jList1.getModel();
        Object[] students = dlm.toArray();
        sessionController.mandate(students);
        JOptionPane.showMessageDialog(profPanel, "These students will be assigned to the same group.");  
        dlm.clear();
    }//GEN-LAST:event_mandateButtonActionPerformed

    private void GroupSizeFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GroupSizeFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_GroupSizeFieldActionPerformed
     private void close() {
        setVisible(false); //you can't see me!
        dispose();        
    }
 
    public void main(String args[]) {
      
    
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProfParametersInterface(sessionController.getCourseName()).setVisible(true);
            }
        });
        
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList ClassList;
    private javax.swing.JTextField GroupSizeField;
    private javax.swing.JLabel ParametersLabel;
    private javax.swing.JLabel ParametersLabel1;
    private javax.swing.JButton addStudentButton;
    private javax.swing.JRadioButton assignSequentiallyRadioButton;
    private javax.swing.JRadioButton balanceGPARadioButton;
    private javax.swing.ButtonGroup buttonGroupSBS;
    private javax.swing.JLabel classlistLabel;
    private javax.swing.JButton createGroupsBtn;
    private javax.swing.JButton forbidButton;
    private javax.swing.JCheckBox guaranteeGroupSizeCheckBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JList jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JButton mandateButton;
    private javax.swing.JPanel profPanel;
    private javax.swing.JRadioButton randomizeRadioButton;
    // End of variables declaration//GEN-END:variables
}