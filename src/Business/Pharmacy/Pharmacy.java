/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Pharmacy;

import java.util.ArrayList;

/**
 *
 * @author SHRISHTI
 */
public class Pharmacy {
    
    private String pharmaName;
    private ArrayList<Medicine> medicineList;
    
    public Pharmacy(){
        this.medicineList=new ArrayList<>();
    }

    public String getPharmaName() {
        return pharmaName;
    }

    public void setPharmaName(String pharmaName) {
        this.pharmaName = pharmaName;
    }

    public ArrayList<Medicine> getMedicineList() {
        return medicineList;
    }

    public void setMedicineList(ArrayList<Medicine> medicineList) {
        this.medicineList = medicineList;
    }
    
    public Medicine createMedicine(){
        Medicine m= new Medicine();
        this.medicineList.add(m);
        return m;
    }

}
