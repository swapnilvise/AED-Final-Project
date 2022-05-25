/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Pharmacy.Medicine;
import Business.UserAccount.UserAccount;
import java.util.HashMap;

/**
 *
 * @author SHRISHTI
 */
public class MedicalDeliveryWorkRequest extends WorkRequest {
    
    private HashMap<Medicine,Integer> medicines;
    private UserAccount assignedDoctor;
    private UserAccount deliveryMan;
    private String status;

    public MedicalDeliveryWorkRequest() {
        this.medicines= new HashMap<>();
    }

    public UserAccount getAssignedDoctor() {
        return assignedDoctor;
    }

    public void setAssignedDoctor(UserAccount assignedDoctor) {
        this.assignedDoctor = assignedDoctor;
    }

    public UserAccount getDeliveryMan() {
        return deliveryMan;
    }

    public void setDeliveryMan(UserAccount deliveryMan) {
        this.deliveryMan = deliveryMan;
    }

    public HashMap<Medicine, Integer> getMedicines() {
        return medicines;
    }

    public void setMedicines(HashMap<Medicine, Integer> medicines) {
        this.medicines = medicines;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return this.assignedDoctor.getEmployee().getName();
    }
    
}
