/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;

import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import userinterface.RestaurantAdminRole.AdminWorkAreaJPanel;
import javax.swing.JPanel;
import userinterface.TestingCenter.StudentUsher.StudentUsherWorkAreaJPanel;

/**
 *
 * @author raunak
 */
public class StudentUsherRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account,Organization organization, Enterprise enterprise, EcoSystem business,DB4OUtil dB4OUtil) {
        return new StudentUsherWorkAreaJPanel(userProcessContainer,account,business, dB4OUtil);
    }   
    
}
