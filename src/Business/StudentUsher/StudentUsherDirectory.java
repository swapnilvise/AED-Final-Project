/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.StudentUsher;

import Business.Customer.Customer;
import Business.Employee.Employee;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author swapn
 */
public class StudentUsherDirectory {
    
    
    private HashMap<String, StudentUsherDetails> StudentUsherList;

    public StudentUsherDirectory() {
        this.StudentUsherList=new HashMap<>();
    }
    
    //Find customer using customer id
    public StudentUsherDetails findStudentUsher(String StuUsherId){
        StudentUsherDetails sud = this.StudentUsherList.get(StuUsherId);
        if(sud==null)
            return null;
        return sud;
    }

    public HashMap<String, StudentUsherDetails> getStudentUsherList() {
        return StudentUsherList;
    }
    
    //Creating new customer
    public StudentUsherDetails newStudentUsher(){
        StudentUsherDetails sud = new StudentUsherDetails();
        this.StudentUsherList.put(sud.getStuUsherId(), sud);
        return this.StudentUsherList.get(sud.getStuUsherId());
//        return c;
    }
    
    public StudentUsherDetails findStudentUsherByUserName(String userName){
        
        for(String s: this.StudentUsherList.keySet()){
            if(this.StudentUsherList.get(s).getStudentUsherAccount().getUsername().equals(userName)){
                System.out.println("Not null");
                return this.StudentUsherList.get(s);
            }
        }
        return null;
    }
    
    //Removing customer
    public void removeCustomer(String custID){
        this.StudentUsherList.remove(this.StudentUsherList.get(custID));
    }
   
    
}
