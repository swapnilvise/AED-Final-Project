/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.DoctorRole;

import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.DoctorOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.PatientTreatmentWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author SHRISHTI
 */
public class DoctorWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form DoctorWorkAreaPanel
     */
    
    private JPanel userProcessContainer;
    private DoctorOrganization doctorOrganization;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private EcoSystem ecosystem;
    private DB4OUtil dB4OUtil;
    private Organization organization;
    
    public DoctorWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem ecosystem,DB4OUtil dB4OUtil) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.organization = organization;
        this.enterprise = enterprise;
        this.userAccount = account;
        this.ecosystem=ecosystem;
        this.dB4OUtil=dB4OUtil;
//        valueLabel.setText(enterprise.getName());
        populateRequestTable();
    }
    
    public void populateRequestTable() {

        DefaultTableModel model = (DefaultTableModel) workRequestJTable.getModel();

        model.setRowCount(0);

        for (WorkRequest request : doctorOrganization.getWorkQueue().getWorkRequestList()) {
            Object[] row = new Object[8];
            row[0] = ((PatientTreatmentWorkRequest) request).getRegistrationDate();
//            row[1] = String.valueOf(((PatientTreatmentWorkRequest) request).getStudent().getStudentID());
//            row[2] = ((PatientTreatmentWorkRequest) request).getStudent().getStudentFirstName() + " " + ((PatientTreatmentWorkRequest) request).getStudent().getStudentLastName();
            row[3] = ((PatientTreatmentWorkRequest) request);
            row[4] = ((PatientTreatmentWorkRequest) request).getAssignedDoctor();
            row[5] = ((PatientTreatmentWorkRequest) request).getLabAssistant();
            row[6] = ((PatientTreatmentWorkRequest) request).getLabResult();
            row[7] = request.getStatus();

            model.addRow(row);

        }

        TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(model);
        workRequestJTable.setRowSorter(sorter);
        workRequestJTable.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnLogout = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        workRequestJTable = new javax.swing.JTable();
        btnViewPatient = new javax.swing.JButton();
        btnAssignToMe = new javax.swing.JButton();
        requestTestJButton = new javax.swing.JButton();
        btnProvidePrescription = new javax.swing.JButton();
        btnComplete = new javax.swing.JButton();
        valueLabel = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Doctor Work Area");

        btnLogout.setText("Logout");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        jLabel2.setText("Medical Test Work Queue");

        jLabel3.setText("Enterprise: ");

        workRequestJTable.setBackground(new java.awt.Color(13, 17, 23));
        workRequestJTable.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        workRequestJTable.setForeground(new java.awt.Color(188, 188, 188));
        workRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Patient Registration Date", "Patient Id", "Patient Name", "Illness", "Assigned Doctor", "Lab Assistant", "Lab Result", "Treatment Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        workRequestJTable.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(workRequestJTable);

        btnViewPatient.setBackground(new java.awt.Color(13, 17, 23));
        btnViewPatient.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnViewPatient.setForeground(new java.awt.Color(188, 188, 188));
        btnViewPatient.setText("View Patient");
        btnViewPatient.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnViewPatientMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnViewPatientMouseExited(evt);
            }
        });
        btnViewPatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewPatientActionPerformed(evt);
            }
        });

        btnAssignToMe.setBackground(new java.awt.Color(13, 17, 23));
        btnAssignToMe.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnAssignToMe.setForeground(new java.awt.Color(188, 188, 188));
        btnAssignToMe.setText("Assign To Me");
        btnAssignToMe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAssignToMeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAssignToMeMouseExited(evt);
            }
        });
        btnAssignToMe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignToMeActionPerformed(evt);
            }
        });

        requestTestJButton.setBackground(new java.awt.Color(13, 17, 23));
        requestTestJButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        requestTestJButton.setForeground(new java.awt.Color(188, 188, 188));
        requestTestJButton.setText("Request Lab Test");
        requestTestJButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                requestTestJButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                requestTestJButtonMouseExited(evt);
            }
        });
        requestTestJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestTestJButtonActionPerformed(evt);
            }
        });

        btnProvidePrescription.setBackground(new java.awt.Color(13, 17, 23));
        btnProvidePrescription.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnProvidePrescription.setForeground(new java.awt.Color(188, 188, 188));
        btnProvidePrescription.setText("Provide Prescription");
        btnProvidePrescription.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnProvidePrescriptionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnProvidePrescriptionMouseExited(evt);
            }
        });
        btnProvidePrescription.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProvidePrescriptionActionPerformed(evt);
            }
        });

        btnComplete.setBackground(new java.awt.Color(13, 17, 23));
        btnComplete.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnComplete.setForeground(new java.awt.Color(188, 188, 188));
        btnComplete.setText("Complete Treatment");
        btnComplete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCompleteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCompleteMouseExited(evt);
            }
        });
        btnComplete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCompleteActionPerformed(evt);
            }
        });

        valueLabel.setText("<value>");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(valueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(127, 127, 127))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(56, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnViewPatient, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(btnAssignToMe, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(requestTestJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(btnProvidePrescription, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnComplete, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(144, 144, 144))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(valueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnComplete, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnViewPatient, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAssignToMe, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(requestTestJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnProvidePrescription, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(231, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnViewPatientMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnViewPatientMouseEntered
        // TODO add your handling code here:
        btnViewPatient.setForeground(new Color(0,0,0));
        btnViewPatient.setBackground(new Color(144,202,249));
    }//GEN-LAST:event_btnViewPatientMouseEntered

    private void btnViewPatientMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnViewPatientMouseExited
        // TODO add your handling code here:
        btnViewPatient.setForeground(new Color(188,188,188));
        btnViewPatient.setBackground(new Color(13,17,23));
    }//GEN-LAST:event_btnViewPatientMouseExited

    private void btnViewPatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewPatientActionPerformed
        int selectedRow = workRequestJTable.getSelectedRow();
        PatientTreatmentWorkRequest patientWorkRequest;

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Select a record", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        } else {
            patientWorkRequest = (PatientTreatmentWorkRequest) workRequestJTable.getValueAt(selectedRow, 3);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            userProcessContainer.add("ViewPatientJPanel", new ViewPatientJPanel(userProcessContainer, userAccount, enterprise, patientWorkRequest));
            layout.next(userProcessContainer);
        }
    }//GEN-LAST:event_btnViewPatientActionPerformed

    private void btnAssignToMeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAssignToMeMouseEntered
        // TODO add your handling code here:
        btnAssignToMe.setForeground(new Color(0,0,0));
        btnAssignToMe.setBackground(new Color(144,202,249));
    }//GEN-LAST:event_btnAssignToMeMouseEntered

    private void btnAssignToMeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAssignToMeMouseExited
        // TODO add your handling code here:
        btnAssignToMe.setForeground(new Color(188,188,188));
        btnAssignToMe.setBackground(new Color(13,17,23));
    }//GEN-LAST:event_btnAssignToMeMouseExited

    private void btnAssignToMeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignToMeActionPerformed

        int selectedRow = workRequestJTable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Select a record", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        } else {

            WorkRequest patientTreatmentWorkRequest = (PatientTreatmentWorkRequest) workRequestJTable.getValueAt(selectedRow, 3);
            if (((PatientTreatmentWorkRequest) patientTreatmentWorkRequest).getAssignedDoctor() == null) {

                if (patientTreatmentWorkRequest.getStatus().equalsIgnoreCase("Waiting for Doctor")) {
                    ((PatientTreatmentWorkRequest) patientTreatmentWorkRequest).setAssignedDoctor(userAccount);
                    patientTreatmentWorkRequest.setStatus("Under Consultation");
                    populateRequestTable();
                    JOptionPane.showMessageDialog(null, "Success!! Request is assigned to you.", "Success", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "Cannot assign this patient as its current state is: " + patientTreatmentWorkRequest.getStatus(), "Error", JOptionPane.ERROR_MESSAGE);
                }

            } else {
                if (userAccount.equals(((PatientTreatmentWorkRequest) patientTreatmentWorkRequest).getAssignedDoctor())) {
                    JOptionPane.showMessageDialog(null, "Request is already assigned to you", "Warning", JOptionPane.WARNING_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "Not Authorized", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }//GEN-LAST:event_btnAssignToMeActionPerformed

    private void requestTestJButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_requestTestJButtonMouseEntered
        // TODO add your handling code here:
        requestTestJButton.setForeground(new Color(0,0,0));
        requestTestJButton.setBackground(new Color(144,202,249));
    }//GEN-LAST:event_requestTestJButtonMouseEntered

    private void requestTestJButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_requestTestJButtonMouseExited
        // TODO add your handling code here:
        requestTestJButton.setForeground(new Color(188,188,188));
        requestTestJButton.setBackground(new Color(13,17,23));
    }//GEN-LAST:event_requestTestJButtonMouseExited

    private void requestTestJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestTestJButtonActionPerformed

        int selectedRow = workRequestJTable.getSelectedRow();
        PatientTreatmentWorkRequest workRequest;

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        } else {
            workRequest = (PatientTreatmentWorkRequest) workRequestJTable.getValueAt(selectedRow, 3);
            if (workRequest.getAssignedDoctor() != null) {
                if (userAccount.equals(workRequest.getAssignedDoctor())) {
                    if (workRequest.getStatus().equalsIgnoreCase("Under Consultation")) {

                        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
                        userProcessContainer.add("RequestLabTestJPanel", new RequestLabTestJPanel(userProcessContainer, userAccount, enterprise, workRequest));
                        layout.next(userProcessContainer);
                    } else {
                        JOptionPane.showMessageDialog(null, "Can not create the Lab request as the current status is " + workRequest.getStatus(), "Error", JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Not Authorised", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Assign the request first", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }

    }//GEN-LAST:event_requestTestJButtonActionPerformed

    private void btnProvidePrescriptionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProvidePrescriptionMouseEntered
        // TODO add your handling code here:
        btnProvidePrescription.setForeground(new Color(0,0,0));
        btnProvidePrescription.setBackground(new Color(144,202,249));
    }//GEN-LAST:event_btnProvidePrescriptionMouseEntered

    private void btnProvidePrescriptionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProvidePrescriptionMouseExited
        // TODO add your handling code here:
        btnProvidePrescription.setForeground(new Color(188,188,188));
        btnProvidePrescription.setBackground(new Color(13,17,23));
    }//GEN-LAST:event_btnProvidePrescriptionMouseExited

    private void btnProvidePrescriptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProvidePrescriptionActionPerformed
        int selectedRow = workRequestJTable.getSelectedRow();
        PatientTreatmentWorkRequest workRequest;

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Select a record", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        } else {
            workRequest = (PatientTreatmentWorkRequest) workRequestJTable.getValueAt(selectedRow, 3);
            if (workRequest.getAssignedDoctor() != null) {
                if (userAccount.equals(workRequest.getAssignedDoctor())) {
                    if (workRequest.getStatus().equalsIgnoreCase("Lab Test Completed") || workRequest.getStatus().equalsIgnoreCase("Under Consultation")) {

                        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
                        userProcessContainer.add("ProvidePrescriptionJPanel", new ProvidePrescriptionJPanel(userProcessContainer, userAccount, enterprise, workRequest, ecosystem));
                        layout.next(userProcessContainer);
                    } else {
                        JOptionPane.showMessageDialog(null, "Cannot prescribe the Patient as the status is: " + workRequest.getStatus(), "Error", JOptionPane.ERROR_MESSAGE);
                    }
                } else {

                    JOptionPane.showMessageDialog(null, "Not Authorised", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Assign the request first", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnProvidePrescriptionActionPerformed

    private void btnCompleteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCompleteMouseEntered
        // TODO add your handling code here:
        btnComplete.setForeground(new Color(0,0,0));
        btnComplete.setBackground(new Color(144,202,249));
    }//GEN-LAST:event_btnCompleteMouseEntered

    private void btnCompleteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCompleteMouseExited
        // TODO add your handling code here:
        btnComplete.setForeground(new Color(188,188,188));
        btnComplete.setBackground(new Color(13,17,23));
    }//GEN-LAST:event_btnCompleteMouseExited

    private void btnCompleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCompleteActionPerformed
        int selectedRow = workRequestJTable.getSelectedRow();
        PatientTreatmentWorkRequest workRequest;

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Select a record", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        } else {
            workRequest = (PatientTreatmentWorkRequest) workRequestJTable.getValueAt(selectedRow, 3);
            if (workRequest.getAssignedDoctor() != null) {
                if (userAccount.equals(workRequest.getAssignedDoctor())) {
                    if (workRequest.getStatus().equalsIgnoreCase("Prescription Provided")) {

                        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
//                        userProcessContainer.add("RequestBillingJPanel", new RequestBillingJPanel(userProcessContainer, userAccount, enterprise, workRequest));
//                        workRequest.getStudent().setIsTreatmentFinished(true);
                        layout.next(userProcessContainer);
                    } else {
                        if (workRequest.getStatus().equalsIgnoreCase("Consultation Completed")) {
                            JOptionPane.showMessageDialog(null, "Treatment is already complete", "Error", JOptionPane.ERROR_MESSAGE);
                        } else {
                            JOptionPane.showMessageDialog(null, "Prescription is needed for the treatment to be completed", "Error", JOptionPane.ERROR_MESSAGE);
                        }
                    }
                } else {

                    JOptionPane.showMessageDialog(null, "Not Authorised", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Assign the request first", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnCompleteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAssignToMe;
    private javax.swing.JButton btnComplete;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnProvidePrescription;
    private javax.swing.JButton btnViewPatient;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton requestTestJButton;
    private javax.swing.JLabel valueLabel;
    private javax.swing.JTable workRequestJTable;
    // End of variables declaration//GEN-END:variables
}
