/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frame.Admin;

import Entity.User;
import Repository.UserRepo;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ash
 */
public class PanelAllUsers extends javax.swing.JPanel {

    /**
     * Creates new form PanelAllUsers
     */
    User user;
    UserRepo ur;
    ArrayList<User> users;

    public PanelAllUsers(User user) {
        initComponents();
        this.user = user;
        ur = new UserRepo();
        users = new ArrayList<>();

        updateUsersTable();

        passwordChangeTf.setVisible(false);
        newUsernameTf.setVisible(false);

        userTypeChooser.setVisible(false);

        confirmPasswordChangeBtn.setVisible(false);
        confirmNewUserBtn.setVisible(false);
        confirmRemoveUserBtn.setVisible(false);

    }

    public void updateUsersTable() {
        users.clear();

        users = ur.getAllUser();

        DefaultTableModel model = (DefaultTableModel) allUsersTable.getModel();
        model.setRowCount(0);

        for (int i = 0; i < users.size(); ++i) {
            model.addRow(allUsersTableRowData(users.get(i)));
        }
    }

    public Object[] allUsersTableRowData(User user) {
        Object[] rowdata = {user.getUserId(), user.getRole(), user.getPassword()};
        return rowdata;
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
        allUsersTable = new javax.swing.JTable();
        addUserBtn = new javax.swing.JButton();
        removeUserBtn = new javax.swing.JButton();
        changePasswordBtn = new javax.swing.JButton();
        passwordChangeTf = new javax.swing.JTextField();
        confirmPasswordChangeBtn = new javax.swing.JButton();
        newUsernameTf = new javax.swing.JTextField();
        userTypeChooser = new javax.swing.JComboBox<>();
        confirmNewUserBtn = new javax.swing.JButton();
        confirmRemoveUserBtn = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(1100, 700));

        allUsersTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "username", "Role", "Password"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(allUsersTable);

        addUserBtn.setText("Add User");
        addUserBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addUserBtnActionPerformed(evt);
            }
        });

        removeUserBtn.setText("Remove User");
        removeUserBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeUserBtnActionPerformed(evt);
            }
        });

        changePasswordBtn.setText("Change Password");
        changePasswordBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changePasswordBtnActionPerformed(evt);
            }
        });

        passwordChangeTf.setMaximumSize(new java.awt.Dimension(200, 26));
        passwordChangeTf.setMinimumSize(new java.awt.Dimension(200, 26));

        confirmPasswordChangeBtn.setText("Confirm");
        confirmPasswordChangeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmPasswordChangeBtnActionPerformed(evt);
            }
        });

        newUsernameTf.setMaximumSize(new java.awt.Dimension(200, 26));
        newUsernameTf.setMinimumSize(new java.awt.Dimension(200, 26));

        userTypeChooser.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "user", "agent", "admin","deliveryman" }));
        userTypeChooser.setSelectedIndex(0);

        confirmNewUserBtn.setText("Confirm");
        confirmNewUserBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmNewUserBtnActionPerformed(evt);
            }
        });

        confirmRemoveUserBtn.setText("Confirm");
        confirmRemoveUserBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmRemoveUserBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(addUserBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(changePasswordBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                    .addComponent(removeUserBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(passwordChangeTf, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                    .addComponent(newUsernameTf, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(userTypeChooser, 0, 119, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(confirmNewUserBtn)
                    .addComponent(confirmPasswordChangeBtn, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(confirmRemoveUserBtn, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(addUserBtn)
                            .addComponent(newUsernameTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(userTypeChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(confirmNewUserBtn))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(changePasswordBtn)
                            .addComponent(passwordChangeTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(confirmPasswordChangeBtn))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(confirmRemoveUserBtn)
                            .addComponent(removeUserBtn)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 674, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void addUserBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addUserBtnActionPerformed
        // TODO add your handling code here:
        newUsernameTf.setVisible(true);
        userTypeChooser.setVisible(true);
        confirmNewUserBtn.setVisible(true);
    }//GEN-LAST:event_addUserBtnActionPerformed

    private void confirmNewUserBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmNewUserBtnActionPerformed
        // TODO add your handling code here:
        newUsernameTf.setVisible(false);
        userTypeChooser.setVisible(false);
        confirmNewUserBtn.setVisible(false);

        if (ur.getUser(newUsernameTf.getText()) == null) {
            ur.addNewUser(new User(newUsernameTf.getText(), newUsernameTf.getText(), userTypeChooser.getSelectedItem().toString()));
            JOptionPane.showMessageDialog(this, "New " + userTypeChooser.getSelectedItem().toString() + " account created\nUsername : " + newUsernameTf.getText() + "\nPassword : " + newUsernameTf.getText() + " ", "Success", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "Account already exists with the username", "Error", JOptionPane.ERROR_MESSAGE);
        }
        updateUsersTable();
    }//GEN-LAST:event_confirmNewUserBtnActionPerformed

    private void changePasswordBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changePasswordBtnActionPerformed
        // TODO add your handling code here:

        if (allUsersTable.getSelectedRow() != -1) {

            passwordChangeTf.setVisible(true);
            confirmPasswordChangeBtn.setVisible(true);

        } else {
            JOptionPane.showMessageDialog(this, "Select a user first", "Error", JOptionPane.ERROR_MESSAGE);
        }


    }//GEN-LAST:event_changePasswordBtnActionPerformed

    private void confirmPasswordChangeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmPasswordChangeBtnActionPerformed
        // TODO add your handling code here:

        DefaultTableModel model = (DefaultTableModel) allUsersTable.getModel();
        passwordChangeTf.setVisible(false);
        confirmPasswordChangeBtn.setVisible(false);

        if (allUsersTable.getSelectedRow() != -1) {

            String username = model.getValueAt(allUsersTable.getSelectedRow(), 0).toString();

            ur.updatePassword(username, passwordChangeTf.getText());

            JOptionPane.showMessageDialog(this, "Password updated", "Success", JOptionPane.INFORMATION_MESSAGE);

        } else {
            JOptionPane.showMessageDialog(this, "Select a user first", "Error", JOptionPane.ERROR_MESSAGE);
        }
        updateUsersTable();
    }//GEN-LAST:event_confirmPasswordChangeBtnActionPerformed

    private void removeUserBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeUserBtnActionPerformed
        // TODO add your handling code here:
        if (allUsersTable.getSelectedRow() != -1) {
            confirmRemoveUserBtn.setVisible(true);
        }
    }//GEN-LAST:event_removeUserBtnActionPerformed

    private void confirmRemoveUserBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmRemoveUserBtnActionPerformed
        // TODO add your handling code here:
        
        DefaultTableModel model = (DefaultTableModel) allUsersTable.getModel();
        confirmRemoveUserBtn.setVisible(true);
        if (allUsersTable.getSelectedRow() != -1) {
            if(ur.removeUser(model.getValueAt(allUsersTable.getSelectedRow(), 0).toString())){
                JOptionPane.showMessageDialog(this, "User Removed", "Success", JOptionPane.INFORMATION_MESSAGE);
            }
        }
        updateUsersTable();
    }//GEN-LAST:event_confirmRemoveUserBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addUserBtn;
    private javax.swing.JTable allUsersTable;
    private javax.swing.JButton changePasswordBtn;
    private javax.swing.JButton confirmNewUserBtn;
    private javax.swing.JButton confirmPasswordChangeBtn;
    private javax.swing.JButton confirmRemoveUserBtn;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField newUsernameTf;
    private javax.swing.JTextField passwordChangeTf;
    private javax.swing.JButton removeUserBtn;
    private javax.swing.JComboBox<String> userTypeChooser;
    // End of variables declaration//GEN-END:variables
}