/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Student;

import Business.UserAccount.UserAccount;

/**
 *
 * @author swapn
 */
public class Student {
    
    private String studentID;
    private String studentLastName;
    private String studentFirstName;
    private String dob;
    private String studentAge;
    private String contactNumber;
    private String streetName;
    private String AptNo;
    private String City;
    private String State;
    private String Zipcode;
    private boolean isTreatmentFinished;
    private String studentEmail;
    private UserAccount StudentAccount;

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getStudentLastName() {
        return studentLastName;
    }

    public void setStudentLastName(String studentLastName) {
        this.studentLastName = studentLastName;
    }

    public String getStudentFirstName() {
        return studentFirstName;
    }

    public void setStudentFirstName(String studentFirstName) {
        this.studentFirstName = studentFirstName;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getStudentAge() {
        return studentAge;
    }

    public void setStudentAge(String studentAge) {
        this.studentAge = studentAge;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getAptNo() {
        return AptNo;
    }

    public void setAptNo(String AptNo) {
        this.AptNo = AptNo;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String City) {
        this.City = City;
    }

    public String getState() {
        return State;
    }

    public void setState(String State) {
        this.State = State;
    }

    public String getZipcode() {
        return Zipcode;
    }

    public void setZipcode(String Zipcode) {
        this.Zipcode = Zipcode;
    }

    public boolean isIsTreatmentFinished() {
        return isTreatmentFinished;
    }

    public void setIsTreatmentFinished(boolean isTreatmentFinished) {
        this.isTreatmentFinished = isTreatmentFinished;
    }

    public String getStudentEmail() {
        return studentEmail;
    }

    public void setStudentEmail(String studentEmail) {
        this.studentEmail = studentEmail;
    }

    public UserAccount getStudentAccount() {
        return StudentAccount;
    }

    public void setStudentAccount(UserAccount StudentAccount) {
        this.StudentAccount = StudentAccount;
    }
    
    

    
}
