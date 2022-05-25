/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.LabAssistantRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author SHRISHTI
 */
public class TestingLabOrganization extends Organization {
    
    public TestingLabOrganization() {
        super(Organization.Type.TestingLab.getValue());
    }

    /**
     * Returns list of all supported role belonging to Testing Lab Organization.
     *
     * @return List of roles
     */
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new LabAssistantRole());
        return roles;
    }
}
