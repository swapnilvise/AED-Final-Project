/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.Role;
import Business.Role.StudentUsherRole;
import java.util.ArrayList;

/**
 *
 * @author swapn
 */
public class StudentUsherOrganization extends Organization{
    
    public StudentUsherOrganization() {
        super(Organization.Type.StudentUsher.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new StudentUsherRole());
        return roles;
    }
    
}
