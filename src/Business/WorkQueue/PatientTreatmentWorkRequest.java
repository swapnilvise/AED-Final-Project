/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;


//import Business.Student.Student;
import Business.UserAccount.UserAccount;

/**
 *
 * @author SHRISHTI
 */
public class PatientTreatmentWorkRequest extends WorkRequest{
    
    private String registrationDate;
    private String reasonForVisit;
//    private Student student;
    private String labTestType;
    private String labResult;
    private UserAccount labAssistant;
    private String labTestMessage;
    private double medicationCharges;
    private String prescription;
    private double billAmount;
    private UserAccount assignedDoctor;

    public PatientTreatmentWorkRequest(String Date, String reasonForVisit) {
        this.registrationDate = Date;
        this.reasonForVisit = reasonForVisit;
//        this.student = student;
    }

    public String getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(String Date) {
        this.registrationDate = Date;
    }

    public double getMedicationCharges() {
        return medicationCharges;
    }

    public void setMedicationCharges(double medicationCharges) {
        this.medicationCharges = medicationCharges;
    }

    public String getReasonForVisit() {
        return reasonForVisit;
    }

    public void setReasonForVisit(String reasonForVisit) {
        this.reasonForVisit = reasonForVisit;
    }

//    public Student getStudent() {
//        return student;
//    }
//
//    public void setStudent(Student student) {
//        this.student = student;
//    }
    
    

    public String getLabTestType() {
        return labTestType;
    }

    public void setLabTestType(String labTestType) {
        this.labTestType = labTestType;
    }

    public String getLabResult() {
        return labResult;
    }

    public void setLabResult(String labResult) {
        this.labResult = labResult;
    }

    public UserAccount getLabAssistant() {
        return labAssistant;
    }

    public void setLabAssistant(UserAccount labAssistant) {
        this.labAssistant = labAssistant;
    }

    public String getLabTestMessage() {
        return labTestMessage;
    }

    public void setLabTestMessage(String labTestMessage) {
        this.labTestMessage = labTestMessage;
    }

    public String getPrescription() {
        return prescription;
    }

    public void setPrescription(String prescription) {
        this.prescription = prescription;
    }

    public double getBillAmount() {
        return billAmount;
    }

    public void setBillAmount(double billAmount) {
        this.billAmount = billAmount;
    }

    public UserAccount getAssignedDoctor() {
        return assignedDoctor;
    }

    public void setAssignedDoctor(UserAccount assignedDoctor) {
        this.assignedDoctor = assignedDoctor;
    }

    @Override
    public String toString() {
        return reasonForVisit;
    }

    
}
