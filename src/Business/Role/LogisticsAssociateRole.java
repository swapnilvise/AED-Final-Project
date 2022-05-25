/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.TestingCenter.LogisticsAssociateRole.LogisticsAssociateWorkAreaJPanel;
import userinterface.TestingCenter.StudentUsher.StudentUsherWorkAreaJPanel;

/**
 *
 * @author swapn
 */
public class LogisticsAssociateRole extends Role{
    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account,Organization organization, Enterprise enterprise, EcoSystem business,DB4OUtil dB4OUtil) {
        return new LogisticsAssociateWorkAreaJPanel(userProcessContainer,account,business, dB4OUtil);
    } 
    
}
