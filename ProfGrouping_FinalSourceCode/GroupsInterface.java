
package profgrouping;

import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.ListModel;

public class GroupsInterface extends javax.swing.JFrame {

    private SessionController sessionController; 
    
    public GroupsInterface(SessionController scFromParametersInterface) {
        sessionController = scFromParametersInterface; 
        initComponents();
        groupListLabel.setText(groupListLabel.getText() + sessionController.getCourseName());
        refreshGroupListTextArea();
        setStudentComboBoxesModels(); 
        refreshGroupComboBox();        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        groupsPanel = new javax.swing.JPanel();
        groupListLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        groupListTextArea = new javax.swing.JTextArea();
        saveButton = new javax.swing.JButton();
        reassignButton = new javax.swing.JButton();
        swapButton = new javax.swing.JButton();
        student1ComboBox = new javax.swing.JComboBox();
        student2ComboBox = new javax.swing.JComboBox();
        studentToMoveComboBox = new javax.swing.JComboBox();
        GroupComboBox = new javax.swing.JComboBox();
        moveButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        groupsPanel.setBackground(new java.awt.Color(0, 51, 102));

        groupListLabel.setFont(new java.awt.Font("Simplified Arabic", 0, 25)); // NOI18N
        groupListLabel.setForeground(new java.awt.Color(255, 255, 255));
        groupListLabel.setText("Groups Generated for ");

        groupListTextArea.setEditable(false);
        groupListTextArea.setColumns(20);
        groupListTextArea.setRows(5);
        jScrollPane1.setViewportView(groupListTextArea);

        saveButton.setBackground(new java.awt.Color(0, 102, 102));
        saveButton.setFont(new java.awt.Font("Simplified Arabic", 0, 14)); // NOI18N
        saveButton.setText("Save and Exit");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        reassignButton.setBackground(new java.awt.Color(0, 102, 51));
        reassignButton.setFont(new java.awt.Font("Simplified Arabic", 0, 14)); // NOI18N
        reassignButton.setText("Re-assign groups");
        reassignButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reassignButtonActionPerformed(evt);
            }
        });

        swapButton.setText("Swap");
        swapButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                swapButtonActionPerformed(evt);
            }
        });

        student1ComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        student1ComboBox.setMaximumSize(new java.awt.Dimension(56, 20));

        student2ComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        student2ComboBox.setMaximumSize(new java.awt.Dimension(56, 20));

        studentToMoveComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        studentToMoveComboBox.setMaximumSize(new java.awt.Dimension(56, 20));

        GroupComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        GroupComboBox.setMaximumSize(new java.awt.Dimension(56, 20));

        moveButton.setText("Move");
        moveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                moveButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout groupsPanelLayout = new javax.swing.GroupLayout(groupsPanel);
        groupsPanel.setLayout(groupsPanelLayout);
        groupsPanelLayout.setHorizontalGroup(
            groupsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(groupsPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(groupsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(groupListLabel)
                    .addGroup(groupsPanelLayout.createSequentialGroup()
                        .addGroup(groupsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(saveButton))
                        .addGroup(groupsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(groupsPanelLayout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addGroup(groupsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(studentToMoveComboBox, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(student2ComboBox, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(student1ComboBox, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(GroupComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(groupsPanelLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(reassignButton))
                            .addGroup(groupsPanelLayout.createSequentialGroup()
                                .addGroup(groupsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(groupsPanelLayout.createSequentialGroup()
                                        .addGap(76, 76, 76)
                                        .addComponent(swapButton, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(groupsPanelLayout.createSequentialGroup()
                                        .addGap(78, 78, 78)
                                        .addComponent(moveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(30, 30, 30))
        );
        groupsPanelLayout.setVerticalGroup(
            groupsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(groupsPanelLayout.createSequentialGroup()
                .addGroup(groupsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(groupsPanelLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(groupListLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addGroup(groupsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(reassignButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(groupsPanelLayout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(student1ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(student2ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(swapButton)
                        .addGap(53, 53, 53)
                        .addComponent(studentToMoveComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addComponent(GroupComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(moveButton)))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(groupsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(groupsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void reassignButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reassignButtonActionPerformed
        close();
        ProfParametersInterface profIF = new ProfParametersInterface(sessionController.getCourseName());
        profIF.setVisible(true);
    }//GEN-LAST:event_reassignButtonActionPerformed

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        close();
        sessionController.save(groupListTextArea.getText()); 
        JOptionPane.showMessageDialog(groupsPanel, "The list of groups has been saved to " + sessionController.getCourseName() +"_Groups.txt"); 
        //Display message to say that the group list has been saved. 
        WelcomeInterface welcomeIF = new WelcomeInterface();
        welcomeIF.setVisible(true);
    }//GEN-LAST:event_saveButtonActionPerformed

    private void swapButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_swapButtonActionPerformed
        Student student1 = (Student) student1ComboBox.getSelectedItem();
        Student student2 = (Student) student2ComboBox.getSelectedItem();
        sessionController.swap(student1, student2);
        refreshGroupListTextArea();
        refreshGroupComboBox(); 
    }//GEN-LAST:event_swapButtonActionPerformed

    private void moveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_moveButtonActionPerformed
        Student s = (Student) studentToMoveComboBox.getSelectedItem();
        Group g = (Group) GroupComboBox.getSelectedItem();
        sessionController.moveStudentToGroup(s, g);
        refreshGroupListTextArea();
        refreshGroupComboBox(); 
    }//GEN-LAST:event_moveButtonActionPerformed
    private void close() {
        setVisible(false);
        dispose();     
    }
    public void main(String args[]) {
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
            java.util.logging.Logger.getLogger(GroupsInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GroupsInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GroupsInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GroupsInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GroupsInterface(sessionController).setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox GroupComboBox;
    private javax.swing.JLabel groupListLabel;
    private javax.swing.JTextArea groupListTextArea;
    private javax.swing.JPanel groupsPanel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton moveButton;
    private javax.swing.JButton reassignButton;
    private javax.swing.JButton saveButton;
    private javax.swing.JComboBox student1ComboBox;
    private javax.swing.JComboBox student2ComboBox;
    private javax.swing.JComboBox studentToMoveComboBox;
    private javax.swing.JButton swapButton;
    // End of variables declaration//GEN-END:variables

    private void refreshGroupListTextArea() {
        groupListTextArea.setText(""); 
        ArrayList<Group> groupList = sessionController.getGroupList();
        for (int i = 0; i <= groupList.size() - 1; i++) {
            String toAppend = "";
            toAppend += groupList.get(i); //implicitly calls Group.toString() to concatenate
            groupListTextArea.append(toAppend); 
        }
    }

    private void refreshGroupComboBox() {
        DefaultComboBoxModel groupComboBoxModel = new DefaultComboBoxModel();
        ArrayList<Group> groupList = sessionController.getGroupList(); 
        for (Group g : groupList) {
            groupComboBoxModel.addElement(g); 
        }
        GroupComboBox.setModel(groupComboBoxModel); 
    }
DefaultComboBoxModel studentComboBoxModel1 = new DefaultComboBoxModel();
    private void setStudentComboBoxesModels() {
        DefaultComboBoxModel studentComboBoxModel1 = new DefaultComboBoxModel();
        DefaultComboBoxModel studentComboBoxModel2 = new DefaultComboBoxModel();
        DefaultComboBoxModel studentComboBoxModel3 = new DefaultComboBoxModel();
        ArrayList<Student> classlist = sessionController.getClasslist();
        for (Student s : classlist) {
            studentComboBoxModel1.addElement(s); 
        }
        for (Student s : classlist) {
            studentComboBoxModel2.addElement(s); 
        }
        for (Student s : classlist) {
            studentComboBoxModel3.addElement(s); 
        }
        student1ComboBox.setModel(studentComboBoxModel1);
        student2ComboBox.setModel(studentComboBoxModel2); 
        studentToMoveComboBox.setModel(studentComboBoxModel3);
    }
}
