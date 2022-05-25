/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.PatientAssociateRole;
import Business.Role.Role;
import Business.Role.StudentUsherRole;
import java.util.ArrayList;

/**
 *
 * @author swapn
 */
public class PatientAssociateOrganization extends Organization{
    
    public PatientAssociateOrganization() {
        super(Organization.Type.PatientAssociate.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new PatientAssociateRole());
        return roles;
    }
    
}
