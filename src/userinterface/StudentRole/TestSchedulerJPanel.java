/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.StudentRole;

import Business.AppointmentDetails.AppointmentDetails;
import Business.AppointmentDetails.AppointmentDirectory;
import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import userinterface.LoginPage.LoginPageJPanel;

/**
 *
 * @author swapn
 */
public class TestSchedulerJPanel extends javax.swing.JPanel {

    private JPanel container;
    private EcoSystem ecosystem;
    private DB4OUtil dB4OUtil;
    private UserAccount userAccount;
    private String PatientID;
    private AppointmentDetails ad;

    /**
     * Creates new form TestSchedulerJPanel
     */
    public TestSchedulerJPanel(JPanel container, UserAccount userAccount, EcoSystem ecosystem, DB4OUtil dB4OUtil) {
        initComponents();
        this.container = container;
        this.ecosystem = ecosystem;
        this.dB4OUtil = dB4OUtil;
        this.userAccount = userAccount;
//        lbl_Details.setText("Details for, ");
    }

    protected void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        int width = getWidth();
        int height = getHeight();

        Color color1 = new Color(0, 0, 0);
        Color color2 = new Color(51, 51, 51);
        GradientPaint gp = new GradientPaint(0, 0, color1, 0, height, color2);
        g2d.setPaint(gp);
        g2d.fillRect(0, 0, width, height);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblWelcome = new javax.swing.JLabel();
        logoutButton1 = new javax.swing.JButton();
        lbl_Greetings = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lbl_AppointmentDate = new javax.swing.JLabel();
        lbl_AppointmentDate1 = new javax.swing.JLabel();
        lbl_AppointmentDate2 = new javax.swing.JLabel();
        txt_ComplianceStatus = new javax.swing.JTextField();
        btn_CheckIn = new javax.swing.JButton();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jComboBox1 = new javax.swing.JComboBox<>();
        btn_Back = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 0, 0));

        lblWelcome.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        lblWelcome.setForeground(new java.awt.Color(204, 204, 204));
        lblWelcome.setText("Welcome <UserName>");

        logoutButton1.setBackground(new java.awt.Color(102, 102, 102));
        logoutButton1.setText("Logout");
        logoutButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButton1ActionPerformed(evt);
            }
        });

        lbl_Greetings.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        lbl_Greetings.setForeground(new java.awt.Color(204, 204, 204));
        lbl_Greetings.setText("Greetings!");

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        lbl_AppointmentDate.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        lbl_AppointmentDate.setForeground(new java.awt.Color(204, 204, 204));
        lbl_AppointmentDate.setText("Appointment Date : ");

        lbl_AppointmentDate1.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        lbl_AppointmentDate1.setForeground(new java.awt.Color(204, 204, 204));
        lbl_AppointmentDate1.setText("Appointment Time : ");

        lbl_AppointmentDate2.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        lbl_AppointmentDate2.setForeground(new java.awt.Color(204, 204, 204));
        lbl_AppointmentDate2.setText("Compliance Status : ");

        txt_ComplianceStatus.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        txt_ComplianceStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_ComplianceStatusActionPerformed(evt);
            }
        });

        btn_CheckIn.setBackground(new java.awt.Color(102, 102, 102));
        btn_CheckIn.setFont(new java.awt.Font("Segoe UI Light", 2, 16)); // NOI18N
        btn_CheckIn.setText("Save");
        btn_CheckIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CheckInActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "6:00 AM", "6:30 AM", "7:00 AM", "7:30 AM", "8:00 AM", "8:30 AM", "9:00 AM", "9:30 AM", "10:00 AM", "10:30 AM", "11:00 AM", "11:30 AM", "12:00 PM", "12:30 PM", "1:00 PM", "1:30 PM", "2:00 PM", "2:30 PM", "3:00 PM", "3:30 PM", "4:00 PM", "4:30 PM", "5:00 PM", "5:30 PM", "6:00 PM", "6:30 PM" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lbl_AppointmentDate2)
                                .addGap(18, 18, 18)
                                .addComponent(txt_ComplianceStatus))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbl_AppointmentDate1)
                                    .addComponent(lbl_AppointmentDate))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jDateChooser2, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                    .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(192, 192, 192)
                        .addComponent(btn_CheckIn)))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbl_AppointmentDate)
                    .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_AppointmentDate1)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_AppointmentDate2)
                    .addComponent(txt_ComplianceStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btn_CheckIn)
                .addContainerGap(261, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jComboBox1, jDateChooser2});

        btn_Back.setBackground(new java.awt.Color(102, 102, 102));
        btn_Back.setFont(new java.awt.Font("Segoe UI Light", 0, 11)); // NOI18N
        btn_Back.setText("Back");
        btn_Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_BackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_Back, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(888, 888, 888)
                        .addComponent(lblWelcome, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(logoutButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lbl_Greetings, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblWelcome)
                        .addComponent(btn_Back))
                    .addComponent(logoutButton1))
                .addGap(29, 29, 29)
                .addComponent(lbl_Greetings)
                .addGap(48, 48, 48)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(106, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void logoutButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButton1ActionPerformed
        // TODO add your handling code here:
        container.removeAll();
        LoginPageJPanel lpp = new LoginPageJPanel(container, ecosystem, dB4OUtil);
        container.add("LoginPageJPanel", lpp);
        CardLayout crdLyt = (CardLayout) container.getLayout();
        crdLyt.next(container);
        dB4OUtil.storeSystem(ecosystem);
    }//GEN-LAST:event_logoutButton1ActionPerformed

    private void btn_CheckInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CheckInActionPerformed
        // TODO add your handling code here:
//        System.out.println(ad);
//        System.out.println(ad);
container.removeAll();
        System.out.println(jDateChooser2.getDate().toString());
        System.out.println(jComboBox1.getSelectedItem());
        AppointmentDetails ad = this.ecosystem.getAh().getAppointmentHistory().createAppointment(jDateChooser2.getDateFormatString(), jDateChooser2.getDate().toString());
//      ad.createAppointment(txt_AppointmentDate.getText(), txt_AppointmentTime.getText());
//      txt_AppointmentDate.getText()
        JOptionPane.showMessageDialog(this, "Appointment Booked for Testing");
    }//GEN-LAST:event_btn_CheckInActionPerformed

    private void btn_BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_BackActionPerformed
        // TODO add your handling code here:
        container.removeAll();
        StudentWorkAreaJPanel swa = new StudentWorkAreaJPanel(container, userAccount, ecosystem, dB4OUtil);
        container.add("StudentWorkAreaJPanel", swa);
        CardLayout crdLyt = (CardLayout) container.getLayout();
        crdLyt.next(container);
        dB4OUtil.storeSystem(ecosystem);
    }//GEN-LAST:event_btn_BackActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void txt_ComplianceStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_ComplianceStatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_ComplianceStatusActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Back;
    private javax.swing.JButton btn_CheckIn;
    private javax.swing.JComboBox<String> jComboBox1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblWelcome;
    private javax.swing.JLabel lbl_AppointmentDate;
    private javax.swing.JLabel lbl_AppointmentDate1;
    private javax.swing.JLabel lbl_AppointmentDate2;
    private javax.swing.JLabel lbl_Greetings;
    private javax.swing.JButton logoutButton1;
    private javax.swing.JTextField txt_ComplianceStatus;
    // End of variables declaration//GEN-END:variables
}