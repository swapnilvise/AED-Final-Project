/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Organization.Organization.Type;
import java.util.ArrayList;
//import static Business.Organization.Organization.Type.InsuranceFinanceTeamOrganization;

/**
 *
 * @author Sumit
 */
public class OrganizationDirectory {

    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList();
    }

    public ArrayList<Organization> getOrganizations() {
        return organizationList;
    }

    /**
     * Accepts the organization type as input and returns new Organization
     * object of the same type.
     *
     * @param type
     * @return
     */
    public Organization createOrganization(Type type) {
        Organization organization = null;

        if (type.getValue().equals(Type.StudentUsher.getValue())) {
            organization = new StudentUsherOrganization();
            organizationList.add(organization);
        }

        return organization;
    }
}
