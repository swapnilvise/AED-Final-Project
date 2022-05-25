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
import javax.swing.JPanel;

/**
 *
 * @author raunak
 */
public abstract class Role {
    
    public enum RoleType{
        RestaurantAdmin("RestaurantAdmin"),
        Customer("Customer"),
        DeliveryMan("Delivery"),
        SysAdmin("Sysadmin"),
        StudentUsher("StudentUsher"),
        SwabCollector("SwabCollector"),
        PatientAssociate("PatientAssociate"),
        LogisticsAssociate("LogisticsAssociate"),
        Doctor("Doctor"),
        LabAssistant("LabAssistant"),
        Student("Student");
        
        private String value;
        private RoleType(String value){
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }
    
    public abstract JPanel createWorkArea(JPanel userProcessContainer, 
            UserAccount account, 
            Organization organization,
            Enterprise enterprise,
            EcoSystem business,DB4OUtil dB4OUtil);

    @Override
    public String toString() {
        return this.getClass().getName();
    }
    
    
}