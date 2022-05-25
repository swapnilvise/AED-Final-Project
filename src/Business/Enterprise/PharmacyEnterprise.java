/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Organization.Organization;
import Business.Pharmacy.Medicine;
import Business.Pharmacy.Pharmacy;
import Business.Role.Role;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author SHRISHTI
 */
public class PharmacyEnterprise extends Enterprise {

    private Pharmacy pharmacy;

    public PharmacyEnterprise(String name) {
        super(name, EnterpriseType.Pharmacy);
        this.pharmacy = new Pharmacy();
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }

    /**
     * Returns list of all organizations belonging to Pharmacy Enterprise.
     *
     * @return List of organization types
     */
    public List<Organization.Type> getAllOrganizationTypes() {
        List<Organization.Type> orgTypes = new ArrayList<>();
        orgTypes.add(Organization.Type.Pharmacist);
        orgTypes.add(Organization.Type.DeliveryMan);

        return orgTypes;

    }

    public Pharmacy getPharmacy() {
        return pharmacy;
    }

    public void addMedicine(Medicine m){
        this.pharmacy.getMedicineList().add(m);
    }
    
    public void setPharmacy(Pharmacy pharmacyDirectory) {
        this.pharmacy = pharmacy;
    }

}
