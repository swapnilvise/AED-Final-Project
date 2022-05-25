/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.StudentUsher;

import Business.UserAccount.UserAccount;

/**
 *
 * @author swapn
 */
public class StudentUsherDetails {
    
    private static int temp=10000;
    
    private String StuUsherId;
    private String LastName;
    private String FirstName;
    private String JobTitle;
    private UserAccount StudentUsherAccount;
    
    public StudentUsherDetails(){
        temp++;
        this.StuUsherId= "SU"+String.valueOf(temp);
        this.StudentUsherAccount = new UserAccount();
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public String getJobTitle() {
        return JobTitle;
    }

    public void setJobTitle(String JobTitle) {
        this.JobTitle = JobTitle;
    }

    public String getStuUsherId() {
        return StuUsherId;
    }

    public void setStuUsherId(String StuUsherId) {
        this.StuUsherId = StuUsherId;
    }

    public static int getTemp() {
        return temp;
    }

    public static void setTemp(int temp) {
        StudentUsherDetails.temp = temp;
    }

    public UserAccount getStudentUsherAccount() {
        return StudentUsherAccount;
    }

    public void setStudentUsherAccount(UserAccount StudentUsherAccount) {
        this.StudentUsherAccount = StudentUsherAccount;
    }
    
    
    
    
    
    
    
}
