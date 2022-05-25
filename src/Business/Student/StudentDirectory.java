/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Student;

import java.util.HashMap;

/**
 *
 * @author swapn
 */
public class StudentDirectory {
    
    private HashMap<String, Student> StudentList;

    public StudentDirectory() {
        this.StudentList=new HashMap<>();
    }
    
    //Find customer using customer id
    public Student findStudent(String studentId){
        Student student = this.StudentList.get(studentId);
        if(student==null)
            return null;
        return student;
    }

    public HashMap<String, Student> getStudentList() {
        return StudentList;
    }
    
    //Creating new customer
    public Student newStudent(){
        Student student = new Student();
        this.StudentList.put(student.getStudentID(), student);
        return this.StudentList.get(student.getStudentID());
//        return c;
    }
    
    public Student findStudentByUserName(String userName){
        
        for(String s: this.StudentList.keySet()){
            if(this.StudentList.get(s).getStudentAccount().getUsername().equals(userName)){
                System.out.println("Not null");
                return this.StudentList.get(s);
            }
        }
        return null;
    }
    
    //Removing customer
    public void removeCustomer(String studentID){
        this.StudentList.remove(this.StudentList.get(studentID));
    }

    
}
